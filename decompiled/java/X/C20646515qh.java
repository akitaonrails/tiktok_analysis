package X;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20647615qs("comment_photo_save")
public final class C20646515qh extends AbstractC20659715sp<C1397510mTF> {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final Runnable LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJFF(2131849376);
        c1397580mTM.LIZ(2131849373);
        C985403tE.LIZ(c1397580mTM, new AwS610S0100000_31(this, 537));
        c1397580mTM.LJII = false;
        c1397580mTM.LIZLLL(AFwS276S0000000_31.get$arr$(346));
        return new C1397510mTF(c1397580mTM);
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    public C20646515qh(final C19EG c19eg, String str, RunnableC514801zW runnableC514801zW) {
        super(new InterfaceC20660615sy(c19eg) { // from class: X.0Ou1
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
                C19EG c19eg2 = this.LL;
                return new C688120Qyw(c19eg2, c19eg2, null);
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
        this.LLILLL = runnableC514801zW;
    }
}
