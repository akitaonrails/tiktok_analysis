package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368190lhx<T> implements InterfaceC300801Eo {
    public final /* synthetic */ AbstractC1368180lhw LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    public C1368190lhx(AbstractC1368180lhw abstractC1368180lhw, String str, List list) {
        this.LL = abstractC1368180lhw;
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.09At, X.09At<java.util.List<com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation>>] */
    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<List<IMConversation>> interfaceC2329309At) {
        ?? arrayList;
        if (this.LL.LLJILJILJ) {
            List<IMContact> list = this.LLILLJJLI;
            ArrayList arrayList2 = new ArrayList();
            for (IMContact iMContact : list) {
                if (iMContact instanceof IMConversation) {
                    arrayList2.add(iMContact);
                }
            }
            String str = this.LLILLL;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                String displayName = ((BaseContact) obj).getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                Locale locale = Locale.ROOT;
                if (a0.LJJIIZI(displayName.toLowerCase(locale), str.toLowerCase(locale), false)) {
                    arrayList3.add(obj);
                }
            }
            AbstractC1368180lhw abstractC1368180lhw = this.LL;
            arrayList = new ArrayList();
            for (Object obj2 : arrayList3) {
                IMConversation iMConversation = (IMConversation) obj2;
                if (!Intrinsics.LJFF(abstractC1368180lhw.LL.LIZLLL, "streak_invite") || !C296670Bk1.LIZ() || !C1229100i5c.LIZ.LJIIJJI(iMConversation.getConversationId())) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        interfaceC2329309At.onSuccess(arrayList);
    }
}
