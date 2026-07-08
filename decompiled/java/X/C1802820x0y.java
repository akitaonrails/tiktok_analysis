package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0x0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802820x0y extends AbstractC1802900x16 implements InterfaceC1802940x1A {
    public static final Map<Integer, InterfaceC782330UmV> LJIIZILJ = C2097608Jq.LJIIIIZZ(new Pair(0, new C1802950x1B()), new Pair(1, new C782310UmT()));
    public final Context LIZ;
    public final InterfaceC1802860x12 LIZIZ;
    public SpannableStringBuilder LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Map<String, ? extends CustomErrorExtra.PopContentReplace> LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public Runnable LJIIJJI;
    public Runnable LJIIL;
    public final C1802410x0J LJIILIIL;
    public final CustomErrorExtra LJIILJJIL;
    public final String LJIILL;
    public final InterfaceC782330UmV LJIILLIIL;

    @Override // X.InterfaceC1802940x1A
    public final void LIZ(String str) {
        InterfaceC1802860x12 interfaceC1802860x12 = this.LIZIZ;
        if (interfaceC1802860x12 != null) {
            interfaceC1802860x12.LIZJ();
        }
        LIZIZ(str, "secondary_cta");
    }

    public final void LIZIZ(String str, String str2) {
        String strLJIIJJI;
        C499950Jj7 c499950Jj7 = new C499950Jj7(str);
        C1802410x0J c1802410x0J = this.LJIILIIL;
        if (c1802410x0J != null) {
            int i = c1802410x0J.LIZIZ;
            if (i != 4005189 && i != 4005272) {
                C1803800x2Y.LIZ.getClass();
                strLJIIJJI = C1803800x2Y.LJIIJJI(c1802410x0J);
            } else {
                strLJIIJJI = "wallet_appeal";
            }
            c499950Jj7.LIZIZ.LIZJ("enter_from", strLJIIJJI);
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            CustomErrorExtra customErrorExtra = this.LJIILJJIL;
            String str3 = this.LJIILL;
            c1803800x2Y.getClass();
            C1803800x2Y.LJJIJIIJIL(c1802410x0J, str, str2, customErrorExtra, str3);
        }
        C1797270ws1.LIZLLL().LIZIZ(this.LIZ, c499950Jj7);
    }

    public C1802820x0y(Context context, CustomErrorExtra customErrorExtra, InterfaceC1802860x12 interfaceC1802860x12, C1802410x0J c1802410x0J, String str) {
        super(interfaceC1802860x12);
        this.LIZ = context;
        this.LIZIZ = interfaceC1802860x12;
        this.LJ = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJIIIZ = 1;
        this.LIZLLL = customErrorExtra.getPopUpTitle();
        String popUpContent = customErrorExtra.getPopUpContent();
        this.LJ = popUpContent == null ? "" : popUpContent;
        String popUpDismiss = customErrorExtra.getPopUpDismiss();
        this.LJFF = popUpDismiss == null ? "" : popUpDismiss;
        String popUpPrimaryCTA = customErrorExtra.getPopUpPrimaryCTA();
        this.LJI = popUpPrimaryCTA != null ? popUpPrimaryCTA : "";
        this.LJII = customErrorExtra.getPopUpPrimaryCTASchema();
        this.LJIIIIZZ = customErrorExtra.getContentReplace();
        InterfaceC782330UmV interfaceC782330UmV = LJIIZILJ.get(Integer.valueOf(customErrorExtra.getPopUpStyle()));
        this.LJIILLIIL = interfaceC782330UmV == null ? new C1802950x1B() : interfaceC782330UmV;
        this.LJIIIZ = customErrorExtra.getPopUpDismissAction().intValue();
        this.LJIIJ = customErrorExtra.getPopUpPrimaryAction().intValue();
        customErrorExtra.getExtraEntity();
        this.LJIILIIL = c1802410x0J;
        this.LJIILJJIL = customErrorExtra;
        this.LJIILL = str;
    }
}
