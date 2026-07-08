package X;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.18EK, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EK {
    public Boolean LIZIZ;
    public ViewPager LJFF;
    public boolean LJII;
    public String LIZ = "";
    public int LIZJ = 1;
    public final List<String> LIZLLL = new ArrayList();
    public PageFinder LJ = new PageFinder();
    public int LJI = -1;
    public int LJIIIIZZ = 10;
    public Set<? extends EnumC20164613vA> LJIIIZ = C08CX.INSTANCE;
    public Map<String, Object> LJIIJ = new LinkedHashMap();

    public final boolean LIZ() {
        Boolean bool = this.LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BtmItem(btm='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', _enterPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterPageTimes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetPagesBtm=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
