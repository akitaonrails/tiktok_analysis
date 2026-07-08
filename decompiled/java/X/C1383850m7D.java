package X;

import com.ss.android.ugc.aweme.model.IDanmakuData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0m7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383850m7D {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final Set<String> LIZLLL;
    public final List<String> LJ;

    public C1383850m7D(int i) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = hashSet;
        this.LJ = arrayList;
    }

    public final void LIZ(IDanmakuData iDanmakuData) {
        this.LIZ++;
        this.LIZJ++;
        Set<String> set = this.LIZLLL;
        String strX1 = iDanmakuData.x1();
        String str = "";
        if (strX1 == null) {
            strX1 = "";
        }
        if (set.add(strX1)) {
            this.LIZIZ++;
        }
        List<String> list = this.LJ;
        String strX12 = iDanmakuData.x1();
        if (strX12 != null) {
            str = strX12;
        }
        list.add(str);
    }
}
