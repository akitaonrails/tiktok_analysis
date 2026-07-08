package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.impl.MessageAlertToneService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.impl.MessageAlertToneService$refreshAlertTone$1", f = "MessageAlertToneService.kt", l = {}, m = "invokeSuspend")
public final class C891230Yxl extends C09AX implements Function2<C189200o6<? extends GetAlertToneResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MessageAlertToneService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891230Yxl(MessageAlertToneService messageAlertToneService, InterfaceC1364105Vn<? super C891230Yxl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageAlertToneService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C891230Yxl c891230Yxl = new C891230Yxl(this.LLILLJJLI, interfaceC1364105Vn);
        c891230Yxl.LL = obj;
        return c891230Yxl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageAlertToneService@8ee3.refreshAlertTone$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objM10unboximpl = ((C189200o6) this.LL).m10unboximpl();
        MessageAlertToneService messageAlertToneService = this.LLILLJJLI;
        if (C189200o6.m5exceptionOrNullimpl(objM10unboximpl) == null) {
            GetAlertToneResponse getAlertToneResponse = (GetAlertToneResponse) objM10unboximpl;
            messageAlertToneService.getClass();
            List<AlertToneItem> list = getAlertToneResponse.alertToneInfo;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<AlertToneItem> it2 = list.iterator();
                while (it2.hasNext()) {
                    Iterable iterable = it2.next().alertToneValueItems;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(iterable, arrayList);
                }
                ArrayList<AlertToneValueItem> arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (true) {
                    String str = "";
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    String str2 = ((AlertToneValueItem) next).alertToneValueUrl;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (str.length() > 0) {
                        arrayList2.add(next);
                    }
                }
                for (AlertToneValueItem alertToneValueItem : arrayList2) {
                    C20101413ky c20101413ky = (C20101413ky) messageAlertToneService.LIZIZ.getValue();
                    String str3 = alertToneValueItem.alertToneValueUrl;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = alertToneValueItem.alertToneValue;
                    if (str4 == null) {
                        str4 = "";
                    }
                    c20101413ky.LIZ(0L, str3, str4, false);
                }
            }
            if (C866950Xzh.LIZIZ(getAlertToneResponse.alertToneInfo)) {
                messageAlertToneService.LIZ().LJ();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageAlertToneService@8ee3.refreshAlertTone$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C189200o6<? extends GetAlertToneResponse> c189200o6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(C189200o6.m1boximpl(c189200o6.m10unboximpl()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
