package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E4A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4A {
    public static boolean LIZ;
    public static Pair<Integer, Integer> LIZIZ = new Pair<>(0, 0);
    public static Pair<Integer, Integer> LIZJ = new Pair<>(0, 0);
    public static final Pair<Integer, Integer> LIZLLL;
    public static final List<Pair<Integer, Integer>> LJ;

    static {
        Pair<Integer, Integer> pair = new Pair<>(720, 1280);
        LIZLLL = pair;
        LJ = C1697810uHb.LJIIJJI(pair, new Pair(1080, 1920), new Pair(1440, 2560), new Pair(2160, 3840), new Pair(4320, 7680));
    }

    public static boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ep_preview_resolution_opt", true, false);
    }

    public static void LIZJ(INLEMediaSession iNLEMediaSession) {
        INLEPlayer playerApi;
        Pair pair;
        boolean z;
        Object first;
        if (!LIZ()) {
            return;
        }
        LIZLLL(iNLEMediaSession, true);
        LIZ = false;
        int iIntValue = LIZIZ.getFirst().intValue();
        int iIntValue2 = LIZIZ.getSecond().intValue();
        if (iIntValue > 0 && iIntValue2 > 0) {
            float f = iIntValue;
            float f2 = iIntValue2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iNLEMediaSession != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                PairIntInt canvasSize = iNLEMediaSession.getMediaRuntimeApi().getCanvasSize();
                Object second = null;
                if (canvasSize != null) {
                    pair = new Pair(Integer.valueOf(canvasSize.getFirst()), Integer.valueOf(canvasSize.getSecond()));
                } else {
                    pair = null;
                }
                long currentPosition = iNLEMediaSession.getPlayerApi().getCurrentPosition() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                if (pair != null && ((int) f) == ((Number) pair.getFirst()).intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && pair != null && ((int) f2) == ((Number) pair.getSecond()).intValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("resetCanvasSize abort, same size: ");
                    sbLIZ.append(f);
                    sbLIZ.append('-');
                    sbLIZ.append(f2);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    iNLEMediaSession.getMediaRuntimeApi().setCanvasSize((int) f, (int) f2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resetCanvasSize: ");
                    if (pair != null) {
                        first = pair.getFirst();
                    } else {
                        first = null;
                    }
                    sbLIZ2.append(first);
                    sbLIZ2.append('-');
                    if (pair != null) {
                        second = pair.getSecond();
                    }
                    sbLIZ2.append(second);
                    sbLIZ2.append(" -> ");
                    sbLIZ2.append(f);
                    sbLIZ2.append(" - ");
                    sbLIZ2.append(f2);
                    sbLIZ2.append(" cost: ");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (!C0BTF.LIZ()) {
                        playerApi.prepare();
                        playerApi.seekTime(C351220Dpo.LLLLLLJ(currentPosition), NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek);
                    }
                }
            }
            LIZIZ = new Pair<>(0, 0);
        }
    }

    public static void LIZIZ(C0E48 c0e48, String str) {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        Pair<Integer, Integer> canvasSize;
        NLEPlayerState nLEPlayerStateState;
        INLEPlayer playerApi;
        if (!LIZ() || c0e48 == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("]try fitToDisplayPos");
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = false;
        LIZLLL(c0e48.f1(), false);
        NLETrack mainTrack = C350870DpF.LJI(c0e48).getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
            Pair pair = new Pair(Integer.valueOf((int) resource.getWidth()), Integer.valueOf((int) resource.getHeight()));
            Pair<Integer, Integer> canvasSize2 = c0e48.getCanvasSize();
            if (canvasSize2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isCanvasSizeEqualVideoSize: ");
                sbLIZ2.append(pair);
                sbLIZ2.append(' ');
                sbLIZ2.append(canvasSize2);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (!Intrinsics.LJFF(pair, canvasSize2) || (canvasSize = c0e48.getCanvasSize()) == null) {
                    return;
                }
                int iIntValue = canvasSize.getFirst().intValue();
                int iIntValue2 = canvasSize.getSecond().intValue();
                float[] fArrLLJLLIL = c0e48.getPlayer().LLJLLIL();
                if (fArrLLJLLIL == null) {
                    return;
                }
                int i = (int) fArrLLJLLIL[2];
                int i2 = (int) fArrLLJLLIL[3];
                Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                Pair<Integer, Integer> pair3 = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
                int iIntValue3 = pair3.getFirst().intValue();
                int iIntValue4 = pair3.getSecond().intValue();
                if (!C0BTF.LIZ() || iIntValue3 <= 0 || iIntValue4 <= 0 || (iIntValue3 > pair2.getFirst().intValue() && iIntValue4 > pair2.getSecond().intValue())) {
                    List<Pair<Integer, Integer>> list = LJ;
                    if (list.contains(pair2)) {
                        pair3 = LIZLLL;
                    } else {
                        if (list.contains(new Pair(pair2.getSecond(), pair2.getFirst()))) {
                            Pair<Integer, Integer> pair4 = LIZLLL;
                            pair2 = new Pair<>(pair4.getSecond(), pair4.getFirst());
                        }
                        pair3 = pair2;
                    }
                }
                int iIntValue5 = pair3.getFirst().intValue();
                int iIntValue6 = pair3.getSecond().intValue();
                boolean zIsPlaying = c0e48.getPlayer().isPlaying();
                INLEMediaSession iNLEMediaSessionF1 = c0e48.f1();
                if (iNLEMediaSessionF1 != null && (playerApi = iNLEMediaSessionF1.getPlayerApi()) != null) {
                    nLEPlayerStateState = playerApi.state();
                } else {
                    nLEPlayerStateState = null;
                }
                if (nLEPlayerStateState == NLEPlayerState.STARTED) {
                    z = true;
                }
                if (iIntValue5 < iIntValue && iIntValue6 < iIntValue2) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('[');
                    sbLIZ3.append(str);
                    sbLIZ3.append("]fitToDisplayPos start: ");
                    sbLIZ3.append(canvasSize.getFirst().intValue());
                    sbLIZ3.append('-');
                    sbLIZ3.append(canvasSize.getSecond().intValue());
                    sbLIZ3.append(" -> ");
                    sbLIZ3.append(iIntValue5);
                    sbLIZ3.append(" - ");
                    sbLIZ3.append(iIntValue6);
                    sbLIZ3.append(" , uiPlaying: ");
                    sbLIZ3.append(zIsPlaying);
                    sbLIZ3.append(", nlePlaying:");
                    sbLIZ3.append(z);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    LIZIZ = new Pair<>(canvasSize.getFirst(), canvasSize.getSecond());
                    if (!zIsPlaying && !z) {
                        c0e48.setCanvasSize(iIntValue5, iIntValue6);
                        if (!C0BTF.LIZ()) {
                            c0e48.getPlayer().prepare();
                            c0e48.getPlayer().LJJIIZ(null);
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append('[');
                        sbLIZ4.append(str);
                        sbLIZ4.append("]fitToDisplayPos end: ");
                        sbLIZ4.append(iIntValue5);
                        sbLIZ4.append(" - ");
                        sbLIZ4.append(iIntValue6);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        return;
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append('[');
                    sbLIZ5.append(str);
                    sbLIZ5.append("]fitToDisplayPos delay to pause: ");
                    sbLIZ5.append(iIntValue5);
                    sbLIZ5.append(" - ");
                    sbLIZ5.append(iIntValue6);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    LIZJ = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
                    LIZ = true;
                    return;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append('[');
                sbLIZ6.append(str);
                sbLIZ6.append("]fitToDisplayPos abort: ");
                sbLIZ6.append(iIntValue5);
                sbLIZ6.append('-');
                sbLIZ6.append(iIntValue6);
                sbLIZ6.append(" larger or equal than ");
                sbLIZ6.append(iIntValue);
                sbLIZ6.append('-');
                sbLIZ6.append(iIntValue2);
                C2188811AlT.LIZIZ(sbLIZ6);
            }
        }
    }

    public static void LIZLLL(INLEMediaSession iNLEMediaSession, boolean z) {
        INLEPlayer playerApi;
        if (iNLEMediaSession != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.setEnableFastcvLanc(z);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableLanczos ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
