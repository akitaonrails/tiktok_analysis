package X;

import Y.AComparatorS516S0100000_19;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0j3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266100j3I implements InterfaceC300801Eo {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<C0Y8T> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
            case 2:
                subscribe$2(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C1266100j3I c1266100j3I, InterfaceC2329309At interfaceC2329309At) {
        long jLJII = C0YNP.LJII(c1266100j3I.s0);
        int iLJI = C0YNP.LJI(c1266100j3I.s0);
        if (jLJII > 0 && iLJI >= 0) {
            ((InterfaceC876950Yaj) c1266100j3I.l1).LJIIIIZZ(iLJI, new C1266170j3P((C11KT) interfaceC2329309At, 1), String.valueOf(jLJII));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSingleConversation() uid invalid: uid = ");
            sbLIZ.append(jLJII);
            interfaceC2329309At.tryOnError(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public static final void subscribe$1(C1266100j3I c1266100j3I, InterfaceC2329309At interfaceC2329309At) {
        long jLJII = C0YNP.LJII(c1266100j3I.s0);
        int iLJI = C0YNP.LJI(c1266100j3I.s0);
        if (jLJII > 0 && iLJI >= 0) {
            ((InterfaceC876950Yaj) c1266100j3I.l1).LJIIIIZZ(iLJI, new C1266170j3P((C11KT) interfaceC2329309At, 2), String.valueOf(jLJII));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSingleConversation() uid invalid: uid = ");
            sbLIZ.append(jLJII);
            interfaceC2329309At.tryOnError(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public static final void subscribe$2(C1266100j3I c1266100j3I, InterfaceC2329309At interfaceC2329309At) {
        ArrayList arrayList = new ArrayList();
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        List list = (List) c1266100j3I.l1;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IMUser) {
                arrayList2.add(obj);
            }
        }
        List<IMContact> listLJJJJI = C13LP.LJJJJI(c1bgsLJ.LJIL(c1266100j3I.s0, true, arrayList2));
        if (C1368200lhy.LIZ()) {
            for (IMContact iMContact : listLJJJJI) {
                iMContact.getAllMatchMetaCopy().clear();
                iMContact.setPrimaryMatchMetaCopy(null);
            }
        }
        arrayList.addAll(listLJJJJI);
        C2201941BFw c2201941BFw = IMUser.Companion;
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        c2201941BFw.getClass();
        IMUser iMUserLIZJ = C2201941BFw.LIZJ(currentUser);
        if (iMUserLIZJ != null) {
            String str = c1266100j3I.s0;
            String strLIZJ = C1243240iSQ.LIZJ(C1243240iSQ.LIZ, iMUserLIZJ, iMUserLIZJ.getDisplayName());
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            Locale locale = Locale.ROOT;
            if (a0.LJJIIZI(strLIZJ.toLowerCase(locale), str.toLowerCase(locale), false)) {
                arrayList.add(iMUserLIZJ);
                if (arrayList.size() > 1) {
                    C08XD.LJJ(arrayList, new AComparatorS516S0100000_19(iMUserLIZJ, 12));
                }
            }
        }
        interfaceC2329309At.onSuccess(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1266100j3I(Object obj, List<IMContact> list, String str) {
        this.$t = str;
        this.l1 = obj;
        this.s0 = list;
    }
}
