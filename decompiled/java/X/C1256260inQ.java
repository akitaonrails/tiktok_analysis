package X;

import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0inQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem$setAvatarNodeChangeMob$1$1$2", f = "ProfileAvatarAssem.kt", l = {}, m = "invokeSuspend")
public final class C1256260inQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileAvatarAssem LL;
    public final /* synthetic */ C013C LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256260inQ(ProfileAvatarAssem profileAvatarAssem, C013C c013c, InterfaceC1364105Vn<? super C1256260inQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileAvatarAssem;
        this.LLILLJJLI = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1256260inQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ProfileAvatarAssem@94f.setAvatarNodeChangeMob$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) this.LL.LLJJIJIIJIL.getValue();
        if (iProfileBaseAbility != null) {
            String scene = EnumC588120N4w.AVATAR_WIDGET.getScene();
            if (!this.LLILLJJLI.element && !this.LL.LLJILJIL) {
                z = false;
            } else {
                z = true;
            }
            iProfileBaseAbility.zl2(scene, z, this.LL.Ap());
        }
        this.LL.LLJJIJI = this.LLILLJJLI.element;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAvatarAssem@94f.setAvatarNodeChangeMob$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
