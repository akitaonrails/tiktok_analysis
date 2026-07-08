package X;

import X.C054G;
import X.C2021907w1;
import X.C2296808zG;
import Y.ACListenerS140S0100000_5;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19656611vQ implements C0FUG, InterfaceC19657911vd {
    public final Context LL;
    public final FrameLayout LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C390420FSm LLILZ;
    public final InterfaceC388760FMc LLILZIL;
    public final List<C0FTJ<StickerModel>> LLIZ;
    public C19657311vX LLJIJIL;
    public C054G LLJILJILJ;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1304));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1303));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(424));
    public final C19656911vT LLJI = new C19656911vT(new AwS549S0100000_5(this, 1305), new AwS643S0100000_29(this, 141));
    public final Map<Integer, Pair<Float, Float>> LLJILJIL = new LinkedHashMap();
    public Function0<Unit> LLJILLL = AFwS218S0000000_29.get$arr$(419);
    public Function0<Unit> LLJJ = AFwS218S0000000_29.get$arr$(423);
    public Function0<Unit> LLJJI = AFwS218S0000000_29.get$arr$(421);
    public Function0<Unit> LLJJIII = AFwS218S0000000_29.get$arr$(422);
    public Function0<Unit> LLJJIJI = AFwS218S0000000_29.get$arr$(420);
    public final Map<Integer, C0FFO> LLJJIJIIJIL = new LinkedHashMap();

    @Override // X.C0FUG
    public final void LIZJ() {
    }

    @Override // X.C0FUG
    public final void LJI() {
    }

    @Override // X.C0FUG
    public final void LJII(MotionEvent motionEvent) {
    }

    @Override // X.C0FUG
    public final void LJIIIIZZ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJ(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIJJI(float f, int i, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJIILL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIILLIIL(int i) {
    }

    @Override // X.C0FUG
    public final void LJIIZILJ() {
    }

    @Override // X.C0FUG
    public final void LJIJ(int i, EnumC1466150oFx enumC1466150oFx) {
    }

    @Override // X.C0FUG
    public final void LJIJI(int i, boolean z) {
    }

    @Override // X.C0FUG
    public final void LJIL() {
    }

    @Override // X.C0FUG
    public final void LJJI(int i, float f, float f2, RectF rectF) {
    }

    @Override // X.C0FUG
    public final void LJJIII() {
    }

    @Override // X.C0FUG
    public final void LJJIIJZLJL() {
    }

    @Override // X.C0FUG
    public final void LJJIIZ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2, RectF rectF, float f3) {
    }

    @Override // X.C0FUG
    public final void LJJIJ() {
    }

    @Override // X.C0FUG
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.C0FUG
    public final int getPriority() {
        return 100;
    }

    @Override // X.InterfaceC19657911vd
    public final void LJ() {
        C19657311vX c19657311vX = this.LLJIJIL;
        if (c19657311vX != null) {
            c19657311vX.getCancelButton().performClick();
        }
    }

    public final C1664680tQA<C19656711vR> LJIILIIL() {
        return (C1664680tQA) this.LLJ.getValue();
    }

    public final List<C0FTB> LJIILJJIL() {
        return (List) this.LLILZLL.getValue();
    }

    public final void LJIJJLI() {
        this.LLJJIJI.invoke();
        ((C0FT9) this.LLIZLLLIL.getValue()).LIZ.invoke(Boolean.TRUE);
        LJIIIZ(LJIILIIL().LIZ.LIZ, false);
        LJIILIIL().LIZLLL(AFwS273S0000000_29.get$arr$(383), true);
        LJIILIIL().LIZLLL(AFwS273S0000000_29.get$arr$(384), true);
        C054G c054g = this.LLJILJILJ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        ((LinkedHashMap) this.LLJILJIL).clear();
        for (C0FTJ<StickerModel> c0ftj : this.LLIZ) {
            c0ftj.LJIIZILJ(EnumC390580FTc.NORMAL, c0ftj.LJ());
        }
    }

    public final void LJJIIJ() {
        InterfaceC1452170ntP interfaceC1452170ntPLJII;
        InterfaceC386690FEd interfaceC386690FEdLIZIZ = this.LLILZIL.LIZIZ();
        int iNg = (interfaceC386690FEdLIZIZ == null || (interfaceC1452170ntPLJII = interfaceC386690FEdLIZIZ.LJII()) == null) ? 0 : interfaceC1452170ntPLJII.ng();
        C19657311vX c19657311vX = this.LLJIJIL;
        if (c19657311vX == null) {
            c19657311vX = null;
        }
        C12UW videoEditView = c19657311vX.getVideoEditView();
        videoEditView.setMinVideoLength(100L);
        videoEditView.setMaxVideoLength(iNg);
        videoEditView.LJJIII(iNg);
        videoEditView.LJJIZ();
        C19657311vX c19657311vX2 = this.LLJIJIL;
        if (c19657311vX2 == null) {
            c19657311vX2 = null;
        }
        c19657311vX2.getMultiVideoVideoModel().LLJILJILJ = iNg;
        C19657311vX c19657311vX3 = this.LLJIJIL;
        if (c19657311vX3 == null) {
            c19657311vX3 = null;
        }
        c19657311vX3.LIZIZ((int) LJIILIIL().LIZ.LJ);
        C19657311vX c19657311vX4 = this.LLJIJIL;
        if (c19657311vX4 == null) {
            c19657311vX4 = null;
        }
        C12UW videoEditView2 = c19657311vX4.getVideoEditView();
        if (!videoEditView2.isLaidOut() || videoEditView2.isLayoutRequested()) {
            videoEditView2.addOnLayoutChangeListener(new C12YD(this, 13));
            return;
        }
        C19657311vX c19657311vX5 = this.LLJIJIL;
        if (c19657311vX5 == null) {
            c19657311vX5 = null;
        }
        c19657311vX5.getVideoEditView().LJJJ((int) LJIILIIL().LIZ.LJ, (int) LJIILIIL().LIZ.LJFF, false);
        C19657311vX c19657311vX6 = this.LLJIJIL;
        (c19657311vX6 != null ? c19657311vX6 : null).getMultiVideoVideoModel().LLILLL.setValue(Long.valueOf((long) LJIILIIL().LIZ.LJ));
    }

    @Override // X.InterfaceC19657911vd
    public final C1664680tQA<C19656711vR> LIZ() {
        return LJIILIIL();
    }

    public final void LJIJJ(C0FTJ<? extends StickerModel> c0ftj) {
        float duration;
        if (!C385630FAb.LIZJ(c0ftj.LJJIIJZLJL())) {
            int stickerId = c0ftj.getStickerId();
            InterfaceC386690FEd interfaceC386690FEdLIZIZ = this.LLILZIL.LIZIZ();
            if (interfaceC386690FEdLIZIZ != null) {
                duration = interfaceC386690FEdLIZIZ.getDuration();
            } else {
                duration = 0.0f;
            }
            LJJIFFI(stickerId, 0.0f, duration, true);
            List<C0FTB> listLJIILJJIL = LJIILJJIL();
            ArrayList arrayList = new ArrayList();
            for (C0FTB c0ftb : listLJIILJJIL) {
                if (C13LQ.LJIILLIIL(c0ftj.getStickerType(), c0ftb.LJJIJIL())) {
                    arrayList.add(c0ftb);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C0FTB) it2.next()).LJJIFFI(LJIILIIL().LIZ.LIZ);
            }
        }
    }

    public final void LJJII(C0FTJ<? extends StickerModel> c0ftj) {
        boolean z;
        int i;
        Scene scene;
        int iNg;
        boolean zLJIILIIL;
        InterfaceC1452170ntP interfaceC1452170ntPLJII;
        C19560811fy c19560811fy;
        LifecycleOwner lifecycleOwner;
        InterfaceC1452170ntP interfaceC1452170ntPLJII2;
        int duration;
        InterfaceC1452170ntP interfaceC1452170ntPLJII3;
        LJIJJ(c0ftj);
        LJIILIIL().LIZLLL(new AwS608S0100000_29(c0ftj, (C0FTJ<? extends StickerModel>) 748), true);
        LJIIIZ(c0ftj.getStickerId(), true);
        ((C0FT9) this.LLIZLLLIL.getValue()).LIZ.invoke(Boolean.FALSE);
        if (this.LLJIJIL != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.LLJIJIL = new C19657311vX(this.LL);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            FrameLayout frameLayout = this.LLILLJJLI;
            C19657311vX c19657311vX = this.LLJIJIL;
            if (c19657311vX == null) {
                c19657311vX = null;
            }
            frameLayout.addView(c19657311vX, layoutParams);
            C19657311vX c19657311vX2 = this.LLJIJIL;
            if (c19657311vX2 == null) {
                c19657311vX2 = null;
            }
            C1664680tQA<C19656711vR> c1664680tQALJIILIIL = LJIILIIL();
            LifecycleOwner lifecycleOwner2 = this.LLILLL;
            InterfaceC388760FMc interfaceC388760FMc = this.LLILZIL;
            C19656911vT c19656911vT = this.LLJI;
            c19657311vX2.LL = c1664680tQALJIILIIL;
            c19657311vX2.LLILLJJLI = lifecycleOwner2;
            c19657311vX2.LLILLL = interfaceC388760FMc;
            c19657311vX2.LLILZ = c19656911vT;
            C786410Ut5.Sd(R.layout.fag, C786410Ut5.ne(c19657311vX2.getContext()), c19657311vX2);
            c19657311vX2.LLILZIL = (TuxTextView) c19657311vX2.findViewById(R.id.xqb);
            c19657311vX2.setPlayButton((TuxIconView) c19657311vX2.findViewById(R.id.ct9));
            c19657311vX2.setSaveButton((ImageView) c19657311vX2.findViewById(R.id.tz5));
            c19657311vX2.setCancelButton((ImageView) c19657311vX2.findViewById(R.id.dat));
            LifecycleOwner lifecycleOwner3 = c19657311vX2.LLILLJJLI;
            if (lifecycleOwner3 == null) {
                lifecycleOwner3 = null;
            }
            if ((lifecycleOwner3 instanceof Scene) && (scene = (Scene) lifecycleOwner3) != null && C545820Lau.LIZIZ(scene) != null && c19657311vX2.LLILZLL == null) {
                c19657311vX2.setVideoEditView((C12UW) c19657311vX2.findViewById(R.id.video_edit_view));
                LifecycleOwner lifecycleOwner4 = c19657311vX2.LLILLJJLI;
                if (lifecycleOwner4 == null) {
                    lifecycleOwner4 = null;
                }
                c19657311vX2.setMultiVideoVideoModel((CutMultiVideoViewModel) C1659630tI1.LJIIIIZZ((Scene) lifecycleOwner4, null, null, 6).get(CutMultiVideoViewModel.class));
                c19657311vX2.getVideoEditView().setCanEdit(false);
                c19657311vX2.getVideoEditView().setMinVideoLength(100L);
                c19657311vX2.getVideoEditView().setUseCustomMaxVideoLengthDirectly(true);
                InterfaceC388760FMc interfaceC388760FMc2 = c19657311vX2.LLILLL;
                if (interfaceC388760FMc2 == null) {
                    interfaceC388760FMc2 = null;
                }
                InterfaceC386690FEd interfaceC386690FEdLIZIZ = interfaceC388760FMc2.LIZIZ();
                if (interfaceC386690FEdLIZIZ != null && (interfaceC1452170ntPLJII3 = interfaceC386690FEdLIZIZ.LJII()) != null) {
                    iNg = interfaceC1452170ntPLJII3.ng();
                } else {
                    iNg = 0;
                }
                c19657311vX2.getVideoEditView().setMaxVideoLength(iNg);
                CutMultiVideoViewModel multiVideoVideoModel = c19657311vX2.getMultiVideoVideoModel();
                InterfaceC388760FMc interfaceC388760FMc3 = c19657311vX2.LLILLL;
                if (interfaceC388760FMc3 == null) {
                    interfaceC388760FMc3 = null;
                }
                C0FF8 c0ff8LIZ = interfaceC388760FMc3.LIZ();
                if (c0ff8LIZ != null) {
                    zLJIILIIL = c0ff8LIZ.LJIILIIL();
                } else {
                    zLJIILIIL = false;
                }
                multiVideoVideoModel.LLJILJIL = zLJIILIIL;
                c19657311vX2.getMultiVideoVideoModel().LLJILJILJ = iNg;
                C12UW videoEditView = c19657311vX2.getVideoEditView();
                InterfaceC388760FMc interfaceC388760FMc4 = c19657311vX2.LLILLL;
                if (interfaceC388760FMc4 == null) {
                    interfaceC388760FMc4 = null;
                }
                InterfaceC386690FEd interfaceC386690FEdLIZIZ2 = interfaceC388760FMc4.LIZIZ();
                if (interfaceC386690FEdLIZIZ2 != null) {
                    interfaceC1452170ntPLJII = interfaceC386690FEdLIZIZ2.LJII();
                } else {
                    interfaceC1452170ntPLJII = null;
                }
                videoEditView.setVeEditor(interfaceC1452170ntPLJII);
                C12UW videoEditView2 = c19657311vX2.getVideoEditView();
                InterfaceC388760FMc interfaceC388760FMc5 = c19657311vX2.LLILLL;
                if (interfaceC388760FMc5 == null) {
                    interfaceC388760FMc5 = null;
                }
                InterfaceC386690FEd interfaceC386690FEdLIZIZ3 = interfaceC388760FMc5.LIZIZ();
                if (interfaceC386690FEdLIZIZ3 != null && (interfaceC1452170ntPLJII2 = interfaceC386690FEdLIZIZ3.LJII()) != null) {
                    int frameWidth = videoEditView2.getFrameWidth();
                    int frameHeight = videoEditView2.getFrameHeight();
                    int iCeil = (int) Math.ceil((C12ES.LJIIJ(c19657311vX2.getContext()) - (videoEditView2.getLeftRightMargin() * 2)) / (frameWidth * 1.0f));
                    VEEditor.GET_FRAMES_FLAGS get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                    InterfaceC388760FMc interfaceC388760FMc6 = c19657311vX2.LLILLL;
                    if (interfaceC388760FMc6 == null) {
                        interfaceC388760FMc6 = null;
                    }
                    if (interfaceC388760FMc6.LJIJJ()) {
                        InterfaceC388760FMc interfaceC388760FMc7 = c19657311vX2.LLILLL;
                        if (interfaceC388760FMc7 == null) {
                            interfaceC388760FMc7 = null;
                        }
                        InterfaceC386690FEd interfaceC386690FEdLIZIZ4 = interfaceC388760FMc7.LIZIZ();
                        if (interfaceC386690FEdLIZIZ4 != null) {
                            duration = interfaceC386690FEdLIZIZ4.getDuration();
                        } else {
                            duration = 0;
                        }
                        InterfaceC388760FMc interfaceC388760FMc8 = c19657311vX2.LLILLL;
                        if (interfaceC388760FMc8 == null) {
                            interfaceC388760FMc8 = null;
                        }
                        int iLJJIII = interfaceC388760FMc8.LJJIII();
                        LifecycleOwner lifecycleOwner5 = c19657311vX2.LLILLJJLI;
                        if (lifecycleOwner5 == null) {
                            lifecycleOwner5 = null;
                        }
                        c19560811fy = new C19560811fy(new VEMultiEditVideoCoverGeneratorImpl(interfaceC1452170ntPLJII2, lifecycleOwner5, iCeil, duration, iLJJIII, get_frames_flags), frameWidth, frameHeight, iCeil);
                    } else {
                        LifecycleOwner lifecycleOwner6 = c19657311vX2.LLILLJJLI;
                        if (lifecycleOwner6 == null) {
                            lifecycleOwner6 = null;
                        }
                        c19560811fy = new C19560811fy(new VEVideoCoverGeneratorImpl(interfaceC1452170ntPLJII2, lifecycleOwner6, iCeil, get_frames_flags, "sticker_select_time"), frameWidth, frameHeight, iCeil);
                    }
                } else {
                    c19560811fy = null;
                }
                c19657311vX2.LLJIJIL = c19560811fy;
                C12UW videoEditView3 = c19657311vX2.getVideoEditView();
                LifecycleOwner lifecycleOwner7 = c19657311vX2.LLILLJJLI;
                if (lifecycleOwner7 == null) {
                    lifecycleOwner = null;
                    lifecycleOwner7 = null;
                } else {
                    lifecycleOwner = lifecycleOwner7;
                }
                ViewModelProvider viewModelProviderLJIIIIZZ = C1659630tI1.LJIIIIZZ((Scene) lifecycleOwner7, null, null, 6);
                CutMultiVideoViewModel multiVideoVideoModel2 = c19657311vX2.getMultiVideoVideoModel();
                C19560811fy c19560811fy2 = c19657311vX2.LLJIJIL;
                InterfaceC388760FMc interfaceC388760FMc9 = c19657311vX2.LLILLL;
                if (interfaceC388760FMc9 == null) {
                    interfaceC388760FMc9 = null;
                }
                List<MediaModel> videoList = interfaceC388760FMc9.getVideoList();
                videoEditView3.LLLFZ = c19560811fy2;
                videoEditView3.LLLI = false;
                videoEditView3.LJII(lifecycleOwner, viewModelProviderLJIIIIZZ, multiVideoVideoModel2, videoList);
                c19657311vX2.getVideoEditView().setEnableBoundaryText(true);
                i = 2;
                c19657311vX2.getVideoEditView().setPointerType(2);
            } else {
                i = 2;
            }
            C12UW videoEditView4 = c19657311vX2.getVideoEditView();
            if (videoEditView4.isLaidOut() && !videoEditView4.isLayoutRequested()) {
                c19657311vX2.LIZ();
            } else {
                videoEditView4.addOnLayoutChangeListener(new C12YD(c19657311vX2, 14));
            }
            C19657311vX c19657311vX3 = this.LLJIJIL;
            if (c19657311vX3 == null) {
                c19657311vX3 = null;
            }
            C786410Ut5.Q7(c19657311vX3.getSaveButton(), new ACListenerS140S0100000_5(this, 146));
            C19657311vX c19657311vX4 = this.LLJIJIL;
            if (c19657311vX4 == null) {
                c19657311vX4 = null;
            }
            C786410Ut5.Q7(c19657311vX4.getCancelButton(), new View.OnClickListener() { // from class: X.0FTa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = this.LL.LJIILIIL().LIZ.LIZ;
                    C19656611vQ c19656611vQ = this.LL;
                    for (Map.Entry entry : ((LinkedHashMap) c19656611vQ.LLJILJIL).entrySet()) {
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        Pair pair = (Pair) entry.getValue();
                        c19656611vQ.LJJIFFI(iIntValue, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), true);
                        C0FTJ c0ftjLIZ = C0FKU.LIZ(iIntValue, c19656611vQ.LLIZ);
                        if (c0ftjLIZ != null) {
                            List<C0FTB> listLJIILJJIL = c19656611vQ.LJIILJJIL();
                            ArrayList arrayList = new ArrayList();
                            for (C0FTB c0ftb : listLJIILJJIL) {
                                if (C13LQ.LJIILLIIL(c0ftjLIZ.getStickerType(), c0ftb.LJJIJIL())) {
                                    arrayList.add(c0ftb);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((C0FTB) it2.next()).LJJIFFI(iIntValue);
                            }
                        }
                    }
                    this.LL.LLILZIL.LJIJI(true);
                    this.LL.LLJILLL.invoke();
                    this.LL.LJIJJLI();
                    C0FTJ c0ftjLIZ2 = C0FKU.LIZ(i2, this.LL.LLIZ);
                    if (c0ftjLIZ2 == null) {
                        return;
                    }
                    List<C0FTB> listLJIILJJIL2 = this.LL.LJIILJJIL();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0FTB c0ftb2 : listLJIILJJIL2) {
                        if (C13LQ.LJIILLIIL(c0ftjLIZ2.getStickerType(), c0ftb2.LJJIJIL())) {
                            arrayList2.add(c0ftb2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((C0FTB) it3.next()).LJJIIZI(i2);
                    }
                }
            });
            C19657311vX c19657311vX5 = this.LLJIJIL;
            if (c19657311vX5 == null) {
                c19657311vX5 = null;
            }
            C786410Ut5.a9(c19657311vX5.getPlayButton(), new ACListenerS163S0100000_29(this, 281));
            this.LLILLL.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationEdit$initObserver$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner8, Lifecycle.Event event) {
                    C054G c054g;
                    if (C2021907w1.LIZ[event.ordinal()] == 1 && (c054g = this.LL.LLJILJILJ) != null) {
                        C2296808zG.LIZLLL(c054g, "");
                    }
                }
            });
            LJIILIIL().LIZ(new C2217381BqS() { // from class: X.11vU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C19656711vR) obj).LIZ);
                }
            }).LJIIIZ(this.LLILLL, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 750));
            LJIILIIL().LIZ(new C2217381BqS() { // from class: X.11vV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C19656711vR) obj).LIZLLL;
                }
            }).LJIIIZ(this.LLILLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1035));
        } else {
            i = 2;
        }
        C19657311vX c19657311vX6 = this.LLJIJIL;
        if (c19657311vX6 == null) {
            c19657311vX6 = null;
        }
        InterfaceC388760FMc interfaceC388760FMc10 = c19657311vX6.LLILLL;
        if (interfaceC388760FMc10 == null) {
            interfaceC388760FMc10 = null;
        }
        List<MediaModel> listLJIIZILJ = interfaceC388760FMc10.LJIIZILJ();
        C19560811fy c19560811fy3 = c19657311vX6.LLJIJIL;
        if (c19560811fy3 != null) {
            c19560811fy3.LIZIZ();
        }
        ArrayList arrayListLIZ = C571930Mbv.LIZ(listLJIIZILJ, true, null, false, 12);
        C12UW videoEditView5 = c19657311vX6.getVideoEditView();
        if (arrayListLIZ.size() > 1) {
            i = 1;
        }
        videoEditView5.setEditState(i);
        c19657311vX6.getVideoEditView().LIZLLL(null, arrayListLIZ);
        this.LLILZIL.LJIJI(false);
        if (c0ftj.getStickerId() >= 0) {
            this.LLJJI.invoke();
        } else {
            this.LLJJIII.invoke();
        }
        LJJIIJ();
        c0ftj.LJIJ(c0ftj.LJJIIJZLJL(), true);
    }

    @Override // X.InterfaceC19657911vd
    public final void LIZLLL(float f, float f2) {
        C19657311vX c19657311vX = this.LLJIJIL;
        if (c19657311vX == null) {
            c19657311vX = null;
        }
        c19657311vX.getVideoEditView().LJIIL();
        C19612011oE c19612011oELJIIL = LJIIL(f, f2);
        LJIIIZ(c19612011oELJIIL.getStickerId(), true);
        LJIILIIL().LIZLLL(new AwS135S0101000_29(c19612011oELJIIL, c19612011oELJIIL.getStickerId(), 10), true);
        LJJIIJ();
    }

    @Override // X.InterfaceC19657911vd
    public final void LJFF(float f, float f2) {
        LJJII(LJIIL(f, f2));
    }

    public final void LJIIIZ(int i, boolean z) {
        if (z) {
            if (this.LLJJIJIIJIL.isEmpty()) {
                Map<Integer, C0FFO> map = this.LLJJIJIIJIL;
                List<C0FTJ<StickerModel>> list = this.LLIZ;
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C0FTJ<StickerModel> c0ftj : list) {
                    Pair pair = new Pair(Integer.valueOf(c0ftj.getStickerId()), c0ftj.LJIILL());
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                map.putAll(linkedHashMap);
            }
            for (C0FTJ<StickerModel> c0ftj2 : this.LLIZ) {
                c0ftj2.LJIIL(false);
                c0ftj2.LJJIII(false);
                c0ftj2.LIZJ(false);
                c0ftj2.LJJ(false);
                c0ftj2.LJIILJJIL(true);
                if (c0ftj2.getStickerId() == i) {
                    c0ftj2.LJIIZILJ(EnumC390580FTc.EMPHASIZED, c0ftj2.LJ());
                    Integer numLJJI = c0ftj2.LJJI();
                    if (numLJJI != null) {
                        LJIILIIL().LIZLLL(AFwS273S0000000_29.get$arr$(385), true);
                        LJIILIIL().LIZLLL(new AwS608S0100000_29(numLJJI, 749), true);
                        LJIILIIL().LIZLLL(AFwS273S0000000_29.get$arr$(386), true);
                    } else {
                        LJIILIIL().LIZLLL(AFwS273S0000000_29.get$arr$(387), true);
                    }
                } else {
                    c0ftj2.LJIIZILJ(EnumC390580FTc.IGNORED, 0.3137255f);
                }
            }
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LLJJIJIIJIL).entrySet()) {
            C0FTJ c0ftjLIZ = C0FKU.LIZ(((Number) entry.getKey()).intValue(), this.LLIZ);
            if (c0ftjLIZ != null) {
                c0ftjLIZ.LJIIL(((C0FFO) entry.getValue()).LIZJ);
                c0ftjLIZ.LJJIII(((C0FFO) entry.getValue()).LIZLLL);
                c0ftjLIZ.LIZJ(((C0FFO) entry.getValue()).LJI);
                c0ftjLIZ.LJJ(((C0FFO) entry.getValue()).LJ);
                c0ftjLIZ.LJIILJJIL(((C0FFO) entry.getValue()).LJIIL);
            }
        }
        ((LinkedHashMap) this.LLJJIJIIJIL).clear();
        Iterator<C0FTJ<StickerModel>> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ();
        }
        LJIILIIL().LIZLLL(AFwS273S0000000_29.get$arr$(388), true);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.11oE] */
    public final C19612011oE LJIIL(float f, float f2) {
        final Context context = this.LL;
        final BaseStickerModel baseStickerModel = new BaseStickerModel(-1, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, f2, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -100663298, 15, null);
        final C0FFO c0ffo = new C0FFO(null, 0, false, false, false, false, false, null, null, false, false, false, false, false, false, new C19774612Ym(29), 1835007);
        final LifecycleOwner lifecycleOwner = this.LLILLL;
        final C390420FSm c390420FSm = this.LLILZ;
        return new C0FFE<StickerModel>(context, baseStickerModel, c0ffo, lifecycleOwner, c390420FSm) { // from class: X.11oE
            @Override // X.C0FFE, X.C0FTJ
            public final float LJ() {
                return 1.0f;
            }

            @Override // X.C0FFE
            public final void LJJJJIZL(BaseStickerModel baseStickerModel2) {
            }

            @Override // X.C0FTJ
            public final void setAlpha(float f3) {
            }

            @Override // X.C0FFE, X.C0FTJ
            public final void setVisible(boolean z) {
            }

            @Override // X.C0FFE, X.C0FTJ
            public final C0FFO LJIILL() {
                return new C0FFO(null, 0, false, false, false, false, false, null, null, false, false, false, false, false, false, new C19774612Ym(28), 1835007);
            }

            @Override // X.C0FFE
            public final View LJJJJJ() {
                return new View(this.LJIILIIL.LL);
            }

            @Override // X.C0FTJ
            public final StickerModel LJLI() {
                return new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
            }
        };
    }

    public C19656611vQ(Context context, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        this.LL = context;
        this.LLILLJJLI = frameLayout;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c390420FSm;
        this.LLILZIL = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
        this.LLIZ = C390410FSl.LIZLLL(c390420FSm);
    }

    @Override // X.C0FUG
    public final void LJJ(int i, EnumC1466150oFx enumC1466150oFx, float f, float f2) {
        if (LJIILIIL().LIZ.LIZIZ) {
            if (i != LJIILIIL().LIZ.LIZ) {
                C0FTJ<? extends StickerModel> c0ftjLIZ = C0FKU.LIZ(i, this.LLIZ);
                if (c0ftjLIZ == null) {
                    return;
                }
                LJIIIZ(i, true);
                this.LLJJI.invoke();
                c0ftjLIZ.LJIJ(c0ftjLIZ.LJJIIJZLJL(), true);
                LJIJJ(c0ftjLIZ);
                LJIILIIL().LIZLLL(new AwS135S0101000_29(c0ftjLIZ, (C0FTJ<? extends StickerModel>) i, 11), true);
                LJJIIJ();
                List<C0FTB> listLJIILJJIL = LJIILJJIL();
                ArrayList arrayList = new ArrayList();
                for (C0FTB c0ftb : listLJIILJJIL) {
                    if (C13LQ.LJIILLIIL(enumC1466150oFx, c0ftb.LJJIJIL())) {
                        arrayList.add(c0ftb);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C0FTB) it2.next()).LJJIJIIJIL(i);
                }
                return;
            }
            if (Intrinsics.LJFF(LJIILIIL().LIZ.LIZLLL, Boolean.TRUE)) {
                LJIILIIL().LIZLLL(AFwS273S0000000_29.get$arr$(389), true);
                LJJIIJ();
            }
        }
    }

    public final void LJJIFFI(int i, float f, float f2, boolean z) {
        C00E4 c00e4;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "sticker_flicker_fix_switch", true, false)) {
            if (z) {
                C0FTJ c0ftjLIZ = C0FKU.LIZ(i, this.LLIZ);
                if (c0ftjLIZ != null) {
                    c0ftjLIZ.LJIIJ(f, f2, C00E4.NORMAL);
                    return;
                }
                return;
            }
            C0FTJ c0ftjLIZ2 = C0FKU.LIZ(i, this.LLIZ);
            if (c0ftjLIZ2 == null) {
                return;
            }
            C19657311vX c19657311vX = this.LLJIJIL;
            if (c19657311vX == null) {
                c19657311vX = null;
            }
            c0ftjLIZ2.LJIIJ(0.0f, c19657311vX.getMultiVideoVideoModel().LLJILJILJ, C00E4.ON_GOING);
            return;
        }
        C0FTJ c0ftjLIZ3 = C0FKU.LIZ(i, this.LLIZ);
        if (c0ftjLIZ3 == null) {
            return;
        }
        if (z) {
            c00e4 = C00E4.NORMAL;
        } else {
            c00e4 = C00E4.ON_GOING;
        }
        c0ftjLIZ3.LJIIJ(f, f2, c00e4);
    }

    @Override // X.InterfaceC19657911vd
    public final void LIZIZ(C19671111xl c19671111xl, C121L c121l, AwS430S0200000_29 awS430S0200000_29, AwS573S0100000_29 awS573S0100000_29, AwS430S0200000_29 awS430S0200000_292) {
        this.LLJJ = c19671111xl;
        this.LLJILLL = c121l;
        this.LLJJI = awS430S0200000_29;
        this.LLJJIII = awS573S0100000_29;
        this.LLJJIJI = awS430S0200000_292;
    }
}
