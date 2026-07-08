package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1Dcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2259861Dcm {
    public final InterfaceC2259901Dcq LIZ;
    public final Map<String, Long> LIZIZ = new LinkedHashMap();
    public final Map<String, Long> LIZJ = new LinkedHashMap();
    public final C2099008Ke<String, C2259881Dco> LIZLLL = new C2099008Ke<>(10);
    public final C2099008Ke<String, C2259891Dcp> LJ = new C2099008Ke<>(10);
    public final C2099008Ke<String, C2259911Dcr> LJFF = new C2099008Ke<>(10);
    public final Set<String> LJI = new LinkedHashSet();
    public final C01GW LJII = C452501pT.LIZIZ(new AwS579S0100000_35(this, 397));

    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LJII.getValue()).booleanValue();
    }

    public C2259861Dcm(C0XEK c0xek) {
        this.LIZ = c0xek;
    }

    public final C2259881Dco LIZIZ(String str) {
        C2259881Dco c2259881Dco = this.LIZLLL.get(str);
        if (c2259881Dco == null) {
            C2259881Dco c2259881Dco2 = new C2259881Dco(0);
            this.LIZLLL.put(str, c2259881Dco2);
            return c2259881Dco2;
        }
        return c2259881Dco;
    }

    public final C2259891Dcp LIZJ(String str) {
        C2259891Dcp c2259891Dcp = this.LJ.get(str);
        if (c2259891Dcp == null) {
            C2259891Dcp c2259891Dcp2 = new C2259891Dcp(0);
            this.LJ.put(str, c2259891Dcp2);
            return c2259891Dcp2;
        }
        return c2259891Dcp;
    }

    public final void LJFF(String str) {
        C2259891Dcp c2259891DcpRemove;
        if (!this.LJ.containsKey(str) || (c2259891DcpRemove = this.LJ.remove(str)) == null) {
            return;
        }
        this.LIZ.LJ(C2097608Jq.LJIIIIZZ(new Pair("feature_name", str), new Pair("disk_cost", Long.valueOf(c2259891DcpRemove.LIZ)), new Pair("disk_list_length", Integer.valueOf(c2259891DcpRemove.LIZIZ)), new Pair("disk_string_size", Float.valueOf(c2259891DcpRemove.LIZJ))));
    }

    public final void LJI(String str) {
        C2259881Dco c2259881DcoRemove;
        if (!this.LIZLLL.containsKey(str) || (c2259881DcoRemove = this.LIZLLL.remove(str)) == null) {
            return;
        }
        this.LIZ.LJ(C2097608Jq.LJIIIIZZ(new Pair("feature_name", str), new Pair("product_result", Integer.valueOf(c2259881DcoRemove.LIZ)), new Pair("product_cost", Long.valueOf(c2259881DcoRemove.LIZIZ)), new Pair("list_length", Integer.valueOf(c2259881DcoRemove.LIZJ)), new Pair("memory_total_size", Float.valueOf(c2259881DcoRemove.LIZLLL))));
    }

    public final void LJ(int i, String str) {
        C2259911Dcr c2259911DcrRemove;
        if (!this.LJFF.containsKey(str) || (c2259911DcrRemove = this.LJFF.remove(str)) == null) {
            return;
        }
        this.LIZ.LJ(C2097608Jq.LJIIIIZZ(new Pair("feature_name", str), new Pair("disk_deserialized_cost", Long.valueOf(c2259911DcrRemove.LIZ)), new Pair("deserialized_error_code", Integer.valueOf(i))));
    }

    public final void LJII(int i, String str) {
        LIZIZ(str).LIZJ = i;
    }

    public final void LJIIIIZZ(long j, String str) {
        LIZIZ(str).LIZIZ = j;
    }

    public final void LJIIIZ(int i, String str) {
        LIZIZ(str).LIZ = i;
    }

    public final void LJIIJ(long j, String str) {
        C2259911Dcr c2259911Dcr = this.LJFF.get(str);
        if (c2259911Dcr == null) {
            c2259911Dcr = new C2259911Dcr(0);
            this.LJFF.put(str, c2259911Dcr);
        }
        c2259911Dcr.LIZ = j;
    }
}
