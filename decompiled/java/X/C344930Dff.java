package X;

import android.app.Activity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1$cleanCacheJob$1", f = "RecordConditionCheck.kt", l = {135}, m = "invokeSuspend")
public final class C344930Dff extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Long, ? extends Long>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344930Dff(Activity activity, InterfaceC1364105Vn<? super C344930Dff> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C344930Dff c344930Dff = new C344930Dff(this.LLILLL, interfaceC1364105Vn);
        c344930Dff.LLILLJJLI = obj;
        return c344930Dff;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Activity activity = this.LLILLL;
            this.LL = 1;
            obj = C344950Dfh.LIZ(interfaceC497601wk, activity, true, false, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Long, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
