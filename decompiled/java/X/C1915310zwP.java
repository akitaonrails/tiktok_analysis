package X;

import Y.ACListenerS130S0200000_28;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.appdiff.ISettingsCommonAppDiffProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.0zwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("creator_app_invitation_bottom_banner")
public final class C1915310zwP extends AbstractC20660815t0 {
    public final ViewGroup LL;
    public C20515215Pi LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 16;
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        if (!super.canShow()) {
            return false;
        }
        ISettingsCommonAppDiffProtocol.LIZ.getClass();
        C1865280ydi.LIZIZ.LIZ();
        return true;
    }

    public C1915310zwP(ViewGroup viewGroup, C0TGX c0tgx) {
        super(c0tgx);
        this.LL = viewGroup;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        String strLIZIZ = C555520LqY.LIZIZ(2131839486);
        String strLIZIZ2 = C555520LqY.LIZIZ(2131839487);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strLIZIZ);
        spannableStringBuilder.append((CharSequence) " ");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-65536);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) strLIZIZ2);
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        C786410Ut5.q2(spannableStringBuilder, styleSpan, length, spannableStringBuilder.length(), 17);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        C20515215Pi c20515215Pi = new C1257230ioz(this.LL, true).LIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_tiktok_studio;
        c20515215Pi.LJFF(c419910GdJ);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJFF = spannedString;
        c1057450dcl.LJIIJ = 0;
        c1057450dcl.LJIILIIL = new ACListenerS130S0200000_28(this, c688120Qyw, 49);
        c20515215Pi.LIZ.LJIILJJIL = new AwS394S0200000_28(this, c20656615sK, 79);
        this.LLILLJJLI = c20515215Pi;
        c20515215Pi.LJ();
    }
}
