package X;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2216811BpX<T> implements InterfaceC1731706qJ {
    public static long LLILLL = -1;
    public static long LLILZ = -1;
    public static final /* synthetic */ int LLILZIL = 0;
    public final InterfaceC1731706qJ<Object, T> LL;
    public T LLILLJJLI;

    public abstract void LIZ();

    static {
        C791390V2r.LJJIII.LJ(new AbstractC791320V2k() { // from class: X.1BpY
            @Override // X.AbstractC791320V2k
            public final void LJIILJJIL(String str) {
                this.LL = true;
                int i = AbstractC2216811BpX.LLILZIL;
                AbstractC2216811BpX.LLILLL = System.currentTimeMillis();
            }

            @Override // X.AbstractC791320V2k
            public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
                this.LL = false;
                int i = AbstractC2216811BpX.LLILZIL;
                AbstractC2216811BpX.LLILLL = -1L;
                if (z) {
                    AbstractC2216811BpX.LLILZ = j4;
                }
            }
        });
    }

    public boolean LIZIZ() {
        return Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2216811BpX(InterfaceC1731706qJ<Object, ? extends T> interfaceC1731706qJ) {
        this.LL = interfaceC1731706qJ;
    }

    @Override // X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        if (!LIZIZ()) {
            return this.LL.getValue(obj, interfaceC2217461Bqa);
        }
        LIZ();
        T t = this.LLILLJJLI;
        if (t != null) {
            return t;
        }
        T value = this.LL.getValue(obj, interfaceC2217461Bqa);
        this.LLILLJJLI = value;
        return value;
    }
}
