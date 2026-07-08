package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC20647615qs("publish_page")
public final class C20300914c3 extends AbstractC20659715sp<C1397510mTF> {
    public final int LL;
    public final Activity LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function0<Unit> LLIZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        String string;
        String string2;
        C1397580mTM c1397580mTM = new C1397580mTM(this.LLILLJJLI);
        String str = this.LLILLL;
        if (str != null && str.length() != 0) {
            string = this.LLILLL;
        } else {
            string = this.LLILLJJLI.getString(2131826366);
        }
        c1397580mTM.LJI(string);
        String str2 = this.LLILZ;
        if (str2 != null && str2.length() != 0) {
            string2 = this.LLILZ;
        } else {
            string2 = this.LLILLJJLI.getString(2131826365);
        }
        c1397580mTM.LIZIZ(string2);
        C985403tE.LIZ(c1397580mTM, new AwS609S0100000_30(this, 57));
        c1397580mTM.LJ(new AwS598S0100000_19(this, 124));
        c1397580mTM.LIZJ(new AwS609S0100000_30(this, 58));
        c1397580mTM.LIZLLL(new AwS609S0100000_30(this, 59));
        return new C1397510mTF(c1397580mTM);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    public C20300914c3(C634150Ou5 c634150Ou5, Activity activity, String str, String str2, Function0 function0, Function0 function02) {
        super(c634150Ou5);
        this.LL = 0;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = null;
        this.LLILZIL = str2;
        this.LLILZLL = function0;
        this.LLIZ = function02;
    }
}
