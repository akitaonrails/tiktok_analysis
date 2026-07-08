package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLESetRangeMode;
import com.bytedance.ies.nle.editor_jni.NLEVEGlobalConfig;
import com.ss.android.vesdk.VEEditor;
import java.util.Map;

/* JADX INFO: renamed from: X.0oBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463690oBz {
    public static final NLESeekFlag LIZJ(VEEditor.SEEK_MODE seek_mode) {
        int i = C1463740oC4.LIZ[seek_mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek;
                        }
                        return NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateInOut;
                    }
                    return NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateOut;
                }
                return NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateIn;
            }
            return NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek;
        }
        return NLESeekFlag.EDITOR_SEEK_FLAG_OnGoing;
    }

    public static final NLEMediaConfig LIZIZ(String str, String str2) {
        NLEVEGlobalConfig nleVEGlobalConfig;
        InterfaceC1452930nud interfaceC1452930nud = C1452830nuT.LIZ;
        if (interfaceC1452930nud != null && ((C1452810nuR) interfaceC1452930nud).LIZ != null) {
            C1452950nuf.LIZIZ();
        }
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        nLEMediaConfig.setWorkSpace(str);
        nLEMediaConfig.setMediaLogLevel(LogLevel.LEVEL_INFO);
        int i = C1464110oCf.LIZ;
        nLEMediaConfig.setEnableLogExecutor(true);
        nLEMediaConfig.getNleMediaAbConfig().setEnableApiTimeCost(C1452960nug.LIZLLL);
        nLEMediaConfig.getNleMediaAbConfig().setEnableApiThreadCheck(C1452960nug.LJ);
        nLEMediaConfig.getNleMediaAbConfig().setThreadSamplingProb(C1452960nug.LJFF);
        nLEMediaConfig.setEnableLockSeekInVESwingMode(C1452960nug.LJIIJJI);
        nLEMediaConfig.setContentType(str2);
        nLEMediaConfig.getNleMediaAbConfig().setEnableSyncModelInAudio(C1452960nug.LIZ);
        nLEMediaConfig.setEnableResourceAsyncRender(C1452960nug.LJIIL);
        NLEVEGlobalConfig nleVEGlobalConfig2 = nLEMediaConfig.getNleVEGlobalConfig();
        if (nleVEGlobalConfig2 != null) {
            nleVEGlobalConfig2.addConfig("veabtest_enable_async_render", C1452960nug.LJIIL);
        }
        NLEVEGlobalConfig nleVEGlobalConfig3 = nLEMediaConfig.getNleVEGlobalConfig();
        if (nleVEGlobalConfig3 != null) {
            nleVEGlobalConfig3.addConfig("veabtest_continueCompileOnCloudProcessWithMusic", C1452960nug.LJIILL);
        }
        nLEMediaConfig.setEnableCoexistGlobalEffect(C1452960nug.LIZIZ);
        nLEMediaConfig.setEnableVEOperationEvent(C1452960nug.LIZJ);
        nLEMediaConfig.setEnableDestroyingCheck(true);
        nLEMediaConfig.setUsingDefaultFpsToMinus1(C1452960nug.LJIIJ);
        nLEMediaConfig.setLockSetDataSourceAndDestroy(C1452960nug.LJIILJJIL);
        C2281551ESb c2281551ESb = C2281551ESb.LIZIZ;
        nLEMediaConfig.setMinFps(c2281551ESb.LJJIIJ().min);
        nLEMediaConfig.setMaxFps(c2281551ESb.LJJIIJ().max);
        for (Map.Entry<String, Object> entry : C1452960nug.LJI.entrySet()) {
            if (entry.getValue() instanceof Boolean) {
                NLEVEGlobalConfig nleVEGlobalConfig4 = nLEMediaConfig.getNleVEGlobalConfig();
                if (nleVEGlobalConfig4 != null) {
                    nleVEGlobalConfig4.addConfig(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            } else if ((entry.getValue() instanceof Integer) && (nleVEGlobalConfig = nLEMediaConfig.getNleVEGlobalConfig()) != null) {
                nleVEGlobalConfig.addConfig(entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
        }
        return nLEMediaConfig;
    }

    public static final NLEFilter LIZ(long j, long j2, long j3, long j4) {
        NLEFilter nLEFilter = new NLEFilter();
        nLEFilter.setStartTime(j * 1000);
        nLEFilter.setEndTime(j2 * 1000);
        NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter = new NLESegmentAudioFadeFilter();
        nLESegmentAudioFadeFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceType(NLEResType.FILTER);
        nLESegmentAudioFadeFilter.setEffectSDKFilter(nLEResourceNode);
        nLESegmentAudioFadeFilter.setFadeInLength(j3 * 1000);
        nLESegmentAudioFadeFilter.setFadeOutLength(j4 * 1000);
        nLEFilter.setSegment(nLESegmentAudioFadeFilter);
        return nLEFilter;
    }

    public static final int LIZLLL(INLEMediaSession iNLEMediaSession, int i, int i2, VEEditor.SET_RANGE_MODE set_range_mode) {
        NLESetRangeMode nLESetRangeMode;
        int i3 = C1463740oC4.LIZIZ[set_range_mode.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                nLESetRangeMode = NLESetRangeMode.EDITOR_TIMERANGE_FLAG_AFTER_SPEED;
            } else {
                throw new C1954807lC();
            }
        } else {
            nLESetRangeMode = NLESetRangeMode.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED;
        }
        return iNLEMediaSession.getPlayerApi().setPlayRange(((long) i) * 1000, ((long) i2) * 1000, nLESetRangeMode);
    }
}
