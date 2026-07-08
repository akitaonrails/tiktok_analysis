package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.Map;

/* JADX INFO: renamed from: X.0SZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SZ4<T extends UISlotAssem> extends C0RUT<T> {
    public int LLIZLLLIL;
    public transient View LLJ;
    public C09AY LLJI;
    public C1163440gNi LLJIJIL = C1163440gNi.LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0<? extends android.view.ViewGroup>] */
    @Override // X.C0RUT, X.C0RUV
    public final void LIZLLL(AbstractC738140SxQ abstractC738140SxQ, Map map) {
        UISlotAssem uISlotAssem = (UISlotAssem) abstractC738140SxQ;
        super.LIZLLL(uISlotAssem, map);
        uISlotAssem.LLIZLLLIL = this.LLJI;
        uISlotAssem.LLIZ = this.LLIZLLLIL;
        uISlotAssem.bp(this.LLJIJIL);
        View view = this.LLJ;
        if (view != null) {
            uISlotAssem.Zo(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function0<? extends android.view.ViewGroup>] */
    @Override // X.C0RUT
    /* JADX INFO: renamed from: LJI */
    public final void LIZLLL(UIAssem uIAssem, Map map) {
        UISlotAssem uISlotAssem = (UISlotAssem) uIAssem;
        super.LIZLLL(uISlotAssem, map);
        uISlotAssem.LLIZLLLIL = this.LLJI;
        uISlotAssem.LLIZ = this.LLIZLLLIL;
        uISlotAssem.bp(this.LLJIJIL);
        View view = this.LLJ;
        if (view != null) {
            uISlotAssem.Zo(view);
        }
    }
}
