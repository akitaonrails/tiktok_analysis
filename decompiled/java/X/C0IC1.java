package X;

import Y.AgS287S0100000_6;

/* JADX INFO: renamed from: X.0IC1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.MediaThumbnailController$thumbnailLoadedFlow$$inlined$map$1$2", f = "MediaThumbnailController.kt", l = {223}, m = "emit")
public final class C0IC1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS287S0100000_6 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IC1(AgS287S0100000_6 agS287S0100000_6, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS287S0100000_6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaThumbnailController@9272.thumbnailLoadedFlow$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("MediaThumbnailController@9272.thumbnailLoadedFlow$$inlined$map$1$2$1");
        return objEmit;
    }
}
