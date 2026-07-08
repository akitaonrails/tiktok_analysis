package X;

import Y.AfS198S0100000_29;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.11nH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19606111nH {
    public final EmojiAnimPlayground LIZ;
    public final ArrayList<InterfaceC19606511nL> LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public C11LS LJ;
    public final C01GW LJFF;
    public long LJI;
    public volatile long LJII;
    public Function1<? super String, Unit> LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;

    public final void LIZ() {
        EmojiAnimPlayground emojiAnimPlayground = this.LIZ;
        int visibility = emojiAnimPlayground.getVisibility();
        emojiAnimPlayground.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, emojiAnimPlayground);
        ((C11NJ) this.LJFF.getValue()).LJ();
        this.LJI = 0L;
    }

    public final List<C19607011nQ> LIZJ() {
        return (List) this.LIZJ.getValue();
    }

    public C19606111nH(EmojiAnimPlayground emojiAnimPlayground) {
        this.LIZ = emojiAnimPlayground;
        ArrayList<InterfaceC19606511nL> arrayList = new ArrayList<>();
        this.LIZIZ = arrayList;
        this.LIZJ = C452501pT.LIZIZ(new C19606211nI());
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new C19606411nK());
        arrayList.add(new InterfaceC19606511nL() { // from class: X.11nS
            @Override // X.InterfaceC19606511nL
            public final void LIZ(C19607011nQ c19607011nQ, long j) {
                float f = (j - c19607011nQ.LIZJ) / c19607011nQ.LIZLLL;
                double d = f;
                if (0.0d <= d && d <= 1.0d) {
                    c19607011nQ.LJIIIZ = c19607011nQ.LJI - (c19607011nQ.LJII * new DecelerateInterpolator(2.0f).getInterpolation(f));
                }
            }
        });
        arrayList.add(new InterfaceC19606511nL() { // from class: X.11nT
            @Override // X.InterfaceC19606511nL
            public final void LIZ(C19607011nQ c19607011nQ, long j) {
                float f = ((j - c19607011nQ.LIZJ) - ((long) 600)) / 450;
                if (f < 0.0f) {
                    c19607011nQ.LJIIL = 1.0f;
                } else if (f > 1.0f) {
                    c19607011nQ.LJIIL = 0.0f;
                } else {
                    c19607011nQ.LJIIL = 1 - new DecelerateInterpolator(1.5f).getInterpolation(f);
                }
            }
        });
        arrayList.add(new InterfaceC19606511nL() { // from class: X.11nR
            @Override // X.InterfaceC19606511nL
            public final void LIZ(C19607011nQ c19607011nQ, long j) {
                long j2 = 500;
                float f = ((j - c19607011nQ.LIZJ) - j2) / (c19607011nQ.LIZLLL - j2);
                double d = f;
                if (0.0d <= d && d <= 1.0d) {
                    c19607011nQ.LJIIJ = (c19607011nQ.LJIIJJI * new DecelerateInterpolator(1.5f).getInterpolation(f)) + 1.5f;
                }
            }
        });
        emojiAnimPlayground.setEmojiItemList(LIZJ());
        this.LJFF = C452501pT.LIZ(enumC452301pR, new C19606311nJ());
        this.LJIIIZ = "";
    }

    public final void LIZIZ(String str) {
        int iIntValue;
        long j = this.LJII;
        long j2 = this.LJI;
        if (1 <= j2 && j2 <= j) {
            if (Intrinsics.LJFF(this.LJIIIZ, str)) {
                int i = this.LJIIJ + 1;
                this.LJIIJ = i;
                iIntValue = 5;
                if (i <= 5) {
                    iIntValue = 3;
                }
            } else {
                this.LJIIIZ = str;
                this.LJIIJ = 1;
                iIntValue = ((Number) this.LIZLLL.getValue()).intValue();
            }
            ArrayList arrayListLIZLLL = LIZLLL(iIntValue, this.LJI, str, false);
            synchronized (LIZJ()) {
                try {
                    LIZJ().addAll(arrayListLIZLLL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        this.LJIIIZ = str;
        this.LJIIJ = 1;
        this.LJII = 0L;
        LJFF(LIZLLL(((Number) this.LIZLLL.getValue()).intValue(), 0L, str, true));
    }

    public final void LJFF(List<? extends C19607011nQ> list) {
        EmojiAnimPlayground emojiAnimPlayground = this.LIZ;
        int visibility = emojiAnimPlayground.getVisibility();
        emojiAnimPlayground.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, emojiAnimPlayground);
        this.LJI = 0L;
        LIZJ().clear();
        LIZJ().addAll(list);
        C11LS c11ls = this.LJ;
        if (c11ls != null) {
            c11ls.dispose();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int i = C11NN.LL;
        InterfaceC420801kM interfaceC420801kMLJIIL = C11NN.LJI(0L, 16L, timeUnit, C11S5.LIZIZ).LJIIL(new AfS198S0100000_29(this, 49));
        ((C11NJ) this.LJFF.getValue()).LIZ(interfaceC420801kMLJIIL);
        this.LJ = (C11LS) interfaceC420801kMLJIIL;
    }

    public final void LJ(int i, boolean z, ArrayList arrayList) {
        int height;
        int width;
        Collections.shuffle(arrayList);
        if (this.LIZ.getHeight() == 0) {
            height = C497820Jfg.LIZ(this.LIZ.getContext()) + C497820Jfg.LIZJ(this.LIZ.getContext());
        } else {
            height = this.LIZ.getHeight();
        }
        if (this.LIZ.getWidth() == 0) {
            width = C497820Jfg.LIZIZ(this.LIZ.getContext());
        } else {
            width = this.LIZ.getWidth();
        }
        float f = 28;
        float fLIZ = height + (C339190DRl.LIZ(f) * 3);
        int i2 = width / i;
        float fLIZ2 = C339190DRl.LIZ(f) / 2;
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C19607011nQ c19607011nQ = (C19607011nQ) obj;
                if (z) {
                    c19607011nQ.LJFF = (i3 * i2) + fLIZ2;
                } else {
                    c19607011nQ.LJFF = C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, width));
                }
                c19607011nQ.LJI = fLIZ;
                if (c19607011nQ.LJ > this.LJII) {
                    this.LJII = c19607011nQ.LJ;
                }
                c19607011nQ.LJIIIIZZ = c19607011nQ.LJFF;
                c19607011nQ.LJIIIZ = c19607011nQ.LJI;
                IntRange intRange = new IntRange(250, 500);
                C19994913Lf c19994913Lf = AbstractC19994813Le.Default;
                c19607011nQ.LJII = C339190DRl.LIZ(C13LZ.LJIIJ(c19994913Lf, intRange));
                c19607011nQ.LJIIJJI = C13LZ.LJIIJ(c19994913Lf, new IntRange(5, 10)) / 10.0f;
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final ArrayList LIZLLL(int i, long j, String str, boolean z) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C19607011nQ c19607011nQ = new C19607011nQ(str);
            c19607011nQ.LJIILIIL = this.LIZIZ;
            c19607011nQ.LIZ(i2, j);
            arrayList.add(c19607011nQ);
        }
        LJ(i, z, arrayList);
        return arrayList;
    }
}
