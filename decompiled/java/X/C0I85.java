package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I85, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I85 extends LinearLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TuxTextView LLILZ;
    public final C0I6K LLILZIL;
    public final SmartImageView LLILZLL;
    public final TuxIconView LLIZ;
    public final View LLIZLLLIL;
    public C418320Gak LLJ;

    public C0I85() {
        throw null;
    }

    public final int LIZ(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, getContext());
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String LIZIZ(IMUser iMUser) {
        if (C0I0B.LJFF.LIZ().LIZJ(iMUser.getUid())) {
            return getContext().getString(2131835771);
        }
        String displayName = iMUser.getDisplayName();
        if (displayName != null) {
            return displayName;
        }
        return "";
    }

    public final void setDataV2(C0I8N c0i8n) {
        C0I6M c07y6;
        int iLIZIZ;
        this.LLILZ.setText(c0i8n.LIZ.LIZJ);
        int iLIZIZ2 = ((C497820Jfg.LIZIZ(this.LLILZ.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        C0I8P c0i8p = c0i8n.LIZ.LIZIZ;
        C0I8Z c0i8z = C0I8Z.LIZ;
        if (!Intrinsics.LJFF(c0i8p, c0i8z)) {
            if (c0i8p instanceof C0I84) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
            } else if (c0i8p instanceof C0I8M) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            } else {
                throw new C1954807lC();
            }
            iLIZIZ2 -= iLIZIZ;
        }
        this.LLILZ.setMaxWidth(iLIZIZ2);
        C786410Ut5.R7(this.LLILLL, new ACListenerS141S0100000_6(c0i8n, 32));
        C0I8P c0i8p2 = c0i8n.LIZ.LIZIZ;
        if (Intrinsics.LJFF(c0i8p2, c0i8z)) {
            C786410Ut5.e0(this.LLILZIL, 8);
            C418320Gak c418320Gak = this.LLJ;
            if (c418320Gak != null) {
                C786410Ut5.l2(c418320Gak, 8);
                return;
            }
            return;
        }
        if (c0i8p2 instanceof C0I84) {
            C786410Ut5.e0(this.LLILZIL, 0);
            C418320Gak c418320Gak2 = this.LLJ;
            if (c418320Gak2 != null) {
                C786410Ut5.l2(c418320Gak2, 8);
            }
            C0I84 c0i84 = (C0I84) c0i8p2;
            C0I8A c0i8a = c0i84.LIZJ;
            C0I8C c0i8c = c0i84.LJFF;
            C0I88 c0i88 = c0i84.LJ;
            C0I8V c0i8v = c0i84.LIZIZ;
            UrlModel urlModel = c0i84.LIZ;
            Pair<Integer, Integer> pair = c0i84.LJI;
            C0I6K c0i6k = this.LLILZIL;
            int i = C0I87.LIZJ[c0i8a.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c07y6 = C0I62.LIZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c07y6 = new C07Y6(C418440Gaw.LIZIZ(4));
            }
            c0i6k.setStyle(c07y6);
            int i2 = C0I87.LIZLLL[c0i8c.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.LLILZLL.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    this.LLILZLL.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZJ);
                }
            } else {
                this.LLILZLL.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZ);
            }
            SmartImageView smartImageView = this.LLILZLL;
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                if (pair != null) {
                    Integer first = pair.getFirst();
                    if (first != null) {
                        layoutParams.width = first.intValue();
                    }
                    Integer second = pair.getSecond();
                    if (second != null) {
                        layoutParams.height = second.intValue();
                    }
                }
                C786410Ut5.W5(smartImageView, layoutParams);
                int i3 = C0I87.LJFF[c0i88.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        this.LLIZ.setIconRes(R.raw.icon_eye_slash);
                        C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                    }
                } else {
                    this.LLIZ.setIconRes(R.raw.icon_play_fill);
                    C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                }
                if (c0i8v instanceof C0I8F) {
                    C0I66 c0i66 = new C0I66();
                    c0i66.LIZ = urlModel;
                    c0i66.LIZIZ = this.LLILZLL;
                    Function1<C0I66, C0I66> function1 = ((C0I8F) c0i8v).LIZ;
                    if (function1 != null) {
                        function1.invoke(c0i66);
                    }
                    new C0I97(c0i66).LIZ();
                    return;
                }
                if (c0i8v instanceof C0I8H) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
                    c1331670kl3LJIIIIZZ.LJJ(this.LLILZLL);
                    Function1<C1331670kl3, C1331670kl3> function12 = ((C0I8H) c0i8v).LIZ;
                    if (function12 != null) {
                        function12.invoke(c1331670kl3LJIIIIZZ);
                    }
                    C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "ReplyLayoutInputPanel2", null, false, null, null, null, 62);
                    return;
                }
                throw new C1954807lC();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (c0i8p2 instanceof C0I8M) {
            C786410Ut5.e0(this.LLILZIL, 8);
            String str = ((C0I8M) c0i8p2).LIZ;
            C418320Gak c418320Gak3 = this.LLJ;
            if (c418320Gak3 == null) {
                c418320Gak3 = new C418320Gak(getContext());
                this.LLILLL.addView(c418320Gak3, 1);
                this.LLJ = c418320Gak3;
            }
            C786410Ut5.l2(c418320Gak3, 0);
            c418320Gak3.setDuration(str);
            return;
        }
        throw new C1954807lC();
    }

    public C0I85(Context context, AwS550S0100000_6 awS550S0100000_6) {
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.cpb, this);
        this.LL = findViewById(R.id.k9r);
        View viewFindViewById = findViewById(R.id.k9y);
        this.LLILLJJLI = viewFindViewById;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.k9s);
        this.LLILLL = linearLayout;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.k_0);
        this.LLILZ = tuxTextView;
        this.LLILZIL = (C0I6K) findViewById(R.id.k9x);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.k9w);
        this.LLILZLL = smartImageView;
        this.LLIZ = (TuxIconView) findViewById(R.id.k9z);
        View viewFindViewById2 = findViewById(R.id.k9t);
        this.LLIZLLLIL = viewFindViewById2;
        C786410Ut5.I7(new ACListenerS141S0100000_6(awS550S0100000_6, 168), viewFindViewById2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zm, context);
            if (numLIZJ2 != null) {
                int iLJIIJ = C2441009hQ.LJIIJ(iIntValue, numLIZJ2.intValue());
                viewFindViewById.setBackground(new C389930FQp(C418440Gaw.LIZIZ(2), iLJIIJ));
                linearLayout.setBackground(new C389930FQp(C418440Gaw.LIZIZ(12), iLJIIJ));
                smartImageView.setPlaceholderImage(new C389930FQp(C418440Gaw.LIZIZ(4), LIZ(R.attr.a03)));
                C1331070kk5 hierarchy = smartImageView.getHierarchy();
                if (hierarchy != null) {
                    hierarchy.LJIJ(new C389930FQp(C418440Gaw.LIZIZ(4), LIZ(R.attr.a03)), 5);
                }
                tuxTextView.setTextColor(C2441009hQ.LJIIJ(LIZ(R.attr.a1k), LIZ(R.attr.a1e)));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LIZJ(IMUser iMUser, C0I8I c0i8i) {
        String displayName;
        C0I6M c07y6;
        int iLIZIZ;
        TuxTextView tuxTextView = this.LLILZ;
        String strLIZIZ = c0i8i.LIZ;
        if (iMUser != null) {
            displayName = iMUser.getDisplayName();
        } else {
            displayName = null;
        }
        if (displayName != null) {
            if (strLIZIZ.length() == 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LIZIZ(iMUser));
                sbLIZ.append(':');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LIZIZ(iMUser));
                sbLIZ2.append(": ");
                sbLIZ2.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        tuxTextView.setText(strLIZIZ);
        int iLIZIZ2 = ((C497820Jfg.LIZIZ(this.LLILZ.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        C0I8O c0i8o = c0i8i.LIZIZ;
        C0I8W c0i8w = C0I8W.LIZ;
        if (!Intrinsics.LJFF(c0i8o, c0i8w)) {
            if (c0i8o instanceof C0I86) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
            } else if (c0i8o instanceof C0I8L) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            } else {
                throw new C1954807lC();
            }
            iLIZIZ2 -= iLIZIZ;
        }
        this.LLILZ.setMaxWidth(iLIZIZ2);
        C786410Ut5.R7(this.LLILLL, new ACListenerS141S0100000_6(c0i8i, 31));
        C0I8O c0i8o2 = c0i8i.LIZIZ;
        if (Intrinsics.LJFF(c0i8o2, c0i8w)) {
            C786410Ut5.e0(this.LLILZIL, 8);
            C418320Gak c418320Gak = this.LLJ;
            if (c418320Gak != null) {
                C786410Ut5.l2(c418320Gak, 8);
                return;
            }
            return;
        }
        if (c0i8o2 instanceof C0I86) {
            C786410Ut5.e0(this.LLILZIL, 0);
            C418320Gak c418320Gak2 = this.LLJ;
            if (c418320Gak2 != null) {
                C786410Ut5.l2(c418320Gak2, 8);
            }
            C0I6K c0i6k = this.LLILZIL;
            int i = C0I87.LIZ[((C0I86) c0i8i.LIZIZ).LIZJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c07y6 = C0I62.LIZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c07y6 = new C07Y6(C418440Gaw.LIZIZ(4));
            }
            c0i6k.setStyle(c07y6);
            int i2 = C0I87.LIZIZ[((C0I86) c0i8i.LIZIZ).LJFF.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this.LLILZLL.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    this.LLILZLL.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZJ);
                }
            } else {
                this.LLILZLL.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LIZ);
            }
            SmartImageView smartImageView = this.LLILZLL;
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            if (layoutParams != null) {
                C0I8S c0i8s = ((C0I86) c0i8i.LIZIZ).LIZLLL;
                if (c0i8s instanceof C0I8K) {
                    int i3 = ((C0I8K) c0i8s).LIZ;
                    int i4 = ((C0I8K) c0i8s).LIZIZ;
                    if (i3 > 0 && i4 > 0) {
                        if (i3 > i4) {
                            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                            layoutParams.height = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) / i3) * i4);
                        } else {
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                            layoutParams.width = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) / i4) * i3);
                        }
                    } else {
                        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    }
                } else if (Intrinsics.LJFF(c0i8s, C0I8Y.LIZ)) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                } else if (Intrinsics.LJFF(c0i8s, C0I8X.LIZ)) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                } else {
                    throw new C1954807lC();
                }
                C786410Ut5.W5(smartImageView, layoutParams);
                int i5 = C0I87.LJ[((C0I86) c0i8i.LIZIZ).LJ.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        this.LLIZ.setIconRes(R.raw.icon_eye_slash);
                        C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                    }
                } else {
                    this.LLIZ.setIconRes(R.raw.icon_play_fill);
                    C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                }
                C0I86 c0i86 = (C0I86) c0i8i.LIZIZ;
                C0I8U c0i8u = c0i86.LIZIZ;
                if (c0i8u instanceof C0I8E) {
                    C0I66 c0i66 = new C0I66();
                    c0i66.LIZ = ((C0I86) c0i8i.LIZIZ).LIZ;
                    c0i66.LIZIZ = this.LLILZLL;
                    Function1<C0I66, C0I66> function1 = ((C0I8E) c0i8u).LIZ;
                    if (function1 != null) {
                        function1.invoke(c0i66);
                    }
                    new C0I97(c0i66).LIZ();
                    return;
                }
                if (c0i8u instanceof C0I8G) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c0i86.LIZ));
                    c1331670kl3LJIIIIZZ.LJJJJLI = C454440Hru.LIZ();
                    c1331670kl3LJIIIIZZ.LJJ(this.LLILZLL);
                    Function1<C1331670kl3, C1331670kl3> function12 = ((C0I8G) c0i8u).LIZ;
                    if (function12 != null) {
                        function12.invoke(c1331670kl3LJIIIIZZ);
                    }
                    C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "ReplyLayoutInputPanel2", null, false, null, null, null, 62);
                    return;
                }
                throw new C1954807lC();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (c0i8o2 instanceof C0I8L) {
            C786410Ut5.e0(this.LLILZIL, 8);
            C418320Gak c418320Gak3 = this.LLJ;
            if (c418320Gak3 == null) {
                c418320Gak3 = new C418320Gak(getContext());
                this.LLILLL.addView(c418320Gak3, 1);
                this.LLJ = c418320Gak3;
            }
            C786410Ut5.l2(c418320Gak3, 0);
            c418320Gak3.setDuration(((C0I8L) c0i8i.LIZIZ).LIZ);
            return;
        }
        throw new C1954807lC();
    }
}
