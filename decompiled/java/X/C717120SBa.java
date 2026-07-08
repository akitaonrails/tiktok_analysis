package X;

import android.content.Context;
import android.util.LruCache;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.model.PaywallResponse;
import com.ss.android.ugc.aweme.subscription.subonlyvideos.experiments.SubOnlyVideoPaywallCacheConfigSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0SBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717120SBa implements C0S89<PaywallResponse> {
    public static final C717180SBg LIZJ = new C717180SBg("sub_only_video");
    public static final ConcurrentHashMap<String, C09AE> LIZLLL = new ConcurrentHashMap<>();
    public final C717170SBf LIZ;
    public final C01GW LIZIZ;

    @Override // X.C0S89
    public final void LIZIZ() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0SBf] */
    public C717120SBa() {
        final int i = SubOnlyVideoPaywallCacheConfigSetting.LIZ().cacheCount;
        this.LIZ = new LruCache<String, C717220SBk>(i) { // from class: X.0SBf
        };
        this.LIZIZ = C452501pT.LIZIZ(new C0SBZ());
    }

    @Override // X.C0S89
    public final C717180SBg LIZLLL() {
        return LIZJ;
    }

    @Override // X.C0S89
    public final C0S87<PaywallResponse> LIZ(View view) {
        Object tag;
        if (view != null) {
            tag = view.getTag();
        } else {
            tag = null;
        }
        if (!(tag instanceof C0S87)) {
            return null;
        }
        return (C0S87) tag;
    }

    @Override // X.C0S89
    public final Unit LJFF(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            ConcurrentHashMap<String, C09AE> concurrentHashMap = LIZLLL;
            C09AE c09ae = concurrentHashMap.get(AwemeExtKt.getAuthorUid(aweme));
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            arrayList.add(concurrentHashMap.remove(AwemeExtKt.getAuthorUid(aweme)));
        }
        return Unit.LIZ;
    }

    @Override // X.C0S89
    public final C0SC0 LIZJ(Context context, InterfaceC717360SBy interfaceC717360SBy) {
        return new C0SC0(context, interfaceC717360SBy);
    }

    @Override // X.C0S89
    public final boolean LJI(Aweme aweme, boolean z) {
        if ((((C0K77) this.LIZIZ.getValue()).LJIILL(aweme) || ((C0K77) this.LIZIZ.getValue()).LJJJJLI(aweme)) && !z) {
            return true;
        }
        return false;
    }

    @Override // X.C0S89
    public final void LJ(List list, Aweme aweme, C2252331DDr c2252331DDr, LifecycleCoroutineScope lifecycleCoroutineScope, String str, String str2, String str3) {
        String uid;
        User currentUser;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (ArrayList) list) {
            String authorUid = AwemeExtKt.getAuthorUid((Aweme) obj);
            Object arrayList = linkedHashMap.get(authorUid);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(authorUid, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Aweme aweme2 = (Aweme) C13LP.LJJJLL((List) ((Map.Entry) it2.next()).getValue());
            Unit unit = null;
            if (aweme2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(AwemeExtKt.getAuthorUid(aweme2));
                sbLIZ.append('_');
                IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
                if (iUserService != null && (currentUser = iUserService.getCurrentUser()) != null) {
                    uid = currentUser.getUid();
                } else {
                    uid = null;
                }
                sbLIZ.append(uid);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C717220SBk c717220SBk = get(strLIZIZ);
                ConcurrentHashMap<String, C09AE> concurrentHashMap = LIZLLL;
                if (concurrentHashMap.get(AwemeExtKt.getAuthorUid(aweme2)) != null) {
                    return;
                }
                if (c717220SBk != null && c717220SBk.LIZIZ != null && System.currentTimeMillis() - c717220SBk.LIZ < SubOnlyVideoPaywallCacheConfigSetting.LIZ().expirationTimeInMillis) {
                    C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C493701w7(c2252331DDr, c717220SBk, null), 3);
                    return;
                } else {
                    concurrentHashMap.put(AwemeExtKt.getAuthorUid(aweme2), C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C717270SBp(this, c2252331DDr, aweme2, aweme, str, str2, str3, strLIZIZ, null), 2));
                    unit = Unit.LIZ;
                }
            }
            arrayList2.add(unit);
        }
    }
}
