package X;

import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;

/* JADX INFO: renamed from: X.13vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.download.LokiDownloader", f = "LokiDownloader.kt", l = {95}, m = "download")
public final class C20168313vl extends AbstractC23140094w {
    public SocialStickerResourceMetaData LL;
    public Object LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C20168213vk LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20168313vl(C20168213vk c20168213vk, InterfaceC1364105Vn<? super C20168313vl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c20168213vk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LokiDownloader@25fd.download$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        C1C7U.LIZIZ("LokiDownloader@25fd.download$1");
        return objLIZ;
    }
}
