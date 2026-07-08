package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.portrait.InboxPortraitCenterService;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0zYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1900570zYd {
    public final List<MusNotice> LIZ;
    public final Map<Integer, NoticeItems> LIZIZ;
    public final List<MusNotice> LIZJ;
    public final Set<String> LIZLLL;
    public final Set<Integer> LJ;
    public final List<MusNotice> LJFF;
    public final List<MusNotice> LJI;
    public final int LJII;

    public abstract boolean LIZ();

    public abstract List<MusNotice> LIZIZ();

    public abstract boolean LIZJ();

    public AbstractC1900570zYd(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = arrayList;
        this.LIZLLL = new LinkedHashSet();
        this.LJ = new LinkedHashSet();
        this.LJFF = new ArrayList();
        this.LJI = new ArrayList();
        this.LJII = InboxPortraitCenterService.LIZIZ().LIZ();
    }
}
