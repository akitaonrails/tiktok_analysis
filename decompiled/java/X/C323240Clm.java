package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Clm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323240Clm {
    public static AbstractC316870CbV LIZ(AbstractC323330Clv abstractC323330Clv, Function1 function1) {
        Exception exc;
        if (abstractC323330Clv instanceof C323350Clx) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Params params = ((C323350Clx) abstractC323330Clv).LIZIZ;
            List<T> list = ((C323350Clx) abstractC323330Clv).LIZJ;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object objInvoke = function1.invoke(it2.next());
                if (objInvoke != null) {
                    arrayList.add(objInvoke);
                }
            }
            return C317290CcB.LJ(c317290CcB, null, params, arrayList, 1);
        }
        if (abstractC323330Clv instanceof C323320Clu) {
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            List<T> list2 = ((C323320Clu) abstractC323330Clv).LIZIZ;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                Object objInvoke2 = function1.invoke(it3.next());
                if (objInvoke2 != null) {
                    arrayList2.add(objInvoke2);
                }
            }
            c317290CcB2.getClass();
            return new C316640Cb8(arrayList2);
        }
        if (abstractC323330Clv instanceof C323310Clt) {
            C317290CcB c317290CcB3 = AbstractC316870CbV.LIZ;
            Throwable th = ((C323310Clt) abstractC323330Clv).LIZIZ;
            if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
                exc = new Exception();
            }
            c317290CcB3.getClass();
            return new C316650Cb9(exc);
        }
        throw new C1954807lC();
    }
}
