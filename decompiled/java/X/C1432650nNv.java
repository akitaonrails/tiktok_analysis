package X;

import Y.ACallableS427S0100000_22;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432650nNv extends AbstractC1432780nO8 {
    public final List<String> LIZLLL;
    public final C1432620nNs LJ;

    @Override // X.InterfaceC1432810nOB
    public final String LIZ() {
        return "extract_movie";
    }

    @Override // X.AbstractC1432780nO8
    public final List<C1429800nJK> LIZIZ() {
        List<String> list = this.LIZLLL;
        if (C580130Mp9.LIZ(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            C1429800nJK c1429800nJK = new C1429800nJK();
            c1429800nJK.LIZ = str;
            arrayList.add(c1429800nJK);
        }
        return arrayList;
    }

    @Override // X.AbstractC1432780nO8
    public final void LJFF(InterfaceC1432820nOC interfaceC1432820nOC) {
        super.LJFF(interfaceC1432820nOC);
        if (!AbstractC1432780nO8.LIZJ()) {
            return;
        }
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 11)).LIZLLL(new C1466860oH6((C1432870nOH) interfaceC1432820nOC, this, 10));
    }

    public C1432650nNv(CreativeInfo creativeInfo, List<String> list, C1432620nNs c1432620nNs) {
        super(creativeInfo);
        this.LIZLLL = list;
        this.LJ = c1432620nNs;
    }
}
