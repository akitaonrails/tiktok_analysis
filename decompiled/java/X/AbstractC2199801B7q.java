package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.depend.DownloadMonitorDepend;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1B7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2199801B7q {
    public final Context LIZ;
    public int LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public List<HttpHeader> LJI;
    public int LJII;
    public List<String> LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public IDownloadListener LJIIJJI;
    public IDownloadListener LJIIL;
    public boolean LJIILIIL;
    public EnumC565770MGx LJIILJJIL;
    public DownloadMonitorDepend LJIILL;
    public boolean LJIILLIIL;
    public String LJIIZILJ;
    public InterfaceC2199931B8d LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;

    public void LIZIZ(int i, C12Y1 c12y1, C1B72 c1b72) {
    }

    public abstract int LIZJ();

    public abstract int LIZLLL(EnumC565770MGx enumC565770MGx);

    public abstract int LJ(InterfaceC2329409Au interfaceC2329409Au);

    public final void LJFF(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new HttpHeader("x-tt-pns-dt-pass-id", String.valueOf(268959747)));
        this.LJI = arrayList;
    }

    public AbstractC2199801B7q(Context context, String str) {
        this.LIZ = context;
        this.LIZLLL = str;
    }
}
