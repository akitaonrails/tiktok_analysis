package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0R6I, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R6I implements Serializable {
    public final boolean hasNegativeAction;
    public final boolean isNudeMsg;
    public final boolean isNudityMask;
    public final boolean isSafeMode;
    public final boolean isSafetyMask;
    public final boolean isUnmaskedNudeMsg;
    public final String msgUuid;
    public final String serverMsgId;

    public final boolean isNudeMsg() {
        return this.isNudeMsg;
    }

    public final boolean isNudityMask() {
        return this.isNudityMask;
    }

    public final boolean isSafeMode() {
        return this.isSafeMode;
    }

    public final boolean isSafetyMask() {
        return this.isSafetyMask;
    }

    public final boolean isUnmaskedNudeMsg() {
        return this.isUnmaskedNudeMsg;
    }

    public C0R6I(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.msgUuid = str;
        this.serverMsgId = str2;
        this.isSafeMode = z;
        this.isSafetyMask = z2;
        this.isNudityMask = z3;
        this.isNudeMsg = z4;
        this.isUnmaskedNudeMsg = z5;
        this.hasNegativeAction = z6;
    }
}
