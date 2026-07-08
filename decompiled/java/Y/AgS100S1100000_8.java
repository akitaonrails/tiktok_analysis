package Y;

import X.C0LY5;
import X.C546940Lci;
import X.C553520LnK;
import X.InterfaceC1264504x9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1406105et;
import X.InterfaceC346701Wf;
import X.InterfaceC546960Lck;
import com.ss.android.ugc.aweme.aikit.api.create.CreateState;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class AgS100S1100000_8 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
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
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.InterfaceC1406105et r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C553570LnP
            if (r0 == 0) goto L90
            r6 = r9
            X.0LnP r6 = (X.C553570LnP) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r3 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L71
            if (r0 != r2) goto L9a
            X.C155000ia.LIZIZ(r3)
        L23:
            boolean r1 = r3 instanceof java.lang.String
            r0 = 0
            if (r1 != 0) goto L29
            r3 = r0
        L29:
            java.lang.String r3 = (java.lang.String) r3
            X.0Laz r0 = X.C545870Laz.LIZIZ
            java.lang.String r2 = r0.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AIPortraitWorkflowComponent -> observeArtifact ServerTaskId update, workflowId="
            r1.append(r0)
            java.lang.String r0 = r7.s0
            r1.append(r0)
            java.lang.String r0 = ", serverTaskId="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZIZ(r2, r0)
            if (r3 == 0) goto L97
            int r0 = r3.length()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r7.l1
            X.0LnK r0 = (X.C553520LnK) r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.w2()
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r0.aigcBusinessModel
            com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r0 = r0.aiPortraitModel
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel r0 = r0.contextModel
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r0 = r0.generatingModel
            if (r0 == 0) goto L6e
            r0.serverWorkflowId = r3
        L6e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L71:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory> r0 = com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory.class
            java.lang.Object r1 = r1.getService(r0, r4, r4)
            com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory r1 = (com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory) r1
            X.0LnQ r0 = new X.0LnQ
            r0.<init>()
            java.lang.reflect.Type r0 = r0.LIZ
            r6.LLILLL = r2
            java.lang.Object r3 = r1.LIZIZ(r8, r0, r6)
            if (r3 != r5) goto L23
            return r5
        L90:
            X.0LnP r6 = new X.0LnP
            r6.<init>(r7, r9)
            goto L12
        L97:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS100S1100000_8.LIZ$0(X.05et, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0384  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$1(X.C0LY5 r32, X.InterfaceC1364105Vn<? super kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS100S1100000_8.LIZ$1(X.0LY5, X.05Vn):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AgS100S1100000_8(X.C553520LnK r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS100S1100000_8.<init>(X.0LnK, java.lang.String, int):void");
    }

    public static final /* bridge */ /* synthetic */ Object emit$0(AgS100S1100000_8 agS100S1100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS100S1100000_8.LIZ$0((InterfaceC1406105et) obj, interfaceC1364105Vn);
    }

    public static final Object emit$1(AgS100S1100000_8 agS100S1100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C553520LnK) agS100S1100000_8.l1).W1(agS100S1100000_8.s0, (InterfaceC1264504x9) obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS100S1100000_8 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C550660Lii
            if (r0 == 0) goto L42
            r5 = r8
            X.0Lii r5 = (X.C550660Lii) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L48
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l1
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = r7
            com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult r0 = (com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult) r0
            java.lang.String r1 = r0.uploadId
            java.lang.String r0 = r6.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L42:
            X.0Lii r5 = new X.0Lii
            r5.<init>(r6, r8)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS100S1100000_8.emit$2(Y.AgS100S1100000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final /* bridge */ /* synthetic */ Object emit$3(AgS100S1100000_8 agS100S1100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS100S1100000_8.LIZ$1((C0LY5) obj, interfaceC1364105Vn);
    }

    public static final Object emit$4(AgS100S1100000_8 agS100S1100000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC546960Lck interfaceC546960Lck;
        CreateState createState = (CreateState) obj;
        if (createState instanceof CreateState.Running) {
            InterfaceC546960Lck interfaceC546960Lck2 = ((C546940Lci) agS100S1100000_8.l1).LLILLL;
            if (interfaceC546960Lck2 != null) {
                interfaceC546960Lck2.LIZIZ(((CreateState.Running) createState).getServerTaskId());
            }
        } else if (createState instanceof CreateState.Finished) {
            InterfaceC546960Lck interfaceC546960Lck3 = ((C546940Lci) agS100S1100000_8.l1).LLILLL;
            if (interfaceC546960Lck3 != null) {
                interfaceC546960Lck3.onSuccess(agS100S1100000_8.s0);
            }
        } else if ((createState instanceof CreateState.Failed) && (interfaceC546960Lck = ((C546940Lci) agS100S1100000_8.l1).LLILLL) != null) {
            interfaceC546960Lck.LIZ(agS100S1100000_8.s0);
        }
        return Unit.LIZ;
    }

    public AgS100S1100000_8(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
