package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS37S0300000_4;
import Y.ATListenerS449S0100000_16;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.commercialize.model.AlphaVideoData;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.model.AnolePlayerVideoDataModel;
import com.ss.android.ugc.aweme.model.CloseHeatZoneInfo;
import com.ss.android.ugc.aweme.model.CloseInfo;
import com.ss.android.ugc.aweme.model.ExtraVideoMap;
import com.ss.android.ugc.aweme.model.SponsoredInfo;
import com.ss.android.ugc.aweme.model.SponsoredLayoutInfo;
import com.ss.android.ugc.aweme.model.VideoConfigInfo;
import com.ss.android.ugc.aweme.model.VideoLayoutInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.AwS9S0101100_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018320cbe extends AbstractC1014240cV4 {
    public C1013610cU3 LLJLIL;
    public FrameLayout LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public TuxIconView LLJLLIL;
    public TuxIconView LLJLLL;
    public TextView LLJZ;
    public TextView LLJZIJLIL;
    public final Aweme LLL;
    public FrameLayout LLLF;
    public FrameLayout LLLFF;
    public final C23119094b LLLFFI;
    public final C054G LLLFZ;
    public int LLLI;
    public final C01GW LLLII;
    public final WeakReference<C1018320cbe> LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final AnolePlayerVideoDataModel LJJIII() {
        return (AnolePlayerVideoDataModel) this.LLLIIIL.getValue();
    }

    public final C1018340cbg LJJIIJ() {
        return (C1018340cbg) this.LLLIIIIL.getValue();
    }

    public final void LJJIJIIJI() {
        C1013610cU3 c1013610cU3 = this.LLJLIL;
        if (c1013610cU3 == null || !c1013610cU3.LIZJ()) {
            return;
        }
        C1013610cU3 c1013610cU32 = this.LLJLIL;
        if (c1013610cU32 != null) {
            c1013610cU32.LIZLLL();
        }
        LJJIIZI(this.LLJLIL != null ? r0.LIZ() : 0L);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        C1013610cU3 c1013610cU3 = this.LLJLIL;
        if (c1013610cU3 != null && c1013610cU3.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCurrentPosition:");
            C1013610cU3 c1013610cU32 = this.LLJLIL;
            sbLIZ.append(c1013610cU32 != null ? Integer.valueOf(c1013610cU32.LIZ()) : null);
            sbLIZ.append(" getWatchedDuration:");
            C1013610cU3 c1013610cU33 = this.LLJLIL;
            sbLIZ.append(c1013610cU33 != null ? Integer.valueOf(c1013610cU33.LIZIZ()) : null);
            C1022620cia.LIZ("AnolePlayerComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLJLIL != null) {
                LJJIIZI(r0.LIZ());
            }
        }
        ILikeEffectService iLikeEffectService = (ILikeEffectService) this.LLLII.getValue();
        if (iLikeEffectService != null) {
            iLikeEffectService.LJIIZILJ(false);
        }
        C1013610cU3 c1013610cU34 = this.LLJLIL;
        if (c1013610cU34 != null) {
            c1013610cU34.LJI();
        }
        FrameLayout frameLayout = this.LLJLILLLLZIIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        FrameLayout frameLayout2 = this.LLLF;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLLFF;
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(8, frameLayout3);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII;
        ExtraVideoMap extraVideoMap;
        VideoConfigInfo videoConfigInfo;
        FrameLayout frameLayout;
        CloseInfo closeInfo;
        FrameLayout.LayoutParams layoutParams;
        CloseInfo closeInfo2;
        TuxIconView tuxIconView;
        VideoConfigInfo videoConfigInfo2;
        VideoLayoutInfo videoLayoutInfo;
        FrameLayout.LayoutParams layoutParams2;
        VideoConfigInfo videoConfigInfo3;
        Integer num;
        int iIntValue;
        AlphaVideoData alphaVideoData;
        super.LIZJ();
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII2 = LJJIII();
        CloseHeatZoneInfo closeHeatZoneInfo = null;
        List<String> list = (anolePlayerVideoDataModelLJJIII2 == null || (alphaVideoData = anolePlayerVideoDataModelLJJIII2.video) == null) ? null : alphaVideoData.urlList;
        if ((list == null || list.isEmpty()) && ((anolePlayerVideoDataModelLJJIII = LJJIII()) == null || (extraVideoMap = anolePlayerVideoDataModelLJJIII.videoMap) == null || extraVideoMap.easterEggVideo == null)) {
            LJJIIZ("no_data");
            return;
        }
        ILikeEffectService iLikeEffectService = (ILikeEffectService) this.LLLII.getValue();
        if (iLikeEffectService != null) {
            iLikeEffectService.LJIIZILJ(false);
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.p9, this.LLJJIII, false);
        this.LLJJIJIL = viewTd;
        this.LLJLILLLLZIIL = viewTd != null ? (FrameLayout) viewTd.findViewById(R.id.aae) : null;
        View view = this.LLJJIJIL;
        this.LLJLL = view != null ? (FrameLayout) view.findViewById(R.id.aaf) : null;
        View view2 = this.LLJJIJIL;
        this.LLLF = view2 != null ? (FrameLayout) view2.findViewById(R.id.qtq) : null;
        View view3 = this.LLJJIJIL;
        this.LLLFF = view3 != null ? (FrameLayout) view3.findViewById(R.id.qt6) : null;
        View view4 = this.LLJJIJIL;
        this.LLJLLIL = view4 != null ? (TuxIconView) view4.findViewById(R.id.ch2) : null;
        View view5 = this.LLJJIJIL;
        this.LLJLLL = view5 != null ? (TuxIconView) view5.findViewById(R.id.e26) : null;
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII3 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII3 != null && (videoConfigInfo3 = anolePlayerVideoDataModelLJJIII3.videoConfigInfo) != null && (num = videoConfigInfo3.videoCorner) != null && (iIntValue = num.intValue()) > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue))));
            FrameLayout frameLayout2 = this.LLJLILLLLZIIL;
            if (frameLayout2 != null) {
                frameLayout2.setBackground(gradientDrawable);
            }
            FrameLayout frameLayout3 = this.LLJLILLLLZIIL;
            if (frameLayout3 != null) {
                frameLayout3.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            }
            FrameLayout frameLayout4 = this.LLJLILLLLZIIL;
            if (frameLayout4 != null) {
                frameLayout4.setClipToOutline(true);
            }
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII4 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII4 != null && (videoConfigInfo2 = anolePlayerVideoDataModelLJJIII4.videoConfigInfo) != null && (videoLayoutInfo = videoConfigInfo2.videoLayoutInfo) != null) {
            FrameLayout frameLayout5 = this.LLJLILLLLZIIL;
            ViewGroup.LayoutParams layoutParams3 = frameLayout5 != null ? frameLayout5.getLayoutParams() : null;
            if (!(layoutParams3 instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            }
            Integer num2 = videoLayoutInfo.top;
            layoutParams2.gravity = ((num2 != null || videoLayoutInfo.bottom == null) ? 48 : 80) | (videoLayoutInfo.left != null ? 8388611 : 8388613);
            layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2 != null ? num2.intValue() : 0)));
            Integer num3 = videoLayoutInfo.bottom;
            layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num3 != null ? num3.intValue() : 0)));
            Integer num4 = videoLayoutInfo.left;
            layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num4 != null ? num4.intValue() : 0))));
            Integer num5 = videoLayoutInfo.right;
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num5 != null ? num5.intValue() : 0))));
            FrameLayout frameLayout6 = this.LLJLILLLLZIIL;
            if (frameLayout6 != null) {
                C786410Ut5.a6(frameLayout6, layoutParams2);
            }
            View view6 = this.LLJJIJIL;
            if (view6 != null) {
                view6.setBackgroundColor(0);
            }
            FrameLayout frameLayout7 = this.LLJLILLLLZIIL;
            if (frameLayout7 != null) {
                frameLayout7.setBackgroundColor(0);
            }
            FrameLayout frameLayout8 = this.LLJLL;
            if (frameLayout8 != null) {
                frameLayout8.setBackgroundColor(0);
            }
            FrameLayout frameLayout9 = this.LLLF;
            if (frameLayout9 != null) {
                C786410Ut5.LJZ(8, frameLayout9);
            }
            FrameLayout frameLayout10 = this.LLLFF;
            if (frameLayout10 != null) {
                C786410Ut5.LJZ(8, frameLayout10);
            }
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII5 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII5 != null && Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII5.needMask, Boolean.FALSE)) {
            FrameLayout frameLayout11 = this.LLJLL;
            if (frameLayout11 != null) {
                frameLayout11.setBackgroundColor(0);
            }
            FrameLayout frameLayout12 = this.LLLF;
            if (frameLayout12 != null) {
                C786410Ut5.LJZ(8, frameLayout12);
            }
            FrameLayout frameLayout13 = this.LLLFF;
            if (frameLayout13 != null) {
                C786410Ut5.LJZ(8, frameLayout13);
            }
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII6 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII6 != null && Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII6.needSkipIcon, Boolean.FALSE) && (tuxIconView = this.LLJLLIL) != null) {
            C786410Ut5.LJZI(8, tuxIconView);
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII7 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII7 != null && anolePlayerVideoDataModelLJJIII7.closeInfo != null) {
            TuxIconView tuxIconView2 = this.LLJLLL;
            AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII8 = LJJIII();
            if (anolePlayerVideoDataModelLJJIII8 != null && (closeInfo2 = anolePlayerVideoDataModelLJJIII8.closeInfo) != null) {
                closeHeatZoneInfo = closeInfo2.closeHeatZoneInfo;
            }
            if (tuxIconView2 != null && closeHeatZoneInfo != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                Integer num6 = closeHeatZoneInfo.width;
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num6 != null ? num6.intValue() : 20)));
                Integer num7 = closeHeatZoneInfo.height;
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num7 != null ? num7.intValue() : 20)));
                tuxIconView2.setIconWidth(iLIZIZ);
                tuxIconView2.setIconHeight(iLIZIZ);
                ViewGroup.LayoutParams layoutParams4 = tuxIconView2.getLayoutParams();
                if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                    layoutParams.width = iLIZIZ2;
                    layoutParams.height = iLIZIZ3;
                    C786410Ut5.M6(tuxIconView2, layoutParams);
                }
                int iMax = Math.max(0, (iLIZIZ2 - iLIZIZ) / 2);
                int iMax2 = Math.max(0, (iLIZIZ3 - iLIZIZ) / 2);
                tuxIconView2.setPadding(iMax, iMax2, iMax, iMax2);
                Integer num8 = closeHeatZoneInfo.top;
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num8 != null ? num8.intValue() : 20))));
                Integer num9 = closeHeatZoneInfo.right;
                C426750GoL.LJIIIZ(tuxIconView2, 0, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num9 != null ? num9.intValue() : 20)))), 0, false, 16);
                AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII9 = LJJIII();
                if (anolePlayerVideoDataModelLJJIII9 != null && (closeInfo = anolePlayerVideoDataModelLJJIII9.closeInfo) != null && Intrinsics.LJFF(closeInfo.circleBackground, Boolean.TRUE)) {
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(1);
                    gradientDrawable2.setColor(0);
                    tuxIconView2.setBackground(gradientDrawable2);
                }
            }
            View view7 = this.LLJJIJIL;
            if (view7 != null) {
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 2), view7);
            }
            View view8 = this.LLJJIJIL;
            if (view8 != null) {
                view8.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0cbh
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view9) {
                        return true;
                    }
                });
            }
            TuxIconView tuxIconView3 = this.LLJLLL;
            if (tuxIconView3 != null) {
                C786410Ut5.a9(tuxIconView3, new ACListenerS151S0100000_16(this, 3));
            }
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII10 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII10 != null && (videoConfigInfo = anolePlayerVideoDataModelLJJIII10.videoConfigInfo) != null && videoConfigInfo.videoTouchEnable != null && (frameLayout = this.LLJLILLLLZIIL) != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS151S0100000_16(this, 4));
        }
        LJJII();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        this.LLLFFI.LIZIZ(null);
        this.LLJLIL = null;
        FrameLayout frameLayout = this.LLJLILLLLZIIL;
        if (frameLayout != null) {
            frameLayout.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLIIL.getValue());
        }
    }

    public final void LJJI() {
        VideoConfigInfo videoConfigInfo;
        Integer num;
        FrameLayout frameLayout;
        View view;
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
        if (anolePlayerVideoDataModelLJJIII == null || (videoConfigInfo = anolePlayerVideoDataModelLJJIII.videoConfigInfo) == null || (num = videoConfigInfo.videoCorner) == null || num.intValue() <= 0 || (frameLayout = this.LLJLILLLLZIIL) == null) {
            return;
        }
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
        gradientDrawable.setColor(0);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        frameLayout.setClipToOutline(true);
        Object parent = frameLayout.getParent();
        if (!(parent instanceof FrameLayout) || (view = (View) parent) == null) {
            return;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ});
        gradientDrawable2.setColor(0);
        view.setBackground(gradientDrawable2);
        view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        view.setClipToOutline(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.util.List] */
    public final C1013610cU3 LJJIFFI() {
        Collection collection;
        String strLJIILIIL;
        AlphaVideoData alphaVideoData;
        AlphaVideoData alphaVideoData2;
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
        String str = (anolePlayerVideoDataModelLJJIII == null || (alphaVideoData2 = anolePlayerVideoDataModelLJJIII.video) == null) ? null : alphaVideoData2.vid;
        C259800zU c259800zU = new C259800zU();
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII2 = LJJIII();
        c259800zU.element = (anolePlayerVideoDataModelLJJIII2 == null || (alphaVideoData = anolePlayerVideoDataModelLJJIII2.video) == null) ? 0 : alphaVideoData.urlList;
        if (str == null || str.length() == 0 || (collection = (Collection) c259800zU.element) == null || collection.isEmpty()) {
            return null;
        }
        ILikeEffectService iLikeEffectService = (ILikeEffectService) this.LLLII.getValue();
        if (iLikeEffectService != null && (strLJIILIIL = iLikeEffectService.LJIILIIL(str, (List) c259800zU.element)) != null && strLJIILIIL.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playModule played, localPath no null, localPath=");
            sbLIZ.append(strLJIILIIL);
            C1022620cia.LIZ("AnolePlayerComponent", C2188811AlT.LIZIZ(sbLIZ));
            c259800zU.element = Collections.singletonList(strLJIILIIL);
        }
        C1018330cbf c1018330cbf = new C1018330cbf(str, c259800zU, this);
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII3 = LJJIII();
        return new C1013610cU3(c1018330cbf, anolePlayerVideoDataModelLJJIII3 != null ? Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII3.isRepeated(), Boolean.TRUE) : false);
    }

    public final void LJJII() {
        SponsoredInfo sponsoredInfo;
        SponsoredLayoutInfo sponsoredLayoutInfo;
        ViewGroup viewGroup;
        FrameLayout.LayoutParams layoutParams;
        VideoConfigInfo videoConfigInfo;
        String str;
        FrameLayout.LayoutParams layoutParams2;
        int iIntValue;
        String labelName;
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
        if (anolePlayerVideoDataModelLJJIII == null || (sponsoredInfo = anolePlayerVideoDataModelLJJIII.sponsoredInfo) == null || (sponsoredLayoutInfo = sponsoredInfo.sponsoredLayoutInfo) == null) {
            TextView textView = this.LLJZ;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
            }
            TextView textView2 = this.LLJZIJLIL;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 8);
                return;
            }
            return;
        }
        View view = this.LLJJIJIL;
        if (!(view instanceof FrameLayout) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        if (this.LLJZ == null) {
            AwemeTextLabelModel label = this.LLILLJJLI.LIZLLL.getLabel();
            if (label == null || (labelName = label.getLabelName()) == null || labelName.length() <= 0) {
                labelName = "Sponsored";
            }
            TextView textView3 = new TextView(this.LLILZ);
            textView3.setText(labelName);
            textView3.setTextColor(-1);
            textView3.setTextSize(11.0f);
            textView3.setGravity(17);
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(82);
            textView3.setTypeface(c444890HcV.getTypeface());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            gradientDrawable.setColor(C475630Ikz.LIZIZ(R.attr.e_, textView3.getContext()));
            textView3.setBackground(gradientDrawable);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            textView3.setPadding(iLIZIZ, iLIZIZ2, iLIZIZ, iLIZIZ2);
            this.LLJZ = textView3;
        }
        LJJ(this.LLJZ, viewGroup);
        Integer num = sponsoredLayoutInfo.height;
        int iLIZIZ3 = (num == null || (iIntValue = num.intValue()) <= 0) ? -2 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        TextView textView4 = this.LLJZ;
        ViewGroup.LayoutParams layoutParams3 = textView4 != null ? textView4.getLayoutParams() : null;
        if (!(layoutParams3 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams3) == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = -2;
        layoutParams.height = iLIZIZ3;
        layoutParams.gravity = sponsoredLayoutInfo.right != null ? 8388661 : 8388659;
        Integer num2 = sponsoredLayoutInfo.top;
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2 != null ? num2.intValue() : 12)));
        layoutParams.setMarginStart(0);
        Integer num3 = sponsoredLayoutInfo.right;
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num3 != null ? num3.intValue() : 0))));
        TextView textView5 = this.LLJZ;
        if (textView5 != null) {
            C786410Ut5.g6(textView5, layoutParams);
        }
        TextView textView6 = this.LLJZ;
        if (textView6 != null) {
            C786410Ut5.LLIL(textView6, 0);
        }
        TextView textView7 = this.LLJZ;
        if (textView7 != null) {
            textView7.bringToFront();
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII2 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII2 == null || !Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII2.enableAigcTag, Boolean.TRUE) || (str = anolePlayerVideoDataModelLJJIII2.aigcTagText) == null || str.length() == 0) {
            TextView textView8 = this.LLJZIJLIL;
            if (textView8 != null) {
                C786410Ut5.LLIL(textView8, 8);
            }
        } else {
            if (this.LLJZIJLIL == null) {
                TextView textView9 = new TextView(this.LLILZ);
                textView9.setText(anolePlayerVideoDataModelLJJIII2.aigcTagText);
                textView9.setTextColor(-1);
                textView9.setTextSize(11.0f);
                textView9.setGravity(17);
                C444890HcV c444890HcV2 = new C444890HcV();
                c444890HcV2.LIZ(82);
                textView9.setTypeface(c444890HcV2.getTypeface());
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                gradientDrawable2.setColor(C475630Ikz.LIZIZ(R.attr.e_, textView9.getContext()));
                textView9.setBackground(gradientDrawable2);
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                textView9.setPadding(iLIZIZ4, iLIZIZ5, iLIZIZ4, iLIZIZ5);
                this.LLJZIJLIL = textView9;
            }
            LJJ(this.LLJZIJLIL, viewGroup);
            TextView textView10 = this.LLJZIJLIL;
            ViewGroup.LayoutParams layoutParams4 = textView10 != null ? textView10.getLayoutParams() : null;
            if (!(layoutParams4 instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) == null) {
                layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams2.width = -2;
            layoutParams2.height = iLIZIZ3;
            TextView textView11 = this.LLJZ;
            if (textView11 != null) {
                HandlerHook.viewPost(textView11, new ARunnableS37S0300000_4(layoutParams, layoutParams2, this, 0));
            }
            TextView textView12 = this.LLJZIJLIL;
            if (textView12 != null) {
                C786410Ut5.LLIL(textView12, 0);
            }
            TextView textView13 = this.LLJZIJLIL;
            if (textView13 != null) {
                textView13.bringToFront();
            }
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII3 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII3 == null || (videoConfigInfo = anolePlayerVideoDataModelLJJIII3.videoConfigInfo) == null || videoConfigInfo.videoTouchEnable == null) {
            return;
        }
        ACListenerS151S0100000_16 aCListenerS151S0100000_16 = new ACListenerS151S0100000_16(this, 1);
        TextView textView14 = this.LLJZ;
        if (textView14 != null) {
            C786410Ut5.T7(textView14, aCListenerS151S0100000_16);
        }
        TextView textView15 = this.LLJZIJLIL;
        if (textView15 != null) {
            C786410Ut5.T7(textView15, aCListenerS151S0100000_16);
        }
        C2271391DvN.LIZ(this.LLJZ, (C1A5L) C2271381DvM.h.getValue());
        C2271391DvN.LIZ(this.LLJZIJLIL, (C1A5L) C2271381DvM.i.getValue());
    }

    public final boolean LJJIJ() {
        VideoConfigInfo videoConfigInfo;
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
        if (anolePlayerVideoDataModelLJJIII == null || (videoConfigInfo = anolePlayerVideoDataModelLJJIII.videoConfigInfo) == null) {
            return false;
        }
        return Intrinsics.LJFF(videoConfigInfo.needReportOthershow, Boolean.TRUE);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final View getContentView() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        C1018320cbe c1018320cbe;
        C1018340cbg c1018340cbgLJJIIJ;
        super.LJII(anoleComponentAppearModel);
        LJJIJIIJIL("didShow");
        C1013610cU3 c1013610cU3LJJIFFI = LJJIFFI();
        this.LLJLIL = c1013610cU3LJJIFFI;
        if (c1013610cU3LJJIFFI != null) {
            c1013610cU3LJJIFFI.LJ();
        }
        FrameLayout frameLayout = this.LLJLILLLLZIIL;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new ATListenerS449S0100000_16(this, 1));
        }
        if (LJJIJ() && (c1018320cbe = this.LLLIIII.get()) != null && (c1018340cbgLJJIIJ = c1018320cbe.LJJIIJ()) != null) {
            c1018340cbgLJJIIJ.LIZJ(this.LLL);
        }
        C1022620cia.LIZ("AnolePlayerComponent", "playModule played");
        LJJII();
    }

    public final void LJJIIJZLJL(boolean z) {
        VideoConfigInfo videoConfigInfo;
        boolean zLJFF;
        VideoConfigInfo videoConfigInfo2;
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
        if (anolePlayerVideoDataModelLJJIII != null && (videoConfigInfo = anolePlayerVideoDataModelLJJIII.videoConfigInfo) != null && Intrinsics.LJFF(videoConfigInfo.useAnoleHiddenConfig, Boolean.TRUE)) {
            AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII2 = LJJIII();
            if (anolePlayerVideoDataModelLJJIII2 != null && (videoConfigInfo2 = anolePlayerVideoDataModelLJJIII2.videoConfigInfo) != null) {
                zLJFF = Intrinsics.LJFF(videoConfigInfo2.notHiddenWhenUnvisible, Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (this.LLLI == 1 || !zLJFF) {
                LJIIZILJ();
                if (this.LLLI != 1) {
                    this.LLILLL.LJIJ(C991620bua.LIZ, this);
                }
            }
        } else {
            LJIIZILJ();
            this.LLILLL.LJIJ(C991620bua.LIZ, this);
        }
        if (!z) {
            return;
        }
        LJJIJIIJI();
    }

    public final void LJJIIZ(String str) {
        C1018320cbe c1018320cbe;
        C1018340cbg c1018340cbgLJJIIJ;
        String authorUid;
        if (!LJJIJ() && (c1018320cbe = this.LLLIIII.get()) != null && (c1018340cbgLJJIIJ = c1018320cbe.LJJIIJ()) != null) {
            Aweme aweme = this.LLL;
            if (c1018340cbgLJJIIJ.LIZIZ()) {
                C1018400cbm c1018400cbmLIZ = c1018340cbgLJJIIJ.LIZ();
                c1018400cbmLIZ.logAd(c1018400cbmLIZ.LJFF, new AwS130S1100000_16(str, c1018400cbmLIZ, 0));
                return;
            }
            C1018380cbk c1018380cbk = (C1018380cbk) c1018340cbgLJJIIJ.LJ.getValue();
            String str2 = c1018340cbgLJJIIJ.LIZLLL;
            c1018380cbk.getClass();
            if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
                c1018380cbk.logAd(c1018380cbk.LIZLLL, new AwS67S1000000_16(str, 4));
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            String aid = null;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (aweme != null) {
                aid = aweme.getAid();
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("fail_reason", str);
            c2344009Gk.LIZJ(1, "nova_like_effect_type");
            C20684815ws.LJIILLIIL("nova_like_effect_view_fail", c2344009Gk.LIZ);
        }
    }

    public final void LJJIIZI(long j) {
        C1018340cbg c1018340cbgLJJIIJ;
        C1018320cbe c1018320cbe = this.LLLIIII.get();
        if (c1018320cbe != null && (c1018340cbgLJJIIJ = c1018320cbe.LJJIIJ()) != null) {
            Aweme aweme = this.LLL;
            int i = this.LLLI;
            if (c1018340cbgLJJIIJ.LIZIZ()) {
                C1018400cbm c1018400cbmLIZ = c1018340cbgLJJIIJ.LIZ();
                c1018400cbmLIZ.logAd(c1018400cbmLIZ.LIZJ, new AwS9S0101100_16(c1018400cbmLIZ, i, j, 3));
            } else {
                ((C1018380cbk) c1018340cbgLJJIIJ.LJ.getValue()).LJJIIZ(j, c1018340cbgLJJIIJ.LIZLLL, aweme);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1018320cbe.LJJIJIIJIL(java.lang.String):void");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        VideoConfigInfo videoConfigInfo;
        C1018320cbe c1018320cbe;
        boolean zLJFF;
        C1013610cU3 c1013610cU3;
        VideoConfigInfo videoConfigInfo2;
        if (abstractC1003980cEW instanceof C991730bul) {
            if (!((C991730bul) abstractC1003980cEW).LIZ) {
                AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
                if (anolePlayerVideoDataModelLJJIII != null && (videoConfigInfo2 = anolePlayerVideoDataModelLJJIII.videoConfigInfo) != null) {
                    zLJFF = Intrinsics.LJFF(videoConfigInfo2.notHiddenWhenUnvisible, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                if (zLJFF) {
                    C1018320cbe c1018320cbe2 = this.LLLIIII.get();
                    if (c1018320cbe2 != null) {
                        View view = c1018320cbe2.LLJJIJIL;
                        if (view != null) {
                            C786410Ut5.LJLLLLLL(0, view);
                        }
                        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII2 = LJJIII();
                        if (anolePlayerVideoDataModelLJJIII2 != null && Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII2.needMask, Boolean.TRUE)) {
                            FrameLayout frameLayout = c1018320cbe2.LLLF;
                            if (frameLayout != null) {
                                C786410Ut5.LJZ(0, frameLayout);
                            }
                            FrameLayout frameLayout2 = c1018320cbe2.LLLFF;
                            if (frameLayout2 != null) {
                                C786410Ut5.LJZ(0, frameLayout2);
                            }
                        }
                        C1013610cU3 c1013610cU32 = c1018320cbe2.LLJLIL;
                        if (c1013610cU32 != null && c1013610cU32.LIZJ() && (c1013610cU3 = c1018320cbe2.LLJLIL) != null) {
                            c1013610cU3.LIZLLL();
                        }
                        C1022620cia.LIZ("AnolePlayerComponent", "component hidden");
                        return;
                    }
                    return;
                }
                C1018320cbe c1018320cbe3 = this.LLLIIII.get();
                if (c1018320cbe3 == null) {
                    return;
                }
                C1013610cU3 c1013610cU33 = c1018320cbe3.LLJLIL;
                if (c1013610cU33 != null) {
                    c1013610cU33.LJI();
                }
                FrameLayout frameLayout3 = this.LLJLILLLLZIIL;
                if (frameLayout3 != null) {
                    C786410Ut5.LJJJJIZL(frameLayout3);
                }
                View view2 = c1018320cbe3.LLJJIJIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                FrameLayout frameLayout4 = c1018320cbe3.LLLF;
                if (frameLayout4 != null) {
                    C786410Ut5.LJZ(8, frameLayout4);
                }
                FrameLayout frameLayout5 = c1018320cbe3.LLLFF;
                if (frameLayout5 != null) {
                    C786410Ut5.LJZ(8, frameLayout5);
                }
                LJJIIJZLJL(true);
                C1022620cia.LIZ("AnolePlayerComponent", "component hidden");
                return;
            }
            AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII3 = LJJIII();
            if (anolePlayerVideoDataModelLJJIII3 == null || (videoConfigInfo = anolePlayerVideoDataModelLJJIII3.videoConfigInfo) == null || !Intrinsics.LJFF(videoConfigInfo.videoResumeWhenVisible, Boolean.TRUE) || (c1018320cbe = this.LLLIIII.get()) == null) {
                return;
            }
            if (c1018320cbe.LLJLIL == null) {
                LIZJ();
                C1013610cU3 c1013610cU3LJJIFFI = LJJIFFI();
                c1018320cbe.LLJLIL = c1013610cU3LJJIFFI;
                if (c1013610cU3LJJIFFI != null) {
                    c1013610cU3LJJIFFI.LJ();
                }
                AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII4 = LJJIII();
                if (anolePlayerVideoDataModelLJJIII4 != null && Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII4.needMask, Boolean.TRUE)) {
                    FrameLayout frameLayout6 = c1018320cbe.LLLF;
                    if (frameLayout6 != null) {
                        C786410Ut5.LJZ(0, frameLayout6);
                    }
                    FrameLayout frameLayout7 = c1018320cbe.LLLFF;
                    if (frameLayout7 != null) {
                        C786410Ut5.LJZ(0, frameLayout7);
                    }
                }
                FrameLayout frameLayout8 = c1018320cbe.LLJLILLLLZIIL;
                if (frameLayout8 != null) {
                    frameLayout8.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLIIL.getValue());
                }
                LJJI();
            } else {
                View view3 = c1018320cbe.LLJJIJIL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII5 = LJJIII();
                if (anolePlayerVideoDataModelLJJIII5 != null && Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII5.needMask, Boolean.TRUE)) {
                    FrameLayout frameLayout9 = c1018320cbe.LLLF;
                    if (frameLayout9 != null) {
                        C786410Ut5.LJZ(0, frameLayout9);
                    }
                    FrameLayout frameLayout10 = c1018320cbe.LLLFF;
                    if (frameLayout10 != null) {
                        C786410Ut5.LJZ(0, frameLayout10);
                    }
                }
                FrameLayout frameLayout11 = c1018320cbe.LLJLILLLLZIIL;
                if (frameLayout11 != null) {
                    frameLayout11.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLIIL.getValue());
                }
                LJJI();
                C1013610cU3 c1013610cU34 = c1018320cbe.LLJLIL;
                if (c1013610cU34 != null) {
                    c1013610cU34.LJIIIIZZ();
                }
            }
            LJJII();
            return;
        }
        if (!(abstractC1003980cEW instanceof C991220btw)) {
            return;
        }
        this.LLLI = ((C991220btw) abstractC1003980cEW).LIZ;
        LJJIJIIJI();
        LJJIIJZLJL(false);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        VideoConfigInfo videoConfigInfo;
        if (LJIIL() == null) {
            LIZJ();
        }
        super.Nk(anoleComponentAppearModel);
        C1013610cU3 c1013610cU3 = this.LLJLIL;
        if (c1013610cU3 != null && c1013610cU3.LIZJ()) {
            LJJIIZ("is_playing");
            return;
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
        if (anolePlayerVideoDataModelLJJIII != null && (videoConfigInfo = anolePlayerVideoDataModelLJJIII.videoConfigInfo) != null && Intrinsics.LJFF(videoConfigInfo.showResourceReady, Boolean.TRUE)) {
            View view = this.LLJJIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        FrameLayout frameLayout = this.LLJLILLLLZIIL;
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLIIL.getValue());
        }
    }

    public static void LJJ(View view, ViewGroup viewGroup) {
        ViewParent parent;
        ViewGroup viewGroup2 = null;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        }
        if (!Intrinsics.LJFF(viewGroup2, viewGroup)) {
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
            }
            viewGroup.addView(view);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        String str;
        List<String> list;
        AlphaVideoData alphaVideoData;
        AlphaVideoData alphaVideoData2;
        super.Fk(viewGroup, interfaceC1014340cVE);
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = LJJIII();
        if (anolePlayerVideoDataModelLJJIII != null && (alphaVideoData2 = anolePlayerVideoDataModelLJJIII.video) != null) {
            str = alphaVideoData2.vid;
        } else {
            str = null;
        }
        AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII2 = LJJIII();
        if (anolePlayerVideoDataModelLJJIII2 != null && (alphaVideoData = anolePlayerVideoDataModelLJJIII2.video) != null) {
            list = alphaVideoData.urlList;
        } else {
            list = null;
        }
        if (str != null && list != null) {
            C23250099c.LIZLLL(this.LLLFZ, null, null, new C1013620cU4(str, list, null), 3);
        }
    }

    public C1018320cbe(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        Aweme aweme;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        Object obj = c1009340cNA.LIZJ;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        this.LLL = aweme;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LLLFFI = c23119094bLIZ;
        this.LLLFZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(c23119094bLIZ));
        this.LLLII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(19));
        this.LLLIIII = new WeakReference<>(this);
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA, anoleComponentModel, 4));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 18));
        this.LLLIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 19));
    }
}
