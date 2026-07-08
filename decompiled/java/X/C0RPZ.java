package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.tns.label.TnSWarningLabelAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoInfoGenreTagContainerAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.SentinelSpaceTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.FcpAnnotationContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomDescLabelContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.titlecontainer.InteractTitleContainer;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPZ {
    public static final String LJIIJJI;
    public static final Set<String> LJIIL;
    public static final LinkedHashSet<String> LJIILIIL;
    public static final Set<String> LJIILJJIL;
    public static final String LJIILL;
    public static final String LJIILLIIL;
    public static final String LJIIZILJ;
    public static final String LJIJ;
    public static final String LJIJI;
    public static final String LJIJJ;
    public static final String LJIJJLI;
    public static final String LJIL;
    public static final String LJJ;
    public static final String LJJI;
    public static final List<String> LJJIFFI;
    public final int LIZ;
    public final int LIZIZ;
    public final Map<String, Integer> LIZJ;
    public final LinkedHashMap<String, C695310RPd> LIZLLL;
    public final Map<String, ReusedUIAssem<? extends C03H5>> LJ;
    public final Map<String, ReusedUIAssem<? extends C03H5>> LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public C0RPV LJIIIZ;
    public boolean LJIIJ;

    static {
        C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iqLLIIIJ;
        C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iqLJLIL;
        C19719912Dl c19719912DlLJIILL;
        C19719912Dl c19719912DlLJIIZILJ;
        C19719912Dl c19719912DlLJJI;
        String canonicalName = VideoBottomDescLabelContainer.class.getCanonicalName();
        LJIIJJI = canonicalName;
        Set<String> setLJLIIL = !C299610Bol.LIZ() ? C13LQ.LJLIIL(new String[]{VideoMusicTitleAssem.class.getCanonicalName(), TnSWarningLabelAssem.class.getCanonicalName(), "native_ad_bottom_label_view"}) : C13LQ.LJLIIL(new String[]{TnSWarningLabelAssem.class.getCanonicalName(), "native_ad_bottom_label_view"});
        LJIIL = setLJLIIL;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(setLJLIIL);
        linkedHashSet.remove("native_ad_bottom_label_view");
        linkedHashSet.add(canonicalName);
        LJIILIIL = linkedHashSet;
        String[] strArr = new String[13];
        strArr[0] = InteractBottomBannerComponent.class.getCanonicalName();
        strArr[1] = "download_progress_view";
        strArr[2] = "plugin_download_progress_view";
        strArr[3] = "ad4ad_label";
        strArr[4] = "ad_product_tile_view_stub";
        strArr[5] = FeedBottomButtonContainer.class.getCanonicalName();
        strArr[6] = FcpMetaTagContainer.class.getCanonicalName();
        strArr[7] = VideoTagContainer.class.getCanonicalName();
        strArr[8] = "intro_ll_padding";
        strArr[9] = "ad4ad_button";
        IAdComponentService iAdComponentService = (IAdComponentService) ServiceManager.get().getService(IAdComponentService.class);
        String canonicalName2 = null;
        strArr[10] = (iAdComponentService == null || (c19719912DlLJJI = iAdComponentService.LJJI()) == null) ? null : C09R7.LIZ(c19719912DlLJJI).getCanonicalName();
        strArr[11] = "ad_bottom_area_layout";
        C13IQ<? extends ReusedUIAssem<? extends C03H5>> c13iqLJIIZILJ = C1618440sDa.LIZIZ.LJJIIJ().LJIIZILJ();
        strArr[12] = c13iqLJIIZILJ != null ? C09R7.LIZ(c13iqLJIIZILJ).getCanonicalName() : null;
        Set<String> setLJ = C093Y.LJ(strArr);
        if (C299610Bol.LIZ()) {
            setLJ.add(SentinelSpaceTrigger.class.getCanonicalName());
        }
        IAdComponentService iAdComponentService2 = (IAdComponentService) PluggableExtentionKt.pluggableSpi$default(IAdComponentService.class, false, false, false, 14, null);
        if (iAdComponentService2 != null && (c19719912DlLJIIZILJ = iAdComponentService2.LJIIZILJ()) != null) {
            setLJ.add(C09R7.LIZ(c19719912DlLJIIZILJ).getCanonicalName());
        }
        IAdComponentService iAdComponentService3 = (IAdComponentService) PluggableExtentionKt.pluggableSpi$default(IAdComponentService.class, false, false, false, 14, null);
        if (iAdComponentService3 != null && (c19719912DlLJIILL = iAdComponentService3.LJIILL()) != null) {
            setLJ.add(C09R7.LIZ(c19719912DlLJIILL).getCanonicalName());
        }
        LJIILJJIL = setLJ;
        String canonicalName3 = FeedBottomButtonContainer.class.getCanonicalName();
        LJIILL = canonicalName3;
        ITranslationService iTranslationService = (ITranslationService) ServiceManager.get().getService(ITranslationService.class);
        LJIILLIIL = (iTranslationService == null || (c13iqLJLIL = iTranslationService.LJLIL()) == null) ? null : C09R7.LIZ(c13iqLJLIL).getCanonicalName();
        ITranslationService iTranslationService2 = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
        if (iTranslationService2 != null && (c13iqLLIIIJ = iTranslationService2.LLIIIJ()) != null) {
            canonicalName2 = C09R7.LIZ(c13iqLLIIIJ).getCanonicalName();
        }
        LJIIZILJ = canonicalName2;
        LJIJ = VideoTagContainer.class.getCanonicalName();
        LJIJI = InteractTitleContainer.class.getCanonicalName();
        LJIJJ = VideoAuthorInfoRelationAssem.class.getCanonicalName();
        LJIJJLI = FcpMetaTagContainer.class.getCanonicalName();
        LJIL = VideoInfoGenreTagContainerAssem.class.getCanonicalName();
        LJJ = FcpAnnotationContainer.class.getCanonicalName();
        LJJI = VideoMusicCoverAssem.class.getCanonicalName();
        LJJIFFI = C1697810uHb.LJIIJJI(VideoDescAssem.class.getCanonicalName(), canonicalName3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(int r8, android.view.ViewGroup r9) {
        /*
            int r5 = r9.getChildCount()
            r4 = 0
        L5:
            if (r4 >= r5) goto L88
            android.view.View r2 = r9.getChildAt(r4)
            X.01GW r0 = X.C265990Abd.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7 = 1
            if (r0 == r7) goto L1b
            r7 = 0
        L1b:
            r1 = 0
            r6 = 2131368276(0x7f0a1954, float:1.8356497E38)
            if (r7 == 0) goto L73
            if (r2 == 0) goto L71
            java.lang.Object r2 = r2.getTag(r6)
        L27:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L86
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L86
            int r3 = r2.intValue()
        L33:
            int r4 = r4 + 1
            if (r4 >= r5) goto L6f
            android.view.View r2 = r9.getChildAt(r4)
        L3b:
            if (r7 == 0) goto L58
            if (r2 == 0) goto L43
            java.lang.Object r1 = r2.getTag(r6)
        L43:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L6d
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L6d
            int r0 = r1.intValue()
        L4f:
            if (r3 < 0) goto L5
            if (r0 < 0) goto L5
            if (r8 < r3) goto L5
            if (r8 > r0) goto L5
            return r4
        L58:
            if (r2 == 0) goto L6d
            java.lang.Object r0 = r2.getTag(r6)
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r2.getTag(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L4f
        L6d:
            r0 = r4
            goto L4f
        L6f:
            r2 = r1
            goto L3b
        L71:
            r2 = r1
            goto L27
        L73:
            java.lang.Object r0 = r2.getTag(r6)
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L86
            java.lang.Object r0 = r2.getTag(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            goto L33
        L86:
            r3 = 0
            goto L33
        L88:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RPZ.LIZJ(int, android.view.ViewGroup):int");
    }

    public final void LIZLLL(View view, ReusedUIAssem reusedUIAssem) {
        int iIntValue;
        Set set;
        Set set2;
        ViewGroup viewGroup = (ViewGroup) view;
        String string = reusedUIAssem.getClass().toString();
        if (this.LIZJ.containsKey(string)) {
            View viewLJJIJL = reusedUIAssem.LJJIJL();
            Object tag = viewLJJIJL.getTag(R.id.eln);
            if ((tag instanceof String) && tag != null) {
                this.LJ.put((String) tag, (ReusedUIAssem<? extends C03H5>) reusedUIAssem);
            }
            Object tag2 = viewLJJIJL.getTag(R.id.elw);
            if (tag2 != null && (tag2 instanceof Integer)) {
                iIntValue = ((Number) tag2).intValue();
            } else {
                iIntValue = -1;
            }
            if (iIntValue == 0) {
                if (this.LJIIJ) {
                    set2 = LJIILIIL;
                } else {
                    set2 = LJIIL;
                }
                LIZ(this, viewGroup, viewLJJIJL, iIntValue, set2.contains(string), LJIILJJIL.contains(reusedUIAssem.getClass().getCanonicalName()));
            } else {
                int iLIZJ = LIZJ(iIntValue, viewGroup);
                if (this.LJIIJ) {
                    set = LJIILIIL;
                } else {
                    set = LJIIL;
                }
                LIZ(this, viewGroup, viewLJJIJL, iLIZJ, set.contains(string), LJIILJJIL.contains(reusedUIAssem.getClass().getCanonicalName()));
            }
            this.LIZJ.remove(string);
        }
    }

    public C0RPZ(boolean z, boolean z2, boolean z3) {
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        this.LIZ = C693770RJf.LIZ();
        this.LIZIZ = C693770RJf.LIZIZ();
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap<>();
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
        this.LJI = true;
        this.LJII = true;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
    }

    public final View LIZIZ(int i, ViewGroup viewGroup, ReusedUIAssem<? extends C03H5> reusedUIAssem, RootCellCommonAbility rootCellCommonAbility) {
        String canonicalName;
        int childCount;
        ViewGroup c708910RrN;
        int i2;
        Set set;
        EnumC697290RWt enumC697290RWt;
        InterfaceC695290RPb interfaceC695290RPb;
        View viewQg;
        Set set2;
        boolean z = reusedUIAssem instanceof BaseCellPlaceHolderComponent;
        if (z) {
            canonicalName = ((BaseCellPlaceHolderComponent) reusedUIAssem).LLJJJJLIIL;
        } else {
            canonicalName = reusedUIAssem.getClass().getCanonicalName();
        }
        if (viewGroup.getId() == R.id.kv_ && C299510Bob.LIZ() && C695320RPe.LIZ.contains(canonicalName)) {
            childCount = viewGroup.indexOfChild(viewGroup.findViewById(R.id.kva));
        } else {
            childCount = viewGroup.getChildCount();
        }
        int i3 = i + childCount;
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(reusedUIAssem.getClass());
            BaseCellPlaceHolderComponent baseCellPlaceHolderComponent = (BaseCellPlaceHolderComponent) reusedUIAssem;
            sbLIZ.append(baseCellPlaceHolderComponent.LLJJJJLIIL);
            this.LIZLLL.put(C2188811AlT.LIZIZ(sbLIZ), (C695310RPd) new Object() { // from class: X.0RPd
            });
            if (rootCellCommonAbility != null && (viewQg = rootCellCommonAbility.Qg(baseCellPlaceHolderComponent.LLJJJJLIIL, false)) != null) {
                viewQg.setTag(R.id.elw, Integer.valueOf(i3));
                viewQg.setTag(R.id.eln, canonicalName);
                C0RPV c0rpv = this.LJIIIZ;
                if (this.LJIIIIZZ && c0rpv != null) {
                    C695280RPa c695280RPaLIZ = c0rpv.LIZ(baseCellPlaceHolderComponent.LLJJJJLIIL);
                    C426750GoL.LJIIIZ(viewQg, Integer.valueOf(c695280RPaLIZ.LIZJ), Integer.valueOf(c695280RPaLIZ.LIZ), Integer.valueOf(c695280RPaLIZ.LIZLLL), Integer.valueOf(c695280RPaLIZ.LIZIZ), false, 16);
                    LIZ(this, viewGroup, viewQg, -1, false, false);
                    return viewQg;
                }
                if (LJIILJJIL.contains(baseCellPlaceHolderComponent.LLJJJJLIIL)) {
                    LIZ(this, viewGroup, viewQg, -1, false, true);
                    return viewQg;
                }
                if (this.LJIIJ) {
                    set2 = LJIILIIL;
                } else {
                    set2 = LJIIL;
                }
                LIZ(this, viewGroup, viewQg, -1, set2.contains(baseCellPlaceHolderComponent.LLJJJJLIIL), false);
                return viewQg;
            }
            View view = new View(viewGroup.getContext());
            C0RPV c0rpv2 = this.LJIIIZ;
            if (this.LJIIIIZZ && c0rpv2 != null) {
                C695280RPa c695280RPaLIZ2 = c0rpv2.LIZ(baseCellPlaceHolderComponent.LLJJJJLIIL);
                C426750GoL.LJIIIZ(view, Integer.valueOf(c695280RPaLIZ2.LIZJ), Integer.valueOf(c695280RPaLIZ2.LIZ), Integer.valueOf(c695280RPaLIZ2.LIZLLL), Integer.valueOf(c695280RPaLIZ2.LIZIZ), false, 16);
            }
            return view;
        }
        this.LIZLLL.put(reusedUIAssem.getClass().toString(), (C695310RPd) new Object() { // from class: X.0RPd
        });
        String canonicalName2 = reusedUIAssem.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            canonicalName2 = "";
        }
        Context context = viewGroup.getContext();
        String str = LJIILL;
        boolean zLJFF = Intrinsics.LJFF(str, canonicalName2);
        String str2 = LJIIJJI;
        int i4 = -1;
        if (zLJFF) {
            C705830RmP c705830RmP = new C705830RmP(context, null);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705830RmP);
            c705830RmP.setLayoutParams(marginLayoutParams);
            c705830RmP.setOrientation(1);
            c705830RmP.setClipChildren(false);
            c705830RmP.setClipToPadding(false);
            c708910RrN = c705830RmP;
        } else if (Intrinsics.LJFF(LJIJ, canonicalName2)) {
            C705830RmP c705830RmP2 = new C705830RmP(context, null);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705830RmP2);
            c705830RmP2.setLayoutParams(marginLayoutParams2);
            c705830RmP2.setOrientation(0);
            c705830RmP2.setClipChildren(false);
            c705830RmP2.setClipToPadding(false);
            c708910RrN = c705830RmP2;
        } else if (Intrinsics.LJFF(LJIJJLI, canonicalName2)) {
            C705830RmP c705830RmP3 = new C705830RmP(context, null);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705830RmP3);
            c705830RmP3.setLayoutParams(marginLayoutParams3);
            c705830RmP3.setOrientation(1);
            c705830RmP3.setClipChildren(false);
            c705830RmP3.setClipToPadding(false);
            c708910RrN = c705830RmP3;
        } else if (Intrinsics.LJFF(LJIJI, canonicalName2) || (Intrinsics.LJFF(LJIJJ, canonicalName2) && C300390Bq1.LIZ())) {
            C705830RmP c705830RmP4 = new C705830RmP(context, null);
            ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705830RmP4);
            c705830RmP4.setLayoutParams(marginLayoutParams4);
            c705830RmP4.setOrientation(0);
            c705830RmP4.setClipChildren(false);
            c705830RmP4.setClipToPadding(false);
            c708910RrN = c705830RmP4;
        } else if (Intrinsics.LJFF(str2, canonicalName2)) {
            C703950RjN c703950RjN = new C703950RjN(context);
            ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c703950RjN);
            c703950RjN.setLayoutParams(marginLayoutParams5);
            c703950RjN.setFlexWrap(1);
            c703950RjN.requestDisallowInterceptTouchEvent(true);
            c708910RrN = c703950RjN;
        } else if (Intrinsics.LJFF(LJJI, canonicalName2)) {
            c708910RrN = new C705800RmM(context);
        } else {
            c708910RrN = new C708910RrN(context, null);
        }
        if (!this.LJI && !LJJIFFI.contains(canonicalName2)) {
            i4 = -2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(i4, -2);
        C0RPV c0rpv3 = this.LJIIIZ;
        if (this.LJIIIIZZ && c0rpv3 != null) {
            C695280RPa c695280RPaLIZ3 = c0rpv3.LIZ(canonicalName2);
            marginLayoutParams6.setMargins(c695280RPaLIZ3.LIZJ, c695280RPaLIZ3.LIZ, c695280RPaLIZ3.LIZLLL, c695280RPaLIZ3.LIZIZ);
        }
        C786410Ut5.X5(marginLayoutParams6, c708910RrN);
        if (reusedUIAssem instanceof BaseContainer) {
            if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), str)) {
                i2 = R.id.elx;
            } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), str2)) {
                i2 = R.id.elm;
            } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), LJIJI)) {
                i2 = R.id.elz;
            } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), LJIJJLI)) {
                i2 = R.id.elt;
            } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), LJIL)) {
                i2 = R.id.eml;
            } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), LJIJ)) {
                i2 = R.id.emp;
            } else {
                i2 = R.id.ely;
            }
        } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), LJIILLIIL)) {
            i2 = R.id.elv;
        } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), LJIIZILJ)) {
            i2 = R.id.ell;
        } else if (Intrinsics.LJFF(reusedUIAssem.getClass().getCanonicalName(), LJJ)) {
            i2 = R.id.ekj;
        } else {
            i2 = R.id.elw;
        }
        c708910RrN.setId(i2);
        int id = c708910RrN.getId();
        if (C715260S3w.LIZIZ() && (id == R.id.emp || id == R.id.elx)) {
            C445600Hde c445600Hde = new C445600Hde(reusedUIAssem);
            if (id == R.id.emp) {
                enumC697290RWt = EnumC697290RWt.P_TAG_FCP;
            } else {
                enumC697290RWt = EnumC697290RWt.P_BOTTOM_BUTTON_FCP;
            }
            if ((c708910RrN instanceof InterfaceC695290RPb) && (interfaceC695290RPb = (InterfaceC695290RPb) c708910RrN) != null) {
                interfaceC695290RPb.setOnPerfListener(new C0RQQ(c708910RrN, enumC697290RWt, c445600Hde));
            }
        }
        C786410Ut5.LJLZ(8, c708910RrN);
        c708910RrN.setTag(R.id.elw, Integer.valueOf(i3));
        c708910RrN.setTag(R.id.eln, canonicalName);
        if (reusedUIAssem instanceof BaseCellTriggerComponent) {
            this.LIZJ.put(reusedUIAssem.getClass().toString(), Integer.valueOf(i3));
        } else {
            if (this.LJIIJ) {
                set = LJIILIIL;
            } else {
                set = LJIIL;
            }
            LIZ(this, viewGroup, c708910RrN, -1, set.contains(reusedUIAssem.getClass().getCanonicalName()), LJIILJJIL.contains(reusedUIAssem.getClass().getCanonicalName()));
            Object tag = c708910RrN.getTag(R.id.eln);
            if ((tag instanceof String) && tag != null) {
                this.LJ.put((String) tag, reusedUIAssem);
                return c708910RrN;
            }
        }
        return c708910RrN;
    }

    public static void LIZ(C0RPZ c0rpz, ViewGroup viewGroup, View view, int i, boolean z, boolean z2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i2;
        c0rpz.getClass();
        int i3 = 0;
        boolean z3 = true;
        if (viewGroup.getId() == R.id.kv_) {
            C693620RIq.LIZ(LIZJ(((Integer) view.getTag(R.id.elw)).intValue(), viewGroup), true, view, viewGroup);
        } else {
            if (viewGroup.getId() == R.id.elz) {
                C693620RIq.LIZ(i, false, view, viewGroup);
                if (!((Boolean) C0BAI.LIZ.getValue()).booleanValue()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                    return;
                }
                int iIntValue = ConstraintSizeVM.LL.getValue().intValue();
                int marginStart = marginLayoutParams2.getMarginStart();
                int i4 = marginLayoutParams2.topMargin;
                int i5 = marginLayoutParams2.bottomMargin;
                marginLayoutParams2.setMarginStart(marginStart);
                marginLayoutParams2.topMargin = i4;
                marginLayoutParams2.setMarginEnd(iIntValue);
                marginLayoutParams2.bottomMargin = i5;
                return;
            }
            if (view.getId() == R.id.elz) {
                C693620RIq.LIZ(i, false, view, viewGroup);
                if (((Boolean) C0BAI.LIZ.getValue()).booleanValue()) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        int i6 = -ConstraintSizeVM.LL.getValue().intValue();
                        int marginStart2 = marginLayoutParams.getMarginStart();
                        int i7 = marginLayoutParams.topMargin;
                        int i8 = marginLayoutParams.bottomMargin;
                        marginLayoutParams.setMarginStart(marginStart2);
                        marginLayoutParams.topMargin = i7;
                        marginLayoutParams.setMarginEnd(i6);
                        marginLayoutParams.bottomMargin = i8;
                    }
                }
            } else {
                C693620RIq.LIZ(i, false, view, viewGroup);
            }
        }
        if (c0rpz.LJIIIIZZ && c0rpz.LJIIIZ != null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        } else {
            marginLayoutParams3 = null;
        }
        if (marginLayoutParams3 != null) {
            if (!(viewGroup instanceof LinearLayout) || ((LinearLayout) viewGroup).getOrientation() != 0) {
                z3 = false;
            }
            if (z) {
                i2 = c0rpz.LIZIZ;
            } else {
                i2 = c0rpz.LIZ;
            }
            if (view.getId() == R.id.elm && C2521909uT.LIZ) {
                i2 -= ConstraintSizeVM.LLIZ;
            }
            if (z3) {
                int marginStart3 = marginLayoutParams3.getMarginStart();
                int i9 = marginLayoutParams3.topMargin;
                int i10 = marginLayoutParams3.bottomMargin;
                marginLayoutParams3.setMarginStart(marginStart3);
                marginLayoutParams3.topMargin = i9;
                marginLayoutParams3.setMarginEnd(i2);
                marginLayoutParams3.bottomMargin = i10;
            } else if (c0rpz.LJII && !z2) {
                int marginStart4 = marginLayoutParams3.getMarginStart();
                int i11 = marginLayoutParams3.topMargin;
                int marginEnd = marginLayoutParams3.getMarginEnd();
                marginLayoutParams3.setMarginStart(marginStart4);
                marginLayoutParams3.topMargin = i11;
                marginLayoutParams3.setMarginEnd(marginEnd);
                marginLayoutParams3.bottomMargin = i2;
            }
        }
        if (viewGroup.getId() != R.id.elm) {
            return;
        }
        if (!((Boolean) C0B8Q.LIZ.getValue()).booleanValue()) {
            i3 = 4;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
            return;
        }
        int i12 = ConstraintSizeVM.LLIZ;
        int marginStart5 = marginLayoutParams4.getMarginStart();
        int i13 = marginLayoutParams4.topMargin;
        marginLayoutParams4.setMarginStart(marginStart5);
        marginLayoutParams4.topMargin = i13;
        marginLayoutParams4.setMarginEnd(iLIZIZ);
        marginLayoutParams4.bottomMargin = i12;
    }
}
