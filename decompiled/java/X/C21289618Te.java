package X;

import Y.AfS171S0100000_2;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetBotCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetErrorCardTemplate;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS131S0400000_2;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21289618Te implements C18T4 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILL;
    public String LIZ = "";
    public String LIZIZ = "";
    public final C903950ZdB LIZJ = new C903950ZdB();
    public final C2252321DDq LIZLLL = C1BNE.LIZ(C18TS.LIZ);
    public final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 733));
    public final long LJI = ((long) C342380DbY.LIZ().waitGenerationTimeoutInSeconds) * 1000;
    public final ConcurrentHashMap<C06R6, AnonymousClass0957<C189200o6<Unit>>> LJII = new ConcurrentHashMap<>();
    public AnonymousClass0956 LJIIIIZZ;
    public InterfaceC21289318Tb LJIIIZ;
    public InterfaceC21290518Tn LJIIJ;
    public C18TX LJIIJJI;
    public AnonymousClass0956 LJIIL;
    public volatile C21373518kf LJIILIIL;
    public volatile C1807770x8x LJIILJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21289618Te.class, "conversationRepository", "getConversationRepository()Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C21289618Te.class, "messageModelObservableProvider", "getMessageModelObservableProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/rx/MessageModelObservableProvider;", 0);
        c09r3.getClass();
        LJIILL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C18T4
    public final int LIZ() {
        C18TX c18tx = this.LJIIJJI;
        if (c18tx != null) {
            return c18tx.LIZ();
        }
        return 0;
    }

    @Override // X.C18T4
    public final boolean LIZJ() {
        return (this.LIZLLL.getValue() instanceof C18TN) || (this.LIZLLL.getValue() instanceof C18TQ) || (this.LIZLLL.getValue() instanceof C18TU);
    }

    @Override // X.C18T4
    public final boolean LJFF() {
        InterfaceC21290518Tn interfaceC21290518Tn = this.LJIIJ;
        return interfaceC21290518Tn != null && interfaceC21290518Tn.isCanceled();
    }

    @Override // X.C18T4
    public final C2252321DDq LJI() {
        return ((C909910Zmn) this.LJFF.getValue()).LIZLLL;
    }

    @Override // X.C18T4
    public final C2252321DDq LJIIIIZZ() {
        return ((C909910Zmn) this.LJFF.getValue()).LJII;
    }

    @Override // X.C18T4
    public final boolean LJIIIZ() {
        return this.LIZLLL.getValue() instanceof C18TU;
    }

    @Override // X.C18T4
    public final C869590Y9l LJIILJJIL() {
        C909930Zmp c909930ZmpLIZ = ((C18TR) this.LIZLLL.getValue()).LIZ();
        if (c909930ZmpLIZ != null) {
            return c909930ZmpLIZ.LIZ;
        }
        return null;
    }

    public final InterfaceC905060Zey LJIIZILJ() {
        C21373518kf c21373518kf = this.LJIILIIL;
        if (c21373518kf == null) {
            synchronized (this) {
                c21373518kf = this.LJIILIIL;
                if (c21373518kf == null) {
                    C21373518kf c21373518kf2 = new C21373518kf(this.LIZJ);
                    this.LJIILIIL = c21373518kf2;
                    return c21373518kf2;
                }
            }
        }
        return c21373518kf;
    }

    @Override // X.C18T4
    public final C2252321DDq s9() {
        return ((C909910Zmn) this.LJFF.getValue()).LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C18T4
    public final Boolean LIZLLL() {
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) LJI().getValue();
        if (interfaceC1157570gEF instanceof C1157450gE3) {
            return Boolean.valueOf(((C909930Zmp) ((C1157450gE3) interfaceC1157570gEF).LIZ).LIZ == null);
        }
        String string = C1718406oA.LIZ().getString("is_vp_new_user", "");
        if (string.length() == 0) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(string));
    }

    @Override // X.C18T4
    public final C2252321DDq LJ() {
        return this.LIZLLL;
    }

    @Override // X.C18T4
    public final String getConversationId() {
        return this.LIZ;
    }

    @Override // X.C18T4
    public final String getUuid() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C18T4
    public final boolean LIZIZ(C869590Y9l c869590Y9l) {
        long readIndex;
        C903950ZdB c903950ZdB = new C903950ZdB();
        C259800zU c259800zU = new C259800zU();
        c903950ZdB.LIZLLL(c869590Y9l.getConversationId()).LJIILLIIL(new AfS171S0100000_2(c259800zU, 64));
        C0Y8T c0y8t = (C0Y8T) c259800zU.element;
        if (c0y8t != null) {
            readIndex = c0y8t.getReadIndex();
        } else {
            readIndex = 0;
        }
        if (readIndex >= c869590Y9l.getIndex()) {
            return true;
        }
        return false;
    }

    @Override // X.C18T4
    public final C095D LJII(C869590Y9l c869590Y9l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelGenerate: ");
        sbLIZ.append(c869590Y9l.getMsgId());
        C21290718Tp.LIZIZ("AiChatGenerateService", C2188811AlT.LIZIZ(sbLIZ));
        return LJIILLIIL(C06R4.CANCEL_GENERATION, c869590Y9l);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // X.C18T4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21289218Ta
            if (r0 == 0) goto L37
            r5 = r7
            X.18Ta r5 = (X.C21289218Ta) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3d
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.18TZ r1 = new X.18TZ
            r0 = 0
            r1.<init>(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L37:
            X.18Ta r5 = new X.18Ta
            r5.<init>(r6, r7)
            goto L12
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21289618Te.LJIIJ(X.05Vn):java.lang.Object");
    }

    @Override // X.C18T4
    public final void LJIIJJI(String str) {
        AnonymousClass0956 anonymousClass0956 = this.LJIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (!Intrinsics.LJFF(this.LIZ, str)) {
            this.LIZ = str;
            String string = UUID.randomUUID().toString();
            this.LIZIZ = string;
            C1758506ud c1758506ud = C1758506ud.LIZ;
            String str2 = this.LIZ;
            c1758506ud.getClass();
            InterfaceC1755906uD interfaceC1755906uDLIZ = C1758506ud.LIZ(str2, string);
            if (this.LJIILJJIL == null) {
                synchronized (this) {
                    if (this.LJIILJJIL == null) {
                        this.LJIILJJIL = (C1807770x8x) C1807670x8n.LLLLLLJ();
                    }
                }
            }
            C1761306v5 c1761306v5 = new C1761306v5(interfaceC1755906uDLIZ);
            C909910Zmn c909910Zmn = (C909910Zmn) this.LJFF.getValue();
            String str3 = this.LIZ;
            C19491211Nm c19491211NmLIZ = ((C21373518kf) LJIIZILJ()).LIZ(this.LIZ);
            c909910Zmn.LJFF = new AwS576S0100000_32(interfaceC1755906uDLIZ, 732);
            c909910Zmn.LIZIZ.LIZ(C1239300iM4.LIZLLL(c909910Zmn.LIZ.LIZLLL(str3).LJJIJIIJI(C11S5.LIZ()), new AwS611S0100000_32(c909910Zmn, 313), new AwS593S0100000_14(c909910Zmn, 274)));
            if (c19491211NmLIZ != null) {
                c909910Zmn.LIZIZ.LIZ(C1239300iM4.LJ(c19491211NmLIZ.LJJJLZIJ(C11S5.LIZ()), AFwS278S0000000_32.get$arr$(153), C1239300iM4.LIZJ, new AwS593S0100000_14(c909910Zmn, 275)));
            }
            c909910Zmn.LIZIZ.LIZ(C1239300iM4.LJ(c1761306v5.LJJJLZIJ(C11S5.LIZ()), AFwS278S0000000_32.get$arr$(154), C1239300iM4.LIZJ, new C909900Zmm(c909910Zmn)));
            InterfaceC21289318Tb interfaceC21289318Tb = this.LJIIIZ;
            if (interfaceC21289318Tb != null) {
                interfaceC21289318Tb.LIZJ(this.LIZ, this.LIZIZ);
            }
        }
        this.LJIIL = C09IC.LJJI(this.LJ, new C861640Xr8(new C21289718Tf(this, null), LJI()));
    }

    @Override // X.C18T4
    public final C095D LJIIL(C869590Y9l c869590Y9l) {
        C21290718Tp.LIZIZ("AiChatGenerateService", "regenerate: ");
        return LJIILLIIL(C06R4.RETRY_GENERATION, c869590Y9l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C18T4
    public final void LJIILIIL(String str) {
        InterfaceC21290518Tn interfaceC21290518Tn;
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) LJI().getValue();
        if ((interfaceC1157570gEF instanceof C1157450gE3) && (interfaceC21290518Tn = this.LJIIJ) != null) {
            interfaceC21290518Tn.LIZJ(((C909930Zmp) ((C1157450gE3) interfaceC1157570gEF).LIZ).LIZ, str);
        }
    }

    @Override // X.C18T4
    public final boolean LJIILL(C869590Y9l c869590Y9l) {
        VisualPoetBotCardTemplate visualPoetBotCardTemplate;
        long createdAt;
        VisualPoetErrorCardTemplate visualPoetErrorCardTemplate;
        long createdAt2;
        if (c869590Y9l.getMsgType() == 1821 && (visualPoetErrorCardTemplate = (VisualPoetErrorCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetErrorCardTemplate.class)) != null && Intrinsics.LJFF(visualPoetErrorCardTemplate.retried, Boolean.TRUE)) {
            Long l = visualPoetErrorCardTemplate.updateTime;
            if (l != null) {
                createdAt2 = l.longValue();
            } else {
                createdAt2 = c869590Y9l.getCreatedAt();
            }
            C18U8.LIZ.getClass();
            if (C18U8.LIZ() - createdAt2 < this.LJI) {
                return true;
            }
            return false;
        }
        if (c869590Y9l.getMsgType() != 1820 || (visualPoetBotCardTemplate = (VisualPoetBotCardTemplate) C0Z2Z.LIZ(c869590Y9l, VisualPoetBotCardTemplate.class)) == null || !Intrinsics.LJFF(visualPoetBotCardTemplate.retried, Boolean.TRUE)) {
            return false;
        }
        Long l2 = visualPoetBotCardTemplate.updateTime;
        if (l2 != null) {
            createdAt = l2.longValue();
        } else {
            createdAt = c869590Y9l.getCreatedAt();
        }
        C18U8.LIZ.getClass();
        if (C18U8.LIZ() - createdAt < this.LJI) {
            return true;
        }
        return false;
    }

    public final boolean LJIJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        C18U8.LIZ.getClass();
        long jLIZ = C18U8.LIZ() - c869590Y9l.getCreatedAt();
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            if (!c869590Y9l.isSuccessStatus() || jLIZ > this.LJI) {
                return false;
            }
            return true;
        }
        return LJIILL(c869590Y9l);
    }

    public final void LJIJJ(C18TR<? extends C869590Y9l> c18tr) {
        this.LIZLLL.setValue(c18tr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGenerationState: ");
        sbLIZ.append(this.LIZLLL.getValue());
        C21290718Tp.LIZIZ("AiChatGenerateService", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.06R6, java.lang.Object] */
    @Override // X.C18T4
    public final C095D LJIILLIIL(final C06R4 c06r4, C869590Y9l c869590Y9l) {
        AnonymousClass0957<C189200o6<Unit>> anonymousClass0957ComputeIfAbsent;
        final String uuid = c869590Y9l.getUuid();
        ?? r7 = new Object(c06r4, uuid) { // from class: X.06R6
            public final C06R4 LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C06R6)) {
                    return false;
                }
                C06R6 c06r6 = (C06R6) obj;
                return this.LIZ == c06r6.LIZ && Intrinsics.LJFF(this.LIZIZ, c06r6.LIZIZ);
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RequestKey(action=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", messageId=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = c06r4;
                this.LIZIZ = uuid;
            }
        };
        final AwS131S0400000_2 awS131S0400000_2 = new AwS131S0400000_2(this, c869590Y9l, c06r4, (C06R6) r7, 6);
        if (Build.VERSION.SDK_INT >= 24) {
            anonymousClass0957ComputeIfAbsent = this.LJII.computeIfAbsent((C06R6) r7, new Function() { // from class: X.18Tm
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return awS131S0400000_2.invoke();
                }
            });
        } else {
            anonymousClass0957ComputeIfAbsent = this.LJII.get(r7);
            if (anonymousClass0957ComputeIfAbsent == null) {
                synchronized (this.LJII) {
                    try {
                        anonymousClass0957ComputeIfAbsent = this.LJII.get(r7);
                        if (anonymousClass0957ComputeIfAbsent == null) {
                            anonymousClass0957ComputeIfAbsent = (AnonymousClass0957) awS131S0400000_2.invoke();
                            this.LJII.put((C06R6) r7, anonymousClass0957ComputeIfAbsent);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        return new C095D(new C372301cX(anonymousClass0957ComputeIfAbsent, null));
    }

    public final void LJIJI(C21289918Th c21289918Th, C18UB c18ub, C18TW c18tw) {
        this.LJIIJ = c21289918Th;
        this.LJIIIZ = c18ub;
        this.LJIIJJI = c18tw;
    }
}
