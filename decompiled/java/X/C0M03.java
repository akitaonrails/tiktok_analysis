package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0M03, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M03 {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC561350Lzx LIZIZ;
    public InterfaceC2345609Ha LIZJ;
    public final Map<String, C09AE> LIZLLL;
    public final Map<String, C09AE> LJ;
    public final LifecycleOwner LJFF;
    public volatile int LJI;
    public volatile int LJII;
    public volatile int LJIIIZ;
    public volatile long LJIIIIZZ = -1;
    public volatile long LJIIJ = -1;
    public final C1DEV LJIIJJI = C2191201ApK.LIZ();

    public static boolean LJ() {
        IExternalService iExternalService;
        IAILiveService aILiveService;
        if (!C357610E0h.LIZ() && !C1621890sJ9.LIZ() && !C286470BKr.LIZ() && !C0C64.LJIILLIIL().LJIIIZ(31744, "i2v_frame_task_experiment", true, false) && ((iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) == null || (aILiveService = iExternalService.getAILiveService()) == null || !aILiveService.isAILiveEnable())) {
            C547860LeC.LIZ.getClass();
            if (!C547860LeC.LIZ().LIZ()) {
                return false;
            }
        }
        return true;
    }

    public final void LJI(C539070LCf c539070LCf) {
        float f;
        boolean z;
        EnumC545550LaT enumC545550LaT = c539070LCf.LIZJ;
        if (enumC545550LaT == EnumC545550LaT.COMPLETE) {
            f = 100.0f;
        } else {
            f = c539070LCf.LIZIZ;
        }
        C539070LCf c539070LCf2 = new C539070LCf(c539070LCf.LIZ, f, enumC545550LaT, c539070LCf.LIZLLL);
        if (enumC545550LaT != EnumC545550LaT.NONE) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C09HZ(this, c539070LCf2, z, null), 2);
    }

    public final void LJFF(List<String> list, List<String> list2, C561130Lzb c561130Lzb) {
        ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
        if (iCreationAsyncTaskManagerLIZ == null) {
            return;
        }
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        Set setLLIIJI = C13LP.LLIIJI(list);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            if (!setLLIIJI.contains(str)) {
                arrayList.add(str);
            }
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeDraftWithAsyncTasks creationId: ");
        sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        C201955140j.LIZLLL(c0may, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(this.LIZ, null, null, new C09HU(list, arrayList, iCreationAsyncTaskManagerLIZ, this, c561130Lzb, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, java.util.List<X.C0LSZ> r10, X.C561130Lzb r11, X.InterfaceC1364105Vn<? super X.C539070LCf> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C0M02
            if (r0 == 0) goto L76
            r4 = r12
            X.0M02 r4 = (X.C0M02) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L7c
            X.C155000ia.LIZIZ(r2)
        L22:
            if (r2 == 0) goto L84
            return r2
        L25:
            X.C155000ia.LIZIZ(r2)
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r1 = r11.LJ(r9)
            if (r1 == 0) goto L61
            boolean r0 = X.C0MUK.LJ(r1)
            if (r0 == r3) goto L3a
            boolean r0 = X.C545950Lb7.LIZIZ(r1)
            if (r0 != r3) goto L61
        L3a:
            java.util.List r7 = X.C545950Lb7.LIZ(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r10.iterator()
        L47:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0LSZ r0 = (X.C0LSZ) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L47
            r6.add(r1)
            goto L47
        L60:
            r10 = r6
        L61:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r0 = X.C09BV.LIZ()
            if (r0 == 0) goto L84
            X.0LCT r0 = r0.LJIILIIL()
            if (r0 == 0) goto L84
            r4.LLILLL = r3
            java.lang.Object r2 = r0.LIZ(r9, r10, r4)
            if (r2 != r5) goto L22
            return r5
        L76:
            X.0M02 r4 = new X.0M02
            r4.<init>(r8, r12)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L84:
            X.0LCf r2 = new X.0LCf
            r1 = 15
            r0 = 0
            r2.<init>(r0, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M03.LIZ(java.lang.String, java.util.List, X.0Lzb, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0M0P LIZJ(android.content.Context r44, com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo r45, X.C561130Lzb r46, java.util.Map<java.lang.String, X.C539070LCf> r47) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M03.LIZJ(android.content.Context, com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo, X.0Lzb, java.util.Map):X.0M0P");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.EnumC562200M3e r12, X.C562260M3k r13, X.C0M0Z r14, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.Long>> r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C0M01
            r7 = r11
            if (r0 == 0) goto L41
            r4 = r15
            X.0M01 r4 = (X.C0M01) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L13:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L47
            X.C155000ia.LIZIZ(r3)
        L23:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2a:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0Lzt r5 = new X.0Lzt
            r10 = 0
            r9 = r14
            r8 = r13
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LLILLL = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L23
            return r2
        L41:
            X.0M01 r4 = new X.0M01
            r4.<init>(r7, r15)
            goto L13
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M03.LIZLLL(X.0M3e, X.0M3k, X.0M0Z, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0309 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(android.content.Context r20, com.ss.android.ugc.aweme.draft.model.AwemeDraft r21, X.C561130Lzb r22, X.InterfaceC1364105Vn<? super X.C0M0P> r23) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M03.LJII(android.content.Context, com.ss.android.ugc.aweme.draft.model.AwemeDraft, X.0Lzb, X.05Vn):java.lang.Object");
    }

    public final List<C561950M2f> LIZIZ(Map<String, C539070LCf> map, List<DraftViewInfo> list, Context context, C561130Lzb c561130Lzb, boolean z) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DraftViewInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            C0M0P c0m0pLIZJ = LIZJ(context, it2.next(), c561130Lzb, map);
            if (!z || c0m0pLIZJ.LJIILIIL != EnumC545550LaT.PROCESSING) {
                arrayList.add(c0m0pLIZJ);
            }
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" dealDraftViewInfosForNewUI: draftList.size = ");
        sbLIZ.append(arrayList.size());
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        return arrayList;
    }

    public C0M03(C054G c054g, InterfaceC561350Lzx interfaceC561350Lzx, DraftBoxFragment draftBoxFragment, Map map, Map map2, DraftBoxFragment draftBoxFragment2) {
        this.LIZ = c054g;
        this.LIZIZ = interfaceC561350Lzx;
        this.LIZJ = draftBoxFragment;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = draftBoxFragment2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b5  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C0M4N r23, android.content.Context r24, X.C562260M3k r25, X.C0M0Z r26, X.C561130Lzb r27, X.EnumC562200M3e r28, X.InterfaceC1364105Vn<? super java.util.List<? extends X.C561950M2f>> r29) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M03.LJIIIIZZ(X.0M4N, android.content.Context, X.0M3k, X.0M0Z, X.0Lzb, X.0M3e, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0M03] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C0M4N r15, android.content.Context r16, X.C562260M3k r17, X.C0M0Z r18, X.C561130Lzb r19, X.EnumC562200M3e r20, X.InterfaceC1364105Vn<? super java.util.List<? extends X.C561950M2f>> r21) throws java.lang.Throwable {
        /*
            r14 = this;
            r3 = r21
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            boolean r0 = r3 instanceof X.C0M07
            r6 = r14
            if (r0 == 0) goto L36
            r13 = r3
            X.0M07 r13 = (X.C0M07) r13
            int r2 = r13.LLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r13.LLJI = r2
        L20:
            java.lang.Object r5 = r13.LLIZLLLIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r13.LLJI
            r3 = 0
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L5a
            if (r1 == r0) goto L44
            if (r1 != r2) goto L3c
            java.lang.Object r1 = r13.LL
            X.01eN r1 = (X.InterfaceC383701eN) r1
            goto L8d
        L36:
            X.0M07 r13 = new X.0M07
            r13.<init>(r6, r3)
            goto L20
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L44:
            X.1DEV r1 = r13.LLIZ
            X.0M3e r12 = r13.LLILZLL
            X.0Lzb r11 = r13.LLILZIL
            X.0M0Z r10 = r13.LLILZ
            X.0M3k r9 = r13.LLILLL
            java.lang.Object r8 = r13.LLILLJJLI
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r7 = r13.LL
            X.0M4N r7 = (X.C0M4N) r7
            X.C155000ia.LIZIZ(r5)
            goto L76
        L5a:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r1 = r6.LJIIJJI
            r13.LL = r7
            r13.LLILLJJLI = r8
            r13.LLILLL = r9
            r13.LLILZ = r10
            r13.LLILZIL = r11
            r13.LLILZLL = r12
            r13.LLIZ = r1
            r13.LLJI = r0
            java.lang.Object r0 = r1.LIZLLL(r3, r13)
            if (r0 != r4) goto L76
            return r4
        L76:
            r13.LL = r1     // Catch: java.lang.Throwable -> L96
            r13.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L96
            r13.LLILLL = r3     // Catch: java.lang.Throwable -> L96
            r13.LLILZ = r3     // Catch: java.lang.Throwable -> L96
            r13.LLILZIL = r3     // Catch: java.lang.Throwable -> L96
            r13.LLILZLL = r3     // Catch: java.lang.Throwable -> L96
            r13.LLIZ = r3     // Catch: java.lang.Throwable -> L96
            r13.LLJI = r2     // Catch: java.lang.Throwable -> L96
            java.lang.Object r5 = r6.LJIIIIZZ(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L96
            if (r5 != r4) goto L90
            return r4
        L8d:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L9b
        L90:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L9b
            r1.LIZIZ(r3)
            return r5
        L96:
            r0 = move-exception
        L97:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9b
            goto L9d
        L9b:
            r0 = move-exception
            goto L97
        L9d:
            r1.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M03.LJIIIZ(X.0M4N, android.content.Context, X.0M3k, X.0M0Z, X.0Lzb, X.0M3e, X.05Vn):java.lang.Object");
    }
}
