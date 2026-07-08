package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance;

import X.C098200Yq;
import X.C0GZC;
import X.C0UDD;
import X.C1119920fFW;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20337914i1;
import X.C421620Gg4;
import X.C438590HHt;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C916490ZxP;
import X.C917100ZyO;
import X.C923810a9D;
import X.C923820a9E;
import X.C924790aAn;
import X.C930540aK4;
import X.C940770aaZ;
import X.C945730aiZ;
import X.InterfaceC934710aQn;
import X.InterfaceC937900aVw;
import X.InterfaceC954180awC;
import X.ViewTreeObserverOnPreDrawListenerC987020bnA;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2CloseEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenPlayerLayoutIntroPageEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class LetsDancePreviewFragment extends LiveBaseFragment implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZzw8KywtJSgyJSBiJSonOyEtJyw2ZgkpPTwXKSsvLB8hLTMlLDgVOiQrJCo9PA==";
    public DataChannel LL;
    public FrameLayout LLILLJJLI;
    public SurfaceView LLILLL;
    public C421620Gg4 LLILZ;
    public C16FS LLILZIL;
    public ViewTreeObserverOnPreDrawListenerC987020bnA LLILZLL;
    public C0GZC LLIZ;
    public final String LLIZLLLIL;

    public LetsDancePreviewFragment() {
        this.LLIZLLLIL = C930540aK4.LIZJ() ? "anchorSurfaceView" : "guestSurfaceView";
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        boolean z;
        boolean z2;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        ViewTreeObserverOnPreDrawListenerC987020bnA viewTreeObserverOnPreDrawListenerC987020bnA;
        super.onDestroy();
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = this.LL;
        c945730aiZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "close");
        C945730aiZ.LJII(dataChannel, "livesdk_multi_dance_start_page", linkedHashMap);
        FrameLayout frameLayout4 = this.LLILLJJLI;
        ViewTreeObserver viewTreeObserver = frameLayout4 != null ? frameLayout4.getViewTreeObserver() : null;
        int iIntValue = 0;
        if (viewTreeObserver != null && viewTreeObserver.isAlive() && (viewTreeObserverOnPreDrawListenerC987020bnA = this.LLILZLL) != null) {
            C786410Ut5.D3(viewTreeObserver, viewTreeObserverOnPreDrawListenerC987020bnA);
        }
        this.LLILZLL = null;
        C0GZC c0gzc = this.LLIZ;
        if (c0gzc != null && (frameLayout3 = this.LLILLJJLI) != null) {
            frameLayout3.removeOnLayoutChangeListener(c0gzc);
        }
        this.LLIZ = null;
        SurfaceView surfaceView = this.LLILLL;
        if (this.LLILLJJLI != null && surfaceView != null && surfaceView.getParent() != null && (frameLayout2 = this.LLILLJJLI) != null) {
            C786410Ut5.LJJJZ(surfaceView, frameLayout2);
        }
        C421620Gg4 c421620Gg4 = this.LLILZ;
        if (c421620Gg4 != null && this.LLILLJJLI != null && c421620Gg4.getParent() != null && (frameLayout = this.LLILLJJLI) != null) {
            C786410Ut5.LJJJZ(c421620Gg4, frameLayout);
        }
        C421620Gg4 c421620Gg42 = this.LLILZ;
        if (c421620Gg42 != null) {
            c421620Gg42.cancelAnimation();
        }
        this.LLILZ = null;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LJJJJI(this.LLIZLLLIL);
        }
        if (C930540aK4.LIZJ()) {
            C940770aaZ.LIZ().getAction().LIZLLL(new C917100ZyO("AnchorLetsDanceReviewDialog", String.valueOf(System.currentTimeMillis())));
        } else {
            MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ != null) {
                z = multiGuestDataHolderLIZJ.LJIIJ;
                z2 = multiGuestDataHolderLIZJ.LJIILL;
            } else {
                z = false;
                z2 = false;
            }
            int i = C924790aAn.LIZLLL().LJ;
            LiveEffect liveEffect = C924790aAn.LIZLLL().LJFF;
            C0UDD c0udd = new C0UDD(C924790aAn.LIZLLL().LJII, C924790aAn.LIZLLL().LJII);
            if (multiGuestDataHolderLIZJ != null && (mutableLiveData = multiGuestDataHolderLIZJ.LJIJ) != null && (value = mutableLiveData.getValue()) != null) {
                iIntValue = value.intValue();
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(MultiGuestV3PreviewPanelV2CloseEvent.class, new C923820a9E(new C923810a9D(false, z, z2, i, liveEffect, c0udd, iIntValue), Boolean.FALSE, null));
            }
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Oc;
        if (c20337914i1.LIZIZ().booleanValue()) {
            return;
        }
        c20337914i1.LJFF(Boolean.TRUE);
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            dataChannel3.FQ2(MultiLetsDanceOpenPlayerLayoutIntroPageEvent.class);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.e1v) {
            C438590HHt.LIZ(this);
            return;
        }
        if (id != R.id.mm5) {
            return;
        }
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = this.LL;
        c945730aiZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "click");
        C945730aiZ.LJII(dataChannel, "livesdk_multi_dance_start_page", linkedHashMap);
        C438590HHt.LIZ(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = this.LL;
        c945730aiZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "show");
        C945730aiZ.LJII(dataChannel, "livesdk_multi_dance_start_page", linkedHashMap);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.rpx);
        this.LLILLJJLI = frameLayout;
        C0GZC c0gzc = C0GZC.LL;
        this.LLIZ = c0gzc;
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener(c0gzc);
        }
        this.LLILZIL = (C16FS) view.findViewById(R.id.mm5);
        View viewFindViewById = view.findViewById(R.id.e1v);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIL(this, viewFindViewById);
        }
        C16FS c16fs = this.LLILZIL;
        if (c16fs != null) {
            C500260Jjc.LJLIIL(this, c16fs);
        }
        C16FS c16fs2 = this.LLILZIL;
        if (c16fs2 != null) {
            C16F5 c16f5 = c16fs2.LLILZIL;
            if (c16f5 != null) {
                c16f5.setTypeface(C1119920fFW.LIZIZ(OppoPermissionPopupMaskDelayExp.DEFAULT, 128));
            } else {
                SparseIntArray sparseIntArray = C1119920fFW.LIZ;
            }
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            ViewTreeObserverOnPreDrawListenerC987020bnA viewTreeObserverOnPreDrawListenerC987020bnA = new ViewTreeObserverOnPreDrawListenerC987020bnA(this, frameLayout2, 0);
            this.LLILZLL = viewTreeObserverOnPreDrawListenerC987020bnA;
            C786410Ut5.y3(frameLayout2.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC987020bnA);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, LiveEndEvent.class, new AwS594S0100000_15(this, 424));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ggg, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
