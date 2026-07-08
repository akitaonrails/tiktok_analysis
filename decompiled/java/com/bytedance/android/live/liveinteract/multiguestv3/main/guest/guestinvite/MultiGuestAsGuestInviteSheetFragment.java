package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite;

import X.AbstractC960460b6K;
import X.C01GW;
import X.C1117360fBO;
import X.C1119170fEJ;
import X.C1264204x6;
import X.C12ES;
import X.C1555540qa8;
import X.C16F5;
import X.C16FZ;
import X.C19EG;
import X.C20736316Cj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C475510Ikn;
import X.C497740JfY;
import X.C518340KUm;
import X.C786410Ut5;
import X.C814420VxA;
import X.C932680aNW;
import X.C932690aNX;
import X.C932700aNY;
import X.C935100aRQ;
import X.C956790b0P;
import X.InterfaceC665370Q7z;
import X.RunnableC781530UlD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAsGuestInviteSheetFragment extends LiveSheetFragment {
    public static String LLLFZ = "";
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiHELIOSZygmLTY4ZygmLTY4ICElITEpZwImJDElDjo2OzENOggmLTY4ACElITEpGic2LTEKOy40JSAiPQ==";
    public RunnableC781530UlD LLJLLL;
    public C518340KUm LLJZIJLIL;
    public C16FZ LLL;
    public C16F5 LLLF;
    public C935100aRQ LLLFF;
    public final C1117360fBO LLJZ = new C1117360fBO();
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(92));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(uS() ? 2131854524 : 2131852854));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final boolean uS() {
        return ((Boolean) this.LLLFFI.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C935100aRQ c935100aRQ = this.LLLFF;
        if (c935100aRQ != null) {
            c935100aRQ.release();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long lValueOf;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IGuestInviteAbility iGuestInviteAbility;
        GuestInviteViewModel viewModel;
        Room room;
        C518340KUm c518340KUm;
        View viewFindViewById;
        View viewFindViewById2;
        super.onViewCreated(view, bundle);
        this.LLL = (C16FZ) view.findViewById(R.id.nnp);
        this.LLLF = (C16F5) view.findViewById(R.id.p_6);
        if (uS()) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.fpl);
            } else {
                viewFindViewById = null;
            }
            if (viewFindViewById != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.ezn);
                viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
                C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 16);
            }
            View view3 = getView();
            if (view3 != null && (viewFindViewById2 = view3.findViewById(R.id.jl0)) != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ezn);
                viewFindViewById2.setBackground(c384050F3z2.LIZ(view.getContext()));
            }
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvk);
            recyclerView.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ezn, recyclerView.getContext()));
            recyclerView.setItemAnimator(null);
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null) {
            C19EG activity = getActivity();
            if (activity != null) {
                c518340KUm = new C518340KUm(room, activity, dataChannelLJ);
            } else {
                c518340KUm = null;
            }
            this.LLJZIJLIL = c518340KUm;
        }
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.tvk);
        this.LLJLLL = runnableC781530UlD;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new SSLinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJLLL;
        if (runnableC781530UlD2 != null) {
            runnableC781530UlD2.setAdapter(this.LLJZ);
        }
        RunnableC781530UlD runnableC781530UlD3 = this.LLJLLL;
        if (runnableC781530UlD3 != null) {
            runnableC781530UlD3.LIZLLL();
        }
        if (uS()) {
            this.LLJZ.LLLI(C1264204x6.class, new AbstractC960460b6K<C1264204x6, C932700aNY>() { // from class: X.0aNa
                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new AbstractC960470b6L<C1264204x6>(C786410Ut5.Td(layoutInflater, R.layout.hd7, viewGroup, false)) { // from class: X.0aNY
                        public final C16F5 LL;

                        {
                            super(view);
                            this.LL = (C16F5) view.findViewById(R.id.tv_title);
                        }

                        @Override // X.AbstractC960470b6L
                        public final void I5(int i, Object obj) {
                            int iLIZIZ;
                            C1264204x6 c1264204x6 = (C1264204x6) obj;
                            C16F5 c16f5 = this.LL;
                            if (c16f5 != null) {
                                c16f5.setText(c1264204x6.LIZ);
                            }
                            this.itemView.setBackgroundResource(R.drawable.dk2);
                            View view4 = this.itemView;
                            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (c1264204x6.LIZIZ) {
                                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                } else {
                                    iLIZIZ = 0;
                                }
                                marginLayoutParams.topMargin = iLIZIZ;
                                C786410Ut5.W5(view4, marginLayoutParams);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    };
                }
            });
        }
        C1117360fBO c1117360fBO = this.LLJZ;
        final DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        final C518340KUm c518340KUm2 = this.LLJZIJLIL;
        final boolean zUS = uS();
        c1117360fBO.LLLI(C932680aNW.class, new AbstractC960460b6K<C932680aNW, C932690aNX>(dataChannelLJ2, c518340KUm2, zUS) { // from class: X.0aNZ
            public final DataChannel LIZIZ;
            public final C518340KUm LIZJ;
            public final boolean LIZLLL;

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C932690aNX(C786410Ut5.Td(layoutInflater, R.layout.hd8, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL);
            }

            {
                this.LIZIZ = dataChannelLJ2;
                this.LIZJ = c518340KUm2;
                this.LIZLLL = zUS;
            }
        });
        C16FZ c16fz = this.LLL;
        if (c16fz != null) {
            C12ES.LJIILL(0, c16fz);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            lValueOf = Long.valueOf(arguments.getLong("show_invite_user_id"));
        } else {
            lValueOf = null;
        }
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if (dataChannelLJ3 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannelLJ3.gg0(C956790b0P.class)) != null && (iGuestInviteAbility = (IGuestInviteAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuestInviteAbility.class, null)) != null && (viewModel = iGuestInviteAbility.getViewModel()) != null) {
            viewModel.wQ2(new AwS381S0200000_15(this, lValueOf, 35), new AwS559S0100000_15(this, 266), lValueOf);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hds, viewGroup, false);
    }
}
