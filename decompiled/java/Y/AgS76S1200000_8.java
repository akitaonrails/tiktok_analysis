package Y;

import X.AnonymousClass0956;
import X.C099R;
import X.C0MXN;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C537540L6i;
import X.C547140Ld2;
import X.C550980LjE;
import X.C551010LjH;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.aikit.api.create.CreateState;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class AgS76S1200000_8 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(java.util.List<X.C0LSZ> r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS76S1200000_8.LIZ$0(java.util.List, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$0(AgS76S1200000_8 agS76S1200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS76S1200000_8.LIZ$0((List) obj, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS76S1200000_8 r10, java.lang.Object r11, X.InterfaceC1364105Vn r12) {
        /*
            boolean r0 = r12 instanceof X.C546800LcU
            if (r0 == 0) goto Lb4
            r6 = r12
            X.0LcU r6 = (X.C546800LcU) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r3 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L42
            if (r0 != r5) goto Lbb
            X.C155000ia.LIZIZ(r3)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r3)
            java.lang.Object r4 = r10.l1
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.0LU9 r11 = (X.C0LU9) r11
            java.lang.String r1 = r10.s0
            java.lang.Object r0 = r10.l2
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel r0 = (com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel) r0
            r6.LLILLL = r4
            r6.LLILLJJLI = r2
            java.lang.Object r3 = X.C546730LcN.LJ(r11, r1, r0, r6)
            if (r3 != r7) goto L47
            return r7
        L42:
            X.01Wf r4 = r6.LLILLL
            X.C155000ia.LIZIZ(r3)
        L47:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.aikit.api.create.CreateState.Failed
            r8 = 0
            java.lang.String r2 = "AICreateService"
            java.lang.String r9 = "observeWorkflowState: "
            if (r0 == 0) goto L80
            java.lang.Object r1 = r10.l2
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel r1 = (com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel) r1
            if (r1 == 0) goto L62
            X.0LeC r0 = X.C547860LeC.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.common.AIAlertService r0 = X.C547860LeC.LIZJ()
            r0.LIZLLL(r1)
        L62:
            X.0Ld2 r1 = X.C546820LcW.LIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r9)
            r0.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.LIZIZ(r2, r0, r8)
        L75:
            r6.LLILLL = r8
            r6.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r3, r6)
            if (r0 != r7) goto L25
            return r7
        L80:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.aikit.api.create.CreateState.Duplicate
            if (r0 != 0) goto La0
            com.ss.android.ugc.aweme.aikit.api.create.CreateState$NullState r0 = com.ss.android.ugc.aweme.aikit.api.create.CreateState.NullState.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto La0
            X.0Ld2 r1 = X.C546820LcW.LIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r9)
            r0.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.LIZ(r2, r0)
            goto L75
        La0:
            X.0Ld2 r1 = X.C546820LcW.LIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r9)
            r0.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.LIZIZ(r2, r0, r8)
            goto L75
        Lb4:
            X.0LcU r6 = new X.0LcU
            r6.<init>(r10, r12)
            goto L12
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS76S1200000_8.emit$1(Y.AgS76S1200000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$2(AgS76S1200000_8 agS76S1200000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        CreateState createState = (CreateState) obj;
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeGeneratingTaskState: ");
        sbLIZ.append(createState);
        sbLIZ.append(' ');
        sbLIZ.append(agS76S1200000_8.s0);
        c547140Ld2.LIZ("AITheaterSocialFakeGeneratingCardProtocol", C2188811AlT.LIZIZ(sbLIZ));
        if (createState instanceof CreateState.Failed) {
            C1DFH c1dfh = C0PEM.LIZ;
            Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C550980LjE((C0MXN) agS76S1200000_8.l2, (AITheaterSocialFakeGeneratingUISlotAssem) agS76S1200000_8.l1, agS76S1200000_8.s0, createState, null));
            if (objLJI != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objLJI;
        }
        if (!(createState instanceof CreateState.Canceled) && !(createState instanceof CreateState.Finished)) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            Object objLJI2 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C551010LjH((AITheaterSocialFakeGeneratingUISlotAssem) agS76S1200000_8.l1, (C0MXN) agS76S1200000_8.l2, null));
            if (objLJI2 == C099R.LJFF()) {
                return objLJI2;
            }
            return Unit.LIZ;
        }
        AnonymousClass0956 anonymousClass0956 = ((AITheaterSocialFakeGeneratingUISlotAssem) agS76S1200000_8.l1).LLLFFI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        return Unit.LIZ;
    }

    public AgS76S1200000_8(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
