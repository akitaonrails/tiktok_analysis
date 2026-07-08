package X;

import X.AbstractC1066304Ez;
import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w10, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1764400w10<VO extends AbstractC1066304Ez> extends AbstractC1764440w14 {
    public VO LLILZ;
    public C04FN LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public C04CN LLJ;

    public void LJIIJ() {
        LJII();
        this.LLILLL = true;
        C04CN c04cn = this.LLJ;
        if (c04cn != null) {
            c04cn.LJIIJ();
        }
        this.LLILLL = true;
    }

    public final C04FN LJ() {
        return this.LLILZIL;
    }

    public AbstractC1764400w10(InterfaceC665370Q7z interfaceC665370Q7z, VO vo, C04FN c04fn) {
        super(interfaceC665370Q7z);
        this.LLILZ = vo;
        this.LLILZIL = c04fn;
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1265));
        this.LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1264));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1263));
    }

    @Override // X.AbstractC1764440w14
    public final boolean LJIIIIZZ(String str, List list, Boolean bool, Map map) {
        C04FZ c04fz;
        Map<String, GodaV2EventGroup> map2;
        SeaGodaManagerV2 seaGodaManagerV2;
        C04FH c04fh;
        InterfaceC1067904Fp interfaceC1067904Fp;
        if (((Intrinsics.LJFF(str, "module_show") || Intrinsics.LJFF(str, "module_show_over")) && ((c04fz = this.LLILZIL.LJIIJ) == null || (map2 = c04fz.LIZ) == null || map2.get(str) == null)) || (seaGodaManagerV2 = (SeaGodaManagerV2) this.LLIZLLLIL.getValue()) == null || (c04fh = seaGodaManagerV2.LLILLJJLI) == null || (interfaceC1067904Fp = c04fh.LJ) == null) {
            return false;
        }
        return interfaceC1067904Fp.LIZLLL(str, this.LLILZIL, list, map, bool);
    }
}
