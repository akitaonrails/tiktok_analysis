package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0CpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325440CpK {
    public long LIZ = 0;
    public final HashMap<EnumC325450CpL, List<InterfaceC325430CpJ>> LIZIZ = new HashMap<>();

    public C325440CpK() {
        if (EnumC325450CpL.values().length > 62) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("the maximum length allowed is 62, current size is ");
            sbLIZ.append(EnumC325450CpL.values().length);
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (EnumC325450CpL enumC325450CpL : EnumC325450CpL.values()) {
            enumC325450CpL.setBitOperationValue(Long.valueOf(1 << enumC325450CpL.ordinal()));
        }
    }

    public final void LIZ(EnumC325450CpL enumC325450CpL, boolean z) {
        long j;
        long jLongValue;
        Long bitOperationValue;
        Long bitOperationValue2 = enumC325450CpL.getBitOperationValue();
        if (bitOperationValue2 != null) {
            long jLongValue2 = bitOperationValue2.longValue();
            if (z) {
                j = jLongValue2 | this.LIZ;
            } else {
                j = (~jLongValue2) & this.LIZ;
            }
            this.LIZ = j;
            EnumC325450CpL key = null;
            for (Map.Entry<EnumC325450CpL, List<InterfaceC325430CpJ>> entry : this.LIZIZ.entrySet()) {
                if (entry.getKey() != enumC325450CpL) {
                    Long bitOperationValue3 = entry.getKey().getBitOperationValue();
                    long jLongValue3 = 0;
                    if (bitOperationValue3 != null) {
                        jLongValue = bitOperationValue3.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (jLongValue < this.LIZ) {
                        Iterator<T> it2 = entry.getValue().iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC325430CpJ) it2.next()).LIZ(false);
                        }
                    } else {
                        Long bitOperationValue4 = entry.getKey().getBitOperationValue();
                        if (bitOperationValue4 != null) {
                            long jLongValue4 = bitOperationValue4.longValue();
                            if (jLongValue4 > this.LIZ) {
                                EnumC325450CpL enumC325450CpL2 = key;
                                if (enumC325450CpL2 != null && (bitOperationValue = enumC325450CpL2.getBitOperationValue()) != null) {
                                    jLongValue3 = bitOperationValue.longValue();
                                }
                                if (jLongValue4 > jLongValue3) {
                                    key = entry.getKey();
                                }
                            }
                        }
                    }
                }
            }
            List<InterfaceC325430CpJ> list = this.LIZIZ.get(key);
            if (list != null) {
                Iterator<InterfaceC325430CpJ> it3 = list.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZ(true);
                }
            }
        }
    }
}
