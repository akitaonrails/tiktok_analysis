package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.social.sticker.model.base.SocialStickerResourceMetaData;

/* JADX INFO: renamed from: X.13wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.download.ImageDownloader", f = "ImageDownloader.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "download")
public final class C20174013wg extends AbstractC23140094w {
    public SocialStickerResourceMetaData LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C20173913wf LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20174013wg(C20173913wf c20173913wf, InterfaceC1364105Vn<? super C20174013wg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c20173913wf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageDownloader@9bb1.download$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, null, this);
        C1C7U.LIZIZ("ImageDownloader@9bb1.download$1");
        return objLIZ;
    }
}
