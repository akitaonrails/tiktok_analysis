package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem", f = "VideoShareAssem.kt", l = {1153}, m = "maybeShowExternalShareInThisVideo$suspendImpl")
public final class C732400SoA extends AbstractC23140094w {
    public Aweme LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VideoShareAssem LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C732400SoA(VideoShareAssem videoShareAssem, InterfaceC1364105Vn<? super C732400SoA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = videoShareAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoShareAssem@b354.maybeShowExternalShareInThisVideo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objQp = VideoShareAssem.Qp(this.LLILLL, null, this);
        C1C7U.LIZIZ("VideoShareAssem@b354.maybeShowExternalShareInThisVideo$1");
        return objQp;
    }
}
