package X;

import com.ss.android.ugc.aweme.setting.performance.videoquality.Bytevc1EncodeStrategy;

/* JADX INFO: renamed from: X.1400, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1400 implements InterfaceC20194513zz {
    public static final /* synthetic */ AnonymousClass1400 LJIILLIIL = new AnonymousClass1400();
    public final /* synthetic */ InterfaceC20194513zz LJIILL;

    @Override // X.InterfaceC20194513zz
    public final int getMinSpeedForUsingBytevc1() {
        return this.LJIILL.getMinSpeedForUsingBytevc1();
    }

    @Override // X.InterfaceC20194513zz
    public final boolean isEnableBytevc1enc8Plugin() {
        return this.LJIILL.isEnableBytevc1enc8Plugin();
    }

    public AnonymousClass1400() {
        InterfaceC20194513zz interfaceC20194513zz;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        this.LJIILL = (c09gaLIZIZ == null || (interfaceC20194513zz = (InterfaceC20194513zz) c09gaLIZIZ.LJII(Bytevc1EncodeStrategy.class)) == null) ? new InterfaceC20194513zz() { // from class: X.1401
            @Override // X.InterfaceC20194513zz
            public final int getMinSpeedForUsingBytevc1() {
                return -1;
            }

            @Override // X.InterfaceC20194513zz
            public final boolean isEnableBytevc1enc8Plugin() {
                return false;
            }

            static {
                C201955140j.LIZ("Bytevc1EncodeBenchApi -> use DefaultApi");
            }
        } : interfaceC20194513zz;
    }
}
