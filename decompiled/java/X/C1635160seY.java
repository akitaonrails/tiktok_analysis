package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0seY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635160seY {
    public static final boolean LIZ(Effect effect) {
        List<String> tags = effect.getTags();
        if (tags == null || !tags.contains(EnumC1465290oEZ.CUSTOM_STICKER.getValue())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(Effect effect) {
        List<String> tags = effect.getTags();
        if (tags == null || !tags.contains(EnumC1465290oEZ.CUSTOM_STICKER_ENTRANCE.getValue())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Effect effect) {
        List<String> tags;
        if (!LIZLLL(effect) || (tags = effect.getTags()) == null || !tags.contains("emoji")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Effect effect) {
        List<String> tags = effect.getTags();
        if (tags == null || !tags.contains(EnumC1465290oEZ.NON_GIPHY_INFO_STICKER.getValue())) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(ProviderEffect providerEffect) {
        String extra = providerEffect.getExtra();
        if (extra == null || !a0.LJJIIZI(extra, EnumC1465290oEZ.NON_GIPHY_INFO_STICKER.getValue(), false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(Effect effect) {
        List<String> tags = effect.getTags();
        if (tags != null && tags.contains("set_sticker_entrance")) {
            return true;
        }
        List<String> tags2 = effect.getTags();
        if (tags2 != null && tags2.contains("gif")) {
            return true;
        }
        List<String> tags3 = effect.getTags();
        if (tags3 != null && tags3.contains("socialavatar")) {
            return true;
        }
        return false;
    }

    public static final Effect LJI(C1635170seZ c1635170seZ) {
        boolean z;
        int i;
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        int i2 = 0;
        if (!c1635170seZ.LJIILIIL.contains("im_sticker") && !c1635170seZ.LJIILIIL.contains("set_sticker")) {
            z = false;
        } else {
            z = true;
        }
        String str = "";
        if (z) {
            String str2 = c1635170seZ.LJIIIIZZ;
            if (str2 == null) {
                str2 = "";
            }
            effect.setEffectId(str2);
            String str3 = c1635170seZ.LJII;
            if (str3 == null) {
                str3 = "";
            }
            effect.setFileUrl(new UrlModel(Collections.singletonList(str3), null, null, null, null));
            effect.setResourceId("");
            String str4 = c1635170seZ.LJIIIIZZ;
            if (str4 == null) {
                str4 = "";
            }
            effect.setId(str4);
        } else {
            String str5 = c1635170seZ.LJ;
            if (str5 == null) {
                str5 = "";
            }
            effect.setFileUrl(new UrlModel(Collections.singletonList(str5), null, null, null, null));
            String str6 = c1635170seZ.LIZLLL;
            if (str6 == null) {
                str6 = "";
            }
            effect.setResourceId(str6);
        }
        String str7 = c1635170seZ.LJFF;
        if (str7 != null) {
            str = str7;
        }
        effect.setIconUrl(new UrlModel(Collections.singletonList(str), null, null, null, null));
        if (C0BP7.LIZ() && c1635170seZ.LJIILIIL.contains("set_sticker") && C2286708xd.LIZJ(c1635170seZ.LJIILJJIL)) {
            effect.setUnzipPath(c1635170seZ.LJIILJJIL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(c1635170seZ.LJIILJJIL);
            effect.setIconUrl(new UrlModel(Collections.singletonList(C2188811AlT.LIZIZ(sbLIZ)), null, null, null, null));
        }
        Set setLLIIIZ = C13LP.LLIIIZ(c1635170seZ.LJIILIIL);
        if (c1635170seZ.LJ != null) {
            setLLIIIZ.add(EnumC1465290oEZ.CUSTOM_STICKER.getValue());
        } else if (c1635170seZ.LIZLLL != null) {
            setLLIIIZ.add(EnumC1465290oEZ.NON_GIPHY_INFO_STICKER.getValue());
        }
        if (c1635170seZ.LJI) {
            setLLIIIZ.add(EnumC1465290oEZ.CUSTOM_STICKER_ENTRANCE.getValue());
        }
        effect.setTags(C13LP.LLIIII(setLLIIIZ));
        if (c1635170seZ.LJI) {
            effect.setExtra(c1635170seZ.LJIIIZ);
        } else if (c1635170seZ.LJ != null) {
            String str8 = c1635170seZ.LJIIJ;
            String str9 = c1635170seZ.LJ;
            String str10 = c1635170seZ.LJIIJJI;
            if (str10 != null) {
                i = CastIntegerProtector.parseInt(str10);
            } else {
                i = 0;
            }
            String str11 = c1635170seZ.LJIIL;
            if (str11 != null) {
                i2 = CastIntegerProtector.parseInt(str11);
            }
            effect.setExtra(C178100mJ.LIZJ(new CustomStickerInfo(str8, str9, i, i2).LIZ()));
            return effect;
        }
        return effect;
    }
}
