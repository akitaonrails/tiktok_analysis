package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.ui.SocialAvatarImageExecutor$setAvatarPersonUrl$1$1", f = "SocialAvatarImageExecutor.kt", l = {254}, m = "invokeSuspend")
public final class C1609620rzM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1609600rzK LLILLJJLI;
    public final /* synthetic */ C419460Gca LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609620rzM(C1609600rzK c1609600rzK, C419460Gca c419460Gca, List<String> list, InterfaceC1364105Vn<? super C1609620rzM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1609600rzK;
        this.LLILLL = c419460Gca;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1609620rzM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1609780rzc interfaceC1609780rzc;
        InterfaceC1609780rzc interfaceC1609780rzc2;
        C1C7U.LIZ("SocialAvatarImageExecutor@8a2c.setAvatarPersonUrl$1$1");
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
            C1609600rzK c1609600rzK = this.LLILLJJLI;
            C1609760rza c1609760rza = c1609600rzK.LJIJJLI;
            C1609730rzX c1609730rzX = c1609600rzK.LJFF;
            AvatarComponentView avatarComponentView = c1609600rzK.LJIIIIZZ;
            C419460Gca c419460Gca = this.LLILLL;
            List<String> list = this.LLILZ;
            boolean z = this.LLILLJJLI.LJIIIIZZ.getConfig().LIZ.LJIJI;
            this.LL = 1;
            obj = C1609650rzP.LIZ(c1609760rza, c1609730rzX, avatarComponentView, c419460Gca, list, true, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarImageExecutor@8a2c.setAvatarPersonUrl$1$1");
                return objLJFF;
            }
        }
        C1609770rzb c1609770rzb = (C1609770rzb) obj;
        if (c1609770rzb.LIZIZ) {
            C1609600rzK c1609600rzK2 = this.LLILLJJLI;
            C1609760rza c1609760rza2 = c1609600rzK2.LJIJJLI;
            c1609760rza2.LJ = c1609770rzb.LIZLLL;
            c1609760rza2.LJI = c1609770rzb.LIZJ;
            c1609760rza2.LJFF = c1609600rzK2.LJIIIIZZ.getUid();
            C1609410rz1 c1609410rz1LJIILLIIL = this.LLILLJJLI.LJIILLIIL();
            if (c1609410rz1LJIILLIIL != null && (interfaceC1609780rzc2 = c1609410rz1LJIILLIIL.LIZJ) != null) {
                interfaceC1609780rzc2.y1(false);
            }
            this.LLILLJJLI.LJIJ(false);
        } else {
            this.LLILLJJLI.LJIJ(true);
            C1609600rzK c1609600rzK3 = this.LLILLJJLI;
            c1609600rzK3.LJIIIZ.LJ(c1609600rzK3.LIZLLL, true, false);
            C1609410rz1 c1609410rz1LJIILLIIL2 = this.LLILLJJLI.LJIILLIIL();
            if (c1609410rz1LJIILLIIL2 != null && (interfaceC1609780rzc = c1609410rz1LJIILLIIL2.LIZJ) != null) {
                interfaceC1609780rzc.Gi();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarImageExecutor@8a2c.setAvatarPersonUrl$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
