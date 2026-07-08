package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04G0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04G0 extends C04FR implements InterfaceC1094304Pt {
    public final Map<String, EventParam> LJIIIZ;
    public final List<Map<String, EventParam>> LJIIJ;
    public Map<String, ? extends Object> LJIIJJI;
    public Object LJIIL;

    @Override // X.C04FR
    public n LJ() {
        throw null;
    }

    @Override // X.C04FR
    public String LJFF() {
        throw null;
    }

    public C04FY LJIIIIZZ() {
        throw null;
    }

    public SeaPdpHeadFeatures LJIIIZ() {
        throw null;
    }

    public Object LJIIJ() {
        throw null;
    }

    public void LJIIL(Object obj) {
        throw null;
    }

    public final <T> Object LJIIJJI(Class<?> cls) {
        if (LJIIJ() != null) {
            return LJIIJ();
        }
        if (LJ() == null) {
            return null;
        }
        LJIIL(GsonProtectorUtils.fromJson(C1280004ze.LIZJ(), (k) LJ(), (Type) cls));
        return LJIIJ();
    }

    public C04G0(String str, C04FZ c04fz, Map map, List list, n nVar, Map map2, C04CV c04cv, C04FY c04fy, SeaPdpHeadFeatures seaPdpHeadFeatures) {
        super(str, nVar, c04fz, map, list, c04cv, null);
        this.LJIIIZ = map;
        this.LJIIJ = list;
        this.LJIIJJI = map2;
        this.LJIIL = null;
    }
}
