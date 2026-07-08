package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RTA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0RTA extends C0RTC<ReusedUIContentAssem<? extends C03H5>> {
    public ReusedUIContentAssem<? extends C03H5> LLJ;
    public int LLJI;
    public int LLJIJIL;
    public View LLJILJIL;

    @Override // X.C0RTC
    public final /* bridge */ /* synthetic */ ReusedAssem LIZJ() {
        return this.LLJ;
    }

    @Override // X.C0RTC
    public final void LJ(ReusedAssem reusedAssem) {
        ReusedUIContentAssem reusedUIContentAssem = (ReusedUIContentAssem) reusedAssem;
        reusedUIContentAssem.LLILZIL.putAll(this.LLIZLLLIL);
        reusedUIContentAssem.active = Intrinsics.LJFF(this.LLILZIL, C694070RKj.LIZ);
        reusedUIContentAssem.LLJJIJIL = this.LLJI;
        reusedUIContentAssem.LLJJJ = this.LLJIJIL;
        View view = this.LLJILJIL;
        if (view != null) {
            reusedUIContentAssem.LLJJI = view;
        }
        reusedUIContentAssem.LLJ = this.LLILZIL;
        HashMap<AbstractC1155604fa<?>, C0RTG<?>> map = this.LL.LL;
        if (!map.isEmpty()) {
            reusedUIContentAssem.Zf(map);
        }
        reusedUIContentAssem.vmMapping.putAll(this.LLILLJJLI.LIZ);
    }
}
