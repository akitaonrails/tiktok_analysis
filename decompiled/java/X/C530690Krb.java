package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Krb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530690Krb {
    public static final int LIZ(List<? extends MediaModel> list) {
        if (list == null) {
            return -1;
        }
        Iterator<? extends MediaModel> it2 = list.iterator();
        int i = -1;
        while (it2.hasNext()) {
            int iLIZLLL = LIZLLL(it2.next());
            if (iLIZLLL != 0) {
                if (iLIZLLL != -1) {
                    return iLIZLLL;
                }
            } else if (i == -1) {
                i = 0;
            }
        }
        return i;
    }

    public static final boolean LIZIZ(MediaModel mediaModel) {
        if ((mediaModel instanceof OnThisDayTiktokMediaModel) && ((TikTokMediaModel) mediaModel).loadSource == EnumC538220L8y.RECALL_MEDIA) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(MediaModel mediaModel) {
        if (mediaModel instanceof OnThisDayTiktokMediaModel) {
            EnumC538220L8y enumC538220L8y = ((TikTokMediaModel) mediaModel).loadSource;
            if (enumC538220L8y == EnumC538220L8y.RECALL_MEDIA || enumC538220L8y == EnumC538220L8y.PHOTO_PICKER) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZLLL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r3) {
        /*
            if (r3 == 0) goto Ld
            boolean r1 = r3.LJIIJ()
            r0 = 1
            if (r1 != r0) goto Ld
        L9:
            r2 = -1
            if (r0 == 0) goto Lf
            return r2
        Ld:
            r0 = 0
            goto L9
        Lf:
            boolean r0 = X.C297650Blb.LIZ()
            r1 = 0
            if (r0 == 0) goto L2a
            X.09La r0 = X.C2356009La.LIZ
            if (r3 == 0) goto L1e
            java.lang.String r1 = r3.LJFF()
        L1e:
            r0.getClass()
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = X.C2356009La.LIZ(r1)
            if (r0 == 0) goto L29
            int r2 = r0.HDRType
        L29:
            return r2
        L2a:
            if (r3 == 0) goto L42
            java.lang.String r0 = r3.LJFF()
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r0)
            if (r0 == 0) goto L42
            int r0 = r0.HDRType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L42
            int r2 = r0.intValue()
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C530690Krb.LIZLLL(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel):int");
    }
}
