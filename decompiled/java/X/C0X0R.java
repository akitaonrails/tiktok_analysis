package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X0R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0R extends C09AY implements Function0<List<? extends String>> {
    public C0X0R() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(3);
        C2211621BhA c2211621BhA = C2211621BhA.LIZ;
        c2211621BhA.getClass();
        C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
        if (c2211641BhC != null && (str2 = c2211641BhC.LJFF) != null) {
            arrayList.add(str2);
        }
        c2211621BhA.getClass();
        C2211641BhC c2211641BhC2 = C2211621BhA.LIZJ;
        if (c2211641BhC2 != null && (str = c2211641BhC2.LJ) != null) {
            arrayList.add(str);
        }
        String strLJII = C2211631BhB.LJII();
        if (strLJII == null) {
            strLJII = "pns-null";
        }
        arrayList.add(strLJII);
        return arrayList;
    }
}
