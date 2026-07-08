package X;

import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ReU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700920ReU extends C09AY implements InterfaceC1631620sYq<String, C698680Ras, C699980Rcy, Boolean> {
    public final /* synthetic */ C701360RfC LL;
    public final /* synthetic */ C701860Rg0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700920ReU(C701360RfC c701360RfC, C701860Rg0 c701860Rg0) {
        super(3);
        this.LL = c701360RfC;
        this.LLILLJJLI = c701860Rg0;
    }

    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(String str, C698680Ras c698680Ras, C699980Rcy c699980Rcy) {
        Map<String, Object> map;
        boolean zLJIIJ;
        Map<String, Map<String, Object>> map2;
        String str2 = str;
        C698680Ras c698680Ras2 = c698680Ras;
        C699980Rcy c699980Rcy2 = c699980Rcy;
        ClientStandardModel clientStandardModelKn = this.LL.LLILLJJLI.getContext().LJFF.kn(this.LL.LL);
        if (c698680Ras2 == null) {
            new AwS160S1100000_11(str2, this.LL, 4);
            C0T6L.LIZLLL();
            if (c699980Rcy2 != null) {
                c699980Rcy2.LJ = Boolean.TRUE;
            }
            zLJIIJ = true;
        } else {
            C704840Rko c704840Rko = this.LL.LLIZLLLIL.LJ;
            synchronized (c704840Rko) {
                c704840Rko.LJIIJ = c698680Ras2;
            }
            Iterator it2 = ((LinkedHashMap) this.LL.LLIZLLLIL.LJII).entrySet().iterator();
            while (it2.hasNext()) {
                ((C704830Rkn) ((Map.Entry) it2.next()).getValue()).LJ.LIZ(c698680Ras2);
            }
            new AwS127S1200000_11(str2, c698680Ras2, this.LL, 5);
            C0T6L.LIZLLL();
            this.LL.LLJJ.LJLI();
            Object obj = null;
            if (clientStandardModelKn != null && (map2 = clientStandardModelKn.componentsCustomInfoMap) != null) {
                map = map2.get(str2);
            } else {
                map = null;
            }
            if (map != null) {
                obj = map.get("fcp_signal_source");
            }
            if ((obj == null && Intrinsics.LJFF(c698680Ras2.LIZJ, "outreach")) || Intrinsics.LJFF(obj, c698680Ras2.LIZJ)) {
                zLJIIJ = this.LL.LJIIJ(this.LLILLJJLI, clientStandardModelKn, str2, c698680Ras2, c699980Rcy2);
            } else {
                zLJIIJ = false;
            }
        }
        return Boolean.valueOf(zLJIIJ);
    }
}
