package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0alo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947740alo extends AbstractC960470b6L<C947820alw> {
    public final DataChannel LL;
    public LayoutSettingContract LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public C21411818qq LLILZIL;
    public View LLILZLL;
    public C21411818qq LLIZ;
    public C947750alp LLIZLLLIL;

    public final void L5(C947820alw c947820alw) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        Boolean boolValueOf;
        String str;
        boolean z;
        boolean z2;
        int i;
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new C947750alp(c947820alw.LIZ);
        }
        if (this.LLILLJJLI == null) {
            View view = this.itemView;
            C947750alp c947750alp = this.LLIZLLLIL;
            if (c947750alp != null) {
                multiLiveAnchorPanelSettingsLIZIZ = c947750alp.LIZIZ();
            } else {
                multiLiveAnchorPanelSettingsLIZIZ = null;
            }
            LayoutSettingContract layoutSettingContract = new LayoutSettingContract(view.getContext(), this.LL, PlaybookUtilKt.LJJIFFI(), new AwS559S0100000_15(this, 603), new C987250bnX(this, 2), new AwS559S0100000_15(this, 604), null, "design_page", null, null, false, false, null, 7936);
            this.LLILLJJLI = layoutSettingContract;
            layoutSettingContract.LJJII(view, multiLiveAnchorPanelSettingsLIZIZ, null);
            this.LLILLL = view.findViewById(R.id.tv_show_all);
            this.LLILZ = view.findViewById(R.id.m_7);
            this.LLILZIL = (C21411818qq) view.findViewById(R.id.m_6);
            this.LLILZLL = view.findViewById(R.id.m_2);
            this.LLIZ = (C21411818qq) view.findViewById(R.id.m_1);
            boolean zLIZIZ = C934960aRC.LIZIZ();
            View view2 = this.LLILLL;
            boolean z3 = false;
            if (view2 != null) {
                if (zLIZIZ) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }
            if (zLIZIZ) {
                View view3 = this.LLILLL;
                if (view3 != null) {
                    C500260Jjc.LJLIIIL(500L, view3, new AwS594S0100000_15(this, 663));
                }
            } else {
                View view4 = this.LLILLL;
                if (view4 != null) {
                    C786410Ut5.I7(null, view4);
                }
            }
            C947750alp c947750alp2 = this.LLIZLLLIL;
            if (c947750alp2 == null || (multiLiveAnchorPanelSettingsLIZIZ2 = c947750alp2.LIZIZ) == null) {
                MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
                if (multiGuestDataHolderLJJIFFI != null) {
                    multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLJJIFFI.LIZIZ();
                } else {
                    multiLiveAnchorPanelSettingsLIZIZ2 = null;
                }
            }
            C21411818qq c21411818qq = this.LLILZIL;
            if (c21411818qq != null) {
                if (multiLiveAnchorPanelSettingsLIZIZ2 != null && multiLiveAnchorPanelSettingsLIZIZ2.showAvailableSpot == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c21411818qq.setChecked(z2);
            }
            C21411818qq c21411818qq2 = this.LLIZ;
            if (c21411818qq2 != null) {
                if (multiLiveAnchorPanelSettingsLIZIZ2 != null && multiLiveAnchorPanelSettingsLIZIZ2.saveAsDefaultLayout == 3) {
                    z = true;
                } else {
                    z = false;
                }
                c21411818qq2.setChecked(z);
            }
            View view5 = this.LLILZ;
            if (view5 != null) {
                boolValueOf = Boolean.valueOf(C500260Jjc.LJJJJIZL(view5));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && multiLiveAnchorPanelSettingsLIZIZ2 != null && multiLiveAnchorPanelSettingsLIZIZ2.showAvailableSpot == 3) {
                z3 = true;
            }
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            map.put("guest_cnt", String.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())));
            map.put("layout_id", C940770aaZ.LIZ().getDataSource().LJIL());
            String strLIZ = C940770aaZ.LIZ().getDataSource().LIZ();
            strLIZ.toString();
            map.put("layout_key", strLIZ);
            map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
            int iLIZJ = C940770aaZ.LIZ().getDataSource().LIZJ();
            if (iLIZJ > 0) {
                map.put("max_guest_num", String.valueOf(iLIZJ - 1));
            }
            if (z3) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_show_avaliable_spot", str);
            C0KX4.LIZ("livesdk_multi_anchor_design_page_show", map, null, true);
            View view6 = this.LLILZ;
            if (view6 != null) {
                C500260Jjc.LJLIIIL(500L, view6, new AwS594S0100000_15(this, 664));
            }
            View view7 = this.LLILZLL;
            if (view7 != null) {
                C500260Jjc.LJLIIIL(500L, view7, new AwS594S0100000_15(this, 665));
            }
        }
    }

    public C947740alo(View view, DataChannel dataChannel) {
        super(view);
        this.LL = dataChannel;
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C947820alw) obj);
    }
}
