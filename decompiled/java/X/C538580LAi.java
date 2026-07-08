package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveOpKt$convertToDraft$2", f = "DraftSaveOp.kt", l = {}, m = "invokeSuspend")
public final class C538580LAi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public final /* synthetic */ C538590LAj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538580LAi(C538590LAj c538590LAj, InterfaceC1364105Vn<? super C538580LAi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c538590LAj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538580LAi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftSaveOpKt@48ea.convertToDraft$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MNC c0mncLJII = C0CHQ.LIZ().LJII();
        C538590LAj c538590LAj = this.LL;
        AwemeDraft awemeDraftLJI = c0mncLJII.LJI(c538590LAj.LIZ, c538590LAj.LIZIZ);
        C1C7U.LIZIZ("DraftSaveOpKt@48ea.convertToDraft$2");
        return awemeDraftLJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
