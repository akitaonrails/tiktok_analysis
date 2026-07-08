package X;

/* JADX INFO: renamed from: X.1EOW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1EOW {
    TypeFps(1),
    TypeFpsDrop(2),
    TypeCpu(3),
    TypeMemory(4),
    TypePower(5),
    TypePlayerBlock(6),
    TypeEvilMethod(7),
    TypeCrash(8),
    TypeInputBlock(9),
    TypeEvilMethodV2(10),
    TypeBigJank(11),
    TypeCpuException(12),
    TypeSlowLaunch(13),
    TypeHighFever(14),
    TypeBackgroundTask(15),
    TypeBlockGc(16),
    TypeBinder(17),
    TypeLock(18),
    TypeIo(19),
    TypeRunnable(20),
    TypeLaunchTask(21),
    TypeBigJankV2(24),
    TypeBackgroundTaskV2(25);

    public final int LL;

    public static C1EOW valueOf(String str) {
        return (C1EOW) C08FF.LIZ(C1EOW.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    C1EOW(int i) {
        this.LL = i;
    }
}
