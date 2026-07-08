package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.archive2.model.HasOnThisDayResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.service.StoryServiceImpl$fetchHasOnThisDay$1", f = "StoryServiceImpl.kt", l = {548}, m = "invokeSuspend")
public final class C332001Qo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C332001Qo(InterfaceC1364105Vn<? super C332001Qo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C332001Qo c332001Qo = new C332001Qo(interfaceC1364105Vn);
        c332001Qo.LLILLJJLI = obj;
        return c332001Qo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryServiceImpl@9399.fetchHasOnThisDay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                StoryApi storyApi = StoryApi.LIZIZ;
                this.LL = 1;
                obj = storyApi.hasOnThisDay(2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryServiceImpl@9399.fetchHasOnThisDay$1");
                    return objLJFF;
                }
            }
            HasOnThisDayResponse hasOnThisDayResponse = (HasOnThisDayResponse) obj;
            C439001nI c439001nI = C439001nI.LIZ;
            boolean z = hasOnThisDayResponse.hasOnThisDay;
            Keva keva = C439001nI.LIZIZ;
            c439001nI.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALBUM_HAS_ON_THIS_DAY_");
            sbLIZ.append(C439001nI.LIZ());
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
            String str = hasOnThisDayResponse.queryDate;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ALBUM_ON_THIS_DAY_QUERY_DATE_");
            sbLIZ2.append(C439001nI.LIZ());
            keva.storeString(C2188811AlT.LIZIZ(sbLIZ2), str);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryServiceImpl@9399.fetchHasOnThisDay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
