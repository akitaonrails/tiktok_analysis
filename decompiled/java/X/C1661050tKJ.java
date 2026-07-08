package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0tKJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661050tKJ {
    public final String LIZ;
    public final MusicWaveBean LIZIZ;
    public final Integer LIZJ;
    public final C202035143l LIZLLL;
    public final Effect LJ;
    public final Integer LJFF;
    public final ExceptionResult LJI;
    public final Boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public C1661050tKJ() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    public C1661050tKJ(String str, MusicWaveBean musicWaveBean, Integer num, C202035143l c202035143l, Effect effect, Integer num2, ExceptionResult exceptionResult, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = musicWaveBean;
        this.LIZJ = num;
        this.LIZLLL = c202035143l;
        this.LJ = effect;
        this.LJFF = num2;
        this.LJI = exceptionResult;
        this.LJII = bool;
    }

    public /* synthetic */ C1661050tKJ(String str, MusicWaveBean musicWaveBean, Integer num, C202035143l c202035143l, Effect effect, Integer num2, ExceptionResult exceptionResult, Boolean bool, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : musicWaveBean, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : c202035143l, (i & 16) != 0 ? null : effect, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : exceptionResult, (i & 128) == 0 ? bool : null);
    }
}
