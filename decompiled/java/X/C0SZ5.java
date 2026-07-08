package X;

import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0SZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZ5 extends C0SZ4<UISlotAssem> implements C0RTL {
    public UISlotAssem LLJILJIL;

    @Override // X.C0RUT, X.C0RUV
    public final List<UISlotAssem> LIZJ(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        List<UISlotAssem> listSingletonList;
        UISlotAssem uISlotAssem = this.LLJILJIL;
        if (uISlotAssem == null || (listSingletonList = Collections.singletonList(uISlotAssem)) == null) {
            return super.LIZJ(map);
        }
        return listSingletonList;
    }
}
