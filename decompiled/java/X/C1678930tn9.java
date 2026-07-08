package X;

/* JADX INFO: renamed from: X.0tn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678930tn9 extends C09AY implements InterfaceC1631620sYq<EnumC1677000tk2, InterfaceC1680500tpg, Integer, C1685910tyP> {
    public final /* synthetic */ InterfaceC1679000tnG LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0NV4 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678930tn9(int i, int i2, C0NV4 c0nv4, InterfaceC1679000tnG interfaceC1679000tnG, boolean z, boolean z2) {
        super(3);
        this.LL = interfaceC1679000tnG;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c0nv4;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // X.InterfaceC1631620sYq
    public final C1685910tyP invoke(EnumC1677000tk2 enumC1677000tk2, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        num.intValue();
        interfaceC1680500tpg2.LJJIJIIJIL(697243846);
        InterfaceC1679000tnG interfaceC1679000tnG = this.LL;
        boolean z2 = this.LLILLJJLI;
        if (enumC1677000tk2 == EnumC1677000tk2.UnfocusedEmpty) {
            z = false;
        } else {
            z = this.LLILLL;
        }
        C0NV4 c0nv4 = this.LLILZ;
        int i = (this.LLILZIL >> 27) & 14;
        int i2 = this.LLILZLL;
        long j = ((C1685910tyP) interfaceC1679000tnG.LIZJ(z2, z, c0nv4, interfaceC1680500tpg2, i | ((i2 << 3) & 896) | (i2 & 7168)).getValue()).LIZ;
        interfaceC1680500tpg2.LJJIJLIJ();
        return new C1685910tyP(j);
    }
}
