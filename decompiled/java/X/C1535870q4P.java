package X;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535870q4P implements InterfaceC1530960pwU {
    public boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    public C1535870q4P(boolean z, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = z2;
    }

    @Override // X.InterfaceC1530960pwU
    public final boolean LIZ(C1532710pzJ c1532710pzJ, AbstractC1532350pyj<?> abstractC1532350pyj, InterfaceC1532190pyT interfaceC1532190pyT, C1532170pyR c1532170pyR, boolean z) {
        String resourceUniqueId;
        AbstractC1536120q4o abstractC1536120q4oLIZ;
        if (this.LIZIZ && !this.LIZ && C1535630q41.LJIL) {
            C1535980q4a.LIZ.getClass();
            if (interfaceC1532190pyT != null && (resourceUniqueId = interfaceC1532190pyT.getResourceUniqueId()) != null && (abstractC1536120q4oLIZ = C1536000q4c.LIZ(c1532710pzJ, "PRE", resourceUniqueId)) != null) {
                abstractC1536120q4oLIZ.LIZ = null;
                C1541070qCn<AbstractC1536120q4o, C1536070q4j> c1541070qCn = C1535980q4a.LIZIZ;
                C1535940q4W c1535940q4WLJ = c1541070qCn.LJ();
                c1535940q4WLJ.LIZJ = 60000L;
                c1541070qCn.LJFF(abstractC1536120q4oLIZ, "PRE", c1535940q4WLJ, new C1536010q4d());
                this.LIZ = true;
            }
        }
        if (!this.LIZJ) {
            return false;
        }
        if ((Intrinsics.LJFF(abstractC1532350pyj.LIZIZ, byte[].class) || Intrinsics.LJFF(abstractC1532350pyj.LIZIZ, ByteBuffer.class)) && !z) {
            return true;
        }
        return false;
    }
}
