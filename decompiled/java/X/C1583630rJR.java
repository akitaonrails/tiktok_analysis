package X;

import Y.ARunnableS20S1200000_16;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.node.MainPageNode;
import com.ss.android.ugc.aweme.node.ProfileGroupPageNode;
import com.ss.android.ugc.aweme.node.ProfilePageNode;
import com.ss.android.ugc.aweme.node.SettingsPageNode;
import com.ss.android.ugc.aweme.node.SlidePageNode;

/* JADX INFO: renamed from: X.0rJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583630rJR extends AbstractC1583710rJZ {
    public final C19EG LLJI;

    @Override // X.AbstractC1583720rJa
    public final Bundle LJIIZILJ() {
        return null;
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return null;
    }

    @Override // X.AbstractC1583710rJZ
    public final boolean LJJII() {
        return true;
    }

    @Override // X.AbstractC1583720rJa
    public final String tag() {
        return "RootNode";
    }

    public C1583630rJR(C19EG c19eg) {
        AbstractC1583720rJa profilePageNode;
        SlidePageItem slidePageItem;
        this.LLJI = c19eg;
        if (C1585030rLh.LJJ()) {
            C1583620rJQ.LIZ.getClass();
            SlidePage slidePageLJIIIZ = C1585030rLh.LJIIIZ();
            if (slidePageLJIIIZ != null && (slidePageItem = slidePageLJIIIZ.left) != null) {
                C1583620rJQ.LIZIZ = C1583620rJQ.LIZ(c19eg, slidePageItem.landingPage);
            }
            AbstractC1583720rJa abstractC1583720rJa = C1583620rJQ.LIZIZ;
            if (abstractC1583720rJa != null) {
                LJJ(abstractC1583720rJa);
            }
        }
        if (C0AD1.LIZ()) {
            LJJ(new SlidePageNode());
        }
        LJJ(new MainPageNode(c19eg));
        if (C1585030rLh.LJJI()) {
            profilePageNode = new ProfileGroupPageNode(c19eg);
        } else {
            profilePageNode = new ProfilePageNode();
        }
        LJJ(profilePageNode);
        if (C0AD1.LIZ()) {
            LJJIIZ(new Bundle(), "page_feed");
        }
        IProfileAppDiffProtocol.LIZ.getClass();
        C1253780ijQ.LIZ().LIZJ();
        LJJ(new SettingsPageNode());
    }

    @Override // X.AbstractC1583710rJZ
    public final void LJJIIZ(Bundle bundle, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("root node switch tag, ");
        sbLIZ.append(str);
        C1581650rGF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!C1585030rLh.LJJI() && !C1585030rLh.LJJ()) {
            C486860J7k.LIZIZ(this.LLJI).kE0(str, bundle.getBoolean("isSmoothScroll", false));
        } else {
            C2487409ou.LIZJ(new ARunnableS20S1200000_16(this, bundle, str, 12));
        }
    }
}
