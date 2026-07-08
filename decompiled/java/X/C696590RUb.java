package X;

import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0RUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696590RUb extends C696620RUe<UIContentAssem> implements C0RTL {
    public UIContentAssem LLJI;

    @Override // X.C0RUT, X.C0RUV
    public final List<UIContentAssem> LIZJ(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        List<UIContentAssem> listSingletonList;
        UIContentAssem uIContentAssem = this.LLJI;
        if (uIContentAssem == null || (listSingletonList = Collections.singletonList(uIContentAssem)) == null) {
            return super.LIZJ(map);
        }
        return listSingletonList;
    }
}
