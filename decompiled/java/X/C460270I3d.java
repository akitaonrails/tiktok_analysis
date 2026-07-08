package X;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0I3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460270I3d {
    public static final /* synthetic */ C460270I3d LIZ = new C460270I3d();

    public static CharSequence LIZ(InterfaceC460300I3g interfaceC460300I3g, Context context) {
        if (interfaceC460300I3g instanceof C460250I3b) {
            C460250I3b c460250I3b = (C460250I3b) interfaceC460300I3g;
            c460250I3b.getClass();
            C1360520lVa c1360520lVa = new C1360520lVa();
            c460250I3b.LIZJ.invoke(c1360520lVa, context);
            return c1360520lVa.LIZ.toString();
        }
        if (interfaceC460300I3g instanceof C460290I3f) {
            C460290I3f c460290I3f = (C460290I3f) interfaceC460300I3g;
            String str = c460290I3f.LIZIZ;
            String[] strArr = (String[]) c460290I3f.LIZJ.toArray(new String[0]);
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            return C786410Ut5.j4(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        if (interfaceC460300I3g instanceof C1233704sB) {
            C1233704sB c1233704sB = (C1233704sB) interfaceC460300I3g;
            List<String> list = c1233704sB.LIZJ;
            int i = c1233704sB.LIZIZ;
            if (list == null) {
                return context.getString(i);
            }
            String[] strArr2 = (String[]) list.toArray(new String[0]);
            return context.getString(i, Arrays.copyOf(strArr2, strArr2.length));
        }
        if (interfaceC460300I3g instanceof C1258904wF) {
            return ((C1258904wF) interfaceC460300I3g).LIZIZ;
        }
        if (interfaceC460300I3g instanceof C1233604sA) {
            return ((C1233604sA) interfaceC460300I3g).LIZJ.invoke(context);
        }
        if (interfaceC460300I3g instanceof C460280I3e) {
            C460280I3e c460280I3e = (C460280I3e) interfaceC460300I3g;
            return context.getResources().getQuantityString(c460280I3e.LIZIZ, (int) c460280I3e.LIZJ, c460280I3e.LIZLLL);
        }
        throw new C1954807lC();
    }
}
