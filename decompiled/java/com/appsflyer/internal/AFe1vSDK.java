package com.appsflyer.internal;

import X.C13LQ;
import X.C2095008Iq;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes14.dex */
public final class AFe1vSDK {
    public static final Pair<Integer, Integer> valueOf(String str) {
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        String str2;
        String str3;
        String str4;
        MatchResult matchResultMatchEntire = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").matchEntire(str);
        if (matchResultMatchEntire != null) {
            MatchGroup matchGroupLJ = matchResultMatchEntire.getGroups().LJ(1);
            if (matchGroupLJ != null && (str4 = matchGroupLJ.LIZ) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str4);
            } else {
                numLJIIJJI = null;
            }
            MatchGroup matchGroupLJ2 = matchResultMatchEntire.getGroups().LJ(3);
            if (matchGroupLJ2 != null && (str3 = matchGroupLJ2.LIZ) != null) {
                numLJIIJJI2 = C2095008Iq.LJIIJJI(str3);
            } else {
                numLJIIJJI2 = null;
            }
            MatchGroup matchGroupLJ3 = matchResultMatchEntire.getGroups().LJ(4);
            if (matchGroupLJ3 != null && (str2 = matchGroupLJ3.LIZ) != null) {
                numLJIIJJI3 = C2095008Iq.LJIIJJI(str2);
            } else {
                numLJIIJJI3 = null;
            }
            if (numLJIIJJI != null) {
                return new Pair<>(Integer.valueOf(numLJIIJJI.intValue() * 1000000), Integer.valueOf(((numLJIIJJI.intValue() + 1) * 1000000) - 1));
            }
            if (numLJIIJJI2 != null && numLJIIJJI3 != null) {
                return new Pair<>(Integer.valueOf((numLJIIJJI2.intValue() * 1000000) + (numLJIIJJI3.intValue() * LSPassThroughRecordSizeConfig.DEFAULT)), Integer.valueOf(((numLJIIJJI2.intValue() * 1000000) + ((numLJIIJJI3.intValue() + 1) * LSPassThroughRecordSizeConfig.DEFAULT)) - 1));
            }
        }
        return null;
    }

    public static final Pair<Integer, Integer> values(String str) {
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        Integer numLJIIJJI3;
        Integer numLJIIJJI4;
        Integer numLJIIJJI5;
        Integer numLJIIJJI6;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        MatchResult matchResultMatchEntire = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").matchEntire(str);
        if (matchResultMatchEntire != null) {
            MatchGroup matchGroupLJ = matchResultMatchEntire.getGroups().LJ(1);
            if (matchGroupLJ != null && (str7 = matchGroupLJ.LIZ) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str7);
            } else {
                numLJIIJJI = null;
            }
            MatchGroup matchGroupLJ2 = matchResultMatchEntire.getGroups().LJ(2);
            if (matchGroupLJ2 != null && (str6 = matchGroupLJ2.LIZ) != null) {
                numLJIIJJI2 = C2095008Iq.LJIIJJI(str6);
            } else {
                numLJIIJJI2 = null;
            }
            MatchGroup matchGroupLJ3 = matchResultMatchEntire.getGroups().LJ(3);
            if (matchGroupLJ3 != null && (str5 = matchGroupLJ3.LIZ) != null) {
                numLJIIJJI3 = C2095008Iq.LJIIJJI(str5);
            } else {
                numLJIIJJI3 = null;
            }
            MatchGroup matchGroupLJ4 = matchResultMatchEntire.getGroups().LJ(4);
            if (matchGroupLJ4 != null && (str4 = matchGroupLJ4.LIZ) != null) {
                numLJIIJJI4 = C2095008Iq.LJIIJJI(str4);
            } else {
                numLJIIJJI4 = null;
            }
            MatchGroup matchGroupLJ5 = matchResultMatchEntire.getGroups().LJ(5);
            if (matchGroupLJ5 != null && (str3 = matchGroupLJ5.LIZ) != null) {
                numLJIIJJI5 = C2095008Iq.LJIIJJI(str3);
            } else {
                numLJIIJJI5 = null;
            }
            MatchGroup matchGroupLJ6 = matchResultMatchEntire.getGroups().LJ(6);
            if (matchGroupLJ6 != null && (str2 = matchGroupLJ6.LIZ) != null) {
                numLJIIJJI6 = C2095008Iq.LJIIJJI(str2);
            } else {
                numLJIIJJI6 = null;
            }
            if (values(numLJIIJJI, numLJIIJJI2, numLJIIJJI3, numLJIIJJI4, numLJIIJJI5, numLJIIJJI6)) {
                return new Pair<>(Integer.valueOf((numLJIIJJI.intValue() * 1000000) + (numLJIIJJI2.intValue() * LSPassThroughRecordSizeConfig.DEFAULT) + numLJIIJJI3.intValue()), Integer.valueOf((numLJIIJJI4.intValue() * 1000000) + (numLJIIJJI5.intValue() * LSPassThroughRecordSizeConfig.DEFAULT) + numLJIIJJI6.intValue()));
            }
        }
        return null;
    }

    public static boolean values(Object... objArr) {
        if (C13LQ.LJJIJIIJI(null, objArr) < 0) {
            return true;
        }
        return false;
    }

    public static final String AFKeystoreWrapper(String str, String str2) {
        String str3 = "";
        for (byte b : MessageDigest.getInstance(str2).digest(str.getBytes(Charsets.UTF_8))) {
            str3 = str3 + C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        }
        return str3;
    }
}
