package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.voice.LocalVoiceCache;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZRA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRA {
    public static boolean LIZ;
    public static final C823170WQx<String> LIZIZ = new C823170WQx<>();

    public static void LIZJ() {
        C13LE.LIZ(C0ZRA.class);
    }

    public static LocalVoiceCache LIZ(C869590Y9l c869590Y9l) {
        try {
            String str = c869590Y9l.getLocalExt().get("im_voice_message_transcribe");
            if (str == null) {
                return LocalVoiceCache.LIZ;
            }
            C1227904rF.LIZ.getClass();
            return (LocalVoiceCache) C1227904rF.LIZLLL().LJII(str, LocalVoiceCache.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LocalVoiceCache.LIZ;
        }
    }

    public static C0ZRE LIZIZ(C869590Y9l c869590Y9l) {
        if (!C458620Hye.LIZ.LIZJ()) {
            return C0ZRG.LIZ;
        }
        LocalVoiceCache localVoiceCacheLIZ = LIZ(c869590Y9l);
        if (LIZIZ.contains(c869590Y9l.getUuid())) {
            return C0ZRI.LIZ;
        }
        if (!localVoiceCacheLIZ.showTranscript) {
            return C0ZRG.LIZ;
        }
        if (localVoiceCacheLIZ.transcribed) {
            if (localVoiceCacheLIZ.serverModel.transcript.length() == 0) {
                return C0ZRJ.LIZ;
            }
            return new C0ZRC(localVoiceCacheLIZ.serverModel);
        }
        return C0ZRG.LIZ;
    }

    public static void LJ(long j, String str, Function1 function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1628106Zb(j, function1, str, null), 3);
    }

    public static void LIZLLL(String str, long j, C869590Y9l c869590Y9l, C0ZRF c0zrf) {
        C823170WQx<String> c823170WQx = LIZIZ;
        if (c823170WQx.contains(c869590Y9l.getUuid())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startTranscribe already in progress: uuid: ");
            sbLIZ.append(c869590Y9l.getUuid());
            sbLIZ.append(", inProgressSet: ");
            sbLIZ.append(c823170WQx);
            sbLIZ.append('}');
            C2188811AlT.LIZIZ(sbLIZ);
            LIZJ();
            return;
        }
        if (c0zrf instanceof C898980ZOm) {
            LIZ = true;
        }
        IMVoiceMessageUtil.LIZ.getClass();
        C0ZR9 c0zr9 = new C0ZR9(c0zrf, IMVoiceMessageUtil.LIZLLL, c869590Y9l, str, j);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c0zrf, 627);
        if (C458620Hye.LIZ.LJI() && LIZ(c869590Y9l).transcribed) {
            LIZJ();
            LJ(c869590Y9l.getMsgId(), "Voice Message Transcript: show transcript, hit cache", AFwS248S0000000_14.get$arr$(163));
            c0zr9.invoke();
            return;
        }
        c823170WQx.add(c869590Y9l.getUuid());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startTranscribe cache miss. add to progress set. inProgressSet: ");
        sbLIZ2.append(c823170WQx);
        C2188811AlT.LIZIZ(sbLIZ2);
        LIZJ();
        LJ(c869590Y9l.getMsgId(), "Voice Message Transcript: start transcribe", AFwS248S0000000_14.get$arr$(164));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0ZRB(j, c869590Y9l, awS558S0100000_14, str, c0zr9, null), 3);
    }
}
