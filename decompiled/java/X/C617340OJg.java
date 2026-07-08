package X;

import com.ss.android.ugc.aweme.inbox.bulletin.setting.BulletinPeriodicRequestSettingItem;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617340OJg {
    public static final C01GW<C617340OJg> LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(608));
    public final Map<WeakReference<Object>, C617390OJl> LIZ = new LinkedHashMap();
    public final BulletinPeriodicRequestSettingItem LIZIZ = C617350OJh.LIZ;

    public final void LIZ() {
        Iterator it2 = ((LinkedHashMap) this.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((Reference) entry.getKey()).get() == null) {
                AnonymousClass0956 anonymousClass0956 = ((C617390OJl) entry.getValue()).LJI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C2296808zG.LIZJ(((C617390OJl) entry.getValue()).LJFF, null);
                it2.remove();
            }
        }
    }

    public final C617390OJl LIZIZ(Object obj) {
        Object next;
        LIZ();
        Iterator it2 = ((LinkedHashMap) this.LIZ).entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Reference) ((Map.Entry) next).getKey()).get() == obj) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (C617390OJl) entry.getValue();
    }

    public final void LIZJ(Object obj) {
        Iterator it2 = ((LinkedHashMap) this.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((Reference) entry.getKey()).get() == obj) {
                AnonymousClass0956 anonymousClass0956 = ((C617390OJl) entry.getValue()).LJI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C2296808zG.LIZJ(((C617390OJl) entry.getValue()).LJFF, null);
                it2.remove();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinSubscribePeriodicRequestHandler + removeOwnerConfig + ");
                sbLIZ.append(obj);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
    }

    public final void LIZLLL(Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSubscribePeriodicRequestHandler + Try startPolling + ");
        sbLIZ.append(obj);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C617390OJl c617390OJlLIZIZ = LIZIZ(obj);
        if (c617390OJlLIZIZ != null) {
            AnonymousClass0956 anonymousClass0956 = c617390OJlLIZIZ.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            if (c617390OJlLIZIZ.LIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BulletinSubscribePeriodicRequestHandler + Real startPolling + ");
                sbLIZ2.append(obj);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                c617390OJlLIZIZ.LJI = C23250099c.LIZLLL(c617390OJlLIZIZ.LJFF, null, null, new C617380OJk(c617390OJlLIZIZ, null), 3);
            }
        }
    }
}
