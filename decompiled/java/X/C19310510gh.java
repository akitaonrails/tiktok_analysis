package X;

import Y.ACListenerS162S0100000_28;
import Y.ARunnableS88S0200000_19;
import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: renamed from: X.10gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19310510gh extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<C1687890u1b> LL;
    public int LLILLJJLI;
    public final boolean LLILLL;
    public final SignupViewModel LLILZ;
    public InterfaceC19311410gq LLILZIL;
    public final Set<Integer> LLILZLL = new LinkedHashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public static EnumC19310710gj LLLFZ(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i != 9) {
                    if (i != 6) {
                        if (i == 7) {
                            return EnumC19310710gj.ACTIVE_SHOOTER_HEADER;
                        }
                        throw new UnsupportedOperationException("Unsupported View Type for a Login Header");
                    }
                    return EnumC19310710gj.TRIAL_EXPIRES;
                }
                return EnumC19310710gj.INCREASE_1P_SIGNUP;
            }
            return EnumC19310710gj.DYNAMIC_HEIGHT;
        }
        return EnumC19310710gj.ONLINE;
    }

    public final void LLLI(List<? extends C1687890u1b> list) {
        this.LL.clear();
        this.LL.addAll(list);
        this.LLILLJJLI = this.LL.size();
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LL);
        if (Intrinsics.LJFF(objLJJJLZIJ, C19314810hO.LJIIJ)) {
            return 0;
        }
        if (Intrinsics.LJFF(objLJJJLZIJ, C19314510hL.LJIIJ)) {
            return 4;
        }
        if (Intrinsics.LJFF(objLJJJLZIJ, C19314610hM.LJIIJ)) {
            return 9;
        }
        if (Intrinsics.LJFF(objLJJJLZIJ, C19314710hN.LJIIJ)) {
            return 6;
        }
        if (Intrinsics.LJFF(objLJJJLZIJ, C19314410hK.LJIIJ)) {
            return 7;
        }
        if (objLJJJLZIJ instanceof C1687920u1e) {
            return 2;
        }
        if (objLJJJLZIJ instanceof C1687930u1f) {
            return 5;
        }
        if (objLJJJLZIJ instanceof C1687910u1d) {
            return 10;
        }
        if (Intrinsics.LJFF(objLJJJLZIJ, new C1687890u1b() { // from class: X.10go
        })) {
            return 3;
        }
        if (Intrinsics.LJFF(objLJJJLZIJ, C1688260u2C.LJIIJ)) {
            return 11;
        }
        if (objLJJJLZIJ instanceof C19311510gr) {
            return 8;
        }
        if (objLJJJLZIJ instanceof C19311110gn) {
            return 12;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1687910u1d c1687910u1d;
        C19286310cn c19286310cn;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        if (getItemViewType(i) == 1) {
            C1216190hkn c1216190hkn = (C1216190hkn) viewHolder;
            C1687890u1b c1687890u1b = (C1687890u1b) ListProtector.get(this.LL, i);
            boolean zContains = this.LLILZLL.contains(Integer.valueOf(i));
            long j = ((i - this.LLILLJJLI) - 1) * 50;
            c1216190hkn.getClass();
            if (c1687890u1b.LIZ == 0 && C19286010ck.LIZLLL()) {
                C786410Ut5.LLLLLLZZ(c1216190hkn.LLILLL, 8);
                ViewGroup.LayoutParams layoutParams = c1216190hkn.LLILZIL.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams4.setMarginStart(marginLayoutParams4.getMarginEnd());
                }
                TextView textView = c1216190hkn.LLILZIL;
                C786410Ut5.g6(textView, textView.getLayoutParams());
                ConstraintLayout constraintLayout = c1216190hkn.LLILZ;
                Integer numValueOf = Integer.valueOf(constraintLayout.getPaddingTop());
                Integer numValueOf2 = Integer.valueOf(c1216190hkn.LLILZ.getPaddingEnd());
                Integer numValueOf3 = Integer.valueOf(c1216190hkn.LLILZ.getPaddingBottom());
                i2 = R.attr.a1h;
                C426750GoL.LJIIL(constraintLayout, 0, numValueOf, numValueOf2, numValueOf3, 16);
            } else {
                i2 = R.attr.a1h;
                TuxIconView tuxIconView = c1216190hkn.LLILLL;
                int i3 = c1687890u1b.LIZ;
                Integer numValueOf4 = Integer.valueOf(R.attr.a1h);
                if (i3 == R.raw.icon_person_fill) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = i3;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                    c419910GdJ.LJ = numValueOf4;
                    tuxIconView.setTuxIcon(c419910GdJ);
                } else if (i3 != R.raw.icon_person && i3 != R.raw.icon_color_twitter) {
                    if (i3 == R.raw.icon_envelpoe_fill) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        c419910GdJ2.LIZ = i3;
                        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ2.LJ = numValueOf4;
                        C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, null, false, 30);
                        tuxIconView.setTuxIcon(c419910GdJ2);
                    } else {
                        C419910GdJ c419910GdJ3 = new C419910GdJ();
                        c419910GdJ3.LIZ = i3;
                        tuxIconView.setTuxIcon(c419910GdJ3);
                    }
                } else {
                    C419910GdJ c419910GdJ4 = new C419910GdJ();
                    c419910GdJ4.LIZ = i3;
                    c419910GdJ4.LJ = numValueOf4;
                    tuxIconView.setTuxIcon(c419910GdJ4);
                }
            }
            ViewGroup.LayoutParams layoutParams2 = c1216190hkn.LLILZIL.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                if (c1216190hkn.LLILLJJLI.PQ2()) {
                    marginLayoutParams3.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.5d)));
                    marginLayoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(14.5d)));
                }
                TextView textView2 = c1216190hkn.LLILZIL;
                C786410Ut5.g6(textView2, textView2.getLayoutParams());
            }
            C786410Ut5.I7(c1687890u1b.LJIIIIZZ, c1216190hkn.LL);
            q0.LJIJ(c1216190hkn.LL, new C1266340j3g(c1216190hkn, 7));
            if (zContains) {
                C786410Ut5.T4(c1216190hkn.LL, 0.0f);
            } else {
                C786410Ut5.T4(c1216190hkn.LL, 1.0f);
            }
            if (Intrinsics.LJFF(c1687890u1b.LJ, "email_signup_show")) {
                c1216190hkn.LLILLL.getLayoutParams().height = c1216190hkn.LLJ;
                c1216190hkn.LLILLL.getLayoutParams().width = c1216190hkn.LLJ;
                c1216190hkn.LLILLL.setTintColorRes(i2);
            }
            if (c1216190hkn.LLILLJJLI.PQ2()) {
                c1216190hkn.LLILZ.setBackground(C800330VaR.LIZIZ(c1216190hkn.LL.getContext(), R.drawable.acv));
            } else {
                c1216190hkn.LLILZ.setBackground(C800330VaR.LIZIZ(c1216190hkn.LL.getContext(), R.drawable.ad0));
            }
            if (c1687890u1b.LIZLLL) {
                c1216190hkn.LLILZIL.setTextColor(C960203pA.LIZ(R.attr.bx, c1216190hkn.LL.getContext()));
                if (C19286010ck.LIZLLL()) {
                    c1216190hkn.LLILZIL.setTextColor(C960203pA.LIZ(R.attr.a0p, c1216190hkn.LL.getContext()));
                }
                c1216190hkn.LLILLL.setColorFilter(C960203pA.LIZ(R.attr.bx, c1216190hkn.LL.getContext()), PorterDuff.Mode.SRC_IN);
                if (c1216190hkn.LLILZ.getLayoutParams() instanceof RecyclerView.LayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) c1216190hkn.LLILZ.getLayoutParams();
                    marginLayoutParams5.bottomMargin = 0;
                    marginLayoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                    c1216190hkn.LLILZ.setBackground(C800330VaR.LIZIZ(c1216190hkn.LL.getContext(), R.drawable.adg));
                } else {
                    return;
                }
            } else {
                ViewGroup.LayoutParams layoutParams3 = c1216190hkn.LLILZ.getLayoutParams();
                if ((layoutParams3 instanceof RecyclerView.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                }
                Drawable drawableLIZIZ = C800330VaR.LIZIZ(c1216190hkn.LL.getContext(), R.drawable.ad9);
                if (drawableLIZIZ != null) {
                    c1216190hkn.LLILZ.setBackground(drawableLIZIZ);
                }
            }
            String string = c1216190hkn.LL.getContext().getString(c1687890u1b.LIZJ);
            c1216190hkn.LLILZIL.setText(string);
            if (c1216190hkn.LLILZIL.getPaint().measureText(string) + C12ES.LIZJ(96.0f, c1216190hkn.LL.getContext()) > c1216190hkn.LLIZ) {
                C19ME c19me = (C19ME) c1216190hkn.LLILZIL.getLayoutParams();
                c19me.matchConstraintDefaultHeight = 0;
                if (c1687890u1b.LIZ == 0) {
                    c19me.startToStart = 0;
                } else {
                    c19me.startToEnd = R.id.jxe;
                    c19me.startToStart = -1;
                }
                c19me.setMarginStart((int) C12ES.LIZJ(12.0f, c1216190hkn.LL.getContext()));
                C21382118m3.LIZIZ(c1216190hkn.LLILZIL, 11, 15, 1, 1);
            }
            TextView textView3 = c1216190hkn.LLILZIL;
            C786410Ut5.g6(textView3, textView3.getLayoutParams());
            if (zContains) {
                if (c1216190hkn.LL.getAlpha() != 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1216190hkn.LL, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.setStartDelay(j);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                } else {
                    return;
                }
            } else {
                C786410Ut5.T4(c1216190hkn.LL, 1.0f);
            }
            if (c1687890u1b.LJFF) {
                int i4 = C0XRB.LIZ[c1216190hkn.LLIZLLLIL.LJFF().ordinal()];
                String str = "";
                if (i4 != 1) {
                    if (i4 != 2) {
                        C786410Ut5.LLLLZLL(c1216190hkn.LLILZLL, 8);
                        return;
                    }
                    TuxTextView tuxTextView = c1216190hkn.LLILZLL;
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    tuxTextView.setTuxFont(72);
                    tuxTextView.setTextSize(12.0f);
                    tuxTextView.setTextColor(C960203pA.LIZ(R.attr.ee, tuxTextView.getContext()));
                    tuxTextView.setBackground(tuxTextView.getContext().getDrawable(R.drawable.ad2));
                    TuxTextView tuxTextView2 = c1216190hkn.LLILZLL;
                    String str2 = (String) c1216190hkn.LLIZLLLIL.getPlatform().getValue();
                    if (str2 != null) {
                        str = str2;
                    }
                    tuxTextView2.setText(c1216190hkn.I5(str));
                    tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                    ((C19ME) tuxTextView.getLayoutParams()).bottomToTop = R.id.dog;
                    C786410Ut5.wd(tuxTextView, C12ES.LIZJ(-4.0f, c1216190hkn.LL.getContext()));
                    HandlerHook.viewPost(tuxTextView, new ARunnableS88S0200000_19(c1216190hkn, tuxTextView, 65));
                    return;
                }
                TuxTextView tuxTextView3 = c1216190hkn.LLILZLL;
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
                tuxTextView3.setTuxFont(61);
                tuxTextView3.setTextSize(13.0f);
                tuxTextView3.setTextColor(C960203pA.LIZ(R.attr.a1k, tuxTextView3.getContext()));
                TuxTextView tuxTextView4 = c1216190hkn.LLILZLL;
                String str3 = (String) c1216190hkn.LLIZLLLIL.getPlatform().getValue();
                if (str3 != null) {
                    str = str3;
                }
                tuxTextView4.setText(c1216190hkn.I5(str));
                C19ME c19me2 = (C19ME) tuxTextView3.getLayoutParams();
                c19me2.startToStart = R.id.dog;
                c19me2.endToEnd = R.id.dog;
                c19me2.topToBottom = R.id.dog;
                C21382118m3.LIZIZ(c1216190hkn.LLILZLL, 12, 13, 1, 1);
                ((C19ME) c1216190hkn.LLILZIL.getLayoutParams()).bottomToBottom = -1;
                return;
            }
            return;
        }
        if (getItemViewType(i) != 2 && getItemViewType(i) != 5) {
            if (getItemViewType(i) == 8) {
                ListProtector.get(this.LL, i);
                C1390950mIf c1390950mIf = ((C1390990mIj) viewHolder).LLILLJJLI;
                ((ArrayList) c1390950mIf.LLILLL).clear();
                ((ArrayList) c1390950mIf.LLILLL).addAll(null);
                c1390950mIf.notifyDataSetChanged();
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = null;
            if (getItemViewType(i) == 12) {
                C19310910gl c19310910gl = (C19310910gl) viewHolder;
                C19311110gn c19311110gn = (C19311110gn) ListProtector.get(this.LL, i);
                this.LLILZLL.contains(Integer.valueOf(i));
                c19310910gl.getClass();
                if (!a0.LJJJIL(c19311110gn.LJIIJJI)) {
                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(c19311110gn.LJIIJJI));
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c1331670kl3LJI.LJIIIIZZ = iLIZIZ;
                    c1331670kl3LJI.LJIIIZ = iLIZIZ2;
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LIZ = true;
                    c1331670kl3LJI.LJJI = new C1331730kl9(c1331750klB);
                    c1331670kl3LJI.LJJI(c19310910gl.LLILLL);
                    c1331670kl3LJI.LIZLLL("TTLoginViewHolder");
                    C786410Ut5.h3(c1331670kl3LJI);
                } else {
                    C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(c19311110gn.LIZ);
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c1331670kl3LJFF.LJIIIIZZ = iLIZIZ3;
                    c1331670kl3LJFF.LJIIIZ = iLIZIZ4;
                    C1331750klB c1331750klB2 = new C1331750klB();
                    c1331750klB2.LIZ = true;
                    c1331670kl3LJFF.LJJI = new C1331730kl9(c1331750klB2);
                    c1331670kl3LJFF.LJJI(c19310910gl.LLILLL);
                    c1331670kl3LJFF.LIZLLL("TTLoginViewHolder");
                    C786410Ut5.h3(c1331670kl3LJFF);
                }
                c19310910gl.LLILZ.setText(C786410Ut5.j4(c19310910gl.LL.getContext().getString(c19311110gn.LIZJ), Arrays.copyOf(new Object[]{c19311110gn.LJIIJ}, 1)));
                c19310910gl.LLILLJJLI.setBackground(C800330VaR.LIZIZ(c19310910gl.LL.getContext(), R.drawable.ad0));
                if (c19311110gn.LIZLLL) {
                    c19310910gl.LLILZ.setTextColor(C960203pA.LIZ(R.attr.bx, c19310910gl.LL.getContext()));
                    if (C19286010ck.LIZLLL()) {
                        c19310910gl.LLILZ.setTextColor(C960203pA.LIZ(R.attr.a0p, c19310910gl.LL.getContext()));
                    }
                    c19310910gl.LLILLL.setColorFilter(C960203pA.LIZ(R.attr.bx, c19310910gl.LL.getContext()), PorterDuff.Mode.SRC_IN);
                    if (!(c19310910gl.LLILLJJLI.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
                        return;
                    } else {
                        c19310910gl.LLILLJJLI.setBackground(C800330VaR.LIZIZ(c19310910gl.LL.getContext(), R.drawable.adg));
                    }
                }
                C786410Ut5.I7(c19311110gn.LJIIIIZZ, c19310910gl.LL);
                return;
            }
            if (getItemViewType(i) != 10) {
                return;
            }
            Object obj = ListProtector.get(this.LL, i);
            if (!(obj instanceof C1687910u1d) || (c1687910u1d = (C1687910u1d) obj) == null || !(viewHolder instanceof C19286310cn) || (c19286310cn = (C19286310cn) viewHolder) == null) {
                return;
            }
            View viewFindViewById = c19286310cn.LL.findViewById(R.id.pqq);
            if (viewFindViewById != null) {
                layoutParams4 = viewFindViewById.getLayoutParams();
            }
            if (!(layoutParams4 instanceof RecyclerView.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
                return;
            }
            Integer num = c1687910u1d.LJIIJ;
            if (num != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num.intValue())));
            }
            Integer num2 = c1687910u1d.LJIIJJI;
            if (num2 == null) {
                return;
            }
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue())));
            return;
        }
        C338850DQd c338850DQd = (C338850DQd) viewHolder;
        InterfaceC19311410gq interfaceC19311410gq = this.LLILZIL;
        c338850DQd.getClass();
        View viewI5 = c338850DQd.I5();
        C844470XAv.LIZ.getClass();
        viewI5.setContentDescription(C844470XAv.LIZ().getString(2131823340));
        C786410Ut5.I7(new ACListenerS162S0100000_28(interfaceC19311410gq, 190), c338850DQd.I5());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0121  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r14, int r15) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19310510gh.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public C19310510gh(List<C1687890u1b> list, int i, boolean z, SignupViewModel signupViewModel) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = signupViewModel;
    }
}
