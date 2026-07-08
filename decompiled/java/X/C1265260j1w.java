package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.FollowingListAssem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265260j1w extends C09AY implements Function2<UIAssem, String, Unit> {
    public final /* synthetic */ FollowingListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265260j1w(FollowingListAssem followingListAssem) {
        super(2);
        this.LL = followingListAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, String str) {
        C1265420j2C c1265420j2C;
        User user;
        String uid;
        C1265420j2C c1265420j2C2;
        User user2;
        String uid2;
        String str2 = str;
        List<InterfaceC1891350zJl> listLJII = this.LL.Oo().LLILZLL.LJII();
        ArrayList arrayList = new ArrayList();
        ArrayList<InterfaceC1891350zJl> arrayList2 = (ArrayList) listLJII;
        for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList2) {
            if ((interfaceC1891350zJl instanceof C1265420j2C) && (c1265420j2C2 = (C1265420j2C) interfaceC1891350zJl) != null && (user2 = c1265420j2C2.LLILLJJLI) != null && (uid2 = user2.getUid()) != null) {
                arrayList.add(uid2);
            }
        }
        C1910890zpH c1910890zpHAp = this.LL.ap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FDUP] removeUid=");
        sbLIZ.append(str2);
        sbLIZ.append(", beforeSize=");
        sbLIZ.append(arrayList2.size());
        sbLIZ.append(", beforeUids=");
        sbLIZ.append(arrayList);
        c1910890zpHAp.LJII("following_assem", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.Oo().LJIJJLI(this.LL.LLJJIII);
        List<InterfaceC1891350zJl> listLJII2 = this.LL.Oo().LLILZLL.LJII();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : (ArrayList) listLJII2) {
            InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) obj;
            if (!(interfaceC1891350zJl2 instanceof C1265420j2C) || !Intrinsics.LJFF(((C1265420j2C) interfaceC1891350zJl2).LLILLJJLI.getUid(), str2)) {
                arrayList3.add(obj);
            }
        }
        this.LL.Oo().LLILZLL.LJIIJJI(arrayList3, null);
        this.LL.Oo().LJII(this.LL.LLJJIII);
        List<InterfaceC1891350zJl> listLJII3 = this.LL.Oo().LLILZLL.LJII();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<InterfaceC1891350zJl> arrayList5 = (ArrayList) listLJII3;
        for (InterfaceC1891350zJl interfaceC1891350zJl3 : arrayList5) {
            if ((interfaceC1891350zJl3 instanceof C1265420j2C) && (c1265420j2C = (C1265420j2C) interfaceC1891350zJl3) != null && (user = c1265420j2C.LLILLJJLI) != null && (uid = user.getUid()) != null) {
                arrayList4.add(uid);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            Object arrayList6 = linkedHashMap.get(obj2);
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                linkedHashMap.put(obj2, arrayList6);
            }
            ((List) arrayList6).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        C1910890zpH c1910890zpHAp2 = this.LL.ap();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[FDUP] removeUid done: afterSize=");
        sbLIZ2.append(arrayList5.size());
        sbLIZ2.append(", afterUids=");
        sbLIZ2.append(arrayList4);
        sbLIZ2.append(", afterDups=");
        sbLIZ2.append(setKeySet);
        c1910890zpHAp2.LJII("following_assem", C2188811AlT.LIZIZ(sbLIZ2));
        this.LL.Lo("removeUid done");
        return Unit.LIZ;
    }
}
