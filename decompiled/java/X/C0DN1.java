package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DN1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DN1 {
    public static final String[] LIZIZ = new String[0];
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2220));

    public final void LIZ(String str, C338000DMw c338000DMw) {
        String string;
        String str2;
        if (c338000DMw == null) {
            ((Keva) this.LIZ.getValue()).storeStringArray(str, LIZIZ);
            return;
        }
        Integer num = c338000DMw.LIZIZ;
        if (num == null || num.intValue() == 0 || (string = num.toString()) == null) {
            string = "";
        }
        if (Intrinsics.LJFF(c338000DMw.LIZJ, Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C0DHZ c0dhz = c338000DMw.LIZ;
        ((Keva) this.LIZ.getValue()).storeStringArray(str, new String[]{c0dhz.LIZIZ, c0dhz.LIZ, string, str2});
    }
}
