package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822780xXA extends AbstractC1822720xX4 {
    public InterfaceC1822470xWf LIZJ;
    public int LJ;
    public boolean LJFF;
    public final C1822790xXB[] LIZIZ = {new C1822790xXB("PCSDMPage", 1011, 0), new C1822790xXB("PCSDMPage", 1011, 0)};
    public Map<String, String> LIZLLL = C2097608Jq.LJ();

    public final void LIZIZ() {
        InterfaceC1822460xWe interfaceC1822460xWeNN2 = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).nN2();
        C1823300xY0 c1823300xY0LIZ = interfaceC1822460xWeNN2 != null ? interfaceC1822460xWeNN2.LIZ() : null;
        this.LIZJ = c1823300xY0LIZ;
        if (c1823300xY0LIZ != null) {
            c1823300xY0LIZ.LIZ(new InterfaceC1823410xYB() { // from class: X.0xXE
                @Override // X.InterfaceC1823410xYB
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1823410xYB
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC1823410xYB
                public final void LIZ() {
                    C1822780xXA c1822780xXA = this.LIZ;
                    if (c1822780xXA.LJFF) {
                        return;
                    }
                    c1822780xXA.LJFF = true;
                    InterfaceC1823490xYJ interfaceC1823490xYJ = c1822780xXA.LIZ;
                    if (interfaceC1823490xYJ != null) {
                        interfaceC1823490xYJ.LIZ();
                    }
                    C1822780xXA c1822780xXA2 = this.LIZ;
                    c1822780xXA2.LIZIZ[c1822780xXA2.LJ].LJ(c1822780xXA2.LIZLLL);
                    C1103300eoi.LIZLLL.LIZLLL(1, "smb_viewer_dm_open_count");
                }

                @Override // X.InterfaceC1823410xYB
                public final void LIZJ() {
                    C1822780xXA c1822780xXA = this.LIZ;
                    c1822780xXA.LJFF = false;
                    int i = c1822780xXA.LJ;
                    if (i == 1) {
                        C1822790xXB c1822790xXB = c1822780xXA.LIZIZ[0];
                        if (c1822790xXB.LIZLLL != 0) {
                            c1822790xXB.LIZJ(c1822780xXA.LIZLLL);
                            return;
                        }
                    }
                    c1822780xXA.LIZIZ[i].LIZJ(c1822780xXA.LIZLLL);
                }
            });
        }
    }

    public final void LIZ(String str, boolean z, boolean z2, int i, String str2, C1822330xWR c1822330xWR) {
        boolean z3;
        Object obj;
        Object obj2;
        String str3;
        int iHashCode = 0;
        if (c1822330xWR != null) {
            z3 = c1822330xWR.LLILZ;
        } else {
            z3 = false;
        }
        Pair[] pairArr = new Pair[5];
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("is_single_sku", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_cache", obj2);
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        pairArr[2] = new Pair("schema", str3);
        if (!z3) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_anchor", str4);
        pairArr[4] = new Pair("is_service_plus_revamp", CardStruct.IStatusCode.DEFAULT);
        this.LIZLLL = C2097608Jq.LJIIIIZZ(pairArr);
        this.LJ = i;
        if (z) {
            return;
        }
        C1822790xXB c1822790xXB = this.LIZIZ[i];
        if (str != null) {
            iHashCode = str.hashCode();
        }
        c1822790xXB.LIZLLL(iHashCode, str2, this.LIZLLL);
        if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).canOpen(str)) {
            this.LIZIZ[i].LIZIZ(1001, str, this.LIZLLL);
        }
        this.LJ = i;
    }
}
