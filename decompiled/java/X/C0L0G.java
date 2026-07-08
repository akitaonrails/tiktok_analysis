package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0L0G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0G implements Serializable {
    public static final C524260KhE Companion = new Object() { // from class: X.0KhE
    };
    public static final C0L0G DEFAULT = new C0L0G(SpeechEngineDefines.TTS_WORK_MODE_BOTH, SpeechEngineDefines.TTS_WORK_MODE_BOTH, SpeechEngineDefines.TTS_WORK_MODE_BOTH, SpeechEngineDefines.TTS_WORK_MODE_BOTH, 20480000);
    public final int maxHeight;
    public final int maxSize;
    public final int maxWidth;
    public final int minHeight;
    public final int minWidth;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0L0G)) {
            return false;
        }
        C0L0G c0l0g = (C0L0G) obj;
        return this.minWidth == c0l0g.minWidth && this.minHeight == c0l0g.minHeight && this.maxWidth == c0l0g.maxWidth && this.maxHeight == c0l0g.maxHeight && this.maxSize == c0l0g.maxSize;
    }

    public C0L0G(int i, int i2, int i3, int i4, int i5) {
        this.minWidth = i;
        this.minHeight = i2;
        this.maxWidth = i3;
        this.maxHeight = i4;
        this.maxSize = i5;
    }
}
