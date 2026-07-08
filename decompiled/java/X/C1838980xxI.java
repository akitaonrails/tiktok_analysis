package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838980xxI {
    public final MusicDetail LIZ;
    public final CommerceMusicLogger LIZIZ;
    public final Function1<MusicModel, Unit> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1838980xxI(MusicDetail musicDetail, CommerceMusicLogger commerceMusicLogger, Function1<? super MusicModel, Unit> function1) {
        this.LIZ = musicDetail;
        this.LIZIZ = commerceMusicLogger;
        this.LIZJ = function1;
    }
}
