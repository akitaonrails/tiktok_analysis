package X;

import Y.ARunnableS85S0200000_16;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0dnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064370dnv implements InterfaceC1010530cP5 {
    public final InterfaceC1064380dnw LL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final void LIZ() {
        if (C1019110ccv.LIZIZ.LIZIZ()) {
            HashMap map = new HashMap();
            InterfaceC1064380dnw interfaceC1064380dnw = this.LL;
            map.put("ad_id", String.valueOf(interfaceC1064380dnw.getAdId()));
            map.put("creative_id", String.valueOf(interfaceC1064380dnw.getCreativeId()));
            String logExtra = this.LL.getLogExtra();
            if (logExtra != null) {
                map.put("log_extra", logExtra);
            }
            String roomId = this.LL.getRoomId();
            if (roomId != null) {
                map.put("room_id", roomId);
            }
            C0XDN.LIZJ(map, true);
            C823050WQl.LIZIZ().execute(new ARunnableS85S0200000_16(this, map, 80));
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C1064370dnv(InterfaceC1064430do1 interfaceC1064430do1) {
        this.LL = interfaceC1064430do1;
    }
}
