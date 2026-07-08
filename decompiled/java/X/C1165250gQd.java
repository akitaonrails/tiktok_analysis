package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.pipo.stellar.base.card.MynaViewData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS227S0300000_18;
import kotlin.text.Charsets;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.card.MynaCard$renderByTemplateUrl$1$2$1$1$1", f = "MynaCard.kt", l = {}, m = "invokeSuspend")
public final class C1165250gQd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ byte[] LL;
    public final /* synthetic */ C1165480gR0 LLILLJJLI;
    public final /* synthetic */ C1165480gR0 LLILLL;
    public final /* synthetic */ MynaViewData LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165250gQd(byte[] bArr, C1165480gR0 c1165480gR0, C1165480gR0 c1165480gR02, MynaViewData mynaViewData, View view, InterfaceC1364105Vn<? super C1165250gQd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bArr;
        this.LLILLJJLI = c1165480gR0;
        this.LLILLL = c1165480gR02;
        this.LLILZ = mynaViewData;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165250gQd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("MynaCard@418d.renderByTemplateUrl$1$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = new String(this.LL, Charsets.UTF_8);
        C1165480gR0 c1165480gR0 = this.LLILLJJLI;
        String string = this.LLILLL.toString();
        c1165480gR0.getClass();
        C1162640gMQ c1162640gMQLJII = C1165480gR0.LJII(str, string);
        C1165480gR0 c1165480gR02 = this.LLILLJJLI;
        MynaViewData mynaViewData = this.LLILZ;
        View view = this.LLILZIL;
        Map<String, Object> mapLIZIZ = C116600cO.LIZIZ(new JSONObject(str));
        ViewGroup viewGroup = (ViewGroup) c1165480gR02.LLILZIL.getValue();
        if (viewGroup != null) {
            C21326518d5 c21326518d5 = C1162650gMR.LIZ(viewGroup.getContext(), c1162640gMQLJII, mapLIZIZ, new AwS227S0300000_18(c1165480gR02, mynaViewData, view, 58)).LIZLLL;
            if (c21326518d5 == null) {
                c21326518d5 = null;
            }
            viewGroup.addView(c21326518d5.LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MynaCard@418d.renderByTemplateUrl$1$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
