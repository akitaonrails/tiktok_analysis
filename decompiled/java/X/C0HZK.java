package X;

import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0HZK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZK {
    public static boolean LJII;
    public final Context LIZ;
    public final TuxTextView LIZIZ;
    public SpannableStringBuilder LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));

    public final void LIZLLL() {
        TuxIconDrawable tuxIconDrawableLIZ;
        if (LJII) {
            C419890GdH c419890GdHLIZIZ = null;
            if (this.LIZJ != null) {
                Context context = this.LIZ;
                if (context != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_down_fill;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hideAlertBadge, downFillIconSpan: , titleSpan: ");
                sbLIZ.append((Object) this.LIZJ);
                C1720106oR.LJI("NBNicknameBPManager", C2188811AlT.LIZIZ(sbLIZ));
                if (c419890GdHLIZIZ != null) {
                    c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C444960Hcc.LIZIZ());
                }
                int i2 = this.LIZLLL;
                if (i2 == 2) {
                    if (C444960Hcc.LIZIZ()) {
                        SpannableStringBuilder spannableStringBuilder = this.LIZJ;
                        if (spannableStringBuilder != null) {
                            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
                        }
                    } else {
                        SpannableStringBuilder spannableStringBuilder2 = this.LIZJ;
                        if (spannableStringBuilder2 != null) {
                            C786410Ut5.q2(spannableStringBuilder2, c419890GdHLIZIZ, 2, 3, 17);
                        }
                    }
                } else if (i2 == 4) {
                    if (C1EDI.LIZIZ()) {
                        SpannableStringBuilder spannableStringBuilder3 = this.LIZJ;
                        if (spannableStringBuilder3 != null) {
                            C786410Ut5.q2(spannableStringBuilder3, c419890GdHLIZIZ, 4, 5, 17);
                        }
                    } else {
                        SpannableStringBuilder spannableStringBuilder4 = this.LIZJ;
                        if (spannableStringBuilder4 != null) {
                            C786410Ut5.q2(spannableStringBuilder4, c419890GdHLIZIZ, 2, 3, 17);
                        }
                    }
                } else if (C1EDI.LIZIZ()) {
                    SpannableStringBuilder spannableStringBuilder5 = this.LIZJ;
                    if (spannableStringBuilder5 != null) {
                        C786410Ut5.q2(spannableStringBuilder5, c419890GdHLIZIZ, 3, 4, 17);
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder6 = this.LIZJ;
                    if (spannableStringBuilder6 != null) {
                        C786410Ut5.q2(spannableStringBuilder6, c419890GdHLIZIZ, 1, 2, 17);
                    }
                }
                this.LIZIZ.setText(this.LIZJ);
            } else {
                if (this.LIZ != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_chevron_down_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                    tuxIconDrawableLIZ = c419910GdJ2.LIZ(this.LIZ);
                } else {
                    tuxIconDrawableLIZ = null;
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("hideAlertBadge, drawableRes: , titleSpan: ");
                sbLIZ2.append((Object) this.LIZJ);
                C1720106oR.LJI("NBNicknameBPManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (tuxIconDrawableLIZ != null) {
                    tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                }
                if (C444960Hcc.LIZIZ()) {
                    this.LIZIZ.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
                } else {
                    this.LIZIZ.setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
                }
                this.LIZIZ.setCompoundDrawablePadding((int) C12ES.LIZJ(2.0f, this.LIZ));
            }
            LJII = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0GWi] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.0GdE] */
    public final void LJII() {
        TuxIconDrawable tuxIconDrawableLIZJ;
        if (this.LIZJ == null) {
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = LIZIZ(this.LJ);
            if (!C0BXV.LIZ()) {
                LJFF((Drawable) c259800zU.element);
            } else {
                if (c259800zU.element == 0 || (tuxIconDrawableLIZJ = LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)))) == null) {
                    return;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("nickname height: ");
                sbLIZ.append(this.LIZIZ.getHeight());
                C1720106oR.LJI("NBNicknameBPManager", C2188811AlT.LIZIZ(sbLIZ));
                c259800zU.element = new C419860GdE(tuxIconDrawableLIZJ, (Drawable) c259800zU.element);
                TuxTextView tuxTextView = this.LIZIZ;
                if (tuxTextView == null || tuxTextView.getHeight() <= 0) {
                    HandlerHook.viewPost(this.LIZIZ, new ARunnableS75S0200000_6(this, c259800zU, 116));
                } else {
                    LJI((Drawable) c259800zU.element);
                }
            }
            LJII = true;
            EnumC1584360rKc enumC1584360rKc = C1249980idI.LIZ;
            C1249980idI.LIZ(this.LJ);
            return;
        }
        int i2 = this.LJ;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getBadgeSpan count: ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", maxCount: ");
        sbLIZ2.append(9);
        C1720106oR.LJI("NBNicknameBPManager", C2188811AlT.LIZIZ(sbLIZ2));
        Drawable drawableLIZIZ = LIZIZ(i2);
        if (drawableLIZIZ != null) {
            if (C0BXV.LIZ()) {
                TuxIconDrawable tuxIconDrawableLIZJ2 = LIZJ(this.LJFF, this.LJI);
                if (tuxIconDrawableLIZJ2 == null) {
                    return;
                }
                C419860GdE c419860GdE = new C419860GdE(tuxIconDrawableLIZJ2, drawableLIZIZ);
                TuxTextView tuxTextView2 = this.LIZIZ;
                if (tuxTextView2 == null) {
                    return;
                }
                c419860GdE.setBounds(0, 0, c419860GdE.getIntrinsicWidth(), tuxTextView2.getHeight() > 0 ? this.LIZIZ.getHeight() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                C1720106oR.LJI("NBNicknameBPManager", "getBadgeSpan width: " + c419860GdE.getIntrinsicWidth() + ", height: " + c419860GdE.getIntrinsicHeight());
                drawableLIZIZ = c419860GdE;
            }
            C419890GdH c419890GdH = new C419890GdH(drawableLIZIZ, 2);
            c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C444960Hcc.LIZIZ());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("showAlertBadge, badgeSpan: , titleSpan: ");
            sbLIZ3.append((Object) this.LIZJ);
            C1720106oR.LJI("NBNicknameBPManager", C2188811AlT.LIZIZ(sbLIZ3));
            int i4 = this.LIZLLL;
            if (i4 == 2) {
                if (C444960Hcc.LIZIZ()) {
                    SpannableStringBuilder spannableStringBuilder = this.LIZJ;
                    if (spannableStringBuilder != null) {
                        C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 17);
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = this.LIZJ;
                    if (spannableStringBuilder2 != null) {
                        C786410Ut5.q2(spannableStringBuilder2, c419890GdH, 2, 3, 17);
                    }
                }
            } else if (i4 == 4) {
                if (C1EDI.LIZIZ()) {
                    SpannableStringBuilder spannableStringBuilder3 = this.LIZJ;
                    if (spannableStringBuilder3 != null) {
                        C786410Ut5.q2(spannableStringBuilder3, c419890GdH, 4, 5, 17);
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = this.LIZJ;
                    if (spannableStringBuilder4 != null) {
                        C786410Ut5.q2(spannableStringBuilder4, c419890GdH, 2, 3, 17);
                    }
                }
            } else if (C1EDI.LIZIZ()) {
                SpannableStringBuilder spannableStringBuilder5 = this.LIZJ;
                if (spannableStringBuilder5 != null) {
                    C786410Ut5.q2(spannableStringBuilder5, c419890GdH, 3, 4, 17);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder6 = this.LIZJ;
                if (spannableStringBuilder6 != null) {
                    C786410Ut5.q2(spannableStringBuilder6, c419890GdH, 1, 2, 17);
                }
            }
            this.LIZIZ.setText(this.LIZJ);
            EnumC1584360rKc enumC1584360rKc2 = C1249980idI.LIZ;
            C1249980idI.LIZ(this.LJ);
        }
    }

    public final void LJ() {
        this.LJ = C1903780zdo.LJFF();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nicknameNoticeCountShowRefresh multiUserNoticeCount: ");
        sbLIZ.append(this.LJ);
        C1720106oR.LJI("NBNicknameBPManager", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = this.LJ;
        if (i2 < 0) {
            return;
        }
        if (i2 > 0) {
            LJII();
        } else {
            LIZLLL();
        }
    }

    public final C416900GWi LIZIZ(int i) {
        String strValueOf;
        TypedArray typedArrayObtainStyledAttributes;
        C416900GWi c416900GWi = null;
        if (i <= 0) {
            return null;
        }
        Context context = this.LIZ;
        if (context != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxAlertBadge, R.attr.xd, 0)) != null) {
            c416900GWi = new C416900GWi(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge__tux_badgeFont, 0), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeTextColor, -1), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeBackgroundColor, -16777216), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxAlertBadge_tux_badgeDotSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
            typedArrayObtainStyledAttributes.recycle();
        }
        if (!C0BXV.LIZ()) {
            if (c416900GWi != null) {
                if (i > 9) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(9);
                    sbLIZ.append('+');
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strValueOf = String.valueOf(i);
                }
                c416900GWi.LJII = strValueOf;
                c416900GWi.LIZ();
                c416900GWi.setBounds(0, 0, c416900GWi.LJI, c416900GWi.LJFF);
            }
        } else if (c416900GWi != null) {
            c416900GWi.LIZ();
            c416900GWi.setBounds(0, 0, c416900GWi.LJI, c416900GWi.LJFF);
        }
        return c416900GWi;
    }

    public final void LJFF(Drawable drawable) {
        if (drawable != null) {
            if (C444960Hcc.LIZIZ()) {
                this.LIZIZ.setCompoundDrawables(drawable, null, null, null);
            } else {
                this.LIZIZ.setCompoundDrawables(null, null, drawable, null);
            }
            this.LIZIZ.setCompoundDrawablePadding((int) C12ES.LIZJ(2.0f, this.LIZ));
        }
    }

    public final void LJI(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.LIZIZ.getHeight());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showAlertBadge, alertBadgeDrawable: , titleSpan: ");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(", width: ");
        sbLIZ.append(drawable.getIntrinsicWidth());
        sbLIZ.append(", height: ");
        sbLIZ.append(drawable.getIntrinsicHeight());
        C1720106oR.LJI("NBNicknameBPManager", C2188811AlT.LIZIZ(sbLIZ));
        LJFF(drawable);
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNicknameNoticeCountShowRefreshEvent(C0HZO c0hzo) {
        if (C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
            LJ();
        } else {
            LIZLLL();
        }
    }

    public final TuxIconDrawable LIZJ(int i, int i2) {
        Context context = this.LIZ;
        if (context != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_down_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            if (tuxIconDrawableLIZ != null) {
                tuxIconDrawableLIZ.setBounds(0, 0, i, i2);
            }
            return tuxIconDrawableLIZ;
        }
        return null;
    }

    public static void LIZ(C0HZK c0hzk, SpannableStringBuilder spannableStringBuilder, int i) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c0hzk.LIZJ = spannableStringBuilder;
        c0hzk.LJFF = iLIZIZ;
        c0hzk.LJI = iLIZIZ2;
        c0hzk.LIZLLL = i;
        if (spannableStringBuilder != null) {
            c0hzk.LIZIZ.setText(spannableStringBuilder);
            LJII = false;
        }
    }

    public C0HZK(Context context, TuxTextView tuxTextView, SpannableStringBuilder spannableStringBuilder, int i) {
        this.LIZ = context;
        this.LIZIZ = tuxTextView;
        this.LIZJ = spannableStringBuilder;
        this.LIZLLL = i;
        EventBus.LIZLLL().LJIJJ(this);
        this.LJ = 0;
        LJII = false;
    }
}
