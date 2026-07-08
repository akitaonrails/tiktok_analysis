package X;

/* JADX INFO: renamed from: X.1BC9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1BC9 implements InterfaceC1702080uOU {
    Cpu,
    Memory,
    Net,
    Storage,
    Traffic,
    Battery,
    Idle,
    Temperature,
    PowerMode,
    Fluency,
    None;

    public static C1BC9 valueOf(String str) {
        return (C1BC9) C08FF.LIZ(C1BC9.class, str);
    }
}
