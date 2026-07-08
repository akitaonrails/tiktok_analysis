package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FP0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FP0 extends AbstractC2255721DQs<InterfaceC359070E5x> implements InterfaceC359070E5x, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), Activity.class, null);
    public DialogC1390150mHN LLILLL;
    public Function0<Unit> LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FP0.class, "attachActivity", "getAttachActivity()Landroid/app/Activity;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    public InterfaceC359070E5x W1() {
        return this;
    }

    private final Activity X1() {
        return (Activity) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    @Override // X.InterfaceC359070E5x
    public void dismiss() {
        DialogC1390150mHN dialogC1390150mHN;
        DialogC1390150mHN dialogC1390150mHN2 = this.LLILLL;
        if (dialogC1390150mHN2 == null || !dialogC1390150mHN2.isShowing() || (dialogC1390150mHN = this.LLILLL) == null) {
            return;
        }
        dialogC1390150mHN.dismiss();
        C785410UrT.LIZ(dialogC1390150mHN);
    }

    @Override // X.InterfaceC359070E5x
    public void show() {
        DialogC1390150mHN dialogC1390150mHN = this.LLILLL;
        if (dialogC1390150mHN != null) {
            C786410Ut5.K4(dialogC1390150mHN);
        }
        C354270Duj.LIZ(3000L, new AwS549S0100000_5(this, 768));
    }

    private final void Z1() {
        Activity activityX1;
        if (X1() == null || (activityX1 = X1()) == null) {
            return;
        }
        final DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(activityX1);
        dialogC1390150mHN.LJJZ(false);
        dialogC1390150mHN.LJJLJLI("");
        dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0FP2
            @Override // X.InterfaceC1389630mGX
            public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                Function0<Unit> function0 = this.LIZ.LLILZ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        };
        dialogC1390150mHN.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0FP1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 4 && keyEvent.getAction() == 1) {
                    C786410Ut5.LJIIJJI(dialogC1390150mHN);
                    Function0<Unit> function0 = this.LLILZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return true;
                }
                return false;
            }
        });
        this.LLILLL = dialogC1390150mHN;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Z1();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0FP0(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC359070E5x
    public void ik0(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    @Override // X.InterfaceC359070E5x
    public void setProgress(float f) {
        DialogC1390150mHN dialogC1390150mHN;
        DialogC1390150mHN dialogC1390150mHN2 = this.LLILLL;
        if (dialogC1390150mHN2 != null && dialogC1390150mHN2.isShowing() && (dialogC1390150mHN = this.LLILLL) != null) {
            dialogC1390150mHN.LJJLL(f, false);
        }
    }

    @Override // X.InterfaceC359070E5x
    public void setTitle(String str) {
        DialogC1390150mHN dialogC1390150mHN = this.LLILLL;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.LJJLJLI(str);
        }
    }
}
