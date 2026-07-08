package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19UQ extends AbstractC21673619ry<C19UY> {
    public final ArrayList<C19UL> LL = new ArrayList<>();
    public C21548219Uq LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ C19U6 LLILZ;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    public final void LLLFZ() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        this.LL.clear();
        this.LL.add(new C19UL() { // from class: X.19UI
        });
        int size = this.LLILZ.LLILLL.LJIIJJI().size();
        boolean z = false;
        int i = -1;
        int i2 = 0;
        boolean z2 = false;
        int size2 = 0;
        while (i2 < size) {
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(this.LLILZ.LLILLL.LJIIJJI(), i2);
            if (c21548219Uq.isChecked()) {
                LLLI(c21548219Uq);
            }
            if (c21548219Uq.isCheckable()) {
                c21548219Uq.LJI(z);
            }
            if (c21548219Uq.hasSubMenu()) {
                SubMenuC21548419Us subMenuC21548419Us = c21548219Uq.LJIILJJIL;
                if (subMenuC21548419Us.hasVisibleItems()) {
                    if (i2 != 0) {
                        this.LL.add(new C19UW(this.LLILZ.LLJJIJIIJIL, z ? 1 : 0));
                    }
                    this.LL.add(new C19UH(c21548219Uq));
                    int size3 = subMenuC21548419Us.size();
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < size3) {
                        C21548219Uq c21548219Uq2 = (C21548219Uq) subMenuC21548419Us.getItem(i3);
                        if (c21548219Uq2.isVisible()) {
                            if (!z3 && c21548219Uq2.getIcon() != null) {
                                z3 = true;
                            }
                            if (c21548219Uq2.isCheckable()) {
                                c21548219Uq2.LJI(z);
                            }
                            if (c21548219Uq.isChecked()) {
                                LLLI(c21548219Uq);
                            }
                            this.LL.add(new C19UH(c21548219Uq2));
                        }
                        i3++;
                        z = false;
                    }
                    if (z3) {
                        int size4 = this.LL.size();
                        for (int size5 = this.LL.size(); size5 < size4; size5++) {
                            ((C19UH) ListProtector.get(this.LL, size5)).LIZIZ = true;
                        }
                    }
                }
            } else {
                int i4 = c21548219Uq.LIZIZ;
                if (i4 != i) {
                    size2 = this.LL.size();
                    z2 = c21548219Uq.getIcon() != null;
                    if (i2 != 0) {
                        size2++;
                        ArrayList<C19UL> arrayList = this.LL;
                        int i5 = this.LLILZ.LLJJIJIIJIL;
                        arrayList.add(new C19UW(i5, i5));
                    }
                } else if (!z2 && c21548219Uq.getIcon() != null) {
                    int size6 = this.LL.size();
                    for (int i6 = size2; i6 < size6; i6++) {
                        ((C19UH) ListProtector.get(this.LL, i6)).LIZIZ = true;
                    }
                    z2 = true;
                }
                C19UH c19uh = new C19UH(c21548219Uq);
                c19uh.LIZIZ = z2;
                this.LL.add(c19uh);
                i = i4;
            }
            i2++;
            z = false;
        }
        this.LLILLL = z;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C19UQ(C19U6 c19u6) {
        this.LLILZ = c19u6;
        LLLFZ();
    }

    public final void LLLI(C21548219Uq c21548219Uq) {
        if (this.LLILLJJLI != c21548219Uq && c21548219Uq.isCheckable()) {
            C21548219Uq c21548219Uq2 = this.LLILLJJLI;
            if (c21548219Uq2 != null) {
                c21548219Uq2.setChecked(false);
            }
            this.LLILLJJLI = c21548219Uq;
            c21548219Uq.setChecked(true);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C19UL c19ul = (C19UL) ListProtector.get(this.LL, i);
        if (c19ul instanceof C19UW) {
            return 2;
        }
        if (c19ul instanceof C19UI) {
            return 3;
        }
        if (c19ul instanceof C19UH) {
            if (((C19UH) c19ul).LIZ.hasSubMenu()) {
                return 1;
            }
            return 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C19UR) {
            C19UP c19up = (C19UP) viewHolder.itemView;
            FrameLayout frameLayout = c19up.LLJJL;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            c19up.LLJJJJLIIL.setCompoundDrawables(null, null, null, null);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Drawable drawableNewDrawable;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    C19UW c19uw = (C19UW) ListProtector.get(this.LL, i);
                    viewHolder.itemView.setPadding(0, c19uw.LIZ, 0, c19uw.LIZIZ);
                    return;
                }
                return;
            }
            ((TextView) viewHolder.itemView).setText(((C19UH) ListProtector.get(this.LL, i)).LIZ.LJ);
            return;
        }
        C19UP c19up = (C19UP) viewHolder.itemView;
        c19up.setIconTintList(this.LLILZ.LLJI);
        C19U6 c19u6 = this.LLILZ;
        if (c19u6.LLIZLLLIL) {
            c19up.setTextAppearance(c19u6.LLIZ);
        }
        ColorStateList colorStateList = this.LLILZ.LLJ;
        if (colorStateList != null) {
            c19up.setTextColor(colorStateList);
        }
        Drawable drawable = this.LLILZ.LLJIJIL;
        if (drawable != null) {
            drawableNewDrawable = drawable.getConstantState().newDrawable();
        } else {
            drawableNewDrawable = null;
        }
        c19up.setBackground(drawableNewDrawable);
        C19UH c19uh = (C19UH) ListProtector.get(this.LL, i);
        c19up.setNeedsEmptyIcon(c19uh.LIZIZ);
        c19up.setHorizontalPadding(this.LLILZ.LLJILJIL);
        c19up.setIconPadding(this.LLILZ.LLJILJILJ);
        C19U6 c19u62 = this.LLILZ;
        if (c19u62.LLJJ) {
            c19up.setIconSize(c19u62.LLJILLL);
        }
        c19up.setMaxLines(this.LLILZ.LLJJIII);
        c19up.LJIIJJI(c19uh.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:(2:5|(2:7|(7:9|10|36|20|(3:38|22|(3:24|27|(1:29)))|32|33)(1:11))(1:12))(1:13))(1:14)|34|15|(1:17)|10|36|20|(0)|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C2081408Dk.LIZ(r0);
        X.C2344809Gs.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(final android.view.ViewGroup r7, int r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19UQ.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
