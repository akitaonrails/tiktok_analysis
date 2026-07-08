package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMessageAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z47, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMReadMessageAnalytics$reportReadMessage$1", f = "IMReadMessageAnalytics.kt", l = {123, 180}, m = "invokeSuspend")
public final class C0Z47 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C869590Y9l LLILLJJLI;
    public IIMMessageAnalytics LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C869590Y9l LLILZLL;
    public final /* synthetic */ C0ZCG LLIZ;
    public final /* synthetic */ SessionInfo LLIZLLLIL;
    public final /* synthetic */ InterfaceC1493105sv LLJ;
    public final /* synthetic */ InterfaceC874680YTa LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z47(C869590Y9l c869590Y9l, C0ZCG c0zcg, SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv, InterfaceC874680YTa interfaceC874680YTa, InterfaceC1364105Vn<? super C0Z47> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c869590Y9l;
        this.LLIZ = c0zcg;
        this.LLIZLLLIL = sessionInfo;
        this.LLJ = interfaceC1493105sv;
        this.LLJI = interfaceC874680YTa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0Z47 c0z47 = new C0Z47(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0z47.LLILZIL = obj;
        return c0z47;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0255  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z47.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
