package X;

import android.widget.LinearLayout;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06XU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildContentSectionInfoListBaseItem$2$1", f = "ProfileIdentifierFragment.kt", l = {581, 591}, m = "invokeSuspend")
public final class C06XU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ProfileIdentifierFragment LL;
    public Object LLILLJJLI;
    public ProfileIdentifierFragment LLILLL;
    public int LLILZ;
    public final /* synthetic */ ProfileIdentifierFragment LLILZIL;
    public final /* synthetic */ ProfileComponents LLILZLL;
    public final /* synthetic */ LinearLayout LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06XU(ProfileIdentifierFragment profileIdentifierFragment, ProfileComponents profileComponents, LinearLayout linearLayout, InterfaceC1364105Vn<? super C06XU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = profileIdentifierFragment;
        this.LLILZLL = profileComponents;
        this.LLIZ = linearLayout;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06XU(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileIdentifierFragment profileIdentifierFragment;
        LinearLayout linearLayout;
        ProfileIdentifierFragment profileIdentifierFragment2;
        Object objLJI = obj;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildContentSectionInfoListBaseItem$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionInfoListBaseItem$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            profileIdentifierFragment2 = this.LLILLL;
            linearLayout = (LinearLayout) this.LLILLJJLI;
            profileIdentifierFragment = this.LL;
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            profileIdentifierFragment = this.LLILZIL;
            n nVar = this.LLILZLL.bizData;
            linearLayout = this.LLIZ;
            C1DFB c1dfb = C0PEM.LIZJ;
            C06XT c06xt = new C06XT(nVar, null);
            this.LL = profileIdentifierFragment;
            this.LLILLJJLI = linearLayout;
            this.LLILLL = profileIdentifierFragment;
            this.LLILZ = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c06xt);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionInfoListBaseItem$2$1");
                return objLJFF;
            }
            profileIdentifierFragment2 = profileIdentifierFragment;
        }
        if (objLJI != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C06XS c06xs = new C06XS(profileIdentifierFragment, objLJI, null, linearLayout, profileIdentifierFragment2);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c06xs) == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionInfoListBaseItem$2$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionInfoListBaseItem$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
