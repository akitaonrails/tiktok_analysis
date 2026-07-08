package X;

import Y.ARunnableS105S0100000_5;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ecu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnTouchListenerC368700Ecu implements View.OnTouchListener {
    public final Function0<Unit> LL;
    public final InterfaceC368590Ecj LLILLJJLI;
    public boolean LLJ;
    public boolean LLJI;
    public final int LLILLL = ViewConfiguration.get(C0EHL.LIZ()).getScaledTouchSlop();
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public final long LLILZIL = ViewConfiguration.getLongPressTimeout();
    public final ARunnableS105S0100000_5 LLILZLL = new ARunnableS105S0100000_5(this, 108);
    public float LLIZ = -1.0f;
    public float LLIZLLLIL = -1.0f;
    public float LLJIJIL = -1.0f;
    public float LLJILJIL = -1.0f;
    public float LLJILJILJ = -1.0f;
    public float LLJILLL = -1.0f;
    public final int LLJJ = C0FU0.LIZJ(C0EHL.LIZ());

    public ViewOnTouchListenerC368700Ecu(AwS549S0100000_5 awS549S0100000_5, C368340EcK c368340EcK) {
        this.LL = awS549S0100000_5;
        this.LLILLJJLI = c368340EcK;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int left = 0;
        boolean z2 = false;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.LLJI) {
                            this.LLILLJJLI.LIZLLL(new AwS549S0100000_5(this, 1210));
                            this.LLJI = false;
                        }
                        if (this.LLJ) {
                            this.LLJ = false;
                        } else {
                            this.LLILZ.removeCallbacks(this.LLILZLL);
                            return true;
                        }
                    }
                } else {
                    float rawX = motionEvent.getRawX() - this.LLJILJILJ;
                    float rawY = motionEvent.getRawY() - this.LLJILLL;
                    this.LLJILJILJ = motionEvent.getRawX();
                    this.LLJILLL = motionEvent.getRawY();
                    float rawX2 = motionEvent.getRawX() - this.LLJIJIL;
                    float rawY2 = motionEvent.getRawY() - this.LLJILJIL;
                    if (this.LLJI) {
                        InterfaceC368590Ecj interfaceC368590Ecj = this.LLILLJJLI;
                        float rawX3 = motionEvent.getRawX();
                        float f = C360610EBv.LIZJ;
                        if (rawX3 - f < 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (motionEvent.getRawX() + f > this.LLJJ) {
                            z2 = true;
                        }
                        interfaceC368590Ecj.LJ(rawX, rawY, z, z2);
                        return true;
                    }
                    if (!this.LLJ) {
                        int i = this.LLILLL;
                        if (i * i <= (rawX2 * rawX2) + (rawY2 * rawY2)) {
                            this.LLILZ.removeCallbacks(this.LLILZLL);
                            this.LLJ = true;
                            return true;
                        }
                    }
                }
                return true;
            }
            if (this.LLJI) {
                this.LLJI = false;
                this.LLILLJJLI.LIZJ(false);
            } else if (!this.LLJ) {
                this.LLILZ.removeCallbacks(this.LLILZLL);
                this.LL.invoke();
            }
            this.LLJ = false;
            return true;
        }
        float x = motionEvent.getX();
        if (view != null) {
            left = view.getLeft();
        }
        this.LLIZ = x + left;
        this.LLIZLLLIL = motionEvent.getY();
        this.LLJIJIL = motionEvent.getRawX();
        this.LLJILJIL = motionEvent.getRawY();
        this.LLJILJILJ = motionEvent.getRawX();
        this.LLJILLL = motionEvent.getRawY();
        System.currentTimeMillis();
        C786410Ut5.LJLIIL(this.LLILZIL, this.LLILZ, this.LLILZLL);
        return true;
    }
}
