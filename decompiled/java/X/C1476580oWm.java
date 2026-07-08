package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476580oWm {
    public final Map<String, C1475240oUc> LIZ = new ConcurrentHashMap();
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public SimVideoUrlModel LJ;
    public volatile String LJFF;

    public final SimVideoUrlModel LIZ() {
        if (this.LJ == null && !TextUtils.isEmpty(this.LIZLLL)) {
            this.LJ = LIZIZ(this.LIZLLL);
        }
        return this.LJ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C1476580oWm() {
        C989270bqn.LIZJ.LIZ.add((InterfaceC989230bqj<T>) new InterfaceC989230bqj() { // from class: X.0oWo
            @Override // X.InterfaceC989230bqj
            public final void accept(Object obj) {
                C1476580oWm c1476580oWm = this.LL;
                C1479510obV c1479510obV = (C1479510obV) obj;
                c1476580oWm.getClass();
                if (c1479510obV != null && !TextUtils.isEmpty(c1479510obV.LJIIIZ) && !c1479510obV.LJJI) {
                    String str = c1479510obV.LJIIIZ;
                    c1476580oWm.LIZLLL = str;
                    c1476580oWm.LJ = c1476580oWm.LIZIZ(str);
                }
            }
        });
        C989260bqm.LIZJ.LIZ.add((InterfaceC989230bqj<T>) new InterfaceC989230bqj() { // from class: X.0oWn
            @Override // X.InterfaceC989230bqj
            public final void accept(Object obj) {
                C1476580oWm c1476580oWm = this.LL;
                String str = (String) obj;
                c1476580oWm.getClass();
                if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, c1476580oWm.LIZLLL)) {
                    c1476580oWm.LIZLLL = str;
                    c1476580oWm.LJ = c1476580oWm.LIZIZ(str);
                }
            }
        });
        C989250bql.LIZJ.LIZ.add((InterfaceC989230bqj<T>) new InterfaceC989230bqj() { // from class: X.0oWp
            @Override // X.InterfaceC989230bqj
            public final void accept(Object obj) {
                C1476580oWm c1476580oWm = this.LL;
                if (TextUtils.equals((String) obj, c1476580oWm.LIZLLL)) {
                    c1476580oWm.LIZLLL = null;
                    c1476580oWm.LJ = null;
                }
            }
        });
    }

    public final SimVideoUrlModel LIZIZ(String str) {
        SimVideoUrlModel simVideoUrlModel;
        String str2 = this.LIZJ;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !((ConcurrentHashMap) this.LIZ).isEmpty()) {
            C1475240oUc c1475240oUc = (C1475240oUc) ((ConcurrentHashMap) this.LIZ).get(str2);
            if (c1475240oUc != null && !TextUtils.isEmpty(str) && (simVideoUrlModel = (SimVideoUrlModel) ((ConcurrentHashMap) c1475240oUc.LIZIZ).get(str)) != null) {
                return simVideoUrlModel;
            }
            Iterator it2 = ((ConcurrentHashMap) this.LIZ).values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1475240oUc c1475240oUc2 = (C1475240oUc) it2.next();
                c1475240oUc2.getClass();
                if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) c1475240oUc2.LIZIZ).containsKey(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        return (SimVideoUrlModel) ((ConcurrentHashMap) c1475240oUc2.LIZIZ).get(str);
                    }
                }
            }
        }
        return null;
    }
}
