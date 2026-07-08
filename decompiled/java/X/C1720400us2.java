package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.NavbarActionDO;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0us2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720400us2 extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ List<NavbarActionDO> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ StellarFragment LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720400us2(List<NavbarActionDO> list, int i, StellarFragment stellarFragment, Map<String, String> map) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = stellarFragment;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        NavbarActionDO navbarActionDO;
        boolean z;
        Boolean boolValueOf;
        ImageDO imageDO;
        BaseWidgetDO baseWidgetDO;
        List<NavbarActionDO> list = this.LL;
        if (list != null && (navbarActionDO = (NavbarActionDO) ListProtector.get(list, this.LLILLJJLI)) != null) {
            if (navbarActionDO.replaceIcons != null) {
                z = true;
            } else {
                z = false;
            }
            String objId = null;
            if (z) {
                boolValueOf = Boolean.valueOf(navbarActionDO.LIZ);
            } else {
                boolValueOf = null;
            }
            String objId2 = navbarActionDO.id;
            if (objId2 == null && ((imageDO = navbarActionDO.icon) == null || (objId2 = imageDO.getObjId()) == null)) {
                List<ImageDO> list2 = navbarActionDO.replaceIcons;
                if (list2 != null && (baseWidgetDO = (BaseWidgetDO) C13LP.LJJJLL(list2)) != null) {
                    objId = baseWidgetDO.getObjId();
                }
            } else {
                objId = objId2;
            }
            this.LLILLL.SR().DQ2(boolValueOf, objId, this.LLILZ);
        }
        return Unit.LIZ;
    }
}
