package X;

import com.ss.android.ugc.musicprovider.MultiMusicPlayManager;
import java.util.Iterator;

/* JADX INFO: renamed from: X.15JY, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JY implements C15IZ {
    public final /* synthetic */ MultiMusicPlayManager LIZ;

    public C15JY(MultiMusicPlayManager multiMusicPlayManager) {
        this.LIZ = multiMusicPlayManager;
    }

    @Override // X.C15IZ
    public final void LIZ() {
        if (this.LIZ.LLJI == 0) {
            Iterator<C15IZ> it2 = this.LIZ.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }
}
