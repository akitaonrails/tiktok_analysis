package X;

import com.bytedance.android.livesdk.broadcast.settingpage.SettingsViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.SettingsRegistry$dynamicItem$3$unregister$1$1", f = "LiveHostSettingsConfigFactory.kt", l = {}, m = "invokeSuspend")
public final class C385501ef extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C499990JjB LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C385501ef(C499990JjB c499990JjB, int i, int i2, InterfaceC1364105Vn<? super C385501ef> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c499990JjB;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C385501ef(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SettingsRegistry@fb82.dynamicItem$3$unregister$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SettingsViewModel settingsViewModel = this.LL.LIZ;
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        if (settingsViewModel.LL.containsKey(Integer.valueOf(i))) {
            settingsViewModel.LL.remove(Integer.valueOf(i));
            LinkedHashMap<Integer, List<Integer>> linkedHashMap = settingsViewModel.LLILLJJLI;
            Integer numValueOf = Integer.valueOf(i2);
            List<Integer> arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(numValueOf, arrayList);
            }
            List<Integer> list = arrayList;
            if (list.contains(Integer.valueOf(i))) {
                list.remove(Integer.valueOf(i));
            }
            if (settingsViewModel.LLILZ) {
                settingsViewModel.vQ2();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SettingsRegistry@fb82.dynamicItem$3$unregister$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
