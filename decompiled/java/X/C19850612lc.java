package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19850612lc extends AbstractC19844412kc {
    public final AbstractC19851412lk LL;

    public C19850612lc(AbstractC19851412lk abstractC19851412lk) {
        this.LL = abstractC19851412lk;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{2, this.LL});
    }

    @Override // X.AbstractC19844412kc
    public final int zza() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        C19851012lg c19851012lg = AbstractC19850812le.LIZ;
        AbstractC19850812le abstractC19850812leLIZJ = c19851012lg.LIZLLL;
        if (abstractC19850812leLIZJ == null) {
            C19507211Tq c19507211Tq = c19851012lg.LIZIZ;
            char[] cArr = c19507211Tq.LIZIZ;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                char c = cArr[i];
                if (c < 'a' || c > 'z') {
                    i++;
                } else {
                    char[] cArr2 = c19507211Tq.LIZIZ;
                    int length2 = cArr2.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 65;
                        if (i2 < length2) {
                            char c2 = cArr2[i2];
                            if (c2 >= 'A' && c2 <= 'Z') {
                                throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                            }
                            i2++;
                        } else {
                            char[] cArr3 = new char[c19507211Tq.LIZIZ.length];
                            int i4 = 0;
                            while (true) {
                                char[] cArr4 = c19507211Tq.LIZIZ;
                                if (i4 >= cArr4.length) {
                                    break;
                                }
                                char c3 = cArr4[i4];
                                if (c3 >= 97 && c3 <= 122) {
                                    c3 ^= 32;
                                }
                                cArr3[i4] = (char) c3;
                                i4++;
                            }
                            C19507211Tq c19507211Tq2 = new C19507211Tq(c19507211Tq.LIZ.concat(".upperCase()"), cArr3);
                            if (!c19507211Tq.LJII || c19507211Tq2.LJII) {
                                c19507211Tq = c19507211Tq2;
                            } else {
                                byte[] bArr = c19507211Tq2.LJI;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                do {
                                    int i5 = i3 | 32;
                                    byte[] bArr2 = c19507211Tq2.LJI;
                                    byte b = bArr2[i3];
                                    byte b2 = bArr2[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i3] = b2;
                                    } else {
                                        char c4 = (char) i3;
                                        char c5 = (char) i5;
                                        if (b2 != -1) {
                                            throw new IllegalStateException(C08KQ.LIZ("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                    i3++;
                                } while (i3 <= 90);
                                c19507211Tq = new C19507211Tq(c19507211Tq2.LIZ.concat(".ignoreCase()"), c19507211Tq2.LIZIZ, bArrCopyOf, true);
                            }
                        }
                    }
                }
            }
            abstractC19850812leLIZJ = c19507211Tq == c19851012lg.LIZIZ ? c19851012lg : c19851012lg.LIZJ(c19507211Tq, c19851012lg.LIZJ);
            c19851012lg.LIZLLL = abstractC19850812leLIZJ;
        }
        byte[] bArrZzm = this.LL.zzm();
        return "h'" + abstractC19850812leLIZJ.LIZIZ(bArrZzm, bArrZzm.length) + "'";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC19844412kc abstractC19844412kc = (AbstractC19844412kc) obj;
        if (2 != abstractC19844412kc.zza()) {
            return 2 - abstractC19844412kc.zza();
        }
        C19850612lc c19850612lc = (C19850612lc) abstractC19844412kc;
        AbstractC19851412lk abstractC19851412lk = this.LL;
        int iZzd = abstractC19851412lk.zzd();
        AbstractC19851412lk abstractC19851412lk2 = c19850612lc.LL;
        if (iZzd != abstractC19851412lk2.zzd()) {
            return abstractC19851412lk.zzd() - abstractC19851412lk2.zzd();
        }
        return C08N6.LIZ.compare(abstractC19851412lk.zzm(), c19850612lc.LL.zzm());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19850612lc.class != obj.getClass()) {
            return false;
        }
        return this.LL.equals(((C19850612lc) obj).LL);
    }
}
