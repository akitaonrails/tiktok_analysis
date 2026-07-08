package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import njp.a;

/* JADX INFO: renamed from: X.01oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.FilePlatformMiscMultithread$onExit$1$1", f = "FilePlatformMiscMultithread.kt", l = {243}, m = "invokeSuspend")
public final class C444901oF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AE LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444901oF(C09AE c09ae, InterfaceC1364105Vn<? super C444901oF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09ae;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C444901oF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Sequence<C09AE> sequenceLIZ;
        List listLJJII;
        C1C7U.LIZ("FilePlatformMiscMultithread@6f22.onExit$1$1");
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
            C09AE c09ae = this.LLILLJJLI;
            if (c09ae != null && (sequenceLIZ = c09ae.LIZ()) != null && (listLJJII = C09RB.LJJII(sequenceLIZ)) != null) {
                this.LL = 1;
                if (C1D9F.LIZJ(listLJJII, this) == objLJFF) {
                    C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.onExit$1$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.onExit$1$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("FilePlatformMiscMultithread@6f22.onExit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
