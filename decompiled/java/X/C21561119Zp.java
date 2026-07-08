package X;

import Y.ALAdapterS6S0101000_33;
import Y.AUListenerS160S0300000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19Zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21561119Zp extends C21561019Zo {
    public int LLJJJJLIIL;
    public final int LLJJL;
    public final RectF LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final List<InterfaceC766140U3o> LLJLILLLLZIIL;
    public final Rect LLJLL;
    public final RectF LLJLLIL;
    public final C01GW LLJLLL;
    public final Paint LLJZ;
    public boolean LLJZIJLIL;

    public final Paint getGradientPaint() {
        return (Paint) this.LLJLLL.getValue();
    }

    public final Paint getDrawBackPaint() {
        return this.LLJZ;
    }

    public final boolean getForbidPendingLine() {
        return this.LLJZIJLIL;
    }

    public final Rect getFullRect() {
        return this.LLJLL;
    }

    public final RectF getFullRectF() {
        return this.LLJLLIL;
    }

    public final RectF getLastDynamicRectF() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int getPendingLine() {
        return this.LLJJJJLIIL;
    }

    public final void LJIIIIZZ(int i) {
        String str;
        Integer numValueOf;
        C807880Vmc c807880Vmc = (C807880Vmc) C13LP.LJJJLZIJ(i, getLyricsLineInfos());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startTransitionAnim curIndex=");
        sbLIZ.append(getCurShowIndex());
        sbLIZ.append("->");
        sbLIZ.append(i);
        sbLIZ.append(" progress=");
        sbLIZ.append(getCurrMusicProcess());
        sbLIZ.append(" lyric=\"");
        Integer numValueOf2 = null;
        if (c807880Vmc != null) {
            str = c807880Vmc.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("\" start=");
        if (c807880Vmc != null) {
            numValueOf = Integer.valueOf(c807880Vmc.LIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" end=");
        if (c807880Vmc != null) {
            numValueOf2 = Integer.valueOf(c807880Vmc.LIZIZ);
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ));
        ValueAnimator scrollAnimator = getScrollAnimator();
        if (scrollAnimator != null && scrollAnimator.isRunning()) {
            ValueAnimator scrollAnimator2 = getScrollAnimator();
            if (scrollAnimator2 != null) {
                scrollAnimator2.cancel();
            }
            ValueAnimator scrollAnimator3 = getScrollAnimator();
            if (scrollAnimator3 != null) {
                scrollAnimator3.removeAllUpdateListeners();
            }
            ValueAnimator scrollAnimator4 = getScrollAnimator();
            if (scrollAnimator4 != null) {
                scrollAnimator4.removeAllListeners();
            }
            setAnimationY(0);
        }
        setAnimating(true);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        C118300cf c118300cf2 = new C118300cf();
        int iHeight = getLyricsRect().height();
        getConfig().LIZLLL.LIZ(getDynamicRectF(), getMeasuredHeight(), getMeasuredWidth(), getMeasuredWidth(), 0.0f);
        setScrollAnimator(ValueAnimator.ofInt(0, iHeight));
        ValueAnimator scrollAnimator5 = getScrollAnimator();
        if (scrollAnimator5 != null) {
            scrollAnimator5.setDuration(230L);
        }
        ValueAnimator scrollAnimator6 = getScrollAnimator();
        if (scrollAnimator6 != null) {
            scrollAnimator6.addUpdateListener(new AUListenerS160S0300000_33(this, c118300cf, c118300cf2, 0));
        }
        ValueAnimator scrollAnimator7 = getScrollAnimator();
        if (scrollAnimator7 != null) {
            scrollAnimator7.addListener(new ALAdapterS6S0101000_33(this, i, 0));
        }
        ValueAnimator scrollAnimator8 = getScrollAnimator();
        if (scrollAnimator8 != null) {
            scrollAnimator8.start();
        }
    }

    @Override // X.C21561019Zo, android.view.View
    public final void onDraw(Canvas canvas) {
        C807880Vmc c807880Vmc;
        float measuredWidth;
        RectF rectF;
        if (getCurrMusicProcess() >= 0 && getCurShowIndex() < getLyricsLineInfos().size() && (c807880Vmc = (C807880Vmc) ListProtector.get(getLyricsLineInfos(), getCurShowIndex())) != null) {
            canvas.getClipBounds(this.LLJLL);
            this.LLJLLIL.set(this.LLJLL);
            String str = c807880Vmc.LIZJ;
            if (str == null) {
                str = "";
            }
            getLyricsRect().set(LJ(str));
            C19QP c19qp = getConfig().LIZLLL;
            int measuredWidth2 = getMeasuredWidth();
            getMeasuredHeight();
            float fLIZIZ = c19qp.LIZIZ(measuredWidth2);
            C19QP c19qp2 = getConfig().LIZLLL;
            getMeasuredWidth();
            getMeasuredHeight();
            float fLIZJ = c19qp2.LIZJ(getAnimationY(), getLyricsRect());
            if (getInScroll()) {
                this.LLJJJJLIIL = getConfig().LIZJ + 1;
            } else {
                this.LLJJJJLIIL = getConfig().LIZJ;
            }
            if (this.LLJZIJLIL) {
                this.LLJJJJLIIL = 0;
            }
            int iSaveLayer = canvas.saveLayer(this.LLJLLIL, this.LLJZ);
            int i = this.LLJJJJLIIL;
            for (int i2 = 1; i2 < i; i2++) {
                LIZJ(fLIZIZ, fLIZJ, i2, canvas);
            }
            canvas.drawRect(this.LLJLL, getGradientPaint());
            canvas.restoreToCount(iSaveLayer);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDraw line[");
            sbLIZ.append(getCurShowIndex());
            sbLIZ.append("] y=");
            sbLIZ.append(fLIZJ);
            sbLIZ.append(" lyric=\"");
            sbLIZ.append(str);
            sbLIZ.append('\"');
            C20441214yg.LIZIZ("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ));
            int iSaveLayer2 = canvas.saveLayer(this.LLJLLIL, this.LLJZ);
            getConfig().getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onDraw dynamicRect=");
            sbLIZ2.append(getDynamicRectF());
            sbLIZ2.append(" lyricsType=");
            sbLIZ2.append(getConfig().LJIIIIZZ);
            sbLIZ2.append(" progress=");
            sbLIZ2.append(getCurrMusicProcess());
            C20441214yg.LIZIZ("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ2));
            canvas.clipRect(getDynamicRectF());
            canvas.drawText(str, fLIZIZ, fLIZJ, getConfig().LJI);
            canvas.restoreToCount(iSaveLayer2);
            int iSaveLayer3 = canvas.saveLayer(this.LLJLLIL, this.LLJZ);
            C19QP c19qp3 = getConfig().LIZLLL;
            RectF dynamicRectF = getDynamicRectF();
            if (C497740JfY.LJJ()) {
                measuredWidth = LJFF(str);
            } else {
                measuredWidth = getMeasuredWidth();
            }
            int measuredHeight = getMeasuredHeight();
            if (c19qp3.LIZ) {
                rectF = new RectF(dynamicRectF.right, dynamicRectF.top, measuredWidth, measuredHeight);
            } else {
                rectF = new RectF(0.0f, dynamicRectF.top, dynamicRectF.left, measuredHeight);
            }
            canvas.clipRect(rectF);
            canvas.drawText(str, fLIZIZ, fLIZJ, getConfig().LJFF);
            canvas.restoreToCount(iSaveLayer3);
            for (InterfaceC766140U3o interfaceC766140U3o : (ArrayList) this.LLJLILLLLZIIL) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Start: ");
                sbLIZ3.append(c807880Vmc.LIZ);
                sbLIZ3.append("\nEnd: ");
                sbLIZ3.append(c807880Vmc.LIZIZ);
                sbLIZ3.append("\nprogres: ");
                sbLIZ3.append(getCurrMusicProcess());
                interfaceC766140U3o.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public final void setForbidPendingLine(boolean z) {
        invalidate();
        this.LLJZIJLIL = z;
    }

    public final void setPendingLine(int i) {
        this.LLJJJJLIIL = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && !this.LLJL && (!getLyricsLineInfos().isEmpty())) {
            this.LLJL = true;
        }
    }

    public C21561119Zp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJLIIL = 3;
        this.LLJJL = 4;
        this.LLJJLIIIJLLLLLLLZ = new RectF();
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLL = new Rect();
        this.LLJLLIL = new RectF();
        this.LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 13));
        this.LLJZ = new Paint();
    }

    @Override // X.C21561019Zo
    public final void LIZ(long j, List list) {
        Integer numValueOf;
        String str;
        C807880Vmc c807880Vmc;
        C807880Vmc c807880Vmc2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addLyrics count=");
        Integer numValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" offset=");
        sbLIZ.append(j);
        sbLIZ.append(" firstLine=\"");
        if (list != null && (c807880Vmc2 = (C807880Vmc) C13LP.LJJJLL(list)) != null) {
            str = c807880Vmc2.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("\" firstStart=");
        if (list != null && (c807880Vmc = (C807880Vmc) C13LP.LJJJLL(list)) != null) {
            numValueOf2 = Integer.valueOf(c807880Vmc.LIZ);
        }
        sbLIZ.append(numValueOf2);
        C20441214yg.LIZIZ("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ));
        super.LIZ(j, list);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addLyrics done adjustedCount=");
        sbLIZ2.append(getLyricsLineInfos().size());
        sbLIZ2.append(" curShowIndex=");
        sbLIZ2.append(getCurShowIndex());
        C20441214yg.LIZIZ("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ2));
        if (getLyricsLineInfos().size() > 0) {
            String str2 = ((C807880Vmc) ListProtector.get(getLyricsLineInfos(), 0)).LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            LJI(str2);
        }
        if (C497740JfY.LJJ()) {
            getConfig().LIZ(Paint.Align.LEFT, this.LLJJJJLIIL);
        } else {
            getConfig().LIZ(Paint.Align.RIGHT, this.LLJJJJLIIL);
        }
        getConfig().LIZLLL.LIZ(getDynamicRectF(), getMeasuredHeight(), getMeasuredWidth(), getMeasuredWidth(), 0.0f);
        this.LLJLIL = true;
    }

    public final void LJII(long j, Function1<? super String, Unit> function1) {
        String str;
        Integer numValueOf;
        String str2;
        setCurrMusicProcess(j);
        int iLIZLLL = LIZLLL(j, function1);
        setLastMusicProcess(j);
        if (getCurShowIndex() != iLIZLLL && !this.LLJILJILJ) {
            if (iLIZLLL > 0 && iLIZLLL < getCurShowIndex()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("findCurrentIndex backward: nextIndex=");
                sbLIZ.append(iLIZLLL);
                sbLIZ.append(" current=");
                sbLIZ.append(getCurShowIndex());
                sbLIZ.append(" progress=");
                sbLIZ.append(j);
                C20441214yg.LJIIL("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C807880Vmc c807880Vmc = (C807880Vmc) C13LP.LJJJLZIJ(iLIZLLL, getLyricsLineInfos());
                if (c807880Vmc == null || (str2 = c807880Vmc.LIZJ) == null) {
                    str2 = "";
                }
                LJI(str2);
                LJIIIIZZ(iLIZLLL);
            }
        } else if (this.LLJLIL) {
            invalidate();
            this.LLJLIL = false;
        }
        if (!Intrinsics.LJFF(getDynamicRectF(), this.LLJJLIIIJLLLLLLLZ) && !getInScroll()) {
            C807880Vmc c807880Vmc2 = (C807880Vmc) C13LP.LJJJLZIJ(getCurShowIndex(), getLyricsLineInfos());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("renderLyrics progress=");
            sbLIZ2.append(j);
            sbLIZ2.append(" lineIndex=");
            sbLIZ2.append(getCurShowIndex());
            sbLIZ2.append(" lyric=\"");
            Integer numValueOf2 = null;
            if (c807880Vmc2 != null) {
                str = c807880Vmc2.LIZJ;
            } else {
                str = null;
            }
            sbLIZ2.append(str);
            sbLIZ2.append("\" lineStart=");
            if (c807880Vmc2 != null) {
                numValueOf = Integer.valueOf(c807880Vmc2.LIZ);
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(" lineEnd=");
            if (c807880Vmc2 != null) {
                numValueOf2 = Integer.valueOf(c807880Vmc2.LIZIZ);
            }
            sbLIZ2.append(numValueOf2);
            sbLIZ2.append(" dynamicRect=");
            sbLIZ2.append(getDynamicRectF());
            C20441214yg.LIZIZ("KtvLyricRender", C2188811AlT.LIZIZ(sbLIZ2));
            invalidate();
            this.LLJJLIIIJLLLLLLLZ.set(getDynamicRectF());
        }
        getCurrMusicProcess();
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC766140U3o) it2.next()).LIZ();
        }
    }
}
