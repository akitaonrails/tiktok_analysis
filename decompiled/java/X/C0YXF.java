package X;

import X.C0NZB;
import com.bytedance.tts.pigeon.GECPigeon;

/* JADX INFO: renamed from: X.0YXF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YXF<COMPONENT_API extends C0NZB> implements C01GW<COMPONENT_API> {
    public final GECPigeon LL;
    public final C13IQ<? extends COMPONENT_API> LLILLJJLI;
    public COMPONENT_API LLILLL;
    public boolean LLILZ;

    @Override // X.C01GW
    public final Object getValue() {
        if (!this.LLILZ) {
            this.LLILLL = (COMPONENT_API) C0YXD.LIZLLL(this.LL, this.LLILLJJLI);
            this.LLILZ = true;
        }
        return this.LLILLL;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILZ;
    }

    public C0YXF(GECPigeon gECPigeon, C19719912Dl c19719912Dl) {
        this.LL = gECPigeon;
        this.LLILLJJLI = c19719912Dl;
    }
}
