package X;

import com.ss.android.ugc.aweme.AnoleAutomationParamModel;
import java.util.Arrays;
import kotlin.jvm.internal.AwS6S3200000_35;

/* JADX INFO: renamed from: X.0dGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043600dGQ extends AbstractC1023470cjx {
    public static final /* synthetic */ int LJII = 0;
    public final C1022410ciF LIZ;
    public final C1023630ckD<?>[] LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;

    @Override // X.AbstractC1023360cjm
    public final AbstractC1023090cjL getAdBizScene() {
        return this.LIZ;
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZIZ;
    }

    public C1043600dGQ(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = C1022410ciF.LIZIZ;
        this.LIZIZ = new C1023630ckD[0];
    }

    public final void LJJIIZ(C1043630dGT c1043630dGT, String str, String str2, String str3) {
        this.LIZLLL = System.currentTimeMillis();
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        String str4 = c1043630dGT.LIZJ.LIZ;
        String str5 = "-1";
        if (str4 == null) {
            str4 = "-1";
        }
        String str6 = c1043630dGT.LIZ;
        c1015400cWw.getClass();
        AnoleAutomationParamModel anoleAutomationParamModelLIZ = C1015400cWw.LIZ(str4, str6);
        anoleAutomationParamModelLIZ.LIZ.put(c1043630dGT.LIZIZ, str);
        anoleAutomationParamModelLIZ.LIZJ.put(c1043630dGT.LIZIZ, "did_request");
        anoleAutomationParamModelLIZ.LIZLLL.put(c1043630dGT.LIZIZ, str3);
        C2274401E0o.LIZ.getClass();
        C1023960ckk c1023960ckk = C2274401E0o.LIZJ;
        C1029740cu4 c1029740cu4 = c1043630dGT.LIZJ;
        String str7 = c1029740cu4.LIZ;
        if (str7 != null) {
            str5 = str7;
        }
        logAd(c1023960ckk, str5, c1029740cu4.LIZIZ, c1029740cu4.LIZJ, new AwS6S3200000_35(c1043630dGT, str, str3, str2, this, 0));
    }
}
