package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.AbstractC712240Rwk;
import X.C01GW;
import X.C09JN;
import X.C0TVI;
import X.C0UO0;
import X.C0UX6;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1203130hPj;
import X.C12ES;
import X.C14K9;
import X.C1570050qxX;
import X.C19ME;
import X.C1EOY;
import X.C20373514nl;
import X.C20385714pj;
import X.C20390414qU;
import X.C20394514r9;
import X.C20397214ra;
import X.C20398214rk;
import X.C20403714sd;
import X.C20404314sj;
import X.C20405714sx;
import X.C20632315oP;
import X.C20736316Cj;
import X.C439101nJ;
import X.C452501pT;
import X.C480460Ism;
import X.C500260Jjc;
import X.C758170Tod;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C978360bZC;
import X.InterfaceC1203170hPn;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.InteractivePlaybookHeaderHeightData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.NeedCloseMultiLiveDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.event.PlaybookEditorInterceptEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.event.PlaybookEditorRefreshEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.event.PlaybookUpdateTvRecommendState;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableLiveJourneyTaskReport;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookInteractivePolymerizationDialog extends BasePlaybookSheetFragment {
    public static final int LLLLII = C439101nJ.LIZ(16);
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/HELIOSKTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonACEnLTctKjs6PiAcJiMqJSA+IDUyPCwjJws6KSkjLg==";
    public DataChannel LLJZIJLIL;
    public PlaybookAnchorViewModel LLL;
    public View LLLF;
    public View LLLFF;
    public View LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public View LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public C1203130hPj LLLIIIL;
    public C20398214rk LLLIIL;
    public C20632315oP LLLIILIL;
    public View LLLIL;
    public Integer LLLILZJ;
    public boolean LLLJ;
    public Function0<Unit> LLLJL;
    public int LLLILZ = 1;
    public final String LLLILZLLLI = "playbook_non_multi_panel";
    public final boolean LLLIZZ = true;
    public boolean LLLJIL = true;
    public final C01GW LLLL = C452501pT.LIZIZ(new C20397214ra(this));

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9p;
    }

    public final C20394514r9 BS() {
        return (C20394514r9) this.LLLL.getValue();
    }

    public final void ES() {
        MutableLiveData<List<Playbook>> mutableLiveData;
        List<Playbook> value;
        DataChannel dataChannel = this.LLJZIJLIL;
        if (dataChannel != null) {
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLL;
            boolean z = false;
            if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJILJILJ) != null && (value = mutableLiveData.getValue()) != null && (!value.isEmpty())) {
                z = true;
            }
            dataChannel.LC0(PlaybookUpdateTvRecommendState.class, Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        if (!this.LLLJ) {
            return null;
        }
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.LLJZIJLIL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        BS().LJIIIIZZ();
        C1EOY.LIZ.LJJII("playbook_non_multi_panel");
        Function0<Unit> function0 = this.LLLJL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i = this.LLLILZ;
        int iLIZIZ = C20385714pj.LIZIZ(this.LLL);
        this.LLLILZ = i;
        BS().LIZJ(false, i, iLIZIZ, this.LLLJIL, new C20390414qU(false, this));
        this.LLLJIL = false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final boolean wS() {
        return this.LLLIZZ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLILZLLLI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        return C20373514nl.LIZ(this.LLLJ);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/live/liveinteract/multiguestv3/main/play/playbook/anchor/PlaybookInteractivePolymerizationDialog", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+2VtFZpmdg6UUTXIC64GxEhOUcCM/MYEStRVPIPEYRGafFpkovV5mivpVAA1qMsLuK9/te+JDnrYkpuaQ==", null)));
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PlaybookAnchorViewModel playbookAnchorViewModel;
        MutableLiveData<List<Playbook>> mutableLiveData;
        MutableLiveData<List<Playbook>> mutableLiveData2;
        MutableLiveData<List<PlaybookTagAggregation>> mutableLiveData3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        if (this.LLLJ) {
            View viewFindViewById = view.findViewById(R.id.n65);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.eqx);
            if (viewFindViewById2 != null) {
                C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.14v4
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        view2.setPadding(view2.getPaddingLeft(), c20246014Ju.LIZ(7).LIZIZ, view2.getPaddingRight(), 0);
                        return c20246014Ju;
                    }
                });
                viewFindViewById2.setBackgroundColor(QM(requireContext()));
            }
        }
        this.LLLF = view.findViewById(R.id.tsc);
        this.LLLFF = view.findViewById(R.id.i69);
        this.LLLFFI = view.findViewById(R.id.ey0);
        this.LLLFZ = view.findViewById(R.id.b6m);
        this.LLLI = view.findViewById(R.id.nnp);
        this.LLLII = view.findViewById(R.id.lrd);
        this.LLLIIII = view.findViewById(R.id.ldz);
        this.LLLIIIIL = view.findViewById(R.id.qsw);
        this.LLLIIIL = (C1203130hPj) view.findViewById(R.id.qrn);
        BS().LJFF(view);
        this.LLLIL = view.findViewById(R.id.ll7);
        this.LLLIILIL = (C20632315oP) view.findViewById(R.id.view_pager);
        View view2 = this.LLLIL;
        ViewGroup.LayoutParams layoutParams = null;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(LLLLII);
            View view3 = this.LLLIL;
            if (view3 != null) {
                C786410Ut5.W5(view3, marginLayoutParams);
            }
        }
        PlaybookEditorUgcSetting playbookEditorUgcSetting = PlaybookEditorUgcSetting.INSTANCE;
        if (playbookEditorUgcSetting.isUgcEnable() && C500260Jjc.LJJIJLIJ()) {
            RedDotExtensionKt.LJI(this.LLLIIIIL, this, null, C0UX6.PLAYBOOK_UGC_ENTRANCE, null);
        }
        View view4 = this.LLLII;
        if (view4 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.14rP
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    C20394514r9 c20394514r9BS = this.LL.BS();
                    c20394514r9BS.getClass();
                    String str = MultiGuestFeSchemaConfigSetting.INSTANCE.getValue().playbookFAQ;
                    if (str != null && str.length() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("&transition_animation=");
                        sbLIZ.append("bottom");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Context contextInvoke = c20394514r9BS.LLIZLLLIL.invoke();
                        if (contextInvoke != null) {
                            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(contextInvoke, strLIZIZ, null);
                            return;
                        }
                        return;
                    }
                    C20441214yg.LJ("PlaybookPolymerizationDialog", "openFAQDialog return as url is null");
                }
            }, view4);
        }
        View view5 = this.LLLIIII;
        if (view5 != null) {
            if (playbookEditorUgcSetting.isUgcEnable()) {
                C12ES.LJIILL(0, view5);
                C978360bZC.LJIJJ("playbook_original", "create_entrance", null, "create", null, 48);
                C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.14rJ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog = this.LL;
                        DataChannel dataChannel = playbookInteractivePolymerizationDialog.LLJZIJLIL;
                        if (dataChannel != null) {
                            PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel);
                            if ((playbookAnchorServiceV2LIZIZ instanceof BasePlaybookService) && playbookAnchorServiceV2LIZIZ != null) {
                                playbookAnchorServiceV2LIZIZ.LJJJ(playbookInteractivePolymerizationDialog, dataChannel, null, null, "", new C915190ZvJ("", false, 4));
                            }
                        }
                        C978360bZC.LJIJ("playbook_original", "create_entrance", null, "create", false, null, null);
                    }
                }, view5);
            } else {
                C439101nJ.LJI(view5);
            }
        }
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLL;
        if (playbookAnchorViewModel2 != null && (mutableLiveData3 = playbookAnchorViewModel2.LLJJIJI) != null) {
            mutableLiveData3.observe(this, new Observer() { // from class: X.14rN
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Integer numValueOf;
                    AbstractC21673619ry adapter;
                    C20396414rS c20396414rS;
                    List<PlaybookTagAggregation> listNQ2;
                    C20632315oP c20632315oP;
                    List list = (List) obj;
                    PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog = this.LL;
                    playbookInteractivePolymerizationDialog.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateTagInfoList tagInfos:");
                    AbstractC21673619ry adapter2 = null;
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    C20441214yg.LIZIZ("PlaybookInteractivePolymerizationDialog", C2188811AlT.LIZIZ(sbLIZ));
                    if (list != null && !list.isEmpty()) {
                        C20632315oP c20632315oP2 = playbookInteractivePolymerizationDialog.LLLIILIL;
                        if (c20632315oP2 != null) {
                            adapter = c20632315oP2.getAdapter();
                        } else {
                            adapter = null;
                        }
                        if (!(adapter instanceof C20396414rS) && (c20632315oP = playbookInteractivePolymerizationDialog.LLLIILIL) != null) {
                            c20632315oP.setAdapter(new C20396414rS(playbookInteractivePolymerizationDialog, playbookInteractivePolymerizationDialog.LLL, playbookInteractivePolymerizationDialog.BS(), playbookInteractivePolymerizationDialog.LLJZIJLIL));
                        }
                        C20632315oP c20632315oP3 = playbookInteractivePolymerizationDialog.LLLIILIL;
                        if (c20632315oP3 != null) {
                            adapter2 = c20632315oP3.getAdapter();
                        }
                        if ((adapter2 instanceof C20396414rS) && (c20396414rS = (C20396414rS) adapter2) != null) {
                            PlaybookAnchorViewModel playbookAnchorViewModel3 = playbookInteractivePolymerizationDialog.LLL;
                            if (playbookAnchorViewModel3 != null) {
                                listNQ2 = playbookAnchorViewModel3.NQ2();
                            } else {
                                listNQ2 = C13BV.INSTANCE;
                            }
                            ((ArrayList) c20396414rS.LLJILLL).clear();
                            ((ArrayList) c20396414rS.LLJILLL).addAll(c20396414rS.LLJILJILJ);
                            c20396414rS.LLJILJILJ = listNQ2;
                            C21342318fd.LIZ((AbstractC21342018fa) c20396414rS.LLJJ.getValue(), true).LIZJ(c20396414rS);
                        }
                    }
                }
            });
        }
        View view6 = this.LLLFZ;
        if (view6 != null) {
            view6.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.14s0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view7, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    ViewGroup.LayoutParams layoutParams2;
                    int height;
                    int height2;
                    int i9;
                    View view8 = this.LL.LLLFF;
                    LinearLayout.LayoutParams layoutParams3 = null;
                    if (view8 != null) {
                        layoutParams2 = view8.getLayoutParams();
                    } else {
                        layoutParams2 = null;
                    }
                    if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                        layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    }
                    PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog = this.LL;
                    DataChannel dataChannel = playbookInteractivePolymerizationDialog.LLJZIJLIL;
                    if (dataChannel != null) {
                        View view9 = playbookInteractivePolymerizationDialog.LLLF;
                        int i10 = 0;
                        if (view9 != null) {
                            height = view9.getHeight();
                        } else {
                            height = 0;
                        }
                        int i11 = height - (i4 - i2);
                        View view10 = this.LL.LLLFF;
                        if (view10 != null) {
                            height2 = view10.getHeight();
                        } else {
                            height2 = 0;
                        }
                        if (layoutParams3 != null) {
                            i9 = layoutParams3.topMargin;
                        } else {
                            i9 = 0;
                        }
                        int i12 = height2 + i9;
                        if (layoutParams3 != null) {
                            i10 = layoutParams3.bottomMargin;
                        }
                        dataChannel.zW(InteractivePlaybookHeaderHeightData.class, Integer.valueOf(i11 - (i12 + i10)));
                    }
                }
            });
        }
        C1203130hPj c1203130hPj = this.LLLIIIL;
        if (c1203130hPj != null) {
            c1203130hPj.setOnSelectedChangeListener(new InterfaceC1203170hPn() { // from class: X.14si
                @Override // X.InterfaceC1203170hPn
                public final void LIZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
                    C20632315oP c20632315oP;
                    if (z) {
                        C20632315oP c20632315oP2 = this.LIZ.LLLIILIL;
                        if ((c20632315oP2 != null && c20632315oP2.getCurrentItem() == i) || (c20632315oP = this.LIZ.LLLIILIL) == null) {
                            return;
                        }
                        c20632315oP.LJ(i, true);
                    }
                }
            });
        }
        C1203130hPj c1203130hPj2 = this.LLLIIIL;
        if (c1203130hPj2 != null) {
            C12ES.LJIILL(0, c1203130hPj2);
        }
        C20632315oP c20632315oP = this.LLLIILIL;
        if (c20632315oP != null) {
            c20632315oP.LIZIZ(new AbstractC712240Rwk() { // from class: X.14rM
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
                @Override // X.AbstractC712240Rwk
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onPageSelected(int r12) {
                    /*
                        Method dump skipped, instruction units count: 211
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20395814rM.onPageSelected(int):void");
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel3 = this.LLL;
        if (playbookAnchorViewModel3 != null && (mutableLiveData2 = playbookAnchorViewModel3.LLJILJILJ) != null) {
            mutableLiveData2.observe(this, new Observer() { // from class: X.14sl
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.LL.ES();
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel4 = this.LLL;
        if (playbookAnchorViewModel4 != null && (mutableLiveData = playbookAnchorViewModel4.LLJILJIL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.14sm
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.LL.ES();
                }
            });
        }
        DataChannel dataChannel = this.LLJZIJLIL;
        if (dataChannel != null) {
            dataChannel.CQ2(PlaybookEditorInterceptEvent.class, this, new C20403714sd(this));
        }
        DataChannel dataChannel2 = this.LLJZIJLIL;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(PlaybookEditorRefreshEvent.class, this, new C20405714sx(this));
        }
        DataChannel dataChannel3 = this.LLJZIJLIL;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, NeedCloseMultiLiveDialogEvent.class, new C20404314sj(this));
        }
        if (LiveEnableLiveJourneyTaskReport.INSTANCE.isEnable() && (playbookAnchorViewModel = this.LLL) != null) {
            playbookAnchorViewModel.LLJJJJJIL.getClass();
            C480460Ism.LIZ().getClass();
            ((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).finishPlaybookTask(15).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Kx
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorModel@281.finishPlaybookTask$1");
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.finishPlaybookTask$1");
                }
            }, new C09JN() { // from class: X.00Ky
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorModel@281.finishPlaybookTask$2");
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.finishPlaybookTask$2");
                }
            });
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1EOY.LIZ.LJIJ("playbook_non_multi_panel");
        return super.dS(layoutInflater, viewGroup, bundle);
    }
}
