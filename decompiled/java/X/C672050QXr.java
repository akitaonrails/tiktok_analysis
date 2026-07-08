package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672050QXr extends AbstractC672150QYb {
    public static final C672050QXr LIZIZ = new C672050QXr();
    public static final String LIZJ = "simple_exp";
    public static final String LIZLLL = "use_ec_container";

    @Override // X.C0QYK
    public final String LIZLLL() {
        return LIZLLL;
    }

    public static final Boolean LJI(String str) {
        boolean z;
        if (Intrinsics.LJFF(str, LIZJ)) {
            if (C293700BfE.LIZ() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 49 ? str.equals("1") : iHashCode == 48563 ? str.equals("1.0") : iHashCode == 3569038 && str.equals("true")) {
                return Boolean.TRUE;
            }
            int iHashCode2 = str.hashCode();
            if (iHashCode2 != 48) {
                if (iHashCode2 == 47602) {
                    if (!str.equals("0.0")) {
                        return null;
                    }
                } else if (iHashCode2 != 97196323 || !str.equals("false")) {
                    return null;
                }
            } else if (!str.equals(CardStruct.IStatusCode.DEFAULT)) {
                return null;
            }
            return Boolean.FALSE;
        }
        return null;
    }

    @Override // X.C0QYK
    public final /* bridge */ /* synthetic */ Boolean LIZIZ(String str) {
        return LJI(str);
    }
}
