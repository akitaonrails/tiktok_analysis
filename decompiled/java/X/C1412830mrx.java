package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412830mrx {
    public static final boolean LIZ(C1412800mru c1412800mru) {
        MixEditingMaterialType mixEditingMaterialType = c1412800mru.LIZ;
        if (mixEditingMaterialType != MixEditingMaterialType.EFFECT_TYPE && mixEditingMaterialType != MixEditingMaterialType.SOUND_SYNC && mixEditingMaterialType != MixEditingMaterialType.CC_TEMPLATE && mixEditingMaterialType != MixEditingMaterialType.PUGC_TEMPLATE && mixEditingMaterialType != MixEditingMaterialType.UGC_TEMPLATE && mixEditingMaterialType != MixEditingMaterialType.AI_TEMPLATE && mixEditingMaterialType != MixEditingMaterialType.AIGT && mixEditingMaterialType != MixEditingMaterialType.SGT && mixEditingMaterialType != MixEditingMaterialType.AUTO_PICK_TEMPLATE && mixEditingMaterialType != MixEditingMaterialType.LYRICS_RULE_TEMPLATE) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(C1412800mru c1412800mru) {
        String asset_id;
        Asset asset = c1412800mru.LIZLLL;
        if (asset != null) {
            if (LIZLLL(asset.getExtra())) {
                asset_id = C1403700mdE.LIZJ(asset.getExtra());
            } else {
                asset_id = asset.getAsset_id();
            }
            if (asset_id != null) {
                return asset_id;
            }
        }
        return "";
    }

    public static final boolean LIZJ(C1412800mru c1412800mru) {
        Asset asset = c1412800mru.LIZLLL;
        if (asset == null) {
            return true;
        }
        if (LIZLLL(asset.getExtra())) {
            Asset asset2 = c1412800mru.LIZLLL;
            if (!LIZLLL(asset2.getExtra())) {
                return true;
            }
            return C041J.LIZ(C1403700mdE.LIZJ(asset2.getExtra()));
        }
        return c1412800mru.LJFF;
    }

    public static final boolean LIZLLL(String str) {
        if (str.length() == 0) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("tt_prop")) {
                if (jSONObject.has("tt_prop_id")) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x008e A[PHI: r0 r2
      0x008e: PHI (r0v18 java.lang.String) = (r0v11 java.lang.String), (r0v21 java.lang.String) binds: [B:46:0x008b, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r2v7 java.lang.String) = (r2v2 java.lang.String), (r2v9 java.lang.String) binds: [B:46:0x008b, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem LJ(X.C1412800mru r15, int r16) {
        /*
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem r4 = new com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem
            com.ss.android.ugc.effectmanager.effect.model.Asset r0 = r15.LIZLLL
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            java.lang.String r5 = r0.getAsset_id()
            if (r5 != 0) goto Lf
        Le:
            r5 = r1
        Lf:
            r6 = 0
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType r9 = r15.LIZ
            long r11 = java.lang.System.currentTimeMillis()
            boolean r13 = r15.LJFF
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType r0 = r15.LJII
            java.lang.String r14 = r0.getDescription()
            r10 = 0
            r8 = r16
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r14)
            X.0ms2 r3 = r15.LJ
            if (r3 != 0) goto L2a
            return r4
        L2a:
            boolean r0 = r3 instanceof X.C1413070msL
            if (r0 == 0) goto L4c
            X.0msL r3 = (X.C1413070msL) r3
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZJ
            if (r0 == 0) goto L3a
            java.lang.String r2 = r0.getMusicId()
            if (r2 != 0) goto L3b
        L3a:
            r2 = r1
        L3b:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZLLL
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.getMusicId()
            if (r0 != 0) goto L8e
        L45:
            r0 = r1
            r1 = r2
        L47:
            r4.bindMusicId = r1
            r4.bindManualMusicId = r0
            return r4
        L4c:
            boolean r0 = r3 instanceof X.C1413060msK
            if (r0 == 0) goto L5b
            X.0msK r3 = (X.C1413060msK) r3
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZIZ
            java.lang.String r2 = r0.getMusicId()
        L58:
            r0 = r1
            r1 = r2
            goto L47
        L5b:
            boolean r0 = r3 instanceof X.C1413040msI
            if (r0 == 0) goto L6b
            X.0msI r3 = (X.C1413040msI) r3
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZLLL
            if (r0 != 0) goto L78
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZJ
            if (r0 != 0) goto L78
            r0 = r1
            goto L47
        L6b:
            boolean r0 = r3 instanceof X.C1413050msJ
            if (r0 == 0) goto L90
            X.0msJ r3 = (X.C1413050msJ) r3
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZIZ
            java.lang.String r2 = r0.getMusicId()
            goto L58
        L78:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZJ
            if (r0 == 0) goto L82
            java.lang.String r2 = r0.getMusicId()
            if (r2 != 0) goto L83
        L82:
            r2 = r1
        L83:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r3.LIZLLL
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.getMusicId()
            if (r0 != 0) goto L8e
            goto L45
        L8e:
            r1 = r0
            goto L45
        L90:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412830mrx.LJ(X.0mru, int):com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem");
    }

    public static final void LJFF(C1412800mru c1412800mru, ArrayList<C1412800mru> arrayList, SelectMethodType selectMethodType) {
        C1412800mru next;
        SelectMethodType selectMethodType2;
        Iterator<C1412800mru> it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZIZ(), c1412800mru.LIZIZ())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1412800mru c1412800mru2 = next;
        if (c1412800mru2 != null && (selectMethodType2 = c1412800mru2.LJII) != null && selectMethodType2 != SelectMethodType.UNSELECT) {
            c1412800mru.LJII = selectMethodType2;
            return;
        }
        if (selectMethodType != null) {
            Iterator<C1412800mru> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it3.next().LJII = SelectMethodType.UNSELECT;
            }
            c1412800mru.LJII = selectMethodType;
            return;
        }
        Iterator<C1412800mru> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            it4.next().LJII = SelectMethodType.UNSELECT;
        }
        c1412800mru.LJII = SelectMethodType.MANUAL;
    }
}
