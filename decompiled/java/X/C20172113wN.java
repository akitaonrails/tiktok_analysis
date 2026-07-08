package X;

import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;

/* JADX INFO: renamed from: X.13wN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.repo.GetStickerJsonTask", f = "GetStickerJsonTask.kt", l = {37}, m = "run")
public final class C20172113wN extends AbstractC23140094w {
    public StorySocialEventPrepareData LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20171913wL LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20172113wN(C20171913wL c20171913wL, InterfaceC1364105Vn<? super C20172113wN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c20171913wL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetStickerJsonTask@3c0e.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = LJ(null, this);
        C1C7U.LIZIZ("GetStickerJsonTask@3c0e.run$1");
        return objLJ;
    }
}
