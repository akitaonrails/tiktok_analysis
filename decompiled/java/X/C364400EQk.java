package X;

import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0EQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364400EQk {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final boolean LIZIZ;
    public final IAudioEffectParam LIZJ;

    public C364400EQk(String str, boolean z, IAudioEffectParam iAudioEffectParam, int i) {
        z = (i & 2) != 0 ? true : z;
        iAudioEffectParam = (i & 4) != 0 ? null : iAudioEffectParam;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = iAudioEffectParam;
        new AtomicInteger(-1);
        new AtomicInteger(-1);
        new AtomicInteger(-1);
    }
}
