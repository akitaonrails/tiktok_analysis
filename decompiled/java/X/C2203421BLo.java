package X;

import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1BLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203421BLo {
    public final WebView LIZ;
    public final C1BMC LIZIZ;
    public C19919812wm LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public C1BMI LJIIIIZZ;
    public boolean LJIIL;
    public String LIZJ = "IESJSBridge";
    public final Set<C1BRF> LJII = new LinkedHashSet();
    public final String LJIIIZ = "host";
    public final Set<String> LJIIJ = new LinkedHashSet();
    public final Set<String> LJIIJJI = new LinkedHashSet();
    public final List<TimeLineEvent> LJIILIIL = new CopyOnWriteArrayList();
    public final boolean LJIILJJIL = true;

    public C2203421BLo(WebView webView) {
        this.LIZ = webView;
        this.LIZIZ = new C1BMB(webView);
    }
}
