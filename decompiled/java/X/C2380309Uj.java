package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09Uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2380309Uj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0X52<?> LL;
    public final /* synthetic */ C1494690ozz LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380309Uj(int i, C1494690ozz c1494690ozz, C0X52 c0x52, String str, String str2, Map map) {
        super(0);
        this.LL = c0x52;
        this.LLILLJJLI = c1494690ozz;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String path;
        n nVar;
        n nVarLJJIJ;
        k kVarLJJIIZ;
        String strLJIL;
        C0X52<?> c0x52 = this.LL;
        if (c0x52 != null) {
            C1018703yb.LIZLLL("rd_tiktokec_network", new C2380609Um(this.LLILLL, this.LLILZ, c0x52, this.LLILZIL, c0x52.LIZ.LJFF, this.LLILZLL));
        } else {
            C1494690ozz c1494690ozz = this.LLILLJJLI;
            if (c1494690ozz != null) {
                String requestLog = c1494690ozz.getRequestLog();
                String host = null;
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, requestLog, (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) ? new TypeToken<n>() { // from class: X.09Uk
                    }.getType() : C2371409Qy.LIZJ(C13LE.LJII(n.class)));
                    if (!(objFromJson instanceof n)) {
                        objFromJson = null;
                    }
                    nVar = (n) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (nVar == null || (nVarLJJIJ = nVar.LJJIJ("base")) == null || (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("origin_url")) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                    path = null;
                } else {
                    URL url = new URL(strLJIL);
                    path = url.getPath();
                    host = url.getHost();
                }
                C1018703yb.LIZLLL("rd_tiktokec_network", new C2380509Ul(this.LLILLL, this.LLILZ, path, this.LLILZIL, host, this.LLILLJJLI, this.LLILLJJLI.getRequestInfo(), this.LLILZLL));
            } else {
                C1018703yb.LIZLLL("rd_tiktokec_network", new C2380109Uh(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
            }
        }
        return Unit.LIZ;
    }
}
