package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.DrawerLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS13S0120000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19iG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21613419iG implements InterfaceC752360TfG, InterfaceC487330J9f {
    public final C19EG LL;
    public final FragmentManager LLILLJJLI;
    public final View LLILLL;
    public String LLILZ = "";
    public final HashMap<String, C21613619iI> LLILZIL = new HashMap<>();
    public final HashSet<InterfaceC21613819iK> LLILZLL = new HashSet<>();
    public FrameLayout LLIZ;
    public DrawerLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public Configuration LLJJIII;
    public C21613519iH LLJJIJI;

    @Override // X.InterfaceC752360TfG
    public final void LIZJ() {
    }

    @Override // X.InterfaceC752360TfG
    public final int LIZLLL() {
        DrawerLayout drawerLayout = this.LLIZLLLIL;
        if (drawerLayout == null || !drawerLayout.LJIIJ()) {
            return 0;
        }
        return LJIIZILJ(false);
    }

    @Override // X.InterfaceC752360TfG
    public final View LJ() {
        FrameLayout frameLayout = this.LLIZ;
        return frameLayout == null ? this.LLILLL : frameLayout;
    }

    @Override // X.InterfaceC752360TfG
    public final boolean LJII() {
        DrawerLayout drawerLayout = this.LLIZLLLIL;
        return (drawerLayout != null && drawerLayout.LJIIJ()) || this.LLJIJIL != 0.0f;
    }

    @Override // X.InterfaceC752360TfG
    public final void LJIIIIZZ() {
        C1616660sAi.LIZIZ(this.LL, null);
    }

    @Override // X.InterfaceC752360TfG
    public final boolean LJIIJJI() {
        C1909520zn4.LIZIZ("commentSplit", "isSectionAvaiable");
        if (C1616660sAi.LIZ(this.LL, this.LLJJIII)) {
            return true;
        }
        C1909520zn4.LIZIZ("commentSplit", "isSectionAvaiable no");
        return false;
    }

    @Override // X.InterfaceC752360TfG
    public final boolean LJI() {
        C21586419du c21586419du;
        if (!LJII()) {
            return false;
        }
        this.LLJJ = false;
        this.LLJJI = true;
        DrawerLayout drawerLayout = this.LLIZLLLIL;
        if (drawerLayout != null && (c21586419du = drawerLayout.LLJL) != null) {
            c21586419du.LIZ.LIZIZ(8388613, false);
        }
        return true;
    }

    @Override // X.InterfaceC752360TfG
    public final boolean LJIILL() {
        C21586419du c21586419du;
        boolean z = false;
        if (LJII()) {
            this.LLJJ = false;
            this.LLJJI = false;
            DrawerLayout drawerLayout = this.LLIZLLLIL;
            z = true;
            if (drawerLayout != null && (c21586419du = drawerLayout.LLJL) != null) {
                c21586419du.LIZ.LIZIZ(8388613, true);
            }
        }
        return z;
    }

    public final void LJIJI() {
        int i;
        if (LJII()) {
            this.LLILZIL.get("");
            i = 2;
        } else {
            i = 0;
        }
        DrawerLayout drawerLayout = this.LLIZLLLIL;
        if (drawerLayout != null) {
            drawerLayout.setSplitDragType(i);
        }
    }

    @Override // X.InterfaceC752360TfG
    public final String LJIILJJIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC752360TfG
    public final void LIZ(InterfaceC21613819iK interfaceC21613819iK) {
        this.LLILZLL.add(interfaceC21613819iK);
    }

    @Override // X.InterfaceC752360TfG
    public final void LJFF(C0T44 c0t44) {
        LJIIIIZZ();
    }

    @Override // X.InterfaceC752360TfG
    public final InterfaceC739440SzW LJIIIZ(String str) {
        if (this.LLILLJJLI.LJJJJZI(str) != null) {
            return this.LLILZIL.get(str);
        }
        return null;
    }

    @Override // X.InterfaceC752360TfG
    public final void LJIIL(InterfaceC21613819iK interfaceC21613819iK) {
        this.LLILZLL.remove(interfaceC21613819iK);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.19iM] */
    @Override // X.InterfaceC752360TfG
    public final void LJIILIIL(InterfaceC21613719iJ interfaceC21613719iJ) {
        ?? r4 = new InterfaceC21613919iL() { // from class: X.19iM
            public boolean LIZ;

            @Override // X.InterfaceC21613919iL
            public final void block() {
                this.LIZ = true;
            }

            @Override // X.InterfaceC21613919iL
            public final void reset() {
                this.LIZ = false;
            }

            @Override // X.InterfaceC21613919iL
            public final void resume() {
                this.LIZ = false;
            }

            @Override // X.InterfaceC21613919iL
            public final boolean LIZ() {
                return this.LIZ;
            }
        };
        String strXC = interfaceC21613719iJ.xC();
        C1909520zn4.LIZIZ("commentSplit", "addSection tag: " + strXC);
        Fragment fragmentWb = interfaceC21613719iJ.wb();
        if (this.LLILLJJLI.LJJJJZI(strXC) == null) {
            C1909520zn4.LIZIZ("commentSplit", "addSection begin add");
            C19EH c19ehLJIIJ = this.LLILLJJLI.LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.etb, fragmentWb, strXC);
            c19ehLJIIJ.LJIIJ();
            this.LLILZ = strXC;
            this.LLILZIL.put(strXC, new C21613619iI(interfaceC21613719iJ, r4));
            interfaceC21613719iJ.ED(this.LLJILJIL, this.LLJILJILJ);
            LJIJI();
            DrawerLayout drawerLayout = this.LLIZLLLIL;
            if (drawerLayout != null) {
                drawerLayout.addOnLayoutChangeListener(new C0IDP(new AwS13S0120000_33(this, true, false, 0), 6));
            }
        }
    }

    public final void LJIILLIIL(float f) {
        View childAt;
        int width;
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null && (childAt = frameLayout.getChildAt(0)) != null) {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (f == 0.0f) {
                layoutParams.width = -1;
            } else {
                DrawerLayout drawerLayout = this.LLIZLLLIL;
                if (drawerLayout != null && (width = drawerLayout.getWidth()) > 0) {
                    layoutParams.width = (int) (width - (LJIIZILJ(false) * f));
                }
            }
            C786410Ut5.W5(childAt, layoutParams);
            childAt.requestLayout();
        }
    }

    public final int LJIIZILJ(boolean z) {
        if (Intrinsics.LJFF(this.LLILZ, "comment_page_tablet_new") && z) {
            DrawerLayout drawerLayout = this.LLIZLLLIL;
            if (drawerLayout == null) {
                return 0;
            }
            return drawerLayout.getWidth();
        }
        C21613619iI c21613619iI = this.LLILZIL.get(this.LLILZ);
        if (c21613619iI == null) {
            return 0;
        }
        return c21613619iI.LIZJ;
    }

    public final boolean LJIJ(String str) {
        FragmentManager fragmentManager = this.LLILLJJLI;
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        boolean z = false;
        for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
            if (C13LP.LJJJJ(fragment.getTag(), this.LLILZIL.keySet())) {
                if (Intrinsics.LJFF(fragment.getTag(), str)) {
                    if (fragment.isAdded()) {
                        c19ehLJIIJ.LJJIFFI(fragment);
                        z = true;
                    }
                } else if (fragment.isAdded()) {
                    c19ehLJIIJ.LJIILL(fragment);
                }
            }
        }
        c19ehLJIIJ.LJIIJ();
        if (z) {
            this.LLILZ = str;
        }
        return z;
    }

    @Override // X.InterfaceC752360TfG
    public final boolean LIZIZ(String str, boolean z) {
        boolean z2;
        DrawerLayout drawerLayout;
        C21586419du c21586419du;
        C1909520zn4.LIZIZ("commentSplit", "tryOpenSection");
        if (!C1616660sAi.LIZ(this.LL, this.LLJJIII)) {
            C1909520zn4.LIZIZ("commentSplit", "tryOpenSection no");
            return false;
        }
        C1909520zn4.LIZIZ("commentSplit", "openSection");
        if (LJIIJJI()) {
            DrawerLayout drawerLayout2 = this.LLIZLLLIL;
            if (drawerLayout2 != null && drawerLayout2.LJIIJ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && Intrinsics.LJFF(this.LLILZ, str)) {
                C1909520zn4.LIZIZ("commentSplit", "openSection no");
                if (z) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(1, "is_open");
                    C20684815ws.LJIILLIIL("comment_split_click_comment_icon", c2344009Gk.LIZ);
                    LJIILL();
                }
            } else {
                if (z) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LIZJ(0, "is_open");
                    C20684815ws.LJIILLIIL("comment_split_click_comment_icon", c2344009Gk2.LIZ);
                }
                if (LJIJ(str) && (drawerLayout = this.LLIZLLLIL) != null && (c21586419du = drawerLayout.LLJL) != null) {
                    DrawerLayout drawerLayout3 = c21586419du.LIZ;
                    View viewLJ = drawerLayout3.LJ(8388613);
                    if (viewLJ != null) {
                        drawerLayout3.LJIILL(viewLJ, true);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("No drawer view found with gravity ");
                        sbLIZ.append(C21587019e0.LIZ(8388613));
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
        if (this.LLIZLLLIL == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC752360TfG
    public final void LJIIJ(int i, int i2) {
        this.LLJILJIL = i;
        this.LLJILJILJ = i2;
        Iterator<Map.Entry<String, C21613619iI>> it2 = this.LLILZIL.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZ.ED(i, i2);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        boolean z;
        C21586419du c21586419du;
        C21586419du c21586419du2;
        if (!Intrinsics.LJFF(this.LL, activity)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigurationChanged lastCloseManually: ");
        sbLIZ.append(this.LLJILLL);
        C1909520zn4.LIZIZ("commentSplit", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII = configuration;
        LJIJI();
        C1616660sAi.LIZIZ(activity, configuration);
        this.LLJJ = true;
        this.LLJJI = false;
        DrawerLayout drawerLayout = this.LLIZLLLIL;
        if (drawerLayout != null && drawerLayout.LJIIJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DrawerLayout drawerLayout2 = this.LLIZLLLIL;
            if (drawerLayout2 != null && (c21586419du2 = drawerLayout2.LLJL) != null) {
                c21586419du2.LIZ.LIZIZ(8388613, false);
                return;
            }
            return;
        }
        DrawerLayout drawerLayout3 = this.LLIZLLLIL;
        if (drawerLayout3 == null || (c21586419du = drawerLayout3.LLJL) == null) {
            return;
        }
        c21586419du.LIZ.LIZIZ(8388613, true);
    }

    public C21613419iG(C19EG c19eg, FragmentManager fragmentManager, View view, boolean z) {
        this.LL = c19eg;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = view;
        new HashMap();
        C487280J9a.LIZ(c19eg.hashCode(), this);
        FrameLayout frameLayout = (FrameLayout) C786410Ut5.Sd(R.layout.fja, C786410Ut5.ne(view.getContext()), null);
        this.LLIZ = frameLayout;
        this.LLJ = (FrameLayout) frameLayout.findViewById(R.id.erf);
        this.LLJI = (FrameLayout) this.LLIZ.findViewById(R.id.etb);
        this.LLIZLLLIL = (DrawerLayout) this.LLIZ.findViewById(R.id.g_x);
        FrameLayout frameLayout2 = this.LLJ;
        if (frameLayout2 != null) {
            frameLayout2.addView(view);
        }
        C21613519iH c21613519iH = new C21613519iH(this);
        this.LLJJIJI = c21613519iH;
        DrawerLayout drawerLayout = this.LLIZLLLIL;
        if (drawerLayout != null) {
            if (drawerLayout.LLJJIJIIJIL == null) {
                drawerLayout.LLJJIJIIJIL = new ArrayList();
            }
            ((ArrayList) drawerLayout.LLJJIJIIJIL).add(c21613519iH);
        }
        C1616660sAi.LIZIZ(c19eg, null);
    }
}
