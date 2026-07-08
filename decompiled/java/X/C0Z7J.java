package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementAIServiceMonitor;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z7J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics$enterChatV3WithStoryInfo$1", f = "IMChatRoomAnalytics.kt", l = {212}, m = "invokeSuspend")
public final class C0Z7J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnterChatParams LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ InterfaceC876950Yaj LLILZIL;
    public final /* synthetic */ AbstractC879060Ye8 LLILZLL;
    public final /* synthetic */ InterfaceC1493105sv LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ IMUser LLJILJIL;
    public final /* synthetic */ Function1<Map<String, String>, Unit> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0Z7J(EnterChatParams enterChatParams, String str, Map<String, String> map, InterfaceC876950Yaj interfaceC876950Yaj, AbstractC879060Ye8 abstractC879060Ye8, InterfaceC1493105sv interfaceC1493105sv, boolean z, String str2, boolean z2, boolean z3, IMUser iMUser, Function1<? super Map<String, String>, Unit> function1, InterfaceC1364105Vn<? super C0Z7J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enterChatParams;
        this.LLILLL = str;
        this.LLILZ = map;
        this.LLILZIL = interfaceC876950Yaj;
        this.LLILZLL = abstractC879060Ye8;
        this.LLIZ = interfaceC1493105sv;
        this.LLIZLLLIL = z;
        this.LLJ = str2;
        this.LLJI = z2;
        this.LLJIJIL = z3;
        this.LLJILJIL = iMUser;
        this.LLJILJILJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z7J(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatRoomAnalytics@6d9e.enterChatV3WithStoryInfo$1");
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
            String sessionId = this.LLILLJJLI.getSessionId();
            if (sessionId != null) {
                C0Z7L c0z7l = (C0Z7L) PluggableExtentionKt.pluggableSpiForReal(IDMResourceManagementService.class);
                if (c0z7l != null) {
                    c0z7l.LIZIZ(EnumC894670Z7x.PREDICT_ENTER_CHAT, sessionId);
                }
                C0Z7L c0z7l2 = (C0Z7L) PluggableExtentionKt.pluggableSpiForReal(IDMResourceManagementService.class);
                if (c0z7l2 != null) {
                    c0z7l2.LJFF(EnumC894670Z7x.PREDICT_ENTER_CHAT, sessionId);
                }
                IDMResourceManagementAIServiceMonitor iDMResourceManagementAIServiceMonitor = (IDMResourceManagementAIServiceMonitor) PluggableExtentionKt.pluggableSpiForReal(IDMResourceManagementAIServiceMonitor.class);
                if (iDMResourceManagementAIServiceMonitor != null) {
                    iDMResourceManagementAIServiceMonitor.LIZIZ(sessionId);
                }
            }
            IMChatRoomAnalytics iMChatRoomAnalytics = IMChatRoomAnalytics.LIZIZ;
            EnterChatParams enterChatParams = this.LLILLJJLI;
            String str = this.LLILLL;
            Map<String, String> map = this.LLILZ;
            InterfaceC876950Yaj interfaceC876950Yaj = this.LLILZIL;
            AbstractC879060Ye8 abstractC879060Ye8 = this.LLILZLL;
            InterfaceC1493105sv interfaceC1493105sv = this.LLIZ;
            boolean z = this.LLIZLLLIL;
            String str2 = this.LLJ;
            boolean z2 = this.LLJI;
            boolean z3 = this.LLJIJIL;
            IMUser iMUser = this.LLJILJIL;
            Function1<Map<String, String>, Unit> function1 = this.LLJILJILJ;
            this.LL = 1;
            if (iMChatRoomAnalytics.LJIIIIZZ(enterChatParams, str, map, interfaceC876950Yaj, abstractC879060Ye8, interfaceC1493105sv, z, str2, C1336205Ku.LIZ(false).getImPrivacySettings(), z2, z3, iMUser, function1, this) == objLJFF) {
                C1C7U.LIZIZ("IMChatRoomAnalytics@6d9e.enterChatV3WithStoryInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatRoomAnalytics@6d9e.enterChatV3WithStoryInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
