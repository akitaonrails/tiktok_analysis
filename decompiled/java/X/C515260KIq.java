package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.widget.NextLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515260KIq extends C09AY implements Function1<C0KJX, LiveData<C514830KGz>> {
    public final /* synthetic */ UpDowngradePackageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515260KIq(UpDowngradePackageViewModel upDowngradePackageViewModel) {
        super(1);
        this.LL = upDowngradePackageViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final LiveData<C514830KGz> invoke(C0KJX c0kjx) {
        C0KJX c0kjx2 = c0kjx;
        final C515280KIs c515280KIs = (C515280KIs) this.LL.LL.LIZIZ.getValue();
        c515280KIs.getClass();
        final NextLiveData nextLiveData = new NextLiveData();
        C0KKO c0kko = new C0KKO() { // from class: X.0KIp
            @Override // X.C0KKO
            public final void LIZIZ() {
            }

            @Override // X.C0KKO
            public final void LJFF(long j, TemplateListData templateListData) {
            }

            @Override // X.C0KKO
            public final void LIZJ(String str) {
                c515280KIs.LIZ = str;
            }

            @Override // X.C0KKO
            public final void LIZ(int i, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tpl list api failed, error code: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.C0KKO
            public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, C0KH1 c0kh1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch sku success, fromCache = ");
                sbLIZ.append(c0kh1.LIZIZ);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> entry : map.entrySet()) {
                    entry.getKey();
                    Iterator<SubscriptionProductDetailWithTemplateInfo> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
                if (arrayList.size() > 0) {
                    nextLiveData.setValue(new C514830KGz(arrayList, null, c0kh1, null, false, false, 56));
                } else {
                    nextLiveData.setValue(new C514830KGz(arrayList, new C515430KJh(-2, -1, ""), c0kh1, null, false, false, 56));
                }
            }

            @Override // X.C0KKO
            public final void LIZLLL(int i, int i2, int i3, String str, C0KH1 c0kh1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Query sku failed, error code: ");
                sbLIZ.append(i2);
                sbLIZ.append('-');
                sbLIZ.append(i3);
                sbLIZ.append("; error message: ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
                nextLiveData.setValue(new C514830KGz(new ArrayList(), new C515430KJh(i2, i3, str), c0kh1, null, false, false, 56));
            }
        };
        c0kjx2.LJIIIZ = null;
        c0kjx2.LJIIJ = c0kko;
        c0kjx2.LJI = true;
        c0kjx2.LJII = EnumC513490KBv.PLAN_CHANGE;
        c0kjx2.LJIILIIL = true;
        C0KKG c0kkg = new C0KKG();
        AbstractC515830KKv<TemplateListData> abstractC515830KKv = new AbstractC515830KKv<TemplateListData>() { // from class: X.0KKM
            public C0KJX LIZIZ;
            public final C0KH1 LIZJ = new C0KH1(null, false, 0, null, null, null, 127);
            public final C0KKQ LIZLLL = new C0KKQ();

            @Override // X.AbstractC515830KKv
            public final void LJ() {
            }

            @Override // X.AbstractC515830KKv
            public final void LIZJ() {
                C0KJX c0kjx3 = this.LIZIZ;
                if (c0kjx3 != null) {
                    new C0KKE(c0kjx3).LIZ(this.LIZ, this.LIZJ, this.LIZLLL);
                }
            }

            @Override // X.AbstractC515830KKv
            public final void LIZ(TemplateListData templateListData) {
                TemplateListData templateListData2 = templateListData;
                C0KJX c0kjx3 = this.LIZIZ;
                if (c0kjx3 != null) {
                    new C515710KKj(this.LIZJ, this.LIZLLL).LIZ(templateListData2, c0kjx3);
                }
            }

            @Override // X.AbstractC515830KKv
            public final void LIZIZ(InterfaceC509200Jy2 interfaceC509200Jy2) {
                C0KJX c0kjx3;
                if ((interfaceC509200Jy2 instanceof C0KJX) && (c0kjx3 = (C0KJX) interfaceC509200Jy2) != null) {
                    this.LIZIZ = c0kjx3;
                    super.LIZIZ(interfaceC509200Jy2);
                }
            }
        };
        C516200KMg c516200KMg = new C516200KMg();
        c0kkg.LL = abstractC515830KKv;
        c0kkg.LLILLJJLI = c516200KMg;
        c0kkg.LJ(c0kjx2);
        return nextLiveData;
    }
}
