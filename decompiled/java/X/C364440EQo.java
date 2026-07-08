package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364440EQo {
    public final ConcurrentHashMap<String, CaptionCachesModel> LIZ;

    public final void LIZ() {
        this.LIZ.clear();
    }

    public final ArrayList<Pair<String, String>> LIZIZ() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        for (Map.Entry<String, CaptionCachesModel> entry : this.LIZ.entrySet()) {
            arrayList.add(new Pair<>(entry.getKey(), GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), entry.getValue())));
        }
        return arrayList;
    }

    public C364440EQo() {
        this.LIZ = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C364440EQo(ArrayList<Pair<String, String>> arrayList) {
        this();
        ConcurrentHashMap<String, CaptionCachesModel> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            for (Pair<String, String> pair : arrayList) {
                concurrentHashMap.put(pair.getFirst(), GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), pair.getSecond(), CaptionCachesModel.class));
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZ = concurrentHashMap;
    }

    public static ArrayList LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new CaptionUtterance((Utterance) null, ((TextStickerData) it2.next()).m187clone()));
        }
        return arrayList;
    }

    public final void LIZLLL(CaptionQueryInfo captionQueryInfo, String str, ArrayList arrayList) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionCaches -> language = ");
        sbLIZ.append(str);
        sbLIZ.append(", list.size = ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append('}');
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.isEmpty()) {
            this.LIZ.remove(str);
            return;
        }
        if (captionQueryInfo != null) {
            this.LIZ.put(str, new CaptionCachesModel(captionQueryInfo, arrayList, 4));
            return;
        }
        CaptionCachesModel captionCachesModel = this.LIZ.get(str);
        if (captionCachesModel == null) {
            return;
        }
        captionCachesModel.captionsList = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r5, java.util.ArrayList<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData> r6, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo r7, java.lang.String r8) {
        /*
            r4 = this;
            int r0 = r5.length()
            if (r0 != 0) goto L7
            return
        L7:
            r3 = 0
            if (r6 == 0) goto L23
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r6)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L25
        L15:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L25
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            r0.remove(r5)
            return
        L23:
            r2 = r3
            goto L15
        L25:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L46
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r4.LIZ
            java.lang.Object r0 = r0.get(r5)
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel r0 = (com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel) r0
            if (r0 == 0) goto L45
            if (r7 != 0) goto L3b
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo r7 = r0.captionQueryInfo
        L3b:
            r0.captionQueryInfo = r7
            if (r2 == 0) goto L43
            java.util.ArrayList r3 = LIZJ(r2)
        L43:
            r0.captionsList = r3
        L45:
            return
        L46:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r1 = r4.LIZ
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel r0 = new com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel
            if (r2 == 0) goto L50
            java.util.ArrayList r3 = LIZJ(r2)
        L50:
            r0.<init>(r7, r8, r3)
            r1.put(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364440EQo.LJ(java.lang.String, java.util.ArrayList, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo, java.lang.String):void");
    }
}
