package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10KK, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10KK {
    public static final String LJIJI;
    public static final SpannableStringBuilder LJIJJ;
    public final C1264020izw LIZ;
    public final C10KJ LIZIZ;
    public final TuxTextView LIZJ;
    public final float LIZLLL;
    public C2177241AIw LJI;
    public Bitmap LJII;
    public Function1<? super Integer, Unit> LJIIIIZZ;
    public final String LJIIJJI;
    public SpannableStringBuilder LJIIL;
    public String LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public final List<C10KL> LJ = new ArrayList();
    public final List<IntRange> LJFF = new ArrayList();
    public boolean LJIIIZ = true;
    public final float LJIIJ = C418440Gaw.LIZIZ(20);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01dc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01dd, code lost:
    
        r3.append(" ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        if (LJFF(r11.LIZLLL, r2, r5) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        if (r1 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        if (((java.util.ArrayList) r11.LJ).isEmpty() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        if (((X.C10KL) X.C13LP.LJJLIIIJJI(r11.LJ)).LIZIZ(r11.LJIIJ) <= 0.0f) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013c, code lost:
    
        r5.clear();
        r5.addAll(LJ(r11.LIZLLL));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0148, code lost:
    
        if (r1 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
    
        if (((java.util.ArrayList) r11.LJ).isEmpty() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0156, code lost:
    
        X.C19719612Di.LJJIJ(r11.LJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015e, code lost:
    
        r10 = r5.iterator();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
    
        if (r10.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0169, code lost:
    
        r0 = r10.next();
        r9 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016f, code lost:
    
        if (r7 < 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0171, code lost:
    
        r8 = ((X.C995080c0A) r0).LIZ.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017d, code lost:
    
        if (r8.hasNext() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017f, code lost:
    
        r1 = r8.next();
        r6 = r1.LIZ(r1.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018f, code lost:
    
        if (r1.LJ != X.C10KM.FLOAT) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0191, code lost:
    
        ((java.util.ArrayList) r11.LJFF).add(new kotlin.ranges.IntRange(r2, r6.length() + r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        r3.append((java.lang.CharSequence) r6);
        r2 = r2 + r6.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b1, code lost:
    
        if (r7 == (r5.size() - 1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b3, code lost:
    
        r3.append(r11.LJIIJJI);
        r2 = r2 + r11.LJIIJJI.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bf, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c1, code lost:
    
        X.C1697810uHb.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        r2 = r11.LJII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c7, code lost:
    
        if (r2 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
    
        if (r11.LIZIZ.LIZJ == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d1, code lost:
    
        r3.append(r11.LJIIJJI);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
    
        r3.append(" ");
        LJI(r3, r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[PHI: r4
      0x00cb: PHI (r4v7 X.10KL) = (r4v2 X.10KL), (r4v9 X.10KL) binds: [B:42:0x00c9, B:54:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder LIZJ() {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10KK.LIZJ():android.text.SpannableStringBuilder");
    }

    public final C11JN LJIIIIZZ() {
        return C11NZ.LJIJJLI(new C19336110kp(this, 4)).LJJIJL(new C19334110kV(this, 8));
    }

    static {
        String strLJI = C20642515q3.LJI(2131845714);
        if (strLJI == null) {
            strLJI = "people you may know";
        }
        LJIJI = strLJI;
        LJIJJ = new SpannableStringBuilder(strLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x014b A[Catch: Exception -> 0x015a, TRY_LEAVE, TryCatch #0 {Exception -> 0x015a, blocks: (B:34:0x00cb, B:36:0x00d8, B:37:0x00db, B:39:0x00f5, B:41:0x00fb, B:43:0x00ff, B:45:0x0105, B:47:0x0109, B:53:0x0115, B:55:0x011b, B:58:0x0121, B:60:0x012a, B:64:0x0133, B:66:0x0140, B:65:0x0139, B:57:0x011f, B:67:0x014b), top: B:72:0x00cb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder LIZLLL() {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10KK.LIZLLL():android.text.SpannableStringBuilder");
    }

    public final void LIZ(SpannableStringBuilder spannableStringBuilder) {
        Integer num = this.LIZ.LIZJ;
        if (num != null) {
            int iIntValue = num.intValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = iIntValue;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, this.LIZJ.getContext());
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZJ.getContext());
            tuxIconDrawableLIZ.setBounds(0, 0, c419910GdJ.LIZIZ, c419910GdJ.LIZJ);
            C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
            spannableStringBuilder.append(" ");
            C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 33);
            spannableStringBuilder.append("\u200a\u200a");
        }
    }

    public final void LIZIZ(SpannableStringBuilder spannableStringBuilder) {
        if (this.LIZIZ.LIZLLL) {
            for (IntRange intRange : this.LJFF) {
                StyleSpan styleSpan = new StyleSpan(1);
                int i = intRange.LL;
                if (i < 0) {
                    i = 0;
                }
                int length = spannableStringBuilder.length();
                if (i > length) {
                    i = length;
                }
                int i2 = intRange.LLILLJJLI;
                if (i2 < 0) {
                    i2 = 0;
                }
                int length2 = spannableStringBuilder.length();
                if (i2 > length2) {
                    i2 = length2;
                }
                C786410Ut5.q2(spannableStringBuilder, styleSpan, i, i2, 17);
            }
        }
        if (this.LIZIZ.LJ) {
            final int i3 = 0;
            for (IntRange intRange2 : this.LJFF) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    IntRange intRange3 = intRange2;
                    AbstractC426530Gnz abstractC426530Gnz = new AbstractC426530Gnz() { // from class: X.10KN
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            try {
                                Function1<? super Integer, Unit> function1 = this.LL.LJIIIIZZ;
                                if (function1 != null) {
                                    function1.invoke(Integer.valueOf(i3));
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }
                    };
                    int i5 = intRange3.LL;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    int length3 = spannableStringBuilder.length();
                    if (i5 > length3) {
                        i5 = length3;
                    }
                    int i6 = intRange3.LLILLJJLI;
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    int length4 = spannableStringBuilder.length();
                    if (i6 > length4) {
                        i6 = length4;
                    }
                    C786410Ut5.q2(spannableStringBuilder, abstractC426530Gnz, i5, i6, 17);
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final List<C995080c0A> LJ(float f) {
        ArrayList arrayList = new ArrayList();
        if (((ArrayList) this.LJ).isEmpty()) {
            return arrayList;
        }
        arrayList.add(new C995080c0A(f));
        int i = 0;
        while (i >= 0 && i < ((ArrayList) this.LJ).size()) {
            C995080c0A c995080c0A = (C995080c0A) C13LP.LJJLIIIJJI(arrayList);
            C10KL c10kl = (C10KL) ListProtector.get(this.LJ, i);
            if (c995080c0A.LIZ() + c10kl.LIZLLL <= c995080c0A.LIZIZ) {
                c995080c0A.LIZ.add(c10kl);
            } else if (c995080c0A.LIZ.isEmpty()) {
                c10kl.LIZIZ((c10kl.LIZLLL + c995080c0A.LIZ()) - c995080c0A.LIZIZ);
                c995080c0A.LIZ.add(c10kl);
            } else {
                float fLIZ = (c10kl.LIZLLL + c995080c0A.LIZ()) - c995080c0A.LIZIZ;
                if (c10kl.LJ == C10KM.FLOAT) {
                    if (fLIZ >= c10kl.LIZLLL / 3 && c995080c0A.LIZ() >= c995080c0A.LIZIZ / 2) {
                        arrayList.add(new C995080c0A(f));
                    } else {
                        c10kl.LIZIZ(fLIZ);
                        c995080c0A.LIZ.add(c10kl);
                        i++;
                        arrayList.add(new C995080c0A(f));
                    }
                } else {
                    arrayList.add(new C995080c0A(f));
                }
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((C995080c0A) obj).LIZ.isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final synchronized void LJI(SpannableStringBuilder spannableStringBuilder, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LIZJ.getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        C786410Ut5.q2(spannableStringBuilder, new C419890GdH(bitmapDrawable, 2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }

    public final List LJII(TuxTextView tuxTextView, String str) {
        ArrayList arrayList = new ArrayList();
        List<String> listSplit = new Regex("\\s+").split(str, 0);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : listSplit) {
            if (C123100dR.LIZ(str2)) {
                arrayList2.add(str2);
            }
        }
        int i = 0;
        for (Object obj : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                String strLIZIZ = (String) obj;
                if (i == 0) {
                    if (u.LJJIIJZLJL(str, " ", false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(' ');
                        sbLIZ.append(strLIZIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (arrayList2.size() > 1 || u.LJIIZILJ(str, " ", false)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(' ');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                } else if (i == arrayList2.size() - 1) {
                    if (u.LJIIZILJ(str, " ", false)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(' ');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append(' ');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                }
                arrayList.add(new C10KL(this, tuxTextView, strLIZIZ, a0.LJJIJL(strLIZIZ), tuxTextView.getPaint().measureText(strLIZIZ), C10KM.STATIC));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public final boolean LJFF(float f, int i, List list) {
        float fLIZ;
        String str;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > i) {
            return false;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C10KL c10kl = (C10KL) C13LP.LJJJLL(((C995080c0A) it2.next()).LIZ);
                if (c10kl != null) {
                    str = c10kl.LIZIZ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, ", ")) {
                    return false;
                }
            }
        }
        C10KJ c10kj = this.LIZIZ;
        if (!c10kj.LIZIZ || this.LJII == null || c10kj.LIZJ || arrayList.size() != i) {
            return true;
        }
        C995080c0A c995080c0A = (C995080c0A) C13LP.LJJLIIIJL(list);
        float width = 0.0f;
        if (c995080c0A != null) {
            fLIZ = c995080c0A.LIZ();
        } else {
            fLIZ = 0.0f;
        }
        Bitmap bitmap = this.LJII;
        if (bitmap != null) {
            width = bitmap.getWidth();
        }
        if (fLIZ >= (f - width) - this.LIZJ.getPaint().measureText(" ")) {
            return false;
        }
        return true;
    }

    public C10KK(C1264020izw c1264020izw, C10KJ c10kj, TuxTextView tuxTextView, float f) {
        String str;
        this.LIZ = c1264020izw;
        this.LIZIZ = c10kj;
        this.LIZJ = tuxTextView;
        this.LIZLLL = f;
        if (C444960Hcc.LIZIZ()) {
            str = "\n\u200f";
        } else {
            str = "\n";
        }
        this.LJIIJJI = str;
        this.LJIIL = LJIJJ;
        this.LJIILIIL = "success";
    }
}
