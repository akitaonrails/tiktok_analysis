package X;

import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity$onCreate$6", f = "CreatorCaptionEditActivity.kt", l = {497}, m = "invokeSuspend")
public final class C18ZR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorCaptionEditActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18ZR(CreatorCaptionEditActivity creatorCaptionEditActivity, InterfaceC1364105Vn<? super C18ZR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorCaptionEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18ZR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorCaptionEditActivity@fad2.onCreate$6");
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
            C861640Xr8 c861640Xr8 = new C861640Xr8(new C21382918mB(this.LLILLJJLI, null), this.LLILLJJLI.LLLLZLL().LLILZ);
            this.LL = 1;
            if (C09IC.LJI(c861640Xr8, this) == objLJFF) {
                C1C7U.LIZIZ("CreatorCaptionEditActivity@fad2.onCreate$6");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorCaptionEditActivity@fad2.onCreate$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
