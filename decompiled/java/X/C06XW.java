package X;

import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06XW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildHeader$1$1$1$1", f = "ProfileIdentifierFragment.kt", l = {581, 591}, m = "invokeSuspend")
public final class C06XW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ProfileIdentifierFragment LL;
    public Object LLILLJJLI;
    public C427660Gpo LLILLL;
    public int LLILZ;
    public final /* synthetic */ ProfileIdentifierFragment LLILZIL;
    public final /* synthetic */ ProfileComponents LLILZLL;
    public final /* synthetic */ View LLIZ;
    public final /* synthetic */ C427660Gpo LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06XW(ProfileIdentifierFragment profileIdentifierFragment, ProfileComponents profileComponents, View view, C427660Gpo c427660Gpo, InterfaceC1364105Vn<? super C06XW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = profileIdentifierFragment;
        this.LLILZLL = profileComponents;
        this.LLIZ = view;
        this.LLIZLLLIL = c427660Gpo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06XW(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileIdentifierFragment profileIdentifierFragment;
        View view;
        C427660Gpo c427660Gpo;
        Object objLJI = obj;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildHeader$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildHeader$1$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c427660Gpo = this.LLILLL;
            view = (View) this.LLILLJJLI;
            profileIdentifierFragment = this.LL;
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            profileIdentifierFragment = this.LLILZIL;
            n nVar = this.LLILZLL.bizData;
            view = this.LLIZ;
            c427660Gpo = this.LLIZLLLIL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C06XV c06xv = new C06XV(nVar, null);
            this.LL = profileIdentifierFragment;
            this.LLILLJJLI = view;
            this.LLILLL = c427660Gpo;
            this.LLILZ = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c06xv);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildHeader$1$1$1$1");
                return objLJFF;
            }
        }
        if (objLJI != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C06XX c06xx = new C06XX(profileIdentifierFragment, objLJI, null, view, c427660Gpo);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c06xx) == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildHeader$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildHeader$1$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
