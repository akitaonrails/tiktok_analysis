package X;

import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem$mobProfileBadgeShow$1$1", f = "ProfileAvatarAssem.kt", l = {}, m = "invokeSuspend")
public final class C443020HYu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileAvatarAssem LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443020HYu(ProfileAvatarAssem profileAvatarAssem, String str, InterfaceC1364105Vn<? super C443020HYu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileAvatarAssem;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C443020HYu(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ProfileBadgeStruct profileBadge;
        String uid;
        Object id;
        ProfileBadgeStruct profileBadge2;
        C1C7U.LIZ("ProfileAvatarAssem@94f.mobProfileBadgeShow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        User userIp = this.LL.ip();
        if (userIp != null && (profileBadge = userIp.getProfileBadge()) != null && profileBadge.getShouldShow()) {
            C0LAB c0lab = new C0LAB();
            User userIp2 = this.LL.ip();
            if (userIp2 != null) {
                uid = userIp2.getUid();
            } else {
                uid = null;
            }
            c0lab.LJ("author_id", uid);
            c0lab.LJ("enter_from", this.LL.ep());
            User userIp3 = this.LL.ip();
            String str = "";
            if (userIp3 == null || (profileBadge2 = userIp3.getProfileBadge()) == null || (id = profileBadge2.getId()) == null) {
                id = "";
            }
            c0lab.LIZLLL(id, "badge_id");
            String str2 = this.LLILLJJLI;
            if (str2 != null) {
                str = str2;
            }
            c0lab.LJ("group_id", str);
            C20684815ws.LJIILLIIL("profile_badge_show", c0lab.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileAvatarAssem@94f.mobProfileBadgeShow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
