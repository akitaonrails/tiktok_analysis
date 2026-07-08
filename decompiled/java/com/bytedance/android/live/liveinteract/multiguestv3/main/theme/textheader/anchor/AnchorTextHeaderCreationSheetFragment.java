package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C013C;
import X.C01F5;
import X.C01GW;
import X.C0FV2;
import X.C0WZX;
import X.C1124870fNV;
import X.C1161920gLG;
import X.C12ES;
import X.C142Q;
import X.C15P4;
import X.C19357810oK;
import X.C1954807lC;
import X.C19GI;
import X.C20423314vn;
import X.C20423414vo;
import X.C20424114vv;
import X.C20424314vx;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C334901Rr;
import X.C421870GgT;
import X.C421890GgV;
import X.C439101nJ;
import X.C500260Jjc;
import X.C5183020f;
import X.C785410UrT;
import X.C786410Ut5;
import X.C930540aK4;
import X.C946850akN;
import X.C972080bP4;
import X.EnumC19357710oJ;
import X.EnumC952890au7;
import X.EnumC971610bOJ;
import X.RunnableC514801zW;
import X.ViewOnClickListenerC512201z6;
import Y.ACListenerS163S0100000_29;
import Y.ACListenerS165S0100000_31;
import Y.AObserverS233S0100000_31;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS131S0100000_31;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.MultiGuestTextHeaderMockSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.api.ITextHeaderApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.bean.TextHeaderBoardTextFontStyleData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.BaseTextHeaderSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.settings.EnableTextHeaderOfficialStarlingEditorSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordUpdateParams;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.TextHeaderMaterialInfo;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;

