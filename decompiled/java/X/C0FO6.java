package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS77S0100000_5;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS132S0201000_5;
import kotlin.jvm.internal.AwS654S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FO6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FO6 extends AbstractC2172971A2l<C0FO3, C0FO7> {
    public final InterfaceC1631620sYq<C0FO3, Integer, Boolean, Unit> LLILLJJLI;
    public RecyclerView LLILLL;

    public final void LLLIIIIL() {
        Iterator it2 = this.LL.LJFF.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((C0FO3) it2.next()).LIZIZ.LIZ == C0FOA.SELECTED) {
                if (i != -1) {
                    ((C0FO3) ListProtector.get(this.LL.LJFF, i)).LIZIZ.LIZ = C0FOA.IDEL;
                    notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public C0FO6(AwS654S0100000_5 awS654S0100000_5) {
        super(new AbstractC339510DSr<C0FO3>() { // from class: X.0FO5
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C0FO3 c0fo3, C0FO3 c0fo32) {
                return Intrinsics.LJFF(c0fo3, c0fo32);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C0FO3 c0fo3, C0FO3 c0fo32) {
                return Intrinsics.LJFF(c0fo3.LIZ.getResourceId(), c0fo32.LIZ.getResourceId());
            }
        });
        this.LLILLJJLI = awS654S0100000_5;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILLL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILLL = null;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C0FO7 c0fo7 = (C0FO7) viewHolder;
        super.onViewAttachedToWindow(c0fo7);
        c0fo7.S5();
        if (c0fo7.LLJILJIL == C0FOA.SELECTED) {
            c0fo7.T5(c0fo7.LLJIJIL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C0FO7 c0fo7 = (C0FO7) viewHolder;
        c0fo7.S5();
        super.onViewDetachedFromWindow(c0fo7);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0FO7 c0fo7 = (C0FO7) viewHolder;
        C0FO3 c0fo3LLLFZ = LLLFZ(i);
        AwS132S0201000_5 awS132S0201000_5 = new AwS132S0201000_5(this, c0fo3LLLFZ, i, 2);
        c0fo7.getClass();
        c0fo7.LLJIJIL = c0fo3LLLFZ.LIZ.getResourceId();
        c0fo7.LLJILJIL = c0fo3LLLFZ.LIZIZ.LIZ;
        TuxIconView tuxIconViewL5 = c0fo7.L5();
        if (tuxIconViewL5 != null) {
            tuxIconViewL5.setBackground(c0fo7.LLJ);
            C786410Ut5.x5(tuxIconViewL5, 0.5f);
        }
        C786410Ut5.I7(new AkS77S0100000_5((Object) awS132S0201000_5, 6), c0fo7.LL);
        View view = c0fo7.LL;
        KeyEvent.Callback callbackFindViewById = c0fo7.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.l57);
            c0fo7.LLILZ = (C1324800kZy) callbackFindViewById;
        }
        C1324790kZx c1324790kZx = (C1324790kZx) callbackFindViewById;
        if (c1324790kZx != null) {
            c1324790kZx.LIZ(UriProtector.parse(c0fo3LLLFZ.LIZ.getIcon()), true, null, "lyric_effect");
        }
        TuxTextView tuxTextViewR5 = c0fo7.R5();
        if (tuxTextViewR5 != null) {
            tuxTextViewR5.setTuxFont(72);
            tuxTextViewR5.setText(c0fo3LLLFZ.LIZ.getName());
        }
        c0fo7.S5();
        C389150FNp c389150FNp = c0fo3LLLFZ.LIZIZ;
        int i2 = C0FO9.LIZ[c389150FNp.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            C337180DJs.LIZ(c0fo7.I5());
                            C337180DJs.LIZJ(c0fo7.N5());
                            C337180DJs.LIZJ(c0fo7.L5());
                            View viewP5 = c0fo7.P5();
                            if (viewP5 != null) {
                                viewP5.setBackground(null);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C19671011xk c19671011xkI5 = c0fo7.I5();
                        if (c19671011xkI5 != null) {
                            c19671011xkI5.setProgress(100);
                        }
                        C337180DJs.LIZ(c0fo7.I5());
                        C337180DJs.LIZ(c0fo7.N5());
                        C337180DJs.LIZ(c0fo7.L5());
                        View viewP52 = c0fo7.P5();
                        if (viewP52 != null) {
                            viewP52.setBackground(null);
                        }
                    }
                } else {
                    View viewP53 = c0fo7.P5();
                    if (viewP53 != null) {
                        viewP53.setBackground(null);
                    }
                    TuxTextView tuxTextViewR52 = c0fo7.R5();
                    if (tuxTextViewR52 != null) {
                        tuxTextViewR52.setTextColorRes(R.attr.a1k);
                    }
                    C337180DJs.LIZ(c0fo7.I5());
                    C337180DJs.LIZ(c0fo7.N5());
                    C337180DJs.LIZ(c0fo7.L5());
                }
            } else {
                C337180DJs.LIZJ(c0fo7.I5());
                C337180DJs.LIZ(c0fo7.N5());
                C19671011xk c19671011xkI52 = c0fo7.I5();
                if (c19671011xkI52 != null) {
                    c19671011xkI52.setProgress(c389150FNp.LIZIZ);
                }
                C337180DJs.LIZ(c0fo7.L5());
            }
        } else {
            View viewP54 = c0fo7.P5();
            if (viewP54 != null) {
                viewP54.setBackground(c0fo7.LLIZLLLIL);
            }
            TuxTextView tuxTextViewR53 = c0fo7.R5();
            if (tuxTextViewR53 != null) {
                tuxTextViewR53.setTextColorRes(R.attr.a1h);
            }
            C337180DJs.LIZ(c0fo7.I5());
            C337180DJs.LIZ(c0fo7.L5());
            C337180DJs.LIZ(c0fo7.N5());
        }
        if (c0fo3LLLFZ.LIZIZ.LIZ == C0FOA.SELECTED) {
            c0fo7.T5(c0fo3LLLFZ.LIZ.getResourceId());
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0FO7 c0fo7 = new C0FO7(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.u7, viewGroup, false));
        try {
            View view = c0fo7.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0fo7.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0fo7.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0FO7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0fo7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0fo7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0FO7.class.getName();
        return c0fo7;
    }
}
