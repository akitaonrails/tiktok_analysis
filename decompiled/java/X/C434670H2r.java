package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0H2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434670H2r extends AbstractC21673619ry<C0H44> {
    public final Context LL;
    public final RecyclerView LLILLJJLI;
    public final float LLILLL;
    public Function2<? super String, ? super Integer, Unit> LLILZ;
    public Function2<? super String, ? super Integer, Unit> LLILZIL;
    public Fragment LLILZLL;
    public final ColorStateList LLIZ;
    public final StateListDrawable LLIZLLLIL;
    public int LLJ;
    public final ArrayList<String> LLJI;
    public final C444890HcV LLJIJIL;
    public final int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJI.size();
    }

    public final void LLLFZ(int i) {
        int i2 = this.LLJ;
        if (i2 >= 0) {
            notifyItemChanged(i2, C1697810uHb.LJIILJJIL(Boolean.FALSE));
        }
        this.LLJ = i;
        notifyItemChanged(i, C1697810uHb.LJIILJJIL(Boolean.TRUE));
        this.LLILLJJLI.smoothScrollToPosition(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        viewHolder.getBindingAdapterPosition();
    }

    public C434670H2r(Context context, RecyclerView recyclerView) {
        this.LL = context;
        this.LLILLJJLI = recyclerView;
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25));
        this.LLILLL = fLIZIZ;
        int[][] iArr = {new int[]{R.attr.state_selected}, new int[0]};
        int[] iArr2 = new int[2];
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a1h, context);
        if (numLIZJ != null) {
            iArr2[0] = numLIZJ.intValue();
            Integer numLIZJ2 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a1k, context);
            if (numLIZJ2 != null) {
                iArr2[1] = numLIZJ2.intValue();
                this.LLIZ = new ColorStateList(iArr, iArr2);
                StateListDrawable stateListDrawable = new StateListDrawable();
                int[] iArr3 = {R.attr.state_selected};
                C384050F3z c384050F3z = new C384050F3z();
                Integer numLIZJ3 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a0o, context);
                if (numLIZJ3 != null) {
                    c384050F3z.LIZ = numLIZJ3;
                    c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
                    Integer numLIZJ4 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a00, context);
                    if (numLIZJ4 != null) {
                        c384050F3z.LJ = numLIZJ4;
                        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(TypedValue.applyDimension(1, (float) 1.5d, Resources.getSystem().getDisplayMetrics())));
                        stateListDrawable.addState(iArr3, c384050F3z.LIZ(context));
                        int[] iArr4 = new int[0];
                        C384050F3z c384050F3z2 = new C384050F3z();
                        Integer numLIZJ5 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a0o, context);
                        if (numLIZJ5 != null) {
                            c384050F3z2.LIZ = numLIZJ5;
                            c384050F3z2.LIZJ = Float.valueOf(fLIZIZ);
                            stateListDrawable.addState(iArr4, c384050F3z2.LIZ(context));
                            this.LLIZLLLIL = stateListDrawable;
                            this.LLJI = new ArrayList<>();
                            C444890HcV c444890HcV = new C444890HcV();
                            c444890HcV.LIZ(62);
                            this.LLJIJIL = c444890HcV;
                            this.LLJILJIL = C12ES.LJIIJ(context);
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLI, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C0H44 c0h44, final int i) {
        boolean z;
        final String str = (String) C13LP.LJJJLZIJ(i, this.LLJI);
        if (str == null) {
            return;
        }
        c0h44.LLILLL = i;
        c0h44.LLILZ = str;
        final TuxTextView tuxTextView = c0h44.LL;
        if (i == this.LLJ) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        tuxTextView.setText(str);
        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0Gm9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (C0OBG.LIZIZ(view) || tuxTextView.isSelected()) {
                    return;
                }
                C434670H2r c434670H2r = this;
                if (c434670H2r.LLJILLL) {
                    return;
                }
                c434670H2r.LLLFZ(i);
                Function2<? super String, ? super Integer, Unit> function2 = this.LLILZ;
                if (function2 != null) {
                    function2.invoke(str, Integer.valueOf(i));
                }
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Drawable drawableMutate;
        Drawable.ConstantState constantState;
        Drawable drawableNewDrawable = null;
        TuxTextView tuxTextView = new TuxTextView(this.LL, null, 6, 0);
        tuxTextView.setTuxFont(52);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + (this.LLJILJILJ / 2), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + (this.LLJILJILJ / 2), 0);
        tuxTextView.setGravity(17);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        tuxTextView.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        tuxTextView.setClickable(true);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62)));
        C427690Gpr.LJ(tuxTextView, this.LLILLL);
        StateListDrawable stateListDrawable = this.LLIZLLLIL;
        if (stateListDrawable != null && (drawableMutate = stateListDrawable.mutate()) != null && (constantState = drawableMutate.getConstantState()) != null) {
            drawableNewDrawable = constantState.newDrawable();
        }
        tuxTextView.setBackground(drawableNewDrawable);
        tuxTextView.setTextColor(this.LLIZ);
        C0H44 c0h44 = new C0H44(tuxTextView, this.LLILZLL, this.LLILZIL);
        try {
            View view = c0h44.itemView;
            if (view != null) {
                view.setTag(com.zhiliaoapp.musically.R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h44.itemView.setTag(com.zhiliaoapp.musically.R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h44.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H44.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h44.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h44.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H44.class.getName();
        return c0h44;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        Boolean bool;
        C0H44 c0h44 = (C0H44) viewHolder;
        Object objLJJJLL = C13LP.LJJJLL(list);
        if ((objLJJJLL instanceof Boolean) && (bool = (Boolean) objLJJJLL) != null) {
            c0h44.LL.setSelected(bool.booleanValue());
        } else {
            onBindViewHolder(c0h44, i);
        }
    }
}
