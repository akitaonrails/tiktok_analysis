package X;

import Y.ARunnableS125S0100000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCBaseCameraScene;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0tCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656480tCw implements IFetchResourceListener {
    public final /* synthetic */ AIGCBaseCameraScene LIZ;

    public C1656480tCw(AIGCBaseCameraScene aIGCBaseCameraScene) {
        this.LIZ = aIGCBaseCameraScene;
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onFailure(Exception exc) {
        this.LIZ.LLJJL.LJ(99);
        this.LIZ.LLLLLIL();
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onSuccess(long j) {
        HashMap map = (HashMap) this.LIZ.LLJJJJJIL;
        ArrayList<String> arrayList = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(ListProtector.get((List) ((Map.Entry) it2.next()).getValue(), 0));
        }
        AIGCBaseCameraScene aIGCBaseCameraScene = this.LIZ;
        boolean zIsResourceAvailable = true;
        for (String str : arrayList) {
            zIsResourceAvailable = C13Q5.LIZ().LIZLLL().isResourceAvailable(str);
            if (!zIsResourceAvailable) {
                int i = aIGCBaseCameraScene.LLJJLIIIJLLLLLLLZ;
                if (i < 3) {
                    aIGCBaseCameraScene.LLJJLIIIJLLLLLLLZ = i + 1;
                    DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(aIGCBaseCameraScene.LLJJJJ, aIGCBaseCameraScene.LLJJJJJIL, new C1656480tCw(aIGCBaseCameraScene));
                } else {
                    aIGCBaseCameraScene.LLJJLIIIJLLLLLLLZ = 0;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(" download fail");
                    new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ));
                    aIGCBaseCameraScene.LLJJL.LJ(99);
                    aIGCBaseCameraScene.LLLLLIL();
                }
            }
        }
        if (!(!zIsResourceAvailable) && this.LIZ.LLJJL.LIZLLL() == 2) {
            AIGCBaseCameraScene aIGCBaseCameraScene2 = this.LIZ;
            aIGCBaseCameraScene2.LLJJL.LJ(99);
            aIGCBaseCameraScene2.requireActivity().runOnUiThread(new ARunnableS125S0100000_25(aIGCBaseCameraScene2, 2));
        }
    }
}
