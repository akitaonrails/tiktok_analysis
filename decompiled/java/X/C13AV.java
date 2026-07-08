package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.13AV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13AV implements C13AX, Serializable {
    public static final long serialVersionUID = -2529255052481744503L;

    public abstract void LIZJ(EnumC19864512nr enumC19864512nr, C13AP c13ap, Object[] objArr);

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

    @Override // X.C13AX
    public String getName() {
        return null;
    }

    @Override // X.C13AX
    public abstract /* synthetic */ boolean isDebugEnabled();

    public abstract /* synthetic */ boolean isDebugEnabled(C13AP c13ap);

    @Override // X.C13AX
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(EnumC19864512nr enumC19864512nr) {
        return C13AU.LJI(this, enumC19864512nr);
    }

    @Override // X.C13AX
    public abstract /* synthetic */ boolean isErrorEnabled();

    public abstract /* synthetic */ boolean isErrorEnabled(C13AP c13ap);

    @Override // X.C13AX
    public abstract /* synthetic */ boolean isInfoEnabled();

    public abstract /* synthetic */ boolean isInfoEnabled(C13AP c13ap);

    @Override // X.C13AX
    public abstract /* synthetic */ boolean isTraceEnabled();

    public abstract /* synthetic */ boolean isTraceEnabled(C13AP c13ap);

    @Override // X.C13AX
    public abstract /* synthetic */ boolean isWarnEnabled();

    public abstract /* synthetic */ boolean isWarnEnabled(C13AP c13ap);

    public Object readResolve() {
        return C13AD.LIZJ(getName());
    }

    public void debug(String str) {
        if (isDebugEnabled()) {
            LIZLLL(EnumC19864512nr.DEBUG, null, str, null);
        }
    }

    @Override // X.C13AX
    public void error(String str) {
        if (isErrorEnabled()) {
            LIZLLL(EnumC19864512nr.ERROR, null, str, null);
        }
    }

    public void info(String str) {
        if (isInfoEnabled()) {
            LIZLLL(EnumC19864512nr.INFO, null, str, null);
        }
    }

    @Override // X.C13AX
    public InterfaceC19966013Ac makeLoggingEventBuilder(EnumC19864512nr enumC19864512nr) {
        return new C19965813Aa();
    }

    @Override // X.C13AX
    public void trace(String str) {
        if (isTraceEnabled()) {
            LIZLLL(EnumC19864512nr.TRACE, null, str, null);
        }
    }

    public void warn(String str) {
        if (isWarnEnabled()) {
            LIZLLL(EnumC19864512nr.WARN, null, str, null);
        }
    }

    public void debug(C13AP c13ap, String str) {
        if (isDebugEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.DEBUG, c13ap, str, null);
        }
    }

    public void error(C13AP c13ap, String str) {
        if (isErrorEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.ERROR, c13ap, str, null);
        }
    }

    public void info(C13AP c13ap, String str) {
        if (isInfoEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.INFO, c13ap, str, null);
        }
    }

    public void trace(C13AP c13ap, String str) {
        if (isTraceEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.TRACE, c13ap, str, null);
        }
    }

    public void warn(C13AP c13ap, String str) {
        if (isWarnEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.WARN, c13ap, str, null);
        }
    }

    public void debug(String str, Object obj) {
        if (isDebugEnabled()) {
            LJ(EnumC19864512nr.DEBUG, null, str, obj);
        }
    }

    @Override // X.C13AX
    public void error(String str, Object obj) {
        if (isErrorEnabled()) {
            LJ(EnumC19864512nr.ERROR, null, str, obj);
        }
    }

    public void info(String str, Object obj) {
        if (isInfoEnabled()) {
            LJ(EnumC19864512nr.INFO, null, str, obj);
        }
    }

    @Override // X.C13AX
    public void trace(String str, Object obj) {
        if (isTraceEnabled()) {
            LJ(EnumC19864512nr.TRACE, null, str, obj);
        }
    }

    public void warn(String str, Object obj) {
        if (isWarnEnabled()) {
            LJ(EnumC19864512nr.WARN, null, str, obj);
        }
    }

    public void debug(String str, Throwable th) {
        if (isDebugEnabled()) {
            LIZLLL(EnumC19864512nr.DEBUG, null, str, th);
        }
    }

    @Override // X.C13AX
    public void error(String str, Throwable th) {
        if (isErrorEnabled()) {
            LIZLLL(EnumC19864512nr.ERROR, null, str, th);
        }
    }

    public void info(String str, Throwable th) {
        if (isInfoEnabled()) {
            LIZLLL(EnumC19864512nr.INFO, null, str, th);
        }
    }

    @Override // X.C13AX
    public void trace(String str, Throwable th) {
        if (isTraceEnabled()) {
            LIZLLL(EnumC19864512nr.TRACE, null, str, th);
        }
    }

    public void warn(String str, Throwable th) {
        if (isWarnEnabled()) {
            LIZLLL(EnumC19864512nr.WARN, null, str, th);
        }
    }

    public void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            LIZIZ(EnumC19864512nr.DEBUG, null, str, objArr);
        }
    }

    public void error(String str, Object... objArr) {
        if (isErrorEnabled()) {
            LIZIZ(EnumC19864512nr.ERROR, null, str, objArr);
        }
    }

    public void info(String str, Object... objArr) {
        if (isInfoEnabled()) {
            LIZIZ(EnumC19864512nr.INFO, null, str, objArr);
        }
    }

    public void trace(String str, Object... objArr) {
        if (isTraceEnabled()) {
            LIZIZ(EnumC19864512nr.TRACE, null, str, objArr);
        }
    }

    public void warn(String str, Object... objArr) {
        if (isWarnEnabled()) {
            LIZIZ(EnumC19864512nr.WARN, null, str, objArr);
        }
    }

    public void debug(String str, Object obj, Object obj2) {
        if (isDebugEnabled()) {
            LIZ(EnumC19864512nr.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // X.C13AX
    public void error(String str, Object obj, Object obj2) {
        if (isErrorEnabled()) {
            LIZ(EnumC19864512nr.ERROR, null, str, obj, obj2);
        }
    }

    public void info(String str, Object obj, Object obj2) {
        if (isInfoEnabled()) {
            LIZ(EnumC19864512nr.INFO, null, str, obj, obj2);
        }
    }

    @Override // X.C13AX
    public void trace(String str, Object obj, Object obj2) {
        if (isTraceEnabled()) {
            LIZ(EnumC19864512nr.TRACE, null, str, obj, obj2);
        }
    }

    public void warn(String str, Object obj, Object obj2) {
        if (isWarnEnabled()) {
            LIZ(EnumC19864512nr.WARN, null, str, obj, obj2);
        }
    }

    public void debug(C13AP c13ap, String str, Object obj) {
        if (isDebugEnabled(c13ap)) {
            LJ(EnumC19864512nr.DEBUG, c13ap, str, obj);
        }
    }

    public void error(C13AP c13ap, String str, Object obj) {
        if (isErrorEnabled(c13ap)) {
            LJ(EnumC19864512nr.ERROR, c13ap, str, obj);
        }
    }

    public void info(C13AP c13ap, String str, Object obj) {
        if (isInfoEnabled(c13ap)) {
            LJ(EnumC19864512nr.INFO, c13ap, str, obj);
        }
    }

    public void trace(C13AP c13ap, String str, Object obj) {
        if (isTraceEnabled(c13ap)) {
            LJ(EnumC19864512nr.TRACE, c13ap, str, obj);
        }
    }

    public void warn(C13AP c13ap, String str, Object obj) {
        if (isWarnEnabled(c13ap)) {
            LJ(EnumC19864512nr.WARN, c13ap, str, obj);
        }
    }

    public void debug(C13AP c13ap, String str, Throwable th) {
        if (isDebugEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.DEBUG, c13ap, str, th);
        }
    }

    public void error(C13AP c13ap, String str, Throwable th) {
        if (isErrorEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.ERROR, c13ap, str, th);
        }
    }

    public void info(C13AP c13ap, String str, Throwable th) {
        if (isInfoEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.INFO, c13ap, str, th);
        }
    }

    public void trace(C13AP c13ap, String str, Throwable th) {
        if (isTraceEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.TRACE, c13ap, str, th);
        }
    }

    public void warn(C13AP c13ap, String str, Throwable th) {
        if (isWarnEnabled(c13ap)) {
            LIZLLL(EnumC19864512nr.WARN, c13ap, str, th);
        }
    }

    public void debug(C13AP c13ap, String str, Object... objArr) {
        if (isDebugEnabled(c13ap)) {
            LIZIZ(EnumC19864512nr.DEBUG, c13ap, str, objArr);
        }
    }

    public void error(C13AP c13ap, String str, Object... objArr) {
        if (isErrorEnabled(c13ap)) {
            LIZIZ(EnumC19864512nr.ERROR, c13ap, str, objArr);
        }
    }

    public void info(C13AP c13ap, String str, Object... objArr) {
        if (isInfoEnabled(c13ap)) {
            LIZIZ(EnumC19864512nr.INFO, c13ap, str, objArr);
        }
    }

    public void trace(C13AP c13ap, String str, Object... objArr) {
        if (isTraceEnabled(c13ap)) {
            LIZIZ(EnumC19864512nr.TRACE, c13ap, str, objArr);
        }
    }

    public void warn(C13AP c13ap, String str, Object... objArr) {
        if (isWarnEnabled(c13ap)) {
            LIZIZ(EnumC19864512nr.WARN, c13ap, str, objArr);
        }
    }

    public final void LIZIZ(EnumC19864512nr enumC19864512nr, C13AP c13ap, String str, Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if ((obj instanceof Throwable) && obj != null) {
                if (objArr != null && objArr.length != 0) {
                    int length = objArr.length - 1;
                    Object[] objArr2 = new Object[length];
                    if (length > 0) {
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                    }
                    LIZJ(enumC19864512nr, c13ap, objArr2);
                    return;
                }
                throw new IllegalStateException("non-sensical empty or null argument array");
            }
        }
        LIZJ(enumC19864512nr, c13ap, objArr);
    }

    public final void LIZLLL(EnumC19864512nr enumC19864512nr, C13AP c13ap, String str, Throwable th) {
        LIZJ(enumC19864512nr, c13ap, null);
    }

    public final void LJ(EnumC19864512nr enumC19864512nr, C13AP c13ap, String str, Object obj) {
        LIZJ(enumC19864512nr, c13ap, new Object[]{obj});
    }

    public void debug(C13AP c13ap, String str, Object obj, Object obj2) {
        if (isDebugEnabled(c13ap)) {
            LIZ(EnumC19864512nr.DEBUG, c13ap, str, obj, obj2);
        }
    }

    public void error(C13AP c13ap, String str, Object obj, Object obj2) {
        if (isErrorEnabled(c13ap)) {
            LIZ(EnumC19864512nr.ERROR, c13ap, str, obj, obj2);
        }
    }

    public void info(C13AP c13ap, String str, Object obj, Object obj2) {
        if (isInfoEnabled(c13ap)) {
            LIZ(EnumC19864512nr.INFO, c13ap, str, obj, obj2);
        }
    }

    public void trace(C13AP c13ap, String str, Object obj, Object obj2) {
        if (isTraceEnabled(c13ap)) {
            LIZ(EnumC19864512nr.TRACE, c13ap, str, obj, obj2);
        }
    }

    public void warn(C13AP c13ap, String str, Object obj, Object obj2) {
        if (isWarnEnabled(c13ap)) {
            LIZ(EnumC19864512nr.WARN, c13ap, str, obj, obj2);
        }
    }

    public final void LIZ(EnumC19864512nr enumC19864512nr, C13AP c13ap, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            LIZJ(enumC19864512nr, c13ap, new Object[]{obj});
        } else {
            LIZJ(enumC19864512nr, c13ap, new Object[]{obj, obj2});
        }
    }
}
