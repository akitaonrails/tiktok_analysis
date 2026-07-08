package X;

import Y.ARunnableS39S0300000_6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0HZL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZL {
    public static boolean LJI;
    public final Context LIZ;
    public final C0HZN LIZIZ;
    public int LIZJ = 1;
    public int LIZLLL;
    public TuxTextView LJ;
    public SpannableStringBuilder LJFF;

    public final void LIZ() {
        TuxIconDrawable tuxIconDrawableLIZ;
        int i;
        if (LJI) {
            C0HZN c0hzn = this.LIZIZ;
            if (c0hzn != null) {
                c0hzn.LIZIZ();
            }
            TuxTextView tuxTextView = this.LJ;
            if (tuxTextView == null) {
                return;
            }
            C419890GdH c419890GdHLIZIZ = null;
            if (tuxTextView.getCompoundDrawables()[0] == null && tuxTextView.getCompoundDrawables()[2] == null) {
                Context context = this.LIZ;
                if (context != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_down_fill;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hideAlertBadge, downFillIconSpan: , titleSpan: ");
                sbLIZ.append((Object) this.LJFF);
                sbLIZ.append(", nameStyle=");
                sbLIZ.append(this.LIZJ);
                C1720106oR.LJI("ProfileInfoNicknameBadgeManager", C2188811AlT.LIZIZ(sbLIZ));
                if (c419890GdHLIZIZ != null) {
                    c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C444960Hcc.LIZIZ());
                }
                if (C268330AfP.LJIIIIZZ() && ((i = this.LIZJ) == 2 || i == 1)) {
                    LIZJ(this.LJFF, c419890GdHLIZIZ);
                } else {
                    int i3 = this.LIZJ;
                    if (i3 == 2) {
                        if (C444960Hcc.LIZIZ()) {
                            SpannableStringBuilder spannableStringBuilder = this.LJFF;
                            if (spannableStringBuilder != null) {
                                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
                            }
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = this.LJFF;
                            if (spannableStringBuilder2 != null) {
                                C786410Ut5.q2(spannableStringBuilder2, c419890GdHLIZIZ, 2, 3, 17);
                            }
                        }
                    } else if (i3 == 4) {
                        if (C1EDI.LIZIZ()) {
                            SpannableStringBuilder spannableStringBuilder3 = this.LJFF;
                            if (spannableStringBuilder3 != null) {
                                C786410Ut5.q2(spannableStringBuilder3, c419890GdHLIZIZ, 4, 5, 17);
                            }
                        } else {
                            SpannableStringBuilder spannableStringBuilder4 = this.LJFF;
                            if (spannableStringBuilder4 != null) {
                                C786410Ut5.q2(spannableStringBuilder4, c419890GdHLIZIZ, 2, 3, 17);
                            }
                        }
                    } else if (C1EDI.LIZIZ()) {
                        SpannableStringBuilder spannableStringBuilder5 = this.LJFF;
                        if (spannableStringBuilder5 != null) {
                            C786410Ut5.q2(spannableStringBuilder5, c419890GdHLIZIZ, 3, 4, 17);
                        }
                    } else {
                        SpannableStringBuilder spannableStringBuilder6 = this.LJFF;
                        if (spannableStringBuilder6 != null) {
                            C786410Ut5.q2(spannableStringBuilder6, c419890GdHLIZIZ, 1, 2, 17);
                        }
                    }
                }
                tuxTextView.setText(this.LJFF);
            } else {
                if (this.LIZ != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_chevron_down_fill;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                    tuxIconDrawableLIZ = c419910GdJ2.LIZ(this.LIZ);
                } else {
                    tuxIconDrawableLIZ = null;
                }
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("hideAlertBadge, drawableRes: , titleSpan: ");
                sbLIZ2.append((Object) this.LJFF);
                C1720106oR.LJI("ProfileInfoNicknameBadgeManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (tuxIconDrawableLIZ != null) {
                    tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                }
                if (C444960Hcc.LIZIZ()) {
                    tuxTextView.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
                } else {
                    tuxTextView.setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
                }
                tuxTextView.setCompoundDrawablePadding((int) C12ES.LIZJ(2.0f, this.LIZ));
            }
            LJI = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, X.0GWi] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.0GdE] */
    public final void LIZIZ(boolean z) {
        Drawable drawable;
        int i;
        if (!C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nicknameNoticeCountShowRefresh, isRefreshUI: ");
        sbLIZ.append(z);
        sbLIZ.append(" , multiUserNoticeCount: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("， newCount: ");
        sbLIZ.append(C1903780zdo.LJFF());
        C1720106oR.LJI("ProfileInfoNicknameBadgeManager", C2188811AlT.LIZIZ(sbLIZ));
        int iLJFF = C1903780zdo.LJFF();
        this.LIZLLL = iLJFF;
        if (iLJFF < 0) {
            return;
        }
        if (iLJFF > 0) {
            if (!LJI) {
                C0HZN c0hzn = this.LIZIZ;
                if (c0hzn != null) {
                    c0hzn.LIZ(iLJFF);
                }
                TuxTextView tuxTextView = this.LJ;
                if (tuxTextView != null) {
                    if (tuxTextView.getCompoundDrawables()[0] == null && tuxTextView.getCompoundDrawables()[2] == null) {
                        C419890GdH c419890GdHLIZIZ = C419880GdG.LIZIZ(this.LIZ, this.LIZLLL, tuxTextView, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        if (c419890GdHLIZIZ != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("showAlertBadge, badgeSpan: , titleSpan: ");
                            sbLIZ2.append((Object) this.LJFF);
                            sbLIZ2.append(", nameStyle=");
                            sbLIZ2.append(this.LIZJ);
                            C1720106oR.LJI("ProfileInfoNicknameBadgeManager", C2188811AlT.LIZIZ(sbLIZ2));
                            if (C268330AfP.LJIIIIZZ() && ((i = this.LIZJ) == 2 || i == 1)) {
                                LIZJ(this.LJFF, c419890GdHLIZIZ);
                            } else {
                                int i3 = this.LIZJ;
                                if (i3 == 2) {
                                    if (C444960Hcc.LIZIZ()) {
                                        SpannableStringBuilder spannableStringBuilder = this.LJFF;
                                        if (spannableStringBuilder != null) {
                                            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, 1, 17);
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = this.LJFF;
                                        if (spannableStringBuilder2 != null) {
                                            C786410Ut5.q2(spannableStringBuilder2, c419890GdHLIZIZ, 2, 3, 17);
                                        }
                                    }
                                } else if (i3 == 4) {
                                    if (C1EDI.LIZIZ()) {
                                        SpannableStringBuilder spannableStringBuilder3 = this.LJFF;
                                        if (spannableStringBuilder3 != null) {
                                            C786410Ut5.q2(spannableStringBuilder3, c419890GdHLIZIZ, 4, 5, 17);
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder4 = this.LJFF;
                                        if (spannableStringBuilder4 != null) {
                                            C786410Ut5.q2(spannableStringBuilder4, c419890GdHLIZIZ, 2, 3, 17);
                                        }
                                    }
                                } else if (C1EDI.LIZIZ()) {
                                    SpannableStringBuilder spannableStringBuilder5 = this.LJFF;
                                    if (spannableStringBuilder5 != null) {
                                        C786410Ut5.q2(spannableStringBuilder5, c419890GdHLIZIZ, 3, 4, 17);
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder6 = this.LJFF;
                                    if (spannableStringBuilder6 != null) {
                                        C786410Ut5.q2(spannableStringBuilder6, c419890GdHLIZIZ, 1, 2, 17);
                                    }
                                }
                            }
                            tuxTextView.setText(this.LJFF);
                            LJI = true;
                            EnumC1584360rKc enumC1584360rKc = C1249980idI.LIZ;
                            C1249980idI.LIZ(this.LIZLLL);
                            return;
                        }
                        return;
                    }
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = C419880GdG.LIZ(this.LIZLLL, this.LIZ);
                    if (C0BXV.LIZ()) {
                        if (c259800zU.element == 0) {
                            return;
                        }
                        if (C444960Hcc.LIZIZ()) {
                            drawable = tuxTextView.getCompoundDrawables()[0];
                        } else {
                            drawable = tuxTextView.getCompoundDrawables()[2];
                        }
                        c259800zU.element = new C419860GdE(drawable, (Drawable) c259800zU.element);
                        if (tuxTextView.getHeight() > 0) {
                            LJ((Drawable) c259800zU.element, tuxTextView);
                            return;
                        } else {
                            HandlerHook.viewPost(tuxTextView, new ARunnableS39S0300000_6(this, c259800zU, tuxTextView, 23));
                            return;
                        }
                    }
                    LIZLLL((Drawable) c259800zU.element, tuxTextView);
                    return;
                }
                return;
            }
            return;
        }
        LIZ();
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onNicknameNoticeCountShowRefreshEvent(C0HZO c0hzo) {
        if (C0XQ7.LIZJ().isEnableMultiAccountLogin()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileInfoNicknameBadgeManager", "onNicknameNoticeCountShowRefreshEvent");
            LIZIZ(false);
            return;
        }
        LIZ();
    }

    public C0HZL(Context context, C0HZM c0hzm) {
        this.LIZ = context;
        this.LIZIZ = c0hzm;
        EventBus.LIZLLL().LJIJJ(this);
        this.LIZLLL = 0;
        LJI = false;
    }

    public static void LIZJ(SpannableStringBuilder spannableStringBuilder, C419890GdH c419890GdH) {
        C419890GdH c419890GdH2;
        Boolean boolValueOf = null;
        boolean z = false;
        int i = 1;
        if (spannableStringBuilder != null && c419890GdH != null && spannableStringBuilder.length() != 0) {
            C419890GdH[] c419890GdHArr = (C419890GdH[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C419890GdH.class);
            if (c419890GdHArr != null && c419890GdHArr.length != 0) {
                if (C444960Hcc.LIZIZ()) {
                    if (c419890GdHArr.length != 0) {
                        c419890GdH2 = c419890GdHArr[0];
                        int length = c419890GdHArr.length - 1;
                        if (length != 0) {
                            int spanStart = spannableStringBuilder.getSpanStart(c419890GdH2);
                            if (1 <= length) {
                                while (true) {
                                    C419890GdH c419890GdH3 = c419890GdHArr[i];
                                    int spanStart2 = spannableStringBuilder.getSpanStart(c419890GdH3);
                                    if (spanStart > spanStart2) {
                                        c419890GdH2 = c419890GdH3;
                                        spanStart = spanStart2;
                                    }
                                    if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else if (c419890GdHArr.length != 0) {
                    c419890GdH2 = c419890GdHArr[0];
                    int length2 = c419890GdHArr.length - 1;
                    if (length2 != 0) {
                        int spanEnd = spannableStringBuilder.getSpanEnd(c419890GdH2);
                        if (1 <= length2) {
                            while (true) {
                                C419890GdH c419890GdH4 = c419890GdHArr[i];
                                int spanEnd2 = spannableStringBuilder.getSpanEnd(c419890GdH4);
                                if (spanEnd < spanEnd2) {
                                    c419890GdH2 = c419890GdH4;
                                    spanEnd = spanEnd2;
                                }
                                if (i == length2) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
                if (c419890GdH2 != null) {
                    int spanStart3 = spannableStringBuilder.getSpanStart(c419890GdH2);
                    int spanEnd3 = spannableStringBuilder.getSpanEnd(c419890GdH2);
                    if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                        spannableStringBuilder.removeSpan(c419890GdH2);
                        C786410Ut5.q2(spannableStringBuilder, c419890GdH, spanStart3, spanEnd3, 17);
                        return;
                    }
                    return;
                }
                return;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replaceTrailingIconSpanV2 no IconSpan: rtl=");
            sbLIZ.append(C444960Hcc.LIZIZ());
            sbLIZ.append(", length=");
            sbLIZ.append(spannableStringBuilder.length());
            sbLIZ.append(", sb=\"");
            sbLIZ.append((Object) spannableStringBuilder);
            sbLIZ.append('\"');
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("replaceTrailingIconSpanV2 skipped: sb=");
        sbLIZ2.append((Object) spannableStringBuilder);
        sbLIZ2.append(", newSpan=");
        sbLIZ2.append(c419890GdH);
        sbLIZ2.append(", isEmpty=");
        if (spannableStringBuilder != null) {
            if (spannableStringBuilder.length() == 0) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        sbLIZ2.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZLLL(Drawable drawable, TuxTextView tuxTextView) {
        if (drawable != null) {
            if (C444960Hcc.LIZIZ()) {
                tuxTextView.setCompoundDrawables(drawable, null, null, null);
            } else {
                tuxTextView.setCompoundDrawables(null, null, drawable, null);
            }
            tuxTextView.setCompoundDrawablePadding((int) C12ES.LIZJ(2.0f, this.LIZ));
            LJI = true;
            EnumC1584360rKc enumC1584360rKc = C1249980idI.LIZ;
            C1249980idI.LIZ(this.LIZLLL);
        }
    }

    public final void LJ(Drawable drawable, TuxTextView tuxTextView) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), tuxTextView.getHeight());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showAlertBadge, alertBadgeDrawable: , titleSpan: ");
        sbLIZ.append((Object) this.LJFF);
        sbLIZ.append(", width: ");
        sbLIZ.append(drawable.getIntrinsicWidth());
        sbLIZ.append(", height: ");
        sbLIZ.append(drawable.getIntrinsicHeight());
        C1720106oR.LJI("ProfileInfoNicknameBadgeManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL(drawable, tuxTextView);
    }
}
