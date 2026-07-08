package X;

import Y.ARunnableS4S0310000_2;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMGroupChatApi$Internal$onDFDownloadedImpl$1", f = "IMGroupChatApi.kt", l = {168}, m = "invokeSuspend")
public final class C1388305c1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1388305c1(Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, LifecycleOwner lifecycleOwner, Function0<Unit> function0, InterfaceC1364105Vn<? super C1388305c1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1388305c1(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZJ;
        C1C7U.LIZ("IMGroupChatApi$Internal@4fc.onDFDownloadedImpl$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                zLIZJ = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1311205Be.LIZ.getClass();
            zLIZJ = C2274381E0m.LIZIZ.LIZJ(true, false);
            if (zLIZJ) {
                Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILLL;
                this.LL = zLIZJ;
                this.LLILLJJLI = 1;
                obj = function1.invoke(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.onDFDownloadedImpl$1");
                    return objLJFF;
                }
            }
            C1311205Be c1311205Be = C1311205Be.LIZ;
            LifecycleOwner lifecycleOwner = this.LLILZ;
            Function1<InterfaceC1364105Vn<? super Unit>, Object> function12 = this.LLILLL;
            Function0<Unit> function0 = this.LLILZIL;
            c1311205Be.getClass();
            C08D9.LIZLLL().LIZ(new ARunnableS4S0310000_2(lifecycleOwner, function0, function12, zLIZJ, 1));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.onDFDownloadedImpl$1");
            return unit;
        }
        if (obj == null) {
            C1311205Be c1311205Be2 = C1311205Be.LIZ;
            LifecycleOwner lifecycleOwner2 = this.LLILZ;
            Function1<InterfaceC1364105Vn<? super Unit>, Object> function122 = this.LLILLL;
            Function0<Unit> function02 = this.LLILZIL;
            c1311205Be2.getClass();
            C08D9.LIZLLL().LIZ(new ARunnableS4S0310000_2(lifecycleOwner2, function02, function122, zLIZJ, 1));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMGroupChatApi$Internal@4fc.onDFDownloadedImpl$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
