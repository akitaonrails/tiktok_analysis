package X;

import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildContentSectionActionBaseItem$1$2", f = "ProfileIdentifierFragment.kt", l = {581, 591}, m = "invokeSuspend")
public final class C1623506Xh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ProfileIdentifierFragment LL;
    public Object LLILLJJLI;
    public ProfileComponents LLILLL;
    public ProfileIdentifierFragment LLILZ;
    public int LLILZIL;
    public final /* synthetic */ ProfileIdentifierFragment LLILZLL;
    public final /* synthetic */ ProfileComponents LLIZ;
    public final /* synthetic */ View LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1623506Xh(ProfileIdentifierFragment profileIdentifierFragment, ProfileComponents profileComponents, View view, InterfaceC1364105Vn<? super C1623506Xh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = profileIdentifierFragment;
        this.LLIZ = profileComponents;
        this.LLIZLLLIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1623506Xh(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileIdentifierFragment profileIdentifierFragment;
        ProfileComponents profileComponents;
        View view;
        ProfileIdentifierFragment profileIdentifierFragment2;
        Object objLJI = obj;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildContentSectionActionBaseItem$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionActionBaseItem$1$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            profileIdentifierFragment2 = this.LLILZ;
            profileComponents = this.LLILLL;
            view = (View) this.LLILLJJLI;
            profileIdentifierFragment = this.LL;
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            profileIdentifierFragment = this.LLILZLL;
            profileComponents = this.LLIZ;
            n nVar = profileComponents.bizData;
            view = this.LLIZLLLIL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C1623406Xg c1623406Xg = new C1623406Xg(nVar, null);
            this.LL = profileIdentifierFragment;
            this.LLILLJJLI = view;
            this.LLILLL = profileComponents;
            this.LLILZ = profileIdentifierFragment;
            this.LLILZIL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1623406Xg);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionActionBaseItem$1$2");
                return objLJFF;
            }
            profileIdentifierFragment2 = profileIdentifierFragment;
        }
        if (objLJI != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1247830iZp c1247830iZp = new C1247830iZp(profileIdentifierFragment, objLJI, null, view, profileComponents, profileIdentifierFragment2);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = null;
            this.LLILZIL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1247830iZp) == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionActionBaseItem$1$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildContentSectionActionBaseItem$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
