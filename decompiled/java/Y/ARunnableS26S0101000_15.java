package Y;

import X.C0GRS;
import X.C0UO0;
import X.C11NZ;
import X.C1324720kZq;
import X.C1602160rnK;
import X.C1C7U;
import X.C20441214yg;
import X.C21674119s3;
import X.C480460Ism;
import X.C786410Ut5;
import X.C948380amq;
import X.C958950b3t;
import X.C961940b8i;
import X.C962050b8t;
import X.C969610bL5;
import X.C984960bjq;
import X.EnumC961280b7e;
import X.InterfaceC962060b8u;
import X.InterfaceC969600bL4;
import X.InterfaceC969670bLB;
import X.RunnableC781530UlD;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS26S0101000_15 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1324720kZq c1324720kZq = ((C984960bjq) this.l0).LLILLL;
        if (c1324720kZq != null && c1324720kZq.getVisibility() == 8) {
            C1324720kZq c1324720kZq2 = ((C984960bjq) this.l0).LLILLL;
            if (c1324720kZq2 != null) {
                c1324720kZq2.setActualImageResource(this.i1);
            }
            C1324720kZq c1324720kZq3 = ((C984960bjq) this.l0).LLILLL;
            if (c1324720kZq3 != null) {
                C786410Ut5.LLJJIII(c1324720kZq3, 0);
            }
            C1324720kZq c1324720kZq4 = ((C984960bjq) this.l0).LLILLL;
            if (c1324720kZq4 != null) {
                C786410Ut5.h5(c1324720kZq4, 1.0f);
            }
        }
        C0GRS c0grs = ((C984960bjq) this.l0).LLILZ;
        if (c0grs != null && c0grs.getVisibility() == 8) {
            C984960bjq c984960bjq = (C984960bjq) this.l0;
            if (c984960bjq.LLILZ != null) {
                c984960bjq.getRingColor();
            }
            C0GRS c0grs2 = ((C984960bjq) this.l0).LLILZ;
            if (c0grs2 != null) {
                int visibility = c0grs2.getVisibility();
                c0grs2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c0grs2);
            }
        }
        C1324720kZq c1324720kZq5 = ((C984960bjq) this.l0).LLILLJJLI;
        if (c1324720kZq5 != null) {
            C786410Ut5.LLJJIII(c1324720kZq5, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS26S0101000_15.LIZ$1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L60
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings r0 = r0.multiLiveUserSettings
            if (r0 == 0) goto L60
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings r0 = r0.multiLiveUserApplySettings
            if (r0 == 0) goto L60
            com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission r0 = r0.multiLiveUserApplyPermission
            if (r0 == 0) goto L60
            int r0 = r0.multiLiveApplyPermission
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4 = 1
            if (r2 == 0) goto L60
            int r0 = r2.intValue()
            if (r0 == r4) goto L2f
            int r1 = r2.intValue()
            r0 = 2
            if (r1 == r0) goto L2f
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L60
        L2f:
            int r3 = r5.i1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.C924650aAZ.LIZ(r2)
            java.lang.String r1 = "scene"
            java.lang.String r0 = "audience_get_anchor_pannel_setting"
            r2.put(r1, r0)
            java.lang.String r1 = "response_status"
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r2.put(r1, r0)
            java.lang.String r1 = "is_visible"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.put(r1, r0)
            double r0 = com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting.getSAMPLE_100()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "livesdk_linkmic_multi_guest_icon_show"
            X.C924650aAZ.LJIILLIIL(r0, r1, r2)
            return
        L60:
            r4 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS26S0101000_15.LIZ$2():void");
    }

    public final void LIZ$3() {
        InterfaceC969670bLB interfaceC969670bLBLIZIZ;
        InterfaceC962060b8u interfaceC962060b8uLIZJ;
        C958950b3t c958950b3tLIZLLL;
        InterfaceC969670bLB interfaceC969670bLBLIZIZ2;
        InterfaceC962060b8u interfaceC962060b8uLIZJ2;
        InterfaceC962060b8u interfaceC962060b8uLIZJ3;
        C958950b3t c958950b3tLIZLLL2;
        InterfaceC969600bL4 interfaceC969600bL4 = ((C969610bL5) this.l0).LIZ;
        if (interfaceC969600bL4 == null) {
            C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "checkBattleInfo, return by viewInterface");
            return;
        }
        InterfaceC969670bLB interfaceC969670bLBLIZIZ3 = interfaceC969600bL4.LIZIZ();
        long j = 0;
        long j2 = (interfaceC969670bLBLIZIZ3 == null || (interfaceC962060b8uLIZJ3 = interfaceC969670bLBLIZIZ3.LIZJ()) == null || (c958950b3tLIZLLL2 = interfaceC962060b8uLIZJ3.LIZLLL()) == null) ? 0L : c958950b3tLIZLLL2.LIZJ;
        InterfaceC969600bL4 interfaceC969600bL42 = ((C969610bL5) this.l0).LIZ;
        long jLJFF = (interfaceC969600bL42 == null || (interfaceC969670bLBLIZIZ2 = interfaceC969600bL42.LIZIZ()) == null || (interfaceC962060b8uLIZJ2 = interfaceC969670bLBLIZIZ2.LIZJ()) == null) ? 0L : interfaceC962060b8uLIZJ2.LJFF();
        InterfaceC969600bL4 interfaceC969600bL43 = ((C969610bL5) this.l0).LIZ;
        if (interfaceC969600bL43 != null && (interfaceC969670bLBLIZIZ = interfaceC969600bL43.LIZIZ()) != null && (interfaceC962060b8uLIZJ = interfaceC969670bLBLIZIZ.LIZJ()) != null && (c958950b3tLIZLLL = interfaceC962060b8uLIZJ.LIZLLL()) != null) {
            j = c958950b3tLIZLLL.LIZIZ;
        }
        C962050b8t c962050b8t = new C962050b8t();
        C480460Ism.LIZ().getClass();
        C11NZ<R> c11nzLJIILIIL = ((LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class)).getInfo(j2, jLJFF, j).LJIILIIL(new C0UO0());
        C969610bL5 c969610bL5 = (C969610bL5) this.l0;
        ((C969610bL5) this.l0).LIZIZ.LIZ(c11nzLJIILIIL.LJJLL(new AfS67S0201000_15(this.i1, c962050b8t, c969610bL5, 2), new AfS151S0200000_15(c962050b8t, c969610bL5, 53)));
    }

    public final void LIZ$4() {
        MultiHostInviteListFragmentV2 multiHostInviteListFragmentV2 = (MultiHostInviteListFragmentV2) this.l0;
        if (multiHostInviteListFragmentV2.mStatusViewValid) {
            C961940b8i c961940b8i = multiHostInviteListFragmentV2.LLLFF;
            final int i = (c961940b8i != null ? c961940b8i.LLILZLL : null) == EnumC961280b7e.MANAGE_PANEL_EXTEND ? 260 : 0;
            RunnableC781530UlD runnableC781530UlD = multiHostInviteListFragmentV2.LLJJJJ;
            if (runnableC781530UlD != null) {
                int i2 = this.i1;
                multiHostInviteListFragmentV2.getClass();
                RecyclerView.LayoutManager layoutManager = runnableC781530UlD.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null) {
                    return;
                }
                final Context context = runnableC781530UlD.getContext();
                C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0fRG
                    @Override // X.C21674119s3
                    public final int LJIILL() {
                        return -1;
                    }

                    @Override // X.C21674119s3
                    public final int LJIIJ(int i3, View view) {
                        return super.LJIIJ(i3, view) + i;
                    }
                };
                c21674119s3.LIZ = i2;
                layoutManager.startSmoothScroll(c21674119s3);
            }
        }
    }

    public static final void run$0(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        C1C7U.LIZ("CatchBeansMvpSeatView@8aff.setMvpSeat$2");
        try {
            aRunnableS26S0101000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CatchBeansMvpSeatView@8aff.setMvpSeat$2");
    }

    public static final void run$1(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        C1C7U.LIZ("TeamMatchInviterFragment@9fba.performClickTargetItemView$1");
        try {
            RecyclerView recyclerView = ((TeamMatchInviterFragment) aRunnableS26S0101000_15.l0).LLJJIII;
            if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(aRunnableS26S0101000_15.i1)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                view.performClick();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TeamMatchInviterFragment@9fba.performClickTargetItemView$1");
    }

    public static final void run$2(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiMatchAudiencePresenter@edb8.checkBattleInfo$1");
        try {
            aRunnableS26S0101000_15.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiMatchAudiencePresenter@edb8.checkBattleInfo$1");
    }

    public static final void run$3(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        C1C7U.LIZ("GameLinkLogHelper@93ee.logAudienceGetAnchorPannelSettingSuccessRate$1");
        try {
            aRunnableS26S0101000_15.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameLinkLogHelper@93ee.logAudienceGetAnchorPannelSettingSuccessRate$1");
    }

    public static final void run$4(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestChooseLayoutAdapter@b8b6.postApplyTextStyle$1");
        try {
            if (((C948380amq) aRunnableS26S0101000_15.l0).LLILLL.getParent() != null) {
                ((C948380amq) aRunnableS26S0101000_15.l0).LLILLL.LJJJI(aRunnableS26S0101000_15.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestChooseLayoutAdapter@b8b6.postApplyTextStyle$1");
    }

    public static final void run$5(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestChooseLayoutVoiceAdapter@84e1.postApplyTextStyle$1");
        try {
            if (((C948380amq) aRunnableS26S0101000_15.l0).LLILLL.getParent() != null) {
                ((C948380amq) aRunnableS26S0101000_15.l0).LLILLL.LJJJI(aRunnableS26S0101000_15.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestChooseLayoutVoiceAdapter@84e1.postApplyTextStyle$1");
    }

    public static final void run$6(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MatchFeedWidgetPresenter@981d.checkBattleInfo$1");
        try {
            aRunnableS26S0101000_15.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchFeedWidgetPresenter@981d.checkBattleInfo$1");
    }

    public static final void run$7(ARunnableS26S0101000_15 aRunnableS26S0101000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiHostInviteListFragmentV2@b7f0.triggerInsertionAndScroll$1");
        try {
            aRunnableS26S0101000_15.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiHostInviteListFragmentV2@b7f0.triggerInsertionAndScroll$1");
    }

    public ARunnableS26S0101000_15(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
