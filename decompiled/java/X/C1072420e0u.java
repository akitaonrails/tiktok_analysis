package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS417S0200000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$refreshListByAuth$2", f = "AuthCardListScopeAbility.kt", l = {}, m = "invokeSuspend")
public final class C1072420e0u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AuthCardListScopeAbility LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EnumC1070410dxf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072420e0u(EnumC1070410dxf enumC1070410dxf, AuthCardListScopeAbility authCardListScopeAbility, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = authCardListScopeAbility;
        this.LLILLJJLI = z;
        this.LLILLL = enumC1070410dxf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072420e0u(this.LLILLL, this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthCardListScopeAbility@fdb1.refreshListByAuth$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final AuthCardListScopeAbility authCardListScopeAbility = this.LL;
        IUserCardListAbility iUserCardListAbility = authCardListScopeAbility.LLILZ;
        final boolean z = this.LLILLJJLI;
        final EnumC1070410dxf enumC1070410dxf = this.LLILLL;
        iUserCardListAbility.Eg(new InterfaceC1261750iwH() { // from class: X.0e0v
            @Override // X.InterfaceC1261750iwH
            public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void LLF(RecyclerView recyclerView, int i) {
            }

            @Override // X.InterfaceC1261750iwH
            public final void nO0(C1075800e6M c1075800e6M) {
                AbstractC1623806Xk<C626160OhC> abstractC1623806Xk = c1075800e6M.LIZ;
                AbstractC1623806Xk<List<InterfaceC1891350zJl>> abstractC1623806Xk2 = c1075800e6M.LIZJ;
                if ((abstractC1623806Xk instanceof C1623606Xi) && (abstractC1623806Xk2 instanceof C1623606Xi)) {
                    if (c1075800e6M.LIZLLL() && z) {
                        AuthCardListScopeAbility authCardListScopeAbility2 = authCardListScopeAbility;
                        EnumC1070410dxf enumC1070410dxf2 = enumC1070410dxf;
                        authCardListScopeAbility2.getClass();
                        C447550Hgn.LIZLLL(new AwS417S0200000_16(authCardListScopeAbility2, enumC1070410dxf2, 67));
                    }
                    authCardListScopeAbility.LLILZ.ng(this);
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthCardListScopeAbility@fdb1.refreshListByAuth$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
