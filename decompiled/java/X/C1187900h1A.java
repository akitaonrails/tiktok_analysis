package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostContainerAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187900h1A extends C09AY implements Function1<C626160OhC, Unit> {
    public final /* synthetic */ PoiDetailPostContainerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187900h1A(PoiDetailPostContainerAssem poiDetailPostContainerAssem) {
        super(1);
        this.LL = poiDetailPostContainerAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C626160OhC c626160OhC) {
        InterfaceC1181010gq3 interfaceC1181010gq3LIZ;
        C1181550gqv c1181550gqvEr2;
        PoiDetailVideoListModel poiDetailVideoListModel;
        PoiListApi.PostTab postTab;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null && (interfaceC1181010gq3LIZ = C1174830gg5.LIZ(fragmentLJI)) != null && (c1181550gqvEr2 = interfaceC1181010gq3LIZ.Er2()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((LinkedHashMap) c1181550gqvEr2.LIZ).entrySet().iterator();
            while (it2.hasNext()) {
                Object value = ((Map.Entry) it2.next()).getValue();
                if (value instanceof C1185120gwg) {
                    arrayList.add(value);
                }
            }
            C1185120gwg c1185120gwg = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList));
            if (c1185120gwg != null) {
                PoiVideoListSharedViewModel poiVideoListSharedViewModelGp = this.LL.Gp();
                String str = null;
                if (poiVideoListSharedViewModelGp != null) {
                    poiDetailVideoListModel = poiVideoListSharedViewModelGp.LLJ;
                } else {
                    poiDetailVideoListModel = null;
                }
                PoiVideoListSharedViewModel poiVideoListSharedViewModelGp2 = this.LL.Gp();
                if (poiVideoListSharedViewModelGp2 != null && (postTab = poiVideoListSharedViewModelGp2.LLILZLL) != null) {
                    str = postTab.tabCode;
                }
                C1185120gwg.LIZIZ(c1185120gwg, poiDetailVideoListModel, str, 2);
            }
        }
        return Unit.LIZ;
    }
}
