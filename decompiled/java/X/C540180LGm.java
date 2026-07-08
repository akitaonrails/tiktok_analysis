package X;

import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS291S0000000_8;
import lth.o;

/* JADX INFO: renamed from: X.0LGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540180LGm {
    public static final C540180LGm LIZ = new C540180LGm();

    public static void LIZ(C19EG c19eg, C0LH5 c0lh5, Function0 function0, TokenCert tokenCert) {
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        AFwS291S0000000_8 aFwS291S0000000_8 = AFwS291S0000000_8.get$arr$(10);
        if (C533930Kwp.LIZIZ(strArr)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(0);
            c0lh5.LIZ(C13LP.LLII(arrayList), strArr);
        } else {
            o.LJJ.LJ().LIZ();
            C533800Kwc.LJFF(strArr, c19eg, "shoot_page", null);
            C19514711Wn.LIZIZ.LIZIZ(c19eg, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArr, 1)).LIZJ(new C581140Mqm(new C0LEH(c19eg, c0lh5, function0, aFwS291S0000000_8), 2));
        }
    }
}
