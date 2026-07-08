package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.pipo.stellar.base.card.MynaViewData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS227S0300000_18;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.card.MynaCard$renderBySchema$1$1", f = "MynaCard.kt", l = {}, m = "invokeSuspend")
public final class C1165240gQc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1165480gR0 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MynaViewData LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165240gQc(C1165480gR0 c1165480gR0, String str, MynaViewData mynaViewData, View view, InterfaceC1364105Vn<? super C1165240gQc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1165480gR0;
        this.LLILLJJLI = str;
        this.LLILLL = mynaViewData;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165240gQc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1162670gMT c1162670gMTLIZJ;
        ViewGroup viewGroup;
        C1C7U.LIZ("MynaCard@418d.renderBySchema$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ViewGroup viewGroup2 = (ViewGroup) this.LL.LLILZIL.getValue();
        if (viewGroup2 != null) {
            c1162670gMTLIZJ = C1162660gMS.LIZJ(viewGroup2, this.LLILLJJLI, new AwS227S0300000_18(this.LL, this.LLILLL, this.LLILZ, 57));
        } else {
            c1162670gMTLIZJ = null;
        }
        String data = this.LLILLL.getData();
        if (data == null) {
            data = "{}";
        }
        Map<String, Object> mapLIZIZ = C116600cO.LIZIZ(new JSONObject(data));
        if (c1162670gMTLIZJ != null) {
            C1162670gMT.LIZIZ(c1162670gMTLIZJ, mapLIZIZ);
            View viewLIZ = c1162670gMTLIZJ.LIZ();
            if (viewLIZ != null && (viewGroup = (ViewGroup) this.LL.LLILZIL.getValue()) != null) {
                viewGroup.addView(viewLIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MynaCard@418d.renderBySchema$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
