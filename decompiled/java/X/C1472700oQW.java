package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0oQW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472700oQW extends C1469760oLm {
    public String LLILLL;
    public String LLILZ;

    public C1472700oQW(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIIJZLJL(Map<String, Object> map) {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        if (map.get("sub_tag") instanceof String) {
            this.LLILLL = (String) map.get("sub_tag");
        }
        ((Boolean) map.get("prepare_only")).booleanValue();
        this.LLILLJJLI.getSourceId();
        C1475150oUT.LIZLLL();
        if (((Boolean) C1474810oTv.LLJIJIL.getValue()).booleanValue()) {
            player.LIZ.LLLLZLLIL = new C1472710oQX(this);
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIL(boolean z) {
        C1472150oPd player;
        InterfaceC1471960oPK interfaceC1471960oPK = this.LLILLJJLI;
        if (interfaceC1471960oPK == null || (player = interfaceC1471960oPK.getPlayer()) == null) {
            return;
        }
        player.LIZ.LLLLZLLIL = null;
    }
}
