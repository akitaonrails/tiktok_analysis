package X;

import Y.ARunnableS111S0100000_11;
import Y.ARunnableS4S0401000_29;
import Y.ARunnableS62S0300000_29;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.aweme.ui.layout.FeedContentUiConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19647111tt extends PagerAdapter {
    public final Activity LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final Context LLILZ;
    public final VideoPublishEditModel LLILZIL;
    public final ImageAlbumData LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final float LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;
    public final boolean LLJILJIL;
    public final Function0<InterfaceC19647211tu> LLJILJILJ;
    public final AbstractC19647511tx LLJILLL;
    public final FeedContentLayoutInfo LLJJ;
    public final InterfaceC710220RtU LLJJI;
    public boolean LLJJIII;
    public C09AY LLJJIJI;
    public AwS573S0100000_29 LLJJIJIIJIL;
    public int LLJJIJIL;
    public ARunnableS111S0100000_11 LLJJJ;
    public C1322110kVd LLJJJIL;
    public final C01GW LLJJJJ;
    public final List<SingleImageData> LLJJJJJIL;
    public final ImageSynthesisResult[] LLJJJJLIIL;
    public final ConstraintLayout[] LLJJL;
    public final Map<C1322110kVd, C1321240kUE> LLJJLIIIJLLLLLLLZ;

    public C19647111tt() {
        throw null;
    }

    public final InterfaceC19647211tu LJJIJIL() {
        Function0<InterfaceC19647211tu> function0 = this.LLJILJILJ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final int LJJIJL() {
        return ((Number) this.LLJJJJ.getValue()).intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJJJJJIL.size();
    }

    public final void LJJIL(int i) {
        View viewFindViewById;
        C1322110kVd c1322110kVd;
        if (this.LLJJIJIL != i) {
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LLJJJ;
            if (aRunnableS111S0100000_11 != null && (c1322110kVd = this.LLJJJIL) != null) {
                HandlerHook.viewRemoveCallbacks(c1322110kVd, aRunnableS111S0100000_11);
            }
            View viewFindViewById2 = null;
            this.LLJJJ = null;
            this.LLJJJIL = null;
            View view = (View) C13LQ.LJJIIZ(this.LLJJIJIL, this.LLJJL);
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.kdp);
            } else {
                viewFindViewById = null;
            }
            View view2 = (View) C13LQ.LJJIIZ(this.LLJJIJIL, this.LLJJL);
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.rsb);
            }
            C337180DJs.LIZJ(viewFindViewById);
            C337180DJs.LIZ(viewFindViewById2);
            this.LLJJIJIL = i;
            LJJJ(i, false);
        }
    }

    public final boolean LJJIZ(boolean z) {
        long currentPosition;
        SrcLiveVideoInfo srcLiveInfo;
        LivePhotoPreviewMode livePhotoPreviewMode;
        SrcLiveVideoInfo srcLiveInfo2;
        this.LLJJIII = z;
        InterfaceC19647211tu interfaceC19647211tuLJJIJIL = LJJIJIL();
        long jLIZIZ = 0;
        if (interfaceC19647211tuLJJIJIL != null) {
            currentPosition = interfaceC19647211tuLJJIJIL.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        InterfaceC19647211tu interfaceC19647211tuLJJIJIL2 = LJJIJIL();
        if (interfaceC19647211tuLJJIJIL2 != null) {
            jLIZIZ = interfaceC19647211tuLJJIJIL2.LIZIZ();
        }
        if (currentPosition < jLIZIZ) {
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(this.LLJJIJIL, this.LLJJJJJIL);
            if (singleImageData != null && (srcLiveInfo = singleImageData.getSrcLiveInfo()) != null && C1413430msv.LJIILIIL(srcLiveInfo)) {
                SingleImageData singleImageData2 = (SingleImageData) C13LP.LJJJLZIJ(this.LLJJIJIL, this.LLJJJJJIL);
                View viewFindViewById = null;
                if (singleImageData2 != null && (srcLiveInfo2 = singleImageData2.getSrcLiveInfo()) != null) {
                    livePhotoPreviewMode = srcLiveInfo2.getLivePhotoPreviewMode();
                } else {
                    livePhotoPreviewMode = null;
                }
                if (livePhotoPreviewMode != LivePhotoPreviewMode.STATIC) {
                    if (z) {
                        View view = (View) C13LQ.LJJIIZ(this.LLJJIJIL, this.LLJJL);
                        if (view != null) {
                            viewFindViewById = view.findViewById(R.id.kdp);
                        }
                        C337180DJs.LIZ(viewFindViewById);
                        InterfaceC19647211tu interfaceC19647211tuLJJIJIL3 = LJJIJIL();
                        if (interfaceC19647211tuLJJIJIL3 != null) {
                            interfaceC19647211tuLJJIJIL3.rl();
                        }
                    } else {
                        InterfaceC19647211tu interfaceC19647211tuLJJIJIL4 = LJJIJIL();
                        if (interfaceC19647211tuLJJIJIL4 != null) {
                            interfaceC19647211tuLJJIJIL4.Li();
                            return true;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final void LJJJI(C1322110kVd c1322110kVd, InterfaceC1320380kSq interfaceC1320380kSq) {
        if (c1322110kVd.hasHierarchy()) {
            c1322110kVd.getHierarchy().LJIIZILJ(interfaceC1320380kSq);
            return;
        }
        C1331090kk7 c1331090kk7 = new C1331090kk7(C20642515q3.LJFF());
        c1331090kk7.LJIIL = interfaceC1320380kSq;
        c1322110kVd.setHierarchy(c1331090kk7.LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        boolean z;
        int i2;
        C19647311tv c19647311tvLJJJLL;
        InterfaceC1320380kSq interfaceC1320380kSq;
        Boolean boolValueOf;
        Integer numValueOf;
        C19ME c19me;
        View view = (View) C13LQ.LJJIIZ(i, this.LLJJL);
        if (view != null && view.getParent() == null) {
            viewGroup.addView(view);
            return view;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.tz, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.kc4);
        C1322110kVd c1322110kVd = (C1322110kVd) viewTd.findViewById(R.id.kdp);
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(i, this.LLJJJJJIL);
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (this.LLJJ != null && singleImageData != null) {
            int iLJJIJL = LJJIJL();
            if (this.LLJJJJJIL.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            float imageRatio = singleImageData.getImageRatio();
            float fLJJIJL = LJJIJL() / imageRatio;
            C720060SMi c720060SMiLIZ = C720430SNt.LIZ(LJJIJL(), this.LLJJJJJIL);
            if (c720060SMiLIZ != null) {
                if (this.LLJJI != null) {
                    i2 = measuredHeight;
                    c19647311tvLJJJLL = C1EE2.LIZIZ.LJJLI(this.LLILZ, this.LLJJ, LJJIJL(), (int) fLJJIJL, iLJJIJL, i2, viewGroup2, c720060SMiLIZ, i, C1428470nHB.LLIIIILZ(this.LLILZIL), this.LLJJI);
                } else {
                    i2 = measuredHeight;
                    c19647311tvLJJJLL = C1EE2.LIZIZ.LJJJLL(this.LLILZ, this.LLJJ, LJJIJL(), (int) fLJJIJL, iLJJIJL, i2, z);
                }
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    c19me.matchConstraintPercentHeight = c19647311tvLJJJLL.LIZIZ;
                    ((ViewGroup.MarginLayoutParams) c19me).height = 0;
                    c19me.verticalBias = 0.0f;
                    C786410Ut5.X5(c19me, viewGroup2);
                }
                switch (C0DVX.LIZ[c19647311tvLJJJLL.LIZ.ordinal()]) {
                    case 1:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LIZ;
                        break;
                    case 2:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LIZIZ;
                        break;
                    case 3:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                        break;
                    case 4:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LIZLLL;
                        break;
                    case 5:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LJ;
                        break;
                    case 6:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                        break;
                    case 7:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LJFF;
                        break;
                    default:
                        interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                        break;
                }
                LJJJI(c1322110kVd, interfaceC1320380kSq);
                float f = c19647311tvLJJJLL.LIZJ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
                c1322110kVd.setTranslationY(f);
                C426750GoL.LJIIIZ(viewGroup2, null, Integer.valueOf((int) c19647311tvLJJJLL.LIZLLL), null, null, false, 29);
                if (((Boolean) C273200AnG.LIZ.getValue()).booleanValue()) {
                    TextView textView = (TextView) C786410Ut5.LJLLLL((ViewStub) viewTd.findViewById(R.id.fh7)).findViewById(R.id.tv_photo_layout_debug);
                    FeedContentLayoutInfo feedContentLayoutInfo = this.LLJJ;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ViewPager: w:");
                    sbLIZ.append(LJJIJL());
                    sbLIZ.append(" h:");
                    sbLIZ.append(i2);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    sb.append("\nPreviewImageLayoutInfo:\n");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("  imageScaleType: ");
                    sbLIZ2.append(c19647311tvLJJJLL.LIZ);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                    sb.append('\n');
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("  heightPercentage: ");
                    sbLIZ3.append(c19647311tvLJJJLL.LIZIZ);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                    sb.append('\n');
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("  imageTranslationY: ");
                    sbLIZ4.append(c19647311tvLJJJLL.LIZJ);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ4));
                    sb.append('\n');
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("  imageContainerMarginTop: ");
                    sbLIZ5.append(c19647311tvLJJJLL.LIZLLL);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ5));
                    sb.append("\nImage size:\n");
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("  w: ");
                    sbLIZ6.append(LJJIJL());
                    sbLIZ6.append(" h: ");
                    sbLIZ6.append((int) fLJJIJL);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ6));
                    sb.append('\n');
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("  ratio: ");
                    sbLIZ7.append(imageRatio);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ7));
                    sb.append("\nFeedContentLayoutInfo:\n");
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("  titleLines: ");
                    sbLIZ8.append(feedContentLayoutInfo.titleLines);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ8));
                    sb.append('\n');
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("  descriptionLines: ");
                    sbLIZ9.append(feedContentLayoutInfo.descriptionLines);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ9));
                    sb.append('\n');
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("  rawDescLines: ");
                    sbLIZ10.append(feedContentLayoutInfo.rawDescLines);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ10));
                    sb.append('\n');
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("  totalHeight: ");
                    sbLIZ11.append(feedContentLayoutInfo.totalHeight);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ11));
                    sb.append('\n');
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("  textHeight: ");
                    sbLIZ12.append(feedContentLayoutInfo.textHeight);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ12));
                    sb.append('\n');
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("  belowTextHeight: ");
                    sbLIZ13.append(feedContentLayoutInfo.belowTextHeight);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ13));
                    sb.append('\n');
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("  maxTotalHeight: ");
                    sbLIZ14.append(feedContentLayoutInfo.maxTotalHeight);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ14));
                    sb.append('\n');
                    StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                    sbLIZ15.append("  lines: ");
                    sbLIZ15.append(feedContentLayoutInfo.titleLines + feedContentLayoutInfo.descriptionLines);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ15));
                    sb.append('\n');
                    StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                    sbLIZ16.append("  isLightBg: ");
                    FeedContentUiConfig feedContentUiConfig = feedContentLayoutInfo.uiConfig;
                    if (feedContentUiConfig != null) {
                        boolValueOf = Boolean.valueOf(feedContentUiConfig.isLightBg);
                    } else {
                        boolValueOf = null;
                    }
                    sbLIZ16.append(boolValueOf);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ16));
                    sb.append('\n');
                    StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                    sbLIZ17.append("  photoRadius: ");
                    FeedContentUiConfig feedContentUiConfig2 = feedContentLayoutInfo.uiConfig;
                    if (feedContentUiConfig2 != null) {
                        numValueOf = Integer.valueOf(feedContentUiConfig2.photoRadius);
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ17.append(numValueOf);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ17));
                    sb.append('\n');
                    textView.setText(sb.toString());
                }
            }
        } else if (this.LLJIJIL > 0 && singleImageData != null) {
            float f2 = measuredHeight;
            float fMax = Math.max(0.5625f, LJJIJL() / f2);
            float imageRatio2 = singleImageData.getImageRatio();
            float fLJJIJL2 = LJJIJL() / imageRatio2;
            float f3 = measuredHeight - this.LLJIJIL;
            float fMax2 = Math.max(LJJIJL() / 0.75f, f3);
            if (this.LLJILJIL && imageRatio2 <= fMax) {
                LJJJI(c1322110kVd, InterfaceC1320380kSq.LJI);
            } else if (fLJJIJL2 < f3) {
                float fMin = Math.min((f3 - fLJJIJL2) / 2.0f, this.LLJIJIL / 4.0f);
                C426750GoL.LJIIL(viewGroup2, null, Integer.valueOf((int) fMin), null, Integer.valueOf((int) ((measuredHeight - r9) - fMin)), 21);
                LJJJI(c1322110kVd, InterfaceC1320380kSq.LIZJ);
            } else {
                C426750GoL.LJIIL(viewGroup2, null, null, null, Integer.valueOf((int) (f2 - fMax2)), 23);
                LJJJI(c1322110kVd, InterfaceC1320380kSq.LJI);
            }
        }
        HandlerHook.viewPost(c1322110kVd, new ARunnableS4S0401000_29(c1322110kVd, this, viewGroup2, i, viewTd, 0));
        this.LLJJL[i] = viewTd;
        viewGroup.addView(viewTd);
        ?? r1 = this.LLJJIJI;
        if (r1 != 0) {
            r1.invoke();
        }
        this.LLJJIJI = null;
        return viewTd;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    public final void LJJIJLIJ(C1322110kVd c1322110kVd, Uri uri) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "image_preview_flash_black_opt", true, false)) {
            C1321240kUE c1321240kUE = (C1321240kUE) ((LinkedHashMap) this.LLJJLIIIJLLLLLLLZ).get(c1322110kVd);
            if (c1321240kUE != null) {
                C1321230kUD<C1323050kX9<AbstractC1327750kej>> c1321230kUD = c1321240kUE.LIZ;
                if (c1321230kUD != null) {
                    C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                    C1325710kbR c1325710kbRLIZ = C1325710kbR.LIZ(uri);
                    EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
                    c1325540kbALIZ.getClass();
                    C1320160kSU c1320160kSU = new C1320160kSU(c1325540kbALIZ, c1325710kbRLIZ, enumC1320950kTl);
                    c1321230kUD.LIZIZ = c1320160kSU;
                    for (C1321220kUC c1321220kUC : c1321230kUD.LIZ) {
                        if (!c1321220kUC.LJIIIIZZ()) {
                            c1321220kUC.LJIILLIIL(c1320160kSU);
                        }
                    }
                    return;
                }
                return;
            }
            c1322110kVd.setImageURI(uri);
            return;
        }
        c1322110kVd.setImageURI(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(int r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19647111tt.LJJJ(int, boolean):void");
    }

    public final void LJJJIL(int i, ImageSynthesisResult imageSynthesisResult) {
        if (i >= 0 && i < this.LLJJJJLIIL.length) {
            this.LLJJJJLIIL[i] = imageSynthesisResult;
            ConstraintLayout constraintLayout = this.LLJJL[i];
            if (constraintLayout != null) {
                C1322110kVd c1322110kVd = (C1322110kVd) constraintLayout.findViewById(R.id.kdp);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Debug-F updateSynthesisResult index = ");
                sbLIZ.append(i);
                C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                HandlerHook.viewPost(c1322110kVd, new ARunnableS62S0300000_29(this, c1322110kVd, imageSynthesisResult, 0));
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewById;
        View viewFindViewById2;
        if (!this.LLIZ) {
            int length = this.LLJJL.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                if (i3 == i) {
                    ConstraintLayout constraintLayout = this.LLJJL[i3];
                    if (constraintLayout != null && (viewFindViewById2 = constraintLayout.findViewById(R.id.kdp)) != null) {
                        viewFindViewById2.setTransitionName("transition_name_thumbnail");
                    }
                } else {
                    ConstraintLayout constraintLayout2 = this.LLJJL[i3];
                    if (constraintLayout2 != null && (viewFindViewById = constraintLayout2.findViewById(R.id.kdp)) != null) {
                        viewFindViewById.setTransitionName(null);
                    }
                }
                i2++;
                i3 = i4;
            }
        }
    }

    public C19647111tt(Activity activity, LifecycleOwner lifecycleOwner, Context context, VideoPublishEditModel videoPublishEditModel, ImageAlbumData imageAlbumData, boolean z, float f, boolean z2, int i, boolean z3, Function0 function0, AbstractC19647511tx abstractC19647511tx, FeedContentLayoutInfo feedContentLayoutInfo, InterfaceC710220RtU interfaceC710220RtU, int i2) {
        boolean z4 = z;
        boolean z5 = z2;
        float f2 = f;
        boolean z6 = z3;
        int i3 = i;
        InterfaceC710220RtU interfaceC710220RtU2 = interfaceC710220RtU;
        FeedContentLayoutInfo feedContentLayoutInfo2 = feedContentLayoutInfo;
        Function0 function02 = function0;
        activity = (i2 & 1) != 0 ? null : activity;
        lifecycleOwner = (i2 & 2) != 0 ? null : lifecycleOwner;
        z4 = (i2 & 64) != 0 ? false : z4;
        f2 = (i2 & 128) != 0 ? 0.0f : f2;
        z5 = (i2 & 256) != 0 ? false : z5;
        i3 = (i2 & 512) != 0 ? 0 : i3;
        z6 = (i2 & 1024) != 0 ? false : z6;
        function02 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : function02;
        feedContentLayoutInfo2 = (i2 & 8192) != 0 ? null : feedContentLayoutInfo2;
        interfaceC710220RtU2 = (i2 & 16384) != 0 ? null : interfaceC710220RtU2;
        this.LLILLJJLI = activity;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = context;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = imageAlbumData;
        this.LLIZ = false;
        this.LLIZLLLIL = z4;
        this.LLJ = f2;
        this.LLJI = z5;
        this.LLJIJIL = i3;
        this.LLJILJIL = z6;
        this.LLJILJILJ = function02;
        this.LLJILLL = abstractC19647511tx;
        this.LLJJ = feedContentLayoutInfo2;
        this.LLJJI = interfaceC710220RtU2;
        this.LLJJIII = true;
        this.LLJJIJIL = -1;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 280));
        List<SingleImageData> listLLIIII = C13LP.LLIIII(imageAlbumData.getImageList());
        this.LLJJJJJIL = listLLIIII;
        int size = listLLIIII.size();
        ImageSynthesisResult[] imageSynthesisResultArr = new ImageSynthesisResult[size];
        for (int i4 = 0; i4 < size; i4++) {
            imageSynthesisResultArr[i4] = null;
        }
        this.LLJJJJLIIL = imageSynthesisResultArr;
        ConstraintLayout[] constraintLayoutArr = new ConstraintLayout[size];
        for (int i5 = 0; i5 < size; i5++) {
            constraintLayoutArr[i5] = null;
        }
        this.LLJJL = constraintLayoutArr;
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashMap();
    }
}
