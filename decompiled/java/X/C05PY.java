package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05PY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.features.UnconsumedVideoRecorderV2$initCacheStatusListener$1$onCacheExist$1", f = "UnconsumedVideoRecorderV2.kt", l = {}, m = "invokeSuspend")
public final class C05PY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05PY(Long l, String str, String str2, InterfaceC1364105Vn<? super C05PY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        C1C7U.LIZ("UnconsumedVideoRecorderV2@bd31.initCacheStatusListener$1$onCacheExist$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Long l = this.LL;
        int iHashCode = 0;
        if (l != null && l.longValue() == 0) {
            int size = ((ArrayList) C1347505Pd.LIZJ).size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                SessionUnconsumptionItem sessionUnconsumptionItem = (SessionUnconsumptionItem) ListProtector.get(C1347505Pd.LIZJ, i2);
                if (sessionUnconsumptionItem.isCache && (i = sessionUnconsumptionItem.fileKeyHash) > 0 && (str = this.LLILLJJLI) != null && i == str.hashCode()) {
                    sessionUnconsumptionItem.isCache = false;
                    break;
                }
                i2++;
            }
        } else if (this.LL.longValue() > 0) {
            int size2 = ((ArrayList) C1347505Pd.LJ).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                SessionUnconsumptionItem sessionUnconsumptionItem2 = (SessionUnconsumptionItem) ListProtector.get(C1347505Pd.LJ, i3);
                if (!sessionUnconsumptionItem2.isCache && Intrinsics.LJFF(sessionUnconsumptionItem2.aid, this.LLILLL)) {
                    sessionUnconsumptionItem2.isCache = true;
                    String str2 = this.LLILLJJLI;
                    if (str2 != null) {
                        iHashCode = str2.hashCode();
                    }
                    sessionUnconsumptionItem2.fileKeyHash = iHashCode;
                    C1347505Pd c1347505Pd = C1347505Pd.LIZ;
                    List<SessionUnconsumptionItem> list = C1347505Pd.LJ;
                    c1347505Pd.getClass();
                    C1347505Pd.LIZLLL(list);
                } else {
                    i3++;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.initCacheStatusListener$1$onCacheExist$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
