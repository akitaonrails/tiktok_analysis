package X;

import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS49S0301000_25;
import njp.a;

/* JADX INFO: renamed from: X.0u49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.ImNotificationViewModel$onSelectSubItem$1$1", f = "MessageNotificationFragment.kt", l = {}, m = "invokeSuspend")
public final class C1689470u49 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, Integer> LL;
    public final /* synthetic */ PushItem LLILLJJLI;
    public final /* synthetic */ ImNotificationViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689470u49(Map<String, Integer> map, PushItem pushItem, ImNotificationViewModel imNotificationViewModel, InterfaceC1364105Vn<? super C1689470u49> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = pushItem;
        this.LLILLL = imNotificationViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1689470u49(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImNotificationViewModel@ce0b.onSelectSubItem$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = this.LL.get(this.LLILLJJLI.itemId);
        if (num != null) {
            int iIntValue = num.intValue();
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            c19328310jZ.f6(iIntValue, this.LLILLJJLI.itemId);
            C259800zU c259800zU = new C259800zU();
            String str = this.LLILLJJLI.selectField;
            if (str != null) {
                ?? r2 = this.LL.get(str);
                c259800zU.element = r2;
                if (r2 != 0) {
                    c19328310jZ.f6(((Number) r2).intValue(), this.LLILLJJLI.selectField);
                }
            }
            ImNotificationViewModel imNotificationViewModel = this.LLILLL;
            imNotificationViewModel.yQ2(new AwS49S0301000_25(imNotificationViewModel, (ImNotificationViewModel) this.LLILLJJLI, (PushItem) c259800zU, (C259800zU<Integer>) iIntValue, 0));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ImNotificationViewModel@ce0b.onSelectSubItem$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImNotificationViewModel@ce0b.onSelectSubItem$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
