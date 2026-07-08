package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Queue;

/* JADX INFO: renamed from: X.13AT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13AT implements C13AX {
    public final String LL;
    public volatile C13AX LLILLJJLI;
    public Boolean LLILLL;
    public Method LLILZ;
    public C13AS LLILZIL;
    public final Queue<C13AO> LLILZLL;
    public final boolean LLIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13AS] */
    public final C13AX LIZ() {
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        if (this.LLIZ) {
            return C13AY.NOP_LOGGER;
        }
        if (this.LLILZIL == null) {
            final Queue<C13AO> queue = this.LLILZLL;
            this.LLILZIL = new C13AW(this, queue) { // from class: X.13AS
                public static final long serialVersionUID = -176083308134819629L;
                public final String LL;
                public final C13AT LLILLJJLI;
                public final Queue<C13AO> LLILLL;

                @Override // X.C13AW, X.C13AV
                public /* bridge */ /* synthetic */ InterfaceC19966013Ac atDebug() {
                    return C13AU.LIZ(this);
                }

                @Override // X.C13AW, X.C13AV
                public /* bridge */ /* synthetic */ InterfaceC19966013Ac atError() {
                    return C13AU.LIZIZ(this);
                }

                @Override // X.C13AW, X.C13AV
                public /* bridge */ /* synthetic */ InterfaceC19966013Ac atInfo() {
                    return C13AU.LIZJ(this);
                }

                @Override // X.C13AW, X.C13AV
                public /* bridge */ /* synthetic */ InterfaceC19966013Ac atLevel(EnumC19864512nr enumC19864512nr) {
                    return C13AU.LIZLLL(this, enumC19864512nr);
                }

                @Override // X.C13AW, X.C13AV
                public /* bridge */ /* synthetic */ InterfaceC19966013Ac atTrace() {
                    return C13AU.LJ(this);
                }

                @Override // X.C13AW, X.C13AV
                public /* bridge */ /* synthetic */ InterfaceC19966013Ac atWarn() {
                    return C13AU.LJFF(this);
                }

                @Override // X.C13AW, X.C13AV, X.C13AX
                public boolean isDebugEnabled() {
                    return true;
                }

                @Override // X.C13AW, X.C13AV, X.C13AX
                public /* bridge */ /* synthetic */ boolean isEnabledForLevel(EnumC19864512nr enumC19864512nr) {
                    return C13AU.LJI(this, enumC19864512nr);
                }

                @Override // X.C13AW, X.C13AV, X.C13AX
                public boolean isErrorEnabled() {
                    return true;
                }

                @Override // X.C13AW, X.C13AV, X.C13AX
                public boolean isInfoEnabled() {
                    return true;
                }

                @Override // X.C13AW, X.C13AV, X.C13AX
                public boolean isTraceEnabled() {
                    return true;
                }

                @Override // X.C13AW, X.C13AV, X.C13AX
                public boolean isWarnEnabled() {
                    return true;
                }

                @Override // X.C13AV, X.C13AX
                public String getName() {
                    return this.LL;
                }

                @Override // X.C13AW, X.C13AV, X.C13AX
                public InterfaceC19966013Ac makeLoggingEventBuilder(EnumC19864512nr enumC19864512nr) {
                    return new C19965813Aa();
                }

                {
                    this.LLILLJJLI = this;
                    this.LL = this.LL;
                    this.LLILLL = queue;
                }

                @Override // X.C13AV
                public final void LIZJ(EnumC19864512nr enumC19864512nr, C13AP c13ap, Object[] objArr) {
                    C13AO c13ao = new C13AO();
                    System.currentTimeMillis();
                    c13ao.LIZ = enumC19864512nr;
                    c13ao.LIZJ = this.LLILLJJLI;
                    if (c13ap != null) {
                        if (c13ao.LIZIZ == null) {
                            c13ao.LIZIZ = new ArrayList(2);
                        }
                        ((ArrayList) c13ao.LIZIZ).add(c13ap);
                    }
                    C786410Ut5.u3().getName();
                    c13ao.LIZLLL = objArr;
                    this.LLILLL.add(c13ao);
                }
            };
        }
        return this.LLILZIL;
    }

    public final boolean LIZIZ() {
        Boolean bool = this.LLILLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.LLILZ = this.LLILLJJLI.getClass().getMethod("log", C13AQ.class);
            this.LLILLL = Boolean.TRUE;
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL = Boolean.FALSE;
        }
        return this.LLILLL.booleanValue();
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.C13AX
    public final boolean isDebugEnabled() {
        return LIZ().isDebugEnabled();
    }

    @Override // X.C13AX
    public final boolean isErrorEnabled() {
        return LIZ().isErrorEnabled();
    }

    @Override // X.C13AX
    public final boolean isInfoEnabled() {
        return LIZ().isInfoEnabled();
    }

    @Override // X.C13AX
    public final boolean isTraceEnabled() {
        return LIZ().isTraceEnabled();
    }

    @Override // X.C13AX
    public final boolean isWarnEnabled() {
        return LIZ().isWarnEnabled();
    }

    @Override // X.C13AX
    public final String getName() {
        return this.LL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13AT.class == obj.getClass() && this.LL.equals(((C13AT) obj).LL)) {
            return true;
        }
        return false;
    }

    @Override // X.C13AX
    public final void error(String str) {
        LIZ().error(str);
    }

    @Override // X.C13AX
    public final boolean isEnabledForLevel(EnumC19864512nr enumC19864512nr) {
        return LIZ().isEnabledForLevel(enumC19864512nr);
    }

    @Override // X.C13AX
    public final InterfaceC19966013Ac makeLoggingEventBuilder(EnumC19864512nr enumC19864512nr) {
        return LIZ().makeLoggingEventBuilder(enumC19864512nr);
    }

    @Override // X.C13AX
    public final void trace(String str) {
        LIZ().trace(str);
    }

    @Override // X.C13AX
    public final void error(String str, Object obj) {
        LIZ().error(str, obj);
    }

    @Override // X.C13AX
    public final void trace(String str, Object obj) {
        LIZ().trace(str, obj);
    }

    @Override // X.C13AX
    public final void error(String str, Throwable th) {
        LIZ().error(str, th);
    }

    @Override // X.C13AX
    public final void trace(String str, Throwable th) {
        LIZ().trace(str, th);
    }

    public C13AT(String str, Queue<C13AO> queue, boolean z) {
        this.LL = str;
        this.LLILZLL = queue;
        this.LLIZ = z;
    }

    @Override // X.C13AX
    public final void error(String str, Object obj, Object obj2) {
        LIZ().error(str, obj, obj2);
    }

    @Override // X.C13AX
    public final void trace(String str, Object obj, Object obj2) {
        LIZ().trace(str, obj, obj2);
    }
}
