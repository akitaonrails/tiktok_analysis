package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;

/* JADX INFO: renamed from: X.0sTR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628270sTR {
    public static final void LIZ(String str) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append("FullWidthEffectCarouselComponent");
        sbLIZ.append("] ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c201967140v, "FullHorizontalCarousel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ(String str, String str2) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("] ");
        sbLIZ.append(str2);
        C201955140j.LIZLLL(c201967140v, "SlideSlip", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ(String str, String str2) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("] ");
        sbLIZ.append(str2);
        C201955140j.LJIIIIZZ(c201967140v, "SlideSlip", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final C11LZ LIZLLL(LiveData liveData, LifecycleOwner lifecycleOwner) {
        return C11NZ.LJJJJJ(LiveDataReactiveStreams.toPublisher(lifecycleOwner, liveData));
    }
}
