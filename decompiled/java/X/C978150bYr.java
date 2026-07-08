package X;

import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0bYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978150bYr {
    public static C978100bYm LIZ(MatchBaseWidget matchBaseWidget, C978090bYl c978090bYl, Function0 function0, InterfaceC1631620sYq interfaceC1631620sYq, Function0 function02, Function0 function03, Function0 function04, Function0 function05, boolean z, C979690bbL c979690bbL, EnumC974980bTk enumC974980bTk, EnumC975850bV9 enumC975850bV9, boolean z2, boolean z3, String str, int i) {
        String str2 = str;
        boolean z4 = z2;
        EnumC975850bV9 enumC975850bV92 = enumC975850bV9;
        boolean z5 = z3;
        Function0 function06 = function05;
        if ((i & 128) != 0) {
            function06 = AFwS203S0000000_15.get$arr$(360);
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            enumC975850bV92 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z4 = false;
        }
        if ((i & 8192) != 0) {
            z5 = false;
        }
        if ((i & 16384) != 0) {
            str2 = "";
        }
        return new C978100bYm(matchBaseWidget, c978090bYl, function0, interfaceC1631620sYq, function02, function03, function04, function06, c979690bbL, enumC974980bTk, enumC975850bV92, z4, z5, str2, false);
    }
}
