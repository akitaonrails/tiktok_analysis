package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12Hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19731412Hw implements C12HT {
    public static final Keva LIZLLL = Keva.getRepo("ulike_repo");
    public static final Map<String, SoftReference<Object>> LJ = new LinkedHashMap();
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // X.C12HT
    public final void LJIJJ() {
        this.LIZIZ = true;
    }

    @Override // X.C12HT
    public final boolean LIZIZ() {
        if (this.LIZIZ) {
            return this.LIZJ;
        }
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_switchkey_switch_all_beauty");
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.C12HT
    public final boolean LJIIIIZZ() {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_switchkey_switch_switch_check");
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.C12HT
    public final boolean LJIIIZ() {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_user_toggled_all_switch");
        if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return true;
        }
        Set<String> setKeySet = keva.getAll().keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<T> it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI((String) it2.next(), "composer_beauty_manual", false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C12HT
    public final void LJIILJJIL() {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_switchkey_switch_switch_check");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append("key_switchkey_switch_all_beauty");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
    }

    @Override // X.C12HT
    public final int LJIILLIIL() {
        if (BeautyContext.INSTANCE.isClearBeautyGenderRecognize()) {
            C19570511hX.LIZJ("getDetectFemaleCount no work by BeautyClearFemaleRecognize is true. return 0");
            return 0;
        }
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_detect_female_count");
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    @Override // X.C12HT
    public final List<BeautyCategory> LJIJ() {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_beauty_panel_data");
        try {
            return (List) ((Gson) C2346609Hk.LIZ.getValue()).LJIIIIZZ(keva.getString(C2188811AlT.LIZIZ(sbLIZ), null), new TypeToken<List<BeautyCategory>>() { // from class: X.0cAn
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C12HT
    public final void LJIJI() {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_switchkey_switch_switch_check");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public final boolean LJIL() {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_need_face_detect");
        boolean z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append("key_need_face_detect");
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
        }
        return z;
    }

    @Override // X.C12HT
    public boolean ke() {
        return LIZLLL.getBoolean("key_disable_all_beauty", false);
    }

    @Override // X.C12HT
    public final void pe() {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_user_toggled_all_switch");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // X.C12HT
    public final String LIZJ() {
        return this.LIZ;
    }

    public C19731412Hw(String str) {
        this.LIZ = str;
    }

    @Override // X.C12HT
    public final String LIZ(EnumC19731112Ht enumC19731112Ht) {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(enumC19731112Ht.getFlag());
        sbLIZ.append("_key_selected_category");
        return keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // X.C12HT
    public final void LIZLLL(boolean z) {
        if (this.LIZIZ) {
            this.LIZJ = z;
        }
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_switchkey_switch_all_beauty");
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }

    @Override // X.C12HT
    public void LJFF(boolean z) {
        LIZLLL.storeBoolean("key_disable_all_beauty", z);
    }

    @Override // X.C12HT
    public final void LJII(boolean z) {
        if (z) {
            Keva keva = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append("key_need_face_detect");
            if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append("key_need_face_detect");
                keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
            }
        }
    }

    @Override // X.C12HT
    public final void LJIIJ(int i) {
        if (BeautyContext.INSTANCE.isClearBeautyGenderRecognize()) {
            C19570511hX.LIZJ("saveDetectFemaleCount no work by BeautyClearFemaleRecognize is true.");
            return;
        }
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("key_detect_female_count");
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    @Override // X.C12HT
    public final void LJIJJLI(List<BeautyCategory> list) {
        if (list == null) {
            Keva keva = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append("key_beauty_panel_data");
            keva.erase(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Keva keva2 = LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append("key_beauty_panel_data");
        keva2.storeString(C2188811AlT.LIZIZ(sbLIZ2), GsonProtectorUtils.toJson((Gson) C2346609Hk.LIZ.getValue(), list));
    }

    @Override // X.C12HT
    public final String LJ(ComposerBeauty composerBeauty, EnumC19731112Ht enumC19731112Ht) {
        return LIZLLL.getString(C1054690dYJ.LIZIZ(this.LIZ, enumC19731112Ht.getFlag(), composerBeauty.getEffect().getResourceId()), null);
    }

    @Override // X.C12HT
    public final void LJIIJJI(ComposerBeauty composerBeauty, EnumC19731112Ht enumC19731112Ht) {
        if (composerBeauty.getExtra().getDisableCache()) {
            LIZLLL.storeString(C1054690dYJ.LIZIZ(this.LIZ, enumC19731112Ht.getFlag(), composerBeauty.getParentResId()), "-1");
        } else {
            LIZLLL.storeString(C1054690dYJ.LIZIZ(this.LIZ, enumC19731112Ht.getFlag(), composerBeauty.getParentResId()), composerBeauty.getEffect().getResourceId());
        }
    }

    @Override // X.C12HT
    public final void LJIILIIL(ComposerBeauty composerBeauty, EnumC19731112Ht enumC19731112Ht) {
        if (composerBeauty.getExtra().getDisableCache()) {
            Keva keva = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(enumC19731112Ht.getFlag());
            sbLIZ.append("_key_selected_beauty_");
            sbLIZ.append(composerBeauty.getCategoryId());
            keva.storeString(C2188811AlT.LIZIZ(sbLIZ), "-1");
            return;
        }
        Keva keva2 = LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(enumC19731112Ht.getFlag());
        sbLIZ2.append("_key_selected_beauty_");
        sbLIZ2.append(composerBeauty.getCategoryId());
        keva2.storeString(C2188811AlT.LIZIZ(sbLIZ2), composerBeauty.getEffect().getEffectId());
    }

    @Override // X.C12HT
    public final String LJIILL(EnumC19731112Ht enumC19731112Ht, String str) {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(enumC19731112Ht.getFlag());
        sbLIZ.append("_key_selected_beauty_");
        sbLIZ.append(str);
        return keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // X.C12HT
    public final void LJIIZILJ(EnumC19731112Ht enumC19731112Ht, String str) {
        Keva keva = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(enumC19731112Ht.getFlag());
        sbLIZ.append("_key_selected_category");
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    @Override // X.C12HT
    public final void me(String str, boolean z) {
        if (C2281551ESb.LIZIZ.LJIIL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append("key_switch");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LJ.remove(strLIZIZ);
            LIZLLL.storeBoolean(strLIZIZ, z);
            return;
        }
        Keva keva = LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append("key_switch");
        sbLIZ2.append(str);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), z);
    }

    @Override // X.C12HT
    public final boolean oe(String str, boolean z) {
        Boolean bool;
        if (C2281551ESb.LIZIZ.LJIIL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append("key_switch");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Map<String, SoftReference<Object>> map = LJ;
            SoftReference softReference = (SoftReference) ((LinkedHashMap) map).get(strLIZIZ);
            Object obj = null;
            if (softReference != null) {
                obj = softReference.get();
            }
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                return bool.booleanValue();
            }
            boolean z2 = LIZLLL.getBoolean(strLIZIZ, z);
            map.put(strLIZIZ, new SoftReference<>(Boolean.valueOf(z2)));
            return z2;
        }
        Keva keva = LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append("key_switch");
        sbLIZ2.append(str);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), z);
    }

    @Override // X.C12HT
    public void LJI(ComposerBeauty composerBeauty, EnumC19731112Ht enumC19731112Ht, String str, float f) {
        String strLIZ = C1054690dYJ.LIZ(this.LIZ, enumC19731112Ht.getFlag(), composerBeauty.getEffect().getResourceId(), str);
        LIZLLL.storeFloat(strLIZ, f);
        if (C2281551ESb.LIZIZ.LJIIL()) {
            LJ.remove(strLIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveBeautyTagValue key: ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(" val: ");
        sbLIZ.append(f);
        C19570511hX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C12HT
    public float LJIIL(ComposerBeauty composerBeauty, EnumC19731112Ht enumC19731112Ht, String str, float f) {
        Float f2;
        String strLIZ = C1054690dYJ.LIZ(this.LIZ, enumC19731112Ht.getFlag(), composerBeauty.getEffect().getResourceId(), str);
        if (C2281551ESb.LIZIZ.LJIIL()) {
            Map<String, SoftReference<Object>> map = LJ;
            SoftReference softReference = (SoftReference) ((LinkedHashMap) map).get(strLIZ);
            Object obj = null;
            if (softReference != null) {
                obj = softReference.get();
            }
            if ((obj instanceof Float) && (f2 = (Float) obj) != null) {
                return f2.floatValue();
            }
            float f3 = LIZLLL.getFloat(strLIZ, f);
            map.put(strLIZ, new SoftReference<>(Float.valueOf(f3)));
            return f3;
        }
        return LIZLLL.getFloat(strLIZ, f);
    }
}
