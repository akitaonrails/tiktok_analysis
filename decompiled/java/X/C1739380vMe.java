package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0vMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739380vMe {
    public static final void LIZ(String str, Context context, boolean z, boolean z2, C19327310jP c19327310jP, AbstractC1539010q9T abstractC1539010q9T, AbstractC1542200qEc abstractC1542200qEc, InterfaceC2217701Bqy interfaceC2217701Bqy) {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(C786410Ut5.j4("aweme://webview/?url=%s&use_spark=1&target_handler=crossPlatform", Arrays.copyOf(new Object[]{Uri.encode(str)}, 1)));
        sparkContext.LJJL("show_close_all", z);
        sparkContext.LJJL("use_webview_title", true);
        sparkContext.LJJL("show_web_url", true);
        if (z2) {
            sparkContext.LJJL("need_sec_link", true);
            sparkContext.LJJJZ("sec_link_scene", "anchor_article");
        }
        if (c19327310jP != null) {
            sparkContext.LJJLIIIJLLLLLLLZ(new C19327110jN(c19327310jP));
        }
        sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0uv0
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return new C1725480v0E(R.anim.an, 0);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return new C1725480v0E(0, R.anim.ao);
            }
        });
        if (abstractC1539010q9T != null) {
            sparkContext.LJJJJZ(abstractC1539010q9T);
        }
        if (abstractC1542200qEc != null) {
            sparkContext.LJJJJZI(abstractC1542200qEc);
        }
        if (interfaceC2217701Bqy != null) {
            sparkContext.LJJLIIIJJI(interfaceC2217701Bqy);
        }
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }
}
