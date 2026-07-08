package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offlinemode.api.OfflineModeApi;
import com.ss.android.ugc.aweme.offlinemode.repo.IOfflineCacheLifecycleListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625550OgD extends C11NZ<List<? extends String>> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(409));
    public int LLILLJJLI;

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super List<? extends String>> interfaceC626120Oh8) {
        try {
            C625530OgB.LIZ.getClass();
            List<String> listLIZ = C625530OgB.LIZ();
            List<String> listLJLLLLLL = LJLLLLLL(listLIZ);
            LJLLLL(new ArrayList(listLIZ), listLJLLLLLL);
            interfaceC626120Oh8.onNext(listLJLLLLLL);
            interfaceC626120Oh8.onComplete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC626120Oh8.onError(e);
        }
    }

    public final List<String> LJLLLLLL(List<String> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 20;
        int iCeil = (int) Math.ceil(((double) list.size()) / ((double) 20));
        int size = list.size();
        int i2 = 0;
        while (i2 < iCeil) {
            int i3 = i2 * 20;
            i2++;
            int i4 = i2 * 20;
            if (i4 > size) {
                i4 = size;
            }
            List<String> listSubList = list.subList(i3, i4);
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = listSubList.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            try {
                ArrayList arrayList2 = new ArrayList(i);
                JSONObject jSONObject = new JSONObject(((OfflineModeApi.OfflineModeApiDefinition) OfflineModeApi.LIZ.getValue()).verifyAids(sb.toString()).execute().LIZIZ.itemStatus);
                for (String str : listSubList) {
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        ((AbstractC1604130rqV) this.LL.getValue()).LJI("filter error", e);
                    }
                    if (JSONObjectProtectorUtils.getInt(jSONObject, str) != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(str);
                    }
                }
                listSubList = arrayList2;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                ((AbstractC1604130rqV) this.LL.getValue()).LJI("verify by page error", e2);
            }
            if (!listSubList.isEmpty()) {
                arrayList.addAll(listSubList);
            }
            i = 20;
        }
        return arrayList;
    }

    public final void LJLLLL(List<String> list, List<String> list2) {
        Object c098200Yq;
        Object c098200Yq2;
        ArrayList arrayList = (ArrayList) list;
        arrayList.removeAll(list2);
        this.LLILLJJLI += arrayList.size();
        if (!arrayList.isEmpty()) {
            C625470Og5.LL.getClass();
            C625470Og5.LLJLILLLLZIIL(list);
            Iterator<InterfaceC608020Nt2> it2 = C625470Og5.LLIZ.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZ(list);
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl != null) {
                    C625470Og5.LLILZ.LIZ("onInvalidRecordsDeleted failed", thM5exceptionOrNullimpl);
                }
            }
        }
        C625690OgR.LIZ.getClass();
        try {
            IOfflineCacheLifecycleListener iOfflineCacheLifecycleListener = (IOfflineCacheLifecycleListener) PluggableExtentionKt.pluggableSpi$default(IOfflineCacheLifecycleListener.class, false, false, false, 14, null);
            if (iOfflineCacheLifecycleListener != null) {
                iOfflineCacheLifecycleListener.LIZJ();
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl2 != null) {
            C625690OgR.LIZIZ.LIZ("onInspectionValidated failed", thM5exceptionOrNullimpl2);
        }
    }
}
