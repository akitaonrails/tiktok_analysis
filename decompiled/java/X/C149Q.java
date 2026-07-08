package X;

import com.tts.oecverify.BdTuringConfig;

/* JADX INFO: renamed from: X.149Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C149Q {
    REGION_CN(BdTuringConfig.REGION_CN),
    REGION_SINGAPOER("sg"),
    REGION_USA_EAST("va"),
    REGION_INDIA("in"),
    REGION_BOE("boe"),
    REGION_OTHER("other");

    public final String LL;

    public String getName() {
        return this.LL;
    }

    public static C149Q valueOf(String str) {
        return (C149Q) C08FF.LIZ(C149Q.class, str);
    }

    C149Q(String str) {
        this.LL = str;
    }
}
