package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Vps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C809900Vps {
    public final long LIZ;
    public final List<InterfaceC596980NbE> LIZIZ = new ArrayList();
    public final List<InterfaceC1525710po1> LIZJ = new ArrayList();

    public final C809910Vpt LIZ() {
        if (this.LIZ >= 0) {
            return new C809910Vpt(this);
        }
        throw new IllegalArgumentException("bizId < 0");
    }

    public C809900Vps(long j) {
        this.LIZ = j;
    }
}
