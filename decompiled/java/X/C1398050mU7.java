package X;

import com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder$goToCameraWithUnpublishedEffect$1", f = "EffectProfileViewHolder.kt", l = {450, 458, 458}, m = "invokeSuspend")
public final class C1398050mU7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ EffectProfileViewHolder LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398050mU7(EffectProfileViewHolder effectProfileViewHolder, InterfaceC1364105Vn<? super C1398050mU7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = effectProfileViewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1398050mU7 c1398050mU7 = new C1398050mU7(this.LLILZIL, interfaceC1364105Vn);
        c1398050mU7.LLILZ = obj;
        return c1398050mU7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0206  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398050mU7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
