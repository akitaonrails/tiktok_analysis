package X;

import android.view.View;
import com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.059o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol$showPopAnimation$1", f = "ProfileNavbarSettingProtocol.kt", l = {505}, m = "invokeSuspend")
public final class C13070059o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileNavbarSettingProtocol LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13070059o(ProfileNavbarSettingProtocol profileNavbarSettingProtocol, View view, View view2, InterfaceC1364105Vn<? super C13070059o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileNavbarSettingProtocol;
        this.LLILLL = view;
        this.LLILZ = view2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13070059o(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileNavbarSettingProtocol@e8db.showPopAnimation$1");
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
            View view = (View) this.LLILLJJLI.LLLIIIL.getValue();
            if (view != null) {
                ProfileNavbarSettingProtocol profileNavbarSettingProtocol = this.LLILLJJLI;
                AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(profileNavbarSettingProtocol, 1128);
                profileNavbarSettingProtocol.getClass();
                ProfileNavbarSettingProtocol.LJLI(200L, view, awS546S0100000_2, false);
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C13068059m c13068059m = new C13068059m(null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c13068059m) == objLJFF) {
                C1C7U.LIZIZ("ProfileNavbarSettingProtocol@e8db.showPopAnimation$1");
                return objLJFF;
            }
        }
        ProfileNavbarSettingProtocol.LJLJJLL(12, this.LLILLL, this.LLILLJJLI, null, true);
        ProfileNavbarSettingProtocol profileNavbarSettingProtocol2 = this.LLILLJJLI;
        View view2 = this.LLILZ;
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(1147);
        profileNavbarSettingProtocol2.getClass();
        ProfileNavbarSettingProtocol.LJLI(300L, view2, aFwS187S0000000_2, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileNavbarSettingProtocol@e8db.showPopAnimation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
