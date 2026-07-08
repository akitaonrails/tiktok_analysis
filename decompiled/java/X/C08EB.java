package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.08EB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EB {
    public static void LIZ(C2096108Jb c2096108Jb, String str) throws IOException {
        int length = str.length();
        StringBuilder sb = new StringBuilder(4);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (z2) {
                sb.append(cCharAt);
                if (sb.length() == 4) {
                    try {
                        c2096108Jb.write((char) CastIntegerProtector.parseInt(sb.toString(), 16));
                        sb.setLength(0);
                        z = false;
                        z2 = false;
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unable to parse unicode value: ");
                        sbLIZ.append((Object) sb);
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                } else {
                    continue;
                }
            } else if (z) {
                if (cCharAt != '\"') {
                    if (cCharAt != '\'') {
                        if (cCharAt != '\\') {
                            if (cCharAt != 'b') {
                                if (cCharAt != 'f') {
                                    if (cCharAt != 'n') {
                                        if (cCharAt != 'r') {
                                            if (cCharAt != 't') {
                                                if (cCharAt != 'u') {
                                                    c2096108Jb.write(cCharAt);
                                                } else {
                                                    z = false;
                                                    z2 = true;
                                                }
                                            } else {
                                                c2096108Jb.write(9);
                                            }
                                        } else {
                                            c2096108Jb.write(13);
                                        }
                                    } else {
                                        c2096108Jb.write(10);
                                    }
                                } else {
                                    c2096108Jb.write(12);
                                }
                            } else {
                                c2096108Jb.write(8);
                            }
                        } else {
                            c2096108Jb.write(92);
                        }
                    } else {
                        c2096108Jb.write(39);
                    }
                } else {
                    c2096108Jb.write(34);
                }
                z = false;
            } else if (cCharAt == '\\') {
                z = true;
            } else {
                c2096108Jb.write(cCharAt);
            }
        }
        if (z) {
            c2096108Jb.write(92);
        }
    }
}
