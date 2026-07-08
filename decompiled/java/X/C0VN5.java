package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0VN5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VN5 implements C0VOJ, InterfaceC590330NDj {
    public static final TreeMap<Integer, C0VN5> LLJ = new TreeMap<>();
    public volatile String LL;
    public final long[] LLILLJJLI;
    public final double[] LLILLL;
    public final String[] LLILZ;
    public final byte[][] LLILZIL;
    public final int[] LLILZLL;
    public final int LLIZ;
    public int LLIZLLLIL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void release() {
        TreeMap<Integer, C0VN5> treeMap = LLJ;
        synchronized (treeMap) {
            try {
                treeMap.put(Integer.valueOf(this.LLIZ), this);
                if (treeMap.size() > 15) {
                    int size = treeMap.size() - 10;
                    Iterator<Integer> it2 = treeMap.descendingKeySet().iterator();
                    while (true) {
                        int i = size - 1;
                        if (size <= 0) {
                            break;
                        }
                        it2.next();
                        it2.remove();
                        size = i;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0VOJ
    public final String LIZIZ() {
        return this.LL;
    }

    public C0VN5(int i) {
        this.LLIZ = i;
        int i2 = i + 1;
        this.LLILZLL = new int[i2];
        this.LLILLJJLI = new long[i2];
        this.LLILLL = new double[i2];
        this.LLILZ = new String[i2];
        this.LLILZIL = new byte[i2][];
    }

    @Override // X.C0VOJ
    public final void LIZ(InterfaceC590330NDj interfaceC590330NDj) {
        for (int i = 1; i <= this.LLIZLLLIL; i++) {
            int i2 = this.LLILZLL[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                interfaceC590330NDj.LJJIIJZLJL(i, this.LLILZIL[i]);
                            }
                        } else {
                            interfaceC590330NDj.LJIILIIL(i, this.LLILZ[i]);
                        }
                    } else {
                        interfaceC590330NDj.LJJI(this.LLILLL[i], i);
                    }
                } else {
                    interfaceC590330NDj.LJIJ(i, this.LLILLJJLI[i]);
                }
            } else {
                interfaceC590330NDj.LLD(i);
            }
        }
    }

    @Override // X.InterfaceC590330NDj
    public final void LLD(int i) {
        this.LLILZLL[i] = 1;
    }

    public static C0VN5 LIZLLL(int i, String str) {
        TreeMap<Integer, C0VN5> treeMap = LLJ;
        synchronized (treeMap) {
            try {
                Map.Entry<Integer, C0VN5> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry != null) {
                    treeMap.remove(entryCeilingEntry.getKey());
                    C0VN5 value = entryCeilingEntry.getValue();
                    value.LL = str;
                    value.LLIZLLLIL = i;
                    return value;
                }
                C0VN5 c0vn5 = new C0VN5(i);
                c0vn5.LL = str;
                c0vn5.LLIZLLLIL = i;
                return c0vn5;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC590330NDj
    public final void LJIILIIL(int i, String str) {
        this.LLILZLL[i] = 4;
        this.LLILZ[i] = str;
    }

    @Override // X.InterfaceC590330NDj
    public final void LJIJ(int i, long j) {
        this.LLILZLL[i] = 2;
        this.LLILLJJLI[i] = j;
    }

    @Override // X.InterfaceC590330NDj
    public final void LJJI(double d, int i) {
        this.LLILZLL[i] = 3;
        this.LLILLL[i] = d;
    }

    @Override // X.InterfaceC590330NDj
    public final void LJJIIJZLJL(int i, byte[] bArr) {
        this.LLILZLL[i] = 5;
        this.LLILZIL[i] = bArr;
    }
}
