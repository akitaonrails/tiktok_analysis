package com.bytedance.android.live.liveinteract.multiguestv3.main.follow;

import X.C0DXR;
import X.C11NJ;
import X.C11QJ;
import X.C16FV;
import X.C1701940uOG;
import X.C19487111Lx;
import X.C20736316Cj;
import X.C440101nT;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C930480aJy;
import X.C946790akH;
import X.C987100bnI;
import X.InterfaceC420801kM;
import X.RunnableC781530UlD;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS23S0400000_15;
import Y.ATListenerS448S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowPanelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class FollowSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImHELIOSJDElLjo2OzE6emE+KSwiZyk8JCkjPmEVJykgJjgAICApPQkhKSIhLCEn";
    public C946790akH LLJZ;
    public final C11NJ LLJLLL = new C11NJ();
    public String LLJZIJLIL = "other";

    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.follow.FollowSheetFragment.onDestroyView():void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c5r, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if (i == 2) {
            this.LLJZIJLIL = "user_close";
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C946790akH c946790akH;
        LinearLayoutManager linearLayoutManager;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(FollowSheetIsShowingChannel.class, Boolean.TRUE);
        }
        View viewFindViewById = view.findViewById(R.id.ib3);
        InterfaceC420801kM interfaceC420801kMLJIIZILJ = C11QJ.LL.LJFF(MultiGuestFollowPanelSetting.INSTANCE.getValue().timeoutInSecondsWhenNoTouch, TimeUnit.SECONDS, C1701940uOG.LIZIZ()).LJII(new C987100bnI(this, 6)).LJIILL().LJIIZILJ();
        viewFindViewById.setOnTouchListener(new ATListenerS448S0100000_15((C19487111Lx) interfaceC420801kMLJIIZILJ, 0));
        this.LLJLLL.LIZ(interfaceC420801kMLJIIZILJ);
        C786410Ut5.m8((C16FV) view.findViewById(R.id.e1v), new ACListenerS150S0100000_15(this, 63));
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) view.findViewById(R.id.ieg);
        if (runnableC781530UlD != null) {
            if (getContext() != null) {
                linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            } else {
                linearLayoutManager = null;
            }
            runnableC781530UlD.setLayoutManager(linearLayoutManager);
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null && (c946790akH = (C946790akH) dataChannelLJ2.gg0(FollowSheetInfoChannel.class)) != null) {
            this.LLJZ = c946790akH;
            TextView textView = (TextView) view.findViewById(R.id.tv_title);
            List<C440101nT> list = c946790akH.LIZ;
            C930480aJy c930480aJy = C930480aJy.LIZ;
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            c930480aJy.getClass();
            if (C930480aJy.LJIJJ(Long.valueOf(currentUserId))) {
                textView.setText(C497740JfY.LJIJI(2131843261));
            } else {
                Iterator<C440101nT> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C440101nT next = it2.next();
                    C930480aJy c930480aJy2 = C930480aJy.LIZ;
                    User user = next.LIZIZ;
                    c930480aJy2.getClass();
                    if (C930480aJy.LJIJI(user)) {
                        if (next != null) {
                            textView.setText(C497740JfY.LJIJI(2131843260));
                        }
                    }
                }
                textView.setText(C497740JfY.LJIJI(2131843259));
            }
            if (runnableC781530UlD != null) {
                C500260Jjc.LJLJJL((int) C497740JfY.LIZIZ(16.0f), runnableC781530UlD);
            }
            if (list.size() <= 3) {
                if (runnableC781530UlD != null) {
                    C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(16.0f), runnableC781530UlD);
                    runnableC781530UlD.addItemDecoration(new C0DXR() { // from class: X.0akC
                        @Override // X.C0DXR
                        public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                            if (recyclerView.getChildAdapterPosition(view2) != 0) {
                                if (C454590Hs9.LIZ(this.LL.getContext())) {
                                    rect.right = (int) C497740JfY.LIZIZ(8.0f);
                                } else {
                                    rect.left = (int) C497740JfY.LIZIZ(8.0f);
                                }
                            }
                        }
                    });
                }
                HandlerHook.viewPost(runnableC781530UlD, new ARunnableS23S0400000_15(runnableC781530UlD, c946790akH, this, list, 2));
            } else {
                if (runnableC781530UlD != null) {
                    C500260Jjc.LJJLJLI((int) C497740JfY.LIZIZ(0.0f), runnableC781530UlD);
                    runnableC781530UlD.addItemDecoration(new C0DXR() { // from class: X.0akC
                        @Override // X.C0DXR
                        public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                            if (recyclerView.getChildAdapterPosition(view2) != 0) {
                                if (C454590Hs9.LIZ(this.LL.getContext())) {
                                    rect.right = (int) C497740JfY.LIZIZ(8.0f);
                                } else {
                                    rect.left = (int) C497740JfY.LIZIZ(8.0f);
                                }
                            }
                        }
                    });
                }
                HandlerHook.viewPost(runnableC781530UlD, new ARunnableS23S0400000_15(runnableC781530UlD, c946790akH, this, list, 2));
            }
        }
        DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
        if (dataChannelLJ3 != null) {
            dataChannelLJ3.zW(FollowSheetInfoChannel.class, null);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gge, viewGroup, false);
    }
}
