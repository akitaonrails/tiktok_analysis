package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.05gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.data.MediaProvider$groupByBucket$2", f = "MediaProvider.kt", l = {}, m = "invokeSuspend")
public final class C1418805gw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C563580M8m>>, Object> {
    public final /* synthetic */ List<SocMediaResource> LL;
    public final /* synthetic */ List<SocMediaResource> LLILLJJLI;
    public final /* synthetic */ List<SocMediaResource> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418805gw(List<SocMediaResource> list, List<SocMediaResource> list2, List<SocMediaResource> list3, InterfaceC1364105Vn<? super C1418805gw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = list3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1418805gw(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("MediaProvider@7017.groupByBucket$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SocMediaResource socMediaResource : this.LL) {
            if (!a0.LJJJIL(socMediaResource.albumName)) {
                String str2 = socMediaResource.albumName;
                Object arrayList = linkedHashMap.get(str2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str2, arrayList);
                }
                ((List) arrayList).add(socMediaResource);
            }
        }
        List<SocMediaResource> list = this.LL;
        List<SocMediaResource> list2 = this.LLILLJJLI;
        List<SocMediaResource> list3 = this.LLILLL;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        int i = C540820LIy.LJI;
        c13dvLIZIZ.add(new C563580M8m("&__socialCreationDefaultBucketId__&", C05UE.LIZ(C1BWL.LIZ()), list, list2, list3));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List list4 = (List) entry.getValue();
            SocMediaResource socMediaResource2 = (SocMediaResource) C13LP.LJJJLL(list4);
            if (socMediaResource2 == null || (str = socMediaResource2.albumName) == null) {
                str = "";
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list4) {
                if (((SocMediaResource) obj2).LIZJ()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list4) {
                if (((SocMediaResource) obj3).LIZLLL()) {
                    arrayList3.add(obj3);
                }
            }
            c13dvLIZIZ.add(new C563580M8m(str3, str, list4, arrayList2, arrayList3));
        }
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        C1C7U.LIZIZ("MediaProvider@7017.groupByBucket$2");
        return listLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C563580M8m>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
