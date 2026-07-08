package X;

import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0rfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597150rfF implements InterfaceC1597210rfL<C1597170rfH>, InterfaceC1596890rep {
    @Override // X.InterfaceC1596890rep
    public final void LIZIZ(C1597440rfi c1597440rfi) {
        c1597440rfi.LIZ(C1597170rfH.LIZ);
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZ(InterfaceC1597430rfh interfaceC1597430rfh, C1597310rfV c1597310rfV) {
        SkylightFollowingUserItem skylightFollowingUserItem;
        User user;
        String uid;
        HashMap map = new HashMap();
        for (InterfaceC1891350zJl interfaceC1891350zJl : c1597310rfV.LIZJ(EnumC1597060rf6.STORY)) {
            if ((interfaceC1891350zJl instanceof SkylightFollowingUserItem) && (user = (skylightFollowingUserItem = (SkylightFollowingUserItem) interfaceC1891350zJl).followingUser) != null && (uid = user.getUid()) != null && uid.length() != 0) {
                map.put(uid, skylightFollowingUserItem.redDot);
            }
        }
        if (map.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : c1597310rfV.LIZJ(EnumC1597060rf6.LIVE)) {
            if (interfaceC1891350zJl2 instanceof InterfaceC1595940rdI) {
                InterfaceC1595940rdI interfaceC1595940rdI = (InterfaceC1595940rdI) interfaceC1891350zJl2;
                String uid2 = interfaceC1595940rdI.LLIILZL().getUser().getUid();
                if (uid2 != null && uid2.length() != 0 && map.containsKey(uid2)) {
                    interfaceC1595940rdI.LJJIJIIJI((SkylightFollowingUserRedDot) map.get(uid2));
                    arrayList.add(new C1160300gIe(c1597310rfV.LIZIZ(interfaceC1891350zJl2), EnumC1085440eLu.REPLACE, interfaceC1891350zJl2));
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1597210rfL
    public final List LIZJ(InterfaceC1597430rfh interfaceC1597430rfh, C1597320rfW c1597320rfW) {
        return C13BV.INSTANCE;
    }
}
