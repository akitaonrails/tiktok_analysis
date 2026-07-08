package X;

import android.net.Uri;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixStreamWaterMarkTask;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0jgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1290300jgK {
    public final C2181271AYj LIZ;
    public final CopyOnWriteArrayList<String> LIZIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<MixStreamWaterMarkTask> LIZJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C1276750jKT> LIZLLL = new CopyOnWriteArrayList<>();
    public final C01GW LJ;
    public C2181291AYl LJFF;
    public boolean LJI;

    public abstract List<C1276750jKT> LIZJ();

    public final Pair<Integer, Integer> LIZLLL() {
        return this.LIZ.LJI.LJJJJJ();
    }

    public AbstractC1290300jgK(C2181271AYj c2181271AYj) {
        this.LIZ = c2181271AYj;
        new Pair(0, 0);
        this.LJ = C452501pT.LIZIZ(new C1290310jgL());
    }

    public static EnumC1276730jKR LIZ(EnumC1276740jKS enumC1276740jKS) {
        if (C1276770jKV.LIZ[enumC1276740jKS.ordinal()] == 1) {
            return EnumC1276730jKR.ALTERNATE_IMAGE_HIDDEN_MODE;
        }
        return EnumC1276730jKR.ALTERNATE_IMAGE_FILL_MODE;
    }

    public static String LIZIZ(String str) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(500);
        sbLIZ.append('_');
        sbLIZ.append(800);
        builderBuildUpon.appendQueryParameter("pp_sourcecrop", C2188811AlT.LIZIZ(sbLIZ));
        return builderBuildUpon.toString();
    }

    public static void LJ(String str) {
        C20441214yg.LIZIZ("water_mark_opt", str);
    }

    public final void LJFF(String str) {
        this.LIZIZ.clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExtraWaterMark bgUrl ");
        sbLIZ.append(str);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (str.length() > 0) {
            this.LIZIZ.add(str);
        }
        LJI("setExtraWaterMark", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1290300jgK.LJI(java.lang.String, boolean):void");
    }
}
