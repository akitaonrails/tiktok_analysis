package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.05M4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentSyncWorker", f = "OfflineCommentSyncWorker.kt", l = {74, 29, 32, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, 35, 37}, m = "flush")
public final class C05M4 extends AbstractC23140094w {
    public C05M0 LL;
    public InterfaceC383701eN LLILLJJLI;
    public Object LLILLL;
    public C05M1 LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C05M3 LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05M4(C05M3 c05m3, InterfaceC1364105Vn<? super C05M4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c05m3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentSyncWorker@1388.flush$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZ.LIZIZ(null, this);
        C1C7U.LIZIZ("OfflineCommentSyncWorker@1388.flush$1");
        return objLIZIZ;
    }
}
