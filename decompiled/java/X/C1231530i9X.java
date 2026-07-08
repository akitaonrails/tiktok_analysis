package X;

import Y.AComparatorS516S0100000_19;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0i9X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231530i9X {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final String str, C23260099m c23260099m, List list, C11NJ c11nj, final Function1 function1) {
        if (list != null && !list.isEmpty()) {
            c11nj.LJ();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1224840hyk c1224840hyk = (C1224840hyk) it2.next();
                Object obj = c1224840hyk.LLJI.get("contact");
                if ((obj instanceof IMContact) && obj != null) {
                    arrayList.add(new Pair(obj, c1224840hyk));
                }
            }
            final Set setKeySet = C2097608Jq.LJIILLIIL(arrayList).keySet();
            c11nj.LIZ(AbstractC19484711Kz.LJJJ(AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0DIG
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<List<IMConversation>> interfaceC2329309At) {
                    Set<IMContact> set = setKeySet;
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : set) {
                        if (t instanceof IMConversation) {
                            arrayList2.add(t);
                        }
                    }
                    String str2 = str;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        String displayName = ((BaseContact) obj2).getDisplayName();
                        if (displayName == null) {
                            displayName = "";
                        }
                        Locale locale = Locale.ROOT;
                        if (a0.LJJIIZI(displayName.toLowerCase(locale), str2.toLowerCase(locale), false)) {
                            arrayList3.add(obj2);
                        }
                    }
                    interfaceC2329309At.onSuccess(arrayList3);
                }
            }).LJJIJIIJI(C11S5.LIZ()), AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0i9n
                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<List<IMUser>> interfaceC2329309At) {
                    IMContactApi.LIZ.getClass();
                    C1BGS c1bgsLJ = C069P.LIZ().LJ();
                    Set<IMContact> set = setKeySet;
                    ArrayList arrayList2 = new ArrayList();
                    for (T t : set) {
                        if (t instanceof IMUser) {
                            arrayList2.add(t);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C13LP.LJJJJI(c1bgsLJ.LJIL(str, true, arrayList2)));
                    C2201941BFw c2201941BFw = IMUser.Companion;
                    User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
                    c2201941BFw.getClass();
                    IMUser iMUserLIZJ = C2201941BFw.LIZJ(currentUser);
                    if (iMUserLIZJ != null) {
                        Function1<IMUser, String> function12 = function1;
                        String str2 = str;
                        String strInvoke = function12.invoke(iMUserLIZJ);
                        if (strInvoke == null) {
                            strInvoke = "";
                        }
                        Locale locale = Locale.ROOT;
                        if (a0.LJJIIZI(strInvoke.toLowerCase(locale), str2.toLowerCase(locale), false)) {
                            Function1<IMUser, String> function13 = function1;
                            arrayList3.add(iMUserLIZJ);
                            if (arrayList3.size() > 1) {
                                C08XD.LJJ(arrayList3, new AComparatorS516S0100000_19(function13, 0));
                            }
                        }
                    }
                    interfaceC2329309At.onSuccess(arrayList3);
                }
            }).LJJIJIIJI(C11S5.LIZ()), new InterfaceC500500Jk0() { // from class: X.0Jju
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj2, Object obj3) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll((Collection) obj2);
                    arrayList2.addAll((Collection) obj3);
                    return arrayList2;
                }
            }).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C516201zk(c23260099m, 10), new C516201zk(c23260099m, 11)));
            return;
        }
        C13BV c13bv = C13BV.INSTANCE;
        C189200o6.m2constructorimpl(c13bv);
        c23260099m.resumeWith(c13bv);
    }
}
