package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04zR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1278704zR implements InterfaceC649890PeN {
    public int LIZIZ;
    public final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, C644910PRh> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC649890PeN
    public final C644910PRh LIZJ() {
        return LJII(this.LIZIZ);
    }

    @Override // X.InterfaceC649890PeN
    public final void LJFF() {
        this.LIZ.clear();
    }

    @Override // X.InterfaceC649890PeN
    public final Map<String, Object> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC649890PeN
    public final int LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC649890PeN
    public final void LIZ(int i) {
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC649890PeN
    public final void LIZIZ(Function1<? super Integer, Integer> function1) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, C644910PRh> entry : this.LIZ.entrySet()) {
            Integer numInvoke = function1.invoke(entry.getKey());
            if (numInvoke != null && (iIntValue = numInvoke.intValue()) >= 0) {
                linkedHashMap.put(Integer.valueOf(iIntValue), entry.getValue());
            }
        }
        this.LIZ.clear();
        this.LIZ.putAll(linkedHashMap);
    }

    @Override // X.InterfaceC649890PeN
    public final C644910PRh LJII(int i) {
        C644910PRh c644910PRh = this.LIZ.get(Integer.valueOf(i));
        if (c644910PRh == null) {
            return new C644910PRh();
        }
        return c644910PRh;
    }

    @Override // X.InterfaceC649890PeN
    public final void LJI(int i, C644910PRh c644910PRh) {
        this.LIZ.put(Integer.valueOf(i), c644910PRh);
    }
}
