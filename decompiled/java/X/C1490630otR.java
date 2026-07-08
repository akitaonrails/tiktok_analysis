package X;

/* JADX INFO: renamed from: X.0otR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490630otR extends AbstractRunnableC1490650otT {
    public final Runnable LLILZ;
    public final EnumC1490640otS LLILZIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (this.LLILZ == null || this.LL.get()) {
                return;
            }
            this.LLILZ.run();
        } finally {
            if (!zLIZ) {
            }
        }
    }

    @Override // X.InterfaceC1490670otV
    public final int LIZJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1490670otV
    public final EnumC1490640otS getPriority() {
        return this.LLILZIL;
    }

    @Override // X.AbstractRunnableC1490650otT
    public final void LJFF(int i) {
        this.LLILLL = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC1490670otV interfaceC1490670otV) {
        InterfaceC1490670otV interfaceC1490670otV2 = interfaceC1490670otV;
        EnumC1490640otS enumC1490640otS = this.LLILZIL;
        EnumC1490640otS priority = interfaceC1490670otV2.getPriority();
        if (enumC1490640otS == null) {
            enumC1490640otS = EnumC1490640otS.NORMAL;
        }
        if (priority == null) {
            priority = EnumC1490640otS.NORMAL;
        }
        if (enumC1490640otS == priority) {
            return this.LLILLL - interfaceC1490670otV2.LIZJ();
        }
        return priority.ordinal() - enumC1490640otS.ordinal();
    }

    public C1490630otR(String str, EnumC1490640otS enumC1490640otS, int i, Runnable runnable) {
        this.LLILZIL = enumC1490640otS;
        C2093608Ic.LJ(str);
        this.LLILLJJLI = i;
        this.LLILZ = runnable;
    }
}
