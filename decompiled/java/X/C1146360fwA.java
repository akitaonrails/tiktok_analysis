package X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146360fwA implements InterfaceC1146480fwM {
    public final String LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final int LLILZ;
    public final JSONObject LLILZIL;
    public final InterfaceC1665500tRU<C1146350fw9> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146360fwA)) {
            return false;
        }
        C1146360fwA c1146360fwA = (C1146360fwA) obj;
        return Intrinsics.LJFF(this.LL, c1146360fwA.LL) && this.LLILLJJLI == c1146360fwA.LLILLJJLI && this.LLILLL == c1146360fwA.LLILLL && this.LLILZ == c1146360fwA.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1146360fwA.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1146360fwA.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorActivityUiItem(areaSchema=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", bannerType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", feContextData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", gifts=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        IndexedValue indexedValue;
        if (!(interfaceC1891350zJl instanceof C1146360fwA)) {
            return false;
        }
        C1146360fwA c1146360fwA = (C1146360fwA) interfaceC1891350zJl;
        if (this.LLILLJJLI != c1146360fwA.LLILLJJLI || this.LLILZ != c1146360fwA.LLILZ || this.LLILZLL.size() != c1146360fwA.LLILZLL.size()) {
            return false;
        }
        Iterable iterableLLIIL = C13LP.LLIIL(this.LLILZLL);
        if (!(iterableLLIIL instanceof Collection) || !((Collection) iterableLLIIL).isEmpty()) {
            Iterator it2 = iterableLLIIL.iterator();
            do {
                C717610SCx c717610SCx = (C717610SCx) it2;
                if (c717610SCx.hasNext()) {
                    indexedValue = (IndexedValue) c717610SCx.next();
                }
            } while (((C1146350fw9) indexedValue.LIZIZ).LL == c1146360fwA.LLILZLL.get(indexedValue.LIZ).LL);
            return false;
        }
        return true;
    }

    public C1146360fwA(String str, long j, long j2, int i, JSONObject jSONObject, InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = i;
        this.LLILZIL = jSONObject;
        this.LLILZLL = interfaceC1665500tRU;
    }
}
