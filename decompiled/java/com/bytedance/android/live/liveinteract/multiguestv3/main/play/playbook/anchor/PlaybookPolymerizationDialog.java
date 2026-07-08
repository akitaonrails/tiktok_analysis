package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.C01EI;
import X.C01GW;
import X.C0DXR;
import X.C0TVI;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1083530eIp;
import X.C1117360fBO;
import X.C1158290gFP;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C14K9;
import X.C19322110iZ;
import X.C1AZW;
import X.C1EOY;
import X.C20373514nl;
import X.C20384514pX;
import X.C20385714pj;
import X.C20388714qD;
import X.C20389914qP;
import X.C20390514qV;
import X.C20394514r9;
import X.C20395614rK;
import X.C20396214rQ;
import X.C20397414rc;
import X.C20397614re;
import X.C20400114s3;
import X.C20400614s8;
import X.C20402614sS;
import X.C20402714sT;
import X.C20405214ss;
import X.C20408114tL;
import X.C20408214tM;
import X.C20408414tO;
import X.C20408714tR;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C439101nJ;
import X.C452501pT;
import X.C470590Icr;
import X.C500260Jjc;
import X.C784920Uqg;
import X.C786410Ut5;
import X.C800330VaR;
import X.C915190ZvJ;
import X.C922550a7B;
import X.C949720ap0;
import X.C978360bZC;
import X.C986270blx;
import X.InterfaceC170900l9;
import X.InterfaceC937090aUd;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.DismissPreviewSettingDialogEvent;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllUpdatePlaySettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownUpdatePlaySettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.NeedCloseMultiLiveDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.UserHasLivePermission;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.event.PlaybookEditorInterceptEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.event.PlaybookEditorRefreshEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.event.PlaybookLoadFetchListEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.event.PlaybookUpdateTvRecommendState;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookPolymerizationDialog extends BasePlaybookSheetFragment implements InterfaceC937090aUd {
    public static final int LLLIZZ = C439101nJ.LIZ(240);
    public static final Pair<Integer, Integer> LLLJ = new Pair<>(Integer.valueOf(C439101nJ.LIZ(93)), Integer.valueOf(C439101nJ.LIZ(59)));
    public static final int LLLJIL = C439101nJ.LIZ(14);
    public static final float LLLJL = C418440Gaw.LIZIZ(12);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonGSA/MSgpOyYpKTElJiEXISQgJig=";
    public final DataChannel LLJZIJLIL;
    public final PlaybookAnchorViewModel LLL;
    public final C915190ZvJ LLLF;
    public final Function0<Unit> LLLFF;
    public final String LLLFFI;
    public View LLLFZ;
    public final String LLLI;
    public final boolean LLLII;
    public final boolean LLLIIII;
    public View LLLIIIIL;
    public RecyclerView LLLIIIL;
    public final C01GW LLLIIL;
    public View LLLIILIL;
    public final Set<Integer> LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return 0;
    }

    @Override // X.InterfaceC937090aUd
    public final void ab() {
        C784920Uqg.LIZIZ(this.LLJZIJLIL).LJJJ(this, this.LLJZIJLIL, null, null, "", new C915190ZvJ("", false, 4));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9r;
    }

    @Override // X.InterfaceC937090aUd
    public final void xh() {
        close(1);
        if (C500260Jjc.LJJIL()) {
            this.LLJZIJLIL.FQ2(DismissPreviewSettingDialogEvent.class);
        }
    }

    public final C1117360fBO ES() {
        return (C1117360fBO) this.LLLIIL.getValue();
    }

    public final C20394514r9 FS() {
        return (C20394514r9) this.LLLILZLLLI.getValue();
    }

    public final int GS() {
        int i;
        int iMax;
        int measuredHeight;
        View view;
        RecyclerView recyclerView = this.LLLIIIL;
        int measuredHeight2 = 0;
        if (recyclerView == null) {
            return 0;
        }
        Iterator<?> it2 = ES().LL.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it2.next();
            if (HS() ? next instanceof C20408214tM : next instanceof C20408114tL) {
                break;
            }
            i2++;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(i2);
        Iterator<?> it3 = ES().LL.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (it3.next() instanceof C20390514qV) {
                i = i3;
                break;
            }
            i3++;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition2 = recyclerView.findViewHolderForLayoutPosition(i);
        if (viewHolderFindViewHolderForLayoutPosition != null) {
            int i4 = LLLIZZ;
            View view2 = this.LLLFZ;
            int measuredHeight3 = (view2 != null ? view2.getMeasuredHeight() : 0) - (recyclerView.getPaddingTop() + recyclerView.getPaddingBottom());
            if (C500260Jjc.LJJJJIZL(((C20408714tR) this.LLLILZ.getValue()).LJ)) {
                View view3 = ((C20408714tR) this.LLLILZ.getValue()).LJ;
                measuredHeight = (view3 != null ? view3.getMeasuredHeight() : 0) - LLLJIL;
            } else {
                measuredHeight = 0;
            }
            int measuredHeight4 = (measuredHeight3 - measuredHeight) - viewHolderFindViewHolderForLayoutPosition.itemView.getMeasuredHeight();
            if (viewHolderFindViewHolderForLayoutPosition2 != null && (view = viewHolderFindViewHolderForLayoutPosition2.itemView) != null) {
                measuredHeight2 = view.getMeasuredHeight();
            }
            iMax = Math.max(i4, measuredHeight4 - measuredHeight2);
        } else {
            iMax = LLLIZZ;
        }
        C20441214yg.LIZIZ("PlaybookPolymerizationDialog", "getRemainingHeight remainingHeight:" + iMax + " indexOfHeaderTopItem:" + i2 + " headerTopViewHolderForAdapterPosition:" + viewHolderFindViewHolderForLayoutPosition + " headerListHolderForAdapterPosition:" + viewHolderFindViewHolderForLayoutPosition2);
        return iMax;
    }

    public final boolean HS() {
        return Intrinsics.LJFF(this.LLLF.LIZ, "multi_live_merge");
    }

    public final void NS() {
        PlaybookAnchorViewModel playbookAnchorViewModel;
        MutableLiveData<List<Playbook>> mutableLiveData;
        List<Playbook> value;
        MutableLiveData<List<Playbook>> mutableLiveData2;
        List<Playbook> value2;
        DataChannel dataChannel = this.LLJZIJLIL;
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLL;
        boolean z = false;
        if ((playbookAnchorViewModel2 != null && (mutableLiveData2 = playbookAnchorViewModel2.LLJILJILJ) != null && (value2 = mutableLiveData2.getValue()) != null && (!value2.isEmpty())) || (!C500260Jjc.LJJIL() && (playbookAnchorViewModel = this.LLL) != null && (mutableLiveData = playbookAnchorViewModel.LLJILJIL) != null && (value = mutableLiveData.getValue()) != null && (!value.isEmpty()))) {
            z = true;
        }
        dataChannel.LC0(PlaybookUpdateTvRecommendState.class, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC937090aUd
    public final void j9() {
        String str = MultiGuestFeSchemaConfigSetting.INSTANCE.getValue().playbookFAQ;
        if (str == null || str.length() == 0) {
            C20441214yg.LJ("PlaybookPolymerizationDialog", "openFAQDialog return as url is null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("&transition_animation=");
        sbLIZ.append("bottom");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Context context = getContext();
        if (context != null) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, strLIZIZ, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FS().LJIIIIZZ();
        C1EOY.LIZ.LJJII("playbook_funkit_panel");
        Function0<Unit> function0 = this.LLLFF;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MutableLiveData<C1158290gFP> mutableLiveData;
        C20384514pX c20384514pX;
        super.onDestroyView();
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
        if (playbookAnchorViewModel != null && (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) != null) {
            c20384514pX.LJJ.LIZIZ();
            c20384514pX.LJJIFFI = false;
        }
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLL;
        if (playbookAnchorViewModel2 != null) {
            playbookAnchorViewModel2.FQ2();
        }
        this.LLJZIJLIL.zQ2(this);
        PlaybookAnchorViewModel playbookAnchorViewModel3 = this.LLL;
        if (playbookAnchorViewModel3 == null || (mutableLiveData = playbookAnchorViewModel3.LLJJIJIIJIL) == null) {
            return;
        }
        mutableLiveData.removeObserver((Observer) this.LLLILZJ.getValue());
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BS(this, C20385714pj.LIZIZ(this.LLL), null, 5);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final boolean wS() {
        return this.LLLIIII;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLI;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsLIZ = C20373514nl.LIZ(this.LLLII);
        if (!this.LLLII) {
            sheetOptionsLIZ.draggable = true;
        }
        return sheetOptionsLIZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/playbook/anchor/PlaybookPolymerizationDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM/MYEStRVPIPCIVede5tg5bGNn5Xv0G8v6YYCl8=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C978360bZC.LIZ = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showFeedbackDialog$1$1] */
    @Override // X.InterfaceC937090aUd
    public final void pe(List<C949720ap0> list) {
        C20441214yg.LIZIZ("PlaybookPolymerizationDialog", "clickFeedback");
        final PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(this.LLJZIJLIL);
        if (playbookAnchorServiceV2LIZIZ != null) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorServiceV2"), "showFeedbackDialog show", null, null);
            PlaybookFeedbackDialog playbookFeedbackDialog = playbookAnchorServiceV2LIZIZ.LLJJIJIIJIL;
            if (playbookFeedbackDialog != null) {
                playbookFeedbackDialog.close(1);
            }
            String str = PlaybookFeedbackDialog._pnsPageId;
            PlaybookFeedbackDialog playbookFeedbackDialog2 = new PlaybookFeedbackDialog((PlaybookAnchorViewModel) playbookAnchorServiceV2LIZIZ.LLILLJJLI, list);
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2$showFeedbackDialog$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        playbookAnchorServiceV2LIZIZ.LLJJIJIIJIL = null;
                        LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                        if (lifecycleEventObserver != null) {
                            lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                        }
                    }
                }
            };
            playbookFeedbackDialog2.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
            playbookAnchorServiceV2LIZIZ.LLJJIJIIJIL = playbookFeedbackDialog2;
            C19322110iZ.LJFF(playbookAnchorServiceV2LIZIZ.LJJJJJL(), playbookFeedbackDialog2, "PlaybookFeedbackDialog", null, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void JS(java.lang.String r20, java.util.List r21) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog.JS(java.lang.String, java.util.List):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<List<Playbook>> mutableLiveData;
        MutableLiveData<List<Playbook>> mutableLiveData2;
        MutableLiveData<C20389914qP> mutableLiveData3;
        MutableLiveData<C1158290gFP> mutableLiveData4;
        Context context;
        View view2;
        super.onViewCreated(view, bundle);
        if (this.LLLII) {
            View viewFindViewById = view.findViewById(R.id.n65);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.eqx);
            if (viewFindViewById2 != null) {
                C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.14v5
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                        view3.setPadding(view3.getPaddingLeft(), c20246014Ju.LIZ(7).LIZIZ, view3.getPaddingRight(), 0);
                        return c20246014Ju;
                    }
                });
                requireContext();
                viewFindViewById2.setBackgroundColor(0);
            }
        }
        this.LLJZIJLIL.FQ2(CountDownForAllUpdatePlaySettingEvent.class);
        if (C986270blx.LIZ()) {
            this.LLJZIJLIL.FQ2(GuestShowdownUpdatePlaySettingEvent.class);
        }
        this.LLLFZ = view.findViewById(R.id.trd);
        this.LLLIIIIL = view.findViewById(R.id.vg_content);
        if (HS() && (context = getContext()) != null && (view2 = this.LLLIIIIL) != null) {
            view2.setBackground(C800330VaR.LIZIZ(context, R.drawable.dv0));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvw);
        this.LLLIIIL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.LLLIIIL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        new C20395614rK(this.LLJZIJLIL, this.LLLIIIL, this.LLL, 0, false, new C20397414rc(this), 24);
        RecyclerView recyclerView3 = this.LLLIIIL;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C0DXR() { // from class: X.14tP
                @Override // X.C0DXR
                public final void LIZLLL(Canvas canvas, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    MutableLiveData<List<Playbook>> mutableLiveData5;
                    List<Playbook> value;
                    AbstractC21673619ry adapter;
                    int childCount = recyclerView4.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView4.getChildAt(i);
                        int childAdapterPosition = recyclerView4.getChildAdapterPosition(childAt);
                        PlaybookAnchorViewModel playbookAnchorViewModel = this.LL.LLL;
                        if (playbookAnchorViewModel != null && (mutableLiveData5 = playbookAnchorViewModel.LLJILLL) != null && (value = mutableLiveData5.getValue()) != null && !value.isEmpty() && childAdapterPosition > 0 && (adapter = recyclerView4.getAdapter()) != null && childAdapterPosition == adapter.getItemCount() - 1) {
                            Rect rect = new Rect(childAt.getLeft(), childAt.getBottom(), childAt.getRight(), childAt.getBottom() + C439101nJ.LIZ(16));
                            Paint paint = new Paint();
                            paint.setColor(C20736316Cj.LIZIZ(R.attr.ezk, this.LL.getContext()));
                            canvas.drawRect(rect, paint);
                        }
                    }
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view3, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    int childAdapterPosition = recyclerView4.getChildAdapterPosition(view3);
                    if (childAdapterPosition != -1) {
                        if (childAdapterPosition < this.LL.ES().getItemCount() && (ListProtector.get(this.LL.ES().LL, childAdapterPosition) instanceof C20390914qZ) && !this.LL.HS()) {
                            rect.left = C439101nJ.LIZ(8);
                            rect.right = C439101nJ.LIZ(8);
                        }
                        if (childAdapterPosition > 0 && childAdapterPosition == this.LL.ES().getItemCount() - 1 && (ListProtector.get(this.LL.ES().LL, childAdapterPosition) instanceof C20390914qZ)) {
                            rect.bottom = C439101nJ.LIZ(16);
                        }
                    }
                }
            });
        }
        RecyclerView recyclerView4 = this.LLLIIIL;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(ES());
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
        if (playbookAnchorViewModel != null && (mutableLiveData4 = playbookAnchorViewModel.LLJJIJIIJIL) != null) {
            mutableLiveData4.observeForever((Observer) this.LLLILZJ.getValue());
        }
        this.LLLIILIL = view.findViewById(R.id.nnp);
        FS().LJFF(view);
        final C20408714tR c20408714tR = (C20408714tR) this.LLLILZ.getValue();
        c20408714tR.getClass();
        c20408714tR.LJ = view.findViewById(R.id.vg_banner);
        c20408714tR.LJI = (TextView) view.findViewById(R.id.za5);
        c20408714tR.LJII = (LiveIconView) view.findViewById(R.id.l_l);
        c20408714tR.LJFF = (C1324720kZq) view.findViewById(R.id.ll8);
        PlaybookAnchorViewModel playbookAnchorViewModel2 = c20408714tR.LIZ;
        if (playbookAnchorViewModel2 != null && (mutableLiveData3 = playbookAnchorViewModel2.LLJJIII) != null) {
            mutableLiveData3.observe(c20408714tR.LIZIZ, new Observer() { // from class: X.14u9
                /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x01a3  */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 446
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20413114u9.onChanged(java.lang.Object):void");
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel3 = this.LLL;
        if (playbookAnchorViewModel3 != null && (mutableLiveData2 = playbookAnchorViewModel3.LLJILJILJ) != null) {
            mutableLiveData2.observe(this, new Observer() { // from class: X.14sn
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.LL.NS();
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel4 = this.LLL;
        if (playbookAnchorViewModel4 != null && (mutableLiveData = playbookAnchorViewModel4.LLJILJIL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.14so
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.LL.NS();
                }
            });
        }
        this.LLLIL.add(Integer.valueOf(C20385714pj.LIZIZ(this.LLL)));
        this.LLJZIJLIL.CQ2(PlaybookLoadFetchListEvent.class, this, new C20402614sS(this));
        this.LLJZIJLIL.CQ2(PlaybookEditorInterceptEvent.class, this, new C20397614re(this));
        this.LLJZIJLIL.CQ2(PlaybookEditorRefreshEvent.class, this, new C20400614s8(this));
        DataChannel dataChannel = this.LLJZIJLIL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, NeedCloseMultiLiveDialogEvent.class, new C20402714sT(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1EOY.LIZ.LJIJI(C922550a7B.LIZLLL(null), "playbook_funkit_panel");
        return super.dS(layoutInflater, viewGroup, bundle);
    }

    public PlaybookPolymerizationDialog(DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel, C915190ZvJ c915190ZvJ, C20388714qD c20388714qD) {
        String str;
        boolean zBooleanValue;
        this.LLJZIJLIL = dataChannel;
        this.LLL = playbookAnchorViewModel;
        this.LLLF = c915190ZvJ;
        this.LLLFF = c20388714qD;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookPolymerizationDialog_");
        sbLIZ.append(hashCode());
        this.LLLFFI = C2188811AlT.LIZIZ(sbLIZ);
        if (HS()) {
            str = "playbook_panel";
        } else {
            str = "funkit_panel";
        }
        this.LLLI = str;
        Boolean bool = (Boolean) dataChannel.gg0(C1083530eIp.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLLII = zBooleanValue;
        this.LLLIIII = true;
        this.LLLIIL = C452501pT.LIZIZ(new C20396214rQ(this));
        this.LLLIL = new LinkedHashSet();
        this.LLLILZ = C452501pT.LIZIZ(new C20408414tO(this));
        this.LLLILZJ = C452501pT.LIZIZ(new C20405214ss(this));
        this.LLLILZLLLI = C452501pT.LIZIZ(new C20400114s3(this));
        C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
        C978360bZC.LIZ = System.currentTimeMillis();
    }

    public static void BS(final PlaybookPolymerizationDialog playbookPolymerizationDialog, int i, String str, int i2) {
        int i3 = i;
        if ((i2 & 2) != 0) {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            str = "init";
        }
        String strLIZ = C01EI.LIZ(0, playbookPolymerizationDialog.LLLFFI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchList source:");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20394514r9 c20394514r9FS = playbookPolymerizationDialog.FS();
        if (c20394514r9FS != null) {
            c20394514r9FS.LIZJ(false, 2, i3, false, new InterfaceC170900l9<C470590Icr<PlaybookFetchListResponse.ResponseData>>() { // from class: X.14qd
                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookFetchListResponse.ResponseData> c470590Icr) {
                    C1AZW.LJIIJ(12, C01EI.LIZ(0, this.LIZ.LLLFFI), "fetchList success", null, null);
                    IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
                    final PlaybookPolymerizationDialog playbookPolymerizationDialog2 = this.LIZ;
                    iHostUser.requestLivePermission(new InterfaceC472150IfN() { // from class: X.14qc
                        @Override // X.InterfaceC472150IfN
                        public final void onFailed(Throwable th) {
                            DataChannel dataChannel = playbookPolymerizationDialog2.LLJZIJLIL;
                            if (dataChannel != null) {
                                dataChannel.zW(UserHasLivePermission.class, Boolean.FALSE);
                            }
                            playbookPolymerizationDialog2.ES().notifyDataSetChanged();
                        }

                        @Override // X.InterfaceC472150IfN
                        public final void LIZ(Boolean bool, DetailLivePermission detailLivePermission, ApplyLivePermission applyLivePermission, Boolean bool2, C783980UpA c783980UpA, Map<String, String> map) {
                            boolean zBooleanValue;
                            DataChannel dataChannel = playbookPolymerizationDialog2.LLJZIJLIL;
                            if (dataChannel != null) {
                                if (bool != null) {
                                    zBooleanValue = bool.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                dataChannel.zW(UserHasLivePermission.class, Boolean.valueOf(zBooleanValue));
                            }
                            playbookPolymerizationDialog2.ES().notifyDataSetChanged();
                        }
                    }, "playbook_recommend_list");
                }

                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                    String message;
                    String strLIZ2 = C01EI.LIZ(0, this.LIZ.LLLFFI);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchList onFailed t:");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ2.append(message);
                    C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    this.LIZ.JS("fetchList_onFailed", C13BV.INSTANCE);
                }
            });
        }
    }
}
