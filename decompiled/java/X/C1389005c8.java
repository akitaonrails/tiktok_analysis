package X;

import android.content.Context;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerProcessor$start$3", f = "CreationComposerProcessor.kt", l = {51}, m = "invokeSuspend")
public final class C1389005c8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreationConfigModelCompat LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389005c8(CreationConfigModelCompat creationConfigModelCompat, Context context, InterfaceC1364105Vn<? super C1389005c8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creationConfigModelCompat;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1389005c8 c1389005c8 = new C1389005c8(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1389005c8.LLILLJJLI = obj;
        return c1389005c8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationComposerProcessor@8bd3.start$3");
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
            C0MOV c0mov = new C0MOV(this.LLILLL);
            Context context = this.LLILZ;
            this.LL = 1;
            if (c0mov.LIZIZ(context, interfaceC497601wk, this) == objLJFF) {
                C1C7U.LIZIZ("CreationComposerProcessor@8bd3.start$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationComposerProcessor@8bd3.start$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
