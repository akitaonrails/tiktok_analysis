package X;

import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel$onKeywordValueChanged$2", f = "ContactSelectViewModel.kt", l = {363}, m = "invokeSuspend")
public final class C1783540wVs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ContactSelectViewModel LLILLJJLI;
    public final /* synthetic */ IMAiGroupShotConfig.ContactSelectConfig.Selecting LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783540wVs(ContactSelectViewModel contactSelectViewModel, IMAiGroupShotConfig.ContactSelectConfig.Selecting selecting, InterfaceC1364105Vn<? super C1783540wVs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = contactSelectViewModel;
        this.LLILLL = selecting;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783540wVs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        C1C7U.LIZ("ContactSelectViewModel@2c62.onKeywordValueChanged$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1864870yd3 c1864870yd3 = new C1864870yd3(C1783520wVq.LLILZIL, 22);
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c1864870yd3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactSelectViewModel@2c62.onKeywordValueChanged$2");
                return objLJFF;
            }
        }
        C1557010qcV c1557010qcV = (C1557010qcV) obj;
        C2252321DDq c2252321DDq = this.LLILLJJLI.LLILZIL;
        IMAiGroupShotConfig.ContactSelectConfig.Selecting selecting = this.LLILLL;
        do {
            value = c2252321DDq.getValue();
            List<IMContact> list = c1557010qcV.LIZ;
            arrayList = new ArrayList();
            for (IMContact iMContact : list) {
                if (selecting.contactFilter.getFilter().invoke(iMContact).booleanValue()) {
                    arrayList.add(iMContact);
                }
            }
        } while (!c2252321DDq.compareAndSet(value, new C1557010qcV(arrayList, c1557010qcV.LIZIZ)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactSelectViewModel@2c62.onKeywordValueChanged$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
