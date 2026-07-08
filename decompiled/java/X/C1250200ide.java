package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ide, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.base.OldUserAndProfileUserAdapter$transformToProfileUser$2", f = "OldUserAndProfileUserAdapter.kt", l = {}, m = "invokeSuspend")
public final class C1250200ide extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ User LL;
    public final /* synthetic */ ProfileUser LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<ProfileUser, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1250200ide(User user, ProfileUser profileUser, boolean z, Function1<? super ProfileUser, Unit> function1, InterfaceC1364105Vn<? super C1250200ide> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = user;
        this.LLILLJJLI = profileUser;
        this.LLILLL = z;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1250200ide(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OldUserAndProfileUserAdapter@d47a.transformToProfileUser$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1251850igJ c1251850igJ = C1251850igJ.LIZ;
        User user = this.LL;
        ProfileUser profileUser = this.LLILLJJLI;
        boolean z = this.LLILLL;
        Function1<ProfileUser, Unit> function1 = this.LLILZ;
        c1251850igJ.getClass();
        C1251850igJ.LJFF(user, profileUser, z, function1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OldUserAndProfileUserAdapter@d47a.transformToProfileUser$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
