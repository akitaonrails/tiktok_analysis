package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Kjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525740Kjc extends C09AY implements Function1<C525750Kjd, C525750Kjd> {
    public final /* synthetic */ List<TikTokMediaModel> LL;
    public final /* synthetic */ C525840Kjm LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C525740Kjc(List<? extends TikTokMediaModel> list, C525840Kjm c525840Kjm, int i, int i2) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c525840Kjm;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C525750Kjd invoke(X.C525750Kjd r9) {
        /*
            r8 = this;
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r8.LL
            int r7 = r0.size()
            X.0Kjm r0 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig r0 = r0.O4()
            com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode r6 = r0.mode
            int r5 = r8.LLILLL
            int r4 = r8.LLILZ
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode.Single
            r3 = 1
            if (r0 == 0) goto L23
            int r5 = r5 + r4
            if (r5 != r3) goto L44
        L1a:
            r9.getClass()
            X.0Kjd r0 = new X.0Kjd
            r0.<init>(r3, r7)
            return r0
        L23:
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode.Multiple
            if (r0 == 0) goto L46
            int r2 = r5 + r4
            com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode$Multiple r6 = (com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode.Multiple) r6
            int r1 = r6.minVideoCount
            int r0 = r6.maxVideoCount
            if (r5 > r0) goto L44
            if (r1 > r5) goto L44
            int r1 = r6.minPhotoCount
            int r0 = r6.maxPhotoCount
            if (r4 > r0) goto L44
            if (r1 > r4) goto L44
            int r1 = r6.minCount
            int r0 = r6.maxCount
            if (r2 > r0) goto L44
            if (r1 > r2) goto L44
            goto L1a
        L44:
            r3 = 0
            goto L1a
        L46:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C525740Kjc.invoke(java.lang.Object):java.lang.Object");
    }
}
