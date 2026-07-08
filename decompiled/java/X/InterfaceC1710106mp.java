package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1710106mp {
    void LIZ(Map<String, MatchedFriendStruct> map);

    MatchedFriendStruct LIZIZ(String str);

    void LIZJ(InterfaceC1480505qt interfaceC1480505qt, String str, String str2, String str3, boolean z);

    IMUser LIZLLL(String str, String str2, String str3);

    IMUser LJ(String str, String str2);

    void LJFF(IMUser iMUser);

    void LJI(InterfaceC1480505qt interfaceC1480505qt, String str, String str2, String str3, boolean z);

    void LJII();

    Object LJIIIIZZ(List list, AbstractC23140094w abstractC23140094w);

    Object LJIIIZ(IMUser iMUser, IMUser iMUser2, C1483005rI c1483005rI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object LJIIJ(String str, String str2, boolean z, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn);

    Object LJIIJJI(List list, C1BG6 c1bg6);

    IMUser LJIIL(String str, String str2, String str3);

    Object LJIILIIL(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2, boolean z3);

    List<IMUser> getAllFriends();
}
