package X;

import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildNavBarEnd$1$1", f = "ProfileIdentifierFragment.kt", l = {581, 591}, m = "invokeSuspend")
public final class C1623306Xf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ProfileIdentifierFragment LL;
    public Object LLILLJJLI;
    public ProfileComponents LLILLL;
    public ProfileIdentifierFragment LLILZ;
    public int LLILZIL;
    public final /* synthetic */ ProfileIdentifierFragment LLILZLL;
    public final /* synthetic */ ProfileComponents LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1623306Xf(ProfileIdentifierFragment profileIdentifierFragment, ProfileComponents profileComponents, Context context, InterfaceC1364105Vn<? super C1623306Xf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = profileIdentifierFragment;
        this.LLIZ = profileComponents;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1623306Xf(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileIdentifierFragment profileIdentifierFragment;
        ProfileComponents profileComponents;
        Context context;
        ProfileIdentifierFragment profileIdentifierFragment2;
        Object objLJI = obj;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildNavBarEnd$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildNavBarEnd$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            profileIdentifierFragment2 = this.LLILZ;
            profileComponents = this.LLILLL;
            context = (Context) this.LLILLJJLI;
            profileIdentifierFragment = this.LL;
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            profileIdentifierFragment = this.LLILZLL;
            profileComponents = this.LLIZ;
            n nVar = profileComponents.bizData;
            context = this.LLIZLLLIL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C1623206Xe c1623206Xe = new C1623206Xe(nVar, null);
            this.LL = profileIdentifierFragment;
            this.LLILLJJLI = context;
            this.LLILLL = profileComponents;
            this.LLILZ = profileIdentifierFragment;
            this.LLILZIL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1623206Xe);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildNavBarEnd$1$1");
                return objLJFF;
            }
            profileIdentifierFragment2 = profileIdentifierFragment;
        }
        if (objLJI != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1247820iZo c1247820iZo = new C1247820iZo(profileIdentifierFragment, objLJI, null, context, profileComponents, profileIdentifierFragment2);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = null;
            this.LLILZIL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1247820iZo) == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildNavBarEnd$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildNavBarEnd$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
