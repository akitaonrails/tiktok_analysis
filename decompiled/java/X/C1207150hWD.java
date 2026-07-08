package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0hWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207150hWD implements InterfaceC1207170hWF {
    public final /* synthetic */ C20656615sK LIZ;
    public final /* synthetic */ C1207520hWo LIZIZ;
    public final /* synthetic */ C1206950hVt LIZJ;
    public final /* synthetic */ AtomicBoolean LIZLLL;
    public final /* synthetic */ InterfaceC1207170hWF LJ;

    @Override // X.InterfaceC1207170hWF
    public final void LIZ(C1208240hXy c1208240hXy) {
        String str;
        String str2;
        InterfaceC1207170hWF interfaceC1207170hWF = this.LJ;
        if (interfaceC1207170hWF != null) {
            interfaceC1207170hWF.LIZ(c1208240hXy);
        }
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        C1207520hWo c1207520hWo = this.LIZIZ;
        String str3 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
            str3 = c1207520hWo.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        c1207120hWA.getClass();
        C1207120hWA.LIZIZ(str, str2, str3);
    }

    @Override // X.InterfaceC1207170hWF
    public final void LIZIZ(C1208000hXa c1208000hXa) {
        boolean z;
        String str;
        String str2;
        C1206950hVt.LJJIL(this.LIZLLL, this.LJ, c1208000hXa);
        this.LIZ.LIZ();
        if (c1208000hXa.LIZ == EnumC1207930hXT.Granted) {
            z = true;
        } else {
            z = false;
        }
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        C1207520hWo c1207520hWo = this.LIZIZ;
        String str3 = null;
        if (c1207520hWo != null) {
            str3 = c1207520hWo.LIZ;
            str = c1207520hWo.LIZIZ;
            str2 = c1207520hWo.LIZLLL;
        } else {
            str = null;
            str2 = null;
        }
        boolean zLJJIJ = this.LIZJ.LJJIJ();
        c1207120hWA.getClass();
        C1207120hWA.LIZ(str3, str, str2, true, z, zLJJIJ);
    }

    public C1207150hWD(C20656615sK c20656615sK, C1207520hWo c1207520hWo, C1206950hVt c1206950hVt, AtomicBoolean atomicBoolean, InterfaceC1207170hWF interfaceC1207170hWF) {
        this.LIZ = c20656615sK;
        this.LIZIZ = c1207520hWo;
        this.LIZJ = c1206950hVt;
        this.LIZLLL = atomicBoolean;
        this.LJ = interfaceC1207170hWF;
    }
}
