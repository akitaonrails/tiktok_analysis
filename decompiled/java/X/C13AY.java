package X;

/* JADX INFO: renamed from: X.13AY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13AY extends C13AZ {
    public static final C13AY NOP_LOGGER = new C13AY();
    public static final long serialVersionUID = -517220405410904473L;

    public /* bridge */ /* synthetic */ InterfaceC19966013Ac atDebug() {
        return C13AU.LIZ(this);
    }

    public /* bridge */ /* synthetic */ InterfaceC19966013Ac atError() {
        return C13AU.LIZIZ(this);
    }

    public /* bridge */ /* synthetic */ InterfaceC19966013Ac atInfo() {
        return C13AU.LIZJ(this);
    }

    public /* bridge */ /* synthetic */ InterfaceC19966013Ac atLevel(EnumC19864512nr enumC19864512nr) {
        return C13AU.LIZLLL(this, enumC19864512nr);
    }

    public /* bridge */ /* synthetic */ InterfaceC19966013Ac atTrace() {
        return C13AU.LJ(this);
    }

    public /* bridge */ /* synthetic */ InterfaceC19966013Ac atWarn() {
        return C13AU.LJFF(this);
    }

    public final void debug(C13AP c13ap, String str) {
    }

    public final void debug(C13AP c13ap, String str, Object obj) {
    }

    public final void debug(C13AP c13ap, String str, Object obj, Object obj2) {
    }

    public final void debug(C13AP c13ap, String str, Throwable th) {
    }

    public final void debug(C13AP c13ap, String str, Object... objArr) {
    }

    public final void debug(String str) {
    }

    public final void debug(String str, Object obj) {
    }

    public final void debug(String str, Object obj, Object obj2) {
    }

    public final void debug(String str, Throwable th) {
    }

    public final void debug(String str, Object... objArr) {
    }

    public final void error(C13AP c13ap, String str) {
    }

    public final void error(C13AP c13ap, String str, Object obj) {
    }

    public final void error(C13AP c13ap, String str, Object obj, Object obj2) {
    }

    public final void error(C13AP c13ap, String str, Throwable th) {
    }

    public final void error(C13AP c13ap, String str, Object... objArr) {
    }

    @Override // X.C13AX
    public final void error(String str) {
    }

    @Override // X.C13AX
    public final void error(String str, Object obj) {
    }

    @Override // X.C13AX
    public final void error(String str, Object obj, Object obj2) {
    }

    @Override // X.C13AX
    public final void error(String str, Throwable th) {
    }

    public final void error(String str, Object... objArr) {
    }

    @Override // X.C13AZ, X.C13AX
    public String getName() {
        return "NOP";
    }

    public final void info(C13AP c13ap, String str) {
    }

    public final void info(C13AP c13ap, String str, Object obj) {
    }

    public final void info(C13AP c13ap, String str, Object obj, Object obj2) {
    }

    public final void info(C13AP c13ap, String str, Throwable th) {
    }

    public final void info(C13AP c13ap, String str, Object... objArr) {
    }

    public final void info(String str) {
    }

    public final void info(String str, Object obj) {
    }

    public final void info(String str, Object obj, Object obj2) {
    }

    public final void info(String str, Throwable th) {
    }

    public final void info(String str, Object... objArr) {
    }

    @Override // X.C13AX
    public final boolean isDebugEnabled() {
        return false;
    }

    public final boolean isDebugEnabled(C13AP c13ap) {
        return false;
    }

    @Override // X.C13AZ, X.C13AX
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(EnumC19864512nr enumC19864512nr) {
        return C13AU.LJI(this, enumC19864512nr);
    }

    @Override // X.C13AX
    public final boolean isErrorEnabled() {
        return false;
    }

    public final boolean isErrorEnabled(C13AP c13ap) {
        return false;
    }

    @Override // X.C13AX
    public final boolean isInfoEnabled() {
        return false;
    }

    public boolean isInfoEnabled(C13AP c13ap) {
        return false;
    }

    @Override // X.C13AX
    public final boolean isTraceEnabled() {
        return false;
    }

    public final boolean isTraceEnabled(C13AP c13ap) {
        return false;
    }

    @Override // X.C13AX
    public final boolean isWarnEnabled() {
        return false;
    }

    public final boolean isWarnEnabled(C13AP c13ap) {
        return false;
    }

    public final void trace(C13AP c13ap, String str) {
    }

    public final void trace(C13AP c13ap, String str, Object obj) {
    }

    public final void trace(C13AP c13ap, String str, Object obj, Object obj2) {
    }

    public final void trace(C13AP c13ap, String str, Throwable th) {
    }

    public final void trace(C13AP c13ap, String str, Object... objArr) {
    }

    @Override // X.C13AX
    public final void trace(String str) {
    }

    @Override // X.C13AX
    public final void trace(String str, Object obj) {
    }

    @Override // X.C13AX
    public final void trace(String str, Object obj, Object obj2) {
    }

    @Override // X.C13AX
    public final void trace(String str, Throwable th) {
    }

    public final void trace(String str, Object... objArr) {
    }

    public final void warn(C13AP c13ap, String str) {
    }

    public final void warn(C13AP c13ap, String str, Object obj) {
    }

    public final void warn(C13AP c13ap, String str, Object obj, Object obj2) {
    }

    public final void warn(C13AP c13ap, String str, Throwable th) {
    }

    public final void warn(C13AP c13ap, String str, Object... objArr) {
    }

    public final void warn(String str) {
    }

    public final void warn(String str, Object obj) {
    }

    public final void warn(String str, Object obj, Object obj2) {
    }

    public final void warn(String str, Throwable th) {
    }

    public final void warn(String str, Object... objArr) {
    }

    @Override // X.C13AZ, X.C13AX
    public InterfaceC19966013Ac makeLoggingEventBuilder(EnumC19864512nr enumC19864512nr) {
        return new C19965813Aa();
    }
}
