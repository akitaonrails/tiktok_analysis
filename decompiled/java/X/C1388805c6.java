package X;

import android.content.Context;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerProcessor$start$2", f = "CreationComposerProcessor.kt", l = {44}, m = "invokeSuspend")
public final class C1388805c6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreationConfigModelCompat LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388805c6(CreationConfigModelCompat creationConfigModelCompat, Context context, InterfaceC1364105Vn<? super C1388805c6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creationConfigModelCompat;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1388805c6 c1388805c6 = new C1388805c6(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1388805c6.LLILLJJLI = obj;
        return c1388805c6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationComposerProcessor@8bd3.start$2");
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
            C0MOT c0mot = new C0MOT(this.LLILLL);
            Context context = this.LLILZ;
            this.LL = 1;
            if (c0mot.LIZ(context, this) == objLJFF) {
                C1C7U.LIZIZ("CreationComposerProcessor@8bd3.start$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationComposerProcessor@8bd3.start$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
