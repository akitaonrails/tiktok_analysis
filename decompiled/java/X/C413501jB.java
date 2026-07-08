package X;

import com.google.gson.n;
import com.ss.android.ugc.profile.business.ur.platform.relationlabel.ProfileHeaderRelationLabelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.platform.relationlabel.ProfileHeaderRelationLabelComponent$parseDataAndUpdateData$2", f = "ProfileHeaderRelationLabelComponent.kt", l = {271}, m = "invokeSuspend")
public final class C413501jB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileHeaderRelationLabelComponent LLILLJJLI;
    public final /* synthetic */ n LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C413501jB(ProfileHeaderRelationLabelComponent profileHeaderRelationLabelComponent, n nVar, Function0<Unit> function0, InterfaceC1364105Vn<? super C413501jB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileHeaderRelationLabelComponent;
        this.LLILLL = nVar;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C413501jB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileHeaderRelationLabelComponent@f63d.parseDataAndUpdateData$2");
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
            this.LLILLJJLI.ep(this.LLILLL);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C413401jA c413401jA = new C413401jA(this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c413401jA) == objLJFF) {
                C1C7U.LIZIZ("ProfileHeaderRelationLabelComponent@f63d.parseDataAndUpdateData$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileHeaderRelationLabelComponent@f63d.parseDataAndUpdateData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
