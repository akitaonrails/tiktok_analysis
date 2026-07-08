package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC958000b2M;
import X.C098200Yq;
import X.C0IJT;
import X.C11NZ;
import X.C11S5;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C21411718qp;
import X.C2188811AlT;
import X.C439101nJ;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C782110Um9;
import X.C785410UrT;
import X.C786410Ut5;
import X.C930940aKi;
import X.C945240ahm;
import X.C948770anT;
import X.C949990apR;
import X.C955400ayA;
import X.C958010b2N;
import X.C978980baC;
import X.InterfaceC743640TFa;
import X.InterfaceC934710aQn;
import Y.ACListenerS81S0300000_15;
import Y.AUListenerS256S0100000_6;
import Y.AcS496S0100000_15;
import Y.AfS175S0100000_6;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostViewerSuggestionsExperimentSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2UiDebugSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveCoHostInvitationTimeLimitSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostSettingsFragment extends MultiCoHostSettingContract$AbsView implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgHELIOSPGsuIDV9JCwiImE1OiQrJCo9PGsBPCMnIQYjASAgPBYpPTs6JiI/Dz0yLygpJzs=";
    public C21411718qp LLILZ;
    public C21411718qp LLILZIL;
    public C21411718qp LLILZLL;
    public C21411718qp LLIZ;
    public C21411718qp LLIZLLLIL;
    public C21411718qp LLJ;
    public C21411718qp LLJI;
    public C21411718qp LLJIJIL;
    public C21411718qp LLJILJIL;
    public View LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public LiveDialog LLJJJIL;
    public View LLJJJJ;
    public Boolean LLJJJJJIL = InterfaceC934710aQn.eb.LIZIZ();
    public Boolean LLJJJJLIIL = InterfaceC934710aQn.db.LIZIZ();
    public Boolean LLJJL = InterfaceC934710aQn.gb.LIZIZ();
    public Boolean LLJJLIIIJLLLLLLLZ = InterfaceC934710aQn.fb.LIZIZ();
    public Boolean LLJL = InterfaceC934710aQn.ob.LIZIZ();
    public Boolean LLJLIL = InterfaceC934710aQn.jb.LIZIZ();
    public Boolean LLJLILLLLZIIL = InterfaceC934710aQn.kb.LIZIZ();
    public Boolean LLJLL = InterfaceC934710aQn.mb.LIZIZ();
    public Boolean LLJLLIL = InterfaceC934710aQn.nb.LIZIZ();
    public final Map<Integer, Boolean> LLJLLL = new LinkedHashMap();
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public final List<C958010b2N> LLL;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        int iLJJI = LiveCoHostInvitationTimeLimitSettings.INSTANCE.optionMerged() ? 324 : (int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d);
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(getString(2131844060));
        c978980baC.LIZJ = iLJJI;
        c978980baC.LIZLLL = true;
        c978980baC.LIZIZ = true;
        return c978980baC;
    }

    public final void hS() {
        int i;
        Iterator it2 = ((LinkedHashMap) this.LLJLLL).values().iterator();
        loop0: while (true) {
            while (it2.hasNext()) {
                i = (((Boolean) it2.next()).booleanValue() || i != 0) ? 1 : 0;
            }
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        String strGS = gS(R.id.wtb, this.LLJJJJLIIL.booleanValue());
        String strGS2 = gS(R.id.wtd, this.LLJJLIIIJLLLLLLLZ.booleanValue());
        String strGS3 = gS(R.id.wt8, this.LLJJJJJIL.booleanValue());
        String strGS4 = gS(R.id.wt_, this.LLJJL.booleanValue());
        String strGS5 = gS(R.id.wth, this.LLJLILLLLZIIL.booleanValue());
        String strGS6 = gS(R.id.wtj, this.LLJLL.booleanValue());
        String strGS7 = gS(R.id.wtl, this.LLJLLIL.booleanValue());
        String strGS8 = gS(R.id.wtf, this.LLJL.booleanValue());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_connection_setting_close");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "if_setting");
        c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getOwnerUserId()) : null, "anchor_id");
        c474500IjALIZ.LJJII(room != null ? room.getIdStr() : null, "room_id");
        c474500IjALIZ.LJJII(strGS, "mutual_invitation_receive_status");
        c474500IjALIZ.LJJII(strGS2, "recommend_invitation_receive_status");
        c474500IjALIZ.LJJII(strGS3, "mutual_application_receive_status");
        c474500IjALIZ.LJJII(strGS4, "recommend_application_receive_status");
        c474500IjALIZ.LJJII(strGS5, "allow_invites_from_friends");
        c474500IjALIZ.LJJII(strGS6, "allow_invitations_when_offlive");
        c474500IjALIZ.LJJII(strGS7, "allow_invites_from_suggested");
        c474500IjALIZ.LJJII(strGS8, "suggestion_from_audience");
        c474500IjALIZ.LIZ();
    }

    public MultiCoHostSettingsFragment() {
        this.LLL = Collections.singletonList(new C958010b2N(C497740JfY.LJIJI(2131851611), C945240ahm.LIZLLL, C948770anT.LIZLLL() || CohostWithGuestPhase2UiDebugSetting.INSTANCE.isEnabled()));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LiveDialog liveDialog = this.LLJJJIL;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        if (!this.LLJZIJLIL) {
            hS();
        }
        this.LLILLL = null;
    }

    public final FrameLayout dS(C958010b2N c958010b2N) {
        View view = getView();
        if (view != null) {
            return (FrameLayout) view.findViewById(c958010b2N.LIZ);
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LLJLLL.put(Integer.valueOf(view.getId()), Boolean.TRUE);
        int id = view.getId();
        if (id == R.id.wt8) {
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                view2.setClickable(false);
            }
            AbstractC958000b2M abstractC958000b2M = (AbstractC958000b2M) this.LLILLL;
            if (abstractC958000b2M != null) {
                abstractC958000b2M.LJIILL(!this.LLJJJJJIL.booleanValue());
                return;
            }
            return;
        }
        if (id == R.id.wtf) {
            int id2 = view.getId();
            boolean zBooleanValue = this.LLJL.booleanValue();
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 428);
            if (!zBooleanValue) {
                awS559S0100000_15.invoke();
                return;
            }
            if (id2 != R.id.wtf) {
                return;
            }
            String strLJIJI = C497740JfY.LJIJI(2131856543);
            String strLJIJI2 = C497740JfY.LJIJI(2131856549);
            String strLJIJI3 = C497740JfY.LJIJI(2131856541);
            String strLJIJI4 = C497740JfY.LJIJI(2131856542);
            if (strLJIJI == null) {
                return;
            }
            C782110Um9 c782110Um9 = new C782110Um9(getContext());
            c782110Um9.LIZJ = strLJIJI;
            c782110Um9.LJIIIZ(strLJIJI2);
            c782110Um9.LJIILJJIL(strLJIJI4, new AcS496S0100000_15(awS559S0100000_15, 58));
            c782110Um9.LJIIJJI(strLJIJI3, new InterfaceC743640TFa() { // from class: X.0b2O
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.cancel();
                }
            });
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            C786410Ut5.E4(liveDialogLIZ);
            this.LLJJJIL = liveDialogLIZ;
            return;
        }
        if (id == R.id.wtb) {
            View view3 = this.LLJILLL;
            if (view3 != null) {
                view3.setClickable(false);
            }
            AbstractC958000b2M abstractC958000b2M2 = (AbstractC958000b2M) this.LLILLL;
            if (abstractC958000b2M2 == null) {
                return;
            }
            abstractC958000b2M2.LJIIZILJ(!this.LLJJJJLIIL.booleanValue());
            return;
        }
        if (id == R.id.wt_) {
            View view4 = this.LLJJ;
            if (view4 != null) {
                view4.setClickable(false);
            }
            AbstractC958000b2M abstractC958000b2M3 = (AbstractC958000b2M) this.LLILLL;
            if (abstractC958000b2M3 == null) {
                return;
            }
            abstractC958000b2M3.LJIJI(!this.LLJJL.booleanValue());
            return;
        }
        if (id == R.id.wtd) {
            View view5 = this.LLJJI;
            if (view5 != null) {
                view5.setClickable(false);
            }
            AbstractC958000b2M abstractC958000b2M4 = (AbstractC958000b2M) this.LLILLL;
            if (abstractC958000b2M4 == null) {
                return;
            }
            abstractC958000b2M4.LJIJJ(!this.LLJJLIIIJLLLLLLLZ.booleanValue());
            return;
        }
        if (id == R.id.wtn) {
            View view6 = this.LLJJIII;
            if (view6 != null) {
                view6.setClickable(false);
            }
            AbstractC958000b2M abstractC958000b2M5 = (AbstractC958000b2M) this.LLILLL;
            if (abstractC958000b2M5 != null) {
                abstractC958000b2M5.LJIIL(!this.LLJLIL.booleanValue());
            }
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LLIIII(this.LLJLIL.booleanValue());
            return;
        }
        if (id == R.id.wth) {
            View view7 = this.LLJJIJIIJIL;
            if (view7 != null) {
                view7.setClickable(false);
            }
            AbstractC958000b2M abstractC958000b2M6 = (AbstractC958000b2M) this.LLILLL;
            if (abstractC958000b2M6 != null) {
                abstractC958000b2M6.LJIIJJI(!this.LLJLILLLLZIIL.booleanValue());
            }
            C955400ayA c955400ayA2 = C955400ayA.LIZ;
            C955400ayA.LLIIII(this.LLJLILLLLZIIL.booleanValue());
            return;
        }
        if (id == R.id.wtj) {
            View view8 = this.LLJJIJIL;
            if (view8 != null) {
                view8.setClickable(false);
            }
            AbstractC958000b2M abstractC958000b2M7 = (AbstractC958000b2M) this.LLILLL;
            if (abstractC958000b2M7 != null) {
                abstractC958000b2M7.LJIILIIL(!this.LLJLL.booleanValue());
            }
            C955400ayA c955400ayA3 = C955400ayA.LIZ;
            C955400ayA.LLIIJLIL("allow_invitations_when_offlive", this.LLJLL.booleanValue());
            return;
        }
        if (id != R.id.wtl) {
            return;
        }
        View view9 = this.LLJJJ;
        if (view9 != null) {
            view9.setClickable(false);
        }
        AbstractC958000b2M abstractC958000b2M8 = (AbstractC958000b2M) this.LLILLL;
        if (abstractC958000b2M8 != null) {
            abstractC958000b2M8.LJIILJJIL(!this.LLJLLIL.booleanValue());
        }
        C955400ayA c955400ayA4 = C955400ayA.LIZ;
        C955400ayA.LLIIII(this.LLJLLIL.booleanValue());
    }

    public final String gS(int i, boolean z) {
        if (Intrinsics.LJFF(((LinkedHashMap) this.LLJLLL).get(Integer.valueOf(i)), Boolean.TRUE)) {
            if (z) {
                return "open";
            }
            return "close";
        }
        return "null";
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        C21411718qp c21411718qp;
        TextView textView;
        super.onViewCreated(view, bundle);
        for (C958010b2N c958010b2N : this.LLL) {
            if (!c958010b2N.LIZLLL) {
                FrameLayout frameLayoutDS = dS(c958010b2N);
                if (frameLayoutDS != null) {
                    C786410Ut5.LJZ(8, frameLayoutDS);
                }
            } else {
                FrameLayout frameLayoutDS2 = dS(c958010b2N);
                if (frameLayoutDS2 != null) {
                    C786410Ut5.LJZ(0, frameLayoutDS2);
                }
                FrameLayout frameLayoutDS3 = dS(c958010b2N);
                if (frameLayoutDS3 != null && (textView = (TextView) frameLayoutDS3.findViewById(R.id.b27)) != null) {
                    textView.setText(c958010b2N.LIZIZ);
                }
                FrameLayout frameLayoutDS4 = dS(c958010b2N);
                if (frameLayoutDS4 != null && (c21411718qp = (C21411718qp) frameLayoutDS4.findViewById(R.id.b29)) != null) {
                    c21411718qp.setChecked(c958010b2N.LIZJ.LIZJ.LIZIZ().booleanValue());
                }
                FrameLayout frameLayoutDS5 = dS(c958010b2N);
                if (frameLayoutDS5 != null && (viewFindViewById = frameLayoutDS5.findViewById(R.id.b28)) != null) {
                    C786410Ut5.I7(new ACListenerS81S0300000_15(viewFindViewById, this, c958010b2N, 14), viewFindViewById);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void PR(Throwable th, boolean z, boolean z2) {
        boolean z3;
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJIJI;
        boolean z4 = true;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLJ;
            if (c21411718qp != null) {
                if (!z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c21411718qp.setChecked(z3);
            }
            if (z) {
                z4 = false;
            }
            this.LLJL = Boolean.valueOf(z4);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void RR(Throwable th, boolean z, boolean z2) {
        boolean z3;
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJIJIIJIL;
        boolean z4 = true;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLJI;
            if (c21411718qp != null) {
                if (!z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c21411718qp.setChecked(z3);
            }
            if (z) {
                z4 = false;
            }
            this.LLJLILLLLZIIL = Boolean.valueOf(z4);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void SR(Throwable th, boolean z, boolean z2) {
        boolean z3;
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJIII;
        boolean z4 = true;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLIZLLLIL;
            if (c21411718qp != null) {
                if (!z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c21411718qp.setChecked(z3);
            }
            if (z) {
                z4 = false;
            }
            this.LLJLIL = Boolean.valueOf(z4);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void UR(Throwable th, boolean z, boolean z2) {
        boolean z3;
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJIJIL;
        boolean z4 = true;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLJIJIL;
            if (c21411718qp != null) {
                if (!z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c21411718qp.setChecked(z3);
            }
            if (z) {
                z4 = false;
            }
            this.LLJLL = Boolean.valueOf(z4);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void VR(Throwable th, boolean z, boolean z2) {
        boolean z3;
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJJ;
        boolean z4 = true;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLJILJIL;
            if (c21411718qp != null) {
                if (!z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c21411718qp.setChecked(z3);
            }
            if (z) {
                z4 = false;
            }
            this.LLJLLIL = Boolean.valueOf(z4);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void WR(Throwable th, boolean z, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLILZ;
            if (c21411718qp != null) {
                c21411718qp.setChecked(!z);
            }
            this.LLJJJJJIL = Boolean.valueOf(!z);
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LJJLL("application", !z);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void ZR(Throwable th, boolean z, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJILLL;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLILZIL;
            if (c21411718qp != null) {
                c21411718qp.setChecked(!z);
            }
            this.LLJJJJLIIL = Boolean.valueOf(!z);
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LJJLL("invitation", !z);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void aS(Throwable th, boolean z, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJ;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLILZLL;
            if (c21411718qp != null) {
                c21411718qp.setChecked(!z);
            }
            this.LLJJL = Boolean.valueOf(!z);
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LJJZ("application", !z);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void bS(Throwable th, boolean z, boolean z2) {
        if (!this.mStatusViewValid) {
            return;
        }
        View view = this.LLJJI;
        if (view != null) {
            view.setClickable(true);
        }
        if (z2) {
            C21411718qp c21411718qp = this.LLIZ;
            if (c21411718qp != null) {
                c21411718qp.setChecked(!z);
            }
            this.LLJJLIIIJLLLLLLLZ = Boolean.valueOf(!z);
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LJJZ("invitation", !z);
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        int i;
        if (LiveCoHostInvitationTimeLimitSettings.INSTANCE.optionMerged()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gjz, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gjy, viewGroup, false);
        }
        this.LLILZ = (C21411718qp) viewTd.findViewById(R.id.wt7);
        this.LLILZLL = (C21411718qp) viewTd.findViewById(R.id.wt9);
        this.LLILZIL = (C21411718qp) viewTd.findViewById(R.id.wta);
        this.LLIZ = (C21411718qp) viewTd.findViewById(R.id.wtc);
        this.LLIZLLLIL = (C21411718qp) viewTd.findViewById(R.id.wtm);
        this.LLJ = (C21411718qp) viewTd.findViewById(R.id.wte);
        this.LLJI = (C21411718qp) viewTd.findViewById(R.id.wtg);
        this.LLJIJIL = (C21411718qp) viewTd.findViewById(R.id.wti);
        this.LLJILJIL = (C21411718qp) viewTd.findViewById(R.id.wtk);
        this.LLJILJILJ = viewTd.findViewById(R.id.wt8);
        this.LLJJ = viewTd.findViewById(R.id.wt_);
        this.LLJILLL = viewTd.findViewById(R.id.wtb);
        this.LLJJI = viewTd.findViewById(R.id.wtd);
        this.LLJJIII = viewTd.findViewById(R.id.wtn);
        this.LLJJIJI = viewTd.findViewById(R.id.wtf);
        this.LLJJIJIIJIL = viewTd.findViewById(R.id.wth);
        this.LLJJIJIL = viewTd.findViewById(R.id.wtj);
        this.LLJJJ = viewTd.findViewById(R.id.wtl);
        this.LLJJJJ = viewTd.findViewById(R.id.i2r);
        C21411718qp c21411718qp = this.LLILZ;
        if (c21411718qp != null) {
            c21411718qp.setChecked(this.LLJJJJJIL.booleanValue());
        }
        C21411718qp c21411718qp2 = this.LLILZLL;
        if (c21411718qp2 != null) {
            c21411718qp2.setChecked(this.LLJJL.booleanValue());
        }
        C21411718qp c21411718qp3 = this.LLILZIL;
        if (c21411718qp3 != null) {
            c21411718qp3.setChecked(this.LLJJJJLIIL.booleanValue());
        }
        C21411718qp c21411718qp4 = this.LLIZ;
        if (c21411718qp4 != null) {
            c21411718qp4.setChecked(this.LLJJLIIIJLLLLLLLZ.booleanValue());
        }
        C21411718qp c21411718qp5 = this.LLIZLLLIL;
        if (c21411718qp5 != null) {
            c21411718qp5.setChecked(this.LLJLIL.booleanValue());
        }
        C21411718qp c21411718qp6 = this.LLJI;
        if (c21411718qp6 != null) {
            c21411718qp6.setChecked(this.LLJLILLLLZIIL.booleanValue());
        }
        C21411718qp c21411718qp7 = this.LLJIJIL;
        if (c21411718qp7 != null) {
            c21411718qp7.setChecked(this.LLJLL.booleanValue());
        }
        C21411718qp c21411718qp8 = this.LLJ;
        if (c21411718qp8 != null) {
            c21411718qp8.setChecked(this.LLJL.booleanValue());
        }
        C21411718qp c21411718qp9 = this.LLJILJIL;
        if (c21411718qp9 != null) {
            c21411718qp9.setChecked(this.LLJLLIL.booleanValue());
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJLLILLLL(this.LLJJJJLIIL.booleanValue(), this.LLJJLIIIJLLLLLLLZ.booleanValue(), this.LLJJJJJIL.booleanValue(), this.LLJJL.booleanValue(), this.LLJLILLLLZIIL.booleanValue(), this.LLJLL.booleanValue(), this.LLJLLIL.booleanValue(), this.LLJL.booleanValue());
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.I7(this, view);
        }
        View view2 = this.LLJJ;
        if (view2 != null) {
            C786410Ut5.I7(this, view2);
        }
        View view3 = this.LLJILLL;
        if (view3 != null) {
            C786410Ut5.I7(this, view3);
        }
        View view4 = this.LLJJI;
        if (view4 != null) {
            C786410Ut5.I7(this, view4);
        }
        View view5 = this.LLJJIII;
        if (view5 != null) {
            C786410Ut5.I7(this, view5);
        }
        View view6 = this.LLJJIJIIJIL;
        if (view6 != null) {
            C786410Ut5.I7(this, view6);
        }
        View view7 = this.LLJJIJIL;
        if (view7 != null) {
            C786410Ut5.I7(this, view7);
        }
        View view8 = this.LLJJIJI;
        if (view8 != null) {
            C786410Ut5.I7(this, view8);
        }
        View view9 = this.LLJJJ;
        if (view9 != null) {
            C786410Ut5.I7(this, view9);
        }
        C19GS c19gs = null;
        if (this.LLJZ) {
            View view10 = this.LLJJJJ;
            if (view10 == null) {
                view10 = null;
            }
            C11NZ.LJLJJLL(1700L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS175S0100000_6(view10, 17));
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(C497740JfY.LJFF(R.color.aak)), Integer.valueOf(C497740JfY.LJFF(R.color.a_v)));
            valueAnimatorOfObject.setDuration(200L);
            valueAnimatorOfObject.setRepeatCount(0);
            valueAnimatorOfObject.addUpdateListener(new AUListenerS256S0100000_6(view10, 129));
            valueAnimatorOfObject.start();
            this.LLJZ = false;
        }
        if (C949990apR.LJFF()) {
            C500260Jjc.LLFFF(viewTd.findViewById(R.id.i2p));
            ((TextView) viewTd.findViewById(R.id.z9e)).setText(C497740JfY.LJIJI(2131851860));
            ((TextView) viewTd.findViewById(R.id.z9f)).setText(C497740JfY.LJIJI(2131851862));
        } else {
            C500260Jjc.LJIILIIL(viewTd.findViewById(R.id.i2p));
            ((TextView) viewTd.findViewById(R.id.z9e)).setText(C497740JfY.LJIJI(2131841243));
            ((TextView) viewTd.findViewById(R.id.z9f)).setText(C497740JfY.LJIJI(2131841244));
        }
        if (!CoHostViewerSuggestionsExperimentSetting.INSTANCE.isEnable()) {
            C786410Ut5.LJLZ(8, (ViewGroup) viewTd.findViewById(R.id.i2n));
        }
        int iLJJI = (int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d);
        if (C949990apR.LJFF()) {
            i = 260;
        } else {
            i = 208;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("maxHeight: ");
        sbLIZ.append(iLJJI);
        sbLIZ.append(", totalSettingsHeight: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MultiCoHostSettingsFragment", C2188811AlT.LIZIZ(sbLIZ));
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        layoutParams.height = C439101nJ.LIZ(Math.min(iLJJI, i) + 140);
        C786410Ut5.W5(viewTd, layoutParams);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView
    public final void cS(C958010b2N c958010b2N, boolean z, boolean z2, Throwable th) {
        C21411718qp c21411718qp;
        View viewFindViewById;
        if (!this.mStatusViewValid) {
            return;
        }
        FrameLayout frameLayoutDS = dS(c958010b2N);
        if (frameLayoutDS != null && (viewFindViewById = frameLayoutDS.findViewById(R.id.b28)) != null) {
            viewFindViewById.setClickable(true);
        }
        if (z2) {
            FrameLayout frameLayoutDS2 = dS(c958010b2N);
            if (frameLayoutDS2 != null && (c21411718qp = (C21411718qp) frameLayoutDS2.findViewById(R.id.b29)) != null) {
                c21411718qp.setChecked(!z);
            }
            c958010b2N.LIZJ.LIZJ.LJFF(Boolean.valueOf(!z));
            return;
        }
        C501540Jlg.LIZJ(getContext(), th);
    }
}
