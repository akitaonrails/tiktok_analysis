package com.bytedance.android.live.liveinteract.linkroom.toolbarsheet;

import X.C01FQ;
import X.C176600m4;
import X.C1848410yCV;
import X.C20736316Cj;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C259800zU;
import X.C418390Gar;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C923330a8R;
import X.C947720alm;
import X.C947730aln;
import X.EnumC947710all;
import X.InterfaceC302601Fg;
import X.RunnableC514801zW;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import avg.f;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplicantNumChangedForModeratorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEarFeedbackSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import mf.a;

/* JADX INFO: loaded from: classes16.dex */
public final class ToolbarMultiGuestManageSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyM6Ji4+JiA+ZjHELIOSEjJiMxKTc/ISo2PGsYJiA/KiQ+BDo/PCwLPCogPAgtJy40LRYkLConDjctLiI2JjE=";
    public final List<C947730aln> LLJLLL = new ArrayList();
    public LinearLayout LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c5r, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, android.view.View, android.widget.LinearLayout] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        Context context;
        float fLIZIZ;
        int iIntValue;
        Integer num;
        super.onViewCreated(view, bundle);
        this.LLJZ = (LinearLayout) view.findViewById(R.id.nc2);
        ArrayList<C947720alm> arrayList = new ArrayList();
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC302601FgLIZ.LJIJI());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            arrayList.add(new C947720alm(0, C497740JfY.LJIJI(2131843568), new RunnableC514801zW(this, 204), EnumC947710all.LL));
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            Object[] objArr = new Object[1];
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null && (num = (Integer) dataChannelLJ.gg0(MultiGuestApplicantNumChangedForModeratorChannel.class)) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            objArr[0] = Integer.valueOf(iIntValue);
            arrayList.add(new C947720alm(1, C497740JfY.LJIJJ(2131843399, objArr), new ARunnableS115S0100000_15(this, 220), EnumC947710all.LLILLJJLI));
        }
        if (!LiveSdkMultiGuestEarFeedbackSetting.isEnable()) {
            arrayList.add(new C947720alm(1, C497740JfY.LJIJI(2131843511), new ARunnableS115S0100000_15(this, 221), EnumC947710all.LLILLL));
        } else {
            arrayList.add(new C947720alm(1, C497740JfY.LJIJI(2131852987), new ARunnableS115S0100000_15(this, 222), EnumC947710all.LLILLL));
        }
        C259800zU c259800zU = new C259800zU();
        int i = -1;
        for (C947720alm c947720alm : arrayList) {
            if (c947720alm.LIZ != i && (context = getContext()) != null) {
                CardView cardView = new CardView(context, null);
                C786410Ut5.j6(cardView, new LinearLayout.LayoutParams(-1, -2));
                C500260Jjc.LJLJJL((int) C497740JfY.LIZIZ(8.0f), cardView);
                C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(8.0f), cardView);
                if (i == -1) {
                    fLIZIZ = C497740JfY.LIZIZ(0.0f);
                } else {
                    fLIZIZ = C497740JfY.LIZIZ(10.0f);
                }
                C500260Jjc.LJLJL((int) fLIZIZ, cardView);
                C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(0.0f), cardView);
                cardView.setCardBackgroundColor(-1);
                cardView.setRadius((int) C497740JfY.LIZIZ(12.0f));
                cardView.setCardElevation(0.0f);
                ?? linearLayout = new LinearLayout(context);
                C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                c259800zU.element = linearLayout;
                cardView.addView(linearLayout);
                LinearLayout linearLayout2 = this.LLJZ;
                if (linearLayout2 != null) {
                    linearLayout2.addView(cardView);
                }
            }
            C418390Gar c418390Gar = new C418390Gar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418390Gar);
            c418390Gar.setLayoutParams(layoutParams);
            c418390Gar.setText(c947720alm.LIZIZ);
            View.OnClickListener aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(c947720alm, 47);
            if (C1848410yCV.LIZ) {
                aCListenerS150S0100000_15 = new f(aCListenerS150S0100000_15);
            }
            a aVar = new a(aCListenerS150S0100000_15);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c418390Gar);
            }
            c418390Gar.setOnClickListener(aVar);
            ViewGroup viewGroup = (ViewGroup) c259800zU.element;
            if (viewGroup != null) {
                viewGroup.addView(c418390Gar);
            }
            ((ArrayList) this.LLJLLL).add(new C947730aln(c418390Gar, c947720alm));
            i = c947720alm.LIZ;
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.BQ2(this, MultiGuestApplicantNumChangedForModeratorChannel.class, new AwS594S0100000_15(this, 123));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdh, viewGroup, false);
    }
}
