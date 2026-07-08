package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05w7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1512905w7 extends C09AY implements Function2<List<IMContact>, Boolean, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ InterfaceC1368280li6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1512905w7(int i, InterfaceC1368280li6 interfaceC1368280li6) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = interfaceC1368280li6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<IMContact> list, Boolean bool) {
        String uid;
        List<IMContact> list2 = list;
        bool.booleanValue();
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL != null) {
            uid = userLIZLLL.getUid();
        } else {
            uid = null;
        }
        int iMin = Math.min(list2.size(), this.LL);
        InterfaceC1368280li6 interfaceC1368280li6 = this.LLILLJJLI;
        if (interfaceC1368280li6 != null) {
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list2) {
                if ((iMContact instanceof IMUser) && !Intrinsics.LJFF(iMContact.getUid(), uid)) {
                    arrayList.add(iMContact);
                }
                if (arrayList.size() >= iMin) {
                    break;
                }
            }
            interfaceC1368280li6.LLJJIJIL(arrayList);
        }
        return Unit.LIZ;
    }
}
