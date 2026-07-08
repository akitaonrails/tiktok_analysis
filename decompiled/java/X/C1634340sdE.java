package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

/* JADX INFO: renamed from: X.0sdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634340sdE extends AbstractC1634360sdG {
    public final String LIZJ;
    public final EnumC1641350soX LIZLLL;
    public final UrlModel LJ;
    public final Integer LJFF;
    public EffectCategoryModel LJI;
    public String LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1634340sdE(String str, String str2, EnumC1641350soX enumC1641350soX, UrlModel urlModel, Integer num, EffectCategoryModel effectCategoryModel, String str3, int i) {
        String str4;
        str2 = (i & 2) != 0 ? null : str2;
        enumC1641350soX = (i & 4) != 0 ? null : enumC1641350soX;
        urlModel = (i & 8) != 0 ? null : urlModel;
        num = (i & 16) != 0 ? null : num;
        effectCategoryModel = (i & 32) != 0 ? null : effectCategoryModel;
        if ((i & 64) != 0) {
            if (effectCategoryModel != null) {
                str3 = effectCategoryModel.getKey();
            } else {
                str3 = null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        sbLIZ.append(str4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (str2 == null && (effectCategoryModel == null || (str2 = effectCategoryModel.getName()) == null)) {
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
        }
        super(strLIZIZ, str2);
        this.LIZJ = str;
        this.LIZLLL = enumC1641350soX;
        this.LJ = urlModel;
        this.LJFF = num;
        this.LJI = effectCategoryModel;
        this.LJII = str3;
    }
}
