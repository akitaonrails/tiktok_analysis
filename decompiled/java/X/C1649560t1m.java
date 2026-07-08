package X;

import Y.ACListenerS159S0100000_25;
import Y.AObjectS246S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import dtj.u7;
import irm.AkS92S0100000_25;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import u4.q0;

/* JADX INFO: renamed from: X.0t1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649560t1m extends Scene {
    public final C1649570t1n LLJI;
    public final C1DRG LLJIJIL;
    public C21408118qF LLJILJIL;
    public TextView LLJILJILJ;
    public View LLJILLL;
    public ViewOnTouchListenerC1649580t1o LLJJ;
    public View LLJJI;
    public ImageView LLJJIII;
    public final int LLJJIJI = C366700EZg.LIZIZ(40.0d, C0CHQ.LIZ);
    public long LLJJIJIIJIL;

    public final void LLLII() {
        if (this.LLJI.LIZ().cameraComponentModel.isRetakeMode) {
            int size = this.LLJI.LIZ().LJI().size();
            C579640MoM.LIZ.getClass();
            C0LAB c0labLIZ = C579640MoM.LIZ();
            c0labLIZ.LIZ(size, "videoSegment");
            C20684815ws.LJIILLIIL("back_to_video_trim", c0labLIZ.LIZ);
        }
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLJI.LIZIZ;
        if (interfaceC1648570t0B == null) {
            interfaceC1648570t0B = null;
        }
        interfaceC1648570t0B.Ak().LIZIZ();
        InterfaceC1648570t0B interfaceC1648570t0B2 = this.LLJI.LIZIZ;
        (interfaceC1648570t0B2 != null ? interfaceC1648570t0B2 : null).Db2("ftc click go next");
        if (u7.LJ()) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ(Scene.SCENE_SERVICE, "go_edit");
            c0lab.LJ("shoot_way", this.LLJI.LIZ().shootWay);
            c0lab.LJ("creation_id", this.LLJI.LIZ().getCreationId());
            c0lab.LJ("enter_from", this.LLJI.LIZ().enterFrom);
            C1699250uJv.LLILLL.getClass();
            c0lab.LIZIZ(0L, "dalvikPss");
            c0lab.LIZIZ(0L, "nativePss");
            c0lab.LIZIZ(0L, "otherPss");
            c0lab.LIZIZ(0L, "totalPss");
            C20684815ws.LJIILLIIL("av_memory_log", c0lab.LIZ);
        }
        ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJ(this.LLJI.LIZ());
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = this.LLJJ;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        int i = viewOnTouchListenerC1649580t1o.LLJJJJ;
        if (i != -1) {
            viewOnTouchListenerC1649580t1o.LLILZIL = i;
            viewOnTouchListenerC1649580t1o.LLJJJJ = -1;
            viewOnTouchListenerC1649580t1o.invalidate();
        }
        viewOnTouchListenerC1649580t1o.setHasBeenMoveScaled(false);
        viewOnTouchListenerC1649580t1o.LLLIIIIL.p2();
        int i2 = viewOnTouchListenerC1649580t1o.LLILZ;
        if (i2 == 3 || i2 == 2) {
            viewOnTouchListenerC1649580t1o.LJIIIIZZ(4);
        }
        viewOnTouchListenerC1649580t1o.LLLIIIIL.oH();
        viewOnTouchListenerC1649580t1o.LLJLILLLLZIIL = System.currentTimeMillis();
        viewOnTouchListenerC1649580t1o.invalidate();
    }

    public final void LLLIIIIL(long j) {
        long j2 = j - this.LLJJIJIIJIL;
        if (1 <= j2 && j2 < 1000 && j < this.LLJI.LIZ().LJIILIIL()) {
            return;
        }
        this.LLJJIJIIJIL = j;
        int i = (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        int i2 = i % 60;
        int i3 = (i - i2) / 60;
        TextView textView = this.LLJILJILJ;
        if (textView == null) {
            textView = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
        sbLIZ.append(':');
        sbLIZ.append(C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJILJIL = (C21408118qF) requireViewById(R.id.s9p);
        this.LLJILJILJ = (TextView) requireViewById(R.id.tv_progress);
        C385670FAf<Boolean> c385670FAf = this.LLJI.LJIIJJI;
        if (c385670FAf != null) {
            c385670FAf.LIZ(this, new AObjectS246S0100000_25(this, 98));
        }
        C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> c385670FAf2 = this.LLJI.LJ;
        ImageView imageView = null;
        if (c385670FAf2 == null) {
            c385670FAf2 = null;
        }
        c385670FAf2.LIZ(this, new AObjectS246S0100000_25(this, 99));
        C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf3 = this.LLJI.LJFF;
        if (c385670FAf3 == null) {
            c385670FAf3 = null;
        }
        c385670FAf3.LIZ(this, new AObjectS246S0100000_25(this, 100));
        C385670FAf<Long> c385670FAf4 = this.LLJI.LIZLLL;
        if (c385670FAf4 == null) {
            c385670FAf4 = null;
        }
        c385670FAf4.LIZ(this, new AObjectS246S0100000_25(this, 101));
        C385670FAf<RetakeVideoContext> c385670FAf5 = this.LLJI.LJII;
        if (c385670FAf5 == null) {
            c385670FAf5 = null;
        }
        c385670FAf5.LIZ(this, new AObjectS246S0100000_25(this, 102));
        C385670FAf<Pair<List<TimeSpeedModelExtension>, Long>> c385670FAf6 = this.LLJI.LJIIIIZZ;
        if (c385670FAf6 == null) {
            c385670FAf6 = null;
        }
        c385670FAf6.LIZ(this, new AObjectS246S0100000_25(this, 103));
        C385670FAf<C443120HZe<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> c385670FAf7 = this.LLJI.LJIIIZ;
        if (c385670FAf7 == null) {
            c385670FAf7 = null;
        }
        c385670FAf7.LIZ(this, new AObjectS246S0100000_25(this, 104));
        C385670FAf<Integer> c385670FAf8 = this.LLJI.LJI;
        if (c385670FAf8 == null) {
            c385670FAf8 = null;
        }
        c385670FAf8.LIZ(this, new AObjectS246S0100000_25(this, 105));
        C385670FAf<Boolean> c385670FAf9 = this.LLJI.LJIIJ;
        if (c385670FAf9 == null) {
            c385670FAf9 = null;
        }
        c385670FAf9.LIZ(this, new AObjectS246S0100000_25(this, 106));
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o = (ViewOnTouchListenerC1649580t1o) requireViewById(R.id.ste);
        this.LLJJ = viewOnTouchListenerC1649580t1o;
        if (viewOnTouchListenerC1649580t1o == null) {
            viewOnTouchListenerC1649580t1o = null;
        }
        viewOnTouchListenerC1649580t1o.setObjectContainer(this.LLJIJIL);
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o2 = this.LLJJ;
        if (viewOnTouchListenerC1649580t1o2 == null) {
            viewOnTouchListenerC1649580t1o2 = null;
        }
        q0.LJIJ(viewOnTouchListenerC1649580t1o2, new C786390Ut3(2));
        if (this.LLJI.LIZ().isPhotoMvMode) {
            ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o3 = this.LLJJ;
            if (viewOnTouchListenerC1649580t1o3 == null) {
                viewOnTouchListenerC1649580t1o3 = null;
            }
            viewOnTouchListenerC1649580t1o3.LJIIL();
        }
        this.LLJILLL = requireViewById(R.id.p8t);
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o4 = this.LLJJ;
        if (viewOnTouchListenerC1649580t1o4 == null) {
            viewOnTouchListenerC1649580t1o4 = null;
        }
        viewOnTouchListenerC1649580t1o4.setActivity(this.mActivity);
        C19EG c19eg = (C19EG) this.mActivity;
        C1649570t1n c1649570t1n = this.LLJI;
        InterfaceC1650230t2r interfaceC1650230t2r = c1649570t1n.LIZ;
        if (interfaceC1650230t2r == null) {
            interfaceC1650230t2r = null;
        }
        InterfaceC1648570t0B interfaceC1648570t0B = c1649570t1n.LIZIZ;
        if (interfaceC1648570t0B == null) {
            interfaceC1648570t0B = null;
        }
        ViewOnTouchListenerC1649580t1o viewOnTouchListenerC1649580t1o5 = this.LLJJ;
        if (viewOnTouchListenerC1649580t1o5 == null) {
            viewOnTouchListenerC1649580t1o5 = null;
        }
        new C1648470t01(c19eg, interfaceC1650230t2r, interfaceC1648570t0B, viewOnTouchListenerC1649580t1o5, new ACListenerS159S0100000_25(this, 3));
        C385670FAf<Boolean> c385670FAf10 = this.LLJI.LJIIL;
        if (c385670FAf10 != null) {
            c385670FAf10.LIZ(this, new AObjectS246S0100000_25(this, 95));
        }
        C385670FAf<ScaleGestureDetector> c385670FAf11 = this.LLJI.LJIILIIL;
        if (c385670FAf11 != null) {
            c385670FAf11.LIZ(this, new AObjectS246S0100000_25(this, 96));
        }
        C385670FAf<InterfaceC21645719nT> c385670FAf12 = this.LLJI.LJIILJJIL;
        if (c385670FAf12 != null) {
            c385670FAf12.LIZ(this, new AObjectS246S0100000_25(this, 97));
        }
        this.LLJJI = requireViewById(R.id.leb);
        this.LLJJIII = (ImageView) requireViewById(R.id.csc);
        View view = this.LLJJI;
        if (view == null) {
            view = null;
        }
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 4), view);
        ImageView imageView2 = this.LLJJIII;
        if (imageView2 != null) {
            imageView = imageView2;
        }
        C786410Ut5.Q7(imageView, new AkS92S0100000_25(this, 1));
    }

    public C1649560t1m(C1649570t1n c1649570t1n, C1DRG c1drg) {
        this.LLJI = c1649570t1n;
        this.LLJIJIL = c1drg;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.cc_, viewGroup, false);
    }
}
