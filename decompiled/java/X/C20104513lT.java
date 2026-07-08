package X;

import android.text.Spannable;
import android.view.Choreographer;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.ui.span.ForegroundAlphaSpanV2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13lT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20104513lT implements C0DR1 {
    public C20104413lS LIZ;
    public boolean LIZLLL;
    public final Set<TextView> LIZIZ = new LinkedHashSet();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(333));
    public final ChoreographerFrameCallbackC20104313lR LJ = new Choreographer.FrameCallback() { // from class: X.13lR
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            long jLongValue;
            C20104413lS c20104413lS = this.LL.LIZ;
            if (c20104413lS != null && !c20104413lS.LIZIZ.isEmpty() && !this.LL.LIZIZ.isEmpty()) {
                Map<Integer, Integer> map = c20104413lS.LIZIZ;
                Map<Integer, Long> map2 = c20104413lS.LIZJ;
                Set<Map.Entry<Integer, Integer>> setEntrySet = map.entrySet();
                C20104513lT c20104513lT = this.LL;
                Iterator<T> it2 = setEntrySet.iterator();
                boolean z = true;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Long l = map2.get(entry.getKey());
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        map2.put((Integer) entry.getKey(), Long.valueOf(j));
                        jLongValue = j;
                    }
                    long j2 = (j - jLongValue) / 1000000;
                    if (j2 < 0) {
                        j2 = 0;
                    }
                    c20104513lT.getClass();
                    float fLIZLLL = C13LZ.LIZLLL(j2 / 750, 0.0f, 1.0f);
                    int iLJ = C13LZ.LJ((int) (255 * fLIZLLL * fLIZLLL), 0, 255);
                    entry.setValue(Integer.valueOf(iLJ));
                    if (iLJ < 255) {
                        z = false;
                    }
                }
                this.LL.LIZIZ();
                if (z) {
                    this.LL.LIZJ();
                    return;
                } else {
                    ((Choreographer) this.LL.LIZJ.getValue()).postFrameCallback(this);
                    return;
                }
            }
            this.LL.LIZJ();
        }
    };

    public final void LIZIZ() {
        Spannable spannable;
        int length;
        C20104413lS c20104413lS = this.LIZ;
        if (c20104413lS == null) {
            return;
        }
        Set<TextView> set = this.LIZIZ;
        Map<Integer, Integer> map = c20104413lS.LIZIZ;
        CharSequence charSequence = c20104413lS.LIZ;
        if (!(charSequence instanceof Spannable) || (spannable = (Spannable) charSequence) == null) {
            return;
        }
        List listLJLLJ = C13LP.LJLLJ(C13LP.LLIIII(map.keySet()));
        Map<Integer, ForegroundAlphaSpanV2> map2 = c20104413lS.LIZLLL;
        int i = 0;
        for (Object obj : listLJLLJ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            if (spannable.length() > iIntValue) {
                if (i2 < listLJLLJ.size()) {
                    length = ((Number) ListProtector.get(listLJLLJ, i2)).intValue();
                    int length2 = spannable.length();
                    if (length > length2) {
                        length = length2;
                    }
                } else {
                    length = spannable.length();
                }
                Integer num = map.get(Integer.valueOf(iIntValue));
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    ForegroundAlphaSpanV2 foregroundAlphaSpanV2 = map2.get(Integer.valueOf(iIntValue));
                    if (foregroundAlphaSpanV2 != null) {
                        foregroundAlphaSpanV2.LIZIZ(iIntValue2);
                    }
                    C21418118rr[] c21418118rrArr = (C21418118rr[]) spannable.getSpans(iIntValue, length, C21418118rr.class);
                    for (C21418118rr c21418118rr : c21418118rrArr) {
                        c21418118rr.LLIZ = iIntValue2;
                    }
                }
            }
            i = i2;
        }
        Iterator<TextView> it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next().invalidate();
        }
    }

    public final void LIZJ() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            ((Choreographer) this.LIZJ.getValue()).removeFrameCallback(this.LJ);
        }
    }

    @Override // X.C0DR1
    public final void reset() {
        LIZJ();
        this.LIZ = null;
        this.LIZIZ.clear();
    }

    @Override // X.C0DR1
    public final void LIZ(C688690Qzr c688690Qzr, CharSequence charSequence) {
        CharSequence charSequence2;
        Spannable spannable;
        int length;
        int iIntValue;
        C20104413lS c20104413lS = this.LIZ;
        if (c20104413lS == null) {
            this.LIZ = new C20104413lS(charSequence);
            charSequence2 = null;
        } else {
            charSequence2 = c20104413lS.LIZ;
        }
        C20104413lS c20104413lS2 = this.LIZ;
        if (c20104413lS2 == null) {
            return;
        }
        long jNanoTime = System.nanoTime();
        if (charSequence2 == null) {
            c20104413lS2.LIZIZ.put(0, 0);
            c20104413lS2.LIZJ.put(0, Long.valueOf(jNanoTime));
        } else if (charSequence.length() > charSequence2.length()) {
            int length2 = charSequence2.length();
            c20104413lS2.LIZIZ.put(Integer.valueOf(length2), 0);
            c20104413lS2.LIZJ.put(Integer.valueOf(length2), Long.valueOf(jNanoTime));
        }
        c20104413lS2.LIZ = charSequence;
        if (c20104413lS2.LIZIZ.isEmpty()) {
            return;
        }
        if ((charSequence instanceof Spannable) && (spannable = (Spannable) charSequence) != null) {
            List listLJLLJ = C13LP.LJLLJ(C13LP.LLIIII(c20104413lS2.LIZIZ.keySet()));
            if (!listLJLLJ.isEmpty()) {
                int i = 0;
                for (Object obj : listLJLLJ) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        int iIntValue2 = ((Number) obj).intValue();
                        if (iIntValue2 >= 0 && iIntValue2 < spannable.length()) {
                            if (i2 < listLJLLJ.size()) {
                                length = ((Number) ListProtector.get(listLJLLJ, i2)).intValue();
                                int length3 = spannable.length();
                                if (length > length3) {
                                    length = length3;
                                }
                            } else {
                                length = spannable.length();
                            }
                            if (length > iIntValue2) {
                                Map<Integer, ForegroundAlphaSpanV2> map = c20104413lS2.LIZLLL;
                                Integer numValueOf = Integer.valueOf(iIntValue2);
                                ForegroundAlphaSpanV2 foregroundAlphaSpanV2 = map.get(numValueOf);
                                if (foregroundAlphaSpanV2 == null) {
                                    Integer num = c20104413lS2.LIZIZ.get(Integer.valueOf(iIntValue2));
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    foregroundAlphaSpanV2 = new ForegroundAlphaSpanV2(iIntValue);
                                    map.put(numValueOf, foregroundAlphaSpanV2);
                                }
                                int spanStart = spannable.getSpanStart(foregroundAlphaSpanV2);
                                int spanEnd = spannable.getSpanEnd(foregroundAlphaSpanV2);
                                if (spanStart != iIntValue2 || spanEnd != length) {
                                    C786410Ut5.o2(spannable, foregroundAlphaSpanV2, iIntValue2, length, 17);
                                }
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        this.LIZIZ.add(c688690Qzr);
        LIZIZ();
        C20104413lS c20104413lS3 = this.LIZ;
        if (c20104413lS3 != null && !c20104413lS3.LIZIZ.isEmpty() && !this.LIZLLL) {
            this.LIZLLL = true;
            ((Choreographer) this.LIZJ.getValue()).postFrameCallback(this.LJ);
        }
    }
}
