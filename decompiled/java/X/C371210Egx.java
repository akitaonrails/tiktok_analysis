package X;

import Y.ALAdapterS0S0210000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Egx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371210Egx extends HorizontalScrollView implements InterfaceC360810ECp {
    public final int LL;
    public NLETrackSlot LLILLJJLI;
    public final float LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public Pair<BeatInfo, Integer> LLJILJILJ;
    public InterfaceC371250Eh1 LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final LinearLayout LLJJIJIL;
    public final C367610Eb9 LLJJJ;
    public final C371220Egy LLJJJIL;
    public final C21573919bt LLJJJJ;

    @Override // X.InterfaceC360810ECp
    public HorizontalScrollView getHorizontalScrollView() {
        return this;
    }

    @Override // X.InterfaceC360810ECp
    public final boolean LIZLLL() {
        C371220Egy c371220Egy = this.LLJJJIL;
        int i = this.LLJIJIL;
        if (c371220Egy.LLILLJJLI.isEmpty()) {
            return false;
        }
        return !Intrinsics.LJFF(c371220Egy.LLJILLL, ListProtector.get(c371220Egy.LLILLJJLI, 0)) && ((float) i) > ((float) ((BeatInfo) ((Pair) ListProtector.get(c371220Egy.LLILLJJLI, 0)).getFirst()).timestampInMS) - (C371220Egy.LLJJIJIIJIL / c371220Egy.LLILLL);
    }

    @Override // X.InterfaceC360810ECp
    public final boolean LJI() {
        C371220Egy c371220Egy = this.LLJJJIL;
        int i = this.LLJIJIL;
        if (c371220Egy.LLILLJJLI.isEmpty()) {
            return false;
        }
        return !Intrinsics.LJFF(c371220Egy.LLJILLL, C13LP.LJJLIIIJJI(c371220Egy.LLILLJJLI)) && ((float) i) < ((float) ((BeatInfo) ((Pair) C13LP.LJJLIIIJJI(c371220Egy.LLILLJJLI)).getFirst()).timestampInMS) + (C371220Egy.LLJJIJIIJIL / c371220Egy.LLILLL);
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue();
    }

    @Override // X.InterfaceC360810ECp
    public int getCurTimeInMainTrack() {
        return (this.LLJIJIL - this.LLJ) + this.LLIZLLLIL;
    }

    @Override // X.InterfaceC360810ECp
    public int getNextBeatIndex() {
        Pair<BeatInfo, Integer> pair = this.LLJILJILJ;
        if (pair != null) {
            return pair.getSecond().intValue() + 1;
        }
        C371220Egy c371220Egy = this.LLJJJIL;
        int i = this.LLJIJIL;
        int size = c371220Egy.LLILLJJLI.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair2 = (Pair) ListProtector.get(c371220Egy.LLILLJJLI, i2);
            if (((BeatInfo) pair2.getFirst()).timestampInMS > i) {
                return ((Number) pair2.getSecond()).intValue();
            }
        }
        return -1;
    }

    @Override // X.InterfaceC360810ECp
    public int getPreviousBeatIndex() {
        if (this.LLJILJILJ != null) {
            return r0.getSecond().intValue() - 1;
        }
        C371220Egy c371220Egy = this.LLJJJIL;
        int i = this.LLJIJIL;
        int size = c371220Egy.LLILLJJLI.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) ListProtector.get(c371220Egy.LLILLJJLI, i2);
            if (((BeatInfo) pair.getFirst()).timestampInMS >= i && ((Number) pair.getSecond()).intValue() > 0) {
                return ((Number) pair.getSecond()).intValue() - 1;
            }
        }
        if (i > ((BeatInfo) ((Pair) C13LP.LJJLIIIJJI(c371220Egy.LLILLJJLI)).getFirst()).timestampInMS) {
            return ((Number) ((Pair) C13LP.LJJLIIIJJI(c371220Egy.LLILLJJLI)).getSecond()).intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC360810ECp
    public int getCurTrackTime() {
        return this.LLJIJIL;
    }

    public final boolean getHigherTrack() {
        return this.LLJJIII;
    }

    public final float getMaxTimeScale() {
        return this.LLJJI;
    }

    public final float getMinTimeScale() {
        return this.LLJJ;
    }

    public float getPxPerMS() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC360810ECp
    public Pair<BeatInfo, Integer> getSelectedBeat() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC360810ECp
    public final void LIZ(int i) {
        float f = i * this.LLILZ;
        if (LJIIIIZZ()) {
            f = this.LLIZ - f;
        }
        scrollTo((int) f, 0);
    }

    public final void LJII(NLETrackSlot nLETrackSlot) {
        int iLIZ;
        float f;
        C371220Egy c371220Egy = this.LLJJJIL;
        float f2 = this.LLILZ;
        c371220Egy.getClass();
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        int iLIZ2 = 0;
        if (nLESegmentAudioDynamicCast != null) {
            iLIZ = C352310DrZ.LIZ(nLESegmentAudioDynamicCast.getTimeClipStart());
        } else {
            iLIZ = 0;
        }
        c371220Egy.LLILZIL = iLIZ;
        NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast2 != null) {
            iLIZ2 = C352310DrZ.LIZ(nLESegmentAudioDynamicCast2.getTimeClipEnd());
        }
        c371220Egy.LLILZLL = iLIZ2;
        c371220Egy.LLILLL = f2;
        this.LLJJJ.setTimelineScale(this.LLILZ);
        this.LLIZ = (int) Math.rint(this.LLILZLL * this.LLILZ);
        if (this.LLJJIII) {
            f = 60.0f;
        } else {
            f = 48.0f;
        }
        int iLIZ3 = C0FU0.LIZ(f);
        if (this.LLJJJ.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = this.LLJJJ.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.LLIZ;
                layoutParams.height = iLIZ3;
            }
        } else {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.LLIZ, iLIZ3);
            layoutParams2.width = this.LLIZ;
            layoutParams2.height = iLIZ3;
            layoutParams2.setMarginStart(this.LL);
            layoutParams2.setMarginEnd(this.LL);
            C367610Eb9 c367610Eb9 = this.LLJJJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c367610Eb9);
            c367610Eb9.setLayoutParams(layoutParams2);
        }
        int i = this.LLIZ;
        float f3 = C371220Egy.LLJJIJIIJIL;
        int i2 = i + ((int) (2 * f3));
        if (this.LLJJJIL.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams3 = this.LLJJJIL.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = i2;
                layoutParams3.height = C0FU0.LIZ(12.0f);
            }
        } else {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i2, C0FU0.LIZ(12.0f));
            layoutParams4.topMargin = C0FU0.LIZ(8.0f);
            int i3 = (int) f3;
            layoutParams4.setMarginStart(this.LL - i3);
            layoutParams4.setMarginEnd(this.LL - i3);
            C371220Egy c371220Egy2 = this.LLJJJIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c371220Egy2);
            c371220Egy2.setLayoutParams(layoutParams4);
        }
        this.LLJJJ.requestLayout();
        this.LLJJJIL.requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 5) {
            this.LLJJJJ.LIZJ(motionEvent, this);
            this.LLILZIL = true;
            return true;
        }
        this.LLILZIL = false;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (zOnInterceptTouchEvent) {
            InterfaceC371250Eh1 interfaceC371250Eh1 = this.LLJILLL;
            if (interfaceC371250Eh1 != null) {
                interfaceC371250Eh1.LIZ();
            }
            this.LLJJIJI = true;
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLILZIL && motionEvent.getPointerCount() < 2) {
            if (this.LLJJIJI && motionEvent.getAction() == 1) {
                this.LLJJIJI = false;
            }
            return super.onTouchEvent(motionEvent);
        }
        return this.LLJJJJ.LIZJ(motionEvent, this);
    }

    @Override // X.InterfaceC360810ECp
    public void setAudioTrackPaint(InterfaceC367710EbJ interfaceC367710EbJ) {
        this.LLJJJ.setPainter(interfaceC367710EbJ);
    }

    @Override // X.InterfaceC360810ECp
    public void setBeats(List<BeatInfo> list) {
        this.LLJJJIL.setBeats(C13LP.LLIIII(list));
        Pair<BeatInfo, Integer> pairLIZJ = this.LLJJJIL.LIZJ(this.LLJIJIL);
        this.LLJILJILJ = pairLIZJ;
        InterfaceC371250Eh1 interfaceC371250Eh1 = this.LLJILLL;
        if (interfaceC371250Eh1 != null) {
            interfaceC371250Eh1.LIZJ(pairLIZJ);
        }
    }

    public final void setDragging(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setHigherTrack(boolean z) {
        this.LLJJIII = z;
    }

    @Override // X.InterfaceC360810ECp
    public void setListener(InterfaceC371250Eh1 interfaceC371250Eh1) {
        this.LLJILLL = interfaceC371250Eh1;
    }

    public C371210Egx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C0FU0.LIZJ(C0EHL.LIZ()) / 2;
        this.LLILLL = C360610EBv.LIZJ / 1000.0f;
        this.LLILZ = C360610EBv.LIZJ();
        this.LLJILJIL = LSPassThroughRecordSizeConfig.DEFAULT / C360610EBv.LIZ;
        this.LLJJ = C368130Ebz.LIZJ;
        this.LLJJI = C368130Ebz.LIZLLL;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1658));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        this.LLJJIJIL = linearLayout;
        C367610Eb9 c367610Eb9 = new C367610Eb9(getContext());
        c367610Eb9.setId(R.id.bgn);
        c367610Eb9.setDrawDivider(false);
        c367610Eb9.setDrawLabel(false);
        c367610Eb9.setItemSelected(false);
        c367610Eb9.setTimelineScale(this.LLILZ);
        c367610Eb9.setNeedDrawStickPoint(false);
        c367610Eb9.setAudioBeatsUse(true);
        this.LLJJJ = c367610Eb9;
        this.LLJJJIL = new C371220Egy(getContext());
        this.LLJJJJ = new C21573919bt(new InterfaceC21574019bu() { // from class: X.0Egz
            @Override // X.InterfaceC21574019bu
            public final void onScaleEnd() {
            }

            @Override // X.InterfaceC21574019bu
            public final void onScaleBegin() {
                InterfaceC371250Eh1 interfaceC371250Eh1 = this.LIZ.LLJILLL;
                if (interfaceC371250Eh1 != null) {
                    interfaceC371250Eh1.LIZIZ();
                }
            }

            @Override // X.InterfaceC21574019bu
            public final boolean LIZ(C21573919bt c21573919bt) {
                float f;
                float fLIZIZ = this.LIZ.LLJILJIL * c21573919bt.LIZIZ();
                if (fLIZIZ > this.LIZ.getMaxTimeScale()) {
                    fLIZIZ = this.LIZ.getMaxTimeScale();
                }
                if (fLIZIZ < this.LIZ.getMinTimeScale()) {
                    fLIZIZ = this.LIZ.getMinTimeScale();
                }
                C371210Egx c371210Egx = this.LIZ;
                if (fLIZIZ == c371210Egx.LLJILJIL) {
                    return false;
                }
                c371210Egx.LLJILJIL = fLIZIZ;
                c371210Egx.LLILZ = c371210Egx.LLILLL * fLIZIZ;
                NLETrackSlot nLETrackSlot = c371210Egx.LLILLJJLI;
                if (nLETrackSlot != null) {
                    this.LIZ.LJII(nLETrackSlot);
                }
                if (this.LIZ.LJIIIIZZ()) {
                    f = r3.LLIZ - (r3.LLJIJIL * this.LIZ.LLILZ);
                } else {
                    f = r1.LLJIJIL * this.LIZ.LLILZ;
                }
                int i = (int) f;
                if (this.LIZ.getScrollX() != i) {
                    this.LIZ.scrollTo(i, 0);
                }
                return true;
            }
        });
        setHorizontalScrollBarEnabled(false);
        addView(linearLayout, 0, new FrameLayout.LayoutParams(-2, -1));
        C786410Ut5.R7(linearLayout, new View.OnClickListener() { // from class: X.0Eh3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    @Override // X.InterfaceC360810ECp
    public final void LIZIZ(Function1 function1, boolean z) {
        C371220Egy c371220Egy = this.LLJJJIL;
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, (C371210Egx) function1, (Function1<? super List<BeatInfo>, Unit>) 67);
        if (!c371220Egy.LLJJIII) {
            float f = C371220Egy.LLJJIJIL;
            c371220Egy.LLJ = f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(c371220Egy, 41));
            valueAnimatorOfFloat.addListener(new ALAdapterS0S0210000_5(c371220Egy, z, awS371S0200000_5, 1));
            valueAnimatorOfFloat.start();
        }
    }

    @Override // X.InterfaceC360810ECp
    public final void LIZJ(int i, Boolean bool) {
        float f = (i - this.LLJ) * this.LLILZ;
        if (LJIIIIZZ()) {
            f = this.LLIZ - f;
        }
        int i2 = (int) f;
        if (getScrollX() == i2 && bool != null) {
            i2 = bool.booleanValue() ? i2 + 1 : i2 - 1;
        }
        smoothScrollTo(i2, 0);
    }

    @Override // X.InterfaceC360810ECp
    public final void LJ(NLETrackSlot nLETrackSlot, boolean z) {
        int iLIZ;
        this.LLIZLLLIL = C352310DrZ.LIZ(nLETrackSlot.getStartTime());
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        int iLIZ2 = 0;
        if (nLESegmentAudioDynamicCast != null) {
            iLIZ = C352310DrZ.LIZ(nLESegmentAudioDynamicCast.getTimeClipStart());
        } else {
            iLIZ = 0;
        }
        this.LLJ = iLIZ;
        NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast2 != null) {
            iLIZ2 = C352310DrZ.LIZ(nLESegmentAudioDynamicCast2.getTimeClipEnd());
        }
        this.LLJI = iLIZ2;
        int i = this.LLJ;
        this.LLILZLL = iLIZ2 - i;
        this.LLJIJIL = i;
        this.LLILLJJLI = nLETrackSlot;
        this.LLJJIII = z;
        C786410Ut5.LJJJJJL(this.LLJJIJIL);
        this.LLJJJ.setSegment(nLETrackSlot);
        LJII(nLETrackSlot);
        this.LLJJIJIL.addView(this.LLJJJ);
        this.LLJJIJIL.addView(this.LLJJJIL);
        this.LLJJJIL.invalidate();
        this.LLJJJIL.setOnBeatClickListener(new AwS584S0100000_5(this, 342));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
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
    @Override // X.InterfaceC360810ECp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.util.List r11, kotlin.jvm.internal.AwS584S0100000_5 r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C371210Egx.LJFF(java.util.List, kotlin.jvm.internal.AwS584S0100000_5):void");
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.LLJJJ.setOutScrollX(Integer.valueOf(i));
        this.LLJJJ.invalidate();
        this.LLJJJIL.invalidate();
        if (LJIIIIZZ()) {
            i = this.LLIZ - i;
        }
        int iFloor = this.LLJ + ((int) Math.floor(i / this.LLILZ));
        this.LLJIJIL = iFloor;
        int i5 = this.LLJ;
        if (iFloor < i5) {
            this.LLJIJIL = i5;
        } else {
            int i6 = this.LLJI;
            if (iFloor > i6) {
                this.LLJIJIL = i6;
            }
        }
        Pair<BeatInfo, Integer> pairLIZJ = this.LLJJJIL.LIZJ(this.LLJIJIL);
        if (!Intrinsics.LJFF(this.LLJILJILJ, pairLIZJ)) {
            InterfaceC371250Eh1 interfaceC371250Eh1 = this.LLJILLL;
            if (interfaceC371250Eh1 != null) {
                interfaceC371250Eh1.LIZJ(pairLIZJ);
            }
            this.LLJILJILJ = pairLIZJ;
        }
        InterfaceC371250Eh1 interfaceC371250Eh12 = this.LLJILLL;
        if (interfaceC371250Eh12 != null) {
            interfaceC371250Eh12.LIZLLL(this.LLJJIJI);
        }
    }
}
