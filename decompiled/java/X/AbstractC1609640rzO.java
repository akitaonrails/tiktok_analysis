package X;

import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S0220000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1609640rzO {
    public boolean LIZJ;
    public User LIZLLL;
    public AnonymousClass0956 LJII;
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1903));
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZ);
    public final C1609730rzX LJ = new C1609730rzX(null, null, null);
    public final C1609730rzX LJFF = new C1609730rzX(null, null, null);
    public final C01GW LJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1904));

    public abstract InterfaceC1400360mXq LJFF();

    public abstract AvatarComponentView LJI();

    public abstract void LJIILIIL(Object obj, boolean z, boolean z2);

    public final ViewGroup LJIIIIZZ() {
        return (ViewGroup) this.LIZ.getValue();
    }

    public final void LJIIL() {
        try {
            if (this.LIZJ) {
                ((C1400340mXo) C0I0B.LJFF.LIZ()).LJII((InterfaceC1400360mXq) this.LJI.getValue());
            }
            C2296808zG.LIZJ(this.LIZIZ, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1609730rzX LJII() {
        return this.LJ;
    }

    public AbstractC1609640rzO(AvatarComponentView avatarComponentView) {
    }

    public static AnonymousClass0956 LJIIJ(Function0 function0, C054G c054g) {
        return C23250099c.LIZLLL(c054g, null, null, new C01JW(function0, null), 3);
    }

    public final void LJIIIZ(User user, User user2) {
        C1256520inq c1256520inq;
        InterfaceC1606880ruw interfaceC1606880ruw = LJI().getCurrentActiveBusiness().get(EnumC1607270rvZ.PERSON);
        if (!(interfaceC1606880ruw instanceof C1256520inq) || (c1256520inq = (C1256520inq) interfaceC1606880ruw) == null || !c1256520inq.LLILLJJLI) {
            return;
        }
        try {
            List<String> listLJLILLLLZI = user2.boldFields;
            if ((listLJLILLLLZI == null || !listLJLILLLLZI.contains("photo")) && (C1609680rzS.LIZ(user2, user) || !Intrinsics.LJFF(user2.getSocialAvatarWithBackground(), user.getSocialAvatarWithBackground()) || !Intrinsics.LJFF(user2.getSocialAvatarWithoutBackground(), user.getSocialAvatarWithoutBackground()) || !Intrinsics.LJFF(user2.getDynamicSocialAvatar(), user.getDynamicSocialAvatar()))) {
                listLJLILLLLZI = listLJLILLLLZI != null ? C13LP.LJLILLLLZI("photo", listLJLILLLLZI) : C1697810uHb.LJIILJJIL("photo");
            }
            User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
            if (currentUser != null) {
                currentUser.boldFields = listLJLILLLLZI;
            }
            user2.setBoldFields(listLJLILLLLZI);
            LJI().LJIILIIL(user2, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LJIIJJI(String str, String str2) {
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        C0I0B c0i0b = C0I0B.LJFF;
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (Intrinsics.LJFF(str2, curUserId)) {
            ((C1400340mXo) c0i0b.LIZ()).LJ((InterfaceC1400360mXq) this.LJI.getValue());
        } else {
            if (!Intrinsics.LJFF(str, curUserId)) {
                return;
            }
            ((C1400340mXo) c0i0b.LIZ()).LJII((InterfaceC1400360mXq) this.LJI.getValue());
        }
    }

    public final void LJ(Object obj, boolean z, boolean z2) {
        String uid;
        String uid2;
        User user;
        User user2;
        boolean z3 = obj instanceof User;
        if (z3 && (user2 = (User) obj) != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        User user3 = this.LIZLLL;
        if (user3 != null) {
            uid2 = user3.getUid();
        } else {
            uid2 = null;
        }
        if (!Intrinsics.LJFF(uid, uid2)) {
            LJII().LIZLLL();
        }
        if (z3) {
            user = (User) obj;
        } else {
            user = null;
        }
        this.LIZLLL = user;
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if ((iMFoundationBridgeApiLIZ != null && iMFoundationBridgeApiLIZ.LJIIL()) || !z) {
            AnonymousClass0956 anonymousClass0956 = this.LJII;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJII = LJIIJ(new AwS12S0220000_24(this, obj, z, z2, 1), this.LIZIZ);
            return;
        }
        LJIILIIL(obj, z, z2);
    }
}
