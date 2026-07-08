package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0qrw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566580qrw {
    public final InterfaceC1566630qs1 LIZ;
    public final Map<C13IQ<? extends AbstractC1566610qrz>, InterfaceC1566430qrh<?>> LIZIZ;
    public final C599950Ng1 LIZJ;
    public final C1566680qs6 LIZLLL;
    public InterfaceC1566460qrk LJ;
    public C054G LJFF;

    public C1566580qrw(C1566420qrg c1566420qrg) {
        this.LIZ = c1566420qrg;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZIZ = linkedHashMap;
        C599950Ng1 c599950Ng1 = new C599950Ng1();
        this.LIZJ = c599950Ng1;
        this.LIZLLL = new C1566680qs6(C1697810uHb.LJIIJJI(c599950Ng1.LIZLLL, new C1566500qro().LIZJ));
        linkedHashMap.put(C13LE.LIZ(C1566620qs0.class), new C1566710qs9());
        linkedHashMap.put(C13LE.LIZ(C1566670qs5.class), new C1566760qsE());
        linkedHashMap.put(C13LE.LIZ(C1566640qs2.class), new C1566700qs8());
    }

    public final void LIZ(AbstractC1566610qrz abstractC1566610qrz, List<? extends Aweme> list) {
        int iQ0;
        Object c1566650qs3;
        int iQ02;
        int iMin;
        int i;
        C606550Nqf c606550NqfV32;
        int i2;
        DataLayerAbility dataLayerAbilityLIZLLL = this.LIZ.LIZLLL();
        if (dataLayerAbilityLIZLLL != null && !list.isEmpty()) {
            InterfaceC1566600qry interfaceC1566600qryLIZ = abstractC1566610qrz.LIZ();
            if (interfaceC1566600qryLIZ == null || (c1566650qs3 = interfaceC1566600qryLIZ.LIZJ()) == null) {
                DataLayerAbility dataLayerAbilityLIZLLL2 = this.LIZ.LIZLLL();
                if (dataLayerAbilityLIZLLL2 != null) {
                    iQ0 = dataLayerAbilityLIZLLL2.Q0();
                } else {
                    iQ0 = 0;
                }
                c1566650qs3 = new C1566650qs3(this.LIZ.LIZ() + 1, iQ0);
            }
            if (c1566650qs3 instanceof C1566650qs3) {
                C1566650qs3 c1566650qs32 = (C1566650qs3) c1566650qs3;
                iMin = c1566650qs32.LIZ;
                iQ02 = c1566650qs32.LIZIZ;
                i = 0;
            } else if (c1566650qs3 instanceof C1566660qs4) {
                iQ02 = dataLayerAbilityLIZLLL.Q0();
                C1566660qs4 c1566660qs4 = (C1566660qs4) c1566650qs3;
                iMin = Math.min(iQ02, c1566660qs4.LIZ + this.LIZ.LIZ());
                i = c1566660qs4.LIZ;
            } else {
                InterfaceC1566600qry interfaceC1566600qryLIZ2 = abstractC1566610qrz.LIZ();
                if (interfaceC1566600qryLIZ2 != null) {
                    interfaceC1566600qryLIZ2.LIZ();
                    return;
                }
                return;
            }
            C606150Nq1 c606150Nq1 = C606500Nqa.LIZLLL;
            C606500Nqa c606500NqaLIZ = C606130Npz.LIZ("auto_refresh");
            String strLIZIZ = abstractC1566610qrz.LIZIZ();
            if (c606500NqaLIZ.LIZJ == null) {
                c606500NqaLIZ.LIZJ = new HashMap();
            }
            Map<String, String> map = c606500NqaLIZ.LIZJ;
            if (map != null) {
                ((HashMap) map).put("sub_scene", strLIZIZ);
            }
            if (iMin < iQ02) {
                i2 = (iQ02 - iMin) + 1;
                c606550NqfV32 = dataLayerAbilityLIZLLL.YE0(iMin, iQ02, c606500NqaLIZ, list);
            } else {
                c606550NqfV32 = dataLayerAbilityLIZLLL.V32(list, iQ02, c606500NqaLIZ);
                i2 = 0;
            }
            if (c606550NqfV32.LIZ()) {
                InterfaceC1566600qry interfaceC1566600qryLIZ3 = abstractC1566610qrz.LIZ();
                if (interfaceC1566600qryLIZ3 != null) {
                    interfaceC1566600qryLIZ3.LIZLLL();
                }
                C20684815ws.LJFF().execute(new RunnableC514901zX(C591500NHw.LIZ(new Pair("is_success", 1), new Pair("enter_from", "homepage_hot"), new Pair("refresh_reason", abstractC1566610qrz.LIZIZ()), new Pair("video_replace_index", Integer.valueOf(i)), new Pair("video_replace_num", Integer.valueOf(i2)), new Pair("group_id", this.LIZ.LIZJ())), 13));
                return;
            }
            InterfaceC1566600qry interfaceC1566600qryLIZ4 = abstractC1566610qrz.LIZ();
            if (interfaceC1566600qryLIZ4 != null) {
                interfaceC1566600qryLIZ4.LIZ();
            }
            C1566590qrx.LIZ(abstractC1566610qrz.LIZIZ(), "replacement_failed", this.LIZ.LIZJ());
            return;
        }
        InterfaceC1566600qry interfaceC1566600qryLIZ5 = abstractC1566610qrz.LIZ();
        if (interfaceC1566600qryLIZ5 != null) {
            interfaceC1566600qryLIZ5.LIZ();
        }
        C1566590qrx.LIZ(abstractC1566610qrz.LIZIZ(), "replacement_failed", this.LIZ.LIZJ());
    }
}
