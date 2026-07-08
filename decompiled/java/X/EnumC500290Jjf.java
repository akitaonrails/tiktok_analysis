package X;

import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jjf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC500290Jjf {
    public static final EnumC500290Jjf AUDIENCE;
    public static final EnumC500290Jjf END;
    public static final EnumC500290Jjf GAME;
    public static final EnumC500290Jjf LIVE_STUDIO_MONITOR;
    public static final EnumC500290Jjf LIVE_VOICE;
    public static final /* synthetic */ EnumC500290Jjf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC500290Jjf OBS;
    public static final EnumC500290Jjf PREVIEW;
    public static final EnumC500290Jjf VIDEO;

    public static InterfaceC2044707zh<EnumC500290Jjf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC500290Jjf enumC500290Jjf = new EnumC500290Jjf("PREVIEW", 0);
        PREVIEW = enumC500290Jjf;
        EnumC500290Jjf enumC500290Jjf2 = new EnumC500290Jjf("VIDEO", 1);
        VIDEO = enumC500290Jjf2;
        EnumC500290Jjf enumC500290Jjf3 = new EnumC500290Jjf("OBS", 2);
        OBS = enumC500290Jjf3;
        EnumC500290Jjf enumC500290Jjf4 = new EnumC500290Jjf("GAME", 3);
        GAME = enumC500290Jjf4;
        EnumC500290Jjf enumC500290Jjf5 = new EnumC500290Jjf("END", 4);
        END = enumC500290Jjf5;
        EnumC500290Jjf enumC500290Jjf6 = new EnumC500290Jjf("AUDIENCE", 5);
        AUDIENCE = enumC500290Jjf6;
        EnumC500290Jjf enumC500290Jjf7 = new EnumC500290Jjf("LIVE_STUDIO_MONITOR", 6);
        LIVE_STUDIO_MONITOR = enumC500290Jjf7;
        EnumC500290Jjf enumC500290Jjf8 = new EnumC500290Jjf("LIVE_VOICE", 7);
        LIVE_VOICE = enumC500290Jjf8;
        EnumC500290Jjf[] enumC500290JjfArr = {enumC500290Jjf, enumC500290Jjf2, enumC500290Jjf3, enumC500290Jjf4, enumC500290Jjf5, enumC500290Jjf6, enumC500290Jjf7, enumC500290Jjf8};
        LL = enumC500290JjfArr;
        LLILLJJLI = new C2254308sP(enumC500290JjfArr);
    }

    public static EnumC500290Jjf[] values() {
        return (EnumC500290Jjf[]) LL.clone();
    }

    public final void config() {
        DataChannelGlobal.LLILZ.HQ2(BroadcastPageChannel.class, this);
    }

    public final boolean isAudience() {
        return this == AUDIENCE;
    }

    public final boolean isEndPage() {
        return this == END;
    }

    public final boolean isGamePage() {
        return this == GAME;
    }

    public final boolean isOBSPage() {
        return this == OBS;
    }

    public final boolean isPreviewPage() {
        return this == PREVIEW;
    }

    public final boolean isVideoPage() {
        return this == VIDEO;
    }

    public final boolean isVoiceChatPage() {
        return this == LIVE_VOICE;
    }

    public final boolean isBroadCastPage() {
        return isVideoPage() || isGamePage() || isOBSPage() || isVoiceChatPage();
    }

    public static EnumC500290Jjf valueOf(String str) {
        return (EnumC500290Jjf) C08FF.LIZ(EnumC500290Jjf.class, str);
    }

    public EnumC500290Jjf(String str, int i) {
    }
}
