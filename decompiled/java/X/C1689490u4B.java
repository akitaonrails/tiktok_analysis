package X;

import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPageItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel$onSelectSubItem$1", f = "MessageNotificationFragment.kt", l = {869}, m = "invokeSuspend")
public final class C1689490u4B extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PushItem LLILLJJLI;
    public final /* synthetic */ PushSelectedSubPageItem LLILLL;
    public final /* synthetic */ ImNotificationViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689490u4B(PushItem pushItem, PushSelectedSubPageItem pushSelectedSubPageItem, ImNotificationViewModel imNotificationViewModel, InterfaceC1364105Vn<? super C1689490u4B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pushItem;
        this.LLILLL = pushSelectedSubPageItem;
        this.LLILZ = imNotificationViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1689490u4B(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("ImNotificationViewModel@ce0b.onSelectSubItem$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19296410eQ c19296410eQ = C19296410eQ.LIZIZ;
            StringBuilder sb = new StringBuilder();
            PushItem pushItem = this.LLILLJJLI;
            PushSelectedSubPageItem pushSelectedSubPageItem = this.LLILLL;
            sb.append(pushItem.itemId);
            sb.append(",");
            sb.append(pushSelectedSubPageItem.fieldValue);
            String str = pushItem.selectField;
            if (str != null && str.length() != 0) {
                sb.append(",");
                sb.append(pushItem.selectField);
                sb.append(",");
                Integer num = pushSelectedSubPageItem.selectFieldValue;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                sb.append(iIntValue);
            }
            Map<String, Integer> map = c19296410eQ.batchSetPushSettingItems(sb.toString(), false, null).updatedSwitches;
            if (map != null && !map.isEmpty()) {
                AbstractC2252651DEx abstractC2252651DEx = C2153208c6.LIZ().LIZJ;
                C1689470u49 c1689470u49 = new C1689470u49(map, this.LLILLJJLI, this.LLILZ, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2252651DEx, c1689470u49) == objLJFF) {
                    C1C7U.LIZIZ("ImNotificationViewModel@ce0b.onSelectSubItem$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ImNotificationViewModel@ce0b.onSelectSubItem$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImNotificationViewModel@ce0b.onSelectSubItem$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
