package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.manager.ShareVideoRecordsManager$addDmShareRecords$1", f = "ShareVideoRecordsManager.kt", l = {}, m = "invokeSuspend")
public final class C1330005Ik extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ Keva LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1330005Ik(List<String> list, Keva keva, String str, InterfaceC1364105Vn<? super C1330005Ik> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = keva;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1330005Ik(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareVideoRecordsManager@1d63.addDmShareRecords$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1723106ov c1723106ov = C1723106ov.LL;
        List<String> list = this.LL;
        String str = this.LLILLL;
        ArrayList<String> arrayList = new ArrayList();
        for (String str2 : list) {
            if (!Intrinsics.LJFF(str2, str)) {
                arrayList.add(str2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (String str3 : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1330205Im.INTERNAL.getValue());
            sbLIZ.append(':');
            sbLIZ.append(str3);
            arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        c1723106ov.LJFF(this.LLILLJJLI, arrayList2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareVideoRecordsManager@1d63.addDmShareRecords$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
