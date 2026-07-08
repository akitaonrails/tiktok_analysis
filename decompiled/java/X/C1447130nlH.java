package X;

import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;

/* JADX INFO: renamed from: X.0nlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447130nlH implements InterfaceC1464200oCo {
    public final /* synthetic */ Runnable LL;
    public final /* synthetic */ VEChooseVideoCoverFragment LLILLJJLI;

    public C1447130nlH(VEChooseVideoCoverFragment vEChooseVideoCoverFragment, Runnable runnable) {
        this.LLILLJJLI = vEChooseVideoCoverFragment;
        this.LL = runnable;
    }

    @Override // X.InterfaceC1464200oCo
    public final void onCallback(int i, int i2, float f, String str) {
        if (i == 4101) {
            this.LLILLJJLI.LLJLIL.post(this.LL);
            InterfaceC1447120nlG interfaceC1447120nlG = this.LLILLJJLI.LLJLL;
            if (interfaceC1447120nlG != null) {
                interfaceC1447120nlG.LLFII().Gf(this);
            }
        }
    }
}
