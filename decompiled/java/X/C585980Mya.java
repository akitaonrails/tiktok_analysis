package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* JADX INFO: renamed from: X.0Mya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585980Mya implements InterfaceC1508380pM4 {
    public final C0N0Y LIZ;

    @Override // X.InterfaceC1508380pM4
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1508380pM4
    public final int LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC1508380pM4
    public final InterfaceC1484080ois LJ() {
        return this.LIZ.LJIILL().getPlayState();
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJFF() {
        this.LIZ.LJFF();
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJIILLIIL() {
        this.LIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJIJJ() {
        this.LIZ.LJIJJ();
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJJIIJZLJL() {
        this.LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJJIIZ() {
        this.LIZ.LJJIIZ();
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJJIIZI() {
        this.LIZ.LJJIIZI();
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJJL() {
        this.LIZ.LJJL();
    }

    @Override // X.InterfaceC1508380pM4
    public final float getBitrate() {
        return this.LIZ.getBitrate();
    }

    @Override // X.InterfaceC1508380pM4
    public final long getCurrentPosition() {
        return this.LIZ.getCurrentPosition();
    }

    @Override // X.InterfaceC1508380pM4
    public final long getDuration() {
        return this.LIZ.getDuration();
    }

    @Override // X.InterfaceC1508380pM4
    public final int getLoopCount() {
        return this.LIZ.LJIILL().LJIIIZ().LJJLIIJ();
    }

    @Override // X.InterfaceC1508380pM4
    public final C1471500oOa getVideoInfo() {
        return this.LIZ.getVideoInfo();
    }

    @Override // X.InterfaceC1508380pM4
    public final boolean isMute() {
        return this.LIZ.isMute();
    }

    @Override // X.InterfaceC1508380pM4
    public final boolean isPlaying() {
        return this.LIZ.isPlaying();
    }

    @Override // X.InterfaceC1508380pM4
    public final void release() {
        this.LIZ.release();
    }

    public C585980Mya(C0N0Y c0n0y) {
        this.LIZ = c0n0y;
    }

    @Override // X.InterfaceC1508380pM4
    public final void LIZIZ(Aweme aweme) {
        LJIIIZ(aweme);
    }

    @Override // X.InterfaceC1508380pM4
    public final void LIZJ(Aweme aweme) {
        this.LIZ.LJJLIIIJILLIZJL(aweme, null);
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJI(C583670Mur c583670Mur) {
        this.LIZ.LJIIL(c583670Mur);
    }

    @Override // X.InterfaceC1508380pM4
    public final String LJII(Video video) {
        return this.LIZ.LJL(video, true);
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJIIIIZZ(C583670Mur c583670Mur) {
        this.LIZ.LJJIJIIJIL(c583670Mur);
    }

    public final void LJIIIZ(Aweme aweme) {
        this.LIZ.LJJLIIIJLJLI(aweme, null);
    }

    @Override // X.InterfaceC1508380pM4
    public final String LJJII(C584150Mvd c584150Mvd) {
        return this.LIZ.LJJII(c584150Mvd);
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        this.LIZ.LJJIJ(onUIPlayListener);
    }

    @Override // X.InterfaceC1508380pM4
    public final void LJJIL(Surface surface) {
        this.LIZ.LJJIL(surface);
    }

    @Override // X.InterfaceC1508380pM4
    public final void seek(float f) {
        this.LIZ.seek(f);
    }

    @Override // X.InterfaceC1508380pM4
    public final void setSurface(Surface surface) {
        this.LIZ.setSurface(surface);
    }

    @Override // X.InterfaceC1508380pM4
    public final String LJIILIIL(Video video, OnUIPlayListener onUIPlayListener) {
        return this.LIZ.LJIILIIL(video, onUIPlayListener);
    }

    @Override // X.InterfaceC1508380pM4
    public final String LJIJJLI(Video video, int i) {
        return this.LIZ.LJIJJLI(video, i);
    }

    @Override // X.InterfaceC1508380pM4
    public final String LJJIFFI(C584150Mvd c584150Mvd, OnUIPlayListener onUIPlayListener) {
        return this.LIZ.LJJIFFI(c584150Mvd, onUIPlayListener);
    }
}
