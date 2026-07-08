package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05vm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1510805vm extends C09AY implements Function2<List<IMContact>, Boolean, Unit> {
    public final /* synthetic */ int LL = 2;
    public final /* synthetic */ InterfaceC1368280li6 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510805vm(InterfaceC1368280li6 interfaceC1368280li6, boolean z) {
        super(2);
        this.LLILLJJLI = interfaceC1368280li6;
        this.LLILLL = z;
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
            boolean z = this.LLILLL;
            for (IMContact iMContact : list2) {
                if (((iMContact instanceof IMUser) && !Intrinsics.LJFF(iMContact.getUid(), uid)) || !z) {
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
