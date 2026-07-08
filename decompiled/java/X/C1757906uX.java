package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMessageModelFactory;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1757906uX extends C2217421BqW implements Function1<C1758406uc, InterfaceC1755906uD> {
    public C1757906uX(C907050ZiB c907050ZiB) {
        super(1, c907050ZiB, C907050ZiB.class, "create", "create$im_message_model_release(Lcom/ss/android/ugc/aweme/im/sdk/chat/controller/utils/ext/CreateMessageModelData;)Lcom/bytedance/ies/im/core/api/client/MessageModel;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMessageModelFactory] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.06u1] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.06uD] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.06uD] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.06uD] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.06uD] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.06uD] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.06uD] */
    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1755906uD invoke(C1758406uc c1758406uc) {
        boolean z;
        final InterfaceC1755906uD interfaceC1755906uDLIZ;
        final C0Y8T c0y8tLJ;
        C1758406uc c1758406uc2 = c1758406uc;
        this.receiver.getClass();
        String str = c1758406uc2.LIZ;
        IMSaasHostOfflineDebugService.LIZ.getClass();
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ = C0Z40.LIZIZ();
        boolean z2 = true;
        if (iMSaasHostOfflineDebugServiceLIZIZ != null && iMSaasHostOfflineDebugServiceLIZIZ.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (z && (c0y8tLJ = C0YNP.LIZIZ(str).LJ()) != null) {
            interfaceC1755906uDLIZ = new InterfaceC1755906uD(c0y8tLJ) { // from class: X.06ua
                public static final /* synthetic */ int LJ = 0;
                public final C0Y8T LIZIZ;
                public int LIZJ = 100;
                public final Set<C1DW6> LIZLLL = new LinkedHashSet();

                @Override // X.InterfaceC1755906uD
                public final void LIZJ(long j) {
                }

                @Override // X.InterfaceC1755906uD
                public final void LJ() {
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJI() {
                    return true;
                }

                @Override // X.InterfaceC1755906uD
                public final C869590Y9l LJIIIIZZ() {
                    return null;
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJIIIZ() {
                    return false;
                }

                @Override // X.InterfaceC1755906uD
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1755906uD
                public final void LJIIL() {
                }

                @Override // X.InterfaceC1755906uD
                public final C869590Y9l LJIILJJIL() {
                    return null;
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJIJ() {
                    return true;
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJJJJI() {
                    return true;
                }

                @Override // X.InterfaceC1755906uD
                public final void resume() {
                }

                @Override // X.InterfaceC1755906uD
                public final void stop() {
                }

                @Override // X.InterfaceC1755906uD
                public final List<C869590Y9l> LIZLLL() {
                    List<C869590Y9l> listLJIIZILJ;
                    IMSaasHostOfflineDebugService.LIZ.getClass();
                    IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ2 = C0Z40.LIZIZ();
                    return (iMSaasHostOfflineDebugServiceLIZIZ2 == null || (listLJIIZILJ = iMSaasHostOfflineDebugServiceLIZIZ2.LJIIZILJ(getConversationId(), this.LIZLLL)) == null) ? C13BV.INSTANCE : listLJIIZILJ;
                }

                @Override // X.InterfaceC1755906uD
                public final void LJJIZ() {
                    this.LIZLLL.clear();
                }

                @Override // X.InterfaceC1755906uD
                public final String getConversationId() {
                    return this.LIZIZ.getConversationId();
                }

                @Override // X.InterfaceC1755906uD
                public final void refresh() {
                    Iterator<C1DW6> it2 = this.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(1, null, new ArrayList(LIZLLL()), null);
                    }
                }

                @Override // X.InterfaceC1755906uD
                public final int LJJJJIZL() {
                    return this.LIZJ;
                }

                {
                    this.LIZIZ = c0y8tLJ;
                }

                @Override // X.InterfaceC1755906uD
                public final void LIZ(C1DW6 c1dw6) {
                    this.LIZLLL.add(c1dw6);
                }

                @Override // X.InterfaceC1755906uD
                public final Object LIZIZ(C912530Zr1 c912530Zr1) {
                    return C13BV.INSTANCE;
                }

                @Override // X.InterfaceC1755906uD
                public final void LJFF(C1DW6 c1dw6) {
                    this.LIZLLL.remove(c1dw6);
                }

                @Override // X.InterfaceC1755906uD
                public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
                    return C13BV.INSTANCE;
                }

                @Override // X.InterfaceC1755906uD
                public final void LJIIJJI(int i) {
                    this.LIZJ = i;
                }
            };
        } else {
            C0YNQ c0ynq = InterfaceC1755906uD.LIZ;
            String str2 = c1758406uc2.LIZ;
            if (c1758406uc2.LIZLLL == null) {
                z2 = false;
            }
            interfaceC1755906uDLIZ = C0YNQ.LIZ(c0ynq, str2, z2, c1758406uc2.LJII, 8);
        }
        final ?? r3 = new InterfaceC1755906uD(interfaceC1755906uDLIZ) { // from class: X.06u1
            public final InterfaceC1755906uD LIZIZ;
            public final C1DW7 LIZJ;

            @Override // X.InterfaceC1755906uD
            public final Object LIZIZ(C912530Zr1 c912530Zr1) {
                return this.LIZIZ.LIZIZ(c912530Zr1);
            }

            @Override // X.InterfaceC1755906uD
            public final void LIZJ(long j) {
                this.LIZIZ.LIZJ(j);
            }

            @Override // X.InterfaceC1755906uD
            public final List<C869590Y9l> LIZLLL() {
                return this.LIZIZ.LIZLLL();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJ() {
                this.LIZIZ.LJ();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJFF(C1DW6 c1dw6) {
                this.LIZIZ.LJFF(c1dw6);
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJI() {
                return this.LIZIZ.LJI();
            }

            @Override // X.InterfaceC1755906uD
            public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
                return this.LIZIZ.LJII(interfaceC1364105Vn);
            }

            @Override // X.InterfaceC1755906uD
            public final C869590Y9l LJIIIIZZ() {
                return this.LIZIZ.LJIIIIZZ();
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJIIIZ() {
                return this.LIZIZ.LJIIIZ();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJIIJ() {
                this.LIZIZ.LJIIJ();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJIIJJI(int i) {
                this.LIZIZ.LJIIJJI(i);
            }

            @Override // X.InterfaceC1755906uD
            public final void LJIIL() {
                this.LIZIZ.LJIIL();
            }

            @Override // X.InterfaceC1755906uD
            public final C869590Y9l LJIILJJIL() {
                return this.LIZIZ.LJIILJJIL();
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJIJ() {
                return this.LIZIZ.LJIJ();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJJIZ() {
                this.LIZIZ.LJJIZ();
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJJJJI() {
                return this.LIZIZ.LJJJJI();
            }

            @Override // X.InterfaceC1755906uD
            public final int LJJJJIZL() {
                return this.LIZIZ.LJJJJIZL();
            }

            @Override // X.InterfaceC1755906uD
            public final String getConversationId() {
                return this.LIZIZ.getConversationId();
            }

            @Override // X.InterfaceC1755906uD
            public final void refresh() {
                this.LIZIZ.refresh();
            }

            @Override // X.InterfaceC1755906uD
            public final void resume() {
                this.LIZIZ.resume();
            }

            @Override // X.InterfaceC1755906uD
            public final void stop() {
                this.LIZIZ.stop();
            }

            {
                this.LIZIZ = interfaceC1755906uDLIZ;
                C1DW7 c1dw7 = new C1DW7(new C1DW6() { // from class: X.06Lb
                    @Override // X.C1DW6, X.InterfaceC868420Y4y
                    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
                    }

                    @Override // X.C1DW6, X.InterfaceC868420Y4y
                    public final void Jk(C869590Y9l c869590Y9l, int i) {
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
                    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
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
                    public final void ns(String str3) {
                    }

                    @Override // X.C1DW6, X.InterfaceC868420Y4y
                    public final void su(C869590Y9l c869590Y9l, boolean z3) {
                    }

                    @Override // X.C1DW6, X.InterfaceC868420Y4y
                    public final void u6(List<C869590Y9l> list, boolean z3) {
                    }

                    @Override // X.C1DW6
                    public final void yf1(C1DW6 c1dw6) {
                    }

                    @Override // X.C1DW6, X.InterfaceC868420Y4y
                    public final void a(int i, String str3, List list, Long l) {
                        IStreakService.LJJIIZ.getClass();
                        C06LY.LIZ().a(i, str3, list, l);
                    }
                });
                this.LIZJ = c1dw7;
                interfaceC1755906uDLIZ.LIZ(c1dw7);
            }

            @Override // X.InterfaceC1755906uD
            public final void LIZ(C1DW6 c1dw6) {
                ((CopyOnWriteArrayList) this.LIZJ.LLILLJJLI).add(c1dw6);
            }
        };
        final ?? r32 = r3;
        if (!c1758406uc2.LIZIZ) {
            r32 = r3;
            if (!c1758406uc2.LJI) {
                r32 = new InterfaceC1755906uD(r3) { // from class: X.06uB
                    public final InterfaceC1755906uD LIZIZ;
                    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1110));

                    @Override // X.InterfaceC1755906uD
                    public final void LIZ(C1DW6 c1dw6) {
                        this.LIZIZ.LIZ(c1dw6);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final Object LIZIZ(C912530Zr1 c912530Zr1) {
                        return this.LIZIZ.LIZIZ(c912530Zr1);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LIZJ(long j) {
                        this.LIZIZ.LIZJ(j);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJ() {
                        this.LIZIZ.LJ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJFF(C1DW6 c1dw6) {
                        this.LIZIZ.LJFF(c1dw6);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJI() {
                        return this.LIZIZ.LJI();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
                        return this.LIZIZ.LJII(interfaceC1364105Vn);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final C869590Y9l LJIIIIZZ() {
                        return this.LIZIZ.LJIIIIZZ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJIIIZ() {
                        return this.LIZIZ.LJIIIZ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJIIJ() {
                        this.LIZIZ.LJIIJ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJIIJJI(int i) {
                        this.LIZIZ.LJIIJJI(i);
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJIIL() {
                        this.LIZIZ.LJIIL();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final C869590Y9l LJIILJJIL() {
                        return this.LIZIZ.LJIILJJIL();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJIJ() {
                        return this.LIZIZ.LJIJ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void LJJIZ() {
                        this.LIZIZ.LJJIZ();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final boolean LJJJJI() {
                        return this.LIZIZ.LJJJJI();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final int LJJJJIZL() {
                        return this.LIZIZ.LJJJJIZL();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final String getConversationId() {
                        return this.LIZIZ.getConversationId();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void refresh() {
                        this.LIZIZ.refresh();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void resume() {
                        this.LIZIZ.resume();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final void stop() {
                        this.LIZIZ.stop();
                    }

                    @Override // X.InterfaceC1755906uD
                    public final List<C869590Y9l> LIZLLL() {
                        C0Y8T c0y8tLIZ;
                        ArrayList arrayList = new ArrayList(this.LIZIZ.LIZLLL());
                        if (!LJJJJI() || !this.LIZIZ.LIZLLL().isEmpty()) {
                            if (!LJIJ() || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LIZIZ.getConversationId())) == null) {
                                return arrayList;
                            }
                            if (!c0y8tLIZ.isStranger() && !c0y8tLIZ.isLocal() && c0y8tLIZ.hasMore()) {
                                return arrayList;
                            }
                        }
                        return C13LP.LJLIL(Collections.singletonList(this.LIZJ.getValue()), arrayList);
                    }

                    {
                        this.LIZIZ = r3;
                    }
                };
            }
        }
        ?? r33 = r32;
        if (!c1758406uc2.LIZIZ) {
            r33 = new InterfaceC1755906uD(r32) { // from class: X.06u9
                public final InterfaceC1755906uD LIZIZ;

                @Override // X.InterfaceC1755906uD
                public final void LIZ(C1DW6 c1dw6) {
                    this.LIZIZ.LIZ(c1dw6);
                }

                @Override // X.InterfaceC1755906uD
                public final Object LIZIZ(C912530Zr1 c912530Zr1) {
                    return this.LIZIZ.LIZIZ(c912530Zr1);
                }

                @Override // X.InterfaceC1755906uD
                public final void LIZJ(long j) {
                    this.LIZIZ.LIZJ(j);
                }

                @Override // X.InterfaceC1755906uD
                public final void LJ() {
                    this.LIZIZ.LJ();
                }

                @Override // X.InterfaceC1755906uD
                public final void LJFF(C1DW6 c1dw6) {
                    this.LIZIZ.LJFF(c1dw6);
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJI() {
                    return this.LIZIZ.LJI();
                }

                @Override // X.InterfaceC1755906uD
                public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
                    return this.LIZIZ.LJII(interfaceC1364105Vn);
                }

                @Override // X.InterfaceC1755906uD
                public final C869590Y9l LJIIIIZZ() {
                    return this.LIZIZ.LJIIIIZZ();
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJIIIZ() {
                    return this.LIZIZ.LJIIIZ();
                }

                @Override // X.InterfaceC1755906uD
                public final void LJIIJ() {
                    this.LIZIZ.LJIIJ();
                }

                @Override // X.InterfaceC1755906uD
                public final void LJIIJJI(int i) {
                    this.LIZIZ.LJIIJJI(i);
                }

                @Override // X.InterfaceC1755906uD
                public final void LJIIL() {
                    this.LIZIZ.LJIIL();
                }

                @Override // X.InterfaceC1755906uD
                public final C869590Y9l LJIILJJIL() {
                    return this.LIZIZ.LJIILJJIL();
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJIJ() {
                    return this.LIZIZ.LJIJ();
                }

                @Override // X.InterfaceC1755906uD
                public final void LJJIZ() {
                    this.LIZIZ.LJJIZ();
                }

                @Override // X.InterfaceC1755906uD
                public final boolean LJJJJI() {
                    return this.LIZIZ.LJJJJI();
                }

                @Override // X.InterfaceC1755906uD
                public final int LJJJJIZL() {
                    return this.LIZIZ.LJJJJIZL();
                }

                @Override // X.InterfaceC1755906uD
                public final String getConversationId() {
                    return this.LIZIZ.getConversationId();
                }

                @Override // X.InterfaceC1755906uD
                public final void refresh() {
                    this.LIZIZ.refresh();
                }

                @Override // X.InterfaceC1755906uD
                public final void resume() {
                    this.LIZIZ.resume();
                }

                @Override // X.InterfaceC1755906uD
                public final void stop() {
                    this.LIZIZ.stop();
                }

                @Override // X.InterfaceC1755906uD
                public final List<C869590Y9l> LIZLLL() {
                    List<C869590Y9l> listLIZLLL = this.LIZIZ.LIZLLL();
                    ArrayList arrayList = new ArrayList();
                    for (C869590Y9l c869590Y9l : listLIZLLL) {
                        C869590Y9l c869590Y9l2 = c869590Y9l;
                        if (c869590Y9l2 == null || c869590Y9l2.getMsgType() != 15) {
                            arrayList.add(c869590Y9l);
                        }
                    }
                    return arrayList;
                }

                {
                    this.LIZIZ = r32;
                }
            };
        }
        ?? r1 = (FakeMessageModelFactory) PluggableExtentionKt.pluggableSpiForReal(FakeMessageModelFactory.class);
        ?? r34 = r33;
        if (r1 != 0) {
            C1755606uA c1755606uALIZ = r1.LIZ(r33, c1758406uc2.LJFF);
            r34 = r33;
            if (c1755606uALIZ != null) {
                r34 = c1755606uALIZ;
            }
        }
        ?? c1755006u4 = r34;
        if (C06FS.LIZ().enableInlineMsg) {
            c1755006u4 = new C1755006u4(r34, new C06YD(c1758406uc2.LIZ, c1758406uc2.LJFF));
        }
        ?? c1754606u0 = c1755006u4;
        if (c1758406uc2.LIZIZ) {
            c1754606u0 = new C1754606u0(c1755006u4, c1758406uc2.LIZ, c1758406uc2.LJFF);
        }
        ?? c1754506tz = c1754606u0;
        if (IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJIIZI()) {
            c1754506tz = c1754606u0;
            if (!c1758406uc2.LIZJ) {
                c1754506tz = new C1754506tz(c1758406uc2, c1754606u0);
            }
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c1758406uc2.LIZ);
        if (c0y8tLIZ != null) {
            lValueOf = Long.valueOf(c0y8tLIZ.getUnreadCount());
        }
        final C1757806uW c1757806uW = new C1757806uW(c1754506tz, c1758406uc2.LIZJ, String.valueOf(lValueOf));
        c1757806uW.LJIIJJI(20);
        InterfaceC1755906uD interfaceC1755906uD = new InterfaceC1755906uD(c1757806uW) { // from class: X.06uY
            public final InterfaceC1755906uD LIZIZ;
            public final Stack<C1DW6> LIZJ = new Stack<>();
            public final boolean LIZLLL = ((Boolean) C1758806ug.LIZ.getValue()).booleanValue();

            @Override // X.InterfaceC1755906uD
            public final Object LIZIZ(C912530Zr1 c912530Zr1) {
                return this.LIZIZ.LIZIZ(c912530Zr1);
            }

            @Override // X.InterfaceC1755906uD
            public final void LIZJ(long j) {
                this.LIZIZ.LIZJ(j);
            }

            @Override // X.InterfaceC1755906uD
            public final List<C869590Y9l> LIZLLL() {
                return this.LIZIZ.LIZLLL();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJ() {
                this.LIZIZ.LJ();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJFF(C1DW6 c1dw6) {
                this.LIZIZ.LJFF(c1dw6);
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJI() {
                return this.LIZIZ.LJI();
            }

            @Override // X.InterfaceC1755906uD
            public final Object LJII(InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
                return this.LIZIZ.LJII(interfaceC1364105Vn);
            }

            @Override // X.InterfaceC1755906uD
            public final C869590Y9l LJIIIIZZ() {
                return this.LIZIZ.LJIIIIZZ();
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJIIIZ() {
                return this.LIZIZ.LJIIIZ();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJIIJ() {
                this.LIZIZ.LJIIJ();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJIIJJI(int i) {
                this.LIZIZ.LJIIJJI(i);
            }

            @Override // X.InterfaceC1755906uD
            public final void LJIIL() {
                this.LIZIZ.LJIIL();
            }

            @Override // X.InterfaceC1755906uD
            public final C869590Y9l LJIILJJIL() {
                return this.LIZIZ.LJIILJJIL();
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJIJ() {
                return this.LIZIZ.LJIJ();
            }

            @Override // X.InterfaceC1755906uD
            public final boolean LJJJJI() {
                return this.LIZIZ.LJJJJI();
            }

            @Override // X.InterfaceC1755906uD
            public final int LJJJJIZL() {
                return this.LIZIZ.LJJJJIZL();
            }

            @Override // X.InterfaceC1755906uD
            public final String getConversationId() {
                return this.LIZIZ.getConversationId();
            }

            @Override // X.InterfaceC1755906uD
            public final void refresh() {
                this.LIZIZ.refresh();
            }

            @Override // X.InterfaceC1755906uD
            public final void resume() {
                this.LIZIZ.resume();
            }

            @Override // X.InterfaceC1755906uD
            public final void stop() {
                this.LIZIZ.stop();
            }

            @Override // X.InterfaceC1755906uD
            public final void LJJIZ() {
                C1DW6 c1dw6Pop = this.LIZJ.pop();
                if (this.LIZLLL && c1dw6Pop != null) {
                    this.LIZIZ.LJFF(c1dw6Pop);
                }
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ = C0Z53.LIZ();
                if (iMALogApiLIZ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MModelTrace store.unregisterAll store=");
                    sbLIZ.append(System.identityHashCode(this));
                    sbLIZ.append(" cid=");
                    sbLIZ.append(this.LIZIZ.getConversationId());
                    sbLIZ.append(" stackSizeAfterPop=");
                    sbLIZ.append(this.LIZJ.size());
                    sbLIZ.append(" willEvict=");
                    sbLIZ.append(this.LIZJ.empty());
                    iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (!this.LIZJ.empty()) {
                    if (this.LIZLLL) {
                        return;
                    }
                    this.LIZIZ.LIZ(this.LIZJ.peek());
                    return;
                }
                C907030Zi9.LJFF.getClass();
                C907030Zi9 c907030Zi9LIZ = C907050ZiB.LIZ();
                String conversationId = this.LIZIZ.getConversationId();
                boolean zContainsKey = c907030Zi9LIZ.LIZJ.containsKey(conversationId);
                c907030Zi9LIZ.LIZJ.remove(conversationId);
                IMALogApi iMALogApiLIZ2 = C0Z53.LIZ();
                if (iMALogApiLIZ2 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MModelTrace remove key=");
                    sbLIZ2.append(conversationId);
                    sbLIZ2.append(" existed=");
                    sbLIZ2.append(zContainsKey);
                    iMALogApiLIZ2.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LIZIZ.LJJIZ();
            }

            {
                this.LIZIZ = c1757806uW;
            }

            @Override // X.InterfaceC1755906uD
            public final void LIZ(C1DW6 c1dw6) {
                this.LIZJ.push(c1dw6);
                IMALogApi.LIZ.getClass();
                IMALogApi iMALogApiLIZ = C0Z53.LIZ();
                if (iMALogApiLIZ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MModelTrace store.register store=");
                    sbLIZ.append(System.identityHashCode(this));
                    sbLIZ.append(" cid=");
                    sbLIZ.append(this.LIZIZ.getConversationId());
                    sbLIZ.append(" stackSize=");
                    sbLIZ.append(this.LIZJ.size());
                    iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZIZ.LIZ(c1dw6);
            }
        };
        if (C1766506vv.LIZ() && c1758406uc2.LIZJ) {
            return interfaceC1755906uD;
        }
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(new C1512805w6("message_model_refresh2first_on_query_msg_event", c1758406uc2.LIZ), false);
        c1366690lfX.LIZIZ(new C1512805w6("message_model_refresh2register", c1758406uc2.LIZ), false);
        Long l = c1758406uc2.LIZLLL;
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MModelTrace create newModel=");
            sbLIZ.append(System.identityHashCode(interfaceC1755906uD));
            sbLIZ.append(" cid=");
            sbLIZ.append(c1758406uc2.LIZ);
            sbLIZ.append(" searchTargetIndex=");
            sbLIZ.append(l);
            iMALogApiLIZ.LIZ(4, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (l != null) {
            interfaceC1755906uD.LIZJ(l.longValue());
            return interfaceC1755906uD;
        }
        interfaceC1755906uD.refresh();
        return interfaceC1755906uD;
    }
}
