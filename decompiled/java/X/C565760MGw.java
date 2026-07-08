package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0MGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC20647615qs("creative_draft_m2_migration_failure")
public final class C565760MGw extends AbstractC20659715sp<C1397510mTF> {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final C01GW LLILZIL;
    public final int LLILZLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJI(this.LLILLJJLI);
        c1397580mTM.LIZIZ(this.LLILLL);
        C985403tE.LIZ(c1397580mTM, new AwS583S0100000_4(this, 273));
        Drawable drawableLIZ = C420660GeW.LIZ(this.LL.getResources(), R.drawable.x5, this.LL.getTheme());
        if (drawableLIZ != null) {
            c1397580mTM.LJIIIZ = new C1391780mK0(this.LL, drawableLIZ, new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        }
        return new C1397510mTF(c1397580mTM);
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPopupFailed:");
        sbLIZ.append(str);
        sbLIZ.append(',');
        sbLIZ.append(i);
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    public C565760MGw(final C19EG c19eg, String str, String str2, String str3) {
        super(new InterfaceC20660615sy(c19eg) { // from class: X.0Otv
            public final C19EG LL;

            @Override // X.InterfaceC20660615sy
            public final boolean t2() {
                return false;
            }

            @Override // X.InterfaceC20658015sY
            public final boolean Xu() {
                return this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
            }

            @Override // X.InterfaceC20658015sY
            public final C688120Qyw i2() {
                Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(this.LL);
                if (objLJIILLIIL == null) {
                    C19EG c19eg2 = this.LL;
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }
                Fragment fragment = (Fragment) objLJIILLIIL;
                Context context = fragment.getContext();
                if (context != null) {
                    return new C688120Qyw(context, fragment, null);
                }
                C19EG c19eg3 = this.LL;
                return new C688120Qyw(c19eg3, c19eg3, null);
            }

            @Override // X.InterfaceC20658015sY
            public final String getSceneId() {
                return C634060Otw.LIZ(this);
            }

            {
                this.LL = c19eg;
            }
        });
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(460));
        this.LLILZLL = 8006;
    }
}
