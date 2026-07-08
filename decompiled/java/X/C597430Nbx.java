package X;

import com.google.gson.n;
import com.ss.android.ugc.profile.platform.base.data.ProfileBgBizData;
import com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent$parseBizDataAsync$1", f = "ProfileBackgroundComponent.kt", l = {229}, m = "invokeSuspend")
public final class C597430Nbx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ n LLILLJJLI;
    public final /* synthetic */ ProfileBackgroundComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597430Nbx(n nVar, ProfileBackgroundComponent profileBackgroundComponent, InterfaceC1364105Vn<? super C597430Nbx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nVar;
        this.LLILLL = profileBackgroundComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597430Nbx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileBackgroundComponent@e625.parseBizDataAsync$1");
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
            String string = this.LLILLJJLI.toString();
            this.LLILLL.getClass();
            ProfileBgBizData profileBgBizDataIp = ProfileBackgroundComponent.Ip(string);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C597440Nby c597440Nby = new C597440Nby(this.LLILLL, profileBgBizDataIp, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c597440Nby) == objLJFF) {
                C1C7U.LIZIZ("ProfileBackgroundComponent@e625.parseBizDataAsync$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileBackgroundComponent@e625.parseBizDataAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
