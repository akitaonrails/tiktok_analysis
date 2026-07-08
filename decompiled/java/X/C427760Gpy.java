package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Region;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427760Gpy extends LinearLayout {
    public final C427790Gq1 LL;
    public Path LLILLJJLI;
    public final List<C427730Gpv> LLILLL;
    public final C427770Gpz LLILZ;
    public EnumC428930Grr LLILZIL;
    public EnumC429060Gs4 LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public int LLJI;

    public C427760Gpy(Context context) {
        this(context, null, 6);
    }

    public C427760Gpy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        Path boundaryPath;
        float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL.getItemSpacingDp())) + C418440Gaw.LIZIZ(Float.valueOf(this.LLIZ));
        float fLIZIZ2 = C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL.getCutoutSizeDp())) + C418440Gaw.LIZIZ(Float.valueOf(this.LLIZLLLIL));
        if (fLIZIZ < 0.0f || fLIZIZ2 - fLIZIZ > this.LLILZIL.getDpFloat$avatar_release()) {
            float dpFloat$avatar_release = this.LLILZIL.getDpFloat$avatar_release() + fLIZIZ;
            int i = C426750GoL.LIZLLL(getContext()) ? -1 : 1;
            int i2 = this.LLILZLL == EnumC429060Gs4.LAST_ON_TOP ? 1 : -1;
            C427790Gq1 c427790Gq1 = this.LL;
            int dp$avatar_release = this.LLILZIL.getDp$avatar_release();
            float f = dpFloat$avatar_release * i * i2;
            float dpFloat$avatar_release2 = this.LLILZIL.getDpFloat$avatar_release();
            if (fLIZIZ2 < dpFloat$avatar_release2) {
                fLIZIZ2 = dpFloat$avatar_release2;
            }
            c427790Gq1.LIZ.reset();
            c427790Gq1.LIZIZ.reset();
            c427790Gq1.LIZJ.setEmpty();
            c427790Gq1.LIZLLL.setEmpty();
            c427790Gq1.LJ.setEmpty();
            float f2 = dp$avatar_release * 0.5f;
            c427790Gq1.LIZ.addCircle(f + f2, f2, fLIZIZ2 * 0.5f, Path.Direction.CW);
            c427790Gq1.LIZIZ.addCircle(f2, f2, f2, Path.Direction.CW);
            c427790Gq1.LJ.set(0, 0, dp$avatar_release, dp$avatar_release);
            c427790Gq1.LIZJ.setPath(c427790Gq1.LIZ, c427790Gq1.LJ);
            c427790Gq1.LIZLLL.setPath(c427790Gq1.LIZIZ, c427790Gq1.LJ);
            c427790Gq1.LIZLLL.op(c427790Gq1.LIZJ, Region.Op.DIFFERENCE);
            boundaryPath = c427790Gq1.LIZLLL.getBoundaryPath();
        } else {
            boundaryPath = null;
        }
        this.LLILLJJLI = boundaryPath;
    }

    public final void LIZJ() {
        int iMin = Math.min(this.LLJ, this.LLJI + 1);
        Iterator<C427730Gpv> it2 = this.LLILLL.iterator();
        int i = 0;
        while (true) {
            Path path = null;
            if (!it2.hasNext()) {
                int i2 = C427780Gq0.LIZ[this.LLILZLL.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new C1954807lC();
                    }
                    if (iMin > this.LLJI) {
                        path = this.LLILLJJLI;
                    }
                }
                this.LLILZ.setBoundaryPath(path);
                return;
            }
            C427730Gpv next = it2.next();
            int i3 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C427730Gpv c427730Gpv = next;
            int i4 = C427780Gq0.LIZ[this.LLILZLL.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new C1954807lC();
                }
                if (i != 0) {
                    path = this.LLILLJJLI;
                }
            } else if (i < iMin - 1) {
                path = this.LLILLJJLI;
            }
            c427730Gpv.setBoundaryPath(path);
            i = i3;
        }
    }

    public final void LIZLLL() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZIL.getItemSpacingDp())) + C418440Gaw.LIZIZ(Float.valueOf(this.LLIZ)));
        int iLJIIJ = C1697810uHb.LJIIJ(this.LLILLL);
        int i = 1;
        if (1 <= iLJIIJ) {
            while (true) {
                C426750GoL.LJIIIZ((View) ListProtector.get(this.LLILLL, i), Integer.valueOf(iLIZIZ), null, null, null, false, 30);
                if (i == iLJIIJ) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C426750GoL.LJIIIZ(this.LLILZ, Integer.valueOf(iLIZIZ), null, null, null, false, 30);
    }

    public final void LJ() {
        Iterator<C427730Gpv> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().setSize(this.LLILZIL);
        }
        this.LLILZ.setSize(this.LLILZIL);
    }

    public final void setExtraCutoutSizeDp(float f) {
        this.LLIZLLLIL = f;
        LIZIZ();
        LIZJ();
    }

    public final void setExtraItemSpacingDp(float f) {
        this.LLIZ = f;
        LIZLLL();
        LIZIZ();
        LIZJ();
    }

    public final void setMaxImageNum(int i) {
        int i2 = 0;
        if (i > 0) {
            this.LLJI = i;
            int size = (i + 1) - ((ArrayList) this.LLILLL).size();
            if (size > 0) {
                do {
                    C427730Gpv c427730Gpv = new C427730Gpv(getContext());
                    C786410Ut5.LJLLLLLL(8, c427730Gpv);
                    ((ArrayList) this.LLILLL).add(c427730Gpv);
                    addView(c427730Gpv, getChildCount() - 1);
                    i2++;
                } while (i2 < size);
            }
            LIZLLL();
            setTotalCount(this.LLJ);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Max image count can't be less than 1: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void setSize(EnumC428930Grr enumC428930Grr) {
        this.LLILZIL = enumC428930Grr;
        LJ();
        LIZLLL();
        LIZIZ();
        LIZJ();
    }

    public final void setStacking(EnumC429060Gs4 enumC429060Gs4) {
        this.LLILZLL = enumC429060Gs4;
        LIZIZ();
        LIZJ();
    }

    public final void setTotalCount(int i) {
        int i2 = 0;
        if (i >= 0) {
            this.LLJ = i;
            this.LLILZ.setCount(i - this.LLJI);
            LIZJ();
            int i3 = this.LLJ;
            int i4 = this.LLJI;
            if (i3 > i4 + 1) {
                i3 = i4;
            }
            Iterator<C427730Gpv> it2 = this.LLILLL.iterator();
            int i5 = 0;
            while (true) {
                int i6 = 8;
                if (it2.hasNext()) {
                    C427730Gpv next = it2.next();
                    int i7 = i5 + 1;
                    if (i5 >= 0) {
                        C427730Gpv c427730Gpv = next;
                        if (i5 < i3) {
                            i6 = 0;
                        }
                        C786410Ut5.LJLLLLLL(i6, c427730Gpv);
                        i5 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    C427770Gpz c427770Gpz = this.LLILZ;
                    if (this.LLJ <= this.LLJI + 1) {
                        i2 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i2, c427770Gpz);
                    return;
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Total count can't be negative: ");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C427760Gpy(Context context, AttributeSet attributeSet, int i) {
        int i2;
        EnumC428930Grr enumC428930Grr;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xg;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LL = new C427790Gq1();
        EnumC428930Grr enumC428930Grr2 = EnumC428930Grr.LARGE;
        this.LLILZIL = enumC428930Grr2;
        this.LLILZLL = EnumC429060Gs4.LAST_ON_TOP;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAvatarStack, i2, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAvatarStack_tux_avatarStackSize, enumC428930Grr2.getSizeDp());
        int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAvatarStack_tux_avatarStackMaxImageNum, 3);
        this.LLJI = i4;
        if (i4 > 0) {
            typedArrayObtainStyledAttributes.recycle();
            setGravity(16);
            setOrientation(0);
            int i5 = this.LLJI + 1;
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                C427730Gpv c427730Gpv = new C427730Gpv(context);
                C786410Ut5.LJLLLLLL(8, c427730Gpv);
                addView(c427730Gpv);
                arrayList.add(c427730Gpv);
            }
            this.LLILLL = arrayList;
            C427770Gpz c427770Gpz = new C427770Gpz(context);
            C786410Ut5.LJLLLLLL(8, c427770Gpz);
            this.LLILZ = c427770Gpz;
            addView(c427770Gpz);
            EnumC428930Grr[] enumC428930GrrArrValues = EnumC428930Grr.values();
            int length = enumC428930GrrArrValues.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    enumC428930Grr = enumC428930GrrArrValues[i7];
                    if (enumC428930Grr.getSizeDp() == i3) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    enumC428930Grr = EnumC428930Grr.LARGE;
                    break;
                }
            }
            this.LLILZIL = enumC428930Grr;
            LJ();
            LIZLLL();
            LIZIZ();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Max image count can't be less than 1: ");
        sbLIZ.append(this.LLJI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static void LIZ(C427760Gpy c427760Gpy, int i, Object obj, CharSequence charSequence, String str, C0ID0 c0id0, boolean z, Function1 function1, int i2) {
        boolean z2;
        C1331670kl3 c1331670kl3LJIIIIZZ;
        boolean z3 = true;
        if ((i2 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            str = null;
        }
        if ((i2 & 128) == 0) {
            z3 = false;
        }
        if ((i2 & 256) != 0) {
            c0id0 = null;
        }
        if ((i2 & 512) != 0) {
            z = false;
        }
        if ((i2 & 1024) != 0) {
            function1 = null;
        }
        C427730Gpv c427730Gpv = (C427730Gpv) ListProtector.get(c427760Gpy.LLILLL, i);
        c427730Gpv.LLJJIJIL = z3;
        if (obj instanceof Integer) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJFF(((Number) obj).intValue());
        } else if (obj instanceof File) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJII((File) obj);
        } else if (obj instanceof String) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIZ((String) obj);
        } else if (obj instanceof Uri) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJI((Uri) obj);
        } else if (obj instanceof C03IT) {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIJ((C03IT) obj);
        } else {
            c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(obj);
        }
        int dp$avatar_release = c427730Gpv.LLJJIJI.getDp$avatar_release();
        int dp$avatar_release2 = c427730Gpv.LLJJIJI.getDp$avatar_release();
        c1331670kl3LJIIIIZZ.LJIIIIZZ = dp$avatar_release;
        c1331670kl3LJIIIIZZ.LJIIIZ = dp$avatar_release2;
        c1331670kl3LJIIIIZZ.LIZLLL(str);
        c1331670kl3LJIIIIZZ.LJJIIZI(c427730Gpv.LLJJIII);
        c1331670kl3LJIIIIZZ.LJJIJLIJ = z2;
        c1331670kl3LJIIIIZZ.LJJ(c427730Gpv);
        if (function1 != null) {
            function1.invoke(c1331670kl3LJIIIIZZ);
        }
        C463040IDu c463040IDu = new C463040IDu(c427730Gpv, c0id0, 0);
        if (z) {
            c1331670kl3LJIIIIZZ.LJIIL(c463040IDu);
        } else {
            c1331670kl3LJIIIIZZ.LJIIJ(c463040IDu);
        }
        c427730Gpv.setContentDescription(charSequence);
    }
}
