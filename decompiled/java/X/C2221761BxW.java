package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;

/* JADX INFO: renamed from: X.1BxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221761BxW {
    public final EnumC19379710rr LIZ;
    public final C2221811Bxb LIZIZ;

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wss://");
        sbLIZ.append(((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostWebSocketDomain());
        sbLIZ.append(this.LIZ == EnumC19379710rr.PREVIEW ? "/webcast/im/ws_proxy/from_preview/" : "/webcast/im/ws_proxy/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2221761BxW(EnumC19379710rr enumC19379710rr, C2221811Bxb c2221811Bxb) {
        this.LIZ = enumC19379710rr;
        this.LIZIZ = c2221811Bxb;
    }
}
