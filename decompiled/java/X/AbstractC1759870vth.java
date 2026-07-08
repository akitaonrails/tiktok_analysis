package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0vth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1759870vth<T> {
    public final Context LIZ;
    public final Map<String, Object> LIZIZ;
    public final Integer LIZJ;
    public final PdpComponent LIZLLL;
    public InterfaceC1631620sYq<? super View, ? super PdpComponentAction, ? super String, Unit> LJ;
    public Function2<? super View, ? super String, Unit> LJFF;

    public abstract View LIZ();

    public AbstractC1759870vth(Context context, Map<String, ? extends Object> map, Integer num, PdpComponent pdpComponent) {
        this.LIZ = context;
        this.LIZIZ = map;
        this.LIZJ = num;
        this.LIZLLL = pdpComponent;
    }
}
