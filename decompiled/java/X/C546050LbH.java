package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS252S0300000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.component.AITheaterCameoControlComponent$showInviteDMCard$1", f = "AITheaterCameoControlComponent.kt", l = {336}, m = "invokeSuspend")
public final class C546050LbH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C549180LgK LLILLJJLI;
    public final /* synthetic */ MentionDataItem LLILLL;
    public final /* synthetic */ C0LRE LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546050LbH(C549180LgK c549180LgK, MentionDataItem mentionDataItem, C0LRE c0lre, Integer num, InterfaceC1364105Vn<? super C546050LbH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c549180LgK;
        this.LLILLL = mentionDataItem;
        this.LLILZ = c0lre;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C546050LbH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object objLJ = obj;
        C1C7U.LIZ("AITheaterCameoControlComponent@4a33.showInviteDMCard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int iIntValue = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            C546890Lcd.LIZ.getClass();
            MentionService mentionServiceLIZJ = C546890Lcd.LIZJ();
            this.LL = 1;
            objLJ = mentionServiceLIZJ.LJ(this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.showInviteDMCard$1");
                return objLJFF;
            }
        }
        List list = (List) objLJ;
        String str = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (C549450Lgl.LJFF((MentionDataItem) obj2)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        CreativeInfo creativeInfo = this.LLILLJJLI.w2().creativeInfo;
        CreativeModel creativeModel = this.LLILLJJLI.w2().creativeModel;
        if (arrayList == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.showInviteDMCard$1");
            return unit;
        }
        AIGCSocialModel aIGCSocialModel = new AIGCSocialModel(arrayList, Collections.singletonList(this.LLILLL), null, null, null, null, null, null, null, 508, null);
        AIGCEntranceInfo aIGCEntranceInfo = this.LLILLJJLI.X1().getContextModel().aigcEntranceInfo;
        AIGCEntranceInfo aIGCEntranceInfo2 = this.LLILLJJLI.w2().entranceInfo;
        if (aIGCEntranceInfo2 != null) {
            str = aIGCEntranceInfo2.shootWay;
        }
        IAITheaterCreationLauncher.EnterParams enterParams = new IAITheaterCreationLauncher.EnterParams(creativeInfo, creativeModel, null, aIGCSocialModel, AIGCEntranceInfo.LIZ(aIGCEntranceInfo, null, str, 0, null, null, false, false, false, null, null, "create_video", null, null, null, false, false, 1046525), 4, null);
        MentionDataItem mentionDataItem = this.LLILLL;
        String str2 = mentionDataItem.uid;
        if (str2 == null) {
            str2 = "";
        }
        String strLIZJ = C549450Lgl.LIZJ(mentionDataItem);
        C0LRE c0lre = this.LLILZ;
        if (c0lre == null) {
            c0lre = C0LRE.UPON_INPUT;
        }
        Integer num = this.LLILZIL;
        if (num != null) {
            iIntValue = num.intValue();
        }
        AIGCCameoDisplayInfo aIGCCameoDisplayInfo = new AIGCCameoDisplayInfo(str2, strLIZJ, c0lre, iIntValue);
        C549170LgJ c549170LgJ = C549170LgJ.LIZ;
        Context sceneContext = this.LLILLJJLI.LL.getSceneContext();
        if (sceneContext == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.showInviteDMCard$1");
            return unit2;
        }
        AwS252S0300000_8 awS252S0300000_8 = new AwS252S0300000_8(enterParams, (IAITheaterCreationLauncher.EnterParams) aIGCCameoDisplayInfo, (AIGCCameoDisplayInfo) arrayList, (List<MentionDataItem>) 21);
        c549170LgJ.getClass();
        C549170LgJ.LIZLLL(sceneContext, enterParams, aIGCCameoDisplayInfo, awS252S0300000_8);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.showInviteDMCard$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
