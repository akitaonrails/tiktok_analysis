package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Nbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.UserSearchContentUpdateEngine$fullUpdate$overallCost$1$2", f = "UserSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
public final class C597390Nbt extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C907840ZjS>>, Object> {
    public final /* synthetic */ List<IMUserBaseInfo> LL;
    public final /* synthetic */ C907530Zix LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597390Nbt(List<IMUserBaseInfo> list, C907530Zix c907530Zix, InterfaceC1364105Vn<? super C597390Nbt> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c907530Zix;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597390Nbt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C907840ZjS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserSearchContentUpdateEngine@f047.fullUpdate$overallCost$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IMUserBaseInfo> list = this.LL;
        C907530Zix c907530Zix = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (IMUserBaseInfo iMUserBaseInfo : list) {
            IMUserBaseInfo iMUserBaseInfo2 = iMUserBaseInfo;
            String uniqueId = iMUserBaseInfo2.getUniqueId();
            if (uniqueId != null && uniqueId.length() != 0 && !c907530Zix.LJFF.invoke(C2286608xc.LJFF(iMUserBaseInfo2.getUserId())).booleanValue() && c907530Zix.LJI.invoke(iMUserBaseInfo2).booleanValue()) {
                arrayList.add(iMUserBaseInfo);
            }
        }
        C907530Zix c907530Zix2 = this.LLILLJJLI;
        c907530Zix2.LIZ.LIZ(arrayList, c907530Zix2.LJIIIZ);
        C907530Zix c907530Zix3 = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c907530Zix3.LJII.invoke(C2201861BFo.LIZ((IMUserBaseInfo) it2.next())));
        }
        List listLJIJJLI = C15438062q.LJIJJLI(arrayList2);
        C1C7U.LIZIZ("UserSearchContentUpdateEngine@f047.fullUpdate$overallCost$1$2");
        return listLJIJJLI;
    }
}
