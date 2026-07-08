package X;

import android.app.Activity;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$2$run$1", f = "RecordConditionCheck.kt", l = {196}, m = "invokeSuspend")
public final class C344970Dfj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Activity LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344970Dfj(boolean z, long j, long j2, Activity activity, long j3, long j4, InterfaceC1364105Vn<? super C344970Dfj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = activity;
        this.LLIZ = j3;
        this.LLIZLLLIL = j4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C344970Dfj c344970Dfj = new C344970Dfj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c344970Dfj.LLILLJJLI = obj;
        return c344970Dfj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Object objLIZ = obj;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL && (this.LLILZ > this.LLILZIL || ((ArrayList) C2427009fA.LJIIJJI()).isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            Activity activity = this.LLILZLL;
            this.LL = 1;
            objLIZ = C344950Dfh.LIZ(interfaceC497601wk, activity, false, z, this);
            if (objLIZ == objLJFF) {
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLIZ;
        long jLongValue = ((Number) pair.getFirst()).longValue();
        long jLongValue2 = ((Number) pair.getSecond()).longValue();
        EnumC344990Dfl enumC344990Dfl = EnumC344990Dfl.CLEAN_STORAGE_SILENCE;
        long j = this.LLILZ;
        long j2 = this.LLIZ;
        long j3 = this.LLIZLLLIL;
        if (jLongValue == 0 && ((ArrayList) C2427009fA.LJIIJJI()).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C344950Dfh.LIZJ(enumC344990Dfl, j, j2, j3, jLongValue, jLongValue2, true, false, z2, 256);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
