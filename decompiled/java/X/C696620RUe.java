package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.Map;

/* JADX INFO: renamed from: X.0RUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C696620RUe<T extends UIContentAssem> extends C0RUT<T> {
    public int LLIZLLLIL;
    public transient View LLJ;

    @Override // X.C0RUT, X.C0RUV
    public final void LIZLLL(AbstractC738140SxQ abstractC738140SxQ, Map map) {
        UIContentAssem uIContentAssem = (UIContentAssem) abstractC738140SxQ;
        super.LIZLLL(uIContentAssem, map);
        uIContentAssem.LLIZ = this.LLIZLLLIL;
        View view = this.LLJ;
        if (view != null) {
            uIContentAssem.Ao(view);
        }
    }

    @Override // X.C0RUT
    /* JADX INFO: renamed from: LJI */
    public final void LIZLLL(UIAssem uIAssem, Map map) {
        UIContentAssem uIContentAssem = (UIContentAssem) uIAssem;
        super.LIZLLL(uIContentAssem, map);
        uIContentAssem.LLIZ = this.LLIZLLLIL;
        View view = this.LLJ;
        if (view != null) {
            uIContentAssem.Ao(view);
        }
    }
}
