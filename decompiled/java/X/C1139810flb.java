package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0flb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.effect.render.node.VideoGiftDownloadAssetsTask", f = "VideoGiftDownloadAssetsTask.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "process")
public final class C1139810flb extends AbstractC23140094w {
    public C1139660flM LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1139670flN LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139810flb(C1139670flN c1139670flN, InterfaceC1364105Vn<? super C1139810flb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1139670flN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoGiftDownloadAssetsTask@9c38.process$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("VideoGiftDownloadAssetsTask@9c38.process$1");
        return objLIZIZ;
    }
}
