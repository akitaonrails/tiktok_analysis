package X;

import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0inR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem$setAvatarNodeChangeMob$1$1", f = "ProfileAvatarAssem.kt", l = {}, m = "invokeSuspend")
public final class C1256270inR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Map<EnumC1608710rxt, C1609000ryM> LLILLJJLI;
    public final /* synthetic */ ProfileAvatarAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256270inR(Map<EnumC1608710rxt, C1609000ryM> map, ProfileAvatarAssem profileAvatarAssem, InterfaceC1364105Vn<? super C1256270inR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = profileAvatarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1256270inR c1256270inR = new C1256270inR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1256270inR.LL = obj;
        return c1256270inR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AbstractC1606980rv6 abstractC1606980rv6LIZ;
        InterfaceC1609010ryN interfaceC1609010ryN;
        C1C7U.LIZ("ProfileAvatarAssem@94f.setAvatarNodeChangeMob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C013C c013c = new C013C();
        Map<EnumC1608710rxt, C1609000ryM> map = this.LLILLJJLI;
        boolean z2 = true;
        if (map != null) {
            ProfileAvatarAssem profileAvatarAssem = this.LLILLL;
            for (Map.Entry<EnumC1608710rxt, C1609000ryM> entry : map.entrySet()) {
                EnumC1608710rxt key = entry.getKey();
                C1609000ryM value = entry.getValue();
                if (profileAvatarAssem.op() && !Intrinsics.LJFF(key.name(), "AVATAR") && !Intrinsics.LJFF(key.name(), "STROKE") && !Intrinsics.LJFF(key.name(), "OVERLAY") && !Intrinsics.LJFF(key.name(), "BADGE")) {
                    c013c.element = true;
                }
                if (value != null && (interfaceC1609010ryN = value.LIZJ) != null) {
                    abstractC1606980rv6LIZ = interfaceC1609010ryN.LIZ();
                } else {
                    abstractC1606980rv6LIZ = null;
                }
                if (abstractC1606980rv6LIZ instanceof C1606970rv5) {
                    C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                    boolean zQ1 = profileAvatarAssem.q1();
                    EnumC1248370iah enumC1248370iah = EnumC1248370iah.AVATAR;
                    EnumC1256400ine.Companion.getClass();
                    String lowerCase = C1256410inf.LIZ(key).name().toLowerCase(Locale.ROOT);
                    c1245340iVo.getClass();
                    C1245340iVo.LJIIJJI(zQ1, enumC1248370iah, lowerCase, true, null);
                }
            }
        }
        if (this.LLILLL.op()) {
            ProfileAvatarAssem profileAvatarAssem2 = this.LLILLL;
            if (!profileAvatarAssem2.LLJJIJI && !profileAvatarAssem2.LLJILJIL) {
                z = false;
            } else {
                z = true;
            }
            if (!c013c.element && !profileAvatarAssem2.LLJILJIL) {
                z2 = false;
            }
            if (z != z2) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1256260inQ(profileAvatarAssem2, c013c, null), 2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAvatarAssem@94f.setAvatarNodeChangeMob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
