package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.mention.MentionKevaHelper$saveInitialRecommendListCache$2", f = "MentionKevaHelper.kt", l = {}, m = "invokeSuspend")
public final class C485650J2t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<MentionDataItem> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C485650J2t(List<MentionDataItem> list, InterfaceC1364105Vn<? super C485650J2t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C485650J2t(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionKevaHelper@2cd8.saveInitialRecommendListCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Keva keva = (Keva) C555240Lq6.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache_initial_recommend_list");
            sbLIZ.append(C555240Lq6.LIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            List<MentionDataItem> list = this.LL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<MentionDataItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Gson) C555240Lq6.LIZJ.getValue()).LJIILL(it2.next()));
            }
            keva.storeStringArray(strLIZIZ, (String[]) arrayList.toArray(new String[0]));
            ((Keva) C555240Lq6.LIZIZ.getValue()).storeLong("cache_time", System.currentTimeMillis());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionKevaHelper@2cd8.saveInitialRecommendListCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
