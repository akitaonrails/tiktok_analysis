package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0lw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376960lw6 {
    public UrlModel LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public String LJ;

    public final void LIZIZ(Aweme aweme) {
        String lowerCase;
        UrlModel urlModel;
        UrlModel urlModel2;
        List<SharePlatform> listLIZLLL;
        String str = this.LJ;
        String uri = null;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.US);
        } else {
            lowerCase = null;
        }
        Gson gson = C1772206wq.LIZ;
        if (lowerCase != null) {
            List<SharePlatform> list = C1374860lsi.LIZJ().LIZ;
            if (list != null && !list.isEmpty()) {
                listLIZLLL = C1374860lsi.LIZJ().LIZ;
            } else {
                listLIZLLL = C1380680m26.LIZLLL();
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
            Iterator<SharePlatform> it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().platformId);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            Gson gson2 = C1772206wq.LIZ;
            Map map = (Map) GsonProtectorUtils.fromJson(C1772206wq.LIZ, aweme.getVideo().getMiscDownloadAddrs(), new TypeToken<HashMap<String, VideoUrlModel>>() { // from class: X.0dLr
            }.getType());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (setLLIIJI.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            urlModel = (UrlModel) linkedHashMap.get(lowerCase);
        } else {
            urlModel = null;
        }
        this.LIZ = urlModel;
        if (urlModel == null) {
            Gson gson3 = C1772206wq.LIZ;
            Map map2 = (Map) GsonProtectorUtils.fromJson(C1772206wq.LIZ, aweme.getVideo().getMiscDownloadAddrs(), new TypeToken<HashMap<String, VideoUrlModel>>() { // from class: X.0dLr
            }.getType());
            if (map2 != null) {
                urlModel2 = (UrlModel) map2.get("suffix_scene");
            } else {
                urlModel2 = null;
            }
            this.LIZ = urlModel2;
            if (urlModel2 == null) {
                if (this.LIZLLL && !C591970NJr.LIZIZ().LIZIZ(aweme)) {
                    LIZ(aweme, false);
                    this.LIZJ = this.LIZLLL;
                } else {
                    this.LIZ = aweme.getVideo().getDownloadAddr();
                }
            }
        }
        UrlModel urlModel3 = this.LIZ;
        if (urlModel3 != null) {
            uri = urlModel3.getUri();
        }
        this.LIZIZ = C08HM.LIZJ(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = X.C297600BlW.LIZ()
            r3 = 0
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getDownloadNoWatermarkAddr()
            if (r1 != 0) goto L2b
        L13:
            X.01GW r0 = X.C262410AQd.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2b
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddrH264()
        L2b:
            r4.LIZ = r1
            if (r1 == 0) goto L5d
            com.ss.android.ugc.aweme.profile.model.User r0 = r5.getAuthor()
            java.lang.String r2 = X.C10EU.LIZJ(r0)
            if (r6 == 0) goto L6d
            r0 = 0
            r4.LIZJ = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.LIZ
            if (r0 == 0) goto L48
            java.lang.String r3 = r0.getUri()
        L48:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r0 = "tag_no_water"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = X.C08HM.LIZJ(r0)
            r4.LIZIZ = r0
        L5d:
            return
        L5e:
            r1 = r3
            goto L13
        L60:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r5.getVideo()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddrH264()
            goto L2b
        L6b:
            r1 = r3
            goto L2b
        L6d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r4.LIZ
            if (r0 == 0) goto L79
            java.lang.String r3 = r0.getUri()
        L79:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = X.C08HM.LIZJ(r0)
            r4.LIZIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376960lw6.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }
}
