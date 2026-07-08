package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.SmartReplyChatRoomIntroHandler$triggerIntroBanner$1", f = "SmartReplyChatRoomIntroHandler.kt", l = {}, m = "invokeSuspend")
public final class C1505605uw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C067J LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1505605uw(C067J c067j, C0Y8T c0y8t, InterfaceC1364105Vn<? super C1505605uw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c067j;
        this.LLILLJJLI = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1505605uw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1736806r8 c1736806r8LIZIZ;
        C869590Y9l c869590Y9l;
        C869590Y9l c869590Y9l2;
        String uuid;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        String uuid2;
        C869590Y9l lastShowMessage;
        C1C7U.LIZ("SmartReplyChatRoomIntroHandler@e989.triggerIntroBanner$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZ = C1505805uy.LIZ();
        C1684506ih c1684506ih = new C1684506ih();
        c1684506ih.LIZLLL(50);
        c1684506ih.LIZLLL = C2286608xc.LJFF(0L);
        c1684506ih.LIZJ = strLIZ;
        c1684506ih.LJFF = "";
        C0Y8T c0y8t = this.LLILLJJLI;
        if (c0y8t != null && (lastShowMessage = c0y8t.getLastShowMessage()) != null) {
            c1684506ih.LJ = lastShowMessage;
        }
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            String conversationId = this.LL.LLILZ.LJI.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            SessionInfo sessionInfo = this.LL.LLILZ.LJI;
            if (sessionInfo == null || (uuid2 = sessionInfo.getUuid()) == null) {
                uuid2 = "";
            }
            c1736806r8LIZIZ = fakeMsgOperatorService.LIZIZ(conversationId, c1684506ih, uuid2, null, null);
        } else {
            c1736806r8LIZIZ = null;
        }
        C1500205u4 c1500205u4 = C1500205u4.LLILLJJLI;
        c1500205u4.getClass();
        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) C1500205u4.LLJI.getValue();
        if (interfaceC1411705fn != null) {
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi != null) {
                jCurrentTimeMillis = iMHostApi.LIZIZ();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            if (iMHostApi2 != null) {
                jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
            } else {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            interfaceC1411705fn.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, "");
        }
        if (c1736806r8LIZIZ != null && (c869590Y9l2 = c1736806r8LIZIZ.LIZJ) != null) {
            SessionInfo sessionInfo2 = this.LL.LLILZ.LJI;
            if (sessionInfo2 == null || (uuid = sessionInfo2.getUuid()) == null) {
                uuid = "";
            }
            synchronized (c1500205u4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setCurrentBannerMsg: ");
                sbLIZ.append(c869590Y9l2);
                C2188811AlT.LIZIZ(sbLIZ);
                C1500205u4.LLILZLL = c869590Y9l2;
                C1500205u4.LLIZ = uuid;
            }
        }
        Objects.toString(c1736806r8LIZIZ);
        if (c1736806r8LIZIZ != null && (c869590Y9l = c1736806r8LIZIZ.LIZJ) != null) {
            c869590Y9l.getUuid();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplyChatRoomIntroHandler@e989.triggerIntroBanner$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
