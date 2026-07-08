package X;

import com.bytedance.hybrid.spark.roma.deploy.model.ResourcePackageModel;
import com.bytedance.hybrid.spark.roma.deploy.model.SparkAppModel;
import com.bytedance.hybrid.spark.roma.deploy.model.SparkPageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2281908wr implements InterfaceC1546060qKq {
    public final SparkAppModel LIZ;
    public final SparkPageModel LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 171));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 172));
    public final C2282008ws LJ = new C2282008ws("", "", null);

    @Override // X.InterfaceC1546060qKq
    public final String getAccessKey() {
        String str = this.LIZ.details.accessKey;
        if (!a0.LJJJIL(str)) {
            return str;
        }
        return null;
    }

    public final C2282008ws LIZ(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2) {
            return this.LJ;
        }
        try {
            c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(0)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        try {
            c098200Yq2 = Integer.valueOf(CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(1)));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        Integer num2 = (Integer) obj;
        if (num != null && num2 != null) {
            ResourcePackageModel resourcePackageModel = (ResourcePackageModel) C13LP.LJJJLZIJ(num.intValue(), this.LIZ.details.packages);
            if (resourcePackageModel == null) {
                return this.LJ;
            }
            String strLIZIZ = (String) ListProtector.get(resourcePackageModel.resources, num2.intValue());
            String strLJJJLL = a0.LJJJLL("/", resourcePackageModel.publicPath);
            if (!u.LJJIIJZLJL(strLIZIZ, "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJJJLL);
            sbLIZ2.append(strLIZIZ);
            return new C2282008ws(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ, resourcePackageModel.channel);
        }
        return this.LJ;
    }

    public C2281908wr(SparkAppModel sparkAppModel, SparkPageModel sparkPageModel) {
        this.LIZ = sparkAppModel;
        this.LIZIZ = sparkPageModel;
    }
}
