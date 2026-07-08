package androidx.media;

import X.AbstractC815450Vyp;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes34.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC815450Vyp abstractC815450Vyp) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.LIZ = (AudioAttributes) abstractC815450Vyp.LJIIJJI(audioAttributesImplApi21.LIZ, 1);
        audioAttributesImplApi21.LIZIZ = abstractC815450Vyp.LJIIIZ(audioAttributesImplApi21.LIZIZ, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC815450Vyp abstractC815450Vyp) {
        abstractC815450Vyp.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.LIZ;
        abstractC815450Vyp.LJIILJJIL(1);
        abstractC815450Vyp.LJIJJ(audioAttributes);
        abstractC815450Vyp.LJIJI(audioAttributesImplApi21.LIZIZ, 2);
    }
}
