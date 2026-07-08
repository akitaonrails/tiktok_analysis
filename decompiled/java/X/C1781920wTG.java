package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wTG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781920wTG {
    public static InterfaceC1785270wYf[] LIZ(InterfaceC1781940wTI interfaceC1781940wTI) {
        List list;
        if (interfaceC1781940wTI instanceof C1781910wTF) {
            list = ((C1781910wTF) interfaceC1781940wTI).LLILLL;
        } else if (interfaceC1781940wTI instanceof C1781890wTD) {
            list = ((C1781890wTD) interfaceC1781940wTI).LLILLL;
        } else if (interfaceC1781940wTI instanceof C1781900wTE) {
            list = ((C1781900wTE) interfaceC1781940wTI).LLILLL;
        } else {
            list = C13BV.INSTANCE;
        }
        return (InterfaceC1785270wYf[]) list.toArray(new InterfaceC1785270wYf[0]);
    }

    public static void LIZIZ(InterfaceC1781940wTI interfaceC1781940wTI, InterfaceC1785270wYf[] interfaceC1785270wYfArr) {
        int i = 0;
        if (interfaceC1781940wTI instanceof C1781910wTF) {
            C1781910wTF c1781910wTF = (C1781910wTF) interfaceC1781940wTI;
            ArrayList arrayList = new ArrayList();
            int length = interfaceC1785270wYfArr.length;
            while (i < length) {
                InterfaceC1785270wYf interfaceC1785270wYf = interfaceC1785270wYfArr[i];
                if (interfaceC1785270wYf instanceof C1781730wSx) {
                    arrayList.add(interfaceC1785270wYf);
                }
                i++;
            }
            c1781910wTF.LLILLL = arrayList;
            return;
        }
        if (interfaceC1781940wTI instanceof C1781890wTD) {
            C1781890wTD c1781890wTD = (C1781890wTD) interfaceC1781940wTI;
            ArrayList arrayList2 = new ArrayList();
            int length2 = interfaceC1785270wYfArr.length;
            while (i < length2) {
                InterfaceC1785270wYf interfaceC1785270wYf2 = interfaceC1785270wYfArr[i];
                if (interfaceC1785270wYf2 instanceof C1781880wTC) {
                    arrayList2.add(interfaceC1785270wYf2);
                }
                i++;
            }
            c1781890wTD.LLILLL = arrayList2;
            return;
        }
        if (interfaceC1781940wTI instanceof C1781900wTE) {
            C1781900wTE c1781900wTE = (C1781900wTE) interfaceC1781940wTI;
            ArrayList arrayList3 = new ArrayList();
            int length3 = interfaceC1785270wYfArr.length;
            while (i < length3) {
                InterfaceC1785270wYf interfaceC1785270wYf3 = interfaceC1785270wYfArr[i];
                if (interfaceC1785270wYf3 instanceof C1781850wT9) {
                    arrayList3.add(interfaceC1785270wYf3);
                }
                i++;
            }
            c1781900wTE.LLILLL = arrayList3;
        }
    }
}
