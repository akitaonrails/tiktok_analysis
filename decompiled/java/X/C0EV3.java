package X;

import Y.ACListenerS140S0100000_5;
import Y.AObserverS170S0200000_5;
import Y.AsS15S0110000_5;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EV3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EV3 extends AbstractC1664490tPr<C364500EQu, C0ER6> {
    public EditCaptionScene.HighLightLayoutManager LLJJJIL;
    public C425240Glu LLJJJJ;
    public View LLJJJJJIL;
    public C384570F5z LLJJJJLIIL;
    public C197039127h LLJJL;
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public long LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public AnonymousClass0956 LLJZIJLIL;
    public LinearLayout LLLFF;
    public TuxTextView LLLFFI;
    public TuxTextView LLLFZ;
    public C1390410mHn LLLI;
    public final ValueAnimator LLLII;
    public C1397510mTF LLLIIII;
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(166));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 608));
    public List<Pair<Integer, Pair<Integer, Integer>>> LLJLILLLLZIIL = C13BV.INSTANCE;
    public final AsS15S0110000_5 LLL = new AsS15S0110000_5(this, 0);
    public final C0EVB LLLF = new InterfaceC21676019sM() { // from class: X.0EVB
        @Override // X.InterfaceC21676019sM
        public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // X.InterfaceC21676019sM
        public final void LJIIZILJ(boolean z) {
        }

        @Override // X.InterfaceC21676019sM
        public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                this.LL.LLJLLL = false;
            } else {
                C0EV3 c0ev3 = this.LL;
                if (!c0ev3.LLJLLL) {
                    c0ev3.LLJLLL = true;
                    return false;
                }
            }
            return false;
        }
    };

    public final C364490EQt LLLLLJIL() {
        return (C364490EQt) this.LLJLIL.getValue();
    }

    public final void LLLLLJLJLL() {
        C425240Glu c425240Glu;
        C425240Glu c425240Glu2;
        C384570F5z c384570F5z;
        EditCaptionScene.HighLightLayoutManager highLightLayoutManager = this.LLJJJIL;
        if (highLightLayoutManager == null || (c425240Glu = this.LLJJJJ) == null || !c425240Glu.isShown() || (c425240Glu2 = this.LLJJJJ) == null || c425240Glu2.getAdapter() == null) {
            return;
        }
        int iFindFirstCompletelyVisibleItemPosition = highLightLayoutManager.findFirstCompletelyVisibleItemPosition();
        int iMin = iFindFirstCompletelyVisibleItemPosition != -1 ? Math.min(iFindFirstCompletelyVisibleItemPosition, highLightLayoutManager.getItemCount() - 1) : highLightLayoutManager.getItemCount() - 1;
        C384570F5z c384570F5z2 = this.LLJJJJLIIL;
        if ((c384570F5z2 == null || c384570F5z2.LLLFZ() != iMin) && (c384570F5z = this.LLJJJJLIIL) != null) {
            c384570F5z.LLLI(iMin);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0EVB] */
    public C0EV3() {
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(15400L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0EV6
            /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onAnimationUpdate(android.animation.ValueAnimator r9) {
                /*
                    r8 = this;
                    float r3 = r9.getAnimatedFraction()
                    android.animation.ValueAnimator r0 = r1
                    long r1 = r0.getDuration()
                    float r0 = (float) r1
                    float r3 = r3 * r0
                    int r2 = (int) r3
                    r5 = 1
                    r7 = 0
                    if (r2 < 0) goto L2e
                    r0 = 6001(0x1771, float:8.409E-42)
                    if (r2 >= r0) goto L20
                    int r6 = r2 / 100
                L17:
                    X.0EV3 r0 = r2
                    android.content.Context r1 = r0.getSceneContext()
                    if (r1 != 0) goto L35
                    return
                L20:
                    r1 = 6000(0x1770, float:8.408E-42)
                    if (r1 > r2) goto L2e
                    r0 = 10001(0x2711, float:1.4014E-41)
                    if (r2 >= r0) goto L2e
                    int r2 = r2 - r1
                    int r0 = r2 / 200
                    int r6 = r0 + 60
                    goto L17
                L2e:
                    int r0 = r2 + (-10000)
                    int r0 = r0 / 300
                    int r6 = r0 + 80
                    goto L17
                L35:
                    X.0EV3 r0 = r2
                    com.bytedance.tux.input.TuxTextView r4 = r0.LLLFFI
                    if (r4 == 0) goto L57
                    java.util.Locale r3 = java.util.Locale.ENGLISH
                    r0 = 2131826902(0x7f1118d6, float:1.9286701E38)
                    java.lang.String r2 = r1.getString(r0)
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
                    r1[r7] = r0
                    java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r5)
                    java.lang.String r0 = X.C786410Ut5.k4(r3, r2, r0)
                    r4.setText(r0)
                L57:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0EV6.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        });
        this.LLLII = valueAnimatorOfFloat;
    }

    public final void LLLLLLIL() {
        Resources resources;
        int size = LLLLILI().LIZ.LJ.size();
        C197039127h c197039127h = this.LLJJL;
        if (c197039127h != null) {
            Context sceneContext = getSceneContext();
            c197039127h.setText((sceneContext == null || (resources = sceneContext.getResources()) == null) ? null : resources.getQuantityString(2131755299, size, Integer.valueOf(size)));
        }
    }

    public final void LLLLLLJ() {
        Pair pair;
        ArrayList<CaptionUtterance> arrayList;
        LLLLILI().LIZ.LJ.clear();
        C384570F5z c384570F5z = this.LLJJJJLIIL;
        if (c384570F5z != null && (arrayList = c384570F5z.LL) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<CaptionUtterance> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TextStickerData textStickerData = it2.next().inlineUtterance;
                if (textStickerData != null) {
                    arrayList2.add(textStickerData);
                }
            }
            int i = 0;
            for (Object obj : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                TextStickerData textStickerData2 = (TextStickerData) obj;
                if (textStickerData2.getFilterSelected()) {
                    LLLLILI().LIZ.LJ.add(new Pair<>(Integer.valueOf(i), textStickerData2));
                }
                i = i2;
            }
        }
        List<Pair<Integer, TextStickerData>> list = LLLLILI().LIZ.LJ;
        ArrayList arrayList3 = new ArrayList();
        for (Pair<Integer, TextStickerData> pair2 : list) {
            int iIntValue = pair2.getFirst().intValue();
            TextStickerData second = pair2.getSecond();
            if (C363740ENw.LIZLLL(second.getFilterTag(), C13LQ.LJIIJ(C0EVA.values()))) {
                pair = new Pair(Integer.valueOf(second.getStartTime()), Integer.valueOf(second.getEndTime()));
            } else {
                List<Word> words = second.getWords();
                List<C0EVA> list2 = LLLLILI().LIZ.LIZJ;
                Word word = (Word) C13LP.LJJJLL(words);
                if (word != null && C363740ENw.LIZLLL(word.getTag(), list2)) {
                    pair = new Pair(Integer.valueOf((int) word.getStartTime()), Integer.valueOf((int) word.getEndTime()));
                }
            }
            arrayList3.add(new Pair(Integer.valueOf(iIntValue), pair));
        }
        this.LLJLILLLLZIIL = arrayList3;
    }

    public final void LLLLLL(String str) {
        String str2;
        VideoPublishEditModel videoPublishEditModelLJIIIIZZ = LLLLLJIL().LJIIIIZZ();
        if (videoPublishEditModelLJIIIIZZ != null) {
            int i = 0;
            int i2 = 0;
            for (Pair<Integer, TextStickerData> pair : LLLLILI().LIZ.LJ) {
                pair.getFirst().intValue();
                TextStickerData second = pair.getSecond();
                if (Intrinsics.LJFF(second.getFilterTag(), C0EVA.SILENT.getValue())) {
                    i2++;
                }
                Iterator<Word> it2 = second.getWords().iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getTag(), C0EVA.FILLER.getValue())) {
                        i++;
                    }
                }
            }
            Pair pair2 = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            int iIntValue = ((Number) pair2.getFirst()).intValue();
            int iIntValue2 = ((Number) pair2.getSecond()).intValue();
            boolean zContains = LLLLILI().LIZ.LIZJ.contains(C0EVA.FILLER);
            boolean zContains2 = LLLLILI().LIZ.LIZJ.contains(C0EVA.SILENT);
            C0LAB c0labLJJ = u4.LJJ(1, videoPublishEditModelLJIIIIZZ, "");
            c0labLJJ.LJ("action", str);
            c0labLJJ.LIZ(iIntValue, "filler_words_cnt");
            c0labLJJ.LIZ(iIntValue2, "pause_cnt");
            String str3 = "on";
            if (zContains) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            c0labLJJ.LJ("detect_filler_words_status", str2);
            if (!zContains2) {
                str3 = "off";
            }
            c0labLJJ.LJ("detect_pauses_status", str3);
            C20684815ws.LJIILLIIL("delete_filler_words_confirm_popup", c0labLJJ.LIZ);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        MutableLiveData mutableLiveDataLIZ;
        AbstractC21674919sB abstractC21674919sB;
        super.onActivityCreated(bundle);
        C0EJ3 c0ej3LJIIL = LLLLLJIL().LJIIL();
        if (c0ej3LJIIL != null) {
            C364490EQt c364490EQtLLLLLJIL = LLLLLJIL();
            InterfaceC361710EGb interfaceC361710EGb = (InterfaceC361710EGb) c364490EQtLLLLLJIL.LLJJIJIL.getValue(c364490EQtLLLLLJIL, C364490EQt.LLJJL[5]);
            if (interfaceC361710EGb != null) {
                interfaceC361710EGb.LLJJIJIIJIL(false);
            }
            boolean z = true;
            this.LLJJJIL = new EditCaptionScene.HighLightLayoutManager(C545820Lau.LIZIZ(this), true);
            C384570F5z c384570F5z = new C384570F5z(new ArrayList(), z, z, c0ej3LJIIL, Boolean.TRUE, 16);
            this.LLJJJJLIIL = c384570F5z;
            c384570F5z.LLJJI = true;
            c384570F5z.LLJJIJI = new C0EVC() { // from class: X.0EV5
                @Override // X.C0EVC
                public final void LIZ(List<Integer> list, List<? extends C0EVA> list2, boolean z2, boolean z3) {
                    String str;
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CaptionFillerWordContentScene -> onFilterWordClick, position: ");
                    sbLIZ.append(list);
                    sbLIZ.append(", selected: ");
                    sbLIZ.append(z2);
                    sbLIZ.append(", tag: ");
                    sbLIZ.append(list2);
                    C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LLLLIL().LIZIZ.invoke(list, list2, Boolean.valueOf(z2), Boolean.valueOf(z3));
                    this.LIZ.LLLLLLJ();
                    this.LIZ.LLLLLLIL();
                    if (z3) {
                        if (z2) {
                            str = "select";
                        } else {
                            str = "deselect";
                        }
                        this.LIZ.LLLLIL().LJFF.invoke(str);
                    }
                }
            };
            c384570F5z.LLIZLLLIL = new C0F63() { // from class: X.0EV4
                @Override // X.C0F63
                public final void LIZIZ(int i, int i2, boolean z2) {
                    ArrayList<CaptionUtterance> arrayList;
                    CaptionUtterance captionUtterance;
                    TextStickerData textStickerData;
                    C0E55 c0e55LJIIJJI;
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("adapterPos = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", selectionIndex = ");
                    sbLIZ.append(i2);
                    C201955140j.LIZLLL(c563650M8t, "CaptionFillerWordContentScene", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.getClass();
                    EditCaptionScene.HighLightLayoutManager highLightLayoutManager = this.LIZ.LLJJJIL;
                    if (highLightLayoutManager != null) {
                        highLightLayoutManager.scrollToPositionWithOffset(i, 0);
                    }
                    C384570F5z c384570F5z2 = this.LIZ.LLJJJJLIIL;
                    if (c384570F5z2 != null && (arrayList = c384570F5z2.LL) != null && (captionUtterance = (CaptionUtterance) C13LP.LJJJLZIJ(i, arrayList)) != null && (textStickerData = captionUtterance.inlineUtterance) != null && (c0e55LJIIJJI = this.LIZ.LLLLLJIL().LJIIJJI()) != null) {
                        c0e55LJIIJJI.LJIJI(((long) 30000) + (((long) textStickerData.getStartTime()) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), C351110Dpd.LIZ);
                    }
                }
            };
            C425240Glu c425240Glu = this.LLJJJJ;
            if (c425240Glu != null) {
                c425240Glu.setLayoutManager(this.LLJJJIL);
                c425240Glu.setAdapter(this.LLJJJJLIIL);
                c425240Glu.addItemDecoration(new C0DKJ());
                AbstractC21673719rz itemAnimator = c425240Glu.getItemAnimator();
                if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                    abstractC21674919sB.LLIZ = false;
                }
            }
            C425240Glu c425240Glu2 = this.LLJJJJ;
            if (c425240Glu2 != null) {
                c425240Glu2.addOnItemTouchListener(this.LLLF);
            }
            C425240Glu c425240Glu3 = this.LLJJJJ;
            if (c425240Glu3 != null) {
                c425240Glu3.addOnScrollListener(this.LLL);
            }
        }
        C0E55 c0e55LJIIJJI = LLLLLJIL().LJIIJJI();
        if (c0e55LJIIJJI != null) {
            C0E48 c0e48 = LLLLLJIL().LLILLJJLI;
            if (c0e48 != null && (mutableLiveDataLIZ = c0e48.S7().LIZ("video_position_event")) != null) {
                mutableLiveDataLIZ.observe(this, new AObserverS170S0200000_5(c0e55LJIIJJI, this, 7));
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ER9
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C364500EQu) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 541));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EVD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C364500EQu) obj).LIZJ;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 544));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ETJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C364500EQu) obj).LIZLLL;
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 545));
            LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.0EV2
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C364500EQu) obj).LJFF);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C364500EQu) obj).LJFF = ((Boolean) obj2).booleanValue();
                }
            }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 546));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0ER0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C364500EQu) obj).LJII;
                }
            }, new AwS584S0100000_5(this, 540));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        View decorView;
        int iLIZIZ;
        int iIntValue;
        setTheme(R.style.y0);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0_, viewGroup, false);
        this.LLJJJJ = (C425240Glu) viewGroup2.findViewById(R.id.t0q);
        View viewFindViewById = viewGroup2.findViewById(R.id.hx6);
        C197039127h c197039127h = null;
        if (viewFindViewById != null) {
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.cuf);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setBackgroundResource(R.drawable.alj);
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 65), viewFindViewById2);
            }
        } else {
            viewFindViewById = null;
        }
        this.LLJJJJJIL = viewFindViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2.findViewById(R.id.eop);
        if (constraintLayout != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, requireSceneContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            constraintLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{C2441009hQ.LJIIL(iIntValue, 0), iIntValue}));
        } else {
            constraintLayout = null;
        }
        this.LLJJLIIIJLLLLLLLZ = constraintLayout;
        C197039127h c197039127h2 = (C197039127h) viewGroup2.findViewById(R.id.eoo);
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS140S0100000_5(this, 66));
            Activity activity = this.mActivity;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                int iLIZ = C1257310ip7.LIZ(decorView);
                ViewGroup.LayoutParams layoutParams = c197039127h2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (iLIZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)) - iLIZ;
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    marginLayoutParams.bottomMargin = iLIZIZ;
                    C786410Ut5.W5(c197039127h2, marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            c197039127h = c197039127h2;
        }
        this.LLJJL = c197039127h;
        this.LLLFF = (LinearLayout) viewGroup2.findViewById(R.id.f762nla);
        this.LLLFFI = (TuxTextView) viewGroup2.findViewById(R.id.nn7);
        this.LLLFZ = (TuxTextView) viewGroup2.findViewById(R.id.nmi);
        this.LLLI = (C1390410mHn) viewGroup2.findViewById(R.id.nne);
        return viewGroup2;
    }
}
