package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import java.util.Collections;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS53S1000000_2;

/* JADX INFO: renamed from: X.067J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C067J extends C06O6<C06OO> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1600706On LLILZ;
    public final C1598906Nv LLILZIL;
    public final Set<C067L> LLILZLL;
    public final Set<EnumC1596306Mv> LLIZ;
    public final C054G LLIZLLLIL;
    public volatile C1598406Nq LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C067J.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C06O6
    public final boolean LIZLLL() {
        C01GW c01gw = C1226504r1.LIZ;
        return C1226504r1.LIZIZ;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLILZIL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLILZLL;
    }

    public C067J(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = new C1598906Nv(new C06ME());
        this.LLILZLL = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS, C067L.GROUP});
        this.LLIZ = Collections.singleton(EnumC1596306Mv.SMART_REPLY_INTRO_BANNER);
        C1598406Nq c1598406Nq = this.LLJ;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLJ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLJ = c1598406Nq;
                }
            }
        }
        this.LLIZLLLIL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        String str;
        SessionInfo sessionInfo;
        C06AH c06ah;
        IMNoticeMsgStruct iMNoticeMsgStruct;
        if ((c06oo instanceof C06AH) && (c06ah = (C06AH) c06oo) != null && (iMNoticeMsgStruct = c06ah.LIZJ) != null) {
            str = iMNoticeMsgStruct.noticeCode;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDismiss: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("IMAI-");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1500205u4 c1500205u4 = C1500205u4.LLILLJJLI;
        C1600706On c1600706On = this.LLILZ;
        if (c1600706On != null && (sessionInfo = c1600706On.LJI) != null) {
            AwS53S1000000_2 awS53S1000000_2 = new AwS53S1000000_2(str, 14);
            c1500205u4.getClass();
            C23250099c.LIZLLL(C1500205u4.LLILZ, null, null, new C1504705un(sessionInfo, awS53S1000000_2, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // X.C06O6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C06OO r6, X.InterfaceC1364105Vn<? super X.C06OJ> r7) {
        /*
            r5 = this;
            boolean r0 = X.C1226504r1.LIZIZ
            if (r0 != 0) goto L22
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "SmartReplyEntranceExp is not enable"
            r2.<init>(r1, r0)
        Ld:
            java.lang.Object r0 = r2.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r1 = r2.getSecond()
            java.lang.String r1 = (java.lang.String) r1
            if (r0 == 0) goto L8e
            X.06OI r0 = X.C06OI.LIZ
            return r0
        L22:
            X.05u4 r1 = X.C1500205u4.LLILLJJLI
            X.06On r0 = r5.LLILZ
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LJI
            java.lang.String r0 = r0.getConversationId()
            java.lang.String r4 = ""
            if (r0 != 0) goto L31
            r0 = r4
        L31:
            r1.getClass()
            boolean r0 = X.C1500205u4.LIZ(r0)
            if (r0 != 0) goto L44
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "Conversation is not valid"
            r2.<init>(r1, r0)
            goto Ld
        L44:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = X.C1500205u4.LLILZIL
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L84
            X.01GW r0 = X.C1500205u4.LLJI
            java.lang.Object r3 = r0.getValue()
            X.05fn r3 = (X.InterfaceC1411705fn) r3
            if (r3 == 0) goto L7c
            java.lang.String r2 = ""
            java.lang.Class<com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi> r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = (com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi) r0
            if (r0 == 0) goto L77
            long r0 = r0.LIZIZ()
        L67:
            boolean r0 = r3.LIZIZ(r0, r2)
            if (r0 == 0) goto L7c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "Exist intro banner showed"
            r2.<init>(r1, r0)
            goto Ld
        L77:
            long r0 = java.lang.System.currentTimeMillis()
            goto L67
        L7c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r0, r4)
            goto Ld
        L84:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "Not meet show condition"
            r2.<init>(r1, r0)
            goto Ld
        L8e:
            X.06OH r0 = new X.06OH
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C067J.LJIIIIZZ(X.06OO, X.05Vn):java.lang.Object");
    }

    @Override // X.C06O6
    public final Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean z = c06oo instanceof C06AH;
        synchronized (this) {
            C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C1505605uw(this, C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZ.LJI.getConversationId()), null), 3);
        }
        return Unit.LIZ;
    }
}
