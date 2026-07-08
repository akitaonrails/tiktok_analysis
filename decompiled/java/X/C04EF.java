package X;

import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04EF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C04EF extends AbstractC1764440w14 {
    public final C04FM LLILZ;

    public C04EF(InterfaceC665370Q7z interfaceC665370Q7z, C04FM c04fm) {
        super(interfaceC665370Q7z);
        this.LLILZ = c04fm;
    }

    @Override // X.AbstractC1764440w14
    public final boolean LJIIIIZZ(String str, List list, Boolean bool, Map map) {
        C04FZ c04fz;
        Map<String, GodaV2EventGroup> map2;
        SeaGodaManagerV2 seaGodaManagerV2;
        C04FH c04fh;
        InterfaceC1067904Fp interfaceC1067904Fp;
        if (((Intrinsics.LJFF(str, "module_show") || Intrinsics.LJFF(str, "module_show_over")) && ((c04fz = this.LLILZ.LJIIJ) == null || (map2 = c04fz.LIZ) == null || map2.get(str) == null)) || (seaGodaManagerV2 = (SeaGodaManagerV2) this.LLILLJJLI.getValue()) == null || (c04fh = seaGodaManagerV2.LLILLJJLI) == null || (interfaceC1067904Fp = c04fh.LJ) == null) {
            return false;
        }
        return interfaceC1067904Fp.LIZLLL(str, this.LLILZ, list, map, bool);
    }
}
