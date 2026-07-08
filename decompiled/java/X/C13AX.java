package X;

/* JADX INFO: renamed from: X.13AX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public interface C13AX {
    void error(String str);

    void error(String str, Object obj);

    void error(String str, Object obj, Object obj2);

    void error(String str, Throwable th);

    String getName();

    boolean isDebugEnabled();

    boolean isEnabledForLevel(EnumC19864512nr enumC19864512nr);

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    InterfaceC19966013Ac makeLoggingEventBuilder(EnumC19864512nr enumC19864512nr);

    void trace(String str);

    void trace(String str, Object obj);

    void trace(String str, Object obj, Object obj2);

    void trace(String str, Throwable th);
}
