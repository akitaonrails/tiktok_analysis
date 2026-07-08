package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RTB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RTB extends C0RTC<ReusedUISlotAssem<? extends C03H5>> {
    public ReusedUISlotAssem<? extends C03H5> LLJ;
    public int LLJI;
    public C1163440gNi LLJIJIL = C1163440gNi.LIZ;
    public View LLJILJIL;
    public Function0<? extends View> LLJILJILJ;

    @Override // X.C0RTC
    public final /* bridge */ /* synthetic */ ReusedAssem LIZJ() {
        return this.LLJ;
    }

    @Override // X.C0RTC
    public final void LJ(ReusedAssem reusedAssem) {
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) reusedAssem;
        reusedUISlotAssem.LLILZIL.putAll(this.LLIZLLLIL);
        reusedUISlotAssem.LLJJJ = this.LLJI;
        reusedUISlotAssem.mp(this.LLJIJIL);
        View view = this.LLJILJIL;
        if (view != null) {
            reusedUISlotAssem.LLJJI = view;
        }
        reusedUISlotAssem.LLJ = this.LLILZIL;
        reusedUISlotAssem.LLJJIJIL = this.LLJILJILJ;
        HashMap<AbstractC1155604fa<?>, C0RTG<?>> map = this.LL.LL;
        if (!map.isEmpty()) {
            reusedUISlotAssem.Zf(map);
        }
        reusedUISlotAssem.vmMapping.putAll(this.LLILLJJLI.LIZ);
    }
}
