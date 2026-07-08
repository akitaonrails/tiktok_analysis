package X;

import com.ss.android.ugc.aweme.mix.services.PlaylistPlayNextImpl;

/* JADX INFO: renamed from: X.0gXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.services.PlaylistPlayNextImpl", f = "PlaylistPlayNextImpl.kt", l = {111}, m = "loadVideoListStub")
public final class C1169350gXF extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1612570s47 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ PlaylistPlayNextImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1169350gXF(PlaylistPlayNextImpl playlistPlayNextImpl, InterfaceC1364105Vn<? super C1169350gXF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = playlistPlayNextImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistPlayNextImpl@f64d.loadVideoListStub$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("PlaylistPlayNextImpl@f64d.loadVideoListStub$1");
        return objLJ;
    }
}
