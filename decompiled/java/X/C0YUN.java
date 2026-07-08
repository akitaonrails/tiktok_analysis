package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUN implements C0YUO {
    public static final C0YUN LIZ = new C0YUN();

    @Override // X.C0YUO
    public final String LIZ() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131835236);
    }

    public static final List<IMUser> LIZJ(List<? extends IMUser> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (IMUser iMUser : list) {
                if (iMUser != null) {
                    arrayList.add(iMUser);
                }
            }
        }
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (list != null) {
            Iterator<? extends IMUser> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                IMUser next = it2.next();
                IMUser iMUser2 = next;
                if (iMUser2 != null && Intrinsics.LJFF(iMUser2.getUid(), curUserId)) {
                    if (next != null) {
                        arrayList.remove(next);
                        ListProtector.add(arrayList, 0, next);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(C873240YNm c873240YNm, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        if (c873240YNm.LIZ.length() == 0) {
            return;
        }
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(c873240YNm.LIZ);
        if (C293390Bej.LIZ()) {
            C054G c054g = c866530Xz1LIZIZ.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866220XyW(interfaceC867020Xzo, null, c866530Xz1LIZIZ, c873240YNm), 2);
            return;
        }
        c866530Xz1LIZIZ.LJIJI().LJJJJL(c873240YNm, interfaceC867020Xzo);
    }
}
