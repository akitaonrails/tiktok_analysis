package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.generation.component.AITheaterGenerationDraftComponent$saveDraft$1", f = "AITheaterGenerationDraftComponent.kt", l = {122}, m = "invokeSuspend")
public final class C548380Lf2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C548370Lf1 LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C548380Lf2(C548370Lf1 c548370Lf1, Context context, InterfaceC1364105Vn<? super C548380Lf2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c548370Lf1;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C548380Lf2(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        C1C7U.LIZ("AITheaterGenerationDraftComponent@85c0.saveDraft$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            C548370Lf1 c548370Lf1 = this.LLILLL;
            c548370Lf1.LLJI = c548370Lf1.W2(this.LLILZ);
            CreativeLoadingDialog creativeLoadingDialog = this.LLILLL.LLJI;
            if (creativeLoadingDialog != null) {
                creativeLoadingDialog.show();
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C548390Lf3 c548390Lf3 = new C548390Lf3(this.LLILLL, null);
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfb, c548390Lf3);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AITheaterGenerationDraftComponent@85c0.saveDraft$1");
                return objLJFF;
            }
        }
        Object objM10unboximpl = ((C189200o6) obj).m10unboximpl();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveDraft success, duration=");
            sbLIZ.append(jCurrentTimeMillis2);
            c547140Ld2.LIZ("AIGCGenerationDraftComponent", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C547140Ld2 c547140Ld22 = C537540L6i.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveDraft fail, duration=");
            sbLIZ2.append(jCurrentTimeMillis2);
            c547140Ld22.LIZIZ("AIGCGenerationDraftComponent", C2188811AlT.LIZIZ(sbLIZ2), C189200o6.m5exceptionOrNullimpl(objM10unboximpl));
        }
        this.LLILLL.B3(objM10unboximpl, jCurrentTimeMillis2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterGenerationDraftComponent@85c0.saveDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
