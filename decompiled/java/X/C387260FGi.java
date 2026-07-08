package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.common.text.pro.motion.TextMotionCategoryPagerComponent$onTextMotionClick$1", f = "TextMotionCategoryPagerComponent.kt", l = {221}, m = "invokeSuspend")
public final class C387260FGi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C387270FGj LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387260FGi(C387270FGj c387270FGj, Effect effect, boolean z, long j, int i, InterfaceC1364105Vn<? super C387260FGi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c387270FGj;
        this.LLILLL = effect;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387260FGi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C0FGR c0fgrT4;
        C1C7U.LIZ("TextMotionCategoryPagerComponent@fcb5.onTextMotionClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0FDM c0fdmZ4 = this.LLILLJJLI.Z4();
            if (c0fdmZ4 != null) {
                Effect effect = this.LLILLL;
                this.LL = 1;
                objLIZIZ = c0fdmZ4.LIZIZ(effect, null, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("TextMotionCategoryPagerComponent@fcb5.onTextMotionClick$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TextMotionCategoryPagerComponent@fcb5.onTextMotionClick$1");
            return unit;
        }
        C387270FGj c387270FGj = this.LLILLJJLI;
        Effect effect2 = this.LLILLL;
        boolean z = this.LLILZ;
        long j = this.LLILZIL;
        int i2 = this.LLILZLL;
        if (C189200o6.m8isSuccessimpl(objLIZIZ)) {
            Effect effect3 = (Effect) objLIZIZ;
            C0FGR c0fgrT42 = c387270FGj.T4();
            if (c0fgrT42 != null) {
                c0fgrT42.LJJIIJZLJL(System.currentTimeMillis() - j, effect2.getResourceId(), true, z);
            }
            c387270FGj.v5(effect3, i2);
        }
        C387270FGj c387270FGj2 = this.LLILLJJLI;
        Effect effect4 = this.LLILLL;
        boolean z2 = this.LLILZ;
        long j2 = this.LLILZIL;
        if (C189200o6.m5exceptionOrNullimpl(objLIZIZ) != null && (c0fgrT4 = c387270FGj2.T4()) != null) {
            c0fgrT4.LJJIIJZLJL(System.currentTimeMillis() - j2, effect4.getResourceId(), false, z2);
        }
        C189200o6.m1boximpl(objLIZIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TextMotionCategoryPagerComponent@fcb5.onTextMotionClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
