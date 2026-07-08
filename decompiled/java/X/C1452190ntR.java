package X;

import android.view.TextureView;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: renamed from: X.0ntR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452190ntR implements InterfaceC19764112Ul {
    public final C1463670oBx LIZ;
    public long LIZIZ;
    public long LIZJ;
    public double LIZLLL = 1.0d;

    @Override // X.InterfaceC19764112Ul
    public final long getCurrentPosition() {
        return (long) (((double) this.LIZ.LLL()) * this.LIZLLL);
    }

    @Override // X.InterfaceC19764112Ul
    public final long getDuration() {
        return (long) (((double) this.LIZ.getDuration()) * this.LIZLLL);
    }

    @Override // X.InterfaceC19764112Ul
    public final void pause() {
        this.LIZ.pause();
    }

    @Override // X.InterfaceC19764112Ul
    public final void release() {
        this.LIZ.destroy();
    }

    @Override // X.InterfaceC19764112Ul
    public final void resume() {
        this.LIZ.play();
    }

    @Override // X.InterfaceC19764112Ul
    public final void start() {
        this.LIZ.play();
    }

    @Override // X.InterfaceC19764112Ul
    public final void stop() {
        this.LIZ.pause();
    }

    @Override // X.InterfaceC19764112Ul
    public final void LIZ(double d) {
        C352130DrH.LIZIZ(this.LIZ).LJFF().LJIL(new C347060Dj6((float) d));
    }

    @Override // X.InterfaceC19764112Ul
    public final void LIZIZ(long j) {
        this.LIZ.nf((int) (j / this.LIZLLL), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
    }

    @Override // X.InterfaceC19764112Ul
    public final void LIZJ(String str) {
        C571670MbV.LIZ(new C1DOU(new String[]{str}), C352130DrH.LIZIZ(this.LIZ).LIZ);
        this.LIZ.prepare();
    }

    @Override // X.InterfaceC19764112Ul
    public final void LJ(double d) {
        this.LIZLLL = d;
        this.LIZ.LJII((float) d);
    }

    @Override // X.InterfaceC19764112Ul
    public final void LJFF(long j) {
        LIZLLL(this.LIZIZ, j);
    }

    @Override // X.InterfaceC19764112Ul
    public final void LJI(long j) {
        LIZLLL(j, this.LIZJ);
    }

    @Override // X.InterfaceC19764112Ul
    public final void setLoop(boolean z) {
        this.LIZ.setLoopPlay(z);
    }

    public C1452190ntR(String str, TextureView textureView) {
        this.LIZ = new C1463670oBx(str, textureView, EnumC1464030oCX.DEFAULT, EnumC1442010nd1.UPLOAD_OTHER);
    }

    @Override // X.InterfaceC19764112Ul
    public final void LIZLLL(long j, long j2) {
        boolean z;
        if (this.LIZ.getState() == VEEditor.VEState.STARTED) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZ.uf(((int) j) / 2, ((int) j2) / 2);
        LIZIZ(j);
        if (z) {
            resume();
        }
    }
}
