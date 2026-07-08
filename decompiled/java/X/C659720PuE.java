package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PuE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659720PuE {
    public static final C659720PuE LIZ = new C659720PuE();

    public static boolean LIZ() {
        return ((Number) C1822307Bt.LIZ.getValue()).intValue() == 0;
    }

    public static boolean LIZJ() {
        return C1830507Ex.LIZ() || C1840107Ip.LIZ() == 3;
    }

    public static C659780PuK LIZIZ(View view, EnumC659760PuI enumC659760PuI) {
        final C659860PuS c659860PuS = new C659860PuS(view, enumC659760PuI);
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (C1830507Ex.LIZ()) {
            c13dvLIZIZ.add(new InterfaceC659800PuM(c659860PuS) { // from class: X.0PuF
                public final C659860PuS LIZ;
                public final TuxTextView LIZIZ;
                public final View LIZJ;
                public final TuxTextView LIZLLL;

                {
                    ConstraintLayout constraintLayout;
                    this.LIZ = c659860PuS;
                    this.LIZJ = c659860PuS.LIZ.findViewById(R.id.video_holder_time_label);
                    TuxTextView tuxTextView = (TuxTextView) c659860PuS.LIZ.findViewById(R.id.tv_search_video_cell_bottom_publish_time);
                    this.LIZIZ = tuxTextView;
                    if (tuxTextView != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                    }
                    View viewFindViewById = c659860PuS.LIZ.findViewById(R.id.bbz);
                    if (viewFindViewById != null) {
                        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                            C786410Ut5.W5(viewFindViewById, layoutParams);
                        }
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) c659860PuS.LIZ.findViewById(R.id.bc6);
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTuxFont(71);
                        tuxTextView2.setTextColorRes(R.attr.a1j);
                    }
                    View viewFindViewById2 = c659860PuS.LIZ.findViewById(R.id.video_holder_author_verified_badge);
                    if (viewFindViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.LayoutParams) && layoutParams2 != null) {
                            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            C786410Ut5.W5(viewFindViewById2, layoutParams2);
                        }
                    }
                    TuxTextView tuxTextView3 = (TuxTextView) c659860PuS.LIZ.findViewById(R.id.mn1);
                    if (tuxTextView3 != null) {
                        tuxTextView3.setTuxFont(71);
                        tuxTextView3.setTextColorRes(R.attr.a1j);
                    }
                    TuxTextView tuxTextView4 = (TuxTextView) c659860PuS.LIZ.findViewById(R.id.desc);
                    if (tuxTextView4 != null) {
                        tuxTextView4.setTuxFont(51);
                        this.LIZLLL = tuxTextView4;
                    }
                    int i = C659770PuJ.LIZ[c659860PuS.LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            ViewParent parent = tuxTextView != null ? tuxTextView.getParent() : null;
                            if (parent instanceof ConstraintLayout) {
                                constraintLayout = (ConstraintLayout) parent;
                            } else {
                                return;
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        View viewFindViewById3 = c659860PuS.LIZ.findViewById(R.id.bc5);
                        if (!(viewFindViewById3 instanceof ConstraintLayout)) {
                            return;
                        } else {
                            constraintLayout = (ConstraintLayout) viewFindViewById3;
                        }
                    }
                    if (constraintLayout != null) {
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(constraintLayout);
                        c19mb.LJIIIZ(R.id.tv_search_video_cell_bottom_publish_time, 6, R.id.bc6, 6, 0);
                        if (c659860PuS.LIZIZ == EnumC659760PuI.PHOTO) {
                            c19mb.LJI(R.id.bc6, 4);
                            c19mb.LJIIIZ(R.id.bc6, 3, R.id.desc, 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                            c19mb.LJIIIZ(R.id.tv_search_video_cell_bottom_publish_time, 3, R.id.bc6, 4, 0);
                            c19mb.LJIIIZ(R.id.bbz, 3, R.id.bc6, 3, 0);
                            c19mb.LJIIIZ(R.id.bbz, 4, R.id.tv_search_video_cell_bottom_publish_time, 4, 0);
                        } else {
                            c19mb.LJIIZILJ(0, 0, new int[]{R.id.bc6, R.id.tv_search_video_cell_bottom_publish_time});
                        }
                        c19mb.LIZIZ(constraintLayout);
                    }
                }

                @Override // X.InterfaceC659800PuM
                public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, InterfaceC660500PvU interfaceC660500PvU, C660780Pvw c660780Pvw) {
                    TuxTextView tuxTextView = this.LIZIZ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(C1356610lPH.LJII(aweme.getCreateTime() * 1000, this.LIZ.LIZ.getContext()));
                    }
                    TuxTextView tuxTextView2 = this.LIZLLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTuxFont(51);
                    }
                    View view2 = this.LIZJ;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(8, view2);
                    }
                    if (aweme.isAd() && !((Boolean) C138700fx.LIZ.getValue()).booleanValue()) {
                        TuxTextView tuxTextView3 = this.LIZIZ;
                        if (tuxTextView3 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView3, 8);
                            return;
                        }
                        return;
                    }
                    TuxTextView tuxTextView4 = this.LIZIZ;
                    if (tuxTextView4 == null) {
                        return;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView4, 0);
                }
            });
        }
        if (enumC659760PuI == EnumC659760PuI.PHOTO && C1840307Ir.LIZ()) {
            c13dvLIZIZ.add(new InterfaceC659800PuM(c659860PuS) { // from class: X.0PuG
                @Override // X.InterfaceC659800PuM
                public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, InterfaceC660500PvU interfaceC660500PvU, C660780Pvw c660780Pvw) {
                }

                {
                    ConstraintLayout constraintLayout;
                    if (c659860PuS.LIZIZ == EnumC659760PuI.PHOTO) {
                        View viewFindViewById = c659860PuS.LIZ.findViewById(R.id.qcw);
                        ViewParent parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
                        if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                            C19MB c19mb = new C19MB();
                            c19mb.LJII(constraintLayout);
                            c19mb.LJI(R.id.qcw, 6);
                            c19mb.LJIIIZ(R.id.qcw, 7, 0, 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                            c19mb.LJI(R.id.qc6, 7);
                            c19mb.LJIIIZ(R.id.qc6, 7, R.id.qcw, 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                            c19mb.LIZIZ(constraintLayout);
                        }
                        if (viewFindViewById != null) {
                            C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        }
                    }
                }
            });
        }
        if (C1840107Ip.LIZ() == 3) {
            c13dvLIZIZ.add(new AbstractC659710PuD(c659860PuS) { // from class: X.0PuC
                public final View LJ;

                {
                    Context context;
                    super(c659860PuS);
                    View viewFindViewById = c659860PuS.LIZ.findViewById(R.id.nhh);
                    this.LIZIZ = viewFindViewById;
                    if (viewFindViewById != null) {
                        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
                    }
                    if (C650240Pew.LIZ()) {
                        View view2 = this.LIZIZ;
                        if (view2 != null && (context = view2.getContext()) != null && C426750GoL.LIZLLL(context)) {
                            View view3 = this.LIZIZ;
                            if (view3 != null) {
                                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view3.getPaddingBottom());
                            }
                        } else {
                            View view4 = this.LIZIZ;
                            if (view4 != null) {
                                view4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view4.getPaddingTop(), view4.getPaddingRight(), view4.getPaddingBottom());
                            }
                        }
                    }
                    this.LIZJ = (TuxIconView) c659860PuS.LIZ.findViewById(R.id.lu2);
                    this.LIZLLL = (TuxTextView) c659860PuS.LIZ.findViewById(R.id.tv_search_card_bottom_recommend_info);
                    this.LJ = c659860PuS.LIZ.findViewById(R.id.fmz);
                }

                @Override // X.AbstractC659710PuD, X.InterfaceC659800PuM
                public final void LIZ(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, InterfaceC660500PvU interfaceC660500PvU, C660780Pvw c660780Pvw) {
                    String type;
                    VideoTag videoTag;
                    if (c660780Pvw != null && C1840007Io.LIZ() == 2) {
                        View view2 = this.LIZIZ;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(8, view2);
                        }
                    } else {
                        Video video = aweme.getVideo();
                        if (video != null && (videoTag = video.getVideoTag()) != null) {
                            type = videoTag.getType();
                        } else {
                            type = null;
                        }
                        if (Intrinsics.LJFF(type, "lower_show") && (AwemeBizExtKt.getTotalProductAnchors(aweme) <= 0 || Intrinsics.LJFF(interfaceC660500PvU, C660620Pvg.LIZ))) {
                            super.LIZ(interfaceC665370Q7z, aweme, interfaceC660500PvU, c660780Pvw);
                        } else {
                            View view3 = this.LIZIZ;
                            if (view3 != null) {
                                C786410Ut5.LJLLLLLL(8, view3);
                            }
                        }
                    }
                    View view4 = this.LIZIZ;
                    if (view4 != null && view4.getVisibility() == 0) {
                        View view5 = this.LJ;
                        if (view5 != null) {
                            ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                                layoutParams = null;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                                C786410Ut5.W5(view5, marginLayoutParams);
                            }
                        }
                        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(interfaceC665370Q7z, IAdjustAbility.class, null);
                        if (iAdjustAbility != null) {
                            iAdjustAbility.qw1(EnumC657070Ppx.BOTTOM_RECOMMEND_INFO, C656950Ppl.LIZ);
                            return;
                        }
                        return;
                    }
                    View view6 = this.LJ;
                    if (view6 != null) {
                        ViewGroup.LayoutParams layoutParams2 = view6.getLayoutParams();
                        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams2 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams2 != null) {
                            marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                            C786410Ut5.W5(view6, marginLayoutParams2);
                        }
                    }
                    IAdjustAbility iAdjustAbility2 = (IAdjustAbility) C1558520qew.LIZ(interfaceC665370Q7z, IAdjustAbility.class, null);
                    if (iAdjustAbility2 == null) {
                        return;
                    }
                    iAdjustAbility2.qw1(EnumC657070Ppx.BOTTOM_RECOMMEND_INFO, null);
                }
            });
        }
        return new C659780PuK(C1697820uHc.LIZ(c13dvLIZIZ));
    }

    public static Function0 LIZLLL(TuxTextView tuxTextView, UrlModel urlModel) {
        Object c098200Yq;
        if (urlModel == null) {
            return AFwS196S0000000_10.get$arr$(663);
        }
        try {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
            c098200Yq = c1331670kl3LJIIIIZZ.LJJIIJZLJL(new C346500DiC(tuxTextView, 2));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        InterfaceC469401sC interfaceC469401sC = (InterfaceC469401sC) c098200Yq;
        if (interfaceC469401sC != null) {
            return new AwS554S0100000_10(interfaceC469401sC, 1234);
        }
        return AFwS196S0000000_10.get$arr$(664);
    }
}
