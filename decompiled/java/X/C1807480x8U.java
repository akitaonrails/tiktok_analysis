package X;

import Y.ATListenerS459S0100000_27;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0x8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807480x8U extends AbstractC21673619ry<C1807490x8V> {
    public final List<C1784040wWg> LL = new ArrayList();
    public Function2<? super EnumC1784170wWt, ? super IMQuickReply, Unit> LLILLJJLI;
    public Function1<? super RecyclerView.ViewHolder, Unit> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        final C1807490x8V c1807490x8V = (C1807490x8V) viewHolder;
        if (i < ((ArrayList) this.LL).size() && i >= 0) {
            final C1784040wWg c1784040wWg = (C1784040wWg) ListProtector.get(this.LL, i);
            TuxTextView tuxTextView = c1807490x8V.LLJ;
            if (tuxTextView != null) {
                tuxTextView.setText(c1784040wWg.LIZIZ.content.text.text);
            }
            EnumC1784010wWd enumC1784010wWd = c1784040wWg.LIZ;
            int[] iArr = C1784020wWe.LIZ;
            int i2 = iArr[enumC1784010wWd.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        c1807490x8V.I5(true, true);
                        TuxIconView tuxIconView = c1807490x8V.LLIZLLLIL;
                        if (tuxIconView != null) {
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_3_lines_horizontal_2;
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                            tuxIconView.setTuxIcon(c419910GdJ);
                        }
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = R.raw.icon_minus;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.zm);
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ2.LIZ(c1807490x8V.LL.getContext());
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zs);
                        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                        LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(c1807490x8V.LL.getContext()));
                        TuxIconView tuxIconView2 = c1807490x8V.LLIZ;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setImageDrawable(layerDrawableLJIILIIL);
                        }
                        View view = c1807490x8V.LLILZIL;
                        if (view != null) {
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                marginLayoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                                marginLayoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                            } else {
                                marginLayoutParams3 = null;
                            }
                            C786410Ut5.W5(view, marginLayoutParams3);
                        }
                        View view2 = c1807490x8V.LLILZLL;
                        if (view2 != null) {
                            view2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                        }
                    }
                } else {
                    c1807490x8V.I5(false, true);
                    TuxIconView tuxIconView3 = c1807490x8V.LLIZLLLIL;
                    if (tuxIconView3 != null) {
                        C419910GdJ c419910GdJ3 = new C419910GdJ();
                        c419910GdJ3.LIZ = R.raw.icon_pen_on_paper;
                        c419910GdJ3.LJ = Integer.valueOf(R.attr.a1k);
                        tuxIconView3.setTuxIcon(c419910GdJ3);
                    }
                    View view3 = c1807490x8V.LLILZIL;
                    if (view3 != null) {
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                            marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        } else {
                            marginLayoutParams2 = null;
                        }
                        C786410Ut5.W5(view3, marginLayoutParams2);
                    }
                    View view4 = c1807490x8V.LLILZLL;
                    if (view4 != null) {
                        view4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
                    }
                }
            } else {
                c1807490x8V.I5(false, false);
                View view5 = c1807490x8V.LLILZIL;
                if (view5 != null) {
                    ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    } else {
                        marginLayoutParams = null;
                    }
                    C786410Ut5.W5(view5, marginLayoutParams);
                }
            }
            int i3 = iArr[c1784040wWg.LIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        View view6 = c1807490x8V.LL;
                        if (view6 != null) {
                            C786410Ut5.I7(null, view6);
                        }
                        View view7 = c1807490x8V.LLILZLL;
                        if (view7 != null) {
                            view7.setOnTouchListener(new ATListenerS459S0100000_27(c1807490x8V, 13));
                        }
                        View view8 = c1807490x8V.LLILZ;
                        if (view8 != null) {
                            final int i4 = 2;
                            C786410Ut5.I7(new C19IN(c1807490x8V, c1784040wWg, i4) { // from class: X.0ycb
                                public final int $t;
                                public Object l0;
                                public Object l1;

                                @Override // X.C19IN
                                public final void LIZ(View view9) {
                                    switch (this.$t) {
                                        case 0:
                                            LIZ$0(this, view9);
                                            break;
                                        case 1:
                                            LIZ$1(this, view9);
                                            break;
                                        case 2:
                                            LIZ$2(this, view9);
                                            break;
                                        default:
                                            super.LIZ(view9);
                                            break;
                                    }
                                }

                                public static final void LIZ$0(C1864590ycb c1864590ycb, View view9) {
                                    Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                                    if (function2 != null) {
                                        function2.invoke(EnumC1784170wWt.CLICK, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                                    }
                                }

                                public static final void LIZ$1(C1864590ycb c1864590ycb, View view9) {
                                    Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                                    if (function2 != null) {
                                        function2.invoke(EnumC1784170wWt.EDIT, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                                    }
                                }

                                public static final void LIZ$2(C1864590ycb c1864590ycb, View view9) {
                                    Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                                    if (function2 != null) {
                                        function2.invoke(EnumC1784170wWt.DELETE, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(500, 2);
                                    this.$t = i4;
                                    this.l0 = c1807490x8V;
                                    this.l1 = c1784040wWg;
                                }
                            }, view8);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                View view9 = c1807490x8V.LLILZLL;
                if (view9 != null) {
                    view9.setOnTouchListener(null);
                }
                View view10 = c1807490x8V.LL;
                if (view10 == null) {
                    return;
                }
                final int i5 = 1;
                C786410Ut5.I7(new C19IN(c1807490x8V, c1784040wWg, i5) { // from class: X.0ycb
                    public final int $t;
                    public Object l0;
                    public Object l1;

                    @Override // X.C19IN
                    public final void LIZ(View view92) {
                        switch (this.$t) {
                            case 0:
                                LIZ$0(this, view92);
                                break;
                            case 1:
                                LIZ$1(this, view92);
                                break;
                            case 2:
                                LIZ$2(this, view92);
                                break;
                            default:
                                super.LIZ(view92);
                                break;
                        }
                    }

                    public static final void LIZ$0(C1864590ycb c1864590ycb, View view92) {
                        Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                        if (function2 != null) {
                            function2.invoke(EnumC1784170wWt.CLICK, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                        }
                    }

                    public static final void LIZ$1(C1864590ycb c1864590ycb, View view92) {
                        Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                        if (function2 != null) {
                            function2.invoke(EnumC1784170wWt.EDIT, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                        }
                    }

                    public static final void LIZ$2(C1864590ycb c1864590ycb, View view92) {
                        Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                        if (function2 != null) {
                            function2.invoke(EnumC1784170wWt.DELETE, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(500, 2);
                        this.$t = i5;
                        this.l0 = c1807490x8V;
                        this.l1 = c1784040wWg;
                    }
                }, view10);
                return;
            }
            C786410Ut5.I7(null, c1807490x8V.LL);
            View view11 = c1807490x8V.LLILZIL;
            if (view11 == null) {
                return;
            }
            final int i6 = 0;
            C786410Ut5.I7(new C19IN(c1807490x8V, c1784040wWg, i6) { // from class: X.0ycb
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // X.C19IN
                public final void LIZ(View view92) {
                    switch (this.$t) {
                        case 0:
                            LIZ$0(this, view92);
                            break;
                        case 1:
                            LIZ$1(this, view92);
                            break;
                        case 2:
                            LIZ$2(this, view92);
                            break;
                        default:
                            super.LIZ(view92);
                            break;
                    }
                }

                public static final void LIZ$0(C1864590ycb c1864590ycb, View view92) {
                    Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                    if (function2 != null) {
                        function2.invoke(EnumC1784170wWt.CLICK, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                    }
                }

                public static final void LIZ$1(C1864590ycb c1864590ycb, View view92) {
                    Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                    if (function2 != null) {
                        function2.invoke(EnumC1784170wWt.EDIT, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                    }
                }

                public static final void LIZ$2(C1864590ycb c1864590ycb, View view92) {
                    Function2<EnumC1784170wWt, IMQuickReply, Unit> function2 = ((C1807490x8V) c1864590ycb.l0).LLILLJJLI;
                    if (function2 != null) {
                        function2.invoke(EnumC1784170wWt.DELETE, ((C1784040wWg) c1864590ycb.l1).LIZIZ);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(500, 2);
                    this.$t = i6;
                    this.l0 = c1807490x8V;
                    this.l1 = c1784040wWg;
                }
            }, view11);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1807490x8V c1807490x8V = new C1807490x8V(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cf5, viewGroup, false), this.LLILLJJLI, this.LLILLL);
        try {
            View view = c1807490x8V.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1807490x8V.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1807490x8V.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1807490x8V.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1807490x8V.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1807490x8V.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1807490x8V.class.getName();
        return c1807490x8V;
    }
}
