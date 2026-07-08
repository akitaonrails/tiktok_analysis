package X;

import Y.ARunnableS14S1200000_9;
import Y.ARunnableS42S0300000_9;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS441S0200000_5;

/* JADX INFO: renamed from: X.0P0S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0S extends C09AY implements Function2<VideoFavoriteAssem, C291001Au<? extends Unit>, Unit> {
    public C0P0S() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C291001Au<? extends Unit> c291001Au) {
        Object obj;
        Object obj2;
        Object obj3;
        UrlModel cover;
        View view;
        ViewGroup viewGroup;
        C0P0T c0p0t;
        C0P0T c0p0t2;
        C1391600mJi c1391600mJiLJIILL;
        final VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C291001Au<? extends Unit> c291001Au2 = c291001Au;
        String stringExtra = null;
        if (c291001Au2 != null && c291001Au2.LIZ() != null) {
            AbstractC1604130rqV abstractC1604130rqVGp = videoFavoriteAssem2.Gp();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VideoFavoriteAssem showTooltipGuide aid: ");
            C724270Sb3 c724270Sb3 = videoFavoriteAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            sbLIZ.append(((VideoItemParams) obj).getAweme().getAid());
            sbLIZ.append(" eventType: ");
            C724270Sb3 c724270Sb32 = videoFavoriteAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            sbLIZ.append(((VideoItemParams) obj2).mEventType);
            abstractC1604130rqVGp.LJ(C2188811AlT.LIZIZ(sbLIZ));
            int iIntValue = 0;
            if (C1171990gbV.LIZIZ() == 3) {
                videoFavoriteAssem2.LLLI = false;
                WeakReference<C0P0T> weakReference = videoFavoriteAssem2.LLLIIL;
                if (weakReference != null && (c0p0t2 = weakReference.get()) != null && (c1391600mJiLJIILL = c0p0t2.LJIILL()) != null) {
                    c1391600mJiLJIILL.LJIIJJI = false;
                }
                WeakReference<C0P0T> weakReference2 = videoFavoriteAssem2.LLLIIL;
                if (weakReference2 != null && (c0p0t = weakReference2.get()) != null) {
                    c0p0t.LJIIL(new C731670Smz());
                }
                final C19EG c19egLIZ = C724240Sb0.LIZ(videoFavoriteAssem2);
                if (c19egLIZ != null) {
                    C724270Sb3 c724270Sb33 = videoFavoriteAssem2.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    Video video = ((VideoItemParams) obj3).getAweme().getVideo();
                    if (video != null && (cover = video.getCover()) != null) {
                        ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(cover);
                        SmartImageView smartImageView = new SmartImageView(c19egLIZ);
                        C786410Ut5.G6(smartImageView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60))));
                        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        View view2 = (View) videoFavoriteAssem2.LLLIIIIL.getValue();
                        if (view2 != null) {
                            view2.getLocationOnScreen(new int[2]);
                            CommonPageFragment commonPageFragmentXQ2 = C486860J7k.LIZIZ(c19egLIZ).xQ2("page_feed");
                            C1391550mJd c1391550mJd = new C1391550mJd(c19egLIZ);
                            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
                            c1391600mJi.LIZIZ = view2;
                            c1391600mJi.LJIIIZ = true;
                            c1391600mJi.LJIILLIIL = smartImageView;
                            c1391600mJi.LJIIL = false;
                            c1391550mJd.LJIIIZ(true, null);
                            if (commonPageFragmentXQ2 != null) {
                                view = commonPageFragmentXQ2.getView();
                            } else {
                                view = null;
                            }
                            if (view instanceof ViewGroup) {
                                viewGroup = (ViewGroup) view;
                            } else {
                                viewGroup = null;
                            }
                            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
                            c1391600mJi2.LIZJ = viewGroup;
                            c1391600mJi2.LIZLLL = EnumC1235690iGF.TOP;
                            c1391600mJi2.LJII = 850L;
                            C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
                            videoFavoriteAssem2.LLLIIL = new WeakReference<>(c0p0tLIZIZ);
                            Intent intent = c19egLIZ.getIntent();
                            if (intent != null) {
                                try {
                                    stringExtra = intent.getStringExtra("profile_from_scene");
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            videoFavoriteAssem2.LLLII = new ARunnableS14S1200000_9(new WeakReference(c19egLIZ), videoFavoriteAssem2, stringExtra, 15);
                            c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0Ogu
                                @Override // X.InterfaceC1340660kzY
                                public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                                    WeakReference<C0P0T> weakReference3 = videoFavoriteAssem2.LLLIIL;
                                    if (weakReference3 != null) {
                                        weakReference3.clear();
                                    }
                                    VideoFavoriteAssem videoFavoriteAssem3 = videoFavoriteAssem2;
                                    videoFavoriteAssem3.LLLIIL = null;
                                    if (abstractC1391670mJp instanceof C731670Smz) {
                                        ARunnableS14S1200000_9 aRunnableS14S1200000_9 = videoFavoriteAssem3.LLLII;
                                        if (aRunnableS14S1200000_9 != null) {
                                            aRunnableS14S1200000_9.run();
                                        }
                                        videoFavoriteAssem2.Fp().removeCallbacksAndMessages(null);
                                    }
                                    VideoFavoriteAssem videoFavoriteAssem4 = videoFavoriteAssem2;
                                    ARunnableS14S1200000_9 aRunnableS14S1200000_92 = videoFavoriteAssem4.LLLII;
                                    if (aRunnableS14S1200000_92 != null) {
                                        C786410Ut5.LJLIIL(((Number) C0AHU.LIZ.getValue()).intValue(), videoFavoriteAssem4.Fp(), aRunnableS14S1200000_92);
                                    }
                                    C786410Ut5.LJLIIL(200L, videoFavoriteAssem2.Fp(), new ARunnableS42S0300000_9(videoFavoriteAssem2, abstractC1391670mJp, c19egLIZ, 27));
                                }
                            });
                            c0p0tLIZIZ.LIZLLL(false);
                            c0p0tLIZIZ.LJIILJJIL(new AwS441S0200000_5(view2, c0p0tLIZIZ, 15));
                            c0p0tLIZIZ.LJIJ(new InterfaceC1391650mJn() { // from class: X.0P0U
                                @Override // X.InterfaceC1391650mJn
                                public final void onShow() {
                                    Intent intent2 = c19egLIZ.getIntent();
                                    if (intent2 != null) {
                                        intent2.putExtra("profile_from_scene", "1035");
                                    }
                                    Intent intent3 = c19egLIZ.getIntent();
                                    if (intent3 != null) {
                                        intent3.putExtra("profile_landing_tab", 8);
                                    }
                                    Intent intent4 = c19egLIZ.getIntent();
                                    if (intent4 != null) {
                                        intent4.putExtra("favorite_auto_landing_method_for_bottom_tab", "auto_profile_land");
                                    }
                                }
                            });
                            C178300mL.LIZ(c0p0tLIZIZ, "feed_favorite_revisit_guide");
                            C639020P4q c639020P4q = new C639020P4q(new AwS410S0200000_9(c0p0tLIZIZ, videoFavoriteAssem2, 121), new AwS253S0300000_9(c0p0tLIZIZ, videoFavoriteAssem2, c19egLIZ, 25), 2);
                            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
                            c1331670kl3LJIIIIZZ.LJJII(c639020P4q);
                            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                            c1331670kl3LJIIIIZZ.LJIILJJIL = 0;
                            C1331750klB c1331750klB = new C1331750klB();
                            c1331750klB.LJ = C418440Gaw.LIZIZ(10);
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, smartImageView.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            }
                            float fLIZIZ = C418440Gaw.LIZIZ(1);
                            c1331750klB.LIZJ = iIntValue;
                            c1331750klB.LIZIZ = fLIZIZ;
                            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                            smartImageView.invalidate();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