/* JADX INFO: loaded from: classes32.dex */
public final class AnchorTextHeaderCreationSheetFragment extends BaseTextHeaderSheetFragment {
    public static final int LLLLLILLIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzs7HELIOSLSgpZzs2MDEkLC43LTdiKCEwICo+Zw49Ky0jOxs2MDEELC43LTcPOyoyPCwjJxw7LSA4Dz0yLygpJzs=";
    public final AnchorTextHeaderViewModel LLL;
    public final boolean LLLF;
    public final long LLLFF;
    public final String LLLFFI;
    public final String LLLFZ;
    public final boolean LLLI;
    public final int LLLII;
    public final Function1<TextHeaderRecordInfo, Unit> LLLIIII;
    public final Function0<Unit> LLLIIIIL;
    public final Function0<Unit> LLLIIIL;
    public final boolean LLLIIL;
    public View LLLIILIL;
    public TextView LLLIL;
    public C01F5 LLLILZ;
    public LiveIconView LLLILZJ;
    public final List<C20424114vv> LLLILZLLLI;
    public LinearLayout LLLIZZ;
    public C421890GgV LLLJ;
    public C15P4 LLLJIL;
    public C15P4 LLLJL;
    public C421870GgT LLLL;
    public View LLLLII;
    public EnumC19357710oJ LLLLIIIILLL;
    public String LLLLIIL;
    public final C01GW LLLLIILL;
    public boolean LLLLIILLL;
    public final C20423414vo LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public final BPEAHandler LLLLJI;
    public final RunnableC514801zW LLLLL;
    public View LLLLLIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.hlx;
    }

    public final void zS() {
        this.LLLLILI = false;
        C972080bP4.LIZLLL("endMediaNodeLoading", "AnchorTextHeaderCreationSheetFragment", 2);
        this.LLLLJI.removeCallbacks(this.LLLLL);
        if (this.LLLLJ) {
            this.LLLLJ = false;
            ES();
        }
    }

    static {
        new C20423314vn();
        LLLLLILLIL = C439101nJ.LIZ(320);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C01F5 BS() {
        MutableLiveData mutableLiveData;
        C01F5 c01f5;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LLL;
        return (anchorTextHeaderViewModel == null || (mutableLiveData = anchorTextHeaderViewModel.LLJJI) == null || (c01f5 = (C01F5) mutableLiveData.getValue()) == null) ? new C01F5(null, null, 0, false, 0.0f, false, 255) : c01f5;
    }

    public final void GS() {
        Editable editableLLLI;
        C15P4 c15p4 = this.LLLJIL;
        String string = null;
        if (c15p4 != null && (editableLLLI = C2204961BRm.LLLI(c15p4, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix7bsXd17byH/fj150/Gbg0qYRPGZMZRg3GtHyYRIA4t4JS0Mabp6EbB+xyscrC7Z7oH6jpiWIsI=", null))) != null) {
            string = editableLLLI.toString();
        }
        TextView textView = this.LLLIL;
        if (textView != null) {
            boolean z = false;
            if (string != null && string.length() > 0 && a0.LJLIIIL(string).toString().length() > 0) {
                z = true;
            }
            textView.setEnabled(z);
        }
        TextView textView2 = this.LLLIL;
        if (textView2 != null) {
            C786410Ut5.S4(C500260Jjc.LJJJI(Boolean.valueOf(textView2.isEnabled())) ? 1.0f : 0.5f, textView2);
        }
    }

    public final void JS() {
        AnchorTextHeaderViewModel anchorTextHeaderViewModel;
        String resourceId;
        String resourceId2;
        for (C20424114vv c20424114vv : (ArrayList) this.LLLILZLLLI) {
            String str = C20424314vx.LIZJ;
            if (TextUtils.isEmpty(str) || !Intrinsics.LJFF(str, c20424114vv.getTag())) {
                c20424114vv.setTextFontTypeLayoutBackground(0);
            } else {
                TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleData = c20424114vv.LLILZIL;
                if (textHeaderBoardTextFontStyleData != null && textHeaderBoardTextFontStyleData.LIZIZ == 1) {
                    c20424114vv.setTextFontTypeLayoutBackground(1);
                    c20424114vv.LIZIZ();
                    TextHeaderBoardTextFontStyleData fontData = c20424114vv.getFontData();
                    if (fontData != null && (anchorTextHeaderViewModel = this.LLL) != null) {
                        MutableLiveData<C01F5> mutableLiveData = anchorTextHeaderViewModel.LLJJ;
                        C01F5 value = mutableLiveData.getValue();
                        if (value == null) {
                            value = new C01F5(null, null, 0, false, 0.0f, false, 255);
                        }
                        Effect effect = fontData.LIZJ;
                        String str2 = "";
                        if (effect == null || (resourceId = effect.getResourceId()) == null) {
                            resourceId = "";
                        }
                        Effect effect2 = fontData.LIZJ;
                        if (effect2 != null && (resourceId2 = effect2.getResourceId()) != null) {
                            str2 = resourceId2;
                        }
                        mutableLiveData.setValue(C01F5.LIZ(value, null, resourceId, 0, false, C972080bP4.LIZIZ(str2), 189));
                    }
                    C421890GgV c421890GgV = this.LLLJ;
                    if (c421890GgV != null) {
                        c421890GgV.LIZ(c20424114vv);
                    }
                }
            }
        }
    }

    public final void ES() {
        if (getContext() != null && ((Dialog) this.LLLLIILL.getValue()).isShowing()) {
            C19GI c19gi = (C19GI) this.LLLLIILL.getValue();
            c19gi.dismiss();
            C785410UrT.LIZ(c19gi);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ES();
        View view = this.LLLLLIL;
        if (view != null) {
            KeyBoardUtil.LIZIZ(getContext(), view);
        }
    }

    public final void HS(C01F5 c01f5) {
        if (!EnableTextHeaderOfficialStarlingEditorSetting.INSTANCE.getValue()) {
            return;
        }
        String str = c01f5.LIZ;
        if (!a0.LJJJIL(str)) {
            C1124870fNV.LIZJ().getClass();
            String strLIZIZ = C1124870fNV.LIZIZ(str);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                str = strLIZIZ;
            }
        }
        C15P4 c15p4 = this.LLLJL;
        if (c15p4 != null) {
            c15p4.LJIIIIZZ(C01F5.LIZ(c01f5, str, null, 0, false, 0.0f, 254));
        }
    }

    public final void NS(EnumC19357710oJ enumC19357710oJ) {
        C421870GgT c421870GgT;
        this.LLLLIIIILLL = enumC19357710oJ;
        int i = C19357810oK.LIZ[enumC19357710oJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C421890GgV c421890GgV = this.LLLJ;
                if (c421890GgV != null) {
                    C12ES.LJIILL(0, c421890GgV);
                }
                C421870GgT c421870GgT2 = this.LLLL;
                if (c421870GgT2 != null) {
                    C439101nJ.LJI(c421870GgT2);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        C421870GgT c421870GgT3 = this.LLLL;
        if (c421870GgT3 != null) {
            C12ES.LJIILL(0, c421870GgT3);
        }
        if (this.LLLLIIIILLL == EnumC19357710oJ.COLOR && (c421870GgT = this.LLLL) != null) {
            HandlerHook.viewPost(c421870GgT, new ARunnableS131S0100000_31(this, 26));
        }
        C421890GgV c421890GgV2 = this.LLLJ;
        if (c421890GgV2 == null) {
            return;
        }
        C439101nJ.LJI(c421890GgV2);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void close(int i) {
        super.close(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("close cause:");
        sbLIZ.append(i);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "AnchorTextHeaderCreationSheetFragment", 2);
        Function0<Unit> function0 = this.LLLIIIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C15P4 c15p4 = this.LLLJIL;
        if (c15p4 != null) {
            c15p4.requestFocus();
        }
        C15P4 c15p42 = this.LLLJIL;
        if (c15p42 != null) {
            HandlerHook.viewPost(c15p42, new ARunnableS131S0100000_31(this, 23));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013 A[PHI: r13
      0x0013: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:10:0x0011, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FS(boolean r16, webcast.data.multi_guest_play.TextHeaderRecordInfo r17) {
        /*
            r15 = this;
            r2 = 0
            r4 = r17
            if (r4 == 0) goto L6c
            long r0 = r4.recordId
        L8:
            java.lang.String r14 = ""
            if (r4 == 0) goto L10
            java.lang.String r13 = r4.mediaNodeId
            if (r13 != 0) goto L13
        L10:
            r13 = r14
            if (r4 == 0) goto L1a
        L13:
            long r2 = r4.originRecordId
            java.lang.String r5 = r4.originMediaNodeId
            if (r5 == 0) goto L1a
            r14 = r5
        L1a:
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils r6 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils.LIZ
            X.0au7 r5 = X.C946850akN.LIZIZ
            r6.getClass()
            X.0aUx r5 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils.LJIIJJI(r5)
            r6 = 0
            r7 = 1
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.String r10 = "personal"
            java.lang.String r11 = "header"
            java.lang.String r12 = java.lang.String.valueOf(r2)
            r8 = r7
            X.C946850akN.LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.ES()
            kotlin.jvm.functions.Function1<webcast.data.multi_guest_play.TextHeaderRecordInfo, kotlin.Unit> r0 = r15.LLLIIII
            if (r0 == 0) goto L41
            r0.invoke(r4)
        L41:
            if (r16 == 0) goto L5d
            if (r4 == 0) goto L6a
            int r1 = r4.reviewStatus
            if (r1 == r7) goto L68
            r0 = 2
            if (r1 == r0) goto L68
            r0 = 0
        L4d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L51:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L61
            r0 = 2131854334(0x7f1183fe, float:1.934234E38)
            X.C766270U4b.LIZLLL(r0)
        L5d:
            r15.close(r7)
            return
        L61:
            r0 = 2131854331(0x7f1183fb, float:1.9342334E38)
            X.C766270U4b.LIZLLL(r0)
            goto L5d
        L68:
            r0 = 1
            goto L4d
        L6a:
            r0 = 0
            goto L51
        L6c:
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment.FS(boolean, webcast.data.multi_guest_play.TextHeaderRecordInfo):void");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String resourceId;
        MutableLiveData<List<TextHeaderBoardTextFontStyleData>> mutableLiveData;
        C421870GgT c421870GgT;
        MutableLiveData mutableLiveData2;
        LiveIconView liveIconView;
        String string;
        super.onViewCreated(view, bundle);
        this.LLLLLIL = view;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14vt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view.findViewById(R.id.xmw));
        C786410Ut5.I7(new ACListenerS165S0100000_31(this, 35), view.findViewById(R.id.xms));
        View viewFindViewById = view.findViewById(R.id.xmz);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            int iLIZ = (int) (C0FV2.LIZ(getContext()) * 0.3f);
            int i = LLLLLILLIL;
            if (iLIZ < i) {
                iLIZ = i;
            }
            layoutParams.height = iLIZ;
            C786410Ut5.W5(viewFindViewById, layoutParams);
        } else {
            viewFindViewById = null;
        }
        this.LLLIILIL = viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.xnu);
        this.LLLIL = textView;
        if (textView != null) {
            if (this.LLLF) {
                string = getString(2131854329);
            } else {
                string = getString(2131854329);
            }
            textView.setText(string);
        }
        TextView textView2 = this.LLLIL;
        if (textView2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.01Ed
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    Integer num;
                    String str;
                    if (view2 != null) {
                        C01F5 c01f5BS = this.LLILZ.BS();
                        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment = this.LLILZ;
                        if (anchorTextHeaderCreationSheetFragment.getContext() != null && !((Dialog) anchorTextHeaderCreationSheetFragment.LLLLIILL.getValue()).isShowing()) {
                            C786410Ut5.L4((DialogC780480UjW) anchorTextHeaderCreationSheetFragment.LLLLIILL.getValue());
                        }
                        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment2 = this.LLILZ;
                        if (anchorTextHeaderCreationSheetFragment2.LLLF) {
                            if (anchorTextHeaderCreationSheetFragment2.LLLFZ.length() > 0) {
                                num = 1;
                            } else if (this.LLILZ.LLLFFI.length() > 0 && Intrinsics.LJFF(c01f5BS, this.LLILZ.LLLILZ)) {
                                num = 0;
                            } else {
                                num = null;
                            }
                            if (this.LLILZ.LLLFZ.length() > 0) {
                                str = this.LLILZ.LLLFZ;
                            } else if (this.LLILZ.LLLFFI.length() > 0 && Intrinsics.LJFF(c01f5BS, this.LLILZ.LLLILZ)) {
                                str = this.LLILZ.LLLFFI;
                            } else {
                                str = "";
                            }
                            AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment3 = this.LLILZ;
                            AnchorTextHeaderViewModel anchorTextHeaderViewModel = anchorTextHeaderCreationSheetFragment3.LLL;
                            if (anchorTextHeaderViewModel != null) {
                                anchorTextHeaderViewModel.IQ2(c01f5BS, num, new C5183020f(anchorTextHeaderCreationSheetFragment3, 73), new C5182020e(this.LLILZ, 71), str, this.LLILZ.LLLII);
                                return;
                            }
                            return;
                        }
                        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = anchorTextHeaderCreationSheetFragment2.LLL;
                        if (anchorTextHeaderViewModel2 == null) {
                            return;
                        }
                        long j = anchorTextHeaderCreationSheetFragment2.LLLFF;
                        C5183020f c5183020f = new C5183020f(anchorTextHeaderCreationSheetFragment2, 74);
                        C5182020e c5182020e = new C5182020e(this.LLILZ, 70);
                        C300201Ei c300201EiWQ2 = anchorTextHeaderViewModel2.wQ2();
                        TextHeaderRecordUpdateParams textHeaderRecordUpdateParams = new TextHeaderRecordUpdateParams();
                        textHeaderRecordUpdateParams.roomId = C01JX.LJII();
                        textHeaderRecordUpdateParams.recordId = j;
                        TextHeaderMaterialInfo textHeaderMaterialInfo = new TextHeaderMaterialInfo();
                        textHeaderMaterialInfo.text = c01f5BS.LIZ;
                        textHeaderMaterialInfo.fontName = c01f5BS.LIZIZ;
                        textHeaderMaterialInfo.stroke = c01f5BS.LIZLLL ? 1 : 0;
                        textHeaderMaterialInfo.color = c01f5BS.LIZJ;
                        textHeaderRecordUpdateParams.textHeaderMaterialInfo = textHeaderMaterialInfo;
                        c300201EiWQ2.getClass();
                        C480460Ism.LIZ().getClass();
                        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).updateRecord(textHeaderRecordUpdateParams), "AnchorTextHeaderModel", "updateRecord").LJIILL(new C09JN() { // from class: X.00SL
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("AnchorTextHeaderModel@c2b9.updateRecord$1");
                                C930480aJy.LIZ.getClass();
                                C1C7U.LIZIZ("AnchorTextHeaderModel@c2b9.updateRecord$1");
                            }
                        })).LJFF(new C0UO0()), anchorTextHeaderViewModel2.vQ2(), new C515801zg(c5183020f, c5182020e, 17), new C516201zk(c5182020e, 67), 24);
                    }
                }
            }, textView2);
        }
        View viewFindViewById2 = view.findViewById(R.id.xn0);
        this.LLLLII = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 13), viewFindViewById2);
        }
        LiveIconView liveIconView2 = (LiveIconView) view.findViewById(R.id.xmy);
        C786410Ut5.g8(liveIconView2, new ACListenerS163S0100000_29(this, 14));
        Context context = getContext();
        if (context != null) {
            View viewVY0 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).VY0(context, AFwS221S0000000_31.get$arr$(74));
            if ((viewVY0 instanceof LiveIconView) && (liveIconView = (LiveIconView) viewVY0) != null && liveIconView.getIcon() != null) {
                liveIconView2.setIcon(liveIconView.getIcon());
            }
        }
        LiveIconView liveIconView3 = (LiveIconView) view.findViewById(R.id.xn1);
        this.LLLILZJ = liveIconView3;
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, new ViewOnClickListenerC512201z6(this, 21));
        }
        this.LLLIZZ = (LinearLayout) view.findViewById(R.id.ih3);
        this.LLLJ = (C421890GgV) view.findViewById(R.id.ih6);
        View viewFindViewById3 = view.findViewById(R.id.xnk);
        if (EnableTextHeaderOfficialStarlingEditorSetting.INSTANCE.getValue()) {
            C12ES.LJIILL(0, viewFindViewById3);
        } else {
            C439101nJ.LJI(viewFindViewById3);
        }
        C15P4 c15p4 = (C15P4) view.findViewById(R.id.xnl);
        c15p4.LJIILIIL();
        HandlerHook.viewPost(c15p4, new ARunnableS119S0100000_19(c15p4, 13));
        this.LLLJL = c15p4;
        HS(BS());
        final C15P4 c15p42 = (C15P4) view.findViewById(R.id.xn3);
        final C013C c013c = new C013C();
        c013c.element = true;
        c15p42.addTextChangedListener(new TextWatcher() { // from class: X.01Eh
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string2;
                String str;
                if (editable != null && (string2 = editable.toString()) != null) {
                    if (c013c.element && string2.length() == 0) {
                        C972080bP4.LIZLLL("filterFirstTextChange", "AnchorTextHeaderCreationSheetFragment", 2);
                        c013c.element = false;
                        return;
                    }
                    c013c.element = false;
                    AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LLL;
                    if (anchorTextHeaderViewModel != null) {
                        C01F5 value = anchorTextHeaderViewModel.LLJJ.getValue();
                        if (value != null) {
                            str = value.LIZ;
                        } else {
                            str = null;
                        }
                        if (!Intrinsics.LJFF(string2, str)) {
                            MutableLiveData<C01F5> mutableLiveData3 = anchorTextHeaderViewModel.LLJJ;
                            C01F5 value2 = mutableLiveData3.getValue();
                            if (value2 == null) {
                                value2 = new C01F5(null, null, 0, false, 0.0f, false, 255);
                            }
                            mutableLiveData3.setValue(C01F5.LIZ(value2, string2, null, 0, false, 0.0f, 254));
                        }
                    }
                    HandlerHook.viewPost(c15p42, new RunnableC514801zW(this, 32));
                }
            }
        });
        c15p42.LLJJIJI = this.LLLI;
        this.LLLJIL = c15p42;
        C15P4 c15p43 = this.LLLJIL;
        if (c15p43 != null) {
            HandlerHook.viewPost(c15p43, new ARunnableS100S0200000_31(this, view, 7));
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = this.LLL;
        if (anchorTextHeaderViewModel != null && (mutableLiveData2 = anchorTextHeaderViewModel.LLJJI) != null) {
            mutableLiveData2.observe(this, new AObserverS233S0100000_31(this, 8));
        }
        KeyBoardUtil.LIZ(this, view, this.LLLLIL, true);
        this.LLLL = (C421870GgT) view.findViewById(R.id.jl2);
        if (this.LLLLIIIILLL == EnumC19357710oJ.COLOR && (c421870GgT = this.LLLL) != null) {
            HandlerHook.viewPost(c421870GgT, new ARunnableS131S0100000_31(this, 26));
        }
        C421870GgT c421870GgT2 = this.LLLL;
        if (c421870GgT2 != null) {
            c421870GgT2.setColorChangeListener(new C5183020f(this, 72));
        }
        GS();
        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = this.LLL;
        if (anchorTextHeaderViewModel2 != null && (mutableLiveData = anchorTextHeaderViewModel2.LLJILLL) != null) {
            mutableLiveData.observe(this, new AObserverS233S0100000_31(this, 7));
        }
        C972080bP4.LIZLLL("initFont", "AnchorTextHeaderCreationSheetFragment", 2);
        Context context2 = getContext();
        if (context2 != null) {
            TextHeaderBoardTextFontStyleData textHeaderBoardTextFontStyleDataLIZJ = C20424314vx.LIZJ(BS().LIZIZ);
            if (textHeaderBoardTextFontStyleDataLIZJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initFont resourceId:");
                Effect effect = textHeaderBoardTextFontStyleDataLIZJ.LIZJ;
                if (effect != null) {
                    resourceId = effect.getResourceId();
                } else {
                    resourceId = null;
                }
                sbLIZ.append(resourceId);
                sbLIZ.append(" fileName:");
                sbLIZ.append(textHeaderBoardTextFontStyleDataLIZJ.fileName);
                C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "AnchorTextHeaderCreationSheetFragment", 2);
                C20424314vx.LIZJ = textHeaderBoardTextFontStyleDataLIZJ.fileName;
            }
            AnchorTextHeaderViewModel anchorTextHeaderViewModel3 = this.LLL;
            if (anchorTextHeaderViewModel3 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("initFontListData context:");
                sbLIZ2.append(Integer.valueOf(context2.hashCode()));
                anchorTextHeaderViewModel3.NQ2(C2188811AlT.LIZIZ(sbLIZ2));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(anchorTextHeaderViewModel3), null, null, new C334901Rr(anchorTextHeaderViewModel3, context2, null), 3);
            }
        }
        Function0<Unit> function0 = this.LLLIIIIL;
        if (function0 != null) {
            function0.invoke();
        }
        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
        EnumC971610bOJ enumC971610bOJ = EnumC971610bOJ.CANVAS;
        MultiCanvasUtils.LIZ.getClass();
        C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), enumC971610bOJ, "header");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.14vo] */
    public AnchorTextHeaderCreationSheetFragment(DataChannel dataChannel, AnchorTextHeaderViewModel anchorTextHeaderViewModel, boolean z, long j, String str, String str2, boolean z2, int i, Function1<? super TextHeaderRecordInfo, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, boolean z3) {
        MutableLiveData mutableLiveData;
        C01F5 c01f5;
        MutableLiveData mutableLiveData2;
        C01F5 c01f52;
        super(dataChannel);
        this.LLL = anchorTextHeaderViewModel;
        this.LLLF = z;
        this.LLLFF = j;
        this.LLLFFI = str;
        this.LLLFZ = str2;
        this.LLLI = z2;
        this.LLLII = i;
        this.LLLIIII = function1;
        this.LLLIIIIL = function0;
        this.LLLIIIL = function02;
        this.LLLIIL = z3;
        String str3 = null;
        new C01F5(null, null, 0, false, 0.0f, false, 255);
        this.LLLILZLLLI = new ArrayList();
        this.LLLLIIIILLL = EnumC19357710oJ.TEXT_FONT;
        C01F5 c01f5LIZ = null;
        if (anchorTextHeaderViewModel != null && (mutableLiveData2 = anchorTextHeaderViewModel.LLJJI) != null && (c01f52 = (C01F5) mutableLiveData2.getValue()) != null) {
            str3 = c01f52.LIZIZ;
        }
        this.LLLLIIL = str3;
        this.LLLLIILL = C930540aK4.LJJIJIL(new AwS575S0100000_31(this, 163));
        this.LLLLIL = new C142Q() { // from class: X.14vo
            @Override // X.C142Q
            public final void onShow() {
                C972080bP4.LIZLLL("keyboard show", "AnchorTextHeaderCreationSheetFragment", 2);
                this.LIZ.LLLLIILLL = true;
            }

            @Override // X.C142Q
            public final void onHide() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("keyboard hide isKeyboardShowing:");
                sbLIZ.append(this.LIZ.LLLLIILLL);
                C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "AnchorTextHeaderCreationSheetFragment", 2);
                if (!this.LIZ.LLLLIILLL || MultiGuestTextHeaderMockSetting.INSTANCE.getValue().keyBoardMock) {
                    return;
                }
                this.LIZ.close(1);
            }
        };
        this.LLLLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLLLL = new RunnableC514801zW(this, 31);
        if (str.length() > 0) {
            this.LLLLILI = true;
            C972080bP4.LIZLLL("startMediaNodeLoading", "AnchorTextHeaderCreationSheetFragment", 2);
            if (anchorTextHeaderViewModel != null) {
                BaseTextHeaderViewModel.xQ2(anchorTextHeaderViewModel, str, new AwS610S0100000_31(this, 66), new C5183020f(this, 68));
                return;
            }
            return;
        }
        if (anchorTextHeaderViewModel != null && (mutableLiveData = anchorTextHeaderViewModel.LLJJI) != null && (c01f5 = (C01F5) mutableLiveData.getValue()) != null) {
            c01f5LIZ = C01F5.LIZ(c01f5, null, null, 0, false, 0.0f, 255);
        }
        this.LLLILZ = c01f5LIZ;
    }
}
