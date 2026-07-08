package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HPZ implements InterfaceC0148002o {
    public final InterfaceC440700HPw LL;
    public final List<C0HQC> LLILLJJLI;
    public final C05YD<C0HOM<? extends List<C440440HOw>>> LLILLL;
    public final LinkedHashMap<Integer, C0HPS> LLILZ;
    public final Map<Integer, C0HOB> LLILZIL;
    public final C05YD<C0HOM<? extends List<C440440HOw>>> LLILZLL;
    public final InterfaceC440090HNn LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HPZ)) {
            return false;
        }
        C0HPZ c0hpz = (C0HPZ) obj;
        return Intrinsics.LJFF(this.LL, c0hpz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hpz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hpz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0hpz.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0hpz.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0hpz.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0hpz.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        InterfaceC440090HNn interfaceC440090HNn = this.LLIZ;
        return iHashCode + (interfaceC440090HNn == null ? 0 : interfaceC440090HNn.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdAndElementState(loadingState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", idConfigurations=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentUserSaState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", homeRows=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", supportedElements=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", defaultId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", defaultElement=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0HPZ LIZ(C0HPZ c0hpz, C440690HPv c440690HPv) {
        List<C0HQC> list = c0hpz.LLILLJJLI;
        C05YD<C0HOM<? extends List<C440440HOw>>> c05yd = c0hpz.LLILLL;
        LinkedHashMap<Integer, C0HPS> linkedHashMap = c0hpz.LLILZ;
        Map<Integer, C0HOB> map = c0hpz.LLILZIL;
        C05YD<C0HOM<? extends List<C440440HOw>>> c05yd2 = c0hpz.LLILZLL;
        InterfaceC440090HNn interfaceC440090HNn = c0hpz.LLIZ;
        c0hpz.getClass();
        return new C0HPZ(c440690HPv, list, c05yd, linkedHashMap, map, c05yd2, interfaceC440090HNn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0HPZ(InterfaceC440700HPw interfaceC440700HPw, List<C0HQC> list, C05YD<? extends C0HOM<? extends List<C440440HOw>>> c05yd, LinkedHashMap<Integer, C0HPS> linkedHashMap, Map<Integer, C0HOB> map, C05YD<? extends C0HOM<? extends List<C440440HOw>>> c05yd2, InterfaceC440090HNn interfaceC440090HNn) {
        this.LL = interfaceC440700HPw;
        this.LLILLJJLI = list;
        this.LLILLL = c05yd;
        this.LLILZ = linkedHashMap;
        this.LLILZIL = map;
        this.LLILZLL = c05yd2;
        this.LLIZ = interfaceC440090HNn;
    }
}
