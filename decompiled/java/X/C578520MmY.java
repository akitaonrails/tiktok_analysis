package X;

import com.ss.android.ugc.aweme.property.bytebench.PerformanceOptiStrategy;

/* JADX INFO: renamed from: X.0MmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578520MmY implements InterfaceC540790LIv {
    public static final /* synthetic */ C578520MmY LJIILLIIL = new C578520MmY();
    public final /* synthetic */ InterfaceC540790LIv LJIILL;

    @Override // X.InterfaceC540790LIv
    public final int getOpenAlbumOptiGroup() {
        return this.LJIILL.getOpenAlbumOptiGroup();
    }

    public C578520MmY() {
        InterfaceC540790LIv interfaceC540790LIv;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_open_performance_bytebench", true, false)) {
            C212350188e c212350188eLIZJ = C212350188e.LIZJ();
            C844470XAv.LIZ.getClass();
            C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
            if (c09gaLIZIZ == null || (interfaceC540790LIv = (InterfaceC540790LIv) c09gaLIZIZ.LJII(PerformanceOptiStrategy.class)) == null) {
                interfaceC540790LIv = new InterfaceC540790LIv() { // from class: X.0BzG
                    @Override // X.InterfaceC540790LIv
                    public final int getOpenAlbumOptiGroup() {
                        return ((Number) C306110BzF.LIZ.getValue()).intValue();
                    }
                };
            }
        } else {
            interfaceC540790LIv = new InterfaceC540790LIv() { // from class: X.0BzG
                @Override // X.InterfaceC540790LIv
                public final int getOpenAlbumOptiGroup() {
                    return ((Number) C306110BzF.LIZ.getValue()).intValue();
                }
            };
        }
        this.LJIILL = interfaceC540790LIv;
    }
}
