package X;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: X.1ASq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2179781ASq {
    public static PlaybackState.Builder LIZLLL() {
        return new PlaybackState.Builder();
    }

    public static PlaybackState.CustomAction LIZIZ(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    public static PlaybackState LIZJ(PlaybackState.Builder builder) {
        return builder.build();
    }

    public static String LJFF(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    public static long LJI(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    public static long LJII(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    public static long LJIIIIZZ(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    public static List<PlaybackState.CustomAction> LJIIIZ(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    public static CharSequence LJIIJ(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    public static Bundle LJIIJJI(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    public static int LJIIL(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    public static long LJIILIIL(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    public static CharSequence LJIILJJIL(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    public static float LJIILL(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    public static long LJIILLIIL(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    public static int LJIIZILJ(PlaybackState playbackState) {
        return playbackState.getState();
    }

    public static void LIZ(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    public static void LJIJ(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    public static void LJIJI(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    public static void LJIJJ(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    public static void LJIJJLI(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    public static void LJIL(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static PlaybackState.CustomAction.Builder LJ(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    public static void LJJ(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }
}
