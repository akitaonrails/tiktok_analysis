package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783520wVq implements InterfaceC328360Cu2<IMContact>, InterfaceC1368140lhs {
    public static final C1783520wVq LL;
    public static final C2252321DDq LLILLJJLI;
    public static final AnonymousClass0951 LLILLL;
    public static final C2252321DDq LLILZ;
    public static final AnonymousClass0951 LLILZIL;
    public static final InterfaceC1369300ljk LLILZLL;

    @Override // X.InterfaceC1368140lhs
    public final void tm2(Throwable th) {
    }

    @Override // X.InterfaceC328360Cu2
    public final void ug(Throwable th) {
    }

    static {
        C1783520wVq c1783520wVq = new C1783520wVq();
        LL = c1783520wVq;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1557030qcX.LIZIZ);
        LLILLJJLI = c2252321DDqLIZ;
        LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(C1557070qcb.LIZ);
        LLILZ = c2252321DDqLIZ2;
        LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ2);
        IMSharePanelApi.LIZ.getClass();
        LLILZLL = C1599690rjL.LIZ().LIZIZ().LJI(c1783520wVq, c1783520wVq);
    }

    public static final void LIZIZ() {
        LLILLJJLI.setValue(C1557050qcZ.LIZIZ);
        LLILZ.setValue(C1557070qcb.LIZ);
        LLILZLL.LIZLLL();
    }

    public final void LIZJ() {
        if (Intrinsics.LJFF(LLILLJJLI.getValue(), C1557030qcX.LIZIZ)) {
            LIZIZ();
        }
    }

    public static void LIZ(List list) {
        Object value;
        ArrayList arrayList;
        String uid;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            IMContact iMContact = (IMContact) obj;
            if ((iMContact instanceof IMConversation) || C911590ZpV.LIZ(iMContact)) {
                arrayList2.add(obj);
            }
        }
        C2252321DDq c2252321DDq = LLILLJJLI;
        do {
            value = c2252321DDq.getValue();
            List listLJLIL = C13LP.LJLIL(arrayList2, ((AbstractC1557040qcY) value).LIZ());
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            for (Object obj2 : (ArrayList) listLJLIL) {
                IMContact iMContact2 = (IMContact) obj2;
                if (iMContact2 instanceof IMConversation) {
                    uid = ((IMConversation) iMContact2).getConversationId();
                } else if (iMContact2 instanceof IMUser) {
                    uid = iMContact2.getUid();
                } else {
                    uid = null;
                }
                if (hashSet.add(uid)) {
                    arrayList.add(obj2);
                }
            }
        } while (!c2252321DDq.compareAndSet(value, new C1557020qcW(arrayList)));
    }

    @Override // X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        C2252321DDq c2252321DDq = LLILLJJLI;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), C1557030qcX.LIZIZ)) {
        }
    }

    @Override // X.InterfaceC1368140lhs
    public final void qN2(String str, List list) {
        C2252321DDq c2252321DDq = LLILZ;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1557010qcV(list, str))) {
        }
    }

    @Override // X.InterfaceC328360Cu2
    public final void r61(List<IMContact> list, boolean z) {
        LIZ(list);
    }

    @Override // X.InterfaceC328360Cu2
    public final void tg2(List<IMContact> list, boolean z) {
        LIZ(list);
    }

    @Override // X.InterfaceC1368140lhs
    public final void bK(List<IMContact> list, String str, Integer num, Double d, Double d2) {
        qN2(str, list);
    }
}
