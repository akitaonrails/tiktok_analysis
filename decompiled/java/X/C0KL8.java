package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0KL8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KL8 {
    public static final C0KL8 LIZ = new C0KL8();
    public static String LIZIZ = "";

    public static String LIZ(boolean z) {
        Map<String, C515620KKa> map;
        Collection collectionValues;
        if (z) {
            new ArrayList();
            C518090KTn c518090KTn = C513470KBt.LIZJ;
            if (c518090KTn != null && (map = c518090KTn.LJIIJ) != null && (collectionValues = ((HashMap) map).values()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C515620KKa) it2.next()).LIZ);
                }
                return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, new ArrayList(arrayList));
            }
            return "";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r7, kotlin.jvm.functions.Function1 r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0KLC
            if (r0 == 0) goto L4c
            r5 = r7
            X.0KLC r5 = (X.C0KLC) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L52
            kotlin.jvm.functions.Function1 r8 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.String r1 = (java.lang.String) r1
            X.C0KL8.LIZIZ = r1
        L28:
            if (r8 == 0) goto L2d
            r8.invoke(r1)
        L2d:
            return r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r1 = X.C0KL8.LIZIZ
            int r0 = r1.length()
            if (r0 != 0) goto L28
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0KL9 r1 = new X.0KL9
            r0 = 0
            r1.<init>(r0)
            r5.LL = r8
            r5.LLILZ = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L24
            return r4
        L4c:
            X.0KLC r5 = new X.0KLC
            r5.<init>(r6, r7)
            goto L12
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KL8.LIZIZ(X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }
}
