package X;

/* JADX INFO: renamed from: X.09O0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C09O0 {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME("java.home"),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR("java.io.tmpdir"),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");

    public final String LL;

    public String value() {
        return System.getProperty(this.LL);
    }

    @Override // java.lang.Enum
    public String toString() {
        String strKey = key();
        String strValue = value();
        StringBuilder sb = new StringBuilder(String.valueOf(strKey).length() + 1 + String.valueOf(strValue).length());
        sb.append(strKey);
        sb.append("=");
        sb.append(strValue);
        return sb.toString();
    }

    public String key() {
        return this.LL;
    }

    public static C09O0 valueOf(String str) {
        return (C09O0) C08FF.LIZ(C09O0.class, str);
    }

    C09O0(String str) {
        this.LL = str;
    }
}
