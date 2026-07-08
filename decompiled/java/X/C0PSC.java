package X;

import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PSC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSC {
    public static final C0PSC LIZ = new C0PSC();
    public static final List<String> LIZIZ = new ArrayList();
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;

    public static void LIZ() {
        ((ArrayList) LIZIZ).clear();
        LJFF = null;
        LIZJ = null;
        LIZLLL = null;
        LJ = null;
    }

    public static void LIZIZ(String str) {
        if (str.length() > 0) {
            List<String> list = LIZIZ;
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty() || !Intrinsics.LJFF(C13LP.LJJLIIIJL(list), str)) {
                arrayList.add(str);
            }
        }
        if (LJFF != null) {
            return;
        }
        C662670Pyz.LIZ.getClass();
        String strLIZ = C662670Pyz.LIZ();
        LJFF = strLIZ;
        if (strLIZ == null) {
            C1AF0.LIZJ("endtoendsessionid");
            return;
        }
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        LIZJ = ((C0Q39) iSearchContextAbilityLJI.P70().LIZJ()).LLILLJJLI;
        LIZLLL = ((C663990Q2r) iSearchContextAbilityLJI.Ww1().LIZJ()).LL;
        LJ = ((C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ()).LLJLL;
    }
}
