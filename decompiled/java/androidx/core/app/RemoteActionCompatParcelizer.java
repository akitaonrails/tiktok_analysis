package androidx.core.app;

import X.AbstractC815450Vyp;
import X.InterfaceC815410Vyl;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes14.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC815450Vyp abstractC815450Vyp) throws Throwable {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC815410Vyl interfaceC815410VylLJIILIIL = remoteActionCompat.LIZ;
        if (abstractC815450Vyp.LJII(1)) {
            interfaceC815410VylLJIILIIL = abstractC815450Vyp.LJIILIIL();
        }
        remoteActionCompat.LIZ = (IconCompat) interfaceC815410VylLJIILIIL;
        CharSequence charSequenceLJI = remoteActionCompat.LIZIZ;
        if (abstractC815450Vyp.LJII(2)) {
            charSequenceLJI = abstractC815450Vyp.LJI();
        }
        remoteActionCompat.LIZIZ = charSequenceLJI;
        CharSequence charSequenceLJI2 = remoteActionCompat.LIZJ;
        if (abstractC815450Vyp.LJII(3)) {
            charSequenceLJI2 = abstractC815450Vyp.LJI();
        }
        remoteActionCompat.LIZJ = charSequenceLJI2;
        remoteActionCompat.LIZLLL = (PendingIntent) abstractC815450Vyp.LJIIJJI(remoteActionCompat.LIZLLL, 4);
        boolean zLJ = remoteActionCompat.LJ;
        if (abstractC815450Vyp.LJII(5)) {
            zLJ = abstractC815450Vyp.LJ();
        }
        remoteActionCompat.LJ = zLJ;
        boolean zLJ2 = remoteActionCompat.LJFF;
        if (abstractC815450Vyp.LJII(6)) {
            zLJ2 = abstractC815450Vyp.LJ();
        }
        remoteActionCompat.LJFF = zLJ2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC815450Vyp abstractC815450Vyp) throws Throwable {
        abstractC815450Vyp.getClass();
        IconCompat iconCompat = remoteActionCompat.LIZ;
        abstractC815450Vyp.LJIILJJIL(1);
        abstractC815450Vyp.LJIL(iconCompat);
        CharSequence charSequence = remoteActionCompat.LIZIZ;
        abstractC815450Vyp.LJIILJJIL(2);
        abstractC815450Vyp.LJIIZILJ(charSequence);
        CharSequence charSequence2 = remoteActionCompat.LIZJ;
        abstractC815450Vyp.LJIILJJIL(3);
        abstractC815450Vyp.LJIIZILJ(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.LIZLLL;
        abstractC815450Vyp.LJIILJJIL(4);
        abstractC815450Vyp.LJIJJ(pendingIntent);
        boolean z = remoteActionCompat.LJ;
        abstractC815450Vyp.LJIILJJIL(5);
        abstractC815450Vyp.LJIILL(z);
        boolean z2 = remoteActionCompat.LJFF;
        abstractC815450Vyp.LJIILJJIL(6);
        abstractC815450Vyp.LJIILL(z2);
    }
}
