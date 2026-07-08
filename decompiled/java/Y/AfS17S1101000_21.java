package Y;

import X.C09JN;
import X.C1369220ljc;
import X.C13LP;
import X.C1720006oQ;
import X.C1C7U;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AfS17S1101000_21 implements C09JN {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS17S1101000_21 afS17S1101000_21, Object obj) {
        C1C7U.LIZ("ShareMoreContactsRepository@8b41.searchRelationApi$disposable$3");
        List list = (List) obj;
        C1369220ljc c1369220ljc = (C1369220ljc) afS17S1101000_21.l1;
        String str = afS17S1101000_21.s0;
        if (afS17S1101000_21.i2 == c1369220ljc.LLIZLLLIL && Intrinsics.LJFF(str, c1369220ljc.LLJILLL.getValue())) {
            C1369220ljc c1369220ljc2 = (C1369220ljc) afS17S1101000_21.l1;
            List<? extends IMContact> list2 = c1369220ljc2.LLJ;
            AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(c1369220ljc2, 22);
            ArrayList arrayList = new ArrayList(list2);
            ArrayList arrayList2 = new ArrayList();
            Iterator<? extends IMContact> it2 = list2.iterator();
            while (it2.hasNext()) {
                Object objInvoke = awS600S0100000_21.invoke(it2.next());
                if (((String) objInvoke).length() > 0 && objInvoke != null) {
                    arrayList2.add(objInvoke);
                }
            }
            Set setLLIIIZ = C13LP.LLIIIZ(arrayList2);
            for (Object obj2 : list) {
                String str2 = (String) awS600S0100000_21.invoke(obj2);
                if (str2.length() == 0 || setLLIIIZ.add(str2)) {
                    arrayList.add(obj2);
                }
            }
            ((C1369220ljc) afS17S1101000_21.l1).LJIIIIZZ(arrayList);
            C1369220ljc c1369220ljc3 = (C1369220ljc) afS17S1101000_21.l1;
            c1369220ljc3.LJIIJJI(arrayList, Integer.valueOf(c1369220ljc3.LLJI), true, Double.valueOf(((C1369220ljc) afS17S1101000_21.l1).LLJIJIL), Double.valueOf(((C1369220ljc) afS17S1101000_21.l1).LLJILJIL));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("relation api search success: ");
            sbLIZ.append(list.size());
            sbLIZ.append(", client: ");
            sbLIZ.append(((C1369220ljc) afS17S1101000_21.l1).LLJ.size());
            sbLIZ.append(", merged: ");
            sbLIZ.append(arrayList.size());
            C1720006oQ.LJ("ShareMoreContactsRepository", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("ShareMoreContactsRepository@8b41.searchRelationApi$disposable$3");
    }

    public static final void accept$1(AfS17S1101000_21 afS17S1101000_21, Object obj) {
        C1C7U.LIZ("ShareMoreContactsRepository@8b41.searchRelationApi$disposable$4");
        Throwable th = (Throwable) obj;
        C1369220ljc c1369220ljc = (C1369220ljc) afS17S1101000_21.l1;
        String str = afS17S1101000_21.s0;
        if (afS17S1101000_21.i2 == c1369220ljc.LLIZLLLIL && Intrinsics.LJFF(str, c1369220ljc.LLJILLL.getValue())) {
            C1369220ljc c1369220ljc2 = (C1369220ljc) afS17S1101000_21.l1;
            c1369220ljc2.LJIIIIZZ(c1369220ljc2.LLJ);
            C1369220ljc c1369220ljc3 = (C1369220ljc) afS17S1101000_21.l1;
            c1369220ljc3.LJIIJJI(c1369220ljc3.LLJ, Integer.valueOf(c1369220ljc3.LLJI), true, Double.valueOf(((C1369220ljc) afS17S1101000_21.l1).LLJIJIL), Double.valueOf(((C1369220ljc) afS17S1101000_21.l1).LLJILJIL));
            C1720006oQ.LIZJ("ShareMoreContactsRepository", "relation api search error", th);
        }
        C1C7U.LIZIZ("ShareMoreContactsRepository@8b41.searchRelationApi$disposable$4");
    }

    public AfS17S1101000_21(C1369220ljc c1369220ljc, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = c1369220ljc;
        this.s0 = str;
        this.i2 = i;
    }
}
