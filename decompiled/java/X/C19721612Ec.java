package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.h0;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19721612Ec extends AbstractC19721812Ee implements InterfaceC214787193x, InterfaceC523020KfE, InterfaceC19721912Ef {
    public final VideoPublishViewModel LLJI;
    public final C193M LLJIJIL;
    public AbstractC343940De4 LLJILJIL;
    public RecyclerView LLJILJILJ;
    public C19223610Io LLJILLL;
    public h0<Boolean> LLJJ;
    public C0OM1 LLJJIII;
    public List<? extends C19223110Ij> LLJJI = C13BV.INSTANCE;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1133));

    public void LLLIL() {
    }

    public Integer LLLILZ() {
        return null;
    }

    public boolean LLLJ() {
        return this instanceof C12EZ;
    }

    @Override // X.InterfaceC19721912Ef
    public final AbstractC343940De4 LJJIL() {
        AbstractC343940De4 abstractC343940De4 = this.LLJILJIL;
        this.LLJILJIL = null;
        return abstractC343940De4;
    }

    public void LLLILZLLLI() {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(SaveLocalHelper.LIZ((VideoPublishEditModel) this.LLJJIJI.getValue()) ? 1 : 0, "auto_save_status");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJJIJI.getValue();
        if (videoPublishEditModel != null) {
            C580270MpN.LIZJ(videoPublishEditModel, c0lab, "video_post_page");
            C20684815ws.LJIILLIIL("enter_more_option_page", c0lab.LIZ);
        }
    }

    public void LLLIZZ() {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(SaveLocalHelper.LIZ((VideoPublishEditModel) this.LLJJIJI.getValue()) ? 1 : 0, "auto_save_status");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJJIJI.getValue();
        if (videoPublishEditModel != null) {
            C580270MpN.LIZJ(videoPublishEditModel, c0lab, "video_post_page");
            C20684815ws.LJIILLIIL("close_more_option_page", c0lab.LIZ);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        LLLIZZ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        InterfaceC20507715Ml interfaceC20507715Ml = (InterfaceC20507715Ml) C1010170cOV.LIZIZ(InterfaceC20507715Ml.class);
        if (interfaceC20507715Ml != null) {
            interfaceC20507715Ml.onResume();
        }
    }

    @Override // X.InterfaceC214787193x
    public final void LJJLJLI(NavigationScene navigationScene) {
        C569760MWg c569760MWg = new C569760MWg();
        c569760MWg.LIZJ = new AnonymousClass1951(R.anim.a7, navigationScene.requireActivity(), R.anim.t);
        navigationScene.LLLLLLLLLL(this, c569760MWg.LIZ());
    }

    @Override // X.InterfaceC214787193x
    public final void LJLIIL(List<? extends C19223110Ij> list) {
        C19223610Io c19223610Io = this.LLJILLL;
        if (c19223610Io != null) {
            c19223610Io.LL = list;
            c19223610Io.notifyDataSetChanged();
        }
    }

    public void LLLII(View view) {
        int iIntValue;
        if (C291370BbT.LIZ()) {
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
            int iIntValue2 = 0;
            if (tuxNavBar != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, view.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                tuxNavBar.setNavBackground(iIntValue);
            }
            RecyclerView recyclerView = this.LLJILJILJ;
            if (recyclerView != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1e, view.getContext());
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                }
                recyclerView.setBackgroundColor(iIntValue2);
            }
        }
    }

    public AbstractC1250290idn LLLIIIIL(AwS573S0100000_29 awS573S0100000_29) {
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(awS573S0100000_29);
        return c1251150ifB;
    }

    public void LLLIILIL(TuxNavBar tuxNavBar) {
        tuxNavBar.LJIIZILJ(true);
    }

    public C19721612Ec(VideoPublishViewModel videoPublishViewModel, C193M c193m) {
        this.LLJI = videoPublishViewModel;
        this.LLJIJIL = c193m;
        disableSceneRestore();
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        this.LLJILJILJ = (RecyclerView) view.findViewById(R.id.b1v);
        this.LLJJ = this.LLJI.LLILZLL;
        C0OM1 c0om1 = new C0OM1();
        this.LLJJIII = c0om1;
        c0om1.LIZIZ(LLLIIIIL(new AwS573S0100000_29(this, 1132)));
        C1250250idj c1250250idj = new C1250250idj();
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (string = bundle2.getString("key_nav_bar_title")) == null) {
            string = getString(2131821947);
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        if (tuxNavBar != null) {
            C0OM1 c0om12 = this.LLJJIII;
            if (c0om12 == null) {
                c0om12 = null;
            }
            tuxNavBar.setNavActions(c0om12);
            LLLIILIL(tuxNavBar);
        }
        List<? extends C19223110Ij> list = this.LLJI.LLILZIL;
        this.LLJJI = list;
        if (list.isEmpty()) {
            RecyclerView recyclerView = this.LLJILJILJ;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
            }
        } else {
            RecyclerView recyclerView2 = this.LLJILJILJ;
            if (recyclerView2 != null) {
                C786410Ut5.p6(recyclerView2, recyclerView2.getLayoutParams());
            }
            RecyclerView recyclerView3 = this.LLJILJILJ;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(requireSceneContext()));
            }
            C19223610Io c19223610Io = new C19223610Io(this.LLJJI, this.LLJIJIL, this, LLLJ(), (VideoPublishEditModel) this.LLJJIJI.getValue());
            this.LLJILLL = c19223610Io;
            RecyclerView recyclerView4 = this.LLJILJILJ;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(c19223610Io);
            }
            LLLII(view);
            Integer numLLLILZ = LLLILZ();
            if (numLLLILZ != null) {
                int iIntValue = numLLLILZ.intValue();
                RecyclerView recyclerView5 = this.LLJILJILJ;
                if (recyclerView5 != null) {
                    C426750GoL.LJIIL(recyclerView5, null, null, null, Integer.valueOf(iIntValue), 23);
                }
            }
        }
        LLLILZLLLI();
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LLLIL();
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d6o, viewGroup, false);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.12Ed
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, viewTd);
        return viewTd;
    }
}
