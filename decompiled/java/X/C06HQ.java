package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakCampaignCardDisplay;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakCampaignInfo;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakWheeDriveTrafficAssem;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS151S1100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06HQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakWheeDriveTrafficAssem$onStreakExtensionUpdate$1", f = "StreakWheeDriveTrafficAssem.kt", l = {174}, m = "invokeSuspend")
public final class C06HQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ StreakWheeDriveTrafficAssem LLILZ;
    public final /* synthetic */ StreakCampaignInfo LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HQ(String str, String str2, StreakWheeDriveTrafficAssem streakWheeDriveTrafficAssem, StreakCampaignInfo streakCampaignInfo, String str3, String str4, InterfaceC1364105Vn<? super C06HQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = streakWheeDriveTrafficAssem;
        this.LLILZIL = streakCampaignInfo;
        this.LLILZLL = str3;
        this.LLIZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        C1C7U.LIZ("StreakWheeDriveTrafficAssem@460e.onStreakExtensionUpdate$1");
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
            IPromptUnifiedFrequencyController.LIZ.getClass();
            IPromptUnifiedFrequencyController iPromptUnifiedFrequencyControllerLIZ = C06R9.LIZ();
            String str5 = this.LLILLJJLI;
            EnumC1674506h5 enumC1674506h5 = EnumC1674506h5.STREAK_EXCLUSIVE_OUTFIT_FOR_WHEE;
            this.LL = 1;
            obj = iPromptUnifiedFrequencyControllerLIZ.LJII(str5, enumC1674506h5, null, System.currentTimeMillis(), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreakWheeDriveTrafficAssem@460e.onStreakExtensionUpdate$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean z = C1590906Kt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakWheeDriveTrafficAssem onStreakExtensionUpdate, canShowByUFC=");
        sbLIZ.append(zBooleanValue);
        C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue) {
            C06HP.LIZ(this.LLILLL, C06HR.NOT_SHOWING);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreakWheeDriveTrafficAssem@460e.onStreakExtensionUpdate$1");
            return unit;
        }
        C06HP.LIZ(this.LLILLL, C06HR.SHOWING);
        WeakReference weakReference = new WeakReference(this.LLILZ);
        try {
            ICommonChatNoticeViewModel iCommonChatNoticeViewModel = (ICommonChatNoticeViewModel) this.LLILZ.LLILZIL.getValue();
            StreakCampaignCardDisplay streakCampaignCardDisplay = this.LLILZIL.card;
            if (streakCampaignCardDisplay == null || (str = streakCampaignCardDisplay.imageUrl) == null) {
                str = "";
            }
            if (streakCampaignCardDisplay == null || (str2 = streakCampaignCardDisplay.text) == null) {
                str2 = "";
            }
            if (streakCampaignCardDisplay == null || (str3 = streakCampaignCardDisplay.ctaText) == null) {
                str3 = "";
            }
            if (streakCampaignCardDisplay == null || (str4 = streakCampaignCardDisplay.ctaAction) == null) {
                str4 = "";
            }
            iCommonChatNoticeViewModel.xQ2(new C06LV(str, str2, str3, str4, new C1580606Gu(this.LLILZLL, this.LLIZ, weakReference, this.LLILLL), new C06HO(weakReference, this.LLILZLL, this.LLIZ), new AwS151S1100000_2(weakReference, (WeakReference<StreakWheeDriveTrafficAssem>) this.LLILLL, (String) 12)));
        } catch (C0RTZ e) {
            TryCatchGuardChecker.doCheck(e);
            boolean z2 = C1590906Kt.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StreakWheeDriveTrafficAssem addTaskAndStartShowing skipped, hierarchy data not found: ");
            sbLIZ2.append(e.getMessage());
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C06HP.LIZ(this.LLILLL, C06HR.NOT_SHOWING);
        } catch (C738120SxO e2) {
            TryCatchGuardChecker.doCheck(e2);
            boolean z3 = C1590906Kt.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("StreakWheeDriveTrafficAssem addTaskAndStartShowing skipped, fragment already destroyed: ");
            sbLIZ3.append(e2.getMessage());
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            C06HP.LIZ(this.LLILLL, C06HR.NOT_SHOWING);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StreakWheeDriveTrafficAssem@460e.onStreakExtensionUpdate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
