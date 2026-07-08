package X;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: X.0Vvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813640Vvu {
    public static AudioAttributes.Builder LIZIZ() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes LIZ(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder LIZJ(AudioAttributes.Builder builder, int i) {
        return builder.setContentType(i);
    }

    public static AudioAttributes.Builder LIZLLL(AudioAttributes.Builder builder, int i) {
        return builder.setLegacyStreamType(i);
    }

    public static AudioAttributes.Builder LJ(AudioAttributes.Builder builder, int i) {
        return builder.setUsage(i);
    }
}
