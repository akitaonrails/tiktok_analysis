package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;

/* JADX INFO: renamed from: X.0bBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963880bBq extends AbstractC986340bm4 {
    public final IInteractService LIZ;
    public final IMultiHostService LIZIZ;
    public final InterfaceC954310awP LIZJ;

    @Override // X.AbstractC986340bm4
    public final boolean LIZ() {
        boolean z = this.LIZIZ.Uh() == 3;
        InterfaceC954310awP interfaceC954310awP = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInCoHostWithGuest=");
        sbLIZ.append(z);
        interfaceC954310awP.d("TeamPairPreCheck", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    @Override // X.AbstractC986340bm4
    public final boolean LIZIZ() {
        boolean zKB = this.LIZ.kB();
        InterfaceC954310awP interfaceC954310awP = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isInQuickCoHostProcess=");
        sbLIZ.append(zKB);
        interfaceC954310awP.d("TeamPairPreCheck", C2188811AlT.LIZIZ(sbLIZ));
        return zKB;
    }

    @Override // X.AbstractC986340bm4
    public final boolean LIZJ() {
        EnumC950120ape enumC950120apeLLI = this.LIZIZ.LLI();
        InterfaceC954310awP interfaceC954310awP = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coHostState=");
        sbLIZ.append(enumC950120apeLLI);
        interfaceC954310awP.d("TeamPairPreCheck", C2188811AlT.LIZIZ(sbLIZ));
        return enumC950120apeLLI.isInConnectingProcess();
    }

    @Override // X.AbstractC986340bm4
    public final boolean LIZLLL() {
        int size = this.LIZIZ.LJIJJ().size();
        InterfaceC954310awP interfaceC954310awP = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("numCoHostUser=");
        sbLIZ.append(size);
        interfaceC954310awP.d("TeamPairPreCheck", C2188811AlT.LIZIZ(sbLIZ));
        return size == 2;
    }

    public C963880bBq(IInteractService iInteractService, IMultiHostService iMultiHostService) {
        C0TW8 c0tw8 = C0TW8.LIZ;
        this.LIZ = iInteractService;
        this.LIZIZ = iMultiHostService;
        this.LIZJ = c0tw8;
    }
}
