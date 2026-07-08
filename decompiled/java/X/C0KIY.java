package X;

import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KIY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KIY extends C09AY implements Function1<C0KJX, LiveData<C514900KHg>> {
    public final /* synthetic */ PackagePageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KIY(PackagePageViewModel packagePageViewModel) {
        super(1);
        this.LL = packagePageViewModel;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final LiveData<C514900KHg> invoke(C0KJX c0kjx) {
        boolean z;
        int i;
        C0KJX c0kjx2 = c0kjx;
        PackagePageViewModel packagePageViewModel = this.LL;
        packagePageViewModel.LLILLL = true;
        C0KJJ c0kjj = packagePageViewModel.LL;
        final C515270KIr c515270KIr = new C515270KIr(packagePageViewModel);
        final C515280KIs c515280KIs = (C515280KIs) c0kjj.LIZIZ.getValue();
        c515280KIs.getClass();
        final NextLiveData nextLiveData = new NextLiveData();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = c0kjx2.LJIIIIZZ;
        if (C515280KIs.LIZ(c0kjx2)) {
            if (c0kjx2.LIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = -1006;
            } else if (((CharSequence) c259800zU.element).length() == 0) {
                i = -1007;
            } else {
                i = C386801es.DEFAULT;
            }
            nextLiveData.setValue(new C514900KHg(new ArrayList(), new C515430KJh(C386801es.DEFAULT, i, C497740JfY.LJIJI(2131856510)), null, 0));
            return nextLiveData;
        }
        C0KKO c0kko = new C0KKO() { // from class: X.0KIo
            @Override // X.C0KKO
            public final void LIZIZ() {
                c515270KIr.invoke(C515380KJc.LIZ);
            }

            @Override // X.C0KKO
            public final void LIZJ(String str) {
                c515280KIs.LIZ = str;
            }

            @Override // X.C0KKO
            public final void LIZ(int i2, String str) {
                c515270KIr.invoke(C515400KJe.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tpl list api failed, error code: ");
                sbLIZ.append(i2);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.String] */
            @Override // X.C0KKO
            public final void LJ(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, C0KH1 c0kh1) {
                C515430KJh c515430KJh;
                c515270KIr.invoke(C515390KJd.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch sku success, fromCache = ");
                sbLIZ.append(c0kh1.LIZIZ);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
                List<SubscriptionProductDetailWithTemplateInfo> arrayList = new ArrayList<>();
                if (c259800zU.element.length() == 0) {
                    c259800zU.element = c515280KIs.LIZ;
                }
                if (c259800zU.element.length() == 0) {
                    ArrayList arrayList2 = new ArrayList(map.values());
                    if (!arrayList2.isEmpty()) {
                        arrayList = (List) ListProtector.get(arrayList2, 0);
                    }
                } else {
                    arrayList = map.get(c259800zU.element);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                }
                if (arrayList.size() > 0) {
                    C513940KDo.LIZJ(arrayList, c0kh1.LJ);
                    if (arrayList.isEmpty()) {
                        c515430KJh = new C515430KJh(C386801es.DEFAULT, -1005, C497740JfY.LJIJI(2131855022));
                    } else {
                        c515430KJh = null;
                    }
                    nextLiveData.setValue(new C514900KHg(arrayList, c515430KJh, c0kh1, map.size()));
                    return;
                }
                nextLiveData.setValue(new C514900KHg(arrayList, new C515430KJh(C386801es.DEFAULT, -1003, C497740JfY.LJIJI(2131843667)), c0kh1, map.size()));
            }

            @Override // X.C0KKO
            public final void LJFF(long j, TemplateListData templateListData) {
                c515270KIr.invoke(C515410KJf.LIZ);
            }

            @Override // X.C0KKO
            public final void LIZLLL(int i2, int i3, int i4, String str, C0KH1 c0kh1) {
                c515270KIr.invoke(C515370KJb.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Query sku failed, error code: ");
                sbLIZ.append(i3);
                sbLIZ.append('-');
                sbLIZ.append(i4);
                sbLIZ.append("; error message: ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
                nextLiveData.setValue(new C514900KHg(new ArrayList(), new C515430KJh(i3, i4, str), c0kh1, 0));
            }
        };
        c0kjx2.LJIIIZ = null;
        c0kjx2.LJIIJ = c0kko;
        c0kjx2.LJI = true;
        c0kjx2.LJII = EnumC513490KBv.NORMAL_SUBSCRIPTION;
        C0KKG c0kkg = new C0KKG();
        c0kkg.LIZ();
        c0kkg.LJ(c0kjx2);
        return nextLiveData;
    }
}
