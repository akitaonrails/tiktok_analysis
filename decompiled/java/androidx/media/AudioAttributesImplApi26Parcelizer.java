package androidx.media;

import X.AbstractC815450Vyp;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes34.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC815450Vyp abstractC815450Vyp) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.LIZ = (AudioAttributes) abstractC815450Vyp.LJIIJJI(audioAttributesImplApi26.LIZ, 1);
        audioAttributesImplApi26.LIZIZ = abstractC815450Vyp.LJIIIZ(audioAttributesImplApi26.LIZIZ, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC815450Vyp abstractC815450Vyp) {
        abstractC815450Vyp.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.LIZ;
        abstractC815450Vyp.LJIILJJIL(1);
        abstractC815450Vyp.LJIJJ(audioAttributes);
        abstractC815450Vyp.LJIJI(audioAttributesImplApi26.LIZIZ, 2);
    }
}
