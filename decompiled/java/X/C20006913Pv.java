package X;

import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20006913Pv extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        Map<String, ModelInfo> mapLIZIZ;
        Collection collectionValues;
        List listLJJJJI;
        Map mapLIZ = C19996913Lz.LIZ(this.LIZ.LJIJI, this.LIZIZ);
        C20006713Pt c20006713PtLIZIZ = C13QA.LIZ().LIZIZ(0, false);
        if (c20006713PtLIZIZ == null || (mapLIZIZ = c20006713PtLIZIZ.LIZIZ()) == null || mapLIZIZ.isEmpty()) {
            runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10030), 95));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (mapLIZ != null && (collectionValues = mapLIZ.values()) != null && (listLJJJJI = C13LP.LJJJJI(C15438062q.LJIJJLI(collectionValues))) != null) {
            Iterator it2 = listLJJJJI.iterator();
            while (it2.hasNext()) {
                ModelInfo modelInfo = mapLIZIZ.get(it2.next());
                if (modelInfo != null) {
                    arrayList.add(modelInfo);
                }
            }
        }
        runOnMainThread(new AwS431S0200000_30(this, (C20006913Pv) arrayList, (List<? extends ModelInfo>) 97));
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 425));
    }

    public C20006913Pv(C13RD c13rd, String str, String str2) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
