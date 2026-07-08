package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEntry;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadEventData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2130808Wk {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final ECPreloadEntry LIZ;
    public final List<C1903407cu> LIZIZ;
    public final List<C08W1> LIZJ;
    public final String LIZLLL;
    public final long LJ = System.currentTimeMillis();
    public final String LJFF;
    public C08W0 LJI;
    public EnumC2131008Wm LJII;
    public C2131808Wu LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r8v0, types: [X.08Wl] */
    public final void LIZIZ() {
        List<C1903407cu> list;
        C1903407cu next;
        Map<String, List<String>> map;
        List list2;
        h hVarLJJIIZI;
        if (this.LJII.getValue() >= EnumC2131008Wm.ENQUEUE.getValue()) {
            return;
        }
        int i = C1505950pI9.LIZ;
        String str = this.LJFF;
        long j = this.LJ;
        ECPreloadEntry eCPreloadEntry = this.LIZ;
        String str2 = this.LIZLLL;
        if (C1505950pI9.LJFF()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", "prepare");
            jSONObject.put("create_to_prepare_dur", System.currentTimeMillis() - j);
            String str3 = eCPreloadEntry.pageName;
            if (str3 == null) {
                str3 = "unknown";
            }
            String str4 = eCPreloadEntry.entryId;
            if (str4 == null) {
                str4 = "unknown";
            }
            String str5 = eCPreloadEntry.type;
            if (str5 == null) {
                str5 = "unknown";
            }
            C1505950pI9.LIZ(jSONObject, str, str3, str4, str5, str2);
        }
        if (!Intrinsics.LJFF(this.LIZ.type, EnumC2130408Wg.PDP_BATCH_API.getValueStr()) || (list = this.LIZIZ) == null) {
            return;
        }
        Iterator<C1903407cu> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Map<String, List<String>> map2 = next.LIZJ;
            if (map2 != null && ((LinkedHashMap) map2).get("product_id") != null) {
                break;
            }
        }
        C1903407cu c1903407cu = next;
        if (c1903407cu == null || (map = c1903407cu.LIZJ) == null || (list2 = (List) ((LinkedHashMap) map).get("product_id")) == null || list2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            n nVar = this.LIZ.preloadParam;
            if (nVar != null && (hVarLJJIIZI = nVar.LJJIIZI("traffic_source_list")) != null) {
                Iterator<k> it3 = hVarLJJIIZI.iterator();
                while (it3.hasNext()) {
                    arrayList.add(Integer.valueOf(it3.next().LJIIJJI()));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str6 = this.LIZ.pageName;
        C2131808Wu c2131808Wu = new C2131808Wu(new C2131708Wt(str6 != null ? str6 : "unknown", list2, arrayList), this.LJFF, this.LIZ, new InterfaceC2132308Wz() { // from class: X.08Wl
            @Override // X.InterfaceC2132308Wz
            public final void LIZ(AbstractC2132008Ww abstractC2132008Ww) throws JSONException {
                this.LIZ.LJII = EnumC2131008Wm.SUCCESS;
                C2132108Wx c2132108WxLIZ = C2130608Wi.LIZ();
                c2132108WxLIZ.LIZIZ.add(abstractC2132008Ww.LJIIIIZZ());
                abstractC2132008Ww.LJIIL(System.currentTimeMillis());
                C1505950pI9.LJ(abstractC2132008Ww, "finish", null);
                c2132108WxLIZ.LIZ.remove(abstractC2132008Ww);
            }

            @Override // X.InterfaceC2132308Wz
            public final void LIZIZ(AbstractC2132008Ww abstractC2132008Ww, String str7) throws JSONException {
                this.LIZ.LJII = EnumC2131008Wm.FAIL;
                C2132108Wx c2132108WxLIZ = C2130608Wi.LIZ();
                c2132108WxLIZ.getClass();
                abstractC2132008Ww.LJIIL(System.currentTimeMillis());
                C1505950pI9.LJ(abstractC2132008Ww, "fail", str7);
                c2132108WxLIZ.LIZ.remove(abstractC2132008Ww);
            }
        }, this.LIZLLL);
        this.LJIIIIZZ = c2131808Wu;
        c2131808Wu.LJII = this.LJ;
        c2131808Wu.LJIIIIZZ = System.currentTimeMillis();
        C2132108Wx c2132108WxLIZ = C2130608Wi.LIZ();
        c2132108WxLIZ.LIZ.add(c2131808Wu);
        if (c2132108WxLIZ.LIZJ == null) {
            C2132108Wx.LIZ(c2131808Wu);
        } else {
            c2132108WxLIZ.LIZLLL.add(c2131808Wu);
        }
        this.LJII = EnumC2131008Wm.ENQUEUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2130808Wk.LIZJ():void");
    }

    public final AbstractC1903507cv LIZ(AbstractC1931807hU abstractC1931807hU) {
        List<C1903407cu> list;
        AbstractC1903507cv abstractC1903507cv = null;
        if (abstractC1931807hU instanceof ECPreloadEventData) {
            List<C08W1> list2 = this.LIZJ;
            if (list2 == null) {
                return null;
            }
            Iterator<C08W1> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C08W1 next = it2.next();
                if (Intrinsics.LJFF(next.LIZIZ, abstractC1931807hU)) {
                    abstractC1903507cv = next;
                    break;
                }
            }
            return abstractC1903507cv;
        }
        if (!(abstractC1931807hU instanceof ECPreloadApiData) || (list = this.LIZIZ) == null) {
            return null;
        }
        Iterator<C1903407cu> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1903407cu next2 = it3.next();
            if (Intrinsics.LJFF(next2.LIZIZ, abstractC1931807hU)) {
                abstractC1903507cv = next2;
                break;
            }
        }
        return abstractC1903507cv;
    }

    public C2130808Wk(ECPreloadEntry eCPreloadEntry, List<C1903407cu> list, List<C08W1> list2, String str) throws JSONException {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        String name;
        this.LIZ = eCPreloadEntry;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(eCPreloadEntry.entryId);
        sbLIZ.append('_');
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            boolean z = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null;
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getDeviceId());
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJFF = strLIZIZ;
        this.LJII = EnumC2131008Wm.INIT;
        if (C1505950pI9.LJFF()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", "create");
            String str2 = eCPreloadEntry.pageName;
            str2 = str2 == null ? "unknown" : str2;
            String str3 = eCPreloadEntry.entryId;
            str3 = str3 == null ? "unknown" : str3;
            String str4 = eCPreloadEntry.type;
            C1505950pI9.LIZ(jSONObject, strLIZIZ, str2, str3, str4 != null ? str4 : "unknown", str);
        }
    }
}
