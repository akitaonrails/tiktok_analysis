package X;

import Y.ARunnableS13S1000000_21;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Vio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805520Vio {
    public static volatile boolean LIZLLL;
    public static final ArrayList<String> LIZ = new ArrayList<>();
    public static final ArrayList<String> LIZIZ = new ArrayList<>();
    public static final ArrayList<String> LIZJ = new ArrayList<>();
    public static final C01GW<C805520Vio> LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS200S0000000_13.get$arr$(2));

    public static String LIZ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public final void LJ() {
        C0I0B.LJFF.LIZJ();
        InterfaceC805460Vii interfaceC805460ViiLIZ = C797560VQk.LIZIZ(C894660Z7w.LIZ()).LIZ();
        String strLIZ = LIZ();
        try {
            if (LIZLLL) {
                return;
            }
            synchronized (this) {
                try {
                    if (!LIZLLL) {
                        LIZ.addAll(interfaceC805460ViiLIZ.LJFF(strLIZ));
                        if (((Boolean) C2276521E8s.LIZJ.getValue()).booleanValue()) {
                            LIZIZ.addAll(interfaceC805460ViiLIZ.LJII(strLIZ));
                        }
                        LIZJ.addAll(interfaceC805460ViiLIZ.LIZLLL(strLIZ));
                        LIZLLL = true;
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
        }
    }

    public static String LIZIZ(IMContact iMContact) {
        String conversationId;
        if (iMContact instanceof IMUser) {
            String uid = iMContact.getUid();
            if (uid != null) {
                return uid;
            }
        } else if ((iMContact instanceof IMConversation) && (conversationId = ((IMConversation) iMContact).getConversationId()) != null) {
            return conversationId;
        }
        return "";
    }

    public static boolean LIZJ(IMContact iMContact, String str) {
        if (iMContact instanceof IMUser) {
            return Intrinsics.LJFF(iMContact.getUid(), str);
        }
        if (iMContact instanceof IMConversation) {
            return Intrinsics.LJFF(((IMConversation) iMContact).getConversationId(), str);
        }
        return false;
    }

    public final void LIZLLL(String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
            try {
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        IMContact iMContact = (IMContact) obj;
                        String uid = "";
                        if (iMContact instanceof IMConversation) {
                            uid = ((IMConversation) iMContact).getConversationId();
                            if (uid == null) {
                                uid = "";
                            }
                        } else if ((iMContact instanceof IMUser) && (uid = iMContact.getUid()) == null) {
                            uid = "";
                        }
                        if (uid.length() > 0) {
                            arrayList2.add(uid);
                            arrayList.add(new C796400VLy(System.currentTimeMillis() + ((long) i), -1L, LIZ(), uid, str));
                            if (Intrinsics.LJFF(str, "recent link share")) {
                                ArrayList<String> arrayList3 = LIZIZ;
                                if (!arrayList3.contains(uid)) {
                                    arrayList3.add(uid);
                                }
                            } else {
                                ArrayList<String> arrayList4 = LIZIZ;
                                if (arrayList4.contains(uid)) {
                                    arrayList4.remove(uid);
                                }
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                LIZ.removeAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    LIZ.add(0, (String) it2.next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ.plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 3)), null, new C805450Vih(arrayList, null), 2);
        C786410Ut5.LJLIIL(1500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS13S1000000_21(str2, 0));
    }
}
