package X;

import Y.ARunnableS10S0310000_17;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.11oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19613111oP extends AbstractC19588311kP<LinkStickerModel> {
    public C1664680tQA<LinkStickerModel> LLILZIL;
    public LifecycleOwner LLILZLL;
    public EnumC19613311oR LLIZ;
    public TuxIconView LLIZLLLIL;
    public ViewGroup LLJ;
    public C0FNS LLJI;
    public float LLJIJIL;
    public int LLJILJIL;

    public final void LJ() {
        boolean z = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.das, this, true) instanceof LinearLayout;
        this.LLJ = (ViewGroup) findViewById(R.id.mra);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.zt9);
        C0FNS c0fns = (C0FNS) findViewById(R.id.hea);
        this.LLJI = c0fns;
        if (c0fns == null) {
            c0fns = null;
        }
        c0fns.setClickable(false);
        c0fns.setFocusable(false);
        c0fns.setFocusableInTouchMode(false);
        c0fns.setLongClickable(false);
        c0fns.setEnabled(false);
    }

    public final void LIZLLL(StickerModel stickerModel) {
        LinkStickerModel linkStickerModel;
        LJ();
        if ((stickerModel instanceof LinkStickerModel) && (linkStickerModel = (LinkStickerModel) stickerModel) != null) {
            this.LLJILJIL = ((LinkStickerModel) stickerModel).getIconSize();
            if (C123100dR.LIZ(linkStickerModel.getDisplayText())) {
                LJII(linkStickerModel.getDisplayText(), false);
            } else {
                LJII(linkStickerModel.getFullURL(), true);
            }
            LJIIIIZZ(((LinkStickerModel) stickerModel).getTheme());
        }
    }

    public final boolean LJFF(TuxTextView tuxTextView) {
        Layout layout = tuxTextView.getLayout();
        if (layout != null && layout.getEllipsisCount(tuxTextView.getLineCount() - 1) > 0) {
            return true;
        }
        return false;
    }

    public final synchronized void LJIIIIZZ(EnumC19613311oR enumC19613311oR) {
        if (enumC19613311oR != null) {
            int i = C19613211oQ.LIZ[enumC19613311oR.ordinal()];
            ViewGroup viewGroup = null;
            C0FNS c0fns = null;
            ViewGroup viewGroup2 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        int i2 = this.LLJILJIL;
                        c419910GdJ.LIZIZ = i2;
                        c419910GdJ.LIZJ = i2;
                        c419910GdJ.LIZ = R.raw.icon_color_sticker_link;
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
                        tuxIconDrawableLIZ.LJIIJJI = true;
                        tuxIconDrawableLIZ.invalidateSelf();
                        TuxIconView tuxIconView = this.LLIZLLLIL;
                        if (tuxIconView != null) {
                            tuxIconView.setImageDrawable(tuxIconDrawableLIZ);
                        }
                        ViewGroup viewGroup3 = this.LLJ;
                        if (viewGroup3 == null) {
                            viewGroup3 = null;
                        }
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                        c384050F3z.LJFF = Integer.valueOf(R.attr.ee);
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
                        viewGroup3.setBackground(c384050F3z.LIZ(getContext()));
                        C0FNS c0fns2 = this.LLJI;
                        if (c0fns2 == null) {
                            c0fns2 = null;
                        }
                        c0fns2.setTextColorRes(R.attr.dm);
                        C0FNS c0fns3 = this.LLJI;
                        if (c0fns3 != null) {
                            c0fns = c0fns3;
                        }
                        c0fns.setEnableHollow(true);
                    }
                } else {
                    C0FNS c0fns4 = this.LLJI;
                    if (c0fns4 == null) {
                        c0fns4 = null;
                    }
                    c0fns4.setEnableHollow(false);
                    TuxIconView tuxIconView2 = this.LLIZLLLIL;
                    if (tuxIconView2 != null) {
                        tuxIconView2.getMeasuredWidth();
                    }
                    TuxIconView tuxIconView3 = this.LLIZLLLIL;
                    if (tuxIconView3 != null) {
                        tuxIconView3.getMeasuredHeight();
                    }
                    TuxIconView tuxIconView4 = this.LLIZLLLIL;
                    if (tuxIconView4 != null) {
                        C419910GdJ c419910GdJ2 = new C419910GdJ();
                        int i3 = this.LLJILJIL;
                        c419910GdJ2.LIZIZ = i3;
                        c419910GdJ2.LIZJ = i3;
                        c419910GdJ2.LIZ = R.raw.icon_color_sticker_link;
                        c419910GdJ2.LJ = Integer.valueOf(R.attr.ee);
                        tuxIconView4.setTuxIcon(c419910GdJ2);
                    }
                    C0FNS c0fns5 = this.LLJI;
                    if (c0fns5 == null) {
                        c0fns5 = null;
                    }
                    c0fns5.setTextColorRes(R.attr.ee);
                    ViewGroup viewGroup4 = this.LLJ;
                    if (viewGroup4 != null) {
                        viewGroup2 = viewGroup4;
                    }
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                    c384050F3z2.LJFF = Integer.valueOf(R.attr.ee);
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ee);
                    Drawable drawableLIZ = c384050F3z2.LIZ(getContext());
                    drawableLIZ.setAlpha(102);
                    viewGroup2.setBackground(drawableLIZ);
                }
            } else {
                C0FNS c0fns6 = this.LLJI;
                if (c0fns6 == null) {
                    c0fns6 = null;
                }
                c0fns6.setEnableHollow(false);
                TuxIconView tuxIconView5 = this.LLIZLLLIL;
                if (tuxIconView5 != null) {
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    int i4 = this.LLJILJIL;
                    c419910GdJ3.LIZIZ = i4;
                    c419910GdJ3.LIZJ = i4;
                    c419910GdJ3.LIZ = R.raw.icon_color_sticker_link;
                    c419910GdJ3.LJ = Integer.valueOf(R.attr.em);
                    tuxIconView5.setTuxIcon(c419910GdJ3);
                }
                C0FNS c0fns7 = this.LLJI;
                if (c0fns7 == null) {
                    c0fns7 = null;
                }
                c0fns7.setTextColorRes(R.attr.d9);
                ViewGroup viewGroup5 = this.LLJ;
                if (viewGroup5 != null) {
                    viewGroup = viewGroup5;
                }
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
                c384050F3z3.LJFF = Integer.valueOf(R.attr.ee);
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.ee);
                viewGroup.setBackground(c384050F3z3.LIZ(getContext()));
            }
            this.LLIZ = enumC19613311oR;
            invalidate();
        } else {
            this.LLIZ = enumC19613311oR;
            invalidate();
        }
    }

    public C19613111oP(Context context, AttributeSet attributeSet) {
        super(0, 12, context, attributeSet);
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LLILZIL = c1664680tQA;
        this.LLILZLL = lifecycleOwner;
        this.LLJIJIL = C12ES.LJIIJ(getContext()) * 0.9f;
        int iLIZJ = (int) C12ES.LIZJ(26.43f, getContext());
        this.LLJILJIL = iLIZJ;
        C1664680tQA<LinkStickerModel> c1664680tQA2 = this.LLILZIL;
        LifecycleOwner lifecycleOwner2 = null;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZ.setIconSize(iLIZJ);
        LJ();
        C1664680tQA<LinkStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        LiveState<V> liveStateLIZ = c1664680tQA3.LIZ(new C2217371BqR() { // from class: X.11oK
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((LinkStickerModel) obj).getVisible());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((LinkStickerModel) obj).setVisible(((Boolean) obj2).booleanValue());
            }
        });
        LifecycleOwner lifecycleOwner3 = this.LLILZLL;
        if (lifecycleOwner3 == null) {
            lifecycleOwner3 = null;
        }
        liveStateLIZ.LJIIIZ(lifecycleOwner3, Lifecycle.State.STARTED, new AwS596S0100000_17(this, 258));
        C1664680tQA<LinkStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        LiveState<V> liveStateLIZ2 = c1664680tQA4.LIZ(new C2217371BqR() { // from class: X.11oO
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((LinkStickerModel) obj).getDisplayText();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((LinkStickerModel) obj).setDisplayText((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLILZLL;
        if (lifecycleOwner4 == null) {
            lifecycleOwner4 = null;
        }
        liveStateLIZ2.LJIIIZ(lifecycleOwner4, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 271));
        C1664680tQA<LinkStickerModel> c1664680tQA5 = this.LLILZIL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        LiveState<V> liveStateLIZ3 = c1664680tQA5.LIZ(new C2217371BqR() { // from class: X.11oN
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((LinkStickerModel) obj).getFullURL();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((LinkStickerModel) obj).setFullURL((String) obj2);
            }
        });
        LifecycleOwner lifecycleOwner5 = this.LLILZLL;
        if (lifecycleOwner5 == null) {
            lifecycleOwner5 = null;
        }
        liveStateLIZ3.LJIIIZ(lifecycleOwner5, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 272));
        C1664680tQA<LinkStickerModel> c1664680tQA6 = this.LLILZIL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        LiveState<V> liveStateLIZ4 = c1664680tQA6.LIZ(new C2217371BqR() { // from class: X.11oS
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((LinkStickerModel) obj).getTheme();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((LinkStickerModel) obj).setTheme((EnumC19613311oR) obj2);
            }
        });
        LifecycleOwner lifecycleOwner6 = this.LLILZLL;
        if (lifecycleOwner6 != null) {
            lifecycleOwner2 = lifecycleOwner6;
        }
        liveStateLIZ4.LJIIIZ(lifecycleOwner2, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 266));
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        this.LLILZ = interactStickerStruct;
        LIZLLL(stickerModel);
    }

    public final void LJI(TuxIconView tuxIconView, float f) {
        float fLIZJ = C12ES.LIZJ(26.43f, getContext());
        float fLIZJ2 = C12ES.LIZJ(26.43f, getContext());
        tuxIconView.setIconWidth((int) (fLIZJ * f));
        tuxIconView.setIconHeight((int) (fLIZJ2 * f));
    }

    public final void LJII(String str, boolean z) {
        boolean z2;
        String strLJJLIIIJ = str;
        if (strLJJLIIIJ != null && strLJJLIIIJ.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C0FNS c0fns = null;
        if (z2) {
            C0FNS c0fns2 = this.LLJI;
            if (c0fns2 == null) {
                c0fns2 = null;
            }
            c0fns2.setHint(getContext().getString(2131821822));
            C0FNS c0fns3 = this.LLJI;
            if (c0fns3 == null) {
                c0fns3 = null;
            }
            c0fns3.setText("");
        } else {
            C0FNS c0fns4 = this.LLJI;
            if (c0fns4 == null) {
                c0fns4 = null;
            }
            c0fns4.setHint("");
            if (z) {
                String str2 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(a0.LJJJJZ("https://", a0.LJJJJZ("http://", strLJJLIIIJ)), new String[]{"/"}, 0, 6), 0);
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{e3.d}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() >= 3) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LLD(3, listLJJLIIIJILLIZJL), e3.d, null, null, 0, null, null, 62);
                } else if (listLJJLIIIJILLIZJL.size() == 2) {
                    strLJJLIIIJ = str2;
                }
                String strLJJJJZ = a0.LJJJJZ("www.", strLJJLIIIJ);
                C0FNS c0fns5 = this.LLJI;
                if (c0fns5 == null) {
                    c0fns5 = null;
                }
                c0fns5.setText(strLJJJJZ);
            } else {
                C0FNS c0fns6 = this.LLJI;
                if (c0fns6 == null) {
                    c0fns6 = null;
                }
                c0fns6.setText(strLJJLIIIJ);
            }
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = 24;
        C0FNS c0fns7 = this.LLJI;
        if (c0fns7 != null) {
            c0fns = c0fns7;
        }
        c0fns.LJJJJI(24.0f);
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView != null) {
            LJI(tuxIconView, 1.0f);
            HandlerHook.viewPost(this, new ARunnableS10S0310000_17(c118300cf, this, this, z, 0));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
