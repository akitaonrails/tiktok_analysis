package X;

import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0PEE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.repository.InboxSearchRecentRepository$deleteRecentItem$1", f = "InboxSearchRecentRepository.kt", l = {}, m = "invokeSuspend")
public final class C0PEE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InboxSearchRecentStoreItem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PEE(InboxSearchRecentStoreItem inboxSearchRecentStoreItem, InterfaceC1364105Vn<? super C0PEE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inboxSearchRecentStoreItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PEE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchRecentRepository@1b61.deleteRecentItem$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = null;
        if (C0PEH.LIZ[this.LL.type.ordinal()] == 1) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteRecentKeyWord, keyword = ");
            sbLIZ.append(this.LL.content);
            C1720106oR.LJI("InboxSearchRecentRepository", C2188811AlT.LIZIZ(sbLIZ));
            C0PEG.LIZ.getClass();
            C0PEG.LIZ();
            List<InboxSearchRecentStoreItem> list = C0PEG.LIZJ;
            InboxSearchRecentStoreItem inboxSearchRecentStoreItem = this.LL;
            ArrayList arrayList = (ArrayList) list;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((InboxSearchRecentStoreItem) next).content, inboxSearchRecentStoreItem.content)) {
                    obj2 = next;
                    break;
                }
            }
            C19719512Dh.LIZ(arrayList).remove(obj2);
            C0PEG.LIZ.getClass();
            C0PEG.LIZJ().storeString("keyword_repo", JsonParseUtils.LJ(C0PEG.LIZJ));
        } else {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("deleteRecentUserOrGroup, id = ");
            sbLIZ2.append(this.LL.content);
            C1720106oR.LJI("InboxSearchRecentRepository", C2188811AlT.LIZIZ(sbLIZ2));
            C0PEG.LIZ.getClass();
            C0PEG.LIZIZ();
            List<InboxSearchRecentStoreItem> list2 = C0PEG.LIZLLL;
            InboxSearchRecentStoreItem inboxSearchRecentStoreItem2 = this.LL;
            ArrayList arrayList2 = (ArrayList) list2;
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (Intrinsics.LJFF(((InboxSearchRecentStoreItem) next2).content, inboxSearchRecentStoreItem2.content)) {
                    obj2 = next2;
                    break;
                }
            }
            C19719512Dh.LIZ(arrayList2).remove(obj2);
            C0PEG.LIZ.getClass();
            C0PEG.LIZJ().storeString("user_repo", JsonParseUtils.LJ(C0PEG.LIZLLL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSearchRecentRepository@1b61.deleteRecentItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
