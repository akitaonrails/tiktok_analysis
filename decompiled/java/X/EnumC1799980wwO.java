package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1799980wwO {
    public static final EnumC1799980wwO ADD_TO_HOME_SCREEN;
    public static final EnumC1799980wwO DEFAULT;
    public static final /* synthetic */ EnumC1799980wwO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1799980wwO REVISIT_EDUCATION;

    public static InterfaceC2044707zh<EnumC1799980wwO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1799980wwO enumC1799980wwO = new EnumC1799980wwO(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1799980wwO;
        EnumC1799980wwO enumC1799980wwO2 = new EnumC1799980wwO("REVISIT_EDUCATION", 1);
        REVISIT_EDUCATION = enumC1799980wwO2;
        EnumC1799980wwO enumC1799980wwO3 = new EnumC1799980wwO("ADD_TO_HOME_SCREEN", 2);
        ADD_TO_HOME_SCREEN = enumC1799980wwO3;
        EnumC1799980wwO[] enumC1799980wwOArr = {enumC1799980wwO, enumC1799980wwO2, enumC1799980wwO3};
        LL = enumC1799980wwOArr;
        LLILLJJLI = new C2254308sP(enumC1799980wwOArr);
    }

    public static EnumC1799980wwO[] values() {
        return (EnumC1799980wwO[]) LL.clone();
    }

    public static EnumC1799980wwO valueOf(String str) {
        return (EnumC1799980wwO) C08FF.LIZ(EnumC1799980wwO.class, str);
    }

    public EnumC1799980wwO(String str, int i) {
    }

    public final String title(View view, String str) {
        int i = C1799990wwP.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return view.getContext().getString(2131822362);
                }
                throw new C1954807lC();
            }
            return view.getContext().getString(2131822362);
        }
        return str;
    }

    public final String subtitle(View view, String str, String str2) {
        int i = C1799990wwP.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (str != null && str2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(" ×");
                        sbLIZ.append(str2);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    return view.getContext().getString(2131822373);
                }
                throw new C1954807lC();
            }
            if (str != null && str2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(" ×");
                sbLIZ2.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return view.getContext().getString(2131822373);
        }
        return str2;
    }
}
