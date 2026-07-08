package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ooa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630740Ooa<T> implements C01GW<T> {
    public final EnumC452301pR LL;
    public final Function0<T> LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final C01GW<T> LLILZ;
    public Object LLILZIL;
    public final C630740Ooa<T> LLILZLL = this;
    public boolean LLIZ;

    @Override // X.C01GW
    public final T getValue() {
        T t = (T) this.LLILZIL;
        if (t != null || this.LLIZ) {
            return t;
        }
        Function0<Boolean> function0 = this.LLILLL;
        if (function0 != null && function0.invoke().booleanValue()) {
            this.LLIZ = true;
            return (T) this.LLILZIL;
        }
        T value = this.LLILZ.getValue();
        this.LLILZIL = value;
        if (this.LL == EnumC452301pR.SYNCHRONIZED) {
            synchronized (this.LLILZLL) {
                try {
                    if (this.LLILZIL == null) {
                        this.LLILZIL = this.LLILLJJLI.invoke();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else if (value == null) {
            this.LLILZIL = this.LLILLJJLI.invoke();
        }
        return (T) this.LLILZIL;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILZ.isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C630740Ooa(EnumC452301pR enumC452301pR, Function0<? extends T> function0, Function0<Boolean> function02) {
        this.LL = enumC452301pR;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new C630750Oob(this));
    }
}
