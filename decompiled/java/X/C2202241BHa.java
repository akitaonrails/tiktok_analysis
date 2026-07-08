package X;

import Y.ACListenerS168S0100000_34;
import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.1BHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202241BHa implements C1BHL {
    public final Activity LL;
    public final String LLILLJJLI;
    public final Map<String, Object> LLILLL;
    public C1BHX LLILZ;
    public TuxTextView LLILZIL;
    public C1BHU LLILZLL;
    public AwS550S0100000_6 LLIZ;
    public C09AY LLIZLLLIL;

    @Override // X.C1BHH
    public final boolean LIZIZ() {
        C1BHX c1bhx = this.LLILZ;
        if (c1bhx != null) {
            return c1bhx.LIZIZ();
        }
        return false;
    }

    public final void LIZJ() {
        String string;
        String string2;
        this.LL.findViewById(R.id.g2r);
        this.LLILZIL = (TuxTextView) this.LL.findViewById(R.id.pol);
        C1BHU c1bhu = (C1BHU) this.LL.findViewById(R.id.y08);
        C1BHX c1bhx = null;
        String str = "";
        if (c1bhu != null) {
            c1bhu.setBackClickListener(new ACListenerS168S0100000_34(this, 29));
            c1bhu.setMoreButtonClickListener(new ACListenerS168S0100000_34(this, 30));
            Object obj = this.LLILLL.get("title");
            if (obj == null || (string2 = obj.toString()) == null) {
                string2 = "";
            }
            c1bhu.setTitle(string2);
            c1bhu.setCloseAllVisibility(4);
            ((ImageView) c1bhu.findViewById(R.id.loo)).setImageResource(R.drawable.d8z);
        } else {
            c1bhu = null;
        }
        this.LLILZLL = c1bhu;
        Object obj2 = this.LLILLL.get("enterFrom");
        if (obj2 != null && (string = obj2.toString()) != null) {
            str = string;
        }
        if (TextUtils.equals(str, "donation_sticker_consume")) {
            this.LL.findViewById(R.id.g2r).setBackgroundResource(R.drawable.amb);
            C1BHU c1bhu2 = this.LLILZLL;
            if (c1bhu2 != null) {
                c1bhu2.setBackgroundResource(R.drawable.amb);
            }
        }
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = this.LLILLJJLI;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402677760);
        C1BHX c1bhxLIZ = C1554300qY8.LIZ(this.LL, sparkThirdContext);
        if (c1bhxLIZ != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1bhxLIZ);
            c1bhxLIZ.setLayoutParams(layoutParams);
            c1bhxLIZ.setLoadCallback(new C2202311BHh() { // from class: X.1BHc
                @Override // X.C2202311BHh, X.InterfaceC2202301BHg
                public final void LIZ(int i, String str2) {
                }

                @Override // X.C2202311BHh, X.InterfaceC2202301BHg
                public final void LIZIZ(String str2) {
                    String string3;
                    Object obj3 = this.LIZ.LLILLL.get("enterFrom");
                    if (obj3 == null || (string3 = obj3.toString()) == null) {
                        string3 = "";
                    }
                    if (TextUtils.equals(string3, "org_detail_page")) {
                        C2202241BHa c2202241BHa = this.LIZ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (TextUtils.equals(UriProtector.parse(c2202241BHa.LLILLJJLI).getPath(), UriProtector.parse(str2).getPath())) {
                            TuxTextView tuxTextView = this.LIZ.LLILZIL;
                            if (tuxTextView != null) {
                                C786410Ut5.LLLLZLL(tuxTextView, 0);
                            }
                            TuxTextView tuxTextView2 = this.LIZ.LLILZIL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setTuxFont(33);
                            }
                            C2202241BHa c2202241BHa2 = this.LIZ;
                            TuxTextView tuxTextView3 = c2202241BHa2.LLILZIL;
                            if (tuxTextView3 != null) {
                                C786410Ut5.h9(tuxTextView3, new ACListenerS168S0100000_34(c2202241BHa2, 31));
                                return;
                            }
                            return;
                        }
                    }
                    TuxTextView tuxTextView4 = this.LIZ.LLILZIL;
                    if (tuxTextView4 == null) {
                        return;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView4, 8);
                }

                @Override // X.C2202311BHh, X.InterfaceC2202301BHg
                public final void LIZJ(String str2) {
                    TuxTextView tuxTextView = this.LIZ.LLILZIL;
                    if (tuxTextView != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 8);
                    }
                }
            });
            c1bhxLIZ.setWebTitleCallback(new InterfaceC1542320qEo() { // from class: X.1BHe
                @Override // X.InterfaceC1542320qEo
                public final void LIZJ(String str2, boolean z) {
                }

                @Override // X.InterfaceC1542320qEo
                public final void LIZ(String str2) {
                    C1BHU c1bhu3 = this.LIZ.LLILZLL;
                    if (c1bhu3 != null) {
                        c1bhu3.setSubTitle(str2);
                    }
                }

                @Override // X.InterfaceC1542320qEo
                public final void LIZIZ(String str2) {
                    C1BHU c1bhu3 = this.LIZ.LLILZLL;
                    if (c1bhu3 != null) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        c1bhu3.setTitle(str2);
                    }
                }
            });
            ((ViewGroup) this.LL.findViewById(R.id.web_view_container)).addView(c1bhxLIZ);
            c1bhx = c1bhxLIZ;
        }
        this.LLILZ = c1bhx;
        if (c1bhx != null) {
            c1bhx.LIZ(sparkThirdContext);
        }
    }

    @Override // X.C1BHH
    public final boolean canGoBack() {
        C1BHX c1bhx = this.LLILZ;
        if (c1bhx != null) {
            return c1bhx.canGoBack();
        }
        return false;
    }

    @Override // X.C1BHH
    public final void reload() {
        C1BHX c1bhx = this.LLILZ;
        if (c1bhx != null) {
            c1bhx.reload();
        }
    }

    @Override // X.C1BHL
    public final void LIZ(SparkThirdContext sparkThirdContext) {
        C1BHX c1bhx = this.LLILZ;
        if (c1bhx != null) {
            c1bhx.LIZ(sparkThirdContext);
        }
    }

    @Override // X.C1BHL
    public final void setLoadCallback(C2202311BHh c2202311BHh) {
        C1BHX c1bhx = this.LLILZ;
        if (c1bhx != null) {
            c1bhx.setLoadCallback(c2202311BHh);
        }
    }

    @Override // X.C1BHL
    public final void setWebTitleCallback(InterfaceC1542320qEo interfaceC1542320qEo) {
        C1BHX c1bhx = this.LLILZ;
        if (c1bhx != null) {
            c1bhx.setWebTitleCallback(interfaceC1542320qEo);
        }
    }

    public C2202241BHa(Activity activity, String str, Map<String, ? extends Object> map) {
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }
}
