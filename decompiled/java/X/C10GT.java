package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.api.PopupEvent;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.api.UploadPopupEventsApi;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.api.UploadPopupEventsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10GT, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10GT {
    public static final /* synthetic */ C10GT LIZ = new C10GT();
    public static final UploadPopupEventsApi LIZIZ = (UploadPopupEventsApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(UploadPopupEventsApi.class);

    public static C11ON LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C10GS c10gs = (C10GS) it2.next();
            PopupEvent.Companion.getClass();
            long j = c10gs.LIZ;
            arrayList.add(new PopupEvent(j, j, c10gs.LIZIZ, c10gs.LIZJ, c10gs.LIZLLL, c10gs.LJ, c10gs.LJFF, c10gs.LJI, c10gs.LJII));
        }
        return LIZIZ.uploadPopupEvents(new UploadPopupEventsRequest(arrayList)).LJL(C11S5.LIZ()).LJJJJZI(new C517101zt(((C10GS) ListProtector.get(list, list.size() - 1)).LIZ, 6));
    }
}
