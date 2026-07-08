package X;

import Y.ACListenerS62S1200000_28;
import Y.ACallableS98S0101000_28;
import Y.ALAdapterS23S0100000_28;
import Y.ARunnableS118S0100000_18;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.Animation;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.Picture;
import com.bytedance.touchpoint.api.model.PopupView;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.touchpoint.api.model.Video;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zTK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897280zTK implements InterfaceC690020R4u {
    public boolean LIZIZ;
    public View LIZJ;
    public LinearLayout LIZLLL;
    public TuxTextView LJ;
    public TuxTextView LJFF;
    public ImageView LJI;
    public C1322110kVd LJII;
    public LinearLayout LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public TuxTextView LJIIJ;
    public C1295960jpS LJIIJJI;
    public C1322110kVd LJIIL;
    public FrameLayout LJIILIIL;
    public ImageView LJIILJJIL;
    public TuxTextView LJIILL;
    public TuxTextView LJIILLIIL;
    public LinearLayout LJIIZILJ;
    public C1322110kVd LJIJ;
    public ReferralFeedBanner LJIJI;
    public View LJIJJ;
    public View LJIJJLI;
    public View LJIL;
    public View LJJ;
    public Context LJJI;
    public boolean LJJIFFI;
    public String LJJIII;
    public String LJJIIJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(499));
    public int LJJII = -1;

    @Override // X.InterfaceC690020R4u
    public final void LIZIZ() {
        ReferralFeedBanner referralFeedBanner = this.LJIJI;
        if ((referralFeedBanner != null ? referralFeedBanner.bannerType : 0) == 1) {
            C1295960jpS c1295960jpS = this.LJIIJJI;
            if (c1295960jpS != null) {
                c1295960jpS.cancelAnimation();
            }
            C1295960jpS c1295960jpS2 = this.LJIIJJI;
            if (c1295960jpS2 != null) {
                c1295960jpS2.clearAnimation();
            }
            LinearLayout linearLayout = this.LJIIIIZZ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            TuxTextView tuxTextView = this.LJIIIZ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 4);
            }
            TuxTextView tuxTextView2 = this.LJIIJ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 4);
            }
            FrameLayout frameLayout = this.LJIILIIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(4, frameLayout);
            }
        } else {
            LinearLayout linearLayout2 = this.LIZLLL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
        }
        LinearLayout linearLayout3 = this.LJIIZILJ;
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(8, linearLayout3);
        }
        if (this.LJJIFFI) {
            return;
        }
        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LJJIJIL(true, true, false);
        this.LJJIFFI = true;
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZJ() {
        View view = this.LIZJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LJIJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LJJ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LJIJJLI;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZLLL() {
        List<Picture> list;
        Picture picture;
        Animation animation;
        List<Picture> list2;
        List<Video> list3;
        Video video;
        List<Video> list4;
        if (this.LIZIZ) {
            ReferralFeedBanner referralFeedBanner = this.LJIJI;
            C1620370sGh.LIZ(referralFeedBanner != null ? Integer.valueOf(referralFeedBanner.bannerType) : null);
            return;
        }
        ReferralFeedBanner referralFeedBanner2 = this.LJIJI;
        int i = 1;
        if (referralFeedBanner2 != null) {
            if (referralFeedBanner2.bannerType == 2) {
                if (this.LJJII >= ((referralFeedBanner2 == null || (list4 = referralFeedBanner2.videos) == null) ? 0 : list4.size()) || this.LJJII < 0) {
                    return;
                }
                LinearLayout linearLayout = this.LIZLLL;
                if (linearLayout != null && linearLayout.getVisibility() == 0) {
                    return;
                }
                ReferralFeedBanner referralFeedBanner3 = this.LJIJI;
                if (referralFeedBanner3 != null && (list3 = referralFeedBanner3.videos) != null && (video = (Video) ListProtector.get(list3, this.LJJII)) != null) {
                    i = video.showAfterVideoTime;
                }
                View view = this.LIZJ;
                if (view != null) {
                    HandlerHook.viewPostDelay(view, new ARunnableS118S0100000_18(this, 90), i * LSPassThroughRecordSizeConfig.DEFAULT);
                }
            } else if (referralFeedBanner2.bannerType == 1) {
                if (this.LJJII >= ((referralFeedBanner2 == null || (list2 = referralFeedBanner2.pictures) == null) ? 0 : list2.size()) || this.LJJII < 0) {
                    return;
                }
                LinearLayout linearLayout2 = this.LIZLLL;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(8, linearLayout2);
                }
                LinearLayout linearLayout3 = this.LJIIIIZZ;
                if (linearLayout3 != null) {
                    C786410Ut5.LJZL(0, linearLayout3);
                }
                ReferralFeedBanner referralFeedBanner4 = this.LJIJI;
                if (referralFeedBanner4 != null && (list = referralFeedBanner4.pictures) != null && (picture = (Picture) ListProtector.get(list, this.LJJII)) != null && (animation = picture.animation) != null) {
                    C01U6.LIZIZ(new AwS272S0300000_28(animation, this, this.LJIJI, 24));
                }
                C1295960jpS c1295960jpS = this.LJIIJJI;
                if (c1295960jpS != null) {
                    c1295960jpS.playAnimation();
                }
            }
        }
        C15O7.LIZJ(new ACallableS98S0101000_28(this, 2, 1));
        ReferralFeedBanner referralFeedBanner5 = this.LJIJI;
        if (referralFeedBanner5 != null) {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            int i2 = referralFeedBanner5.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sub_type", "-1");
            linkedHashMap.put("material_id", LJI());
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(i2, linkedHashMap, null, null, null, "");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039 A[PHI: r0
      0x0039: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v8 java.lang.String) binds: [B:23:0x0036, B:15:0x0021] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJI() {
        /*
            r5 = this;
            com.bytedance.touchpoint.api.model.ReferralFeedBanner r4 = r5.LJIJI
            r3 = 0
            if (r4 == 0) goto Lb
            int r1 = r4.bannerType
            r0 = 1
            if (r1 != r0) goto Lb
            r3 = 1
        Lb:
            java.lang.String r2 = ""
            if (r3 == 0) goto L24
            if (r4 == 0) goto L23
            java.util.List<com.bytedance.touchpoint.api.model.Picture> r1 = r4.pictures
            if (r1 == 0) goto L23
            int r0 = r5.LJJII
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.bytedance.touchpoint.api.model.Picture r0 = (com.bytedance.touchpoint.api.model.Picture) r0
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.materialId
            if (r0 != 0) goto L39
        L23:
            return r2
        L24:
            if (r4 == 0) goto L23
            java.util.List<com.bytedance.touchpoint.api.model.Video> r1 = r4.videos
            if (r1 == 0) goto L23
            int r0 = r5.LJJII
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.bytedance.touchpoint.api.model.Video r0 = (com.bytedance.touchpoint.api.model.Video) r0
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.materialId
            if (r0 != 0) goto L39
            return r2
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897280zTK.LJI():java.lang.String");
    }

    public final int LJII() {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = this.LJJI;
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 812 : displayMetrics.heightPixels)));
    }

    public final void LJIIJ() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIZILJ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new ALAdapterS23S0100000_28(this, 14));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LJIIJJI() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJIIIZ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.addListener(new ALAdapterS23S0100000_28(this, 15));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJIIJ, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.addListener(new ALAdapterS23S0100000_28(this, 16));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LJIILIIL, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat3.addListener(new ALAdapterS23S0100000_28(this, 17));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.start();
    }

    @Override // X.InterfaceC690020R4u
    public final boolean isShowing() {
        View view = this.LIZJ;
        return view != null && view.getVisibility() == 0;
    }

    public static CharSequence LJFF(Title title, Title title2, int i) {
        String str;
        String str2;
        String str3 = null;
        if (title2 != null) {
            str = title2.text;
        } else {
            str = null;
        }
        if (title != null) {
            str3 = title.text;
        }
        if (str != null && str.length() != 0 && title2 != null && (str2 = title2.color) != null && str2.length() != 0 && str3 != null && a0.LJJIIZI(str3, str, false)) {
            int iLJJJ = a0.LJJJ(title.text, str, 0, false, 6);
            int length = str.length() + iLJJJ;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) title.text);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i), iLJJJ, length, 33);
            return new SpannedString(spannableStringBuilder);
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x024c A[PHI: r12
      0x024c: PHI (r12v3 java.lang.String) = (r12v0 java.lang.String), (r12v4 java.lang.String) binds: [B:105:0x024a, B:103:0x0247] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0271 A[PHI: r12
      0x0271: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String), (r12v3 java.lang.String) binds: [B:105:0x024a, B:107:0x024e, B:109:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897280zTK.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void LJ(C1897280zTK c1897280zTK, TuxTextView tuxTextView, Title title, Title title2) {
        int iLIZIZ;
        String str;
        String str2;
        c1897280zTK.getClass();
        String str3 = null;
        if (title != null && (str2 = title.color) != null && str2.length() > 0 && tuxTextView != null) {
            tuxTextView.setTextColor(C0SVC.LIZIZ(C0SVC.LIZ, str2));
        }
        if (title2 != null && (str = title2.color) != null && str.length() != 0) {
            C0SVC c0svc = C0SVC.LIZ;
            if (title2 != null) {
                str3 = title2.color;
            }
            iLIZIZ = C0SVC.LIZIZ(c0svc, str3);
        } else {
            iLIZIZ = -1;
        }
        if (tuxTextView != null) {
            tuxTextView.setText(LJFF(title, title2, iLIZIZ));
        }
    }

    public static void LJIIIZ(C1322110kVd c1322110kVd, String str, String str2, final Function0 function0) {
        if (str != null) {
            try {
                if (C1723230uwb.LIZJ(str)) {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (C801320Vc2.LIZIZ(str)) {
                        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                        if (interfaceC1897260zTILIZIZ != null) {
                            interfaceC1897260zTILIZIZ.LIZLLL(c0vsj, c1322110kVd, "", new InterfaceC1910160zo6() { // from class: X.0zTV
                                @Override // X.InterfaceC1910160zo6
                                public final void onFailed(Throwable th) {
                                }

                                @Override // X.InterfaceC1910160zo6
                                public final void onComplete() {
                                    Function0<Unit> function02 = function0;
                                    if (function02 != null) {
                                        function02.invoke();
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ2 != null) {
            interfaceC1897260zTILIZIZ2.LJII(str2, c1322110kVd, new InterfaceC1910160zo6() { // from class: X.0zTW
                @Override // X.InterfaceC1910160zo6
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1910160zo6
                public final void onComplete() {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZ(ViewStub viewStub, String str, Context context, int i, View view, View view2, View view3, View view4, String str2) {
        Picture picture;
        Drawable drawable;
        Content content;
        String str3;
        Content content2;
        String str4;
        float f;
        Video video;
        Title title;
        Title title2;
        Drawable drawable2;
        FeedButton feedButton;
        String str5;
        FeedButton feedButton2;
        Content content3;
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        ImageView imageView;
        C1322110kVd c1322110kVd;
        LinearLayout linearLayout2;
        TuxTextView tuxTextView3;
        TuxTextView tuxTextView4;
        C1295960jpS c1295960jpS;
        C1322110kVd c1322110kVd2;
        FrameLayout frameLayout;
        ImageView imageView2;
        TuxTextView tuxTextView5;
        LinearLayout linearLayout3;
        TuxTextView tuxTextView6;
        C1322110kVd c1322110kVd3;
        int iLIZLLL;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.LayoutParams layoutParams6;
        LIZJ();
        if (context == null) {
            return;
        }
        ReferralFeedBanner referralFeedBannerLJII = C0T82.LIZJ(str2).LJII(str);
        this.LJIJI = referralFeedBannerLJII;
        if (referralFeedBannerLJII == null) {
            C1620370sGh.LIZIZ(201, 1, "pic/video referralFeedBanner null");
            this.LIZIZ = true;
            return;
        }
        this.LJJI = context;
        this.LJJII = i;
        this.LJIJJ = view;
        this.LJIJJLI = view2;
        this.LJIL = view3;
        this.LJJ = view4;
        this.LJJIII = str2;
        viewStub.setLayoutResource(R.layout.fwv);
        View view5 = this.LIZJ;
        String str6 = null;
        if (view5 == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LIZJ = viewLJLLLL;
            if (viewLJLLLL != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zTe
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                    }
                }, viewLJLLLL);
            }
            View view6 = this.LIZJ;
            if (view6 != null) {
                view6.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0zTg
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view7) {
                        return true;
                    }
                });
            }
            View view7 = this.LIZJ;
            if (view7 != null) {
                linearLayout = (LinearLayout) view7.findViewById(R.id.video_style_layout);
            } else {
                linearLayout = null;
            }
            this.LIZLLL = linearLayout;
            View view8 = this.LIZJ;
            if (view8 != null) {
                tuxTextView = (TuxTextView) view8.findViewById(R.id.video_style_title);
            } else {
                tuxTextView = null;
            }
            this.LJ = tuxTextView;
            View view9 = this.LIZJ;
            if (view9 != null) {
                tuxTextView2 = (TuxTextView) view9.findViewById(R.id.video_button_tv);
            } else {
                tuxTextView2 = null;
            }
            this.LJFF = tuxTextView2;
            View view10 = this.LIZJ;
            if (view10 != null) {
                imageView = (ImageView) view10.findViewById(R.id.video_button_image_view);
            } else {
                imageView = null;
            }
            this.LJI = imageView;
            View view11 = this.LIZJ;
            if (view11 != null) {
                c1322110kVd = (C1322110kVd) view11.findViewById(R.id.qfq);
            } else {
                c1322110kVd = null;
            }
            this.LJII = c1322110kVd;
            View view12 = this.LIZJ;
            if (view12 != null) {
                linearLayout2 = (LinearLayout) view12.findViewById(R.id.qfr);
            } else {
                linearLayout2 = null;
            }
            this.LJIIIIZZ = linearLayout2;
            View view13 = this.LIZJ;
            if (view13 != null) {
                tuxTextView3 = (TuxTextView) view13.findViewById(R.id.qfb);
            } else {
                tuxTextView3 = null;
            }
            this.LJIIIZ = tuxTextView3;
            View view14 = this.LIZJ;
            if (view14 != null) {
                tuxTextView4 = (TuxTextView) view14.findViewById(R.id.qfa);
            } else {
                tuxTextView4 = null;
            }
            this.LJIIJ = tuxTextView4;
            View view15 = this.LIZJ;
            if (view15 != null) {
                c1295960jpS = (C1295960jpS) view15.findViewById(R.id.qf9);
            } else {
                c1295960jpS = null;
            }
            this.LJIIJJI = c1295960jpS;
            View view16 = this.LIZJ;
            if (view16 != null) {
                c1322110kVd2 = (C1322110kVd) view16.findViewById(R.id.qf_);
            } else {
                c1322110kVd2 = null;
            }
            this.LJIIL = c1322110kVd2;
            View view17 = this.LIZJ;
            if (view17 != null) {
                frameLayout = (FrameLayout) view17.findViewById(R.id.qf4);
            } else {
                frameLayout = null;
            }
            this.LJIILIIL = frameLayout;
            View view18 = this.LIZJ;
            if (view18 != null) {
                imageView2 = (ImageView) view18.findViewById(R.id.qf5);
            } else {
                imageView2 = null;
            }
            this.LJIILJJIL = imageView2;
            View view19 = this.LIZJ;
            if (view19 != null) {
                tuxTextView5 = (TuxTextView) view19.findViewById(R.id.qf6);
            } else {
                tuxTextView5 = null;
            }
            this.LJIILL = tuxTextView5;
            View view20 = this.LIZJ;
            if (view20 != null) {
                linearLayout3 = (LinearLayout) view20.findViewById(R.id.jon);
            } else {
                linearLayout3 = null;
            }
            this.LJIIZILJ = linearLayout3;
            View view21 = this.LIZJ;
            if (view21 != null) {
                tuxTextView6 = (TuxTextView) view21.findViewById(R.id.jok);
            } else {
                tuxTextView6 = null;
            }
            this.LJIILLIIL = tuxTextView6;
            View view22 = this.LIZJ;
            if (view22 != null) {
                c1322110kVd3 = (C1322110kVd) view22.findViewById(R.id.xum);
            } else {
                c1322110kVd3 = null;
            }
            this.LJIJ = c1322110kVd3;
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            C1896300zRk c1896300zRk = (C1896300zRk) c1619720sFe.LIZ(8);
            if (c1896300zRk != null) {
                iLIZLLL = c1896300zRk.LIZLLL();
            } else {
                iLIZLLL = 0;
            }
            LinearLayout linearLayout4 = this.LJIIZILJ;
            if (linearLayout4 != null) {
                layoutParams = linearLayout4.getLayoutParams();
            } else {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams2.bottomMargin += iLIZLLL;
            C786410Ut5.W5(linearLayout4, marginLayoutParams2);
            LinearLayout linearLayout5 = this.LIZLLL;
            if (linearLayout5 != null) {
                layoutParams2 = linearLayout5.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams3.bottomMargin += iLIZLLL;
            C786410Ut5.W5(linearLayout5, marginLayoutParams3);
            if (LJII() < 700) {
                LinearLayout linearLayout6 = this.LJIIIIZZ;
                if (linearLayout6 != null) {
                    layoutParams3 = linearLayout6.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams4 != null) {
                    marginLayoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(85));
                }
                LinearLayout linearLayout7 = this.LJIIIIZZ;
                if (linearLayout7 != null) {
                    C786410Ut5.d6(linearLayout7, marginLayoutParams4);
                }
                TuxTextView tuxTextView7 = this.LJIIJ;
                if (tuxTextView7 != null) {
                    layoutParams4 = tuxTextView7.getLayoutParams();
                } else {
                    layoutParams4 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4;
                if (marginLayoutParams5 != null) {
                    marginLayoutParams5.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                TuxTextView tuxTextView8 = this.LJIIJ;
                if (tuxTextView8 != null) {
                    C786410Ut5.R6(tuxTextView8, marginLayoutParams5);
                }
                C1295960jpS c1295960jpS2 = this.LJIIJJI;
                if (c1295960jpS2 != null) {
                    layoutParams5 = c1295960jpS2.getLayoutParams();
                } else {
                    layoutParams5 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams5;
                if (marginLayoutParams6 != null) {
                    marginLayoutParams6.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(326));
                    marginLayoutParams6.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(297));
                    marginLayoutParams6.topMargin = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
                }
                C1295960jpS c1295960jpS3 = this.LJIIJJI;
                if (c1295960jpS3 != null) {
                    C786410Ut5.s6(c1295960jpS3, marginLayoutParams6);
                }
                FrameLayout frameLayout2 = this.LJIILIIL;
                if (frameLayout2 != null) {
                    layoutParams6 = frameLayout2.getLayoutParams();
                } else {
                    layoutParams6 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams6;
                if (marginLayoutParams7 != null) {
                    marginLayoutParams7.topMargin = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    marginLayoutParams7.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160));
                    marginLayoutParams7.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                }
                FrameLayout frameLayout3 = this.LJIILIIL;
                if (frameLayout3 != null) {
                    C786410Ut5.a6(frameLayout3, marginLayoutParams7);
                }
            }
            C1896300zRk c1896300zRk2 = (C1896300zRk) c1619720sFe.LIZ(8);
            if (c1896300zRk2 != null && c1896300zRk2.LJI()) {
                C1295960jpS c1295960jpS4 = this.LJIIJJI;
                if (c1295960jpS4 != null) {
                    ViewGroup.LayoutParams layoutParams7 = c1295960jpS4.getLayoutParams();
                    layoutParams7.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(330));
                    C786410Ut5.s6(c1295960jpS4, layoutParams7);
                }
                C1322110kVd c1322110kVd4 = this.LJIIL;
                if (c1322110kVd4 != null) {
                    ViewGroup.LayoutParams layoutParams8 = c1322110kVd4.getLayoutParams();
                    layoutParams8.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(330));
                    C786410Ut5.c7(c1322110kVd4, layoutParams8);
                }
                LinearLayout linearLayout8 = this.LIZLLL;
                if (linearLayout8 != null) {
                    ViewGroup.LayoutParams layoutParams9 = linearLayout8.getLayoutParams();
                    if ((layoutParams9 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams9) != null) {
                        marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(340));
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                        C786410Ut5.d6(linearLayout8, marginLayoutParams);
                    }
                }
            }
        } else {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        ReferralFeedBanner referralFeedBanner = this.LJIJI;
        if (referralFeedBanner != null) {
            int i2 = referralFeedBanner.bannerType;
            if (i2 == 2) {
                List<Video> list = referralFeedBanner.videos;
                if (list != null && (video = (Video) C13LP.LJJJLZIJ(this.LJJII, list)) != null) {
                    TuxTextView tuxTextView9 = this.LJ;
                    PopupView popupView = video.popupView;
                    if (popupView != null) {
                        title = popupView.title;
                        title2 = popupView.highlightTitle;
                    } else {
                        title = null;
                        title2 = null;
                    }
                    LJ(this, tuxTextView9, title, title2);
                    TuxTextView tuxTextView10 = this.LJFF;
                    if (tuxTextView10 != null) {
                        PopupView popupView2 = video.popupView;
                        if (popupView2 != null && (feedButton2 = popupView2.button) != null && (content3 = feedButton2.content) != null) {
                            str5 = content3.text;
                        } else {
                            str5 = null;
                        }
                        tuxTextView10.setText(str5);
                    }
                    ImageView imageView3 = this.LJI;
                    if (imageView3 != null) {
                        drawable2 = imageView3.getDrawable();
                    } else {
                        drawable2 = null;
                    }
                    if (drawable2 instanceof GradientDrawable) {
                        GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
                        C0SVC c0svc = C0SVC.LIZ;
                        PopupView popupView3 = video.popupView;
                        if (popupView3 != null && (feedButton = popupView3.button) != null) {
                            str6 = feedButton.bgColor;
                        }
                        gradientDrawable.setColor(C0SVC.LIZIZ(c0svc, str6));
                    }
                    ImageView imageView4 = this.LJI;
                    if (imageView4 != null) {
                        C786410Ut5.Q7(imageView4, new ACListenerS62S1200000_28(video, this, str2, 5));
                    }
                } else {
                    C1620370sGh.LIZIZ(202, 1, "video null");
                    this.LIZIZ = true;
                    return;
                }
            } else if (i2 == 1) {
                List<Picture> list2 = referralFeedBanner.pictures;
                if (list2 != null && (picture = (Picture) C13LP.LJJJLZIJ(this.LJJII, list2)) != null) {
                    C1322110kVd c1322110kVd5 = this.LJII;
                    if (c1322110kVd5 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd5, 0);
                    }
                    C1322110kVd c1322110kVd6 = this.LJII;
                    if (c1322110kVd6 != null) {
                        LJIIIZ(c1322110kVd6, picture.LIZ, picture.bgImage, null);
                    }
                    LJ(this, this.LJIIIZ, picture.title, picture.highlightTitle);
                    TuxTextView tuxTextView11 = this.LJIIIZ;
                    if (tuxTextView11 != null) {
                        if (LJII() < 700) {
                            f = 24.0f;
                        } else {
                            f = 28.0f;
                        }
                        tuxTextView11.LJJJJI(f);
                    }
                    LJ(this, this.LJIIJ, picture.subTitle, null);
                    ImageView imageView5 = this.LJIILJJIL;
                    if (imageView5 != null) {
                        drawable = imageView5.getDrawable();
                    } else {
                        drawable = null;
                    }
                    if (drawable instanceof GradientDrawable) {
                        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable;
                        C0SVC c0svc2 = C0SVC.LIZ;
                        FeedButton feedButton3 = picture.button;
                        if (feedButton3 != null) {
                            str4 = feedButton3.bgColor;
                        } else {
                            str4 = null;
                        }
                        gradientDrawable2.setColor(C0SVC.LIZIZ(c0svc2, str4));
                    }
                    ImageView imageView6 = this.LJIILJJIL;
                    if (imageView6 != null) {
                        C786410Ut5.Q7(imageView6, new ACListenerS62S1200000_28(picture, this, str2, 6));
                    }
                    TuxTextView tuxTextView12 = this.LJIILL;
                    if (tuxTextView12 != null) {
                        FeedButton feedButton4 = picture.button;
                        if (feedButton4 != null && (content2 = feedButton4.content) != null) {
                            str3 = content2.text;
                        } else {
                            str3 = null;
                        }
                        tuxTextView12.setText(str3);
                    }
                    TuxTextView tuxTextView13 = this.LJIILL;
                    if (tuxTextView13 != null) {
                        C0SVC c0svc3 = C0SVC.LIZ;
                        FeedButton feedButton5 = picture.button;
                        if (feedButton5 != null && (content = feedButton5.content) != null) {
                            str6 = content.color;
                        }
                        tuxTextView13.setTextColor(C0SVC.LIZIZ(c0svc3, str6));
                    }
                } else {
                    C1620370sGh.LIZIZ(203, 1, "pic null");
                    this.LIZIZ = true;
                    return;
                }
            }
            TuxTextView tuxTextView14 = this.LJIILLIIL;
            if (tuxTextView14 != null) {
                tuxTextView14.setText(referralFeedBanner.hint);
            }
            InterfaceC721690SSp interfaceC721690SSp = C0S4I.LIZ;
            if (interfaceC721690SSp != null) {
                interfaceC721690SSp.LIZ(this.LJIJJ, EnumC1897360zTS.RISK_TOKEN_V_UG_REFER_FEED);
            }
            InterfaceC721690SSp interfaceC721690SSp2 = C0S4I.LIZ;
            if (interfaceC721690SSp2 != null) {
                interfaceC721690SSp2.LIZ(this.LJIJJLI, EnumC1897360zTS.RISK_TOKEN_V_UG_REFER_FEED);
            }
            View view23 = this.LJIJJ;
            if (view23 != null) {
                C786410Ut5.LJLLLLLL(8, view23);
            }
            View view24 = this.LJIL;
            if (view24 != null) {
                C786410Ut5.LJLLLLLL(8, view24);
            }
            View view25 = this.LJJ;
            if (view25 != null) {
                C786410Ut5.LJLLLLLL(8, view25);
            }
            View view26 = this.LJIJJLI;
            if (view26 != null) {
                C786410Ut5.LJLLLLLL(8, view26);
            }
        }
    }
}
