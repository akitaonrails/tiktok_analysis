package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$tryRouteFindFriendsPage$ffpVM$1", f = "AuthCardListScopeAbility.kt", l = {}, m = "invokeSuspend")
public final class C1070960dyY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1070980dya>, Object> {
    public final /* synthetic */ AuthCardListScopeAbility LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070960dyY(AuthCardListScopeAbility authCardListScopeAbility, InterfaceC1364105Vn<? super C1070960dyY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = authCardListScopeAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1070960dyY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthCardListScopeAbility@fdb1.tryRouteFindFriendsPage$ffpVM$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1070970dyZ c1070970dyZ = InterfaceC1070980dya.LJJZZI;
        LifecycleOwner lifecycleOwnerLIZJ = C1262490ixT.LIZJ(this.LL.getConfig());
        c1070970dyZ.getClass();
        InterfaceC1070980dya interfaceC1070980dyaLJJIFFI = C1076010e6h.LIZJ.LJJIFFI("shared_from_ffp", lifecycleOwnerLIZJ);
        C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.tryRouteFindFriendsPage$ffpVM$1");
        return interfaceC1070980dyaLJJIFFI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC1070980dya> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
