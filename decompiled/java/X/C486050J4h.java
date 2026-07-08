package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0J4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486050J4h implements C0IOU {
    public static final /* synthetic */ int LIZLLL = 0;
    public List<EnterRoomConfig> LIZ;
    public InterfaceC486070J4j LIZIZ;
    public String LIZJ;

    @Override // X.C0IOU
    public final boolean LJIIJJI() {
        InterfaceC486070J4j interfaceC486070J4j = this.LIZIZ;
        return interfaceC486070J4j != null && interfaceC486070J4j.LJIIJJI();
    }

    @Override // X.C0IOU
    public final void release() {
        C20441214yg.LJIIIZ("LiveWatcherUtils", "SearchComponentProxy release");
        this.LIZIZ = null;
        C485980J4a c485980J4a = C475420Ike.LIZ;
        C19719512Dh.LIZJ(c485980J4a.LIZ).remove(this.LIZJ);
    }

    @Override // X.C0IOU
    public final List<EnterRoomConfig> LJIILJJIL() {
        return this.LIZ;
    }

    @Override // X.C0IOU
    public final void LJIIL(long j) {
        InterfaceC486070J4j interfaceC486070J4j = this.LIZIZ;
        if (interfaceC486070J4j != null) {
            interfaceC486070J4j.LJIIL(j);
        }
    }

    @Override // X.C0IOU
    public final void LJIILIIL(long j) {
        InterfaceC486070J4j interfaceC486070J4j = this.LIZIZ;
        if (interfaceC486070J4j != null) {
            interfaceC486070J4j.LJIILIIL(j);
        }
    }

    @Override // X.C0IOU
    public final void LJIILLIIL(Map<String, String> map) {
        InterfaceC486070J4j interfaceC486070J4j = this.LIZIZ;
        if (interfaceC486070J4j != null) {
            interfaceC486070J4j.LIZ(map);
        }
    }

    @Override // X.C0IOU
    public final void LJIILL(int i, C0IOT c0iot) {
        InterfaceC486070J4j interfaceC486070J4j = this.LIZIZ;
        if (interfaceC486070J4j != null) {
            interfaceC486070J4j.LIZIZ(new C486040J4g(this, c0iot));
        }
    }
}
