package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.AutoBatchUserProfileFetcher$dispatchCallbacks$3", f = "AutoBatchUserProfileFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1480605qu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, List<InterfaceC1480505qt>> LL;
    public final /* synthetic */ Map<String, IMUser> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1480605qu(Map<String, ? extends List<? extends InterfaceC1480505qt>> map, Map<String, ? extends IMUser> map2, InterfaceC1364105Vn<? super C1480605qu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1480605qu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoBatchUserProfileFetcher@4743.dispatchCallbacks$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, List<InterfaceC1480505qt>> map = this.LL;
        Map<String, IMUser> map2 = this.LLILLJJLI;
        for (Map.Entry<String, List<InterfaceC1480505qt>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<InterfaceC1480505qt> value = entry.getValue();
            if (!value.isEmpty()) {
                IMUser iMUser = map2.get(key);
                for (InterfaceC1480505qt interfaceC1480505qt : value) {
                    if (iMUser != null) {
                        interfaceC1480505qt.LIZIZ(iMUser);
                    } else {
                        interfaceC1480505qt.LIZJ();
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoBatchUserProfileFetcher@4743.dispatchCallbacks$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
