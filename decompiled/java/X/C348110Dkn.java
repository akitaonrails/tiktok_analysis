package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0Dkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348110Dkn {
    public final NLEEditor LIZ;
    public final INLEMediaSession LIZIZ;
    public final LinkedList<AbstractC348060Dki> LIZJ = new LinkedList<>();
    public boolean LIZLLL;

    public final synchronized void LIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LIZJ.clear();
    }

    public final synchronized void LIZIZ() {
        if (this.LIZLLL) {
            System.currentTimeMillis();
            this.LIZ.commit();
            System.currentTimeMillis();
            Iterator<AbstractC348060Dki> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(this.LIZIZ);
            }
            System.currentTimeMillis();
            this.LIZJ.clear();
            this.LIZLLL = false;
        }
    }

    public C348110Dkn(NLEEditor nLEEditor, INLEMediaSession iNLEMediaSession) {
        this.LIZ = nLEEditor;
        this.LIZIZ = iNLEMediaSession;
    }
}
