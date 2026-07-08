package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0odi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1480880odi {
    public static final EnumC1480880odi INSTANCE;
    public static final /* synthetic */ EnumC1480880odi[] LLILZLL;
    public InterfaceC1480330ocp LL;
    public InterfaceC1480930odn LLILLJJLI;
    public InterfaceC1477260oXs LLILLL;
    public InterfaceC1480950odp LLILZ;
    public InterfaceC1480960odq LLILZIL;

    static {
        EnumC1480880odi enumC1480880odi = new EnumC1480880odi();
        INSTANCE = enumC1480880odi;
        LLILZLL = new EnumC1480880odi[]{enumC1480880odi};
    }

    public static EnumC1480880odi[] values() {
        return (EnumC1480880odi[]) LLILZLL.clone();
    }

    public InterfaceC1480930odn cacheChecker() {
        return this.LLILLJJLI;
    }

    public InterfaceC1477260oXs getBitrateManager() {
        return this.LLILLL;
    }

    public InterfaceC1480950odp getHttpsHelper() {
        return this.LLILZ;
    }

    public InterfaceC1480960odq getPlayUrlBuilder() {
        return this.LLILZIL;
    }

    public InterfaceC1480330ocp playInfoCallback() {
        return this.LL;
    }

    public static EnumC1480880odi valueOf(String str) {
        return (EnumC1480880odi) C08FF.LIZ(EnumC1480880odi.class, str);
    }

    public EnumC1480880odi setBitrateManager(InterfaceC1477260oXs interfaceC1477260oXs) {
        this.LLILLL = interfaceC1477260oXs;
        return this;
    }

    public EnumC1480880odi setCacheChecker(InterfaceC1480930odn interfaceC1480930odn) {
        this.LLILLJJLI = interfaceC1480930odn;
        return this;
    }

    public EnumC1480880odi setHttpsHelper(InterfaceC1480950odp interfaceC1480950odp) {
        this.LLILZ = interfaceC1480950odp;
        return this;
    }

    public EnumC1480880odi setPlayInfoCallback(InterfaceC1480330ocp interfaceC1480330ocp) {
        this.LL = interfaceC1480330ocp;
        return this;
    }

    public EnumC1480880odi setPlayUrlBuilder(InterfaceC1480960odq interfaceC1480960odq) {
        this.LLILZIL = interfaceC1480960odq;
        return this;
    }
}
