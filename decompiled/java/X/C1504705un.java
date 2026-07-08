package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.SmartReplyIntroBannerUtil$deleteCurrentBanner$1", f = "SmartReplyIntroBannerUtil.kt", l = {271}, m = "invokeSuspend")
public final class C1504705un extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public SessionInfo LLILLJJLI;
    public Function1 LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ SessionInfo LLILZLL;
    public final /* synthetic */ Function1<String, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1504705un(SessionInfo sessionInfo, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C1504705un> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = sessionInfo;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1504705un c1504705un = new C1504705un(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1504705un.LLILZIL = obj;
        return c1504705un;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        SessionInfo sessionInfo;
        Function1<String, Unit> function1;
        C1684506ih c1684506ih;
        C869590Y9l c869590Y9l;
        String uuid;
        Unit unit;
        String conversationId;
        String uuid2;
        String conversationId2;
        C1C7U.LIZ("SmartReplyIntroBannerUtil@62a5.deleteCurrentBanner$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                function1 = this.LLILLL;
                sessionInfo = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILZIL;
            c1dev = C1500205u4.LLJ;
            sessionInfo = this.LLILZLL;
            function1 = this.LLIZ;
            this.LLILZIL = obj2;
            this.LL = c1dev;
            this.LLILLJJLI = sessionInfo;
            this.LLILLL = function1;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("SmartReplyIntroBannerUtil@62a5.deleteCurrentBanner$1");
                return objLJFF;
            }
        }
        try {
            c1684506ih = new C1684506ih();
            c1684506ih.LIZLLL(48);
            c869590Y9l = C1500205u4.LLILZLL;
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (c869590Y9l != null && (uuid = c869590Y9l.getUuid()) != null) {
            c1684506ih.LIZJ = uuid;
            FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
            if (fakeMsgOperatorService != null) {
                C869590Y9l c869590Y9l2 = C1500205u4.LLILZLL;
                String str = "";
                if (c869590Y9l2 == null || (conversationId = c869590Y9l2.getConversationId()) == null) {
                    conversationId = "";
                }
                if ((sessionInfo == null || (uuid2 = sessionInfo.getUuid()) == null) && (uuid2 = C1500205u4.LLIZ) == null) {
                    Unit unit2 = Unit.LIZ;
                    c1dev.LIZIZ(null);
                    C1C7U.LIZIZ("SmartReplyIntroBannerUtil@62a5.deleteCurrentBanner$1");
                    return unit2;
                }
                fakeMsgOperatorService.LIZ(conversationId, c1684506ih, uuid2, null);
                C869590Y9l c869590Y9l3 = C1500205u4.LLILZLL;
                if (c869590Y9l3 != null && (conversationId2 = c869590Y9l3.getConversationId()) != null) {
                    str = conversationId2;
                }
                function1.invoke(str);
                C1500205u4 c1500205u4 = C1500205u4.LLILLJJLI;
                C1500205u4.LLILZLL = null;
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
            c1dev.LIZIZ(null);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SmartReplyIntroBannerUtil@62a5.deleteCurrentBanner$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        c1dev.LIZIZ(null);
        C1C7U.LIZIZ("SmartReplyIntroBannerUtil@62a5.deleteCurrentBanner$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
