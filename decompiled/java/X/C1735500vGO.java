package X;

import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.interest.model.InterestTag;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1735500vGO extends LinearLayout {
    public C20632315oP LL;
    public C421980Gge LLILLJJLI;
    public C197039127h LLILLL;
    public List<InterestTag> LLILZ;
    public Function2<? super String, ? super Boolean, Unit> LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;
    public boolean LLIZ;
    public C1722030uuf LLIZLLLIL;
    public C1775700wJE LLJ;
    public Function1<? super Integer, Unit> LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0uuf, X.19ry] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() {
        List<InterestTag> list;
        C20632315oP c20632315oP = this.LL;
        if (c20632315oP == 0 || (list = this.LLILZ) == null) {
            return;
        }
        int i = this.LLJIJIL * 2;
        if (i < 1) {
            i = 1;
        }
        List listLJJJIL = C13LP.LJJJIL(list, i);
        C421980Gge c421980Gge = this.LLILLJJLI;
        if (c421980Gge != null) {
            c421980Gge.setCount(listLJJJIL.size());
        }
        C421980Gge c421980Gge2 = this.LLILLJJLI;
        int i2 = 0;
        if (c421980Gge2 != null) {
            c421980Gge2.setSelectedIndex(0);
        }
        final int i3 = this.LLJIJIL;
        final boolean z = this.LLIZ;
        final AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26(this, 41);
        ?? r4 = new AbstractC2172971A2l<C1722050uuh, C1722010uud>(i3, awS640S0100000_26, z) { // from class: X.0uuf
            public final int LLILLJJLI;
            public final int LLILLL;
            public final boolean LLILZ;
            public final Function2<String, Boolean, Unit> LLILZIL;

            @Override // X.AbstractC2172971A2l, X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.LJFF.size();
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
                C1722010uud c1722010uud = (C1722010uud) viewHolder;
                List<InterestTag> list2 = ((C1722050uuh) ListProtector.get(this.LL.LJFF, i4)).LIZIZ;
                GridLayout gridLayout = c1722010uud.LLILZLL;
                if (gridLayout != null) {
                    C786410Ut5.LJJJJJ(gridLayout);
                }
                int i5 = c1722010uud.LL * c1722010uud.LLILLJJLI;
                int size = list2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    c1722010uud.I5(i6, c1722010uud.LL, (InterestTag) C13LP.LJJJLZIJ(i6, list2), false);
                }
                if (list2.size() < i5) {
                    for (int size2 = list2.size(); size2 < i5; size2++) {
                        c1722010uud.I5(size2, c1722010uud.LL, new InterestTag("fake", "", null), true);
                    }
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
                int i5 = C1722010uud.LLIZ;
                int i6 = this.LLILLJJLI;
                int i7 = this.LLILLL;
                boolean z2 = this.LLILZ;
                C1722010uud c1722010uud = new C1722010uud(i6, i7, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b7l, viewGroup, false), this.LLILZIL, z2);
                try {
                    View view = c1722010uud.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1722010uud.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1722010uud.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1722010uud.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i4);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1722010uud.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1722010uud.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1722010uud.class.getName();
                return c1722010uud;
            }

            {
                super(new AbstractC339510DSr<C1722050uuh>() { // from class: X.0uug
                    @Override // X.AbstractC339510DSr
                    public final boolean LIZ(C1722050uuh c1722050uuh, C1722050uuh c1722050uuh2) {
                        return Intrinsics.LJFF(c1722050uuh.LIZIZ, c1722050uuh2.LIZIZ);
                    }

                    @Override // X.AbstractC339510DSr
                    public final boolean LIZIZ(C1722050uuh c1722050uuh, C1722050uuh c1722050uuh2) {
                        if (c1722050uuh.LIZ == c1722050uuh2.LIZ) {
                            return true;
                        }
                        return false;
                    }
                });
                this.LLILLJJLI = i3;
                this.LLILLL = 2;
                this.LLILZ = z;
                this.LLILZIL = awS640S0100000_26;
            }
        };
        this.LLIZLLLIL = r4;
        c20632315oP.setAdapter(r4);
        C1775700wJE c1775700wJE = new C1775700wJE(this, 2);
        this.LLJ = c1775700wJE;
        c20632315oP.LIZIZ(c1775700wJE);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJIL, 10));
        for (Object obj : listLJJJIL) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(new C1722050uuh(i2, (List) obj));
            i2 = i4;
        }
        C1722030uuf c1722030uuf = this.LLIZLLLIL;
        if (c1722030uuf != null) {
            c1722030uuf.LLLI(arrayList);
        }
    }

    public final List<InterestTag> getSelectedTags() {
        List<InterestTag> list = this.LLILZ;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (InterestTag interestTag : list) {
            if (Intrinsics.LJFF(interestTag.selected, Boolean.TRUE)) {
                arrayList.add(interestTag);
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C20632315oP c20632315oP;
        super.onDetachedFromWindow();
        C1775700wJE c1775700wJE = this.LLJ;
        if (c1775700wJE != null && (c20632315oP = this.LL) != null) {
            c20632315oP.LJI(c1775700wJE);
        }
        this.LLJ = null;
        this.LLIZLLLIL = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void setCurrentIndex(int i) {
        C421980Gge c421980Gge = this.LLILLJJLI;
        if (c421980Gge != null) {
            c421980Gge.setSelectedIndex(i);
        }
        C20632315oP c20632315oP = this.LL;
        if (c20632315oP != null) {
            c20632315oP.LJ(i, false);
        }
    }

    public final void setInterestTags(List<InterestTag> list) {
        this.LLILZ = list;
        LIZ();
        requestLayout();
    }

    public final void setOnSubmitListener(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setOnTagSelectListener(Function2<? super String, ? super Boolean, Unit> function2) {
        this.LLILZIL = function2;
    }

    public final void setPageIndexListener(Function1<? super Integer, Unit> function1) {
        this.LLJI = function1;
    }

    public C1735500vGO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJIJIL = 1;
        setOrientation(1);
        C20632315oP c20632315oP = new C20632315oP(getContext());
        c20632315oP.setId(LinearLayout.generateViewId());
        C786410Ut5.r6(c20632315oP, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280))));
        this.LL = c20632315oP;
        C421980Gge c421980Gge = new C421980Gge(getContext());
        c421980Gge.setId(LinearLayout.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams.gravity = 1;
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421980Gge);
        c421980Gge.setLayoutParams(layoutParams);
        this.LLILLJJLI = c421980Gge;
        AttributeSet attributeSet2 = null;
        C197039127h c197039127h = new C197039127h(getContext(), attributeSet2, 4, 0);
        c197039127h.setId(LinearLayout.generateViewId());
        c197039127h.setText(c197039127h.getContext().getString(2131836208));
        C786410Ut5.J6(c197039127h, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(iLIZIZ2), null, false, 24);
        c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 482));
        this.LLILLL = c197039127h;
        addView(this.LL);
        addView(this.LLILLJJLI);
        addView(this.LLILLL);
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS160S0100000_26(this, 45));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        C20632315oP c20632315oP = this.LL;
        C421980Gge c421980Gge = this.LLILLJJLI;
        C197039127h c197039127h = this.LLILLL;
        if (c20632315oP != null && c421980Gge != null && c197039127h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != 0 && size != 0) {
                if (this.LLJILJIL) {
                    super.onMeasure(i, i2);
                    return;
                }
                super.onMeasure(i, i2);
                int measuredHeight = getMeasuredHeight();
                if (measuredHeight == 0) {
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c421980Gge.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c197039127h.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) c20632315oP.getLayoutParams();
                int measuredHeight2 = c421980Gge.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int paddingTop = (((measuredHeight - getPaddingTop()) - getPaddingBottom()) - measuredHeight2) - ((c197039127h.getMeasuredHeight() + marginLayoutParams2.topMargin) + marginLayoutParams2.bottomMargin);
                if (paddingTop < 0) {
                    paddingTop = 0;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int i3 = iLIZIZ + 0;
                int i4 = (iLIZIZ * 5) + (iLIZIZ2 * 4);
                if (paddingTop < i3) {
                    paddingTop = i3;
                }
                if (paddingTop > i4) {
                    paddingTop = i4;
                }
                int i5 = marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                int i6 = paddingTop - i5;
                int i7 = i3 - i5;
                if (i6 < i7) {
                    i6 = i7;
                }
                int i8 = i4 - i5;
                if (i6 > i8) {
                    i6 = i8;
                }
                int i9 = iLIZIZ + iLIZIZ2;
                int iLJ = C13LZ.LJ(i6 / i9, 1, 5);
                int i10 = i9 * iLJ;
                int i11 = marginLayoutParams3.height;
                int i12 = this.LLJIJIL;
                if (i11 == i10 && i12 == iLJ) {
                    return;
                }
                if (this.LLILZ != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (i12 != iLJ) {
                    this.LLJIJIL = iLJ;
                    if (z) {
                        LIZ();
                    }
                }
                marginLayoutParams3.height = i10;
                C786410Ut5.r6(c20632315oP, marginLayoutParams3);
                this.LLJILJIL = true;
                super.onMeasure(i, i2);
                this.LLJILJIL = false;
                return;
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }
}
