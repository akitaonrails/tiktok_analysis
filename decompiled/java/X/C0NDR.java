package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDR {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    public static void LIZ(String str) {
        ?? arrayList;
        if (C797930VRv.LIZ()) {
            C0NDV.LIZ.getClass();
            C0NDV.LIZIZ().toString();
        }
        if (((Boolean) C0BJJ.LIZ.getValue()).booleanValue()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            C590480NDy.LIZ.getClass();
            List listLLIIII = C13LP.LLIIII(C590480NDy.LIZIZ);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listLLIIII) {
                if (((String) obj2).length() > 0) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = C13LP.LJLIL(arrayList3, arrayList2);
        } else {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            arrayList = new ArrayList();
            for (Object obj3 : listLJJLIIIJILLIZJL2) {
                if (((String) obj3).length() > 0) {
                    arrayList.add(obj3);
                }
            }
        }
        C0NDV.LIZ.getClass();
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        if (C0NDV.LJIIJ()) {
            C0NDV.LJIILIIL(new C0NDU(arrayList, c118300cf));
        }
    }
}
