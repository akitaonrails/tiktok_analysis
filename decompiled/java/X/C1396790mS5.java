package X;

import com.bytedance.common.meteor.render.newcache.BitmapCacheManager;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396790mS5 {
    public final LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> LIZ = new LinkedList<>();
    public final C1384750m8f LIZIZ;
    public final InterfaceC1396800mS6 LIZJ;
    public int LIZLLL;
    public long LJ;

    public final void LIZ(Function1<? super AbstractC1384320m7y, Boolean> function1) {
        for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy : this.LIZ) {
            BitmapCacheManager.LIZ(abstractC1396720mRy.LLJILJILJ);
            abstractC1396720mRy.LLJILJILJ = null;
        }
        if (function1 == null) {
            this.LIZ.clear();
        } else {
            C19719612Di.LJJIIJ(this.LIZ, new AwS600S0100000_21(function1, (Function1<? super IDanmakuData, Integer>) 245), true);
        }
    }

    public final void LIZIZ(Function1<? super AbstractC1396720mRy<AbstractC1384320m7y>, Boolean> function1) {
        Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                it2.remove();
            }
        }
    }

    public final void LIZJ(int i, long j) {
        for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy : this.LIZ) {
            BitmapCacheManager.LIZ(abstractC1396720mRy.LLJILJILJ);
            abstractC1396720mRy.LLJILJILJ = null;
            this.LIZJ.LIZ(abstractC1396720mRy);
        }
        this.LIZ.clear();
        this.LIZLLL = i;
        this.LJ = j;
    }

    public C1396790mS5(C1384750m8f c1384750m8f, InterfaceC1396800mS6 interfaceC1396800mS6, int i, long j) {
        this.LIZIZ = c1384750m8f;
        this.LIZJ = interfaceC1396800mS6;
        this.LIZLLL = i;
        this.LJ = j;
    }
}
