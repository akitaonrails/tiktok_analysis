package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("account_gsma_require_dialog")
public final class C1245960iWo extends AbstractC20659615so<C1397510mTF> {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function0<Unit> LLIZ;
    public final Function0<Unit> LLIZLLLIL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        String string;
        CharSequence string2;
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        String str = this.LLILLJJLI;
        if (str != null && str.length() != 0) {
            string = this.LLILLJJLI;
        } else {
            string = this.LL.getString(2131835423);
        }
        c1397580mTM.LJI(string);
        String str2 = this.LLILLL;
        if (str2 != null && str2.length() != 0) {
            string2 = this.LLILLL;
        } else {
            string2 = this.LL.getString(2131835421);
        }
        if (this.LLILZ != null && this.LLILZIL != null) {
            C444940Hca c444940Hca = new C444940Hca();
            c444940Hca.LIZJ = this.LLILZ;
            c444940Hca.LIZLLL(1);
            c444940Hca.LIZIZ = false;
            c444940Hca.LIZIZ(42);
            c444940Hca.LJIIIIZZ = new AwS563S0100000_19(this, 38);
            SpannableString spannableString = new SpannableString(c444940Hca.LIZ(this.LL));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            int iLJJJ = a0.LJJJ(string2, "{s_link}", 0, false, 6);
            if (iLJJJ != -1) {
                spannableStringBuilder.replace(iLJJJ, iLJJJ + 8, (CharSequence) spannableString);
            }
            string2 = SpannableString.valueOf(spannableStringBuilder);
        }
        c1397580mTM.LIZIZ(string2);
        c1397580mTM.LJIIIIZZ = true;
        C1238130iKB.LIZ(c1397580mTM, new AwS598S0100000_19(this, 47));
        c1397580mTM.LIZLLL(new AwS598S0100000_19(this, 48));
        return new C1397510mTF(c1397580mTM);
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        super.showPopupFailed(i, str);
        this.LLIZ.invoke();
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    public C1245960iWo(C19EG c19eg, String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = function0;
        this.LLIZ = function02;
        this.LLIZLLLIL = function03;
    }
}
