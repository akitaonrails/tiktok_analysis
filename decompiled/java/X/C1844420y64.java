package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostPanelBanner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0y64, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844420y64 extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public View LLILZ;

    private final ConstraintLayout getBannerMainContainer() {
        return (ConstraintLayout) this.LLILLL.getValue();
    }

    private final View getGradientBackgroundView() {
        return (View) this.LLILLJJLI.getValue();
    }

    private final C1324720kZq getImgBackgroundView() {
        return (C1324720kZq) this.LL.getValue();
    }

    public final void LIZIZ() {
        C786410Ut5.LJLLLLLL(8, getGradientBackgroundView());
        getGradientBackgroundView().setBackground(null);
    }

    private final void setImageBackground(CohostPanelBanner cohostPanelBanner) {
        ImageModel imageModel;
        if (cohostPanelBanner != null && (imageModel = cohostPanelBanner.backgroundImage) != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLJIIIZ.LJIIL = new C987120bnK(4);
            c1324610kZfLJIIIZ.LJJI(getImgBackgroundView());
        }
    }

    public final void LIZ(EnumC1844430y65 enumC1844430y65) {
        int i;
        int iOrdinal = enumC1844430y65.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new C1954807lC();
            }
            setBackground(null);
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        if (C1152520g66.LIZ()) {
            i = R.drawable.dod;
        } else {
            i = R.drawable.dv1;
        }
        setBackgroundResource(i);
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
    }

    public C1844420y64(Context context, AttributeSet attributeSet) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, attributeSet, 0);
        this.LL = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 1262));
        this.LLILLJJLI = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 1261));
        this.LLILLL = C930540aK4.LJJIJIL(new AwS571S0100000_27(this, 1260));
        setClipChildren(false);
        setClipToPadding(false);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h9c, this, true);
        float fLIZIZ = C962250b9D.LIZIZ();
        C1331070kk5 hierarchy = getImgBackgroundView().getHierarchy();
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LJI(fLIZIZ, fLIZIZ, 0.0f, 0.0f);
        hierarchy.LJJIII(c1331100kk8);
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.alo);
        if (iLJIIIZ <= 0) {
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            setTranslationZ(0.0f);
            return;
        }
        int i = -iLJIIIZ;
        View view2 = this.LLILZ;
        if (view2 == null) {
            view2 = new View(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iLJIIIZ);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = i;
            addView(view2, 0, layoutParams);
            this.LLILZ = view2;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
        layoutParams2.height = iLJIIIZ;
        layoutParams2.bottomMargin = i;
        C786410Ut5.W5(view2, layoutParams2);
        view2.setBackgroundResource(R.drawable.doc);
        C786410Ut5.LJLLLLLL(8, view2);
        getBannerMainContainer().setClipChildren(false);
        for (View view3 : C1697810uHb.LJIIJJI(getImgBackgroundView(), getGradientBackgroundView())) {
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams.bottomMargin = i;
                C786410Ut5.W5(view3, marginLayoutParams);
            }
        }
        setTranslationZ(-1.0f);
    }

    public final void LIZJ(final CohostPanelBanner cohostPanelBanner, boolean z) {
        C1844460y68 c1844460y68;
        GradientDrawable.Orientation orientation;
        boolean zLJJ = C497740JfY.LJJ();
        View viewFindViewById = findViewById(R.id.with_timer_layout);
        View viewFindViewById2 = findViewById(R.id.without_timer_layout);
        if (z) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            c1844460y68 = new C1844460y68(viewFindViewById);
        } else {
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            c1844460y68 = new C1844460y68(viewFindViewById2);
        }
        int i = cohostPanelBanner.bannerStyle;
        if (i != 1) {
            if (i != 3) {
                if (cohostPanelBanner.backgroundImage != null) {
                    LIZ(EnumC1844430y65.LLILLL);
                    LIZIZ();
                    C786410Ut5.LLJJIII(getImgBackgroundView(), 0);
                    setImageBackground(cohostPanelBanner);
                } else {
                    LIZ(EnumC1844430y65.LL);
                    LIZIZ();
                    C786410Ut5.LLJJIII(getImgBackgroundView(), 8);
                }
                C16F5 c16f5 = (C16F5) c1844460y68.LIZJ.getValue();
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 8);
                }
                C1324720kZq c1324720kZq = (C1324720kZq) c1844460y68.LIZLLL.getValue();
                if (c1324720kZq != null) {
                    C786410Ut5.LLJJIII(c1324720kZq, 8);
                }
                c1844460y68.LIZJ(8);
                View view = (View) c1844460y68.LJ.getValue();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
            } else {
                LIZ(EnumC1844430y65.LLILLL);
                LIZIZ();
                C786410Ut5.LLJJIII(getImgBackgroundView(), 0);
                setImageBackground(cohostPanelBanner);
                C16F5 c16f52 = (C16F5) c1844460y68.LIZJ.getValue();
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 0);
                }
                c1844460y68.LIZLLL(cohostPanelBanner, z);
                C1324720kZq c1324720kZq2 = (C1324720kZq) c1844460y68.LIZLLL.getValue();
                if (c1324720kZq2 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq2, 0);
                }
                c1844460y68.LIZ(cohostPanelBanner, zLJJ);
                c1844460y68.LIZJ(0);
                c1844460y68.LIZIZ(cohostPanelBanner, zLJJ);
            }
        } else {
            LIZ(EnumC1844430y65.LLILLJJLI);
            C786410Ut5.LLJJIII(getImgBackgroundView(), 8);
            C786410Ut5.LJLLLLLL(0, getGradientBackgroundView());
            getBannerMainContainer().setBackground(null);
            float fLIZIZ = C962250b9D.LIZIZ();
            int i2 = (int) cohostPanelBanner.angle;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (zLJJ) {
                        orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    } else {
                        orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    }
                } else if (zLJJ) {
                    orientation = GradientDrawable.Orientation.TR_BL;
                } else {
                    orientation = GradientDrawable.Orientation.TL_BR;
                }
            } else {
                orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            }
            int iLJI = C497740JfY.LJI(-16777216, cohostPanelBanner.startColor);
            int iLJI2 = C497740JfY.LJI(-16777216, cohostPanelBanner.endColor);
            View gradientBackgroundView = getGradientBackgroundView();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(orientation);
            gradientDrawable.setColors(new int[]{iLJI, iLJI2});
            gradientBackgroundView.setBackground(gradientDrawable);
            C16F5 c16f53 = (C16F5) c1844460y68.LIZJ.getValue();
            if (c16f53 != null) {
                C786410Ut5.LLJJJJ(c16f53, 0);
            }
            c1844460y68.LIZLLL(cohostPanelBanner, z);
            C1324720kZq c1324720kZq3 = (C1324720kZq) c1844460y68.LIZLLL.getValue();
            if (c1324720kZq3 != null) {
                C786410Ut5.LLJJIII(c1324720kZq3, 0);
            }
            c1844460y68.LIZ(cohostPanelBanner, zLJJ);
            c1844460y68.LIZJ(0);
            c1844460y68.LIZIZ(cohostPanelBanner, zLJJ);
        }
        final String str = cohostPanelBanner.schemaJumpUrl;
        if (str != null) {
            final DataChannel dataChannel = C915980Zwa.LJII().getDataChannel();
            C786410Ut5.r8(this, new View.OnClickListener() { // from class: X.018j
                /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[PHI: r3
                  0x008f: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v7 java.lang.String), (r3v7 java.lang.String) binds: [B:16:0x002e, B:18:0x0032, B:20:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r8) {
                    /*
                        r7 = this;
                        X.0ayA r0 = X.C955400ayA.LIZ
                        com.bytedance.ies.sdk.datachannel.DataChannel r6 = r1
                        java.lang.String r1 = r2
                        com.bytedance.android.livesdk.chatroom.interact.model.CohostPanelBanner r0 = r3
                        com.bytedance.android.livesdk.chatroom.model.interact.CohostPanelBannerExtra r2 = r0.extra
                        android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
                        java.lang.String r5 = "activity_name"
                        java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r5)
                        java.lang.String r4 = ""
                        if (r3 != 0) goto L19
                        r3 = r4
                    L19:
                        r0 = 0
                        if (r2 == 0) goto L1e
                        java.lang.String r0 = r2.activityName
                    L1e:
                        r1 = 1
                        if (r0 == 0) goto L2e
                        int r0 = r0.length()
                        if (r0 == 0) goto L2e
                        if (r2 == 0) goto L2d
                        java.lang.String r3 = r2.activityName
                        if (r3 != 0) goto L30
                    L2d:
                        r3 = r4
                    L2e:
                        if (r2 == 0) goto L8f
                    L30:
                        java.lang.String r0 = r2.bannerFrom
                        if (r0 == 0) goto L8f
                        int r0 = r0.length()
                        if (r0 == 0) goto L8f
                        java.lang.String r0 = r2.bannerFrom
                        if (r0 == 0) goto L3f
                        r4 = r0
                    L3f:
                        java.lang.String r0 = "livesdk_revenue_activity_banner_click"
                        X.0IjA r2 = X.C0IJT.LIZ(r0)
                        r2.LJIJJLI(r6)
                        X.C955400ayA.LJIIIZ(r2, r1)
                        r2.LJJII(r3, r5)
                        java.lang.String r0 = "banner_from"
                        r2.LJJII(r4, r0)
                        java.lang.String r1 = "banner_type"
                        java.lang.String r0 = "common"
                        r2.LJJII(r0, r1)
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r0)
                        if (r0 == 0) goto L8c
                        java.lang.String r1 = "1"
                    L64:
                        java.lang.String r0 = "is_anchor"
                        r2.LJJII(r1, r0)
                        java.lang.String r0 = "league_match_campaign"
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
                        if (r0 == 0) goto L74
                        X.C955400ayA.LJJIIJ(r2)
                    L74:
                        r2.LIZ()
                        java.lang.Class<com.bytedance.android.live.browser.IHybridContainerService> r0 = com.bytedance.android.live.browser.IHybridContainerService.class
                        X.006A r3 = X.C1161920gLG.LIZJ(r0)
                        com.bytedance.android.live.browser.IHybridContainerService r3 = (com.bytedance.android.live.browser.IHybridContainerService) r3
                        X.0y64 r0 = r4
                        android.content.Context r2 = r0.getContext()
                        java.lang.String r1 = r2
                        r0 = 0
                        r3.YC1(r2, r1, r0)
                        return
                    L8c:
                        java.lang.String r1 = "0"
                        goto L64
                    L8f:
                        java.lang.String r4 = "cohost_banner"
                        goto L3f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC2847018j.onClick(android.view.View):void");
                }
            });
        }
    }
}
