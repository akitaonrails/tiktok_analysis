package X;

import Y.AAListenerS266S0200000_14;
import Y.AAListenerS325S0100000_14;
import Y.ACListenerS149S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS703S0100000_24;

/* JADX INFO: renamed from: X.0ZrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912700ZrI extends C893640Z3y {
    public final View LL;
    public final RecyclerView LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final C1578980rBw LLJI;
    public final C054G LLJIJIL;
    public Animator LLJILJIL;
    public EnumC912710ZrJ LLJILJILJ;
    public EnumC912790ZrR LLJILLL;
    public InterfaceC912720ZrK LLJJ;

    public int getLayoutId() {
        return R.layout.cqq;
    }

    @Override // X.C893640Z3y
    public final boolean LIZJ() {
        return this.LLJILJILJ == EnumC912710ZrJ.VISIBLE;
    }

    public final View getAboveMessageMask() {
        return this.LLILZ;
    }

    public final RecyclerView getActionBar() {
        return this.LLILLJJLI;
    }

    public final C1578980rBw getActionBarAdapter() {
        return this.LLJI;
    }

    public final View getActionBarContainer() {
        return this.LL;
    }

    public final View getBelowMessageMask() {
        return this.LLILZIL;
    }

    public final Animator getCurrentAnimator() {
        return this.LLJILJIL;
    }

    public final EnumC912710ZrJ getCurrentDisplayState() {
        return this.LLJILJILJ;
    }

    public final View getHorizontalMaskLayout() {
        return this.LLIZ;
    }

    public final EnumC912790ZrR getLastEntryState() {
        return this.LLJILLL;
    }

    public final View getLeftMessageMask() {
        return this.LLIZLLLIL;
    }

    public final View getMaskViewContainer() {
        return this.LLILLL;
    }

    public final View getMessageMask() {
        return this.LLILZLL;
    }

    public final InterfaceC912720ZrK getPopupCallback() {
        return this.LLJJ;
    }

    public final View getRightMessageMask() {
        return this.LLJ;
    }

    public final InterfaceC497601wk getScope() {
        return this.LLJIJIL;
    }

    @Override // X.C893640Z3y
    public final void LIZ(C0ZL0 c0zl0) {
        if (this.LLJILJILJ == EnumC912710ZrJ.VISIBLE) {
            Animator animator = this.LLJILJIL;
            if (animator != null && animator.isRunning()) {
                return;
            }
            this.LLJILJILJ = EnumC912710ZrJ.HIDDEN;
            AnimatorSet animatorSet = new AnimatorSet();
            View view = this.LL;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight()));
            animatorSet.playTogether(LIZLLL(this.LLILZ), LIZLLL(this.LLILZIL), LIZLLL(this.LLJ), LIZLLL(this.LLIZLLLIL), animatorSet2);
            animatorSet.addListener(new AAListenerS325S0100000_14(this, 0));
            animatorSet.addListener(new AAListenerS266S0200000_14(this, c0zl0, 1));
            animatorSet.addListener(new AAListenerS266S0200000_14(this, c0zl0, 0));
            animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet.setDuration(250L);
            animatorSet.start();
            this.LLJILJIL = animatorSet;
        }
    }

    public final ObjectAnimator LIZLLL(View view) {
        return ObjectAnimator.ofFloat(view, "alpha", 0.9f, 0.0f);
    }

    public final void setCurrentAnimator(Animator animator) {
        this.LLJILJIL = animator;
    }

    public final void setCurrentDisplayState(EnumC912710ZrJ enumC912710ZrJ) {
        this.LLJILJILJ = enumC912710ZrJ;
    }

    public final void setLastEntryState(EnumC912790ZrR enumC912790ZrR) {
        this.LLJILLL = enumC912790ZrR;
    }

    public final void setPopupCallback(InterfaceC912720ZrK interfaceC912720ZrK) {
        this.LLJJ = interfaceC912720ZrK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0rBw, X.19ry] */
    public C912700ZrI(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ?? r7 = new AbstractC21673619ry<C1579000rBy>(context) { // from class: X.0rBw
            public final Context LL;
            public final List<C1562980qm8<C0ZL0>> LLILLJJLI = new ArrayList();

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return ((ArrayList) this.LLILLJJLI).size();
            }

            {
                this.LL = context;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                PorterDuffColorFilter porterDuffColorFilter;
                String string;
                C1579000rBy c1579000rBy = (C1579000rBy) viewHolder;
                C1562980qm8 c1562980qm8 = (C1562980qm8) ListProtector.get(this.LLILLJJLI, i);
                Drawable background = c1579000rBy.LLILLL.getBackground();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zo, c1579000rBy.itemView.getContext());
                if (numLIZJ != null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(numLIZJ.intValue(), PorterDuff.Mode.SRC_OVER);
                } else {
                    porterDuffColorFilter = null;
                }
                background.setColorFilter(porterDuffColorFilter);
                C786410Ut5.I7(new AbS703S0100000_24(c1562980qm8, 18), c1579000rBy.itemView);
                InterfaceC1557220qcq interfaceC1557220qcq = c1562980qm8.LIZJ;
                if (Intrinsics.LJFF(interfaceC1557220qcq, C1557230qcr.LIZ)) {
                    C786410Ut5.LLLLLLZZ(c1579000rBy.LL, 8);
                } else if (interfaceC1557220qcq instanceof C1556520qbi) {
                    TuxIconView tuxIconView = c1579000rBy.LL;
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    tuxIconView.setIconRes(((C1556520qbi) interfaceC1557220qcq).LIZ);
                    tuxIconView.setTintColorRes(c1562980qm8.LJ.getTintRes());
                } else {
                    throw new C1954807lC();
                }
                TuxTextView tuxTextView = c1579000rBy.LLILLJJLI;
                InterfaceC1557210qcp interfaceC1557210qcp = c1562980qm8.LIZLLL;
                if (interfaceC1557210qcp instanceof C1556510qbh) {
                    string = c1579000rBy.itemView.getContext().getString(((C1556510qbh) interfaceC1557210qcp).LIZ);
                } else if (interfaceC1557210qcp instanceof C1555960qao) {
                    string = ((C1555960qao) interfaceC1557210qcp).LIZ;
                } else {
                    throw new C1954807lC();
                }
                tuxTextView.setText(string);
                c1579000rBy.LLILLJJLI.setTextColorRes(c1562980qm8.LJ.getTintRes());
                if (getItemCount() <= 3) {
                    View view = c1579000rBy.itemView;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        C786410Ut5.W5(view, marginLayoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C1579000rBy c1579000rBy = new C1579000rBy(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.cna, viewGroup, false));
                try {
                    View view = c1579000rBy.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1579000rBy.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1579000rBy.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1579000rBy.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1579000rBy.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1579000rBy.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1579000rBy.class.getName();
                return c1579000rBy;
            }
        };
        this.LLJI = r7;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJIJIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLJILJILJ = EnumC912710ZrJ.HIDDEN;
        C786410Ut5.Td(C786410Ut5.ne(context), getLayoutId(), this, true);
        this.LL = findViewById(R.id.nq_);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.nq9);
        this.LLILLJJLI = recyclerView;
        this.LLILLL = findViewById(R.id.nqh);
        View viewFindViewById = findViewById(R.id.nqf);
        this.LLILZ = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.nqg);
        this.LLILZIL = viewFindViewById2;
        this.LLILZLL = findViewById(R.id.nqk);
        View viewFindViewById3 = findViewById(R.id.nqe);
        this.LLIZ = viewFindViewById3;
        this.LLJ = findViewById(R.id.nqj);
        this.LLIZLLLIL = findViewById(R.id.nqi);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        recyclerView.setAdapter(r7);
        Iterator it2 = C1697810uHb.LJIIJJI(viewFindViewById, viewFindViewById2, viewFindViewById3).iterator();
        while (it2.hasNext()) {
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 64), (View) it2.next());
        }
        this.LLJILLL = EnumC912790ZrR.FROM_START;
    }
}
