package X;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: renamed from: X.1EQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1EQ8 {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public VolumeProvider LJ;

    public final Object LIZ() {
        if (this.LJ == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                final int i = this.LIZ;
                final int i2 = this.LIZIZ;
                final int i3 = this.LIZLLL;
                final String str = this.LIZJ;
                this.LJ = new VolumeProvider(i, i2, i3, str) { // from class: X.1EQ9
                    @Override // android.media.VolumeProvider
                    public final void onAdjustVolume(int i4) {
                        this.LIZ.LIZIZ(i4);
                    }

                    @Override // android.media.VolumeProvider
                    public final void onSetVolumeTo(int i4) {
                        this.LIZ.LIZJ(i4);
                    }
                };
            } else {
                final int i4 = this.LIZ;
                final int i5 = this.LIZIZ;
                final int i6 = this.LIZLLL;
                this.LJ = new VolumeProvider(i4, i5, i6) { // from class: X.1EQA
                    @Override // android.media.VolumeProvider
                    public final void onAdjustVolume(int i7) {
                        this.LIZ.LIZIZ(i7);
                    }

                    @Override // android.media.VolumeProvider
                    public final void onSetVolumeTo(int i7) {
                        this.LIZ.LIZJ(i7);
                    }
                };
            }
        }
        return this.LJ;
    }

    public abstract void LIZIZ(int i);

    public abstract void LIZJ(int i);

    public C1EQ8(int i, int i2, int i3, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LIZJ = str;
    }
}
