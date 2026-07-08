package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0cxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031780cxM implements InterfaceC1024990cmP {
    public final InterfaceC1031820cxQ LIZ;

    @Override // X.InterfaceC1024990cmP
    public final InterfaceC1025000cmQ LIZ() {
        return new InterfaceC1025000cmQ() { // from class: X.0cxL
            @Override // X.InterfaceC1025000cmQ
            public final Video LIZ() {
                return this.LIZ.LIZ.LJI().LIZIZ();
            }

            @Override // X.InterfaceC1025000cmQ
            public final AwemeRawAd LIZIZ() {
                return this.LIZ.LIZ.LJI().LIZ();
            }
        };
    }

    @Override // X.InterfaceC1024990cmP
    public final InterfaceC1025030cmT LIZIZ() {
        return new InterfaceC1025030cmT() { // from class: X.0cxO
            @Override // X.InterfaceC1025030cmT
            public final void LIZ(String str) {
                this.LIZ.LIZ.getEventTracker().LIZ(str);
            }
        };
    }

    @Override // X.InterfaceC1024990cmP
    public final InterfaceC1025010cmR LIZJ() {
        return new InterfaceC1025010cmR() { // from class: X.0cxN
            @Override // X.InterfaceC1025010cmR
            public final long getVideoLength() {
                return this.LIZ.LIZ.getPlayer().LIZ();
            }

            @Override // X.InterfaceC1025010cmR
            public final void reset() {
                this.LIZ.LIZ.getPlayer().LIZJ();
            }

            @Override // X.InterfaceC1025010cmR
            public final void LIZ(C988290bpD c988290bpD) {
                this.LIZ.LIZ.getPlayer().LIZIZ(c988290bpD);
            }
        };
    }

    public C1031780cxM(C1031750cxJ c1031750cxJ) {
        this.LIZ = c1031750cxJ;
    }
}
