package com.appsflyer.internal;

import X.C2095008Iq;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes14.dex */
public final class AFc1rSDK {
    public static final int valueOf(String str) {
        int iIntValue;
        int iIntValue2;
        String str2;
        Integer numLJIIJJI;
        String str3;
        Integer numLJIIJJI2;
        String str4;
        Integer numLJIIJJI3;
        MatchResult matchResultMatchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str);
        if (matchResultMatchEntire != null) {
            MatchGroup matchGroupLJ = matchResultMatchEntire.getGroups().LJ(1);
            int iIntValue3 = 0;
            if (matchGroupLJ != null && (str4 = matchGroupLJ.LIZ) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(str4)) != null) {
                iIntValue = numLJIIJJI3.intValue();
            } else {
                iIntValue = 0;
            }
            int i = iIntValue * 1000000;
            MatchGroup matchGroupLJ2 = matchResultMatchEntire.getGroups().LJ(2);
            if (matchGroupLJ2 != null && (str3 = matchGroupLJ2.LIZ) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str3)) != null) {
                iIntValue2 = numLJIIJJI2.intValue();
            } else {
                iIntValue2 = 0;
            }
            int i2 = i + (iIntValue2 * LSPassThroughRecordSizeConfig.DEFAULT);
            MatchGroup matchGroupLJ3 = matchResultMatchEntire.getGroups().LJ(3);
            if (matchGroupLJ3 != null && (str2 = matchGroupLJ3.LIZ) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str2)) != null) {
                iIntValue3 = numLJIIJJI.intValue();
            }
            return i2 + iIntValue3;
        }
        return -1;
    }
}
