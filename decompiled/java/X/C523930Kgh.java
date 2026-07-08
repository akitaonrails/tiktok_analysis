package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Kgh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523930Kgh {
    public Uri LIZIZ;
    public String LIZ = "";
    public final Set<TikTokMediaModel> LIZJ = new LinkedHashSet();
    public final Set<TikTokMediaModel> LIZLLL = new LinkedHashSet();
    public final Set<TikTokMediaModel> LJ = new LinkedHashSet();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> LIZ() {
        /*
            r11 = this;
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Set<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r11.LIZJ
            java.util.Iterator r10 = r0.iterator()
            java.util.Set<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r11.LIZLLL
            java.util.Iterator r8 = r0.iterator()
            boolean r0 = r10.hasNext()
            r7 = 0
            if (r0 == 0) goto L5c
            java.lang.Object r6 = r10.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r6 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r6
        L1e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r5 = r8.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r5 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r5
        L2a:
            if (r6 == 0) goto L47
            if (r5 == 0) goto L36
            long r3 = r6.date
            long r1 = r5.date
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4a
        L36:
            r9.add(r6)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r6 = r10.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r6 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r6
            goto L2a
        L46:
            r6 = r7
        L47:
            if (r5 != 0) goto L4a
            return r9
        L4a:
            r9.add(r5)
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r5 = r8.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r5 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r5
            goto L2a
        L5a:
            r5 = r7
            goto L2a
        L5c:
            r6 = r7
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C523930Kgh.LIZ():java.util.ArrayList");
    }

    public final List<TikTokMediaModel> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<TikTokMediaModel> it2 = this.LIZJ.iterator();
        if (it2.hasNext()) {
            for (TikTokMediaModel next = it2.next(); next != null; next = it2.next()) {
                if (next.subType == 1) {
                    arrayList.add(next);
                }
                if (!it2.hasNext()) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public final int LIZJ() {
        return this.LIZJ.size() + this.LIZLLL.size();
    }
}
