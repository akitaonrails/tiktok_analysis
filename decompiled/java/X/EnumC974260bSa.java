package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974260bSa {
    public static final EnumC974260bSa ACCEPTED;
    public static final C974280bSc Companion;
    public static final EnumC974260bSa DRAW;
    public static final EnumC974260bSa FINISH;
    public static final EnumC974260bSa INVITED;
    public static final /* synthetic */ EnumC974260bSa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC974260bSa NONE;
    public static final EnumC974260bSa PREPARE;
    public static final EnumC974260bSa PUNISH;
    public static final EnumC974260bSa RECEIVED;
    public static final EnumC974260bSa SETTLE;
    public static final EnumC974260bSa START;
    public static final EnumC974260bSa START_FINAL_CALL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC974260bSa> getEntries() {
        return LLILLL;
    }

    public static final EnumC974260bSa getStatusFromInt(EnumC962960bAM enumC962960bAM, Integer num) {
        Companion.getClass();
        return C974280bSc.LIZ(enumC962960bAM, num);
    }

    public static final EnumC964170bCJ toMatchStatus(EnumC974260bSa enumC974260bSa) {
        Companion.getClass();
        return C974280bSc.LIZIZ(enumC974260bSa);
    }

    static {
        EnumC974260bSa enumC974260bSa = new EnumC974260bSa("NONE", 0, "none");
        NONE = enumC974260bSa;
        EnumC974260bSa enumC974260bSa2 = new EnumC974260bSa("PREPARE", 1, "prepare");
        PREPARE = enumC974260bSa2;
        EnumC974260bSa enumC974260bSa3 = new EnumC974260bSa("INVITED", 2, "invited");
        INVITED = enumC974260bSa3;
        EnumC974260bSa enumC974260bSa4 = new EnumC974260bSa("RECEIVED", 3, "received");
        RECEIVED = enumC974260bSa4;
        EnumC974260bSa enumC974260bSa5 = new EnumC974260bSa("ACCEPTED", 4, "accepted");
        ACCEPTED = enumC974260bSa5;
        EnumC974260bSa enumC974260bSa6 = new EnumC974260bSa("START", 5, "start");
        START = enumC974260bSa6;
        EnumC974260bSa enumC974260bSa7 = new EnumC974260bSa("START_FINAL_CALL", 6, "start_final_call");
        START_FINAL_CALL = enumC974260bSa7;
        EnumC974260bSa enumC974260bSa8 = new EnumC974260bSa("SETTLE", 7, "settle");
        SETTLE = enumC974260bSa8;
        EnumC974260bSa enumC974260bSa9 = new EnumC974260bSa("PUNISH", 8, LiveCenterMockToolSwitch.PUNISH);
        PUNISH = enumC974260bSa9;
        EnumC974260bSa enumC974260bSa10 = new EnumC974260bSa("DRAW", 9, "draw");
        DRAW = enumC974260bSa10;
        EnumC974260bSa enumC974260bSa11 = new EnumC974260bSa("FINISH", 10, "finish");
        FINISH = enumC974260bSa11;
        EnumC974260bSa[] enumC974260bSaArr = {enumC974260bSa, enumC974260bSa2, enumC974260bSa3, enumC974260bSa4, enumC974260bSa5, enumC974260bSa6, enumC974260bSa7, enumC974260bSa8, enumC974260bSa9, enumC974260bSa10, enumC974260bSa11};
        LLILLJJLI = enumC974260bSaArr;
        LLILLL = new C2254308sP(enumC974260bSaArr);
        Companion = new C974280bSc();
    }

    public static EnumC974260bSa[] values() {
        return (EnumC974260bSa[]) LLILLJJLI.clone();
    }

    public final boolean isAtLeastFinalCall() {
        return compareTo(START_FINAL_CALL) >= 0;
    }

    public final boolean isFinalCall() {
        return this == START_FINAL_CALL;
    }

    public final boolean isIdle() {
        return this == NONE || this == FINISH;
    }

    public final boolean isInConnectingProcess() {
        return compareTo(ACCEPTED) <= 0 && compareTo(INVITED) >= 0;
    }

    public final boolean isInProcess() {
        return compareTo(DRAW) <= 0 && compareTo(INVITED) >= 0;
    }

    public final boolean isInviting() {
        return this == INVITED;
    }

    public final boolean isPlayingExcludeResult() {
        return compareTo(SETTLE) <= 0 && compareTo(START) >= 0;
    }

    public final boolean isPlayingIncludeResult() {
        return compareTo(DRAW) <= 0 && compareTo(START) >= 0;
    }

    public final String getStatusName() {
        return this.LL;
    }

    public static final EnumC974260bSa toCompetitionBizStatus(EnumC964170bCJ enumC964170bCJ) {
        Companion.getClass();
        if (enumC964170bCJ != null) {
            switch (C974270bSb.LIZIZ[enumC964170bCJ.ordinal()]) {
            }
            return NONE;
        }
        return NONE;
    }

    public static EnumC974260bSa valueOf(String str) {
        return (EnumC974260bSa) C08FF.LIZ(EnumC974260bSa.class, str);
    }

    public EnumC974260bSa(String str, int i, String str2) {
        this.LL = str2;
    }
}
