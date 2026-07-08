package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.ui;

import X.C1143680frq;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C11NJ;
import X.C1322110kVd;
import X.C197039127h;
import X.C20736316Cj;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import X.C915210ZvL;
import X.C946850akN;
import X.C956750b0L;
import X.EnumC752510TfV;
import X.EnumC919090a1b;
import X.EnumC919100a1c;
import X.EnumC952890au7;
import X.InterfaceC917550Zz7;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardGuideFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSHELIOSwiZzs7LSgpZyE8PCwvLC08KTcoZy49Ky0jO2EmIWsCJjs6KyAuJi4hLAI5ICs2DjctLiI2JjE=";
    public C1143920fsE LLJZ;
    public C197039127h LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public final C11NJ LLJLLL = new C11NJ();
    public boolean LLJZIJLIL = true;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannelLJ;
        C915210ZvL c915210ZvL;
        WeakReference<InterfaceC917550Zz7> weakReference;
        InterfaceC917550Zz7 interfaceC917550Zz7;
        if (this.LLJZIJLIL && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (c915210ZvL = (C915210ZvL) dataChannelLJ.gg0(C956750b0L.class)) != null && (weakReference = c915210ZvL.LJ) != null && (interfaceC917550Zz7 = weakReference.get()) != null) {
            interfaceC917550Zz7.LIZLLL(EnumC752510TfV.GUIDE, EnumC919100a1c.NORMAL);
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.SX0(C956750b0L.class, null);
        }
        this.LLJZIJLIL = true;
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1143920fsE c1143920fsE = this.LLJZ;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        this.LLJLLL.LJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c5r, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C915210ZvL c915210ZvL;
        WeakReference<InterfaceC917550Zz7> weakReference;
        InterfaceC917550Zz7 interfaceC917550Zz7;
        super.onCreate(bundle);
        this.LLJZIJLIL = true;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c915210ZvL = (C915210ZvL) dataChannelLJ.gg0(C956750b0L.class)) != null && (weakReference = c915210ZvL.LJ) != null && (interfaceC917550Zz7 = weakReference.get()) != null) {
            interfaceC917550Zz7.LIZ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLJIJI;
        String strLJIJI2;
        C915210ZvL c915210ZvL;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c915210ZvL = (C915210ZvL) dataChannelLJ.gg0(C956750b0L.class)) != null) {
            EnumC952890au7 enumC952890au7 = c915210ZvL.LIZ;
            MultiCanvasUtils.LIZ.getClass();
            C946850akN.LJIIIIZZ(MultiCanvasUtils.LJIIJJI(enumC952890au7), EnumC919090a1b.SHOW, null);
        }
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.cov), new ACListenerS150S0100000_15(this, 119));
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.d83);
        this.LLL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS150S0100000_15(this, 120));
        }
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.ljq);
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = c1322110kVd;
        c1143920fsE.LIZIZ = "tiktok_live_interaction_normal_1";
        c1143920fsE.LIZJ = "noticeboard_hint.webp";
        c1143920fsE.LJFF = true;
        c1143920fsE.LJI = Integer.MAX_VALUE;
        c1143920fsE.LJ = new C1143950fsH() { // from class: X.0afA
            public final String LIZ = "geckoWebpListener";

            @Override // X.C1143950fsH
            public final void LJ(Animatable animatable) {
                C20441214yg.LJIIIZ(this.LIZ, "startGeckoWebpController onStart");
            }

            @Override // X.C1143950fsH
            public final void LJFF(Animatable animatable) {
                C20441214yg.LJIIIZ(this.LIZ, "startGeckoWebpController onStop");
            }
        };
        this.LLJZ = c1143920fsE;
        C1143680frq.LJIIIIZZ(c1143920fsE);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLLF = tuxTextView;
        if (tuxTextView != null) {
            if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                strLJIJI2 = C497740JfY.LJIJI(2131854008);
            } else {
                strLJIJI2 = C497740JfY.LJIJI(2131854007);
            }
            tuxTextView.setText(strLJIJI2);
        }
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.tv_subtitle);
        this.LLLFF = tuxTextView2;
        if (tuxTextView2 != null) {
            if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                strLJIJI = C497740JfY.LJIJI(2131854006);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131854005);
            }
            tuxTextView2.setText(strLJIJI);
        }
        if (C497740JfY.LJJ()) {
            C197039127h c197039127h2 = this.LLL;
            if (c197039127h2 != null) {
                c197039127h2.setTextDirection(4);
            }
            TuxTextView tuxTextView3 = this.LLLF;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextDirection(4);
            }
            TuxTextView tuxTextView4 = this.LLLFF;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextDirection(4);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdm, viewGroup, false);
    }
}
