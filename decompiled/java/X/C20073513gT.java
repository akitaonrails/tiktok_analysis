package X;

import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;

/* JADX INFO: renamed from: X.13gT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {177, 186}, m = "boundsUpdatesEventLoop$ui_release")
public final class C20073513gT extends AbstractC23140094w {
    public AndroidContentCaptureManager LL;
    public InterfaceC824740WWy LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AndroidContentCaptureManager LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20073513gT(AndroidContentCaptureManager androidContentCaptureManager, InterfaceC1364105Vn<? super C20073513gT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = androidContentCaptureManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LIZ(this);
    }
}
