package X;

import com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultComponent$performSearchAndShowResults$2", f = "EffectSearchResultComponent.kt", l = {173}, m = "invokeSuspend")
public final class C1426490nDz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1426520nE2 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426490nDz(C1426520nE2 c1426520nE2, String str, String str2, InterfaceC1364105Vn<? super C1426490nDz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1426520nE2;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1426490nDz(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLIZ;
        C1427010nEp c1427010nEpGW0;
        String methodKey;
        String str;
        String str2;
        LogPbBean logPbBean;
        String imprId;
        List<Effect> listLIZ;
        Integer num;
        C1426590nE9 c1426590nE9Bb;
        C1426590nE9 c1426590nE9Bb2;
        EnumC1426270nDd enumC1426270nDd;
        Object objLIZ = obj;
        C1C7U.LIZ("EffectSearchResultComponent@1aa.performSearchAndShowResults$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jLIZ = this.LL;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C1426520nE2 c1426520nE2 = this.LLILLL;
            String str3 = this.LLILZ;
            String str4 = this.LLILZIL;
            C1302050jzH.LIZ.getClass();
            jLIZ = C1302050jzH.LIZ();
            InterfaceC1426440nDu interfaceC1426440nDuO4 = c1426520nE2.O4();
            if (interfaceC1426440nDuO4 != null && (c1427010nEpGW0 = interfaceC1426440nDuO4.GW0()) != null) {
                this.LL = jLIZ;
                this.LLILLJJLI = 1;
                objLIZ = c1427010nEpGW0.LIZ(0, 36, str3, str4, null, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("EffectSearchResultComponent@1aa.performSearchAndShowResults$2");
                    return objLJFF;
                }
            } else {
                objLIZ = null;
            }
        }
        C05XE c05xe = new C05XE(objLIZ, C1302080jzK.LIZJ(jLIZ), null);
        int size = 0;
        this.LLILLL.t5((EffectSearchResultResponse) c05xe.LIZ, false);
        C1413450msx c1413450msx = C1413450msx.LIZ;
        C1426520nE2 c1426520nE22 = this.LLILLL;
        VideoPublishEditModel videoPublishEditModel = c1426520nE22.LLJJ;
        String str5 = this.LLILZ;
        InterfaceC1426280nDe interfaceC1426280nDeP4 = c1426520nE22.P4();
        String str6 = "";
        if (interfaceC1426280nDeP4 == null || (c1426590nE9Bb2 = interfaceC1426280nDeP4.bb()) == null || (enumC1426270nDd = c1426590nE9Bb2.LIZJ) == null || (methodKey = enumC1426270nDd.getMethodKey()) == null) {
            methodKey = "";
        }
        InterfaceC1426280nDe interfaceC1426280nDeP42 = this.LLILLL.P4();
        if (interfaceC1426280nDeP42 == null || (c1426590nE9Bb = interfaceC1426280nDeP42.bb()) == null || (str = c1426590nE9Bb.LIZIZ) == null) {
            str = "";
        }
        c1413450msx.getClass();
        if (videoPublishEditModel != null) {
            EffectSearchResultResponse effectSearchResultResponse = (EffectSearchResultResponse) c05xe.LIZ;
            long j = c05xe.LIZIZ;
            C0LAB c0labLJI = C1413450msx.LJI(videoPublishEditModel);
            if (effectSearchResultResponse != null && (num = effectSearchResultResponse.statusCode) != null && num.intValue() == 0) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJI.LJ("is_success", str2);
            c0labLJI.LIZLLL(new C19990113Jj(j), "duration");
            if (effectSearchResultResponse != null && (listLIZ = effectSearchResultResponse.LIZ()) != null) {
                size = listLIZ.size();
            }
            c0labLJI.LIZ(size, "search_result_count");
            c0labLJI.LJ("search_keyword", str5);
            c0labLJI.LJ("enter_method", methodKey);
            if (effectSearchResultResponse != null && (logPbBean = effectSearchResultResponse.logPb) != null && (imprId = logPbBean.getImprId()) != null) {
                str6 = imprId;
            }
            c0labLJI.LJ("search_id", str6);
            c0labLJI.LJ("enter_from", str);
            C2341909Fp.LIZ("editing_effect_search", c0labLJI.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectSearchResultComponent@1aa.performSearchAndShowResults$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
