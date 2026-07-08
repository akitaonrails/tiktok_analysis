package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g1c.AjS5S0201000_6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gtm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430120Gtm extends FrameLayout {
    public final C426160GnO LL;
    public final List<C21375718l1> LLILLJJLI;
    public final List<C420670GeX> LLILLL;
    public InterfaceC430130Gtn LLILZ;
    public C426370Gnj LLILZIL;

    public final void LIZ(C426370Gnj c426370Gnj) {
        if (Intrinsics.LJFF(this.LLILZIL, c426370Gnj)) {
            return;
        }
        this.LLILZIL = c426370Gnj;
        if (c426370Gnj != null) {
            List<C21376318l7> list = c426370Gnj.LIZ;
            int i = 0;
            if (list != null && !list.isEmpty()) {
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
                C426160GnO c426160GnO = this.LL;
                int childCount = c426160GnO.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = c426160GnO.getChildAt(i2);
                    if (childAt instanceof C21375718l1) {
                        ((ArrayList) this.LLILLJJLI).add(childAt);
                    } else if (childAt instanceof C420670GeX) {
                        C09RE c09re = new C09RE((ViewGroup) childAt);
                        while (c09re.hasNext()) {
                            Object next = c09re.next();
                            if (next instanceof C21375718l1) {
                                ((ArrayList) this.LLILLJJLI).add(next);
                                c09re.remove();
                            }
                        }
                        ((ArrayList) this.LLILLL).add(childAt);
                    }
                }
                C786410Ut5.LJJJJZ(this.LL);
                for (C21376318l7 c21376318l7 : list) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        C21376318l7 c21376318l72 = c21376318l7;
                        C21375718l1 c21375718l1 = (C21375718l1) C19719612Di.LJJIIZI(this.LLILLJJLI);
                        if (c21375718l1 == null) {
                            c21375718l1 = new C21375718l1(getContext());
                        }
                        if (i > 0) {
                            if (C21375518kz.LIZJ) {
                                int i4 = C420670GeX.LLILLJJLI;
                                C0H9H.LJFF((c426370Gnj.LIZIZ - C420670GeX.LLILLJJLI) / 2, c21375718l1);
                            } else {
                                C0H9H.LJFF(c426370Gnj.LIZIZ, c21375718l1);
                            }
                        }
                        c21375718l1.LIZ(c21376318l72);
                        C786410Ut5.I7(new AjS5S0201000_6(this, c21375718l1, i, c21376318l72, 0), c21375718l1);
                        if (C21375518kz.LIZJ && i > 0) {
                            C426160GnO c426160GnO2 = this.LL;
                            C420670GeX c420670GeX = (C420670GeX) C19719612Di.LJJIIZI(this.LLILLL);
                            if (c420670GeX == null) {
                                c420670GeX = new C420670GeX(getContext());
                            }
                            c420670GeX.addView(c21375718l1);
                            int i5 = c426370Gnj.LIZIZ;
                            C0H9H.LJFF((i5 - C420670GeX.LLILLJJLI) / 2, c420670GeX.LL);
                            c426160GnO2.addView(c420670GeX);
                        } else {
                            this.LL.addView(c21375718l1);
                        }
                        i = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                C430110Gtl.LIZ(this.LL, new AwS407S0200000_6(this, (C430120Gtm) list, (List<C21376318l7>) 4));
                return;
            }
        }
        int visibility2 = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, this);
    }

    public final void LIZIZ(boolean z) {
        List<C21376318l7> list;
        C426370Gnj c426370Gnj = this.LLILZIL;
        if (c426370Gnj != null) {
            list = c426370Gnj.LIZ;
        } else {
            list = null;
        }
        int i = 0;
        if ((list == null || list.isEmpty()) && 1 != 0) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        } else {
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, this);
        }
    }

    public final void setListener(InterfaceC430130Gtn interfaceC430130Gtn) {
        this.LLILZ = interfaceC430130Gtn;
    }

    public C430120Gtm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C426160GnO c426160GnO = new C426160GnO(context, null, 6);
        C786410Ut5.a7(c426160GnO, new FrameLayout.LayoutParams(-1, -2));
        c426160GnO.setGravity(-1);
        c426160GnO.setMaxTagLines(1);
        this.LL = c426160GnO;
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        addView(c426160GnO);
    }
}
