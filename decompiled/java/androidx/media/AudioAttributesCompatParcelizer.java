package androidx.media;

import X.AbstractC815450Vyp;
import X.InterfaceC815410Vyl;

/* JADX INFO: loaded from: classes34.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC815450Vyp abstractC815450Vyp) throws Throwable {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC815410Vyl interfaceC815410VylLJIILIIL = audioAttributesCompat.LIZ;
        if (abstractC815450Vyp.LJII(1)) {
            interfaceC815410VylLJIILIIL = abstractC815450Vyp.LJIILIIL();
        }
        audioAttributesCompat.LIZ = (AudioAttributesImpl) interfaceC815410VylLJIILIIL;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC815450Vyp abstractC815450Vyp) throws Throwable {
        abstractC815450Vyp.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.LIZ;
        abstractC815450Vyp.LJIILJJIL(1);
        abstractC815450Vyp.LJIL(audioAttributesImpl);
    }
}
