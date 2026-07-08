package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ehV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1098830ehV extends C1091250eVH {
    public String LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public InterfaceC1098840ehW LLJILJILJ;

    public void LJFF(Map<String, String> map) {
    }

    public abstract void LJI(String str);

    public void LJII() {
    }

    public void LJIIIIZZ() {
    }

    public abstract void LJIIIZ();

    public abstract void LJIIJ(String str, JSONObject jSONObject);

    public abstract void LJIIJJI(Map<String, ? extends Object> map);

    public abstract String getCardContainerId();

    public final long getEndTime() {
        return this.LLJILJIL;
    }

    public final InterfaceC1098840ehW getLoadCallback() {
        return this.LLJILJILJ;
    }

    public final String getName() {
        return this.LLJI;
    }

    public final long getStartTime() {
        return this.LLJIJIL;
    }

    public AbstractC1098830ehV(Context context) {
        super(context, null, 0);
        this.LLJI = "";
        this.LLJIJIL = -1L;
        this.LLJILJIL = -1L;
        try {
            setEnableFixedSize(true);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void setEndTime(long j) {
        this.LLJILJIL = j;
    }

    public final void setLoadCallback(InterfaceC1098840ehW interfaceC1098840ehW) {
        this.LLJILJILJ = interfaceC1098840ehW;
    }

    public final void setName(String str) {
        this.LLJI = str;
    }

    public final void setStartTime(long j) {
        this.LLJIJIL = j;
    }
}
