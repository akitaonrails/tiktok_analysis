package X;

/* JADX INFO: renamed from: X.0jIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275520jIU {
    public EnumC1275530jIV LIZ = EnumC1275530jIV.CHANNEL_STATE_NONE;

    public final synchronized void LIZ(EnumC1275530jIV enumC1275530jIV) {
        try {
            try {
                try {
                    int i = C1275540jIW.LIZ[enumC1275530jIV.ordinal()];
                    if (i == 1) {
                        try {
                            EnumC1275530jIV enumC1275530jIV2 = this.LIZ;
                            try {
                                try {
                                    if (enumC1275530jIV2 != EnumC1275530jIV.CHANNEL_STATE_NONE) {
                                        try {
                                            if (enumC1275530jIV2 != EnumC1275530jIV.CHANNEL_STATE_LEAVE_CHANNEL) {
                                                try {
                                                    if (enumC1275530jIV2 == EnumC1275530jIV.CHANNEL_STATE_LEAVE_CHANNEL_SUCCESS) {
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    this.LIZ = enumC1275530jIV;
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        if (i != 2) {
                            if (i == 3 || i == 4) {
                                try {
                                    EnumC1275530jIV enumC1275530jIV3 = this.LIZ;
                                    try {
                                        if (enumC1275530jIV3 != EnumC1275530jIV.CHANNEL_STATE_JOIN_CHANNEL) {
                                            try {
                                                if (enumC1275530jIV3 == EnumC1275530jIV.CHANNEL_STATE_JOIN_CHANNEL_SUCCESS) {
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                throw th;
                                            }
                                        }
                                        try {
                                            this.LIZ = enumC1275530jIV;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            }
                        }
                        try {
                            try {
                                if (this.LIZ == EnumC1275530jIV.CHANNEL_STATE_JOIN_CHANNEL) {
                                    try {
                                        this.LIZ = enumC1275530jIV;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
            } catch (Throwable th14) {
                th = th14;
            }
        } catch (Throwable th15) {
            th = th15;
        }
    }
}
