package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.Set;

/* JADX INFO: renamed from: X.0JHH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHH extends AbstractC489980JJk {
    public static final void LIZ(PublishModel publishModel) {
        C0JHA.LIZ(publishModel.creationId, new C0JH7(0, 2));
    }

    @Override // X.AbstractC1433570nPP
    public final void onProgress(int i, Object obj) {
        String str;
        C1434900nRY c1434900nRY;
        PublishModel publishModel;
        if (!(obj instanceof C1434900nRY) || (c1434900nRY = (C1434900nRY) obj) == null || (publishModel = c1434900nRY.LIZJ) == null || (str = publishModel.creationId) == null) {
            str = "";
        }
        if (str.length() > 0) {
            C0JHA.LIZ(str, new C0JH7(i, 2));
        }
    }

    @Override // X.AbstractC1433570nPP
    public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        String str;
        String str2;
        if (publishModel == null || (str = publishModel.creationId) == null) {
            str = "";
        }
        if (abstractC1433460nPE instanceof C492390JSr) {
            C0JHA.LIZ(str, new C0JH7(100, abstractC1433460nPE));
        } else {
            C0JHA.LIZ(str, new C0JH7(-1, abstractC1433460nPE));
        }
        synchronized (C0JHA.LIZLLL) {
            try {
                Set<String> set = C0JHA.LIZJ;
                if (publishModel != null) {
                    str2 = publishModel.publishId;
                } else {
                    str2 = null;
                }
                C19719512Dh.LIZ(set).remove(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC1433570nPP
    public final void onStageUpdate(String str, AbstractC1433380nP6 abstractC1433380nP6, Object obj) {
        super.onStageUpdate(str, abstractC1433380nP6, obj);
    }
}
