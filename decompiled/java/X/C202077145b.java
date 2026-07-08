package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.145b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202077145b {
    public String LJ;
    public boolean LJFF;
    public final List<String> LIZ = new ArrayList();
    public final Set<String> LIZIZ = new HashSet();
    public String LIZJ = "none";
    public String LIZLLL = CardStruct.IStatusCode.DEFAULT;
    public final List<C202080145e> LJI = new ArrayList();

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cart_");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("_");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(".prof");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
