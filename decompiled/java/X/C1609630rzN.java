package X;

import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0rzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.avatar.ui.SocialAvatarImageExecutor$runBindImage$2$1", f = "SocialAvatarImageExecutor.kt", l = {153}, m = "invokeSuspend")
public final class C1609630rzN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1609600rzK LLILLJJLI;
    public final /* synthetic */ C419460Gca LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609630rzN(C1609600rzK c1609600rzK, C419460Gca c419460Gca, Object obj, boolean z, InterfaceC1364105Vn<? super C1609630rzN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1609600rzK;
        this.LLILLL = c419460Gca;
        this.LLILZ = obj;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1609630rzN(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        C1C7U.LIZ("SocialAvatarImageExecutor@8a2c.runBindImage$2$1");
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
            Object obj2 = this.LLILZ;
            boolean z = avatarComponentView.getConfig().LIZ.LJIJI;
            this.LL = 1;
            obj = C1609650rzP.LIZ(c1609760rza, c1609730rzX, avatarComponentView, c419460Gca, obj2, Boolean.FALSE, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAvatarImageExecutor@8a2c.runBindImage$2$1");
                return objLJFF;
            }
        }
        C1609770rzb c1609770rzb = (C1609770rzb) obj;
        String str = c1609770rzb.LJ;
        User user = this.LLILLJJLI.LIZLLL;
        String uid2 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (Intrinsics.LJFF(str, uid) && c1609770rzb.LIZIZ) {
            C1609600rzK c1609600rzK2 = this.LLILLJJLI;
            C1609760rza c1609760rza2 = c1609600rzK2.LJIJJLI;
            c1609760rza2.LJ = c1609770rzb.LIZLLL;
            c1609760rza2.LJI = c1609770rzb.LIZJ;
            c1609600rzK2.LJIJ(false);
        } else {
            C1609600rzK c1609600rzK3 = this.LLILLJJLI;
            C1609760rza c1609760rza3 = c1609600rzK3.LJIJJLI;
            c1609760rza3.LJ = null;
            c1609760rza3.LJI = null;
            c1609600rzK3.LJIJ(true);
            C1609600rzK c1609600rzK4 = this.LLILLJJLI;
            c1609600rzK4.LJIIIZ.LJ(c1609600rzK4.LIZLLL, this.LLILZIL, false);
        }
        C1609600rzK c1609600rzK5 = this.LLILLJJLI;
        C1609760rza c1609760rza4 = c1609600rzK5.LJIJJLI;
        User user2 = c1609600rzK5.LIZLLL;
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        c1609760rza4.LJFF = uid2;
        this.LLILLJJLI.LJIJJLI.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarImageExecutor@8a2c.runBindImage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
