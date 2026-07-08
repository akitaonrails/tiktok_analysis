package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS23S2200000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.helper.authorization.AuthorizationFlowManager$newAuthFlow$1", f = "AuthorizationFlowManager.kt", l = {48}, m = "invokeSuspend")
public final class C1071010dyd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ EnumC1071030dyf LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071010dyd(Context context, EnumC1071030dyf enumC1071030dyf, String str, String str2, InterfaceC1364105Vn<? super C1071010dyd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = enumC1071030dyf;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1071010dyd c1071010dyd = new C1071010dyd(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1071010dyd.LLILLJJLI = obj;
        return c1071010dyd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthorizationFlowManager@6631.newAuthFlow$1");
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
            C095D c095dLIZ = ((C1071200dyw) C1070250dxP.LIZ(this.LLILLL, new AwS23S2200000_16((InterfaceC497601wk) this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, 5))).LIZ();
            Object obj2 = new InterfaceC346701Wf() { // from class: X.0dye
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj3, InterfaceC1364105Vn interfaceC1364105Vn) {
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c095dLIZ.collect(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("AuthorizationFlowManager@6631.newAuthFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthorizationFlowManager@6631.newAuthFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
