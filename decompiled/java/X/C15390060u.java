package X;

import android.content.Context;
import android.util.LruCache;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.AiReplySingleChatAbilityAssem;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.slot.FeedBackReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S2100000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS90S0110000_2;
import kotlin.jvm.internal.AwS98S1200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15390060u implements InterfaceC1693306k7, C1DW6 {
    public static final C15390060u LL = new C15390060u();
    public static final int LLILLJJLI = C062L.BOT_SCENE_SMART_REPLY.getValue();

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.InterfaceC1693306k7
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1693306k7
    public final C13IQ<? extends AbstractC738140SxQ> LJJIIZ() {
        return C13LE.LIZ(AiReplySingleChatAbilityAssem.class);
    }

    @Override // X.InterfaceC1693306k7
    public final Map<String, String> LJJJIL() {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("is_enable_smart_reply", C1223404qW.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("entrance_exp", String.valueOf(((Number) C1226504r1.LIZ.getValue()).intValue()));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.InterfaceC1693306k7
    public final void onBootFinish() {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    @Override // X.InterfaceC1693306k7
    public final void LIZ() {
        C15408061m.LIZ.getClass();
        C15407061l c15407061l = C15408061m.LIZIZ;
        c15407061l.getClass();
        C15404061i c15404061i = c15407061l.LLILLJJLI;
        Iterator<T> it2 = c15404061i.LIZ.LIZJ().values().iterator();
        while (it2.hasNext()) {
            ((C08I7) it2.next()).LIZ();
        }
        c15404061i.LIZ.LIZ();
        synchronized (c15407061l.LLILZIL) {
            try {
                ((ArrayList) c15407061l.LLILZIL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1693306k7
    public final void LIZIZ() {
        Keva keva = C1535905zp.LIZ;
        if (keva != null) {
            keva.clear();
        }
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJIIZILJ() {
        InterfaceC1712506nD interfaceC1712506nDLJFF;
        C061D c061dLJIILIIL;
        if (!C1223404qW.LIZIZ) {
            return false;
        }
        boolean z = AnonymousClass0611.LIZIZ;
        if (!z) {
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            if (!c19212010Ec.LJJZZI() && c19212010Ec.LIZJ() != C05RV.PRO_CREATOR_INBOX) {
                return false;
            }
        } else if (C19212010Ec.LIZJ.LIZJ() != C05RV.PRO_CREATOR_INBOX) {
            return false;
        }
        if (AnonymousClass0610.LIZ()) {
            IIMBusinessChatService.LIZ.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService == null || (c061dLJIILIIL = iIMBusinessChatService.LJIILIIL()) == null) {
                return false;
            }
            return c061dLJIILIIL.LIZ(C061C.SMART_REPLY);
        }
        InterfaceC1712506nD.LIZ.getClass();
        IMUser iMUserLIZ = AnonymousClass0613.LIZ();
        if (iMUserLIZ == null) {
            return false;
        }
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService2 = C1668706g9.LIZIZ;
        if (iIMBusinessChatService2 == null || (interfaceC1712506nDLJFF = iIMBusinessChatService2.LJFF()) == null) {
            return false;
        }
        if (!z ? !(C19212010Ec.LIZJ.LJJZZI() || interfaceC1712506nDLJFF.LIZ(iMUserLIZ) || interfaceC1712506nDLJFF.LJIIIIZZ(iMUserLIZ)) : !interfaceC1712506nDLJFF.LIZ(iMUserLIZ)) {
            return interfaceC1712506nDLJFF.LJIILJJIL(iMUserLIZ);
        }
        return false;
    }

    @Override // X.InterfaceC1693306k7
    public final Map<String, String> LJJJI() {
        C1508705vR.LL.getClass();
        return C1508705vR.LIZJ();
    }

    @Override // X.InterfaceC1693306k7
    public final void c() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C15381060l(null), 3);
    }

    public C15390060u() {
        C0ZXP c0zxp = C0ZXP.LIZ;
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJJIIZI() {
        IMAIBotInfo iMAIBotInfoLIZIZ = C1503105uX.LIZIZ();
        if (iMAIBotInfoLIZIZ == null) {
            if (((Number) C108700b7.LIZ.getValue()).intValue() != 1) {
                return false;
            }
        } else if (iMAIBotInfoLIZIZ.mode != C062G.BOT_MODE_FULLY_MANAGED.getValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1693306k7
    public final InterfaceC1890940zJ6 LJJIFFI() {
        return C15389060t.LLILLL;
    }

    @Override // X.InterfaceC1693306k7
    public final long LIZLLL(boolean z) {
        if (!LJIIZILJ()) {
            return 0L;
        }
        IMAIBotInfo iMAIBotInfoLIZIZ = C1503105uX.LIZIZ();
        if ((iMAIBotInfoLIZIZ == null || iMAIBotInfoLIZIZ.status != C062E.BOT_STATUS_WORKING.getValue()) && (!z || iMAIBotInfoLIZIZ == null || iMAIBotInfoLIZIZ.status != C062E.BOT_STATUS_CREATING.getValue())) {
            return 0L;
        }
        return iMAIBotInfoLIZIZ.id;
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJ(C869590Y9l c869590Y9l) {
        C15393060x c15393060x = C15393060x.LIZ;
        return C15393060x.LIZJ(c869590Y9l);
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJI(C869590Y9l c869590Y9l) {
        C15393060x c15393060x = C15393060x.LIZ;
        return C15393060x.LIZIZ(c869590Y9l);
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJIIIZ(C0Y8T c0y8t) {
        return C15395060z.LIZ(c0y8t);
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJIIJ(C0Y8T c0y8t) {
        Map<String, String> ext;
        String str;
        C0Y8Y coreInfo = c0y8t.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null && (str = ext.get("a:reject_message_request")) != null) {
            return Intrinsics.LJFF(str, "1");
        }
        return false;
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIIJJI(EnumC1684406ig enumC1684406ig) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1500105u3(enumC1684406ig, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJIJ(C869590Y9l c869590Y9l) {
        if (!C1208404o6.LIZIZ || c869590Y9l.getMsgType() == 1809) {
            return false;
        }
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            if (LIZLLL(false) == 0 || !C15395060z.LIZIZ(c869590Y9l)) {
                return false;
            }
            return true;
        }
        return C15395060z.LIZIZ(c869590Y9l);
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJIJJ(C0Y8T c0y8t) {
        if (c0y8t == null || !C15395060z.LIZ(c0y8t) || !C882340YjQ.LJI(c0y8t)) {
            return false;
        }
        return C15395060z.LIZJ(c0y8t);
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJIL(String str) {
        C0Y8T c0y8tLIZ;
        String str2;
        Map<String, String> ext;
        if (C0YNP.LJI(str) != 5 || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) == null) {
            return false;
        }
        C0Y8Y coreInfo = c0y8tLIZ.getCoreInfo();
        if (coreInfo != null && (ext = coreInfo.getExt()) != null) {
            str2 = ext.get("a:bot_type");
        } else {
            str2 = null;
        }
        return Intrinsics.LJFF(str2, "smart_reply");
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJJ(C0Y8T c0y8t) {
        return C15395060z.LIZJ(c0y8t);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJI(String str) {
        C15393060x c15393060x = C15393060x.LIZ;
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!Intrinsics.LJFF(C15393060x.LIZJ, strLIZIZ)) {
            C15393060x.LIZIZ.evictAll();
        }
        C15393060x.LIZIZ.put(str, Boolean.TRUE);
        c15393060x.LIZ(strLIZIZ).storeBoolean(str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    @Override // X.InterfaceC1693306k7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIII(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C15394060y
            if (r0 == 0) goto L57
            r4 = r6
            X.060y r4 = (X.C15394060y) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L42
            if (r0 != r2) goto L5d
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "delete status="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "IMSmartReplyService"
            X.C062H.LIZIZ(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L42:
            X.C155000ia.LIZIZ(r1)
            X.061m r0 = X.C15408061m.LIZ
            int r1 = X.C15390060u.LLILLJJLI
            r4.LLILLL = r2
            r0.getClass()
            X.061l r0 = X.C15408061m.LIZIZ
            java.lang.Object r1 = r0.LIZIZ(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L57:
            X.060y r4 = new X.060y
            r4.<init>(r5, r6)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15390060u.LJJIII(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJJIIJ(C869590Y9l c869590Y9l) {
        return C15395060z.LIZIZ(c869590Y9l);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJIJIIJI(C06WF c06wf) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1503005uW(c06wf, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final AbstractC899510ZQn<?, ?> LJJIJIIJIL(SessionInfo sessionInfo) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId());
        if (c0y8tLIZ != null) {
            IMAIServiceAPI.LIZ.getClass();
            if (AnonymousClass0629.LIZ().LIZ().LJIIIZ(c0y8tLIZ)) {
                return new AbstractC899510ZQn<FeedBackReusedSkeletonUIContent, C0ZR2>() { // from class: X.0ZQw
                    {
                        new C899530ZQp(C13LE.LIZ(FeedBackReusedSkeletonUIContent.class), R.layout.co6);
                    }

                    @Override // X.AbstractC899510ZQn
                    public final C461020I6a<C0ZR2> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                        IMAIServiceAPI.LIZ.getClass();
                        boolean zLJJIIJZLJL = AnonymousClass0629.LIZ().LIZ().LJJIIJZLJL(list, c869590Y9l, i);
                        return new C461020I6a<>(new C0ZR2(zLJJIIJZLJL, EnumC899620ZQy.SMART_REPLY, AnonymousClass0629.LIZ().LIZ().LJ(c869590Y9l), AnonymousClass0629.LIZ().LIZ().LJI(c869590Y9l)), zLJJIIJZLJL);
                    }
                };
            }
        }
        return new AbstractC899510ZQn<FeedBackReusedSkeletonUIContent, C0ZR2>() { // from class: X.0ZQx
            {
                new C899530ZQp(C13LE.LIZ(FeedBackReusedSkeletonUIContent.class), R.layout.co6);
            }

            @Override // X.AbstractC899510ZQn
            public final C461020I6a<C0ZR2> LIZ(List<? extends C869590Y9l> list, C869590Y9l c869590Y9l, int i) {
                boolean zLIZ = C1668706g9.LIZ(IIMBusinessChatService.LIZ).getFeedbackService().LIZ(c869590Y9l, list);
                return new C461020I6a<>(new C0ZR2(zLIZ, EnumC899620ZQy.B2C, false, false), zLIZ);
            }
        };
    }

    @Override // X.InterfaceC1693306k7
    public final Map<String, String> LJJIJIL(C869590Y9l c869590Y9l) {
        String str;
        if (C15395060z.LIZIZ(c869590Y9l)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        return C2097908Jt.LIZJ(new Pair("is_ai_auto_reply", str));
    }

    @Override // X.InterfaceC1693306k7
    public final C06O6<C06OO> LJJIL(C1600706On c1600706On) {
        return new C067J(c1600706On);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJFF(C869590Y9l c869590Y9l, Map<String, String> map) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C061B(c869590Y9l, map, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final C0Z2Q LJII(C0ZQ1 c0zq1, C869590Y9l c869590Y9l) {
        AnonymousClass0614.LIZ.getClass();
        switch (C0ZQ2.LIZ[c0zq1.ordinal()]) {
            case 1:
                if (c869590Y9l != null && C15395060z.LIZIZ(c869590Y9l)) {
                    return new C0Z2Q(true, new C401790FpB(), null, null, 12);
                }
                break;
            case 2:
                if (c869590Y9l != null && C15395060z.LIZIZ(c869590Y9l) && !LL.LJIL(c869590Y9l.getConversationId())) {
                    return new C0Z2Q(true, null, AnonymousClass0614.LIZJ(), null, 10);
                }
                break;
            case 3:
                if (c869590Y9l != null && C15395060z.LIZIZ(c869590Y9l)) {
                    return new C0Z2Q(true, null, null, new AwS546S0100000_2(c869590Y9l, 990), 6);
                }
                break;
            case 4:
                if (c869590Y9l != null && !C0ZDX.LJJJJIZL(c869590Y9l) && C15395060z.LIZIZ(c869590Y9l)) {
                    return new C0Z2Q(true, AnonymousClass0614.LIZ(2.0f, R.attr.zp), null, null, 12);
                }
                break;
            case 5:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(5.0f, R.attr.c3), null, null, 12);
            case 6:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(6.0f, R.attr.bx), null, null, 12);
            case 7:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(5.0f, R.attr.zp), null, null, 12);
            case 8:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(2.0f, R.attr.bx), null, null, 12);
            case BdTuring.TYPE_ECAF /* 9 */:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(2.0f, R.attr.zp), null, null, 12);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(2.0f, R.attr.zp), null, null, 12);
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (c869590Y9l != null && C15395060z.LIZIZ(c869590Y9l) && !LL.LJIL(c869590Y9l.getConversationId())) {
                    return new C0Z2Q(true, null, AnonymousClass0614.LIZJ(), null, 10);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return new C0Z2Q(true, null, AnonymousClass0614.LIZJ(), null, 10);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new C0Z2Q(false, null, null, null, 14);
            case 14:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(2.0f, R.attr.zp), null, null, 12);
            case 15:
                return new C0Z2Q(true, AnonymousClass0614.LIZ(3.0f, R.attr.a1b), null, new AwS546S0100000_2(c869590Y9l, 991), 4);
            default:
                throw new C1954807lC();
        }
        return new C0Z2Q(false, null, null, null, 14);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIIIIZZ(EnumC1684406ig enumC1684406ig, boolean z) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1499705tz(enumC1684406ig, z, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIIL(EnumC1684406ig enumC1684406ig, boolean z) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1499805u0(enumC1684406ig, z, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIILIIL(EnumC1684406ig enumC1684406ig, boolean z) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1500005u2(enumC1684406ig, z, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIJI(Context context, boolean z) {
        C888370Yt9.LIZ.getClass();
        C1503105uX.LIZ(new C060I(context, "inbox_messaging_setting", "notification_page", z));
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIJJLI(C869590Y9l c869590Y9l, Map<String, String> map) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C061A(c869590Y9l, map, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJII(EnumC1684406ig enumC1684406ig, boolean z) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1499905u1(enumC1684406ig, z, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJIJ(Context context, EnumC1684406ig enumC1684406ig) {
        C888370Yt9.LIZ.getClass();
        C1503105uX.LIZ(new AwS368S0200000_2(context, enumC1684406ig, 89));
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJIZ(Context context, boolean z) {
        C888370Yt9.LIZ.getClass();
        C1503105uX.LIZ(new AwS90S0110000_2(context, z, 4));
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIILJJIL(EnumC1705606m6 enumC1705606m6, String str, List list) {
        C1503105uX.LIZ(new AwS98S1200000_14(enumC1705606m6, str, list, 11));
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIILL(long j, AnonymousClass0622 anonymousClass0622, Function2<? super InterfaceC1256904vv, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1514705wP(function2, j, anonymousClass0622, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final boolean LJJIIJZLJL(List list, C869590Y9l c869590Y9l, int i) {
        boolean zBooleanValue;
        Object next;
        IMAIServiceAPI.LIZ.getClass();
        InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
        if (!C0ZDX.LJJJJIZL(c869590Y9l) || !interfaceC1693306k7LIZ.LJJIIJ(c869590Y9l) || interfaceC1693306k7LIZ.LIZLLL(false) == 0) {
            return false;
        }
        if (C1208404o6.LIZIZ) {
            if (c869590Y9l.getMsgType() == 1809) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C869590Y9l c869590Y9l2 = (C869590Y9l) obj;
                if (C0ZDX.LJJJJIZL(c869590Y9l2) && interfaceC1693306k7LIZ.LJJIIJ(c869590Y9l2)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    long createdAt = ((C869590Y9l) next).getCreatedAt();
                    do {
                        Object next2 = it2.next();
                        long createdAt2 = ((C869590Y9l) next2).getCreatedAt();
                        if (createdAt < createdAt2) {
                            next = next2;
                            createdAt = createdAt2;
                        }
                    } while (it2.hasNext());
                }
            }
            C869590Y9l c869590Y9l3 = (C869590Y9l) next;
            if (c869590Y9l3 == null || c869590Y9l3.getCreatedAt() != c869590Y9l.getCreatedAt()) {
                return false;
            }
            return true;
        }
        String uuid = c869590Y9l.getUuid();
        C15393060x c15393060x = C15393060x.LIZ;
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!Intrinsics.LJFF(C15393060x.LIZJ, strLIZIZ)) {
            C15393060x.LIZIZ.evictAll();
        }
        LruCache<String, Boolean> lruCache = C15393060x.LIZIZ;
        Boolean bool = lruCache.get(uuid);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = c15393060x.LIZ(strLIZIZ).getBoolean(uuid, false);
            lruCache.put(uuid, Boolean.valueOf(zBooleanValue));
        }
        if (zBooleanValue) {
            return false;
        }
        C869590Y9l c869590Y9l4 = (C869590Y9l) C13LP.LJJJLZIJ(i - 1, list);
        if ((c869590Y9l4 == null || interfaceC1693306k7LIZ.LJJIIJ(c869590Y9l4)) && !C0ZOT.LIZIZ(c869590Y9l, c869590Y9l4)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJIJL(C19EG c19eg, String str, String str2) {
        C888370Yt9.LIZ.getClass();
        if (LL.LJJIIZI()) {
            C1503105uX.LIZ(new AwS31S2100000_2(c19eg, str2, str, 4));
        }
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJIJLIJ(String str, String str2, boolean z) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1498405tm(str2, str, z, null), 3);
    }

    @Override // X.InterfaceC1693306k7
    public final void LJJJ(String str, String str2, boolean z) {
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1498205tk(str2, str, z, null), 3);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        IIMCoreProxyService iIMCoreProxyService;
        C0YHX c0yhxLIZ;
        InterfaceC870590YDh interfaceC870590YDhLJIIJ;
        C1508705vR.LL.getClass();
        if (list != null) {
            ArrayList<C869590Y9l> arrayList = new ArrayList();
            for (C869590Y9l c869590Y9l : list) {
                if (C15395060z.LIZIZ(c869590Y9l)) {
                    arrayList.add(c869590Y9l);
                }
            }
            for (C869590Y9l c869590Y9l2 : arrayList) {
                C15392060w.LIZ.getClass();
                String strLIZ = C15392060w.LIZ(c869590Y9l2);
                if (strLIZ != null && (iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpi$default(IIMCoreProxyService.class, false, false, false, 14, null)) != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (interfaceC870590YDhLJIIJ = c0yhxLIZ.LJIIJ()) != null) {
                    interfaceC870590YDhLJIIJ.LLII(c869590Y9l2.getUuid(), c869590Y9l2.getConversationId(), "ai_reply_message_id", strLIZ);
                }
                if (AnonymousClass0612.LIZIZ && C0ZDX.LJJJJIZL(c869590Y9l2)) {
                    C0YNP.LIZIZ(c869590Y9l2.getConversationId()).LJIJJLI(null);
                }
            }
        }
    }

    @Override // X.InterfaceC1693306k7
    public final void LJIILLIIL(Context context, C869590Y9l c869590Y9l, boolean z, String str) {
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1535605zm(c869590Y9l, str, null), 3);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1536405zu(c869590Y9l, str, context, null), 3);
        }
    }
}
