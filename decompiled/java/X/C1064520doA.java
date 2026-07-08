package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0doA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064520doA {
    public static final C01GW<C1064520doA> LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(85));

    public static void LIZ(C13BV c13bv, int i, Function2 function2) {
        try {
            String[] strArr = (String[]) c13bv.toArray(new String[0]);
            Aweme awemeLJ = C740740T3w.LJ();
            if (strArr.length == 0) {
                C1064540doC c1064540doC = new C1064540doC(awemeLJ);
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c1064540doC.LJJIIZ("slide_down");
                        }
                    } else {
                        c1064540doC.LJJIIZ("blank");
                    }
                } else {
                    c1064540doC.LJJIIZ("close_button");
                }
            }
            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "not_interested", awemeLJ));
            function2.invoke(Boolean.TRUE, "Dislike reasons submitted successfully via global service, and popUp closed");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Boolean bool = Boolean.FALSE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error submitting dislike: ");
            sbLIZ.append(e.getMessage());
            function2.invoke(bool, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
