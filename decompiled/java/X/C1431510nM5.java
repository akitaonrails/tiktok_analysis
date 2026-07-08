package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431510nM5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1431480nM2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431510nM5(C1431480nM2 c1431480nM2) {
        super(0);
        this.LL = c1431480nM2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Iterator it2 = ((LinkedHashMap) this.LL.LLJLILLLLZIIL).values().iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue += ((Number) it2.next()).intValue();
        }
        Iterator it3 = ((LinkedHashMap) this.LL.LLJLL).values().iterator();
        int iIntValue2 = 0;
        while (it3.hasNext()) {
            iIntValue2 += ((Number) it3.next()).intValue();
        }
        C1431480nM2 c1431480nM2 = this.LL;
        C1431460nM0 c1431460nM0 = c1431480nM2.LLJJIJI;
        if (c1431460nM0 == null) {
            c1431460nM0 = null;
        }
        int i = iIntValue2 + iIntValue;
        List<String> list = c1431480nM2.LLJILLL;
        if (list == null) {
            list = null;
        }
        int size = list.size();
        List<C1431550nM9> list2 = this.LL.LLJJ;
        int size2 = i / (size + (list2 != null ? list2.size() : 0));
        C1431070nLN c1431070nLN = c1431460nM0.LIZ.LLIZ;
        (c1431070nLN != null ? c1431070nLN : null).LIZIZ(new C1411860mqO(size2 / 100.0f), EnumC2251001D8o.OUTER);
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BDUploader progress: ");
        sbLIZ.append(size2);
        c1437510nVlLJJLIIIJ.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ));
        C1431480nM2 c1431480nM22 = c1431460nM0.LIZ;
        if (!c1431480nM22.LLLFF) {
            c1431480nM22.LLLFF = true;
            try {
                C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
                C1436930nUp.LIZ();
            } catch (C1431430nLx e) {
                TryCatchGuardChecker.doCheck(e);
                C1431480nM2.LJIJI(c1431480nM22, new C1434330nQd(C1431470nM1.LIZ(-88888888), e));
            }
        }
        return Unit.LIZ;
    }
}
