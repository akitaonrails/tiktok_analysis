package X;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.IRegionApi;
import com.bytedance.sdk.account.api.IgnoredResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.region.TTPManager$realAuthBroadcast$1", f = "TTPManager.kt", l = {583}, m = "invokeSuspend")
public final class C847940XOe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C847940XOe(int i, String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = map;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C847940XOe(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("TTPManager@c6fa.realAuthBroadcast$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI > 0 && !this.LLILLL.containsKey("is_retry")) {
                this.LLILLL.put("is_retry", "1");
            }
            C847960XOg c847960XOg = IRegionApi.LIZ;
            String str = this.LLILZ;
            Map<String, String> map = this.LLILLL;
            this.LL = 1;
            obj = c847960XOg.LIZ(str, map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTPManager@c6fa.realAuthBroadcast$1");
                return objLJFF;
            }
        }
        if (!TextUtils.equals(((IgnoredResponse) obj).message, "success") && (i = this.LLILLJJLI) < 3) {
            C847910XOb c847910XOb = C847910XOb.LIZ;
            String str2 = this.LLILZ;
            Map<String, String> map2 = this.LLILLL;
            c847910XOb.getClass();
            C847910XOb.LJIIIIZZ(i + 1, str2, map2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTPManager@c6fa.realAuthBroadcast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
