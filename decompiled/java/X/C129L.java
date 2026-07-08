package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.129L, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C129L extends C129G {
    public final Function0<Boolean> LLJILJIL;

    @Override // X.C129G
    public final boolean LLLI(MusicModel musicModel) {
        if (this.LLJILJIL.invoke().booleanValue()) {
            return super.LLLI(musicModel);
        }
        AVMusic aVMusicLLLFZ = LLLFZ();
        if (aVMusicLLLFZ == null || !C1419800n3C.LIZJ(C389120FNm.LIZ(aVMusicLLLFZ), musicModel)) {
            return false;
        }
        return true;
    }

    public C129L(C1DRG c1drg, AnonymousClass1297 anonymousClass1297, InterfaceC1455230nyL interfaceC1455230nyL, C129C c129c, Function0<Boolean> function0) {
        super(c1drg, anonymousClass1297, interfaceC1455230nyL, c129c, true, false, 32);
        this.LLJILJIL = function0;
    }
}
