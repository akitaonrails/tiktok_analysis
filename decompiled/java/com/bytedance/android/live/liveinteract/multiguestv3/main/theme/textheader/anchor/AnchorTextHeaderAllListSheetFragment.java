package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.C1203130hPj;
import X.C1203140hPk;
import X.C1203200hPq;
import X.C12ES;
import X.C16H0;
import X.C20632315oP;
import X.C786410Ut5;
import X.C970180bM0;
import X.InterfaceC1203170hPn;
import X.InterfaceC970140bLw;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderAllListSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.BaseTextHeaderSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes32.dex */
public final class AnchorTextHeaderAllListSheetFragment extends BaseTextHeaderSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzs7HELIOSLSgpZzs2MDEkLC43LTdiKCEwICo+Zw49Ky0jOxs2MDEELC43LTcNJSMfITY4Gic2LTEKOy40JSAiPQ==";
    public final AnchorTextHeaderViewModel LLL;
    public final int LLLF;
    public LiveIconView LLLFF;
    public LiveIconView LLLFFI;
    public C1203130hPj LLLFZ;
    public C20632315oP LLLI;
    public C970180bM0 LLLII;
    public final C16H0 LLLIIII;
    public Integer LLLIIIIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.gci;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C20632315oP c20632315oP = this.LLLI;
        if (c20632315oP != null) {
            c20632315oP.LJI(this.LLLIIII);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(1, null);
        sheetOptionsIS.canceledOnTouchOutside = true;
        sheetOptionsIS.dimBehindType = 1;
        return sheetOptionsIS;
    }

    public final void zS(int i) {
        Integer num = this.LLLIIIIL;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.LLLIIIIL = Integer.valueOf(i);
        C1203130hPj c1203130hPj = this.LLLFZ;
        if (c1203130hPj != null) {
            c1203130hPj.LIZ(i, true, C1203200hPq.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bM0] */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLII = new InterfaceC970140bLw() { // from class: X.0bM0
            @Override // X.InterfaceC970140bLw
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC970140bLw
            public final void LIZ() {
                int templateQuickSelectMaxCount = MultiGuestNoticeboardEditorSetting.INSTANCE.getTemplateQuickSelectMaxCount();
                C953230auf.LIZ.getClass();
                List listLJLIL = C13LP.LJLIL(C13LP.LL(C953230auf.LIZJ, templateQuickSelectMaxCount - Math.min(templateQuickSelectMaxCount, C953230auf.LIZIZ.size())), C13LP.LL(C953230auf.LIZIZ, templateQuickSelectMaxCount));
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : (ArrayList) listLJLIL) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    C953230auf.LIZ.getClass();
                    C953230auf.LIZIZ.size();
                    arrayList.add(new C970190bM1((NoticeboardTemplate) obj));
                    i = i2;
                }
            }
        };
        view.findViewById(R.id.tv_title);
        this.LLLFF = (LiveIconView) view.findViewById(R.id.xne);
        this.LLLFFI = (LiveIconView) view.findViewById(R.id.xnd);
        this.LLLFZ = (C1203130hPj) view.findViewById(R.id.xmv);
        this.LLLI = (C20632315oP) view.findViewById(R.id.view_pager);
        LiveIconView liveIconView = this.LLLFF;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 124));
        }
        LiveIconView liveIconView2 = this.LLLFFI;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS150S0100000_15(this, 125));
        }
        C1203130hPj c1203130hPj = this.LLLFZ;
        if (c1203130hPj != null) {
            c1203130hPj.setHorizontalMargin(0);
        }
        C1203130hPj c1203130hPj2 = this.LLLFZ;
        if (c1203130hPj2 != null) {
            c1203130hPj2.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.14ny
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    C20632315oP c20632315oP;
                    if (z) {
                        C20632315oP c20632315oP2 = this.LIZ.LLLI;
                        if ((c20632315oP2 != null && c20632315oP2.getCurrentItem() == i) || (c20632315oP = this.LIZ.LLLI) == null) {
                            return;
                        }
                        c20632315oP.LJ(i, true);
                    }
                }
            });
        }
        C1203130hPj c1203130hPj3 = this.LLLFZ;
        if (c1203130hPj3 != null) {
            C12ES.LJIILL(0, c1203130hPj3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1203140hPk(getString(2131854327), null, 14));
        arrayList.add(new C1203140hPk(getString(2131854328), null, 14));
        C1203130hPj c1203130hPj4 = this.LLLFZ;
        if (c1203130hPj4 != null) {
            c1203130hPj4.setChips(arrayList);
        }
        zS(this.LLLF);
        C20632315oP c20632315oP = this.LLLI;
        if (c20632315oP != null) {
            c20632315oP.LIZIZ(this.LLLIIII);
        }
        C20632315oP c20632315oP2 = this.LLLI;
        if (c20632315oP2 != null) {
            c20632315oP2.setAdapter(new FragmentStateAdapter() { // from class: X.0bLz
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    return 2;
                }

                {
                    super(this.LLJI);
                }

                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public final Fragment LLLII(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            return new Fragment();
                        }
                        AnchorTextHeaderAllListSheetFragment anchorTextHeaderAllListSheetFragment = this.LLJI;
                        anchorTextHeaderAllListSheetFragment.getClass();
                        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
                        C953610avH.LJJI.getClass();
                        String str = C953610avH.LJJII;
                        if (str == null) {
                            str = "";
                        }
                        C916750Zxp c916750Zxp = new C916750Zxp(2, 0L, str);
                        Context context = anchorTextHeaderAllListSheetFragment.getContext();
                        if (context == null) {
                            return new Fragment();
                        }
                        C969920bLa c969920bLa = new C969920bLa(context, anchorTextHeaderAllListSheetFragment.LLLII, anchorTextHeaderAllListSheetFragment.LLJLLL, new C953100auS(context, anchorTextHeaderAllListSheetFragment.LLJLLL, enumC952890au7, c916750Zxp, AFwS250S0000000_15.get$arr$(74), new C953120auU(), AFwS250S0000000_15.get$arr$(75), AFwS203S0000000_15.get$arr$(117), null, 768), new C969910bLZ((C056N) null, (EnumC124700dh) null, 7));
                        EnumC971610bOJ enumC971610bOJ = EnumC971610bOJ.BOARD;
                        TemplateFragment templateFragment = new TemplateFragment();
                        templateFragment.LL = c969920bLa;
                        templateFragment.LLILLJJLI = true;
                        templateFragment.LLILLL = enumC971610bOJ;
                        templateFragment.LLJILJIL = new AwS559S0100000_15(anchorTextHeaderAllListSheetFragment, 363);
                        return templateFragment;
                    }
                    AnchorTextHeaderAllListSheetFragment anchorTextHeaderAllListSheetFragment2 = this.LLJI;
                    return new TextHeaderListFragment(anchorTextHeaderAllListSheetFragment2.LLL, EnumC971980bOu.ALL_LIST_TYPE, null, new AwS559S0100000_15(anchorTextHeaderAllListSheetFragment2, 364));
                }
            });
        }
        C20632315oP c20632315oP3 = this.LLLI;
        if (c20632315oP3 != null) {
            c20632315oP3.LJ(this.LLLF, false);
        }
    }

    public AnchorTextHeaderAllListSheetFragment(DataChannel dataChannel, AnchorTextHeaderViewModel anchorTextHeaderViewModel, int i) {
        super(dataChannel);
        this.LLL = anchorTextHeaderViewModel;
        this.LLLF = i;
        this.LLLIIII = new C16H0(this, 2);
    }
}
