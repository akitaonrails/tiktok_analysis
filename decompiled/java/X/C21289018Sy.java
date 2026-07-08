package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.18Sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.onboarding.AiChatOnboardingComponent$init$1", f = "AiChatOnboardingComponent.kt", l = {142, 146}, m = "invokeSuspend")
public final class C21289018Sy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1157570gEF LL;
    public int LLILLJJLI;
    public final /* synthetic */ C18U9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21289018Sy(C18U9 c18u9, InterfaceC1364105Vn<? super C21289018Sy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c18u9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21289018Sy(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        InterfaceC1157570gEF interfaceC1157570gEF;
        C1C7U.LIZ("AiChatOnboardingComponent@20e1.init$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLJJLI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    interfaceC1157570gEF = this.LL;
                    C155000ia.LIZIZ(obj);
                    C21290818Tq.LIZJ("CreationChatOnboarding", "init: start listen lastMessageState");
                    C09IC.LJJI(this.LLILLL.LLIZ, new C861640Xr8(new C21288818Sw(interfaceC1157570gEF, this.LLILLL, null), C21163117rp.LIZIZ().LJI()));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C21290818Tq.LIZJ("CreationChatOnboarding", "init: start getLandingMsgs");
            C18U9 c18u9 = this.LLILLL;
            C342330DbT c342330DbT = c18u9.LLILZLL;
            C18UJ c18uj = c18u9.LLILLL;
            String str2 = c18uj.LIZLLL;
            AIChatGenChatRoomModel aIChatGenChatRoomModel = c18uj.LJ.chatRoomModel;
            if (aIChatGenChatRoomModel != null) {
                str = aIChatGenChatRoomModel.entranceType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "comment")) {
                i = 4;
            } else {
                i = 1;
            }
            c342330DbT.getClass();
            C095D c095d = new C095D(new C342370DbX(i, c342330DbT, str2, null));
            C342390DbZ c342390DbZ = new C342390DbZ(null);
            this.LLILLJJLI = 1;
            obj = C09IC.LJIJ(c095d, this, c342390DbZ);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1");
                return objLJFF;
            }
        }
        InterfaceC1157570gEF interfaceC1157570gEF2 = (InterfaceC1157570gEF) obj;
        C21290818Tq.LIZJ("CreationChatOnboarding", "init: start listen OnQueryMessageEvent");
        C2252321DDq c2252321DDqS9 = C21163117rp.LIZIZ().s9();
        C342400Dba c342400Dba = new C342400Dba(null);
        this.LL = interfaceC1157570gEF2;
        this.LLILLJJLI = 2;
        if (C09IC.LJIJ(c2252321DDqS9, this, c342400Dba) == objLJFF) {
            C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1");
            return objLJFF;
        }
        interfaceC1157570gEF = interfaceC1157570gEF2;
        C21290818Tq.LIZJ("CreationChatOnboarding", "init: start listen lastMessageState");
        C09IC.LJJI(this.LLILLL.LLIZ, new C861640Xr8(new C21288818Sw(interfaceC1157570gEF, this.LLILLL, null), C21163117rp.LIZIZ().LJI()));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
