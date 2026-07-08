package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872150YJh implements InterfaceC871300YGa {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final C0YEM LIZ;
    public final int LIZIZ;
    public final InterfaceC872250YJr LIZJ;
    public AnonymousClass0956 LJIIIZ;
    public AnonymousClass0956 LJIIJJI;
    public final String LJIILL;
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final PriorityQueue<C0YKD> LJFF = new PriorityQueue<>(11, new Comparator() { // from class: X.0YKC
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long j;
            C0YKD c0ykd = (C0YKD) obj;
            C0YKD c0ykd2 = (C0YKD) obj2;
            if (this.LL.LIZ.LJIIIZ().LJJLI) {
                return 1;
            }
            C0YKI c0yki = (C0YKI) C13LP.LJJJLL(c0ykd.LIZ);
            long j2 = 0;
            if (c0yki != null) {
                j = c0yki.LIZ;
            } else {
                j = 0;
            }
            C0YKI c0yki2 = (C0YKI) C13LP.LJJJLL(c0ykd2.LIZ);
            if (c0yki2 != null) {
                j2 = c0yki2.LIZ;
            }
            return Intrinsics.LJII(j, j2);
        }
    });
    public final C1DEV LJI = C2191201ApK.LIZ();
    public final PriorityQueue<C0YKK> LJII = new PriorityQueue<>(11, new Comparator() { // from class: X.0YKJ
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long jLongValue;
            C0YKK c0ykk = (C0YKK) obj2;
            Long l = ((C0YKK) obj).LIZ.next_cursor;
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = c0ykk.LIZ.next_cursor;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            return Intrinsics.LJII(jLongValue, jLongValue2);
        }
    });
    public final C1DEV LJIIIIZZ = C2191201ApK.LIZ();
    public final C1DEV LJIIJ = C2191201ApK.LIZ();
    public final Map<Pair<Long, C0YFV>, C0YKK> LJIIL = new LinkedHashMap();
    public final C1DEV LJIILIIL = C2191201ApK.LIZ();
    public final Set<String> LJIILJJIL = new LinkedHashSet();

    @Override // X.InterfaceC871300YGa
    public final void clear() {
        this.LIZLLL.set(0);
        this.LJ.set(false);
        if (this.LJI.LIZJ()) {
            this.LJI.LIZIZ(null);
        }
        this.LJFF.clear();
        if (this.LJIIIIZZ.LIZJ()) {
            this.LJIIIIZZ.LIZIZ(null);
        }
        this.LJII.clear();
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJIIJ.isEnabled()) {
            if (this.LJIIJ.LIZJ()) {
                this.LJIIJ.LIZIZ(null);
            }
            ((LinkedHashMap) this.LJIIL).clear();
            AnonymousClass0956 anonymousClass09562 = this.LJIIJJI;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
        }
        if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJJIJ.isCrossRegionPushSupported()) {
            if (this.LJIILIIL.LIZJ()) {
                this.LJIILIIL.LIZIZ(null);
            }
            this.LJIILJJIL.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C0YK8
            if (r0 == 0) goto L26
            r7 = r9
            X.0YK8 r7 = (X.C0YK8) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L2c
            X.1DEV r1 = r7.LL
            X.C155000ia.LIZIZ(r2)
            goto L54
        L26:
            X.0YK8 r7 = new X.0YK8
            r7.<init>(r8, r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            X.0YJr r3 = r8.LIZJ
            int r2 = r8.LIZIZ
            r1 = 2
            r0 = 0
            r3.LJIIJ(r2, r1, r0, r5)
            X.0956 r0 = r8.LJIIJJI
            if (r0 == 0) goto L47
            r0.LIZIZ(r5)
        L47:
            X.1DEV r1 = r8.LJIIJ
            r7.LL = r1
            r7.LLILZ = r4
            java.lang.Object r0 = r1.LIZLLL(r5, r7)
            if (r0 != r6) goto L54
            return r6
        L54:
            java.util.Map<kotlin.Pair<java.lang.Long, X.0YFV>, X.0YKK> r0 = r8.LJIIL     // Catch: java.lang.Throwable -> L74
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L74
            r0.clear()     // Catch: java.lang.Throwable -> L74
            r1.LIZIZ(r5)
            X.0YEM r3 = r8.LIZ
            X.0YGm r2 = X.EnumC871420YGm.RETRY_BUFFER_FULL
            java.util.Map<kotlin.Pair<java.lang.Long, X.0YFV>, X.0YKK> r0 = r8.LJIIL
            int r1 = r0.size()
            java.util.PriorityQueue<X.0YKK> r0 = r8.LJII
            int r0 = r0.size()
            X.C871410YGl.LIZ(r3, r2, r1, r0, r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L74
            r1.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJII(X.05Vn):java.lang.Object");
    }

    public final Unit LJIIIZ(Map map) {
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            LJIILIIL((String) ((Map.Entry) it2.next()).getKey());
        }
        return Unit.LIZ;
    }

    public final void LJIILIIL(String str) {
        C0Y8T c0y8tLIZ = this.LIZJ.LIZ().LIZ(str);
        if (c0y8tLIZ != null || (c0y8tLIZ = this.LIZJ.LJIIJJI(str)) != null) {
            this.LIZJ.LJIJJ().LJJL(2, c0y8tLIZ);
        }
    }

    @Override // X.InterfaceC871300YGa
    public final Object LIZ(C0YKD c0ykd, AbstractC23140094w abstractC23140094w) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        String str = this.LJIILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueueGetMsgByUserResponse logId ");
        sbLIZ.append(c0ykd.LJ);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, str, C2188811AlT.LIZIZ(sbLIZ), 4);
        Object objLJFF = LJFF(new C0YKG(c0ykd), abstractC23140094w);
        if (objLJFF == C099R.LJFF()) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC871300YGa
    public final Object LIZIZ(C0YKK c0ykk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0YKM c0ykmLIZJ;
        Pair<Boolean, Integer> pairLIZIZ;
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        String str = this.LJIILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueueWsNotify logId ");
        sbLIZ.append(c0ykk.LIZLLL);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, str, C2188811AlT.LIZIZ(sbLIZ), 4);
        if (this.LIZ.LJIIIZ().LIZIZ && (c0ykmLIZJ = this.LIZ.LJ().LIZJ()) != null && (pairLIZIZ = c0ykmLIZJ.LIZIZ()) != null && pairLIZIZ.getFirst().booleanValue() && c0ykk.LIZ.index_in_conversation.longValue() % ((long) 3) == 0) {
            C23250099c.LIZLLL(this.LIZJ.LIZJ(), null, null, new C872190YJl(this, c0ykk, null), 3);
            return Unit.LIZ;
        }
        Object objLJFF = LJFF(new C0YKH(c0ykk), interfaceC1364105Vn);
        if (objLJFF == C099R.LJFF()) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // X.InterfaceC871300YGa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C0YKD r7, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.Integer>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0YK4
            if (r0 == 0) goto L41
            r5 = r8
            X.0YK4 r5 = (X.C0YK4) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L47
            X.C155000ia.LIZIZ(r1)
        L22:
            X.00o6 r1 = (X.C189200o6) r1
            java.lang.Object r0 = r1.m10unboximpl()
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0YJr r0 = r6.LIZJ
            X.1DEx r2 = r0.LJI()
            X.0YJq r1 = new X.0YJq
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LLILLL = r3
            java.lang.Object r1 = X.C23250099c.LJI(r5, r2, r1)
            if (r1 != r4) goto L22
            return r4
        L41:
            X.0YK4 r5 = new X.0YK4
            r5.<init>(r6, r8)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LIZJ(X.0YKD, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C0YKN r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJFF(X.0YKN, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x03ca, code lost:
    
        r32 = r32 + r30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x089d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0939 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x093a A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106 A[Catch: all -> 0x098b, LOOP:2: B:16:0x0100->B:18:0x0106, LOOP_END, TryCatch #0 {all -> 0x098b, blocks: (B:15:0x00ed, B:16:0x0100, B:18:0x0106, B:19:0x0112), top: B:180:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0581  */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01b9 -> B:35:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01bc -> B:35:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01fa -> B:35:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x056b -> B:67:0x0394). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x057f -> B:67:0x0394). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.C0YKD r44, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.Integer>> r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJIILJJIL(X.0YKD, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:26:0x00bc, B:29:0x00c1], limit reached: 135 */
    /* JADX WARN: Path cross not found for [B:52:0x016d, B:54:0x0172], limit reached: 135 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:31:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0130 -> B:132:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(X.C0Y3I r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJIJ(X.0Y3I, X.05Vn):java.lang.Object");
    }

    public C872150YJh(C0YEM c0yem, int i, C0Y8M c0y8m) {
        this.LIZ = c0yem;
        this.LIZIZ = i;
        this.LIZJ = c0y8m;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReceiveBuffer");
        sbLIZ.append(i);
        this.LJIILL = C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C0Y3I r9, int r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C0YK9
            if (r0 == 0) goto L9c
            r3 = r11
            X.0YK9 r3 = (X.C0YK9) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r5 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r1 = 4
            r4 = 1
            if (r0 == 0) goto L4e
            if (r0 != r4) goto La3
            X.0Y3I r9 = r3.LL
            X.C155000ia.LIZIZ(r5)
        L25:
            X.0YEM r0 = r8.LIZ
            X.0Y6i r3 = r0.LIZLLL()
            java.lang.String r2 = r8.LJIILL
            java.lang.String r0 = "moveToProcessingState, before launch"
            X.C868780Y6i.LJIILJJIL(r3, r2, r0, r1)
            X.0YJr r0 = r8.LIZJ
            X.01wk r4 = r0.LIZJ()
            X.0YJr r0 = r8.LIZJ
            X.1DEx r3 = r0.LJI()
            X.0YJs r2 = new X.0YJs
            r1 = 0
            r2.<init>(r8, r9, r1)
            r0 = 2
            X.0956 r0 = X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
            r8.LJIIIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4e:
            X.C155000ia.LIZIZ(r5)
            X.0YEM r0 = r8.LIZ
            X.0Y6i r6 = r0.LIZLLL()
            java.lang.String r5 = r8.LJIILL
            java.lang.StringBuilder r7 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "moveToProcessingState from "
            r7.append(r0)
            r7.append(r10)
            java.lang.String r0 = ", queue size "
            r7.append(r0)
            java.util.PriorityQueue<X.0YKD> r0 = r8.LJFF
            int r0 = r0.size()
            r7.append(r0)
            r0 = 32
            r7.append(r0)
            java.util.PriorityQueue<X.0YKK> r0 = r8.LJII
            int r0 = r0.size()
            r7.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r7)
            X.C868780Y6i.LJIILJJIL(r6, r5, r0, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r8.LIZLLL
            r0.compareAndSet(r10, r4)
            X.0956 r0 = r8.LJIIIZ
            if (r0 == 0) goto L25
            r3.LL = r9
            r3.LLILZ = r4
            java.lang.Object r0 = r0.LJJZ(r3)
            if (r0 != r2) goto L25
            return r2
        L9c:
            X.0YK9 r3 = new X.0YK9
            r3.<init>(r8, r11)
            goto L12
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJIIIIZZ(X.0Y3I, int, X.05Vn):java.lang.Object");
    }

    public final void LJIIJ(C0Y3I c0y3i, Map<String, ? extends List<C0YKP>> map, boolean z) {
        int i;
        if (map.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            String str = this.LJIILL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyMsgListObservers empty, isNew ");
            sbLIZ.append(z);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, str, C2188811AlT.LIZIZ(sbLIZ), 4);
            return;
        }
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str2 = (String) entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList.add(((C0YKP) it3.next()).LIZ);
            }
            Iterator it4 = ((List) entry.getValue()).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (((C0YKP) next).LIZIZ == 0) {
                    if (next != null) {
                        i = 0;
                    }
                }
            }
            i = 3;
            LJIIJJI(c0y3i, str2, arrayList, i, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.C0Y3I r39, X.C0YKK r40, X.InterfaceC1364105Vn<? super X.EnumC871980YIq> r41) {
        /*
            Method dump skipped, instruction units count: 1733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJIIZILJ(X.0Y3I, X.0YKK, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(long r12, long r14, X.C0YFV r16, X.InterfaceC1364105Vn<? super java.lang.Boolean> r17) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJIJI(long, long, X.0YFV, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[Catch: all -> 0x019f, TryCatch #2 {all -> 0x019f, blocks: (B:13:0x0044, B:23:0x0095, B:25:0x00aa, B:27:0x00c1, B:43:0x0136, B:44:0x0147, B:46:0x014d, B:48:0x015f, B:54:0x0179, B:55:0x0185, B:56:0x018d, B:58:0x0193, B:60:0x01a0, B:22:0x008e), top: B:81:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136 A[EDGE_INSN: B:82:0x0136->B:43:0x0136 BREAK  A[LOOP:0: B:23:0x0095->B:85:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f2 -> B:79:0x00f5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(long r19, X.C0YFV r21, boolean r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJIJJLI(long, X.0YFV, boolean, X.05Vn):java.lang.Object");
    }

    public final void LJIIJJI(C0Y3I c0y3i, String str, List<? extends C869590Y9l> list, int i, boolean z) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        String str2 = this.LJIILL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyMsgObserversPerConv, messageList ");
        sbLIZ.append(list.size());
        sbLIZ.append(" isNew ");
        sbLIZ.append(z);
        sbLIZ.append(" msgSource ");
        sbLIZ.append(i);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, str2, C2188811AlT.LIZIZ(sbLIZ), 4);
        if (z) {
            this.LIZJ.LJFF().LJIJJ(str, list, i, new C0Y7P());
            ArrayList arrayList = new ArrayList();
            Iterator<? extends C869590Y9l> it2 = list.iterator();
            while (it2.hasNext()) {
                C869590Y9l c869590Y9lLJIIIZ = this.LIZJ.LJIIIZ(it2.next());
                if (c869590Y9lLJIIIZ != null) {
                    arrayList.add(c869590Y9lLJIIIZ);
                }
            }
            if (!arrayList.isEmpty()) {
                C871360YGg c871360YGg = this.LIZ.LJIIZILJ().getDomain().LIZLLL;
                c871360YGg.getClass();
                c871360YGg.LJ(InterfaceC871310YGb.LJFF, new C1890907at(arrayList));
                return;
            }
            return;
        }
        this.LIZJ.LJFF().LJJIIJ(c0y3i, str, list, C2097608Jq.LJ(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(int r19, X.C0YK7 r20, java.util.Map<java.lang.String, ? extends java.lang.Object> r21, boolean r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJIIL(int, X.0YK7, java.util.Map, boolean, X.05Vn):java.lang.Object");
    }

    public final void LJ(C869590Y9l c869590Y9l, long j, int i, String str, String str2, boolean z) {
        C0Y8T c0y8tLJIILIIL;
        C0Y8T c0y8tLJIIJJI = this.LIZJ.LJIIJJI(c869590Y9l.getConversationId());
        if (c0y8tLJIIJJI != null) {
            if (!c0y8tLJIIJJI.isWaitingInfo() && !c0y8tLJIIJJI.isTemp() && c0y8tLJIIJJI.getLastMessageIndex() > 0) {
                this.LIZJ.LJ(c0y8tLJIIJJI, c869590Y9l, j, i, str, str2, z, true);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                String str3 = this.LJIILL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("buildOrUpdateConversation, sync update. conv id: ");
                sbLIZ.append(c0y8tLJIIJJI.getConversationId());
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, str3, C2188811AlT.LIZIZ(sbLIZ), 4);
                return;
            }
            c0y8tLJIILIIL = c0y8tLJIIJJI;
        } else {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
            String str4 = this.LJIILL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("buildOrUpdateConversation, sync build. conv id: ");
            sbLIZ2.append(c869590Y9l.getConversationId());
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, str4, C2188811AlT.LIZIZ(sbLIZ2), 4);
            InterfaceC872250YJr interfaceC872250YJr = this.LIZJ;
            int i2 = this.LIZIZ;
            c869590Y9l.getConversationId();
            c869590Y9l.getConversationShortId();
            c869590Y9l.getConversationType();
            c869590Y9l.getCreatedAt();
            c0y8tLJIILIIL = interfaceC872250YJr.LJIILIIL(i2, i, j, c869590Y9l);
        }
        C868780Y6i c868780Y6iLIZLLL3 = this.LIZ.LIZLLL();
        String str5 = this.LJIILL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("buildOrUpdateConversation, add wait. conv id: ");
        sbLIZ3.append(c869590Y9l.getConversationId());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, str5, C2188811AlT.LIZIZ(sbLIZ3), 4);
        this.LIZJ.LJIILJJIL(c869590Y9l, this.LIZIZ);
        C868780Y6i c868780Y6iLIZLLL4 = this.LIZ.LIZLLL();
        String str6 = this.LJIILL;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("buildOrUpdateConversation, sync update. conv id: ");
        sbLIZ4.append(c869590Y9l.getConversationId());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL4, str6, C2188811AlT.LIZIZ(sbLIZ4), 4);
        if (c0y8tLJIIJJI != null && c0y8tLJIIJJI.getLastMessageIndex() <= 0) {
            this.LIZJ.LJ(c0y8tLJIIJJI, c869590Y9l, j, i, str, str2, z, false);
        } else {
            if (c0y8tLJIILIIL == null) {
                return;
            }
            this.LIZJ.LJ(c0y8tLJIILIIL, c869590Y9l, j, i, str, str2, z, true);
        }
    }

    public final Object LJIILL(MessageBody messageBody, String str, int i, String str2, C0Y82 c0y82, long j, boolean z, AbstractC23140094w abstractC23140094w) {
        int i2;
        if (this.LIZ.LJIIZILJ().LIZLLL().LJI().LJIIJJI(messageBody)) {
            this.LIZ.LJIIZILJ().LIZLLL().LJI().LJIIIIZZ(this.LIZIZ, messageBody);
            if (i == 0) {
                this.LIZJ.LJIIJ(this.LIZIZ, 12, false, null);
            }
            C868780Y6i.LJIILJJIL(this.LIZ.LIZLLL(), this.LJIILL, "processMessageBody, stranger promotion", 4);
            return new C0Y7T(C0Y76.LL, null, false, C0Y72.LIZ(), true, null, null, 96);
        }
        C0Y77 c0y77LIZIZ = this.LIZJ.LIZIZ();
        int i3 = this.LIZIZ;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("s:get_msg_log_id", str2));
        if (z) {
            i2 = 6;
        } else {
            i2 = 5;
        }
        return C23250099c.LJI(abstractC23140094w, c0y77LIZIZ.LIZ.LJIIIIZZ().LIZIZ(), new C0Y70(c0y77LIZIZ, messageBody, str, i, str2, i3, mapLIZJ, c0y82, j, i2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<com.bytedance.im.core.proto.MessageBody> r28, X.C0YKD r29, X.C0YFV r30, java.util.Map<java.lang.String, java.util.List<X.C0YKP>> r31, java.util.Map<java.lang.String, java.util.List<X.C0YKP>> r32, java.util.Map<java.lang.String, X.C869590Y9l> r33, java.util.List<X.C0YKO> r34, java.lang.String r35, X.InterfaceC1364105Vn<? super java.lang.Integer> r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LIZLLL(java.util.List, X.0YKD, X.0YFV, java.util.Map, java.util.Map, java.util.Map, java.util.List, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.bytedance.im.core.proto.MessageBody r27, X.C0YKD r28, X.C0YFV r29, java.util.Map<java.lang.String, java.util.List<X.C0YKP>> r30, java.util.Map<java.lang.String, java.util.List<X.C0YKP>> r31, java.util.Map<java.lang.String, X.C869590Y9l> r32, java.util.List<X.C0YKO> r33, java.lang.String r34, X.InterfaceC1364105Vn<? super java.lang.Integer> r35) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872150YJh.LJI(com.bytedance.im.core.proto.MessageBody, X.0YKD, X.0YFV, java.util.Map, java.util.Map, java.util.Map, java.util.List, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LJIILLIIL(C0Y7T c0y7t, MessageBody messageBody, C0YKD c0ykd, C0YFV c0yfv, Map<String, List<C0YKP>> map, Map<String, List<C0YKP>> map2, Map<String, C869590Y9l> map3, List<C0YKO> list, String str) {
        String uuid;
        long jLongValue;
        Object obj;
        String string;
        C869590Y9l c869590Y9l;
        if ((c0y7t.LIZ instanceof C0Y76) && (c869590Y9l = c0y7t.LIZIZ) != null) {
            map3.put(c869590Y9l.getConversationId(), c0y7t.LIZIZ);
            list.add(new C0YKO(messageBody, c0y7t.LIZJ));
            if (c0y7t.LIZJ) {
                List<C0YKP> arrayList = map.get(c0y7t.LIZIZ.getConversationId());
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(new C0YKP(c0y7t.LIZIZ));
                map.put(c0y7t.LIZIZ.getConversationId(), arrayList);
            } else {
                List<C0YKP> arrayList2 = map2.get(c0y7t.LIZIZ.getConversationId());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                arrayList2.add(new C0YKP(c0y7t.LIZIZ));
                map2.put(c0y7t.LIZIZ.getConversationId(), arrayList2);
            }
        }
        C869590Y9l c869590Y9l2 = c0y7t.LIZIZ;
        String str2 = "";
        if (c869590Y9l2 == null || (uuid = c869590Y9l2.getUuid()) == null) {
            uuid = "";
        }
        C869590Y9l c869590Y9l3 = c0y7t.LIZIZ;
        if (c869590Y9l3 != null) {
            jLongValue = c869590Y9l3.getCreatedAt();
        } else {
            Long l = messageBody.create_time;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
        }
        long j = c0ykd.LIZJ;
        String str3 = c0ykd.LJ;
        C0Y7G c0y7gLIZ = C0Y7E.LIZ(c0y7t);
        C0Y82.Companion.getClass();
        C0Y82 c0y82LIZ = C0Y83.LIZ(c0yfv);
        C0Y72 c0y72 = c0y7t.LIZLLL;
        boolean z = c0y7t.LIZJ;
        Map<String, Object> map4 = c0ykd.LJI;
        if (map4 != null && (obj = map4.get("trigger_reason")) != null && (string = obj.toString()) != null) {
            str2 = string;
        }
        LJIJJ(this, uuid, messageBody, jLongValue, j, str3, str, c0y82LIZ, c0y7gLIZ, c0y72, z, str2, 0L, c0y7t.LJ, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }

    public static void LJIJJ(C872150YJh c872150YJh, String str, MessageBody messageBody, long j, long j2, String str2, String str3, C0Y82 c0y82, C0Y7G c0y7g, C0Y72 c0y72, boolean z, String str4, long j3, boolean z2, int i) {
        int iIntValue;
        long j4 = j3;
        String str5 = str4;
        String str6 = "";
        if ((i & 1024) != 0) {
            str5 = "";
        }
        long jLongValue = 0;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j4 = 0;
        }
        c872150YJh.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0YC7 c0yc7LIZJ = c872150YJh.LIZ.LJIIZILJ().LIZ().LIZJ();
        long j5 = jCurrentTimeMillis - j2;
        long j6 = jCurrentTimeMillis - j;
        Long l = messageBody.server_message_id;
        if (l != null) {
            jLongValue = l.longValue();
        }
        Integer num = messageBody.message_type;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        String str7 = messageBody.conversation_id;
        if (str7 != null) {
            str6 = str7;
        }
        c0yc7LIZJ.LIZLLL(j5, j6, str, jLongValue, iIntValue, str6, str2, str3, c872150YJh.LIZIZ, c0y82, c0y72, c0y7g, z, str5, j4, z2);
    }
}
