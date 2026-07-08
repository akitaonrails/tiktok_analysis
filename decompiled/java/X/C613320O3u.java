package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0O3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.detail.api.CollectMovieMutation", f = "CollectMovieMutation.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT}, m = "operate")
public final class C613320O3u extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C613310O3t LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613320O3u(C613310O3t c613310O3t, InterfaceC1364105Vn<? super C613320O3u> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c613310O3t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollectMovieMutation@aeaf.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("CollectMovieMutation@aeaf.operate$1");
        return objLIZIZ;
    }
}
