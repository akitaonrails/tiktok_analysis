package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12y2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19927612y2 implements InterfaceC19925612xi {
    public static final C19927612y2 LLILLJJLI = new C19927612y2(new TreeMap());
    public static final C19928012y6 LLILLL = new AbstractC19925812xk<C19927612y2>() { // from class: X.12y6
        @Override // X.InterfaceC19925712xj
        public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
            C19927512y1 c19927512y1 = new C19927512y1();
            try {
                c19927512y1.LJ(abstractC19927312xz);
                return c19927512y1.build();
            } catch (C19926612xs e) {
                TryCatchGuardChecker.doCheck(e);
                e.setUnfinishedMessage(c19927512y1.build());
                throw e;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C19926612xs c19926612xs = new C19926612xs(e2);
                c19926612xs.setUnfinishedMessage(c19927512y1.build());
                throw c19926612xs;
            }
        }
    };
    public final TreeMap<Integer, C19927912y5> LL;

    @Override // X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    public final int LIZ() {
        if (this.LL.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<Integer, C19927912y5> entry : this.LL.entrySet()) {
            C19927912y5 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int iLJIIL = 0;
            for (int i2 = 0; i2 < value.LIZLLL.size(); i2++) {
                iLJIIL += (AbstractC19928912yF.LJIIL(1) * 2) + AbstractC19928912yF.LJIIL(2) + AbstractC19928912yF.LJIILIIL(iIntValue) + AbstractC19928912yF.LIZJ(3, (AbstractC19922812xG) ListProtector.get(value.LIZLLL, i2));
            }
            i += iLJIIL;
        }
        return i;
    }

    @Override // X.InterfaceC19925612xi
    public final int getSerializedSize() {
        if (this.LL.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<Integer, C19927912y5> entry : this.LL.entrySet()) {
            C19927912y5 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i2 = 0;
            int iLJIIL = 0;
            while (true) {
                C19888812rm c19888812rm = value.LIZ;
                if (i2 >= c19888812rm.LLILLL) {
                    break;
                }
                iLJIIL += AbstractC19928912yF.LJIIL(iIntValue) + AbstractC19928912yF.LJIILJJIL(c19888812rm.getLong(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C19889012ro c19889012ro = value.LIZIZ;
                if (i3 >= c19889012ro.LLILLL) {
                    break;
                }
                c19889012ro.getInt(i3);
                iLJIIL += AbstractC19928912yF.LJIIL(iIntValue) + 4;
                i3++;
            }
            int i4 = 0;
            while (true) {
                C19888812rm c19888812rm2 = value.LIZJ;
                if (i4 >= c19888812rm2.LLILLL) {
                    break;
                }
                c19888812rm2.getLong(i4);
                iLJIIL += AbstractC19928912yF.LJIIL(iIntValue) + 8;
                i4++;
            }
            for (int i5 = 0; i5 < value.LIZLLL.size(); i5++) {
                iLJIIL += AbstractC19928912yF.LIZJ(iIntValue, (AbstractC19922812xG) ListProtector.get(value.LIZLLL, i5));
            }
            for (int i6 = 0; i6 < value.LJ.size(); i6++) {
                iLJIIL += (AbstractC19928912yF.LJIIL(iIntValue) * 2) + ((C19927612y2) ListProtector.get(value.LJ, i6)).getSerializedSize();
            }
            i += iLJIIL;
        }
        return i;
    }

    public final int hashCode() {
        if (this.LL.isEmpty()) {
            return 0;
        }
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC19925612xi
    public final InterfaceC19928112y7 newBuilderForType() {
        return new C19927512y1();
    }

    @Override // X.InterfaceC19925612xi
    public final InterfaceC19928112y7 toBuilder() {
        C19927512y1 c19927512y1 = new C19927512y1();
        c19927512y1.LJFF(this);
        return c19927512y1;
    }

    public final String toString() {
        boolean z = C19924212xU.LIZ;
        C19932212ym c19932212ym = C19932212ym.LJ;
        c19932212ym.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            if (c19932212ym.LIZJ) {
                try {
                    sb.append((CharSequence) "");
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalStateException(e);
                }
            }
            C19932212ym.LJFF(this, new C19933012yu(sb, false), c19932212ym.LIZJ);
            return sb.toString();
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new IllegalStateException(e2);
        }
    }

    @Override // X.InterfaceC19925612xi
    public final byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC19928912yF.LIZIZ;
            C19929212yI c19929212yI = new C19929212yI(bArr, serializedSize);
            writeTo(c19929212yI);
            if (c19929212yI.LJJIZ() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // X.InterfaceC19925612xi
    public final AbstractC19922812xG toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC19922812xG abstractC19922812xG = AbstractC19922812xG.EMPTY;
            C19925312xf c19925312xf = new C19925312xf(serializedSize);
            writeTo(c19925312xf.LIZ);
            if (c19925312xf.LIZ.LJJIZ() == 0) {
                return new C19922512xD(c19925312xf.LIZIZ);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19925612xi
    public final InterfaceC19925712xj getParserForType() {
        return LLILLL;
    }

    public C19927612y2(TreeMap<Integer, C19927912y5> treeMap) {
        this.LL = treeMap;
    }

    public final void LIZIZ(AbstractC19928912yF abstractC19928912yF) {
        if (this.LL.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C19927912y5> entry : this.LL.entrySet()) {
            C19927912y5 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            for (int i = 0; i < value.LIZLLL.size(); i++) {
                abstractC19928912yF.LJJIIZI(iIntValue, (AbstractC19922812xG) ListProtector.get(value.LIZLLL, i));
            }
        }
    }

    public final void LIZJ(InterfaceC19361110or interfaceC19361110or) {
        if (this.LL.isEmpty()) {
            return;
        }
        interfaceC19361110or.getClass();
        if (EnumC19361010oq.ASCENDING == EnumC19361010oq.DESCENDING) {
            for (Map.Entry<Integer, C19927912y5> entry : this.LL.descendingMap().entrySet()) {
                entry.getValue().LIZIZ(entry.getKey().intValue(), interfaceC19361110or);
            }
            return;
        }
        for (Map.Entry<Integer, C19927912y5> entry2 : this.LL.entrySet()) {
            entry2.getValue().LIZIZ(entry2.getKey().intValue(), interfaceC19361110or);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19927612y2) && this.LL.equals(((C19927612y2) obj).LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19925612xi
    public final void writeTo(AbstractC19928912yF abstractC19928912yF) {
        if (this.LL.isEmpty()) {
            return;
        }
        for (Map.Entry<Integer, C19927912y5> entry : this.LL.entrySet()) {
            C19927912y5 value = entry.getValue();
            int iIntValue = entry.getKey().intValue();
            int i = 0;
            while (true) {
                C19888812rm c19888812rm = value.LIZ;
                if (i >= c19888812rm.LLILLL) {
                    break;
                }
                abstractC19928912yF.LJJIJLIJ(iIntValue, c19888812rm.getLong(i));
                i++;
            }
            int i2 = 0;
            while (true) {
                C19889012ro c19889012ro = value.LIZIZ;
                if (i2 >= c19889012ro.LLILLL) {
                    break;
                }
                abstractC19928912yF.LJIJJLI(iIntValue, c19889012ro.getInt(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C19888812rm c19888812rm2 = value.LIZJ;
                if (i3 >= c19888812rm2.LLILLL) {
                    break;
                }
                abstractC19928912yF.LJJ(iIntValue, c19888812rm2.getLong(i3));
                i3++;
            }
            for (int i4 = 0; i4 < value.LIZLLL.size(); i4++) {
                abstractC19928912yF.LJIJI(iIntValue, (AbstractC19922812xG) ListProtector.get(value.LIZLLL, i4));
            }
            for (int i5 = 0; i5 < value.LJ.size(); i5++) {
                abstractC19928912yF.LJJIFFI(iIntValue, (C19927612y2) ListProtector.get(value.LJ, i5));
            }
        }
    }
}
