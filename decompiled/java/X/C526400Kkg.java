package X;

import Y.AgS289S0100000_8;

/* JADX INFO: renamed from: X.0Kkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.result.AlbumResultDispatchComponent$onCreate$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "AlbumResultDispatchComponent.kt", l = {223}, m = "emit")
public final class C526400Kkg extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS289S0100000_8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526400Kkg(AgS289S0100000_8 agS289S0100000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS289S0100000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlbumResultDispatchComponent@f10b.onCreate$1$invokeSuspend$$inlined$filterIsInstance$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AlbumResultDispatchComponent@f10b.onCreate$1$invokeSuspend$$inlined$filterIsInstance$1$2$1");
        return objEmit;
    }
}
