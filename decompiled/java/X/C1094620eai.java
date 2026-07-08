package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0eai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1094620eai {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1094630eaj LIZ(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -987979858:
                if (lowerCase.equals("pitaya")) {
                    return EnumC1094630eaj.PITAYA;
                }
                break;
            case 115181:
                if (lowerCase.equals("ttm")) {
                    return EnumC1094630eaj.TTM;
                }
                break;
            case 729267099:
                if (lowerCase.equals("portrait")) {
                    return EnumC1094630eaj.PORTRAIT;
                }
                break;
            case 1021203856:
                if (lowerCase.equals("ttmainnative")) {
                    return EnumC1094630eaj.TTM_NATIVE;
                }
                break;
        }
        return EnumC1094630eaj.DEFAULT;
    }
}
