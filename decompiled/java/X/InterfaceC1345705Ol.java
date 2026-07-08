package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS390S0200000_24;

/* JADX INFO: renamed from: X.05Ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1345705Ol {
    int LIZ(String str);

    Pair LIZIZ(String str);

    String LIZJ(IMContact iMContact);

    String LIZLLL(String str);

    void LJ(User user, boolean z, Function1<? super Boolean, Unit> function1);

    void LJFF(C19EG c19eg, String str);

    Object LJI();

    void LJII(Aweme aweme, AwS390S0200000_24 awS390S0200000_24);

    Unit LJIIIIZZ(String str);

    void LJIIIZ(String str, C05OW c05ow);

    List LJIIJ(String str, List list);

    void LJIIJJI(String str, C05OZ c05oz);

    List<IMUser> LJIIL();

    void LJIILIIL(IMUser iMUser);

    void LJIILJJIL(IMUser iMUser);

    List<IMUser> LJIILL();

    List LJIILLIIL(int i);

    List<IMUser> getAllFriends();
}
