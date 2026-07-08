package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$startGenerationTask$1$1", f = "AIGCOfflineProcessingViewModel.kt", l = {550}, m = "invokeSuspend")
public final class C544610LXn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ AIGCOfflineModel LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544610LXn(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, CreativeInfo creativeInfo, AIGCOfflineModel aIGCOfflineModel, LifecycleOwner lifecycleOwner, boolean z, InterfaceC1364105Vn<? super C544610LXn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGCOfflineProcessingViewModel;
        this.LLILLL = creativeInfo;
        this.LLILZ = aIGCOfflineModel;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544610LXn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List<com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationTask$1$1");
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
            AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel = this.LLILLJJLI;
            CreativeInfo creativeInfo = this.LLILLL;
            AIGCOfflineModel aIGCOfflineModel = this.LLILZ;
            ?? arrayList = aIGCOfflineModel.inputItems;
            if (arrayList == 0) {
                List<String> list = aIGCOfflineModel.imgUriList;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new AIGCInputItem(it2.next(), 2, null));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
            }
            AIGCOfflineModel aIGCOfflineModel2 = this.LLILZ;
            String str2 = aIGCOfflineModel2.reqKey;
            String str3 = aIGCOfflineModel2.reqJson;
            String str4 = aIGCOfflineModel2.styleId;
            if (str4.length() <= 0) {
                str4 = this.LLILZ.propId;
            }
            AIGCOfflineModel aIGCOfflineModel3 = this.LLILZ;
            String str5 = aIGCOfflineModel3.resourceId;
            String str6 = aIGCOfflineModel3.aigcInteractionType;
            Integer numLJ = C2286608xc.LJ(aIGCOfflineModel3.templateType);
            AIGCOfflineModel aIGCOfflineModel4 = this.LLILZ;
            String str7 = aIGCOfflineModel4.templateResourceId;
            String str8 = aIGCOfflineModel4.taskType;
            String str9 = aIGCOfflineModel4.jobType;
            String str10 = aIGCOfflineModel4.workflow;
            LifecycleOwner lifecycleOwner = this.LLILZIL;
            boolean z = this.LLILZLL;
            boolean z2 = !z;
            String str11 = aIGCOfflineModel4.resourceKey;
            String str12 = aIGCOfflineModel4.subAiPropType;
            this.LLILLJJLI.getClass();
            Pair[] pairArr = new Pair[13];
            pairArr[0] = new Pair("shoot_tab_name", aIGCOfflineModel4.shootTabName);
            pairArr[1] = new Pair("prop_id", aIGCOfflineModel4.propId);
            pairArr[2] = new Pair("effect_source", aIGCOfflineModel4.effectSource);
            pairArr[3] = new Pair("is_ai_prop", aIGCOfflineModel4.isAiProp);
            pairArr[4] = new Pair("is_async", aIGCOfflineModel4.isAsync);
            pairArr[5] = new Pair("ai_prop_type", aIGCOfflineModel4.aiPropType);
            pairArr[6] = new Pair("sub_ai_prop_type", aIGCOfflineModel4.subAiPropType);
            pairArr[7] = new Pair("ai_prop_model_name", aIGCOfflineModel4.aiPropModelName);
            pairArr[8] = new Pair("tab_key", aIGCOfflineModel4.tabKey);
            pairArr[9] = new Pair("prop_selected_from", aIGCOfflineModel4.propSelectedFrom);
            pairArr[10] = new Pair("is_default_prop", aIGCOfflineModel4.isDefaultProp);
            pairArr[11] = new Pair("shoot_way", aIGCOfflineModel4.shootWay);
            if (aIGCOfflineModel4.isRegenerate) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[12] = new Pair("is_retry", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            this.LL = 1;
            aIGCOfflineProcessingViewModel.getClass();
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0LXY(str12, aIGCOfflineProcessingViewModel, str2, str3, str4, str9, arrayList, creativeInfo, numLJ, str7, str5, str6, str10, z, lifecycleOwner, str8, mapLJIIIIZZ, z2, str11, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationTask$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.startGenerationTask$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
