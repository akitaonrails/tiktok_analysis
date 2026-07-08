package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12C3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12C3 extends Scene {
    public static final /* synthetic */ int LLJL = 0;
    public final InterfaceC19714712Bl LLJI;
    public final VideoPublishEditModel LLJIJIL;
    public final String LLJILJIL;
    public final boolean LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public final int LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxTextView LLJJJ;
    public C427660Gpo LLJJJIL;
    public TextView LLJJJJ;
    public String LLJJJJJIL;
    public C419260GcG LLJJJJLIIL;
    public Function1<? super Boolean, Unit> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 286));

    public final int LLLII(int i) {
        Integer numLIZJ;
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (numLIZJ = C1308910kAL.LIZJ(i, sceneContext)) != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int size;
        List<SingleImageData> imageList;
        super.onViewCreated(view, bundle);
        this.LLJJI = view.findViewById(R.id.w80);
        this.LLJJIII = view.findViewById(R.id.w83);
        TuxIconView tuxIconView = (TuxIconView) this.mView.findViewById(R.id.rp2);
        this.LLJJIJI = tuxIconView;
        TextView textView = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C337180DJs.LIZJ(tuxIconView);
        TuxIconView tuxIconView2 = this.LLJJIJI;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        C786410Ut5.a9(tuxIconView2, new ACListenerS163S0100000_29(this, 95));
        TuxIconView tuxIconView3 = this.LLJJIJI;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        LLLIIIIL(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue(), tuxIconView3, true);
        this.LLJJIJIIJIL = (TuxIconView) this.mView.findViewById(R.id.rpf);
        this.LLJJIJIL = (TuxIconView) this.mView.findViewById(R.id.rrw);
        TuxIconView tuxIconView4 = this.LLJJIJIIJIL;
        if (tuxIconView4 == null) {
            tuxIconView4 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
        TuxIconView tuxIconView5 = this.LLJJIJIL;
        if (tuxIconView5 == null) {
            tuxIconView5 = null;
        }
        C786410Ut5.a9(tuxIconView5, new ACListenerS163S0100000_29(this, 96));
        TuxIconView tuxIconView6 = this.LLJJIJIIJIL;
        if (tuxIconView6 == null) {
            tuxIconView6 = null;
        }
        C786410Ut5.a9(tuxIconView6, new ACListenerS163S0100000_29(this, 97));
        TuxIconView tuxIconView7 = this.LLJJIJIIJIL;
        if (tuxIconView7 == null) {
            tuxIconView7 = null;
        }
        LLLIIIIL(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue(), tuxIconView7, true);
        TuxIconView tuxIconView8 = this.LLJJIJIL;
        if (tuxIconView8 == null) {
            tuxIconView8 = null;
        }
        LLLIIIIL(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue(), tuxIconView8, true);
        C419260GcG c419260GcG = (C419260GcG) this.mView.findViewById(R.id.qen);
        this.LLJJJJLIIL = c419260GcG;
        if (c419260GcG == null) {
            c419260GcG = null;
        }
        ImageAlbumData imageAlbumData = this.LLJIJIL.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c419260GcG.setTotalNum(size);
        C419260GcG c419260GcG2 = this.LLJJJJLIIL;
        if (c419260GcG2 == null) {
            c419260GcG2 = null;
        }
        c419260GcG2.setCurrentNum(this.LLJJ + 1);
        C419260GcG c419260GcG3 = this.LLJJJJLIIL;
        if (c419260GcG3 == null) {
            c419260GcG3 = null;
        }
        LLLIIIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), c419260GcG3, true);
        C419260GcG c419260GcG4 = this.LLJJJJLIIL;
        if (c419260GcG4 == null) {
            c419260GcG4 = null;
        }
        C786410Ut5.M0(c419260GcG4, 8);
        View view2 = this.LLJJIII;
        if (view2 == null) {
            view2 = null;
        }
        LLLIIIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), view2, true);
        this.LLJJJ = (TuxTextView) this.mView.findViewById(R.id.p9k);
        this.LLJJJIL = (C427660Gpo) this.mView.findViewById(R.id.biz);
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C1464900oDw c1464900oDw = C1464900oDw.LIZ;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        Resources resources = getResources();
        c1464900oDw.getClass();
        tuxTextView.setText(C1464900oDw.LIZJ(currentUser, resources));
        C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser2 != null && currentUser2.getAvatarThumb() != null) {
            C427660Gpo c427660Gpo = this.LLJJJIL;
            if (c427660Gpo == null) {
                c427660Gpo = null;
            }
            C1324750kZt.LJI(c427660Gpo, currentUser2.getAvatarThumb(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)));
        } else {
            C427660Gpo c427660Gpo2 = this.LLJJJIL;
            if (c427660Gpo2 == null) {
                c427660Gpo2 = null;
            }
            C1324750kZt.LIZIZ(c427660Gpo2, 2130971789);
        }
        C427660Gpo c427660Gpo3 = this.LLJJJIL;
        if (c427660Gpo3 == null) {
            c427660Gpo3 = null;
        }
        LLLIIIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)), c427660Gpo3, true);
        this.LLJJJJJIL = String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (!this.LLJILJILJ) {
            TextView textView2 = (TextView) requireViewById(R.id.rpe);
            this.LLJJJJ = textView2;
            if (textView2 != null) {
                textView = textView2;
            }
            C786410Ut5.LLIL(textView, 0);
        }
    }

    public final void LLLIIIIL(int i, View view, boolean z) {
        int statusBarHeight = ScreenUtils.getStatusBarHeight(requireActivity());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i + statusBarHeight;
        C786410Ut5.W5(view, marginLayoutParams);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.e_w, viewGroup, false);
    }

    public C12C3(InterfaceC19714712Bl interfaceC19714712Bl, VideoPublishEditModel videoPublishEditModel, String str, boolean z, Function0<Unit> function0, int i) {
        this.LLJI = interfaceC19714712Bl;
        this.LLJIJIL = videoPublishEditModel;
        this.LLJILJIL = str;
        this.LLJILJILJ = z;
        this.LLJILLL = function0;
        this.LLJJ = i;
    }
}
