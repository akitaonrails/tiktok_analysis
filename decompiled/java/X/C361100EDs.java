package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361100EDs extends AbstractC21673619ry<C361110EDt> {
    public final C0ED8 LL;
    public final Boolean LLILLJJLI;
    public C0EDA LLILZ;
    public final boolean LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLILLL = true;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(340));
    public final ArrayList<C0EDQ> LLILZLL = new ArrayList<>();
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1260));

    public final List<ResourceItem> LLLFZ() {
        ArrayList<C0EDQ> arrayList = this.LLILZLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<C0EDQ> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LIZ);
        }
        return arrayList2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.size();
    }

    public final void LLLI(ResourceItem resourceItem) {
        int i = 0;
        for (ResourceItem resourceItem2 : (ArrayList) LLLFZ()) {
            if (!Intrinsics.LJFF(resourceItem2.getEffectId(), resourceItem.getEffectId()) && !Intrinsics.LJFF(resourceItem2.getResourceId(), resourceItem.getResourceId())) {
                i++;
            } else {
                if (i >= 0) {
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        TextView textView;
        super.onViewRecycled(viewHolder);
        C361120EDu c361120EDu = this.LL.LJIIJJI;
        if (c361120EDu.LIZ && c361120EDu.LJIIJJI != null && (textView = (TextView) viewHolder.itemView.findViewById(R.id.tci)) != null) {
            textView.setText("");
            textView.requestLayout();
        }
    }

    public C361100EDs(C0ED8 c0ed8, Boolean bool) {
        this.LL = c0ed8;
        this.LLILLJJLI = bool;
        this.LLIZ = c0ed8.LJIL.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0302  */
    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLII, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C361110EDt r18, int r19) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361100EDs.onBindViewHolder(X.0EDt, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIL(X.C0EDQ r5, X.C361110EDt r6) {
        /*
            r4 = this;
            boolean r0 = r4.LLIZ
            if (r0 != 0) goto L2a
            X.01GW r0 = r4.LLILZIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto L3b
            X.0EUy r1 = r6.LLJ
            if (r1 == 0) goto L21
            int r0 = r1.getVisibility()
            r1.setVisibility(r3)
            X.C1602160rnK.LIZIZ(r0, r3, r1)
        L21:
            X.0EUy r1 = r6.LLJ
            if (r1 == 0) goto L2a
            int r0 = r5.LIZLLL
            r1.setProgress(r0)
        L2a:
            android.widget.ImageView r0 = r6.LLILZIL
            r1 = 4
            X.C786410Ut5.LJZI(r1, r0)
            com.bytedance.tux.icon.TuxIconView r0 = r6.LLILLL
            X.C786410Ut5.LLLLLLZZ(r0, r1)
            android.widget.TextView r0 = r6.LLILZLL
            X.C786410Ut5.LLIL(r0, r1)
            return
        L3b:
            X.0ED8 r0 = r4.LL
            X.0EDD r0 = r0.LJIL
            kotlin.jvm.functions.Function0<android.view.View> r0 = r0.LIZ
            if (r0 == 0) goto L60
            android.view.View r1 = r6.itemView
            r0 = 2131388461(0x7f0a682d, float:1.8397438E38)
            android.view.View r2 = r1.findViewById(r0)
            X.C786410Ut5.LJLLLLLL(r3, r2)
            X.0ED8 r0 = r4.LL
            X.0EDD r0 = r0.LJIL
            X.0EDx r1 = r0.LIZIZ
            if (r1 == 0) goto L60
            int r0 = r5.LIZLLL
            r1.LIZIZ(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L2a
        L60:
            android.widget.FrameLayout r0 = r6.LLILZ
            X.C786410Ut5.LJZ(r3, r0)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361100EDs.LLLIL(X.0EDQ, X.0EDt):void");
    }

    public final void LLLILZLLLI(C0EDQ c0edq, C361110EDt c361110EDt) {
        TextView textView;
        C361130EDv c361130EDv = this.LL.LJIIL;
        float f = 1.0f;
        if (c361130EDv.LIZ) {
            float f2 = c361130EDv.LJIIIZ;
            C383710F2r c383710F2r = c361110EDt.LL;
            if (c0edq.LJ) {
                f2 = 1.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c383710F2r);
            c383710F2r.setAlpha(f2);
        }
        C361120EDu c361120EDu = this.LL.LJIIJJI;
        if (c361120EDu.LIZ) {
            float f3 = c361120EDu.LJIIJ;
            if (c361120EDu.LJIIJJI == null || (textView = (TextView) c361110EDt.itemView.findViewById(R.id.tci)) == null) {
                textView = c361110EDt.LLILLJJLI;
            }
            if (!c0edq.LJ) {
                f = f3;
            }
            C786410Ut5.S4(f, textView);
        }
    }

    public final void LLLJIL(C0EDQ c0edq, C361110EDt c361110EDt) {
        int i;
        int iIntValue;
        C0ED8 c0ed8 = this.LL;
        C0EDU c0edu = c0ed8.LJIILLIIL;
        if (c0edu.LIZ && (i = c0edu.LJI) != 0) {
            if (c0edq.LIZJ) {
                c361110EDt.LL.setColorFilter(i);
                return;
            }
            Integer num = c0ed8.LJIIL.LJIIJJI;
            if (num != null && num.intValue() != 0) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c361110EDt.LL.setColorFilter(iIntValue);
        }
    }

    public final void LLLLII(C361110EDt c361110EDt, int i) {
        if (this.LL.LJIIJJI.LJIIJJI != null) {
            ((TextView) c361110EDt.itemView.findViewById(R.id.tci)).setTextColor(i);
        } else {
            c361110EDt.LLILLJJLI.setTextColor(i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        ViewGroup viewGroup2;
        Function0<View> function0;
        ViewGroup viewGroup3;
        ConstraintLayout constraintLayout = (ConstraintLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.byo, viewGroup, false);
        if (!this.LLIZ && (function0 = this.LL.LJIL.LIZ) != null) {
            View viewInvoke = function0.invoke();
            ViewParent parent = viewInvoke.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(viewInvoke, viewGroup3);
            }
            C361130EDv c361130EDv = this.LL.LJIIL;
            C19ME c19me = new C19ME(C390810FTz.LIZ(c361130EDv.LIZIZ), C390810FTz.LIZ(c361130EDv.LIZJ));
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
            c19me.setMarginStart(0);
            ((ViewGroup.MarginLayoutParams) c19me).leftMargin = 0;
            c19me.leftToLeft = R.id.tcn;
            c19me.topToTop = R.id.tcn;
            C786410Ut5.LJLLLLLL(4, viewInvoke);
            viewInvoke.setId(R.id.tch);
            ((ConstraintLayout) constraintLayout.findViewById(R.id.tcl)).addView(viewInvoke, -1, c19me);
        }
        if (!this.LL.LJIIL.LIZ) {
            C786410Ut5.LL(8, (ConstraintLayout) constraintLayout.findViewById(R.id.tcl));
        } else {
            C19MB c19mb = new C19MB();
            c19mb.LJII((ConstraintLayout) constraintLayout.findViewById(R.id.tcl));
            C0ED8 c0ed8 = this.LL;
            C361130EDv c361130EDv2 = c0ed8.LJIIL;
            int i3 = c361130EDv2.LIZIZ;
            int i4 = c361130EDv2.LIZJ;
            C0EDU c0edu = c0ed8.LJIILLIIL;
            int i5 = c0edu.LIZIZ;
            int i6 = c0edu.LIZJ;
            C0EDB c0edb = c0ed8.LJIILIIL;
            int i7 = c0edb.LIZIZ;
            int i8 = c0edb.LIZJ;
            LLLILZ(c19mb, R.id.tcn, i3, i4);
            LLLILZ(c19mb, R.id.tcp, i5, i6);
            LLLILZ(c19mb, R.id.tcq, i5, i6);
            LLLILZ(c19mb, R.id.tcj, i7, i8);
            if (this.LL.LJIIZILJ.LIZ) {
                LLLILZ(c19mb, R.id.tcg, 16, 16);
            }
            C0EDB c0edb2 = this.LL.LJIILIIL;
            int i9 = c0edb2.LJI;
            int i10 = (i3 - i7) + i9;
            int i11 = (i4 - i8) + i9;
            int i12 = (i3 - 16) + 8;
            int i13 = (i4 - 16) + 8;
            int i14 = C361060EDo.LIZ[c0edb2.LJFF.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    int iLIZ = C390810FTz.LIZ(i10);
                    i2 = R.id.tcn;
                    c19mb.LJIIIZ(R.id.tcj, 6, R.id.tcn, 6, iLIZ);
                    c19mb.LJIIIZ(R.id.tcj, 4, R.id.tcn, 4, C390810FTz.LIZ(-this.LL.LJIILIIL.LJI));
                } else {
                    throw new C1954807lC();
                }
            } else {
                int iLIZ2 = C390810FTz.LIZ(i10);
                i2 = R.id.tcn;
                c19mb.LJIIIZ(R.id.tcj, 6, R.id.tcn, 6, iLIZ2);
                c19mb.LJIIIZ(R.id.tcj, 4, R.id.tcn, 4, C390810FTz.LIZ(i11));
            }
            if (this.LL.LJIIZILJ.LIZ) {
                c19mb.LJIIIZ(R.id.tcg, 6, i2, 6, C390810FTz.LIZ(i12));
                c19mb.LJIIIZ(R.id.tcg, 4, i2, 4, C390810FTz.LIZ(i13));
            }
            c19mb.LIZIZ((ConstraintLayout) constraintLayout.findViewById(R.id.tcl));
            C383710F2r c383710F2r = (C383710F2r) constraintLayout.findViewById(i2);
            Integer num = this.LL.LJIIL.LJ;
            if (num != null) {
                c383710F2r.setBGColor(num.intValue());
            }
            c383710F2r.setCornerRadius(C390810FTz.LIZ(r3.LIZLLL));
        }
        C19MB c19mb2 = new C19MB();
        c19mb2.LJII(constraintLayout);
        LLLILZ(c19mb2, R.id.tcl, ((Number) ((Pair) this.LLJI.getValue()).getFirst()).intValue(), ((Number) ((Pair) this.LLJI.getValue()).getSecond()).intValue());
        c19mb2.LIZIZ(constraintLayout);
        C361120EDu c361120EDu = this.LL.LJIIJJI;
        if (c361120EDu.LIZ) {
            if (c361120EDu.LJIIJJI != null) {
                C786410Ut5.LLIL((TextView) constraintLayout.findViewById(R.id.tcr), 8);
                Function0<TextView> function02 = this.LL.LJIIJJI.LJIIJJI;
                if (function02 != null) {
                    TextView textViewInvoke = function02.invoke();
                    int iIntValue = ((Number) ((Pair) this.LLJI.getValue()).getFirst()).intValue();
                    int i15 = this.LL.LJIIJJI.LJIIIIZZ;
                    ViewParent parent2 = textViewInvoke.getParent();
                    if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                        C786410Ut5.LJJJLZIJ(textViewInvoke, viewGroup2);
                    }
                    C19ME c19me2 = new C19ME(C390810FTz.LIZ(iIntValue), C390810FTz.LIZ(i15));
                    ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C390810FTz.LIZ(this.LL.LJIIJJI.LJII);
                    c19me2.leftToLeft = R.layout.byo;
                    c19me2.rightToRight = R.layout.byo;
                    c19me2.topToBottom = R.id.tcl;
                    c19me2.bottomToBottom = R.layout.byo;
                    textViewInvoke.setGravity(1);
                    textViewInvoke.setId(R.id.tci);
                    constraintLayout.addView(textViewInvoke, -1, c19me2);
                    if (this.LL.LJIIJJI.LJ == C0EE1.DOWN) {
                        C19MB c19mb3 = new C19MB();
                        c19mb3.LJII(constraintLayout);
                        c19mb3.LJIIIZ(R.id.tcl, 3, R.layout.byo, 3, 0);
                        c19mb3.LIZIZ(constraintLayout);
                    }
                }
            } else {
                C786410Ut5.LLIL((TextView) constraintLayout.findViewById(R.id.tcr), 0);
                ((TextView) constraintLayout.findViewById(R.id.tcr)).setTextSize(this.LL.LJIIJJI.LJI);
                if (this.LL.LJIIJJI.LJ == C0EE1.DOWN) {
                    C19MB c19mb4 = new C19MB();
                    c19mb4.LJII(constraintLayout);
                    c19mb4.LJIIIZ(R.id.tcl, 3, R.layout.byo, 3, 0);
                    c19mb4.LJIIIZ(R.id.tcr, 3, R.id.tcl, 4, C390810FTz.LIZ(this.LL.LJIIJJI.LJII));
                    c19mb4.LIZIZ(constraintLayout);
                }
            }
        } else {
            C19MB c19mb5 = new C19MB();
            c19mb5.LJII(constraintLayout);
            c19mb5.LJIIIZ(R.id.tcl, 3, R.layout.byo, 3, 0);
            c19mb5.LIZIZ(constraintLayout);
            C786410Ut5.LLIL((TextView) constraintLayout.findViewById(R.id.tcr), 8);
        }
        if (this.LL.LJIILIIL.LIZ) {
            C786410Ut5.LJZI(0, (ImageView) constraintLayout.findViewById(R.id.tcj));
            ((ImageView) constraintLayout.findViewById(R.id.tcj)).setImageResource(this.LL.LJIILIIL.LIZLLL);
        } else {
            C786410Ut5.LJZI(4, (ImageView) constraintLayout.findViewById(R.id.tcj));
        }
        if (this.LL.LJIILJJIL.LIZ) {
            C786410Ut5.LJZ(0, (FrameLayout) constraintLayout.findViewById(R.id.tco));
            constraintLayout.findViewById(R.id.tco).setBackgroundResource(this.LL.LJIILJJIL.LIZJ);
            ((C1295960jpS) constraintLayout.findViewById(R.id.tcs)).setAnimation(this.LL.LJIILJJIL.LIZIZ);
        } else {
            C786410Ut5.LJZ(4, (FrameLayout) constraintLayout.findViewById(R.id.tco));
        }
        if (this.LL.LJIILL.LIZ) {
            C19MB c19mb6 = new C19MB();
            c19mb6.LJII(constraintLayout);
            c19mb6.LJIIIZ(R.id.dte, 3, R.layout.byo, 3, 0);
            c19mb6.LJIIIZ(R.id.tcl, 3, R.id.dte, 4, C390810FTz.LIZ(4.0f));
            c19mb6.LIZIZ(constraintLayout);
            View viewFindViewById = constraintLayout.findViewById(R.id.dte);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(4, viewFindViewById);
                Integer num2 = this.LL.LJIILL.LIZIZ;
                if (num2 != null) {
                    viewFindViewById.setBackgroundResource(num2.intValue());
                }
            }
        } else {
            C786410Ut5.LJLLLLLL(8, constraintLayout.findViewById(R.id.dte));
        }
        C361110EDt c361110EDt = new C361110EDt(constraintLayout);
        try {
            View view = c361110EDt.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c361110EDt.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c361110EDt.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C361110EDt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup4 = (ViewGroup) c361110EDt.itemView.getParent();
                    if (viewGroup4 != null) {
                        C786410Ut5.LJJJLZIJ(c361110EDt.itemView, viewGroup4);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C361110EDt.class.getName();
        return c361110EDt;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIIIIL(X.C361110EDt r4, X.C0EDQ r5, int r6) {
        /*
            r3 = this;
            boolean r0 = r3.LLIZ
            if (r0 != 0) goto L27
            X.01GW r0 = r3.LLILZIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 4
            if (r0 == 0) goto L2b
            X.0EUy r1 = r4.LLJ
            if (r1 == 0) goto L21
            int r0 = r1.getVisibility()
            r1.setVisibility(r2)
            X.C1602160rnK.LIZIZ(r0, r2, r1)
        L21:
            android.widget.ImageView r1 = r4.LLILZIL
            r0 = 0
            X.C786410Ut5.LJZI(r0, r1)
        L27:
            r3.LLLJL(r5, r4, r6)
            return
        L2b:
            X.0ED8 r0 = r3.LL
            X.0EDD r0 = r0.LJIL
            kotlin.jvm.functions.Function0<android.view.View> r0 = r0.LIZ
            if (r0 == 0) goto L4e
            android.view.View r1 = r4.itemView
            r0 = 2131388461(0x7f0a682d, float:1.8397438E38)
            android.view.View r0 = r1.findViewById(r0)
            X.C786410Ut5.LJLLLLLL(r2, r0)
            X.0ED8 r0 = r3.LL
            X.0EDD r0 = r0.LJIL
            X.0EDx r0 = r0.LIZIZ
            if (r0 == 0) goto L4e
            r0.LIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L27
        L4e:
            android.widget.FrameLayout r0 = r4.LLILZ
            X.C786410Ut5.LJZ(r2, r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361100EDs.LLLIIIIL(X.0EDt, X.0EDQ, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIILIL(X.C361110EDt r4, X.C0EDQ r5, int r6) {
        /*
            r3 = this;
            boolean r0 = r3.LLIZ
            r2 = 4
            if (r0 != 0) goto L2a
            X.01GW r0 = r3.LLILZIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
            X.0EUy r1 = r4.LLJ
            if (r1 == 0) goto L1c
            r0 = 100
            r1.setProgress(r0)
        L1c:
            X.0EUy r1 = r4.LLJ
            if (r1 == 0) goto L2a
            int r0 = r1.getVisibility()
            r1.setVisibility(r2)
            X.C1602160rnK.LIZIZ(r0, r2, r1)
        L2a:
            android.widget.ImageView r0 = r4.LLILZIL
            X.C786410Ut5.LJZI(r2, r0)
            r3.LLLL(r5, r4, r6)
            return
        L33:
            X.0ED8 r0 = r3.LL
            X.0EDD r0 = r0.LJIL
            kotlin.jvm.functions.Function0<android.view.View> r0 = r0.LIZ
            if (r0 == 0) goto L56
            android.view.View r1 = r4.itemView
            r0 = 2131388461(0x7f0a682d, float:1.8397438E38)
            android.view.View r1 = r1.findViewById(r0)
            X.C786410Ut5.LJLLLLLL(r2, r1)
            X.0ED8 r0 = r3.LL
            X.0EDD r0 = r0.LJIL
            X.0EDx r0 = r0.LIZIZ
            if (r0 == 0) goto L56
            r0.LIZJ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L2a
        L56:
            android.widget.FrameLayout r0 = r4.LLILZ
            X.C786410Ut5.LJZ(r2, r0)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361100EDs.LLLIILIL(X.0EDt, X.0EDQ, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJ(X.C0EDQ r7, X.C361110EDt r8, int r9) {
        /*
            r6 = this;
            com.bytedance.tux.icon.TuxIconView r2 = r8.LLILLL
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = r7.LIZ
            java.lang.String r0 = r0.extra
            r3 = 0
            if (r0 == 0) goto L3c
            java.util.List r0 = X.C351220Dpo.LJJJJIZL(r0)
            if (r0 == 0) goto L57
            java.util.Iterator r5 = r0.iterator()
        L13:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r4 = r5.next()
            r0 = r4
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r0 = "Filter_intensity"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L13
        L2c:
            kotlin.Pair r4 = (kotlin.Pair) r4
            if (r4 == 0) goto L57
            java.lang.Object r0 = r4.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L57
        L3c:
            r2.setTuxIcon(r3)
            X.0ED8 r3 = r6.LL
            X.0EDw r2 = r3.LJIIJ
            boolean r0 = r2.LIZ
            if (r0 == 0) goto L8c
            if (r9 != 0) goto L8c
            boolean r0 = r2.LJFF
            if (r0 != 0) goto L8c
            com.bytedance.tux.icon.TuxIconView r1 = r8.LLILLL
            int r0 = r2.LJI
            r1.setBackgroundResource(r0)
            return
        L55:
            r4 = r3
            goto L2c
        L57:
            X.0GdJ r3 = new X.0GdJ
            r3.<init>()
            X.0ED8 r0 = r6.LL
            X.0EDU r0 = r0.LJIILLIIL
            int r0 = r0.LJ
            r3.LIZ = r0
            r1 = 26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r3.LIZIZ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r3.LIZJ = r0
            r0 = 2131099768(0x7f060078, float:1.7811899E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.LJ = r0
            goto L3c
        L8c:
            com.bytedance.tux.icon.TuxIconView r1 = r8.LLILLL
            X.0EDU r0 = r3.LJIILLIIL
            int r0 = r0.LIZLLL
            r1.setBackgroundResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361100EDs.LLLJ(X.0EDQ, X.0EDt, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJL(X.C0EDQ r10, X.C361110EDt r11, int r12) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361100EDs.LLLJL(X.0EDQ, X.0EDt, int):void");
    }

    public final void LLLL(C0EDQ c0edq, C361110EDt c361110EDt, int i) {
        if (c0edq.LIZJ) {
            LLLJ(c0edq, c361110EDt, i);
            if (this.LL.LJIILLIIL.LIZ) {
                C786410Ut5.LLLLLLZZ(c361110EDt.LLILLL, 0);
                C361120EDu c361120EDu = this.LL.LJIIJJI;
                if (c361120EDu.LIZ) {
                    LLLLII(c361110EDt, c361120EDu.LIZLLL);
                    C361120EDu c361120EDu2 = this.LL.LJIIJJI;
                    Function1<TextView, Unit> function1 = c361120EDu2.LJIIL;
                    if (function1 != null && c361120EDu2.LJIIJJI != null) {
                        function1.invoke((TextView) c361110EDt.itemView.findViewById(R.id.tci));
                    }
                }
            }
            if (!TextUtils.isEmpty(this.LL.LJIILLIIL.LJFF)) {
                C786410Ut5.LLIL(c361110EDt.LLILZLL, 0);
                c361110EDt.LLILZLL.setText(this.LL.LJIILLIIL.LJFF);
                return;
            }
            return;
        }
        C786410Ut5.LLLLLLZZ(c361110EDt.LLILLL, 4);
        C786410Ut5.LLIL(c361110EDt.LLILZLL, 4);
        C361120EDu c361120EDu3 = this.LL.LJIIJJI;
        if (!c361120EDu3.LIZ) {
            return;
        }
        LLLLII(c361110EDt, c361120EDu3.LIZJ);
        C361120EDu c361120EDu4 = this.LL.LJIIJJI;
        Function1<TextView, Unit> function12 = c361120EDu4.LJIILIIL;
        if (function12 == null || c361120EDu4.LJIIJJI == null) {
            return;
        }
        function12.invoke((TextView) c361110EDt.itemView.findViewById(R.id.tci));
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0015, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361100EDs.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List):void");
    }

    public static void LLLILZ(C19MB c19mb, int i, int i2, int i3) {
        c19mb.LJIILL(i, C390810FTz.LIZ(i2));
        c19mb.LJIIJJI(i, C390810FTz.LIZ(i3));
    }
}
