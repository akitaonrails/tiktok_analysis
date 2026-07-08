package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.AbstractC712240Rwk;
import X.C01OF;
import X.C0J8P;
import X.C13BV;
import X.C16HT;
import X.C20417614us;
import X.C20417814uu;
import X.C20418014uw;
import X.C20632315oP;
import X.C410901il;
import X.C439101nJ;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C786410Ut5;
import X.C946850akN;
import X.C951190arN;
import X.EnumC952890au7;
import X.EnumC971610bOJ;
import X.InterfaceC971790bOb;
import Y.ACListenerS165S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderGuideSheetFragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class AnchorTextHeaderGuideSheetFragment extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOSs7LSgpZzs2MDEkLC43LTdiKCEwICo+Zw49Ky0jOxs2MDEELC43LTcLPCY3LRYkLConDjctLiI2JjE=";
    public C20632315oP LLL;
    public View LLLF;
    public View LLLFF;
    public List<C20417814uu> LLLFFI;
    public final C951190arN LLLFZ;
    public int LLLI;
    public final BPEAHandler LLLII;
    public ARunnableS131S0100000_31 LLLIIII;
    public final C20417614us LLLIIIIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.dpf;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZ(Collections.singletonList(new C510160Jza(C497740JfY.LJIJI(2131854952), R.style.ajw, new C16HT(this, 1))));
        return c500060JjI;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20632315oP c20632315oP = this.LLL;
        if (c20632315oP != null) {
            c20632315oP.LJI(this.LLLIIIIL);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LLLIIII;
        if (aRunnableS131S0100000_31 != null) {
            C786410Ut5.LJLIIL(3000L, this.LLLII, aRunnableS131S0100000_31);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = this.LLLIIII;
        if (aRunnableS131S0100000_31 != null) {
            this.LLLII.removeCallbacks(aRunnableS131S0100000_31);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.14us] */
    public AnchorTextHeaderGuideSheetFragment(DataChannel dataChannel) {
        super(dataChannel);
        this.LLLFFI = C13BV.INSTANCE;
        C951190arN c951190arN = new C951190arN();
        c951190arN.LLLI(C20417814uu.class, new C0J8P<C20417814uu, C20418014uw>() { // from class: X.14uv
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C20417814uu c20417814uu) {
                C20418014uw c20418014uw = (C20418014uw) viewHolder;
                C20417814uu c20417814uu2 = c20417814uu;
                c20418014uw.getLayoutPosition();
                C972080bP4.LIZJ(c20418014uw.LL, c20417814uu2.LIZJ);
                c20418014uw.LLILLJJLI.setText(c20417814uu2.LIZ);
                c20418014uw.LLILLL.setText(c20417814uu2.LIZIZ);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20418014uw(C786410Ut5.Td(layoutInflater, R.layout.h_w, viewGroup, false));
            }
        });
        this.LLLFZ = c951190arN;
        this.LLLII = new BPEAHandler(Looper.getMainLooper());
        this.LLLIIIIL = new AbstractC712240Rwk() { // from class: X.14us
            public boolean LL = true;

            @Override // X.AbstractC712240Rwk
            public final void onPageScrollStateChanged(int i) {
                AnchorTextHeaderGuideSheetFragment anchorTextHeaderGuideSheetFragment;
                ARunnableS131S0100000_31 aRunnableS131S0100000_31;
                AnchorTextHeaderGuideSheetFragment anchorTextHeaderGuideSheetFragment2;
                ARunnableS131S0100000_31 aRunnableS131S0100000_312;
                int currentItem = 0;
                if (i != 0) {
                    if (i == 1 && (aRunnableS131S0100000_312 = (anchorTextHeaderGuideSheetFragment2 = this.LLILLJJLI).LLLIIII) != null) {
                        anchorTextHeaderGuideSheetFragment2.LLLII.removeCallbacks(aRunnableS131S0100000_312);
                        this.LL = false;
                        return;
                    }
                    return;
                }
                AnchorTextHeaderGuideSheetFragment anchorTextHeaderGuideSheetFragment3 = this.LLILLJJLI;
                C20632315oP c20632315oP = anchorTextHeaderGuideSheetFragment3.LLL;
                if (c20632315oP != null) {
                    currentItem = c20632315oP.getCurrentItem();
                }
                anchorTextHeaderGuideSheetFragment3.LLLI = currentItem;
                if (!this.LL || (aRunnableS131S0100000_31 = (anchorTextHeaderGuideSheetFragment = this.LLILLJJLI).LLLIIII) == null) {
                    return;
                }
                C786410Ut5.LJLIIL(3000L, anchorTextHeaderGuideSheetFragment.LLLII, aRunnableS131S0100000_31);
            }

            @Override // X.AbstractC712240Rwk
            public final void onPageSelected(int i) {
                if (i != 0) {
                    if (i == 1) {
                        View view = this.LLILLJJLI.LLLF;
                        if (view != null) {
                            view.setSelected(false);
                        }
                        View view2 = this.LLILLJJLI.LLLFF;
                        if (view2 != null) {
                            view2.setSelected(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                View view3 = this.LLILLJJLI.LLLF;
                if (view3 != null) {
                    view3.setSelected(true);
                }
                View view4 = this.LLILLJJLI.LLLFF;
                if (view4 == null) {
                    return;
                }
                view4.setSelected(false);
            }
        };
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void close(int i) {
        InterfaceC971790bOb interfaceC971790bObLIZIZ;
        super.close(i);
        if (i == 2 && (interfaceC971790bObLIZIZ = C01OF.LIZIZ()) != null) {
            interfaceC971790bObLIZIZ.LJIIJJI();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(3, null);
        sheetOptionsIS.canceledOnTouchOutside = false;
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
        EnumC971610bOJ enumC971610bOJ = EnumC971610bOJ.EDU;
        MultiCanvasUtils.LIZ.getClass();
        C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), enumC971610bOJ, "header");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20417814uu(C497740JfY.LJIJI(2131854344), C497740JfY.LJIJI(2131854343), "ttlive_multi_guest_text_header_guide_text_header.png"));
        arrayList.add(new C20417814uu(C497740JfY.LJIJI(2131854346), C497740JfY.LJIJI(2131854345), "ttlive_multi_guest_text_header_guide_in_spot.png"));
        this.LLLFFI = arrayList;
        this.LLLFZ.LLLII(new C410901il(this.LLLFFI));
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 31), view.findViewById(R.id.xn9));
        this.LLL = (C20632315oP) view.findViewById(R.id.xnc);
        this.LLLF = view.findViewById(R.id.xn_);
        this.LLLFF = view.findViewById(R.id.xnb);
        C20632315oP c20632315oP = this.LLL;
        if (c20632315oP != null) {
            c20632315oP.setOrientation(0);
        }
        C20632315oP c20632315oP2 = this.LLL;
        if (c20632315oP2 != null) {
            c20632315oP2.setAdapter(this.LLLFZ);
        }
        C20632315oP c20632315oP3 = this.LLL;
        if (c20632315oP3 != null) {
            c20632315oP3.LJ(0, true);
        }
        if (this.LLLFFI.size() < 2) {
            View view2 = this.LLLF;
            if (view2 != null) {
                C439101nJ.LJI(view2);
            }
            View view3 = this.LLLFF;
            if (view3 != null) {
                C439101nJ.LJI(view3);
            }
        }
        this.LLLIIII = new ARunnableS131S0100000_31(this, 24);
        C20632315oP c20632315oP4 = this.LLL;
        if (c20632315oP4 != null) {
            c20632315oP4.LIZIZ(this.LLLIIIIL);
        }
    }
}
