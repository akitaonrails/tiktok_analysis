package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0L6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterSocialServiceImpl$onClickAITheaterActionBar$1$1$1", f = "AITheaterSocialServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C537490L6d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<MentionDataItem> LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ LifecycleCoroutineScope LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537490L6d(List<MentionDataItem> list, List<String> list2, LifecycleCoroutineScope lifecycleCoroutineScope, Context context, boolean z, String str, String str2, Boolean bool, String str3, InterfaceC1364105Vn<? super C537490L6d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = lifecycleCoroutineScope;
        this.LLILZ = context;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = bool;
        this.LLJ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537490L6d(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        ?? arrayList2;
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        InterfaceC537510L6f interfaceC537510L6fLIZJ;
        C1C7U.LIZ("AITheaterSocialServiceImpl@1024.onClickAITheaterActionBar$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<MentionDataItem> list = this.LL;
        if (list != null) {
            String str = this.LLJ;
            ArrayList arrayList3 = new ArrayList();
            for (MentionDataItem mentionDataItem : list) {
                if (Intrinsics.LJFF(mentionDataItem.uid, str)) {
                    arrayList3.add(mentionDataItem);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(MentionDataItem.LIZ((MentionDataItem) it2.next(), null, "MySelf", null, null, null, 8127));
            }
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (hashSet.add(((MentionDataItem) obj2).uid)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        Set setLLIIJI = C13LP.LLIIJI(C13LP.LJJJJLI(this.LLILLJJLI));
        List<MentionDataItem> list2 = this.LL;
        if (list2 != null) {
            ArrayList arrayList5 = new ArrayList();
            for (MentionDataItem mentionDataItem2 : list2) {
                String str2 = mentionDataItem2.uid;
                if (str2 != null && C13LP.LJJJJ(str2, setLLIIJI)) {
                    arrayList5.add(mentionDataItem2);
                }
            }
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(MentionDataItem.LIZ((MentionDataItem) it3.next(), null, "Friend", null, null, null, 8127));
            }
            HashSet hashSet2 = new HashSet();
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList6) {
                if (hashSet2.add(((MentionDataItem) obj3).uid)) {
                    arrayList2.add(obj3);
                }
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        C549150LgH c549150LgH = C549150LgH.LIZ;
        LifecycleCoroutineScope lifecycleCoroutineScope = this.LLILLL;
        Context context = this.LLILZ;
        AIGCSocialModel aIGCSocialModel = new AIGCSocialModel(arrayList, arrayList2, Boolean.valueOf(this.LLILZIL), this.LLILZLL, this.LLIZ, null, null, null, null, 320, null);
        List<String> list3 = this.LLILLJJLI;
        Boolean bool = this.LLIZLLLIL;
        c549150LgH.getClass();
        List<MentionDataItem> list4 = aIGCSocialModel.selfCameoInfo;
        List<MentionDataItem> list5 = aIGCSocialModel.peerCameoInfo;
        if (list4 != null && !list4.isEmpty() && list5 != null && !list5.isEmpty()) {
            if (((Boolean) C18094076u.LIZ.getValue()).booleanValue() && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                C547930LeJ.LIZIZ(C1388190mED.LIZ(context), 2131826043, new Object[0]);
            } else if (C549150LgH.LIZ(list4)) {
                String strLIZ = C528840Koc.LIZ();
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    AITheaterProfileService.LIZ.getClass();
                    AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
                    if (aITheaterProfileServiceLIZ != null) {
                        aITheaterProfileServiceLIZ.Y8(activityLIZ, new C531080KsE(true, null, null, 10001, aIGCSocialModel, new AITheaterProfileEventModel(C0LQY.AI_THEATER, strLIZ, "dm", "ai_theatre_chat_action_bar_invite", null, null, "chat", null, null, null, null, false, 4016), false, false, false, null, 966), AFwS194S0000000_8.get$arr$(606));
                    }
                }
                IAITheaterFeatureService.LIZ.getClass();
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ != null && (interfaceC537510L6fLIZJ = iAITheaterFeatureServiceLIZ.LIZJ()) != null) {
                    interfaceC537510L6fLIZJ.LIZIZ(strLIZ, "action_bar");
                }
            } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_theater_test_upload_success", true) != 0) {
                C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C534400Kxa(aIGCSocialModel, context, null), 3);
            } else if (C549150LgH.LIZ(list5) && Intrinsics.LJFF(bool, Boolean.TRUE)) {
                C549170LgJ.LIZ.getClass();
                C549170LgJ.LJ(context, aIGCSocialModel);
            } else {
                IAITheaterCreationLauncher.EnterParams enterParams = new IAITheaterCreationLauncher.EnterParams(new CreativeInfo(C0DMI.LIZ(), 0, null, 6, null), null, null, aIGCSocialModel, AIGCEntranceInfo.LIZ(C550740Liq.LIZ("chat_bottle_cast_entrance_ai_theater", AIGC.AICreationSceneName.CHAT_BOTTLE_CAST_ENTRANCE_AI_THEATER.INSTANCE, AIGC.RefPageName.Chat.INSTANCE, false), null, null, 0, null, null, false, false, false, null, null, "chat", null, null, C13LP.LJJLIIIJ(C13LP.LJJJJLI(list3), ",", null, null, 0, null, null, 62), false, false, 1030143), 6, null);
                IAITheaterFeatureService.LIZ.getClass();
                IAITheaterFeatureService iAITheaterFeatureServiceLIZ2 = C549720LhC.LIZ();
                if (iAITheaterFeatureServiceLIZ2 != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ2.LIZ()) != null) {
                    iAITheaterCreationLauncherLIZ.LJFF(enterParams, context, false);
                }
                C0MU2.LIZ.getClass();
                C0MU2.LJI(enterParams);
            }
        } else {
            C549150LgH.LIZIZ(context);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterSocialServiceImpl@1024.onClickAITheaterActionBar$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
