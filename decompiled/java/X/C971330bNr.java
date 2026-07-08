package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971330bNr {
    public final C971380bNw LIZ;
    public final NLETrackSlot LIZIZ;
    public final C971360bNu LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C971330bNr)) {
            return false;
        }
        C971330bNr c971330bNr = (C971330bNr) obj;
        return Intrinsics.LJFF(this.LIZ, c971330bNr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c971330bNr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c971330bNr.LIZJ);
    }

    public C971330bNr(C971380bNw c971380bNw, NLETrackSlot nLETrackSlot, C971360bNu c971360bNu) {
        this.LIZ = c971380bNw;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = c971360bNu;
    }
}
