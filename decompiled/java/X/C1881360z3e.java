package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XTabESportsHighlightCard;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881360z3e extends AbstractC1882430z5N implements InterfaceC1883280z6k {
    public String LLJILJILJ;
    public List<String> LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @Override // X.AbstractC1882430z5N
    public final void LJIJJ(FragmentManager fragmentManager) {
    }

    public final void LJIL() {
        if (this.LLJJI) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_esport_xtab_first_page_trace");
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(LJIIIIZZ())));
        c474500IjALIZ.LJJII("first_page_show", "action");
        c474500IjALIZ.LIZ();
        this.LLJJI = true;
    }

    @Override // X.InterfaceC1883280z6k
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(" onFirstPageCancel");
        C20441214yg.LIZIZ("ESportsMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1883280z6k
    public final void LJFF() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(" onFirstPageStart");
        C20441214yg.LIZIZ("ESportsMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_esport_xtab_first_page_trace");
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(LJIIIIZZ())));
        c474500IjALIZ.LJJII("first_page_begin", "action");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILIIL() {
        super.LJIILIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(" onDestroy");
        C20441214yg.LIZIZ("ESportsMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        LJIIIZ().LIZIZ(this);
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(" onHide");
        C20441214yg.LIZIZ("ESportsMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(" onShow");
        C20441214yg.LIZIZ("ESportsMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJI || !this.LLJJIII) {
            return;
        }
        LJIL();
    }

    public C1881360z3e(Context context) {
        super(context, "game_esports_xtab");
        LJIIIZ().LJI().LIZIZ("esports_highlight_card", XTabESportsHighlightCard.class, null);
        C1882380z5I.LJI(LJII(), "entrance_type", "xtab");
        C1882380z5I.LJI(LJII(), Scene.SCENE_SERVICE, 0);
        LJIIIZ().LJIJI(this);
        this.LLJILJILJ = "";
        this.LLJILLL = C13BV.INSTANCE;
        this.LLJJ = "";
    }

    @Override // X.InterfaceC1883280z6k
    public final void LIZLLL(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(" onFirstPageFinish success: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("ESportsMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLIZ) {
            LJIL();
        } else {
            this.LLJJIII = true;
        }
    }

    @Override // X.AbstractC1882430z5N
    public final void LJIILL(boolean z) {
        if (!Intrinsics.LJFF(this.LLJJ, "score") && !Intrinsics.LJFF(this.LLJJ, "guess") && !Intrinsics.LJFF(this.LLJJ, "schedule")) {
            if (Intrinsics.LJFF(this.LLJJ, "highlights")) {
                C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881350z3d(this, null), 2);
                return;
            } else {
                C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881390z3h(this, null), 2);
                return;
            }
        }
        C23250099c.LIZLLL(LJIIIZ().LJIILL(), C0PEM.LIZJ, null, new C1881380z3g(this, null), 2);
    }
}
