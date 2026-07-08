package X;

import android.view.View;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.components.base.api.IVideoCropService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E94, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0E94 extends C0EH9 {
    public AnonymousClass0956 LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    public final CutViewModel LJIILJJIL() {
        return (CutViewModel) this.LLJJ.getValue();
    }

    public final C0EGC LJIILL() {
        return (C0EGC) this.LLJJIII.getValue();
    }

    public final VideoPublishEditModel LJIILLIIL() {
        return (VideoPublishEditModel) this.LLJJI.getValue();
    }

    public final C0E5S LJIIZILJ() {
        return (C0E5S) this.LLJILJILJ.getValue();
    }

    public final void LJIJ() {
        InterfaceC361710EGb interfaceC361710EGb = (InterfaceC361710EGb) this.LLILLJJLI.LJIIL(null, InterfaceC361710EGb.class);
        if (interfaceC361710EGb != null) {
            interfaceC361710EGb.Kq2(null, null, null, Boolean.TRUE);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJILJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C343510DdN(this, null), 3);
    }

    public final void LJIJJ() {
        C372480Ej0 c372480Ej0;
        C0EGE c0ege;
        C372830EjZ c372830EjZ;
        View viewFindViewById;
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ == null) {
            return;
        }
        int measuredHeight = 0;
        c0e48LJIIJ.getPlayer().pause(false);
        C19A3 c19a3 = this.LL;
        if (c19a3 != null && (viewFindViewById = c19a3.findViewById(R.id.exu)) != null) {
            measuredHeight = viewFindViewById.getMeasuredHeight();
        }
        C19A3 c19a32 = this.LL;
        C375820EoO.LIZ(c19a3, c0e48LJIIJ, C0ESU.class, new C0E95(c0e48LJIIJ, measuredHeight + ((!(c19a32 instanceof C372480Ej0) || (c372480Ej0 = (C372480Ej0) c19a32) == null || (c0ege = c372480Ej0.LLLILZ) == null || (c372830EjZ = c0ege.LJIIJ) == null) ? C372830EjZ.LLJJJJ : c372830EjZ.getNavBarHeight())), 16);
    }

    public final void LJIJJLI() {
        C1DRG c1drg;
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ == null || (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this.LL)).LLJJI) == null) {
            return;
        }
        C375820EoO.LIZ(this.LL, c0e48LJIIJ, C0ESV.class, new C360040E9q(true, this.LL, c0e48LJIIJ, c1drg), 16);
        C0EAE c0eae = C0EAE.LIZ;
        C0EAE.LJIILIIL(LJIILLIIL(), LJIIJ(), C0E98.EP_TOOLBAR);
    }

    public final void LJIL() {
        VideoPublishEditModel videoPublishEditModelLJIILLIIL = LJIILLIIL();
        if (videoPublishEditModelLJIILLIIL != null) {
            C0E48 c0e48LJIIJ = LJIIJ();
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJIILLIIL, c0e48LJIIJ, new Pair(-1, -1));
            c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e48LJIIJ));
            C20684815ws.LJIILLIIL("cut_volume_panel_show", c0labLJFF.LIZ);
        }
        C0E48 c0e48LJIIJ2 = LJIIJ();
        if (c0e48LJIIJ2 == null) {
            return;
        }
        C375820EoO.LIZ(this.LL, c0e48LJIIJ2, C364930ESl.class, new C0E2O(c0e48LJIIJ2, "video"), 16);
    }

    public final void LJIJI(Function2<? super C363110ELl, ? super Function1<? super NLETrackSlot, Unit>, Unit> function2) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C19A3 c19a3;
        NavigationScene navigationSceneLIZ;
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ != null && (nLETrackSlotLLLLLLIL = c0e48LJIIJ.LLLLLLIL()) != null && (c19a3 = this.LL) != null && (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) != null) {
            C0EU3 c0eu3 = C0EU3.LIZ;
            C0E48 c0e48LJIIJ2 = LJIIJ();
            c0eu3.getClass();
            C0EU3.LIZ(c0e48LJIIJ2, "click_ep_video_crop");
            C19A3 c19a32 = this.LL;
            if (c19a32 != null) {
                C19EG c19eg = (C19EG) c19a32.requireActivity();
                IVideoCropService iVideoCropService = (IVideoCropService) this.LLJILLL.getValue();
                if (iVideoCropService != null) {
                    iVideoCropService.startCrop(navigationSceneLIZ, this.LL, c19eg, nLETrackSlotLLLLLLIL, LJIIJ(), new AwS441S0200000_5((Function2) function2, (Function2<? super C363110ELl, ? super Function1<? super NLETrackSlot, Unit>, Unit>) nLETrackSlotLLLLLLIL, (NLETrackSlot) 11));
                }
            }
        }
    }

    public C0E94(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg, R.id.gcw);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1542));
        this.LLJILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1277));
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(c1drg, 1534));
        this.LLJJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(391));
        this.LLJJIII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(390));
    }
}
