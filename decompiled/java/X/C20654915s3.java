package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.15s3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20654915s3 {
    public C20654815s2 LIZ;

    public final void LIZ(EnumC20654715s1 enumC20654715s1, EnumC19297710ed enumC19297710ed) {
        C20654815s2 c20654815s2 = this.LIZ;
        if (c20654815s2 != null) {
            List<InterfaceC19297910ef> arrayList = (List) ((LinkedHashMap) c20654815s2.LIZIZ).get(enumC20654715s1);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(enumC19297710ed);
            c20654815s2.LIZIZ.put(enumC20654715s1, arrayList);
        }
    }

    public final void LIZIZ(EnumC20654715s1 enumC20654715s1, EnumC12932054g enumC12932054g) {
        C20654815s2 c20654815s2 = this.LIZ;
        if (c20654815s2 != null) {
            List<InterfaceC12945054t> arrayList = (List) ((LinkedHashMap) c20654815s2.LIZJ).get(enumC20654715s1);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(enumC12932054g);
            c20654815s2.LIZJ.put(enumC20654715s1, arrayList);
        }
    }
}
