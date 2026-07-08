package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0O3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.api.GetUserPlaylistQuery", f = "GetUserPlaylistQuery.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT}, m = "operate")
public final class C613170O3f extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C613160O3e LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613170O3f(C613160O3e c613160O3e, InterfaceC1364105Vn<? super C613170O3f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c613160O3e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetUserPlaylistQuery@a4ac.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("GetUserPlaylistQuery@a4ac.operate$1");
        return objLIZIZ;
    }
}
