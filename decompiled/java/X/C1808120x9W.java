package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808120x9W {
    public static void LIZ(InterfaceC1808130x9X interfaceC1808130x9X, C1782830wUj c1782830wUj) {
        int iLIZIZ;
        int i;
        int i2;
        int i3 = c1782830wUj.LL;
        switch (i3) {
            case 7:
            case 8:
                if (interfaceC1808130x9X.LJJI()) {
                    C1749280vcc statusView = interfaceC1808130x9X.getStatusView();
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
                    c419910GdJ.LIZ = R.raw.icon_large_person;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                    c1722300uv6.LIZJ = 0;
                    c1722300uv6.LIZIZ = c419910GdJ;
                    Context contextLLIL = interfaceC1808130x9X.LLIL();
                    int i4 = c1782830wUj.LL;
                    if (i4 != 7) {
                        if (i4 != 8) {
                            i = R.string.uikit_no_following;
                        } else if (c1782830wUj.LLILLJJLI) {
                            i = 2131857686;
                        } else {
                            i = 2131857700;
                        }
                    } else if (c1782830wUj.LLILLJJLI) {
                        i = 2131834733;
                    } else {
                        i = 2131857698;
                    }
                    c1722300uv6.LJI = contextLLIL.getString(i);
                    Context contextLLIL2 = interfaceC1808130x9X.LLIL();
                    int i5 = c1782830wUj.LL;
                    if (i5 != 7) {
                        if (i5 != 8) {
                            i2 = 2131857689;
                        } else if (c1782830wUj.LLILLJJLI) {
                            i2 = 2131857687;
                        } else {
                            i2 = 2131857701;
                        }
                    } else if (c1782830wUj.LLILLJJLI) {
                        i2 = 2131834842;
                    } else {
                        i2 = 2131857699;
                    }
                    c1722300uv6.LJIIIIZZ = contextLLIL2.getString(i2);
                    statusView.setStatus(c1722300uv6);
                    interfaceC1808130x9X.LJII();
                }
                ViewGroup.LayoutParams layoutParams = interfaceC1808130x9X.getStatusView().getLayoutParams();
                if (TextUtils.isEmpty(c1782830wUj.LLILLL)) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(320.0f)));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(400.0f)));
                }
                layoutParams.height = iLIZIZ;
                C786410Ut5.U6(interfaceC1808130x9X.getStatusView(), layoutParams);
                C786410Ut5.LLLZLZ(interfaceC1808130x9X.getStatusView(), 0);
                C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                ViewGroup.LayoutParams layoutParams2 = interfaceC1808130x9X.getStatusView().getLayoutParams();
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(155.0f)));
                C786410Ut5.U6(interfaceC1808130x9X.getStatusView(), layoutParams2);
                C786410Ut5.LLLZLZ(interfaceC1808130x9X.getStatusView(), 0);
                C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 8);
                break;
            default:
                switch (i3) {
                    case 25:
                        if (!c1782830wUj.LLILLJJLI) {
                            C786410Ut5.LLLZLZ(interfaceC1808130x9X.getStatusView(), 8);
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 0);
                            final String str = c1782830wUj.LLILZ;
                            new AbstractC1223210hw7(str) { // from class: X.07sY
                                public final String LIZIZ;

                                @Override // X.AbstractC1223210hw7
                                public final String LIZ() {
                                    return "fans_list_cutoff_notice_show";
                                }

                                public final boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return (obj instanceof C2000407sY) && Intrinsics.LJFF(this.LIZIZ, ((C2000407sY) obj).LIZIZ);
                                }

                                public final int hashCode() {
                                    return this.LIZIZ.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("FollowerListCutoffTracker(toUserId=");
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append(')');
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                @Override // X.AbstractC1223210hw7
                                public final Map<String, String> LIZIZ() {
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJIIIIZZ("to_user_id", this.LIZIZ);
                                    return c2344009Gk.LIZ;
                                }

                                {
                                    this.LIZIZ = str;
                                }
                            }.LIZLLL(null);
                            interfaceC1808130x9X.o3().setText(interfaceC1808130x9X.LLIL().getString(2131834798, 50, C1843500y4a.LIZIZ(c1782830wUj.LLILZLL)));
                        } else {
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 8);
                        }
                        break;
                    case 26:
                        if (!c1782830wUj.LLILLJJLI) {
                            C786410Ut5.LLLZLZ(interfaceC1808130x9X.getStatusView(), 8);
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 0);
                            String strJ4 = C786410Ut5.j4(C1216270hkv.LIZJ(2131834797), Arrays.copyOf(new Object[]{c1782830wUj.LLILZIL}, 1));
                            int iLJJJ = a0.LJJJ(strJ4, c1782830wUj.LLILZIL, 0, false, 6);
                            if (iLJJJ >= 0) {
                                TuxTextView tuxTextViewO3 = interfaceC1808130x9X.o3();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
                                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), iLJJJ, c1782830wUj.LLILZIL.length() + iLJJJ, 17);
                                tuxTextViewO3.setText(spannableStringBuilder);
                            }
                        } else {
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 8);
                        }
                        break;
                    case 27:
                        if (!c1782830wUj.LLILLJJLI) {
                            C786410Ut5.LLLZLZ(interfaceC1808130x9X.getStatusView(), 8);
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 0);
                            interfaceC1808130x9X.o3().setText(interfaceC1808130x9X.LLIL().getString(2131834796, String.valueOf(c1782830wUj.LLIZLLLIL), C1843500y4a.LIZIZ(c1782830wUj.LLIZ)));
                        } else {
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 8);
                        }
                        break;
                    case 28:
                        if (!c1782830wUj.LLILLJJLI) {
                            C786410Ut5.LLLZLZ(interfaceC1808130x9X.getStatusView(), 8);
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 0);
                            String strJ42 = C786410Ut5.j4(C1216270hkv.LIZJ(2131834795), Arrays.copyOf(new Object[]{c1782830wUj.LLILZIL}, 1));
                            int iLJJJ2 = a0.LJJJ(strJ42, c1782830wUj.LLILZIL, 0, false, 6);
                            if (iLJJJ2 >= 0) {
                                TuxTextView tuxTextViewO32 = interfaceC1808130x9X.o3();
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strJ42);
                                C786410Ut5.q2(spannableStringBuilder2, new C444920HcY(62, false), iLJJJ2, c1782830wUj.LLILZIL.length() + iLJJJ2, 17);
                                tuxTextViewO32.setText(spannableStringBuilder2);
                            }
                        } else {
                            C786410Ut5.LLLLZLL(interfaceC1808130x9X.o3(), 8);
                        }
                        break;
                }
                break;
        }
    }
}
