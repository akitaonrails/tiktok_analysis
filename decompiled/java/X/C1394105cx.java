package X;

import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl$positiveForGoSettingDialog$3", f = "RelationAuthDialogControl.kt", l = {503}, m = "invokeSuspend")
public final class C1394105cx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RelationAuthDialogControl LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1394105cx(RelationAuthDialogControl relationAuthDialogControl, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC1364105Vn<? super C1394105cx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = relationAuthDialogControl;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1394105cx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RelationAuthDialogControl@8c10.positiveForGoSettingDialog$3");
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
            AnonymousClass0954 anonymousClass0954 = (AnonymousClass0954) this.LLILLJJLI.LLIZLLLIL.getValue();
            this.LL = 1;
            obj = anonymousClass0954.LJIILIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RelationAuthDialogControl@8c10.positiveForGoSettingDialog$3");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = this.LLILLL;
            C189200o6.m2constructorimpl(true);
            interfaceC20236714Gf.resumeWith(true);
        } else {
            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = this.LLILLL;
            C189200o6.m2constructorimpl(false);
            interfaceC20236714Gf2.resumeWith(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationAuthDialogControl@8c10.positiveForGoSettingDialog$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
