package X;

import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LJP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJP {
    public static final C0LJP LIZ = new C0LJP();

    public static boolean LIZ(String[] strArr, C19EG c19eg) {
        if (strArr == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C838410Wul.LIZ(c19eg, str)));
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).intValue() != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZIZ(C19EG c19eg, String str, String str2, Function0 function0, Function0 function02) {
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        if (str != null) {
            c1397580mTM.LJI(str);
        }
        c1397580mTM.LIZIZ(str2);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS374S0200000_8(c19eg, (C19EG) function0, (Function0<Unit>) 0));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg, c1397580mTM);
        autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function02, (Function0<Unit>) 2);
        autoDismissPermissionDialog.LIZ();
    }
}
