package X;

import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.generation.component.launch.AITheaterDMGenerationLaunchComponent$observeWorkflowState$1", f = "AITheaterDMGenerationLaunchComponent.kt", l = {127, 132}, m = "invokeSuspend")
public final class C546840LcY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C547810Le7 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AITheaterCreationModel LLILZIL;
    public final /* synthetic */ CreativeModel LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546840LcY(C547810Le7 c547810Le7, String str, AITheaterCreationModel aITheaterCreationModel, CreativeModel creativeModel, boolean z, InterfaceC1364105Vn<? super C546840LcY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c547810Le7;
        this.LLILZ = str;
        this.LLILZIL = aITheaterCreationModel;
        this.LLILZLL = creativeModel;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C546840LcY c546840LcY = new C546840LcY(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c546840LcY.LLILLJJLI = obj;
        return c546840LcY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("AITheaterDMGenerationLaunchComponent@7306.observeWorkflowState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AITheaterDMGenerationLaunchComponent@7306.observeWorkflowState$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AICreateService aICreateServiceO4 = this.LLILLL.o4();
            String str = this.LLILZ;
            AITheaterCreationModel aITheaterCreationModel = this.LLILZIL;
            C0LUG c0lug = C0LUG.LIZ;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = aICreateServiceO4.jw(str, aITheaterCreationModel, c0lug);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AITheaterDMGenerationLaunchComponent@7306.observeWorkflowState$1");
                return objLJFF;
            }
        }
        InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) obj;
        if (interfaceC346201Wa == null) {
            this.LLILLL.H4();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AITheaterDMGenerationLaunchComponent@7306.observeWorkflowState$1");
            return unit2;
        }
        final AITheaterCreationModel aITheaterCreationModel2 = this.LLILZIL;
        final C547810Le7 c547810Le7 = this.LLILLL;
        final CreativeModel creativeModel = this.LLILZLL;
        final boolean z = this.LLIZ;
        InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0LcX
            /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
            @Override // X.InterfaceC346701Wf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, X.InterfaceC1364105Vn r6) {
                /*
                    r4 = this;
                    X.0Ld2 r2 = X.C537540L6i.LIZ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "observeWorkflowState, "
                    r1.append(r0)
                    r1.append(r5)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "AITheaterDMGenerationLaunchComponent"
                    r2.LIZ(r0, r1)
                    boolean r0 = r5 instanceof com.ss.android.ugc.aweme.aikit.api.create.CreateState.Running
                    r3 = 0
                    if (r0 == 0) goto L3b
                    com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r0 = r1
                    com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel r0 = r0.generationModel
                    java.lang.String r1 = r0.getStep()
                    java.lang.String r0 = "SERVER"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 != 0) goto L5c
                    com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel r0 = r1
                    if (r0 == 0) goto L6a
                    com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel r0 = r0.generationModel     // Catch: java.lang.IllegalArgumentException -> L4a
                    java.lang.String r0 = r0.getStep()     // Catch: java.lang.IllegalArgumentException -> L4a
                    X.0LU2 r1 = X.C0LU2.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L4a
                    goto L50
                L3b:
                    boolean r0 = r5 instanceof com.ss.android.ugc.aweme.aikit.api.create.CreateState.Failed
                    if (r0 == 0) goto L6a
                    X.0Le7 r0 = r2
                    r0.H4()
                    X.01wk r0 = r5
                    X.C2296808zG.LIZJ(r0, r3)
                    goto L6a
                L4a:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.0LU2 r1 = X.C0LU2.STEP_DEFAULT
                L50:
                    X.0LU2 r0 = X.C0LU2.PROGRESS
                    java.util.List r0 = java.util.Collections.singletonList(r0)
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L6a
                L5c:
                    X.0Le7 r2 = r2
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r3
                    boolean r0 = r4
                    r2.K4(r1, r0)
                    X.01wk r0 = r5
                    X.C2296808zG.LIZJ(r0, r3)
                L6a:
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C546830LcX.emit(java.lang.Object, X.05Vn):java.lang.Object");
            }
        };
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346201Wa.collect(interfaceC346701Wf, this) == objLJFF) {
            C1C7U.LIZIZ("AITheaterDMGenerationLaunchComponent@7306.observeWorkflowState$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterDMGenerationLaunchComponent@7306.observeWorkflowState$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
