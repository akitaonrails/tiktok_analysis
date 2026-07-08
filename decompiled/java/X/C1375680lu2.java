package X;

import Y.ACallableS67S1200000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375680lu2 extends AbstractC1376190lur implements InterfaceC1370310llN {
    public final Activity LL;
    public final Aweme LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C1375690lu3 LLILZLL = new C1375690lu3(this);

    @Override // X.InterfaceC1370310llN
    public final float LIZLLL() {
        return -1.0f;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJI() {
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJIILJJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIJJLI() {
        return 0;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJIJ(ImageView imageView, View view, int i) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJIL() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String LJJIZ() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJI(BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final Integer LJJJJIZL() {
        return null;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJJL() {
        return false;
    }

    @Override // X.InterfaceC1370450llb
    public final int LJJJJLI() {
        return 100;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJJLZIJ() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131831597;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean LJJLIIIJL() {
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "save";
    }

    @Override // X.InterfaceC1370310llN
    public final String label() {
        return "";
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIJJI() {
        return !enable() ? 1 : 0;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJII() {
        return R.raw.icon_arrow_down_to_line_bold;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_arrow_down_to_line;
    }

    @Override // X.InterfaceC1370310llN
    public final C0M7Z LJIIJ() {
        return C0M7Z.ShareButton;
    }

    @Override // X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return EnumC1216710hld.NORMAL;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIJJ(TextView textView) {
        C1370320llO.LJ(this, textView);
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
        return C1370320llO.LIZJ(enumC1369720lkQ);
    }

    @Override // X.AbstractC1376190lur
    public final void LJ(final Context context, C1376210lut c1376210lut) {
        String str;
        InterfaceC21168717sj interfaceC21168717sj = new InterfaceC21168717sj() { // from class: X.0ZOr
            @Override // X.InterfaceC21168717sj
            public final void onFailed() {
            }

            @Override // X.InterfaceC21168717sj
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC21168717sj
            public final void onStart() {
            }

            @Override // X.InterfaceC21168717sj
            public final void onCancel() {
                C1376270luz.LIZ.getClass();
                C1376270luz.LIZJ = false;
            }

            @Override // X.InterfaceC21168717sj
            public final void onSuccess(String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && C838410Wul.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    C1AF0.LJ(new IllegalStateException("try to download video, but no permission"));
                    return;
                }
                int awemeType = this.LLILLJJLI.getAwemeType();
                if (awemeType != 501) {
                    if (awemeType != 502) {
                        if (awemeType != 504) {
                            return;
                        }
                    } else {
                        Context context2 = context;
                        C0ZOP c0zop = new C0ZOP(this);
                        C013C c013c = new C013C();
                        c013c.element = true;
                        C15O7.LIZJ(new ACallableS67S1200000_3(context2, str2, c013c, 0)).LJ(new C2501409rA(c013c, c0zop, 0), C15O7.LJIIIIZZ, null);
                        return;
                    }
                }
                C1375680lu2 c1375680lu2 = this;
                c1375680lu2.getClass();
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C01OI(str2, null), 2);
                if (!C0ZOC.LIZ()) {
                    return;
                }
                C23250099c.LIZLLL(c817503Hh, C0PEM.LIZJ, null, new C0ZHG(c1375680lu2, null), 2);
            }
        };
        C1375690lu3 c1375690lu3 = this.LLILZLL;
        if (c1375690lu3 != null) {
            str = c1375690lu3.LL.LLILLL;
        } else {
            str = this.LLILLL;
        }
        C1379870m0n c1379870m0n = C1379870m0n.LIZ;
        Aweme aweme = this.LLILLJJLI;
        String str2 = this.LLILZ;
        int i = c1376210lut.LIZLLL;
        String str3 = this.LLILZIL;
        c1379870m0n.getClass();
        AbstractC1382550m57 abstractC1382550m57LIZ = C1379870m0n.LIZ(context, interfaceC21168717sj, aweme, str, str2, false, "download_action", i, "download", str3, 0, true);
        C21169617ss.LIZ.getClass();
        C21169617ss.LIZIZ(abstractC1382550m57LIZ);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        String str;
        SharePackage sharePackage;
        String string = baseSharePackage.extras.getString("enter_method");
        if (string == null) {
            string = "";
        }
        boolean zLJFF = Intrinsics.LJFF(string, "long_press");
        InterfaceC902170ZaJ interfaceC902170ZaJLJFF = C912070ZqH.LIZIZ.LJFF();
        if (this.LLILLJJLI.getAwemeType() == 501) {
            str = "image";
        } else {
            str = "video";
        }
        interfaceC902170ZaJLJFF.LJIILIIL(str, "save_to_local", zLJFF, null, C0I0B.LJFF.LIZIZ());
        if ((baseSharePackage instanceof SharePackage) && (sharePackage = (SharePackage) baseSharePackage) != null) {
            LIZ(this.LL, context, this.LLILLJJLI, sharePackage, this.LLILZ, this.LLILLL, this.LLILZLL, true);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZIZ(this, view, baseSharePackage);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
        C1370320llO.LIZLLL(context, baseSharePackage, this);
    }

    public C1375680lu2(Activity activity, Aweme aweme, String str, String str2, String str3) {
        this.LL = activity;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }
}
