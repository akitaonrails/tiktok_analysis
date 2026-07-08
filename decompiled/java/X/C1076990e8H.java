package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;

/* JADX INFO: renamed from: X.0e8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076990e8H {
    public static final String LIZ(TakoActiveActionItem takoActiveActionItem) {
        String str = takoActiveActionItem.exitHint;
        if (str != null && str.length() != 0) {
            return takoActiveActionItem.exitHint;
        }
        Object[] objArr = new Object[1];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = takoActiveActionItem.emoji;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        sbLIZ.append(str2);
        String str4 = takoActiveActionItem.name;
        if (str4 != null) {
            str3 = str4;
        }
        sbLIZ.append(str3);
        objArr[0] = C2188811AlT.LIZIZ(sbLIZ);
        return C1857750yRZ.LJIIIIZZ(2131849622, objArr);
    }
}
