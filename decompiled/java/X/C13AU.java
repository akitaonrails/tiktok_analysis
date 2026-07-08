package X;

/* JADX INFO: renamed from: X.13AU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C13AU {
    public static InterfaceC19966013Ac LIZ(C13AX c13ax) {
        if (c13ax.isDebugEnabled()) {
            return c13ax.makeLoggingEventBuilder(EnumC19864512nr.DEBUG);
        }
        return C19965913Ab.LIZ;
    }

    public static InterfaceC19966013Ac LIZIZ(C13AX c13ax) {
        if (c13ax.isErrorEnabled()) {
            return c13ax.makeLoggingEventBuilder(EnumC19864512nr.ERROR);
        }
        return C19965913Ab.LIZ;
    }

    public static InterfaceC19966013Ac LIZJ(C13AX c13ax) {
        if (c13ax.isInfoEnabled()) {
            return c13ax.makeLoggingEventBuilder(EnumC19864512nr.INFO);
        }
        return C19965913Ab.LIZ;
    }

    public static InterfaceC19966013Ac LJ(C13AX c13ax) {
        if (c13ax.isTraceEnabled()) {
            return c13ax.makeLoggingEventBuilder(EnumC19864512nr.TRACE);
        }
        return C19965913Ab.LIZ;
    }

    public static InterfaceC19966013Ac LJFF(C13AX c13ax) {
        if (c13ax.isWarnEnabled()) {
            return c13ax.makeLoggingEventBuilder(EnumC19864512nr.WARN);
        }
        return C19965913Ab.LIZ;
    }

    public static InterfaceC19966013Ac LIZLLL(C13AX c13ax, EnumC19864512nr enumC19864512nr) {
        if (c13ax.isEnabledForLevel(enumC19864512nr)) {
            return c13ax.makeLoggingEventBuilder(enumC19864512nr);
        }
        return C19965913Ab.LIZ;
    }

    public static boolean LJI(C13AX c13ax, EnumC19864512nr enumC19864512nr) {
        int i = enumC19864512nr.toInt();
        if (i != 0) {
            if (i != 10) {
                if (i != 20) {
                    if (i != 30) {
                        if (i == 40) {
                            return c13ax.isErrorEnabled();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Level [");
                        sbLIZ.append(enumC19864512nr);
                        sbLIZ.append("] not recognized.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return c13ax.isWarnEnabled();
                }
                return c13ax.isInfoEnabled();
            }
            return c13ax.isDebugEnabled();
        }
        return c13ax.isTraceEnabled();
    }
}
