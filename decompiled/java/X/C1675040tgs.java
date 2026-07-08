package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {164}, m = "invokeSuspend")
public final class C1675040tgs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1675090tgx LLILLJJLI;
    public final /* synthetic */ InterfaceC1675120th0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675040tgs(InterfaceC1675090tgx interfaceC1675090tgx, InterfaceC1675120th0 interfaceC1675120th0, InterfaceC1364105Vn<? super C1675040tgs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1675090tgx;
        this.LLILLL = interfaceC1675120th0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1675040tgs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        long jLIZ;
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
            InterfaceC1675090tgx interfaceC1675090tgx = this.LLILLJJLI;
            if (interfaceC1675090tgx != null) {
                EnumC1675070tgv duration = interfaceC1675090tgx.getDuration();
                if (this.LLILLJJLI.LIZ() != null) {
                    z = true;
                } else {
                    z = false;
                }
                InterfaceC1675120th0 interfaceC1675120th0 = this.LLILLL;
                int i2 = C1675060tgu.LIZ[duration.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            jLIZ = 4000;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        jLIZ = 10000;
                    }
                } else {
                    jLIZ = Long.MAX_VALUE;
                }
                if (interfaceC1675120th0 != null) {
                    jLIZ = interfaceC1675120th0.LIZ(jLIZ, z);
                }
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLIZ, this) == objLJFF) {
                    return objLJFF;
                }
            }
            return Unit.LIZ;
        }
        this.LLILLJJLI.dismiss();
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
