package X;

import android.view.View;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.TempCustomViewAssem;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.04z7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1276704z7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(925));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(926));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(927));

    public static void LIZ(int i, View view) {
        if (view == null) {
            return;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TempCustomViewAssem.class);
        ((ConcurrentHashMap) LIZ.getValue()).put(new Pair(c19719912DlLIZ, Integer.valueOf(i)), AFwS229S0000000_2.get$arr$(637));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[registerTempCustomViewAssem], view = ");
        sbLIZ.append(view);
        sbLIZ.append(", area = ");
        sbLIZ.append(i);
        C19290510dT.LIZLLL("InnerPushAssemStore", C2188811AlT.LIZIZ(sbLIZ));
        ((ConcurrentHashMap) LIZJ.getValue()).put(Integer.valueOf(i), view);
    }
}
