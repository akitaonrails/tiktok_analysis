package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.069U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C069U extends C09AY implements Function0<C1719706oN> {
    public C069U() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.06oN] */
    @Override // kotlin.jvm.functions.Function0
    public final C1719706oN invoke() {
        return new InterfaceC893670Z4b() { // from class: X.06oN
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [X.06oL, X.0Y4u] */
            @Override // X.InterfaceC893670Z4b
            public final void LIZLLL() {
                if (C1719606oM.LIZ == null) {
                    ?? r1 = new InterfaceC868380Y4u() { // from class: X.06oL
                        @Override // X.InterfaceC868380Y4u
                        public final void LIZ(List<C0YAE> list) {
                            boolean z;
                            String secUid;
                            if (list == null) {
                                return;
                            }
                            C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
                            AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(683);
                            ArrayList<C0YAE> arrayList = new ArrayList();
                            for (C0YAE c0yae : list) {
                                C0YAE c0yae2 = c0yae;
                                if (c0yae2.getUid() > 0 && (secUid = c0yae2.getSecUid()) != null && secUid.length() != 0 && c0yae2.getConversationType() != AbstractC1711506n3.LIZIZ) {
                                    arrayList.add(c0yae);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                            for (C0YAE c0yae3 : arrayList) {
                                IMContactApi.LIZ.getClass();
                                arrayList2.add(new Pair(c0yae3, C069P.LIZ().LJ().LIZLLL(String.valueOf(c0yae3.getUid()), c0yae3.getSecUid(), "on_member_list_update")));
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : arrayList2) {
                                Pair pair = (Pair) obj;
                                C0YAE c0yae4 = (C0YAE) pair.getFirst();
                                BaseContact baseContact = (BaseContact) pair.getSecond();
                                if (baseContact == null) {
                                    C1719606oM.LIZIZ.put(String.valueOf(c0yae4.getUid()), c0yae4.getSecUid());
                                } else {
                                    String secUid2 = baseContact.getSecUid();
                                    if (secUid2 != null && secUid2.length() != 0) {
                                        z = false;
                                    } else {
                                        z = true;
                                        baseContact.setSecUid(c0yae4.getSecUid());
                                    }
                                    if (((String) aFwS229S0000000_2.invoke(Long.valueOf(c0yae4.getUid()))).length() > 0) {
                                        IMChatListApi.LJJIII.getClass();
                                        C890330YwJ.LIZ().LJJI().LIZ();
                                    }
                                    if (z) {
                                        arrayList3.add(obj);
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                Object second = ((Pair) it2.next()).getSecond();
                                if (second != null) {
                                    arrayList4.add(second);
                                }
                            }
                            C23250099c.LIZLLL(c054gLIZ, null, null, new C1336605Ky(arrayList4, null), 3);
                        }
                    };
                    C1719606oM.LIZ = r1;
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJI().LJI(r1);
                }
            }

            @Override // X.InterfaceC893670Z4b
            public final void LJ() {
                C1719506oL c1719506oL = C1719606oM.LIZ;
                if (c1719506oL != null) {
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJI().LIZ(c1719506oL);
                }
                C1719606oM.LIZ = null;
            }

            @Override // X.InterfaceC893670Z4b
            public final String LIZ(String str) {
                String strLIZ = C1719606oM.LIZ(str);
                if (strLIZ == null || strLIZ.length() == 0) {
                    IMContactApi.LIZ.getClass();
                    IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
                    if (iMUserLJIIL == null) {
                        return null;
                    }
                    return iMUserLJIIL.getSecUid();
                }
                return strLIZ;
            }

            @Override // X.InterfaceC893670Z4b
            public final void LIZIZ(String str) {
                String strLIZIZ;
                if (!TextUtils.isEmpty(str)) {
                    IMContactApi.LIZ.getClass();
                    IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
                    if (iMUserLJIIL == null) {
                        strLIZIZ = C1719606oM.LIZ(str);
                    } else {
                        strLIZIZ = C1719606oM.LIZIZ(iMUserLJIIL);
                    }
                    C0W75.LIZ().LJI(str, strLIZIZ);
                }
            }

            @Override // X.InterfaceC893670Z4b
            public final String LIZJ(IMUser iMUser) {
                return C1719606oM.LIZIZ(iMUser);
            }
        };
    }
}
