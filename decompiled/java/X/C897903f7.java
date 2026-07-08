package X;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03f7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.BindHelper$Companion$showErrorDialog$1", f = "BindHelper.kt", l = {}, m = "invokeSuspend")
public final class C897903f7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897903f7(Context context, String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C897903f7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897903f7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BindHelper$Companion@7354.showErrorDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJI(C890303dt.LIZ().get("dialog_title"));
        c1397580mTM.LIZIZ(this.LLILLJJLI);
        C985403tE.LIZ(c1397580mTM, new AwS580S0100000_1(this.LLILLL, (Function0<Unit>) 167));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        C888603dc c888603dc = C888603dc.LIZ;
        String str2 = this.LLILLJJLI;
        c888603dc.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        linkedHashMap.put("error_code", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("error_message", str2);
        linkedHashMap.put("popup_name", "ccdc_bind_error");
        C1018703yb.LIZIZ("tiktokec_popup_show", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BindHelper$Companion@7354.showErrorDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
