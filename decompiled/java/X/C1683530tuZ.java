package X;

import com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel$uiState$1", f = "ContactSelectViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1683530tuZ extends C09AX implements InterfaceC1685430txd<InterfaceC1683480tuU, AbstractC1557040qcY, InterfaceC1557060qca, List<? extends String>, String, InterfaceC1364105Vn<? super InterfaceC1683470tuT>, Object> {
    public /* synthetic */ InterfaceC1683480tuU LL;
    public /* synthetic */ AbstractC1557040qcY LLILLJJLI;
    public /* synthetic */ InterfaceC1557060qca LLILLL;
    public /* synthetic */ Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ ContactSelectViewModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1683530tuZ(ContactSelectViewModel contactSelectViewModel, InterfaceC1364105Vn<? super C1683530tuZ> interfaceC1364105Vn) {
        super(6, interfaceC1364105Vn);
        this.LLILZLL = contactSelectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1683440tuQ;
        boolean z;
        boolean z2;
        boolean z3;
        C1C7U.LIZ("ContactSelectViewModel@2c62.uiState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1683480tuU interfaceC1683480tuU = this.LL;
        AbstractC1557040qcY abstractC1557040qcY = this.LLILLJJLI;
        InterfaceC1557060qca interfaceC1557060qca = this.LLILLL;
        List list = (List) this.LLILZ;
        String str = (String) this.LLILZIL;
        if (!Intrinsics.LJFF(abstractC1557040qcY, C1557030qcX.LIZIZ) && !Intrinsics.LJFF(abstractC1557040qcY, C1557050qcZ.LIZIZ)) {
            List<IMContact> listLIZ = abstractC1557040qcY.LIZ();
            if (Intrinsics.LJFF(interfaceC1557060qca, C1557070qcb.LIZ)) {
                this.LLILZLL.getClass();
                InterfaceC1683460tuS interfaceC1683460tuSWQ2 = ContactSelectViewModel.wQ2(interfaceC1683480tuU, listLIZ, list, null);
                this.LLILZLL.getClass();
                InterfaceC1665500tRU interfaceC1665500tRUXQ2 = ContactSelectViewModel.xQ2(listLIZ, list);
                if (list.size() >= this.LLILZLL.LLILLJJLI) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1683440tuQ = new C1683440tuQ(interfaceC1683460tuSWQ2, interfaceC1665500tRUXQ2, str, z3, list.size());
            } else if (Intrinsics.LJFF(interfaceC1557060qca, C1557080qcc.LIZ)) {
                C1683490tuV c1683490tuV = C1683490tuV.LIZ;
                this.LLILZLL.getClass();
                InterfaceC1665500tRU interfaceC1665500tRUXQ22 = ContactSelectViewModel.xQ2(listLIZ, list);
                if (list.size() >= this.LLILZLL.LLILLJJLI) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1683440tuQ = new C1683440tuQ(c1683490tuV, interfaceC1665500tRUXQ22, str, z2, list.size());
            } else if (interfaceC1557060qca instanceof C1557010qcV) {
                ContactSelectViewModel contactSelectViewModel = this.LLILZLL;
                C1557010qcV c1557010qcV = (C1557010qcV) interfaceC1557060qca;
                List<IMContact> list2 = c1557010qcV.LIZ;
                String str2 = c1557010qcV.LIZIZ;
                contactSelectViewModel.getClass();
                InterfaceC1683460tuS interfaceC1683460tuSWQ22 = ContactSelectViewModel.wQ2(interfaceC1683480tuU, list2, list, str2);
                this.LLILZLL.getClass();
                InterfaceC1665500tRU interfaceC1665500tRUXQ23 = ContactSelectViewModel.xQ2(listLIZ, list);
                if (list.size() >= this.LLILZLL.LLILLJJLI) {
                    z = true;
                } else {
                    z = false;
                }
                c1683440tuQ = new C1683440tuQ(interfaceC1683460tuSWQ22, interfaceC1665500tRUXQ23, str, z, list.size());
            } else {
                throw new C1954807lC();
            }
        } else {
            c1683440tuQ = C1683500tuW.LIZ;
        }
        C1C7U.LIZIZ("ContactSelectViewModel@2c62.uiState$1");
        return c1683440tuQ;
    }

    @Override // X.InterfaceC1685430txd
    public final Object invoke(InterfaceC1683480tuU interfaceC1683480tuU, AbstractC1557040qcY abstractC1557040qcY, InterfaceC1557060qca interfaceC1557060qca, List<? extends String> list, String str, InterfaceC1364105Vn<? super InterfaceC1683470tuT> interfaceC1364105Vn) {
        C1683530tuZ c1683530tuZ = new C1683530tuZ(this.LLILZLL, interfaceC1364105Vn);
        c1683530tuZ.LL = interfaceC1683480tuU;
        c1683530tuZ.LLILLJJLI = abstractC1557040qcY;
        c1683530tuZ.LLILLL = interfaceC1557060qca;
        c1683530tuZ.LLILZ = list;
        c1683530tuZ.LLILZIL = str;
        return c1683530tuZ.invokeSuspend(Unit.LIZ);
    }
}
