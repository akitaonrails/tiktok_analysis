package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.text.u;

/* JADX INFO: renamed from: X.15nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20626915nX {
    public final String LIZ;
    public int LIZIZ;
    public final List<AbstractC20626815nW> LIZJ = new ArrayList();

    public final List<AbstractC20626815nW> LIZIZ() {
        AbstractC20626815nW c20626715nV;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        while (this.LIZIZ < this.LIZ.length()) {
            char cCharAt4 = this.LIZ.charAt(this.LIZIZ);
            if (cCharAt4 == '\'') {
                C19719612Di.LJJIFFI(this.LIZJ, new C08LY(new C1957407lc(new C08WO(this, null)), AFwS276S0000000_31.get$arr$(253)));
            } else if (cCharAt4 != ',') {
                switch (cCharAt4) {
                    case '0':
                    case '1':
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        List<AbstractC20626815nW> list = this.LIZJ;
                        int i = this.LIZIZ;
                        int i2 = i;
                        while (i2 < this.LIZ.length() && '0' <= (cCharAt3 = this.LIZ.charAt(i2)) && cCharAt3 < ':') {
                            i2++;
                        }
                        if (i2 < this.LIZ.length() && this.LIZ.charAt(i2) == '.' && ('0' > (cCharAt2 = this.LIZ.charAt((i2 = i2 + 1))) || cCharAt2 >= ':')) {
                            throw new IllegalStateException("not a legal number!");
                        }
                        while (i2 < this.LIZ.length() && '0' <= (cCharAt = this.LIZ.charAt(i2)) && cCharAt < ':') {
                            i2++;
                        }
                        float f = CastFloatProtector.parseFloat(this.LIZ.substring(i, i2));
                        if (LIZ(i2, "dp")) {
                            i2 += 2;
                            c20626715nV = new C20627115nZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
                        } else if (LIZ(i2, "sp")) {
                            i2 += 2;
                            c20626715nV = new C20627115nZ(C418440Gaw.LJ(Float.valueOf(f)));
                        } else if (LIZ(i2, "px")) {
                            i2 += 2;
                            c20626715nV = new C20627115nZ((int) f);
                        } else if (LIZ(i2, "w")) {
                            i2++;
                            c20626715nV = new C20627015nY(CardStruct.IStatusCode.DEFAULT, f);
                        } else if (LIZ(i2, "%")) {
                            i2++;
                            c20626715nV = new C20626715nV(f / 100);
                        } else {
                            if (!LIZ(i2, ",") && i2 != this.LIZ.length()) {
                                throw new IllegalStateException("number end with unexpected token");
                            }
                            c20626715nV = new C20626715nV(f);
                        }
                        if (i2 != this.LIZ.length() && this.LIZ.charAt(i2) != ',') {
                            throw new IllegalStateException("number end with unexpected token");
                        }
                        this.LIZIZ = i2;
                        ((ArrayList) list).add(c20626715nV);
                        break;
                        break;
                    default:
                        throw new IllegalStateException("unknown config");
                }
            } else {
                ((ArrayList) this.LIZJ).add(AbstractC20626815nW.LIZ);
            }
            if (this.LIZIZ < this.LIZ.length() && this.LIZ.charAt(this.LIZIZ) != ',') {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("expect , at ");
                sbLIZ.append(this.LIZIZ);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LIZIZ++;
        }
        if (u.LJIIZILJ(this.LIZ, ",", false)) {
            ((ArrayList) this.LIZJ).add(AbstractC20626815nW.LIZ);
        }
        return this.LIZJ;
    }

    public C20626915nX(String str) {
        this.LIZ = str;
    }

    public final boolean LIZ(int i, String str) {
        if (str.length() + i > this.LIZ.length()) {
            return false;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (this.LIZ.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }
}
