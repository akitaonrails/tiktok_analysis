package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0XBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C844600XBi extends AbstractC844620XBk<SharedPreferences> {
    public final /* synthetic */ AbstractC844610XBj LIZIZ;

    public C844600XBi(AbstractC844610XBj abstractC844610XBj) {
        this.LIZIZ = abstractC844610XBj;
    }

    public final Object LIZ(String str, Object[] objArr) {
        AbstractC844610XBj abstractC844610XBj = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C844580XBg.LIZJ(abstractC844610XBj, "ug_install_settings_pref"));
        sbLIZ.append("_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ug_install_settings_pref_");
        sbLIZ2.append(str);
        if (TextUtils.equals(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2))) {
            Context context = (Context) objArr[0];
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ug_install_settings_pref_");
            sbLIZ3.append(str);
            return C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ3));
        }
        return C810670Vr7.LIZJ((Context) objArr[0], 0, strLIZIZ);
    }
}
