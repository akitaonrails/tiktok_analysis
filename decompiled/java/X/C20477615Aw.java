package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15Aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20477615Aw {
    public static final List<C20477615Aw> LIZLLL;
    public final int LIZ;
    public final List<EnumC20476415Ak> LIZIZ;
    public final List<String> LIZJ;

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    static {
        ArrayList arrayList = new ArrayList();
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.IMAGE;
        arrayList.add(enumC20476415Ak);
        EnumC20476415Ak enumC20476415Ak2 = EnumC20476415Ak.LABEL;
        arrayList.add(enumC20476415Ak2);
        C20477615Aw c20477615Aw = new C20477615Aw(10, arrayList, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(enumC20476415Ak2);
        EnumC20476415Ak enumC20476415Ak3 = EnumC20476415Ak.BOARD;
        arrayList2.add(enumC20476415Ak3);
        arrayList2.add(enumC20476415Ak);
        C20477615Aw c20477615Aw2 = new C20477615Aw(21, arrayList2, C1697810uHb.LJIILJJIL(C15B8.LJIL));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(enumC20476415Ak2);
        arrayList3.add(enumC20476415Ak3);
        arrayList3.add(enumC20476415Ak);
        C20477615Aw c20477615Aw3 = new C20477615Aw(22, arrayList3, new ArrayList());
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(enumC20476415Ak);
        arrayList4.add(enumC20476415Ak2);
        C20477615Aw c20477615Aw4 = new C20477615Aw(30, arrayList4, new ArrayList());
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(enumC20476415Ak);
        arrayList5.add(enumC20476415Ak2);
        C20477615Aw c20477615Aw5 = new C20477615Aw(40, arrayList5, new ArrayList());
        C13BV c13bv = C13BV.INSTANCE;
        LIZLLL = C1697810uHb.LJIIJJI(c20477615Aw, c20477615Aw2, c20477615Aw3, c20477615Aw4, c20477615Aw5, new C20477615Aw(50, c13bv, c13bv));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playStatus:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",saveGeniusTypeList:");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(",saveShowGeniusViewId:");
        sbLIZ.append(this.LIZJ.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20477615Aw(int i, List<? extends EnumC20476415Ak> list, List<String> list2) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
