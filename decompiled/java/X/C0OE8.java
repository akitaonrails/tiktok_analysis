package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0OE8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.api.search.SearchMusicListQuery", f = "SearchMusicListQuery.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT}, m = "operate")
public final class C0OE8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0OE7 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OE8(C0OE7 c0oe7, InterfaceC1364105Vn<? super C0OE8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0oe7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMusicListQuery@fd85.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("SearchMusicListQuery@fd85.operate$1");
        return objLIZIZ;
    }
}
