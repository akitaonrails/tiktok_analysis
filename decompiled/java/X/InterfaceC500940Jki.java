package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Jki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC500940Jki {
    C11NZ<FollowPair> LIZ(C1812130xFz c1812130xFz);

    C11NZ<FollowPair> LIZIZ(long j);

    void LIZJ(InterfaceC2262081DgM interfaceC2262081DgM);

    C11NZ<FollowPair> LIZLLL(C1099330eiJ c1099330eiJ);

    AbstractC19484711Kz<User> LJ(long j, String str, String str2);

    C11NZ<FollowPair> LJFF();

    C11NZ<FollowPair> LJI(C1812120xFy c1812120xFy);

    C11NN<C784060UpI> LJII();

    AbstractC19484711Kz<User> LJIIIIZZ(long j);

    C11NZ<InterfaceC2262081DgM> LJIIIZ(long j);

    AbstractC19484711Kz LJIIJ(String str, HashMap map);

    void LJIIJJI(FollowPair followPair);

    AbstractC19484711Kz<InterfaceC2262081DgM> LJIIL(String str);

    AbstractC19484711Kz<User> LJIILIIL(User user);

    boolean LJIILJJIL();

    C11NZ<InterfaceC2262081DgM> LJIILL(Context context, C501600Jlm c501600Jlm);

    AbstractC19484711Kz<InterfaceC2262081DgM> LJIILLIIL();

    void LJIIZILJ(User user);

    String LJIJ(long j);

    boolean LJIJI(EnumC1134120fcQ enumC1134120fcQ);

    AbstractC19484711Kz<User> LJIJJ(long j, String str);

    User LJIJJLI();

    AbstractC19484711Kz LJIL(HashMap map);

    List<C750550TcL> getAllFriends();

    InterfaceC2262081DgM getCurrentUser();

    long getCurrentUserId();

    boolean isLogin();
}
