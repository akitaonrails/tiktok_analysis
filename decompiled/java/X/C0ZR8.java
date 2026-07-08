package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS22S1400000_14;
import kotlin.jvm.internal.AwS2S1300100_14;
import kotlin.jvm.internal.AwS54S1300000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZR8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZR8 {
    public static final List<C1562980qm8<C0ZL0>> LIZ(C869590Y9l c869590Y9l, C0ZQI c0zqi, long j, SessionInfo sessionInfo) {
        String str;
        if (sessionInfo instanceof C909290Zln) {
            str = "private";
        } else {
            str = "group";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0zqi.LIZIZ(c869590Y9l, false));
        if (C0ZDX.LJJJJIZL(c869590Y9l)) {
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isSupportCustomization()) {
                arrayList.add(C0ZQK.LIZJ(c869590Y9l, c0zqi));
            }
        }
        if (C458620Hye.LIZ.LIZJ() && c869590Y9l.isSuccessStatus()) {
            C0ZRE c0zreLIZIZ = C0ZRA.LIZIZ(c869590Y9l);
            if (!Intrinsics.LJFF(c0zreLIZIZ, C0ZRI.LIZ)) {
                if (Intrinsics.LJFF(c0zreLIZIZ, C0ZRG.LIZ)) {
                    arrayList.add(C1558650qf9.LIZIZ("Transcript", C0ZL0.VOICE_TRANSCRIBE_START, Integer.valueOf(R.raw.icon_bubble_wave), 2131832170, false, new AwS2S1300100_14(str, j, c869590Y9l, sessionInfo, c0zqi, 0), 48));
                    C458640Hyg.LIZLLL(c869590Y9l.getMsgId(), "long_press_message_panel", sessionInfo.getConversationId(), str);
                } else {
                    if (c0zreLIZIZ instanceof C0ZRJ) {
                        LIZIZ(arrayList, sessionInfo, str, c869590Y9l, c0zqi);
                        return arrayList;
                    }
                    if (c0zreLIZIZ instanceof C0ZRC) {
                        arrayList.add(C1558650qf9.LIZIZ("Copy_text", C0ZL0.VOICE_TRANSCRIBE_COPY, Integer.valueOf(R.raw.icon_doc_on_doc), 2131832168, false, new AwS22S1400000_14(sessionInfo, str, c869590Y9l, c0zreLIZIZ, c0zqi, 1), 48));
                        LIZIZ(arrayList, sessionInfo, str, c869590Y9l, c0zqi);
                        return arrayList;
                    }
                    throw new C1954807lC();
                }
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(List<C1562980qm8<C0ZL0>> list, SessionInfo sessionInfo, String str, C869590Y9l c869590Y9l, C0ZQI c0zqi) {
        ((ArrayList) list).add(C1558650qf9.LIZIZ("Hide_transcript", C0ZL0.VOICE_TRANSCRIBE_HIDE, Integer.valueOf(R.raw.icon_bubble_wave), 2131832169, false, new AwS54S1300000_14(sessionInfo, str, c869590Y9l, c0zqi, 3), 48));
    }
}
