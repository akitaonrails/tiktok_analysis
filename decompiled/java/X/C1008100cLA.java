package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;

/* JADX INFO: renamed from: X.0cLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008100cLA extends AbstractC1008090cL9 {
    public final int LIZ;

    @Override // X.AbstractC1008090cL9
    public final String LIZ() {
        return EnumC1008360cLa.PLAY_PROGRESS.getType();
    }

    public C1008100cLA(int i) {
        this.LIZ = i;
    }

    @Override // X.AbstractC1008090cL9
    public final boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
        Double playProgress;
        if (!super.LIZJ(anoleComponentAppearModel) || (playProgress = anoleComponentAppearModel.getPlayProgress()) == null || this.LIZ != ((int) playProgress.doubleValue()) || anoleComponentAppearModel.getShowAsImmediate()) {
            return false;
        }
        return true;
    }
}
