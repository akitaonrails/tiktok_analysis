package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.AlertToneViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.AlertToneViewModel$loadAlertTonesSettings$1", f = "MessageNotificationToneMsgTypeFragment.kt", l = {}, m = "invokeSuspend")
public final class C891320Yxu extends C09AX implements Function2<C189200o6<? extends GetAlertToneResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AlertToneViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891320Yxu(AlertToneViewModel alertToneViewModel, InterfaceC1364105Vn<? super C891320Yxu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = alertToneViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C891320Yxu c891320Yxu = new C891320Yxu(this.LLILLJJLI, interfaceC1364105Vn);
        c891320Yxu.LL = obj;
        return c891320Yxu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlertToneViewModel@41fc.loadAlertTonesSettings$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objM10unboximpl = ((C189200o6) this.LL).m10unboximpl();
        AlertToneViewModel alertToneViewModel = this.LLILLJJLI;
        if (C189200o6.m5exceptionOrNullimpl(objM10unboximpl) == null) {
            GetAlertToneResponse getAlertToneResponse = (GetAlertToneResponse) objM10unboximpl;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadAlertTonesSettings: success, items count=");
            List<AlertToneItem> list = getAlertToneResponse.alertToneInfo;
            Integer numLJ = null;
            if (list != null) {
                numLJ = C2286608xc.LJ(list.size());
            }
            sbLIZ.append(numLJ);
            C2188811AlT.LIZIZ(sbLIZ);
            ((C13FE) alertToneViewModel.LL).setValue(new C891390Yy1(getAlertToneResponse));
            List<AlertToneItem> list2 = getAlertToneResponse.alertToneInfo;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<AlertToneItem> it2 = list2.iterator();
                while (it2.hasNext()) {
                    Iterable iterable = it2.next().alertToneValueItems;
                    if (iterable == null) {
                        iterable = C13BV.INSTANCE;
                    }
                    C19719612Di.LJJI(iterable, arrayList);
                }
                ArrayList<AlertToneValueItem> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (C866950Xzh.LIZ(((AlertToneValueItem) obj2).alertToneValueUrl)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (AlertToneValueItem alertToneValueItem : arrayList2) {
                    String str = alertToneValueItem.alertToneValueUrl;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = alertToneValueItem.alertToneValue;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    arrayList3.add(new C891250Yxn(str, str2));
                }
                if (!arrayList3.isEmpty()) {
                    IMessageAlertToneService.LIZ.getClass();
                    IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
                    if (iMessageAlertToneServiceLIZ != null) {
                        iMessageAlertToneServiceLIZ.LJIIJ(arrayList3);
                    }
                }
            }
        } else {
            ((C13FE) alertToneViewModel.LL).setValue(C891410Yy3.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AlertToneViewModel@41fc.loadAlertTonesSettings$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C189200o6<? extends GetAlertToneResponse> c189200o6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(C189200o6.m1boximpl(c189200o6.m10unboximpl()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
