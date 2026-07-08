package X;

import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.aigc.ResponseQuickGenerate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1242220iQm implements InterfaceC1221470htJ {
    public ResponseQuickGenerate aigcResult;
    public final List<InterfaceC1221660htc> listenerList = new ArrayList();
    public final InterfaceC497601wk coroutineScope = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 369));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.09AE] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.0hta] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.0hta] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final void LIZ() {
        int i;
        String str;
        ResponseQuickGenerate responseQuickGenerate = this.aigcResult;
        ?? r9 = 0;
        List<String> list = responseQuickGenerate != null ? responseQuickGenerate.avatarUrls : null;
        if (list == null || list.isEmpty()) {
            for (InterfaceC1221660htc interfaceC1221660htc : this.listenerList) {
                ((C09AE) this.LL.getValue()).LIZIZ(null);
                EnumC1221680hte enumC1221680hte = EnumC1221680hte.FAIL;
                ResponseQuickGenerate responseQuickGenerate2 = this.aigcResult;
                if (responseQuickGenerate2 != null) {
                    i = responseQuickGenerate2.status_code;
                    str = responseQuickGenerate2.status_msg;
                } else {
                    i = -1;
                    str = null;
                }
                interfaceC1221660htc.onUpdate(new C1221710hth(enumC1221680hte, i, str, null, 0, null, null, null, 384));
            }
            return;
        }
        for (InterfaceC1221660htc interfaceC1221660htc2 : this.listenerList) {
            ((C09AE) this.LL.getValue()).LIZIZ(r9);
            EnumC1221680hte enumC1221680hte2 = EnumC1221680hte.SUCCESS;
            ResponseQuickGenerate responseQuickGenerate3 = this.aigcResult;
            int i2 = responseQuickGenerate3 != null ? responseQuickGenerate3.status_code : -1;
            ResponseQuickGenerate responseQuickGenerate4 = this.aigcResult;
            ?? LJ = responseQuickGenerate4 != null ? responseQuickGenerate4.LJ() : r9;
            ?? r8 = r9;
            ?? r92 = r9;
            interfaceC1221660htc2.onUpdate(new C1221710hth(enumC1221680hte2, i2, r8, r92, 100, LJ, "fast", r92, 256));
            r9 = r92;
        }
    }

    @Override // X.InterfaceC1221470htJ
    public abstract /* synthetic */ void start();

    public AbstractC1242220iQm(AIGCApi aIGCApi) {
    }

    @Override // X.InterfaceC1221470htJ
    public void registerListener(InterfaceC1221660htc interfaceC1221660htc) {
        C1221640hta c1221640htaLJ;
        this.listenerList.add(interfaceC1221660htc);
        ResponseQuickGenerate responseQuickGenerate = this.aigcResult;
        if (responseQuickGenerate != null) {
            EnumC1221680hte enumC1221680hte = EnumC1221680hte.SUCCESS;
            int i = responseQuickGenerate.status_code;
            ResponseQuickGenerate responseQuickGenerate2 = this.aigcResult;
            if (responseQuickGenerate2 != null) {
                c1221640htaLJ = responseQuickGenerate2.LJ();
            } else {
                c1221640htaLJ = null;
            }
            interfaceC1221660htc.onUpdate(new C1221710hth(enumC1221680hte, i, null, null, 100, c1221640htaLJ, null, null, 384));
        }
    }

    @Override // X.InterfaceC1221470htJ
    public void unregisterListener(InterfaceC1221660htc interfaceC1221660htc) {
        this.listenerList.remove(interfaceC1221660htc);
    }
}
