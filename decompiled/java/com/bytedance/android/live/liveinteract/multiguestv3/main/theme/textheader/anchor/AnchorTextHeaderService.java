package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.C00UM;
import X.C01F5;
import X.C01GW;
import X.C01OF;
import X.C01ZA;
import X.C176600m4;
import X.C19367910px;
import X.C19EG;
import X.C20423314vn;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C300201Ei;
import X.C354001Za;
import X.C452501pT;
import X.C5182020e;
import X.C915980Zwa;
import X.C916750Zxp;
import X.C946850akN;
import X.C953610avH;
import X.C972080bP4;
import X.EnumC952890au7;
import X.EnumC971980bOu;
import X.InterfaceC1106030et7;
import X.InterfaceC934710aQn;
import X.InterfaceC948500an2;
import X.InterfaceC971790bOb;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS466S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.TextHeaderPlayContent;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC948500an2(name = "ANCHOR_TEXT_HEADER")
public final class AnchorTextHeaderService implements InterfaceC971790bOb {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final DataChannel LIZIZ;
    public final WeakReference<Fragment> LIZJ;
    public final WeakReference<C19EG> LIZLLL;
    public boolean LJFF;
    public AnchorTextHeaderListSheetFragment LJI;
    public AnchorTextHeaderAllListSheetFragment LJII;
    public AnchorTextHeaderCreationSheetFragment LJIIIIZZ;
    public AnchorTextHeaderTemplateSelectionSheetFragment LJIIIZ;
    public AnchorTextHeaderGuideSheetFragment LJIIJ;
    public final C01GW LJ = C452501pT.LIZIZ(new C5182020e(this, 68));
    public EnumC971980bOu LJIIJJI = EnumC971980bOu.UNKNOWN;
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 164));

    static {
        new C01OF();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openGuidePage$1$1] */
    public final void LJIJJ() {
        C972080bP4.LIZLLL("openGuidePage", "TextHeaderService", 2);
        AnchorTextHeaderGuideSheetFragment anchorTextHeaderGuideSheetFragment = this.LJIIJ;
        if (anchorTextHeaderGuideSheetFragment != null) {
            anchorTextHeaderGuideSheetFragment.close(1);
        }
        this.LJIIJ = null;
        String str = AnchorTextHeaderGuideSheetFragment._pnsPageId;
        AnchorTextHeaderGuideSheetFragment anchorTextHeaderGuideSheetFragment2 = new AnchorTextHeaderGuideSheetFragment(this.LIZIZ);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openGuidePage$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AnchorTextHeaderGuideSheetFragment anchorTextHeaderGuideSheetFragment3 = this.LL.LJIIJ;
                    if (anchorTextHeaderGuideSheetFragment3 != null) {
                        lifecycle = anchorTextHeaderGuideSheetFragment3.getLifecycle();
                    } else {
                        lifecycle = null;
                    }
                    if (Intrinsics.LJFF(lifecycle, lifecycleOwner)) {
                        this.LL.LJIIJ = null;
                        LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                        if (lifecycleEventObserver != null) {
                            lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                        }
                    }
                }
            }
        };
        anchorTextHeaderGuideSheetFragment2.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
        WeakReference<Fragment> weakReference = this.LIZJ;
        Fragment fragment = weakReference != null ? weakReference.get() : null;
        WeakReference<C19EG> weakReference2 = this.LIZLLL;
        if (C176600m4.LIZIZ(Boolean.valueOf(anchorTextHeaderGuideSheetFragment2.wS(fragment, weakReference2 != null ? weakReference2.get() : null, "AnchorTextHeaderGuideSheetFragment")))) {
            InterfaceC934710aQn.wc.LJFF(Boolean.FALSE);
            InterfaceC1106030et7.b9.LJFF(Boolean.TRUE);
        }
        this.LJIIJ = anchorTextHeaderGuideSheetFragment2;
    }

    public static boolean LJIJ() {
        Boolean boolLIZIZ;
        TextHeaderMockConfig value = MultiGuestTextHeaderMockSetting.INSTANCE.getValue();
        return C176600m4.LIZIZ(value != null ? Boolean.valueOf(value.removeGuideLimit) : null) || (boolLIZIZ = InterfaceC1106030et7.b9.LIZIZ()) == null || !boolLIZIZ.booleanValue();
    }

    @Override // X.InterfaceC971790bOb
    public final C01F5 LIZIZ() {
        DataChannel dataChannel = this.LIZIZ;
        C01F5 c01f5 = dataChannel != null ? (C01F5) dataChannel.gg0(TextHeaderUsingRichTextChangeChannel.class) : null;
        C01F5 c01f52 = C01F5.LJIIIIZZ;
        if (Intrinsics.LJFF(c01f5, C01F5.LJIIIIZZ)) {
            return null;
        }
        return c01f5;
    }

    @Override // X.InterfaceC971790bOb
    public final void LJIIIIZZ() {
        LJIJI("reopenNoticeboardPage");
        LJIJJLI(1);
    }

    public final AnchorTextHeaderViewModel LJIIZILJ() {
        return (AnchorTextHeaderViewModel) this.LJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC971790bOb
    public final C01ZA LJIIIZ() {
        MutableLiveData mutableLiveData;
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (anchorTextHeaderViewModelLJIIZILJ == null || (mutableLiveData = anchorTextHeaderViewModelLJIIZILJ.LLILZLL) == null) {
            return null;
        }
        return (C01ZA) mutableLiveData.getValue();
    }

    @Override // X.InterfaceC971790bOb
    public final void LJIIJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reopenParentTextHeaderPage openTextHeaderEditPageType:");
        sbLIZ.append(this.LJIIJJI);
        LJIJI(C2188811AlT.LIZIZ(sbLIZ));
        LJI(this.LJIIJJI, C946850akN.LIZIZ);
    }

    @Override // X.InterfaceC971790bOb
    public final boolean LJIILJJIL() {
        MutableLiveData<Boolean> mutableLiveData;
        Boolean value;
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (anchorTextHeaderViewModelLJIIZILJ == null || (mutableLiveData = anchorTextHeaderViewModelLJIIZILJ.LLJ) == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.InterfaceC930300aJg
    public final boolean isRunning() {
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (anchorTextHeaderViewModelLJIIZILJ != null) {
            return anchorTextHeaderViewModelLJIIZILJ.DQ2();
        }
        return false;
    }

    public static void LJIJI(String str) {
        C20441214yg.LIZIZ("TextHeaderService", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openTextHeaderEditorPage$6$1] */
    @Override // X.InterfaceC20355514kr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C20355614ks r15) {
        /*
            r14 = this;
            X.10pw r0 = r15.LIZ
            int[] r1 = X.C19367910px.LIZIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r3 = 1
            if (r1 == r3) goto L52
            r8 = 2
            if (r1 == r8) goto L52
            r0 = 3
            if (r1 == r0) goto L14
            r8 = 0
        L14:
            X.0au7 r0 = r15.LIZLLL
            X.C946850akN.LIZIZ = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "openTextHeaderEditorPage params:"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " autoStartMode:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJIJI(r0)
            X.10pw r1 = r15.LIZ
            X.10pw r0 = X.EnumC19367810pw.AUTO_START_TYPE
            if (r1 != r0) goto L54
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel r4 = r14.LJIIZILJ()
            if (r4 == 0) goto L51
            java.lang.String r3 = r15.LIZJ
            kotlin.jvm.internal.AwS112S0201000_31 r2 = new kotlin.jvm.internal.AwS112S0201000_31
            r0 = 4
            r2.<init>(r14, r15, r8, r0)
            kotlin.jvm.internal.AwS610S0100000_31 r1 = new kotlin.jvm.internal.AwS610S0100000_31
            r0 = 67
            r1.<init>(r15, r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel.xQ2(r4, r3, r2, r1)
        L51:
            return
        L52:
            r8 = 1
            goto L14
        L54:
            java.lang.String r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment._pnsPageId
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r14.LIZIZ
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel r2 = r14.LJIIZILJ()
            r4 = 0
            java.lang.String r5 = r15.LIZJ
            boolean r0 = r15.LIZIZ
            r7 = r0 ^ 1
            kotlin.jvm.internal.AwS610S0100000_31 r9 = new kotlin.jvm.internal.AwS610S0100000_31
            r0 = 68
            r9.<init>(r15, r0)
            kotlin.jvm.internal.AwS575S0100000_31 r10 = new kotlin.jvm.internal.AwS575S0100000_31
            r0 = 165(0xa5, float:2.31E-43)
            r10.<init>(r15, r0)
            kotlin.jvm.internal.AwS575S0100000_31 r11 = new kotlin.jvm.internal.AwS575S0100000_31
            r0 = 166(0xa6, float:2.33E-43)
            r11.<init>(r15, r0)
            r12 = 0
            r13 = 2088(0x828, float:2.926E-42)
            r6 = r4
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment r3 = X.C20423314vn.LIZ(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.00zU r2 = new X.00zU
            r2.<init>()
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openTextHeaderEditorPage$6$1 r0 = new com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openTextHeaderEditorPage$6$1
            r0.<init>()
            r2.element = r0
            androidx.lifecycle.Lifecycle r1 = r3.getLifecycle()
            T r0 = r2.element
            androidx.lifecycle.LifecycleObserver r0 = (androidx.lifecycle.LifecycleObserver) r0
            r1.addObserver(r0)
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r0 = r14.LIZJ
            r1 = 0
            if (r0 == 0) goto La2
            java.lang.Object r4 = r0.get()
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
        La2:
            java.lang.ref.WeakReference<X.19EG> r0 = r14.LIZLLL
            if (r0 == 0) goto Lac
            java.lang.Object r1 = r0.get()
            X.19EG r1 = (X.C19EG) r1
        Lac:
            java.lang.String r0 = "AnchorTextHeaderCreationSheetFragment"
            boolean r0 = r3.wS(r4, r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C176600m4.LIZIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService.LJ(X.14ks):void");
    }

    @Override // X.InterfaceC971790bOb
    public final void LJFF(C354001Za c354001Za) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete item=");
        sbLIZ.append(c354001Za.LIZIZ.LIZLLL);
        LJIJI(C2188811AlT.LIZIZ(sbLIZ));
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (anchorTextHeaderViewModelLJIIZILJ != null) {
            anchorTextHeaderViewModelLJIIZILJ.JQ2(c354001Za.LIZIZ.LIZLLL, null, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openSelectablePage$2$1] */
    @Override // X.InterfaceC971790bOb
    public final void LJIIL(EnumC971980bOu enumC971980bOu) {
        Fragment fragment;
        C972080bP4.LIZLLL("openSelectablePage", "TextHeaderService", 2);
        AnchorTextHeaderTemplateSelectionSheetFragment anchorTextHeaderTemplateSelectionSheetFragment = this.LJIIIZ;
        if (anchorTextHeaderTemplateSelectionSheetFragment != null) {
            anchorTextHeaderTemplateSelectionSheetFragment.close(1);
        }
        C19EG c19eg = null;
        this.LJIIIZ = null;
        String str = AnchorTextHeaderTemplateSelectionSheetFragment._pnsPageId;
        AnchorTextHeaderTemplateSelectionSheetFragment anchorTextHeaderTemplateSelectionSheetFragment2 = new AnchorTextHeaderTemplateSelectionSheetFragment(this.LIZIZ, new AwS466S0200000_31(this, enumC971980bOu, 2));
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openSelectablePage$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AnchorTextHeaderTemplateSelectionSheetFragment anchorTextHeaderTemplateSelectionSheetFragment3 = this.LL.LJIIIZ;
                    if (anchorTextHeaderTemplateSelectionSheetFragment3 != null) {
                        lifecycle = anchorTextHeaderTemplateSelectionSheetFragment3.getLifecycle();
                    } else {
                        lifecycle = null;
                    }
                    if (Intrinsics.LJFF(lifecycle, lifecycleOwner)) {
                        this.LL.LJIIIZ = null;
                        LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                        if (lifecycleEventObserver != null) {
                            lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                        }
                    }
                }
            }
        };
        anchorTextHeaderTemplateSelectionSheetFragment2.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
        WeakReference<Fragment> weakReference = this.LIZJ;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference<C19EG> weakReference2 = this.LIZLLL;
        if (weakReference2 != null) {
            c19eg = weakReference2.get();
        }
        C176600m4.LIZIZ(Boolean.valueOf(anchorTextHeaderTemplateSelectionSheetFragment2.wS(fragment, c19eg, "TextHeaderTemplateSelectionSheetFragment")));
        this.LJIIIZ = anchorTextHeaderTemplateSelectionSheetFragment2;
    }

    @Override // X.InterfaceC971790bOb
    public final void LJIILIIL(TextHeaderPlayContent textHeaderPlayContent) {
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (anchorTextHeaderViewModelLJIIZILJ != null) {
            C300201Ei c300201EiLQ2 = anchorTextHeaderViewModelLJIIZILJ.wQ2();
            c300201EiLQ2.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateContentFromResume source:");
            sbLIZ.append("resume");
            C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "AnchorTextHeaderModel", 2);
            c300201EiLQ2.LJII(textHeaderPlayContent, "resume");
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openTextHeaderAllListPage$1$1] */
    public final void LJIJJLI(int i) {
        Fragment fragment;
        LJIL(EnumC971980bOu.ALL_LIST_TYPE, "openTextHeaderAllListPage");
        if (LJIJ()) {
            LJIJJ();
            return;
        }
        AnchorTextHeaderAllListSheetFragment anchorTextHeaderAllListSheetFragment = this.LJII;
        if (anchorTextHeaderAllListSheetFragment != null) {
            anchorTextHeaderAllListSheetFragment.close(1);
        }
        C19EG c19eg = null;
        this.LJII = null;
        String str = AnchorTextHeaderAllListSheetFragment._pnsPageId;
        AnchorTextHeaderAllListSheetFragment anchorTextHeaderAllListSheetFragment2 = new AnchorTextHeaderAllListSheetFragment(this.LIZIZ, LJIIZILJ(), i);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$openTextHeaderAllListPage$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AnchorTextHeaderAllListSheetFragment anchorTextHeaderAllListSheetFragment3 = this.LL.LJII;
                    if (anchorTextHeaderAllListSheetFragment3 != null) {
                        lifecycle = anchorTextHeaderAllListSheetFragment3.getLifecycle();
                    } else {
                        lifecycle = null;
                    }
                    if (Intrinsics.LJFF(lifecycle, lifecycleOwner)) {
                        this.LL.LJII = null;
                        LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                        if (lifecycleEventObserver != null) {
                            lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                        }
                    }
                }
            }
        };
        anchorTextHeaderAllListSheetFragment2.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
        WeakReference<Fragment> weakReference = this.LIZJ;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference<C19EG> weakReference2 = this.LIZLLL;
        if (weakReference2 != null) {
            c19eg = weakReference2.get();
        }
        if (C176600m4.LIZIZ(Boolean.valueOf(anchorTextHeaderAllListSheetFragment2.wS(fragment, c19eg, "AnchorTextHeaderAllListSheetFragment"))) && LJIJ()) {
            LJIJJ();
        }
        this.LJII = anchorTextHeaderAllListSheetFragment2;
    }

    @Override // X.InterfaceC20355514kr
    public final void LIZLLL(C5182020e c5182020e, C5182020e c5182020e2) {
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (anchorTextHeaderViewModelLJIIZILJ != null) {
            anchorTextHeaderViewModelLJIIZILJ.KQ2(c5182020e, c5182020e2);
        }
    }

    @Override // X.InterfaceC971790bOb
    public final void LJI(EnumC971980bOu enumC971980bOu, EnumC952890au7 enumC952890au7) {
        Fragment fragment;
        C946850akN.LIZIZ = enumC952890au7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openTextHeaderPage pageType:");
        sbLIZ.append(enumC971980bOu);
        sbLIZ.append(" textHeaderOpenPageSource:");
        sbLIZ.append(enumC952890au7);
        LJIJI(C2188811AlT.LIZIZ(sbLIZ));
        int i = C19367910px.LIZ[enumC971980bOu.ordinal()];
        if (i != 1) {
            if (i == 2 && this.LJI == null) {
                String str = AnchorTextHeaderListSheetFragment._pnsPageId;
                DataChannel dataChannel = this.LIZIZ;
                AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
                AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 167);
                AnchorTextHeaderListSheetFragment anchorTextHeaderListSheetFragment = new AnchorTextHeaderListSheetFragment(enumC952890au7, dataChannel, anchorTextHeaderViewModelLJIIZILJ);
                anchorTextHeaderListSheetFragment.LLLFF = awS575S0100000_31;
                WeakReference<Fragment> weakReference = this.LIZJ;
                C19EG c19eg = null;
                if (weakReference != null) {
                    fragment = weakReference.get();
                } else {
                    fragment = null;
                }
                WeakReference<C19EG> weakReference2 = this.LIZLLL;
                if (weakReference2 != null) {
                    c19eg = weakReference2.get();
                }
                C176600m4.LIZIZ(Boolean.valueOf(anchorTextHeaderListSheetFragment.wS(fragment, c19eg, "AnchorTextHeaderListSheetFragment")));
                this.LJI = anchorTextHeaderListSheetFragment;
                return;
            }
            return;
        }
        LJIJJLI(0);
    }

    public final void LJIL(EnumC971980bOu enumC971980bOu, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateOpenTextHeaderEditPageType openTextHeaderEditPageType:");
        sbLIZ.append(enumC971980bOu);
        sbLIZ.append(" source:");
        sbLIZ.append(str);
        LJIJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIJJI = enumC971980bOu;
    }

    public AnchorTextHeaderService(DataChannel dataChannel, WeakReference<Fragment> weakReference, WeakReference<C19EG> weakReference2) {
        this.LIZIZ = dataChannel;
        this.LIZJ = weakReference;
        this.LIZLLL = weakReference2;
    }

    @Override // X.InterfaceC971790bOb
    public final void LIZJ(C01ZA c01za, EnumC971980bOu enumC971980bOu, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openEditPage fromPageType:");
        sbLIZ.append(enumC971980bOu);
        sbLIZ.append(" textHeaderRecordInfo:");
        sbLIZ.append(c01za);
        LJIJI(C2188811AlT.LIZIZ(sbLIZ));
        LJIL(enumC971980bOu, "openEditPage");
        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment = this.LJIIIIZZ;
        if (anchorTextHeaderCreationSheetFragment != null) {
            anchorTextHeaderCreationSheetFragment.close(1);
        }
        this.LJIIIIZZ = null;
        this.LJIIIIZZ = LJIILLIIL(c01za, z, false, "");
    }

    @Override // X.InterfaceC20355514kr
    public final void LJIIJ(String str, AwS112S0201000_31 awS112S0201000_31, Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecordInfoByMediaNodeId mediaNodeId:");
        sbLIZ.append(str);
        LJIJI(C2188811AlT.LIZIZ(sbLIZ));
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (anchorTextHeaderViewModelLJIIZILJ != null) {
            BaseTextHeaderViewModel.xQ2(anchorTextHeaderViewModelLJIIZILJ, str, awS112S0201000_31, function1);
        }
    }

    @Override // X.InterfaceC971790bOb
    public final void LJIILL(C00UM c00um, EnumC971980bOu enumC971980bOu, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openCreatePageFromTemplate fromPageType:");
        sbLIZ.append(enumC971980bOu);
        sbLIZ.append(" templateRecordInfo:");
        sbLIZ.append(c00um);
        LJIJI(C2188811AlT.LIZIZ(sbLIZ));
        LJIL(enumC971980bOu, "openCreatePageFromTemplate");
        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment = this.LJIIIIZZ;
        if (anchorTextHeaderCreationSheetFragment != null) {
            anchorTextHeaderCreationSheetFragment.close(1);
        }
        this.LJIIIIZZ = null;
        this.LJIIIIZZ = LJIILLIIL(c00um.LIZ, z, true, c00um.LIZJ);
    }

    @Override // X.InterfaceC971790bOb
    public final void LJII(int i, Context context, EnumC971980bOu enumC971980bOu, boolean z) {
        String str = "";
        if (i != 1) {
            if (i == 2 && context != null) {
                IInteractService iInteractServiceLIZLLL = C915980Zwa.LIZLLL();
                DataChannel dataChannel = this.LIZIZ;
                EnumC952890au7 enumC952890au7 = EnumC952890au7.TEXT_HEADER;
                C953610avH.LJJI.getClass();
                String str2 = C953610avH.LJJII;
                if (str2 != null) {
                    str = str2;
                }
                iInteractServiceLIZLLL.Bg0(context, dataChannel, enumC952890au7, new C916750Zxp(2, 0L, str), true, true, new WeakReference<>(this.LJIIL.getValue()), "", null, "");
                return;
            }
            return;
        }
        LJIL(enumC971980bOu, "openTextHeaderCreationPage");
        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment = this.LJIIIIZZ;
        if (anchorTextHeaderCreationSheetFragment != null) {
            anchorTextHeaderCreationSheetFragment.close(1);
        }
        this.LJIIIIZZ = null;
        this.LJIIIIZZ = LJIILLIIL(null, z, false, "");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$createTextHeaderCreationSheetFragment$2$1] */
    public final AnchorTextHeaderCreationSheetFragment LJIILLIIL(C01ZA c01za, boolean z, boolean z2, String str) {
        C01F5 c01f5;
        boolean z3;
        Fragment fragment;
        C01ZA c01za2 = c01za;
        C19EG c19eg = null;
        if (c01za2 != null) {
            c01f5 = c01za2.LIZ;
        } else {
            c01f5 = null;
        }
        if (c01f5 != null && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        String str2 = AnchorTextHeaderCreationSheetFragment._pnsPageId;
        DataChannel dataChannel = this.LIZIZ;
        AnchorTextHeaderViewModel anchorTextHeaderViewModelLJIIZILJ = LJIIZILJ();
        if (c01f5 == null) {
            c01za2 = null;
        }
        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragmentLIZ = C20423314vn.LIZ(dataChannel, anchorTextHeaderViewModelLJIIZILJ, z3, c01za2, null, str, false, 0, null, null, null, z, 2000);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService$createTextHeaderCreationSheetFragment$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment = this.LL.LJIIIIZZ;
                    if (anchorTextHeaderCreationSheetFragment != null) {
                        lifecycle = anchorTextHeaderCreationSheetFragment.getLifecycle();
                    } else {
                        lifecycle = null;
                    }
                    if (Intrinsics.LJFF(lifecycle, lifecycleOwner)) {
                        this.LL.LJIIIIZZ = null;
                        LifecycleEventObserver lifecycleEventObserver = c259800zU.element;
                        if (lifecycleEventObserver != null) {
                            lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                        }
                    }
                }
            }
        };
        anchorTextHeaderCreationSheetFragmentLIZ.getLifecycle().addObserver((LifecycleObserver) c259800zU.element);
        WeakReference<Fragment> weakReference = this.LIZJ;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference<C19EG> weakReference2 = this.LIZLLL;
        if (weakReference2 != null) {
            c19eg = weakReference2.get();
        }
        C176600m4.LIZIZ(Boolean.valueOf(anchorTextHeaderCreationSheetFragmentLIZ.wS(fragment, c19eg, "AnchorTextHeaderCreationSheetFragment")));
        return anchorTextHeaderCreationSheetFragmentLIZ;
    }
}
