package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415750mwf {
    public static final List<PortraitStyleItem> LIZ(List<Asset> list, EnumC570120MXq enumC570120MXq) {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        Iterator<Asset> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                c098200Yq = LIZIZ(it2.next(), enumC570120MXq);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq != null) {
                arrayList.add(c098200Yq);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Asset r17, X.EnumC570120MXq r18) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1415750mwf.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Asset, X.0MXq):com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem");
    }
}
