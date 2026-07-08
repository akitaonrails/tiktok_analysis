package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09O2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleMultipleMediasSystemShare$1", f = "SystemShareActivity.kt", l = {574}, m = "invokeSuspend")
public final class C09O2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ArrayList<Uri> LLILLJJLI;
    public final /* synthetic */ SystemShareActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09O2(ArrayList<Uri> arrayList, SystemShareActivity systemShareActivity, InterfaceC1364105Vn<? super C09O2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = arrayList;
        this.LLILLL = systemShareActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09O2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivity@a089.handleMultipleMediasSystemShare$1");
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
            ArrayList arrayList = new ArrayList();
            ArrayList<Uri> arrayList2 = this.LLILLJJLI;
            if (arrayList2 != null) {
                for (Uri uri : arrayList2) {
                    C2360509Mt c2360509Mt = C2360509Mt.LIZ;
                    SystemShareActivity systemShareActivity = this.LLILLL;
                    CreativeInfo creativeInfo = systemShareActivity.LLJILJIL;
                    c2360509Mt.getClass();
                    String strLJ = C2360509Mt.LJ(systemShareActivity, uri, creativeInfo, false);
                    if (strLJ == null) {
                        strLJ = "";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SystemShareActivity realPath = ");
                    sbLIZ.append(strLJ);
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    arrayList.add(strLJ);
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1B4E c1b4e = new C1B4E(this.LLILLL, arrayList, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1b4e) == objLJFF) {
                C1C7U.LIZIZ("SystemShareActivity@a089.handleMultipleMediasSystemShare$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivity@a089.handleMultipleMediasSystemShare$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
