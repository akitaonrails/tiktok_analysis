package androidx.media;

import X.AbstractC815450Vyp;

/* JADX INFO: loaded from: classes34.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC815450Vyp abstractC815450Vyp) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.LIZ = abstractC815450Vyp.LJIIIZ(audioAttributesImplBase.LIZ, 1);
        audioAttributesImplBase.LIZIZ = abstractC815450Vyp.LJIIIZ(audioAttributesImplBase.LIZIZ, 2);
        audioAttributesImplBase.LIZJ = abstractC815450Vyp.LJIIIZ(audioAttributesImplBase.LIZJ, 3);
        audioAttributesImplBase.LIZLLL = abstractC815450Vyp.LJIIIZ(audioAttributesImplBase.LIZLLL, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC815450Vyp abstractC815450Vyp) {
        abstractC815450Vyp.getClass();
        abstractC815450Vyp.LJIJI(audioAttributesImplBase.LIZ, 1);
        abstractC815450Vyp.LJIJI(audioAttributesImplBase.LIZIZ, 2);
        abstractC815450Vyp.LJIJI(audioAttributesImplBase.LIZJ, 3);
        abstractC815450Vyp.LJIJI(audioAttributesImplBase.LIZLLL, 4);
    }
}
