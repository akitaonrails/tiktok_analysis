package X;

import android.view.View;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06XZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment$buildBottom$1$1$1", f = "ProfileIdentifierFragment.kt", l = {581, 591}, m = "invokeSuspend")
public final class C06XZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ProfileIdentifierFragment LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ ProfileIdentifierFragment LLILZ;
    public final /* synthetic */ ProfileComponents LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06XZ(ProfileIdentifierFragment profileIdentifierFragment, ProfileComponents profileComponents, View view, InterfaceC1364105Vn<? super C06XZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = profileIdentifierFragment;
        this.LLILZIL = profileComponents;
        this.LLILZLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06XZ(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileIdentifierFragment profileIdentifierFragment;
        View view;
        C1C7U.LIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            view = (View) this.LLILLJJLI;
            profileIdentifierFragment = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            profileIdentifierFragment = this.LLILZ;
            n nVar = this.LLILZIL.bizData;
            view = this.LLILZLL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C06XY c06xy = new C06XY(nVar, null);
            this.LL = profileIdentifierFragment;
            this.LLILLJJLI = view;
            this.LLILLL = 1;
            obj = C23250099c.LJI(this, c1dfb, c06xy);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1");
                return objLJFF;
            }
        }
        if (obj != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1622806Xa c1622806Xa = new C1622806Xa(profileIdentifierFragment, obj, null, view);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1622806Xa) == objLJFF) {
                C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierFragment@f464.buildBottom$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
