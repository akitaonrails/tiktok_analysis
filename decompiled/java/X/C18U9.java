package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.chat.message.onboarding.FakeVisualPoetOnboardingContent;
import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.ss.android.ugc.tools.data.GuideAppearance;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18U9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18U9 extends AbstractC2255721DQs<C18UK> implements C18UK, InterfaceC379610EuV {
    public static final C18UE LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final AbstractC214814194y LL;
    public final C1DRG LLILLJJLI;
    public C869590Y9l LLILZ;
    public boolean LLJ;
    public final C18UJ LLILLL = (C18UJ) getDiContainer().LJII(C18UJ.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C18UC.class, null);
    public C342330DbT LLILZLL = new C342330DbT();
    public final InterfaceC497601wk LLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C18UD LLIZLLLIL = new C189Y() { // from class: X.18UD
        @Override // X.C189Y
        public final boolean LIZ(C869590Y9l c869590Y9l) {
            if (c869590Y9l.getMsgType() == 4065) {
                this.LIZ.G2(c869590Y9l);
                return true;
            }
            return false;
        }
    };
    public final C11NJ LLJI = new C11NJ();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.18UE] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18U9.class, "messageActionComponent", "getMessageActionComponent()Lcom/ss/android/ugc/tools/chat/message/api/AiChatMessageActionApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.18UE
        };
        LLJILJILJ = 8;
    }

    public C18UK X1() {
        return this;
    }

    private final C18UC Z1() {
        return (C18UC) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.C18UK
    public C869590Y9l PA2() {
        C869590Y9l c869590Y9l = this.LLILZ;
        if (C300220Bpk.LIZ()) {
            this.LLILZ = null;
            return c869590Y9l;
        }
        G2(c869590Y9l);
        return c869590Y9l;
    }

    public final void W1() {
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this.LL);
        if (abstractC214814194yLIZ != null) {
            abstractC214814194yLIZ.finish();
            return;
        }
        Activity activity = this.LL.mActivity;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void o2() {
        G2(this.LLILZ);
    }

    public final void init() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C21289018Sy(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Z1().oX(this.LLIZLLLIL);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        Z1().DI0(this.LLIZLLLIL);
        super.onDestroy();
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) != null) {
            interfaceC21291818UaLIZLLL.LJ(this.LL);
        }
        this.LLJI.dispose();
        C2296808zG.LIZJ(this.LLIZ, null);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        AIChatTrackingConfig aIChatTrackingConfig;
        super.onResume();
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        if (C289710BXd.LIZ()) {
            init();
            return;
        }
        GuideAppearance guideAppearance = null;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService == null || (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) == null) {
            return;
        }
        C18UJ c18uj = this.LLILLL;
        AIChatGenModel aIChatGenModel = c18uj.LJ;
        AIChatPageConfig aIChatPageConfig = c18uj.LJI;
        if (aIChatPageConfig != null) {
            aIChatTrackingConfig = aIChatPageConfig.tracking;
            AIChatAppearance aIChatAppearance = aIChatPageConfig.appearance;
            if (aIChatAppearance != null) {
                guideAppearance = aIChatAppearance.guideAppearance;
            }
        } else {
            aIChatTrackingConfig = null;
        }
        interfaceC21291818UaLIZLLL.LIZLLL(aIChatGenModel, aIChatTrackingConfig, guideAppearance, this.LL, new AwS576S0100000_32(this, 426), new AwS576S0100000_32(this, 427));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final void G2(C869590Y9l c869590Y9l) {
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            String str = this.LLILLL.LIZLLL;
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZLLL(1281);
            c1684506ih.LIZJ = "fake_onboarding_msg_id";
            fakeMsgOperatorService.LIZ(str, c1684506ih, this.LLILLL.LIZ, null);
        }
        this.LLILZ = null;
    }

    public final void H2(List<C342360DbW> list) {
        if (this.LLILZ != null) {
            return;
        }
        C342360DbW c342360DbW = (C342360DbW) ListProtector.get(list, AbstractC19994813Le.Default.nextInt(list.size()));
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        C869590Y9l c869590Y9l = null;
        if (fakeMsgOperatorService != null) {
            String str = this.LLILLL.LIZLLL;
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZLLL(1281);
            c1684506ih.LIZJ = "fake_onboarding_msg_id";
            c1684506ih.LJFF = new FakeVisualPoetOnboardingContent(c342360DbW.LIZ, C1017903yT.LIZ());
            C1736806r8 c1736806r8LIZIZ = fakeMsgOperatorService.LIZIZ(str, c1684506ih, this.LLILLL.LIZ, null, null);
            if (c1736806r8LIZIZ != null) {
                c869590Y9l = c1736806r8LIZIZ.LIZJ;
            }
        }
        this.LLILZ = c869590Y9l;
    }

    public final boolean w2(C869590Y9l c869590Y9l) {
        String str;
        String str2;
        C21290818Tq.LIZJ("CreationChatOnboarding", "needShowOnboardingMsg: start check");
        AIChatGenChatRoomModel aIChatGenChatRoomModel = this.LLILLL.LJ.chatRoomModel;
        String str3 = null;
        if (aIChatGenChatRoomModel != null) {
            str = aIChatGenChatRoomModel.entranceType;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "editor_tab")) {
            AIChatGenChatRoomModel aIChatGenChatRoomModel2 = this.LLILLL.LJ.chatRoomModel;
            if (aIChatGenChatRoomModel2 != null) {
                str2 = aIChatGenChatRoomModel2.entranceType;
            } else {
                str2 = null;
            }
            if (!Intrinsics.LJFF(str2, "comment")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("needShowOnboardingMsg: entranceType invalid = ");
                AIChatGenChatRoomModel aIChatGenChatRoomModel3 = this.LLILLL.LJ.chatRoomModel;
                if (aIChatGenChatRoomModel3 != null) {
                    str3 = aIChatGenChatRoomModel3.entranceType;
                }
                sbLIZ.append(str3);
                C21290818Tq.LIZJ("CreationChatOnboarding", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        if (c869590Y9l == null) {
            return true;
        }
        if ((C21289818Tg.LJ(c869590Y9l) || !C21163117rp.LIZIZ().LIZIZ(c869590Y9l)) && !C0ZDX.LJJJJIZL(c869590Y9l)) {
            C21290818Tq.LIZJ("CreationChatOnboarding", "needShowOnboardingMsg: first read result");
            return false;
        }
        C18U8.LIZ.getClass();
        long jLIZ = C18U8.LIZ() - c869590Y9l.getCreatedAt();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("needShowOnboardingMsg: end check, showInterval=");
        sbLIZ2.append(jLIZ);
        C21290818Tq.LIZJ("CreationChatOnboarding", C2188811AlT.LIZIZ(sbLIZ2));
        if (jLIZ < ((long) C342380DbY.LIZ().onboardingIntervalInHours) * 3600000) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.18UD] */
    public C18U9(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = c1drg;
    }
}
