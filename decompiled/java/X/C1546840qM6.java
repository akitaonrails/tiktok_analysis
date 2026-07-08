package X;

import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.i18n.SparkI18nManager;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546840qM6 {
    public final Forest LIZ;
    public final ExecutorService LIZIZ;
    public final C1550480qRy<String, C189200o6<Pair<String, String>>> LIZJ;

    public C1546840qM6(Forest forest) {
        ExecutorService executorService = C2281108wj.LIZ;
        ExecutorService executorServiceLIZ = C2281108wj.LIZ(EnumC2281308wl.Blocked);
        this.LIZ = forest;
        this.LIZIZ = executorServiceLIZ;
        this.LIZJ = new C1550480qRy<>(new C0X9C(this), 0L, 6);
    }

    public final void LIZ(SparkI18nManager.ResDetail resDetail, String str, Function1<? super C189200o6<Pair<String, String>>, Unit> function1) {
        String strLIZIZ;
        boolean z;
        String strLIZIZ2;
        if (a0.LJJIJIIJIL(resDetail.publicPath, '/')) {
            strLIZIZ = resDetail.publicPath;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(resDetail.publicPath);
            sbLIZ.append('/');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (resDetail.fileHash.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(str);
            sbLIZ2.append(".json");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(str);
            sbLIZ3.append('.');
            sbLIZ3.append(resDetail.fileHash);
            sbLIZ3.append(".json");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        C1550480qRy<String, C189200o6<Pair<String, String>>> c1550480qRy = this.LIZJ;
        c1550480qRy.getClass();
        C259800zU c259800zU = new C259800zU();
        c1550480qRy.LIZ(strLIZIZ2, new C1550440qRu(c1550480qRy, strLIZIZ2, function1, c259800zU));
        Runnable runnable = (Runnable) c259800zU.element;
        if (runnable != null) {
            runnable.run();
        }
    }
}
