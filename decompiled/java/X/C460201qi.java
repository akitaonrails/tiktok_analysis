package X;

/* JADX INFO: renamed from: X.01qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.presenter.DefaultStickerState$latestWantToUseStickerFlow$$inlined$transform$1$1", f = "DefaultStickerState.kt", l = {227, 228}, m = "emit")
public final class C460201qi extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C517001zs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C460201qi(C517001zs c517001zs, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c517001zs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerState@7d1.latestWantToUseStickerFlow$$inlined$transform$1$1$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("DefaultStickerState@7d1.latestWantToUseStickerFlow$$inlined$transform$1$1$1");
        return objEmit;
    }
}
