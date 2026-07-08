package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMInboxVOListAnalytics$reportSocialGroupChatShowEvent$1", f = "IMInboxVOListAnalytics.kt", l = {419}, m = "invokeSuspend")
public final class C888470YtJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC888500YtM LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC1493105sv LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C888470YtJ(InterfaceC888500YtM interfaceC888500YtM, int i, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C888470YtJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC888500YtM;
        this.LLILZ = i;
        this.LLILZIL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C888470YtJ(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLIZIZ;
        C1C7U.LIZ("IMInboxVOListAnalytics@cf12.reportSocialGroupChatShowEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                mapLIZIZ = (Map) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC888500YtM interfaceC888500YtM = this.LLILLL;
            if (!(interfaceC888500YtM instanceof C0Z8M)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.reportSocialGroupChatShowEvent$1");
                return unit;
            }
            C888490YtL c888490YtL = C888490YtL.LIZ;
            int i2 = this.LLILZ;
            c888490YtL.getClass();
            mapLIZIZ = C888490YtL.LIZIZ(interfaceC888500YtM, i2);
            mapLIZIZ.put("relation_tag", "");
            C1461005nk c1461005nk = C1461005nk.LIZ;
            mapLIZIZ.put("group_role", String.valueOf(C1461005nk.LJIIIIZZ(((C0Z8M) this.LLILLL).getSessionId())));
            String sessionId = ((C0Z8M) this.LLILLL).getSessionId();
            this.LL = mapLIZIZ;
            this.LLILLJJLI = 1;
            if (c888490YtL.LIZ(sessionId, mapLIZIZ, this) == objLJFF) {
                C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.reportSocialGroupChatShowEvent$1");
                return objLJFF;
            }
        }
        C892210YzL.LIZ(mapLIZIZ, ((C0Z8M) this.LLILLL).getMiddleViewVO(), ((C0Z8M) this.LLILLL).getLastMsg());
        this.LLILZIL.sendEvent("ttsocial_chat_cell_show", mapLIZIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxVOListAnalytics@cf12.reportSocialGroupChatShowEvent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
