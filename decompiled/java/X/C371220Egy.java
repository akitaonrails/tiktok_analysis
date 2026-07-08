package X;

import Y.ALAdapterS2S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Egy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371220Egy extends View {
    public static final float LLJJIJIIJIL = C390810FTz.LIZ(6.0f);
    public static final float LLJJIJIL = C390810FTz.LIZ(4.0f);
    public static final float LLJJJ = C390810FTz.LIZ(10.0f);
    public List<BeatInfo> LL;
    public List<Pair<BeatInfo, Integer>> LLILLJJLI;
    public float LLILLL;
    public final Paint LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Function1<? super Pair<BeatInfo, Integer>, Unit> LLIZ;
    public Pair<BeatInfo, Integer> LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public Pair<BeatInfo, Integer> LLJILLL;
    public Pair<BeatInfo, Integer> LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C01GW LLJJIJI;

    public final Function1<Pair<BeatInfo, Integer>, Unit> getOnBeatClickListener() {
        return this.LLIZ;
    }

    public C371220Egy(Context context) {
        int iIntValue;
        super(context);
        C13BV c13bv = C13BV.INSTANCE;
        this.LL = c13bv;
        this.LLILLJJLI = c13bv;
        this.LLILLL = C360610EBv.LIZJ();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ny, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        this.LLILZ = paint;
        float f = LLJJIJIL;
        this.LLJ = f;
        this.LLJI = f;
        this.LLJIJIL = LLJJIJIIJIL;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1615));
    }

    public final Pair<BeatInfo, Integer> LIZ(int i) {
        Object next;
        float f = LLJJJ / this.LLILLL;
        int size = this.LLILLJJLI.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            BeatInfo beatInfo = (BeatInfo) ((Pair) ListProtector.get(this.LLILLJJLI, i3)).getFirst();
            int i4 = beatInfo.timestampInMS;
            float f2 = i;
            if (i4 >= f2 - f && i4 <= f2 + f) {
                arrayList.add(ListProtector.get(this.LLILLJJLI, i3));
            }
            if (beatInfo.timestampInMS > i) {
                size = i3;
            } else {
                i2 = i3 + 1;
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int iAbs = Math.abs(((BeatInfo) ((Pair) next).getFirst()).timestampInMS - i);
                do {
                    Object next2 = it2.next();
                    int iAbs2 = Math.abs(((BeatInfo) ((Pair) next2).getFirst()).timestampInMS - i);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it2.hasNext());
            }
        }
        return (Pair) next;
    }

    public final Pair<BeatInfo, Integer> LIZJ(int i) {
        Pair<BeatInfo, Integer> pairLIZ = LIZ(i);
        if (!Intrinsics.LJFF(pairLIZ, this.LLJILLL)) {
            Pair<BeatInfo, Integer> pair = this.LLJILLL;
            this.LLJJ = pair;
            if (pair != null && !this.LLJILJILJ) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(LLJJIJIIJIL, LLJJIJIL);
                valueAnimatorOfFloat.setDuration(100L);
                valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 43));
                valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 35));
                valueAnimatorOfFloat.start();
            }
            this.LLJILLL = pairLIZ;
            if (pairLIZ != null && !this.LLJILJIL) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(LLJJIJIL, LLJJIJIIJIL);
                valueAnimatorOfFloat2.setDuration(100L);
                valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
                valueAnimatorOfFloat2.addUpdateListener(new AUListenerS255S0100000_5(this, 40));
                valueAnimatorOfFloat2.addListener(new ALAdapterS2S0100000_5(this, 34));
                valueAnimatorOfFloat2.start();
            }
        }
        return pairLIZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Pair<BeatInfo, Integer> pair : this.LLILLJJLI) {
            BeatInfo first = pair.getFirst();
            float width = ((first.timestampInMS - this.LLILZIL) * this.LLILLL) + LLJJIJIIJIL;
            if (((Boolean) this.LLJJIJI.getValue()).booleanValue()) {
                width = getWidth() - width;
            }
            if (Intrinsics.LJFF(pair, this.LLJILLL)) {
                if (first.beatSource == 1 && this.LLJJIII) {
                    LIZIZ(width, this.LLJ, canvas);
                } else {
                    LIZIZ(width, this.LLJI, canvas);
                }
            } else if (Intrinsics.LJFF(pair, this.LLJJ)) {
                LIZIZ(width, this.LLJIJIL, canvas);
            } else if (first.beatSource == 1) {
                LIZIZ(width, this.LLJ, canvas);
            } else {
                LIZIZ(width, LLJJIJIL, canvas);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function1<? super Pair<BeatInfo, Integer>, Unit> function1;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.LLIZLLLIL = null;
                }
            } else {
                Pair<BeatInfo, Integer> pair = this.LLIZLLLIL;
                if (pair != null && (function1 = this.LLIZ) != null) {
                    function1.invoke(pair);
                }
            }
        } else {
            this.LLIZLLLIL = LIZ((int) (this.LLILZIL + (motionEvent.getX() / this.LLILLL)));
        }
        if (this.LLIZLLLIL != null) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBeats(List<BeatInfo> list) {
        this.LL = list;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (BeatInfo beatInfo : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair(beatInfo, Integer.valueOf(i)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i3 = this.LLILZIL - 10;
            int i4 = this.LLILZLL + 10;
            int i5 = ((BeatInfo) ((Pair) obj).getFirst()).timestampInMS;
            if (i3 <= i5 && i5 <= i4) {
                arrayList2.add(obj);
            }
        }
        this.LLILLJJLI = arrayList2;
        invalidate();
    }

    public final void setOnBeatClickListener(Function1<? super Pair<BeatInfo, Integer>, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void LIZIZ(float f, float f2, Canvas canvas) {
        canvas.drawCircle(f, getHeight() / 2.0f, f2, this.LLILZ);
    }
}
