package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.ILongPressVideoPrivacyService;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737040Sve extends AbstractC737180Svs {
    public final C735210Ssh LL;
    public final WeakReference<C0HTT<C737030Svd>> LLILLJJLI;
    public Function2<? super Boolean, ? super Exception, Unit> LLILLL;
    public final ILongPressVideoPrivacyService LLILZ = (ILongPressVideoPrivacyService) PluggableExtentionKt.pluggableSpi$default(ILongPressVideoPrivacyService.class, false, false, false, 14, null);

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "long_press_change_privacy_action";
    }

    public final int LJJIJLIJ() {
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(this.LL.LIZ);
        return (statusSafety == null || statusSafety.getPrivateStatus() == 1) ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.AbstractC737180Svs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LIZ() {
        /*
            r12 = this;
            int r1 = r12.LJJIJLIJ()
            r0 = 1
            if (r1 != r0) goto L6e
            r4 = 2131836869(0x7f113fc5, float:1.9306917E38)
        La:
            r3 = 2130774210(0x7f0108c2, float:1.7151588E38)
        Ld:
            X.0Ssh r0 = r12.LL
            android.content.Context r2 = r0.LIZIZ
            r1 = 2131565237(0x7f0d1ab5, float:1.8755982E38)
            r0 = 0
            android.view.View r5 = X.C786410Ut5.LJLLJ(r2, r1, r0)
            if (r5 == 0) goto L77
            r0 = 2131375690(0x7f0a364a, float:1.8371535E38)
            android.view.View r2 = r5.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r2 = (com.bytedance.tux.icon.TuxIconView) r2
            r1 = 0
            if (r2 == 0) goto L33
            X.C786410Ut5.LLLLLLZZ(r2, r1)
            r2.setIconRes(r3)
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            r2.setTintColorRes(r0)
        L33:
            r0 = 2131394386(0x7f0a7f52, float:1.8409455E38)
            android.view.View r0 = r5.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            if (r0 == 0) goto L44
            X.C786410Ut5.LLLLZLL(r0, r1)
            r0.setText(r4)
        L44:
            r0 = 2131364113(0x7f0a0911, float:1.8348054E38)
            android.view.View r0 = r5.findViewById(r0)
            X.0Gpy r0 = (X.C427760Gpy) r0
            r1 = 8
            if (r0 == 0) goto L54
            X.C786410Ut5.LLLLLL(r0, r1)
        L54:
            r0 = 0
            X.C427690Gpr.LJ(r5, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r7 = 0
            r11 = 30
            r8 = r7
            r9 = r7
            r10 = r7
            X.C1378990lzN.LIZIZ(r5, r6, r7, r8, r9, r10, r11)
            return r5
        L6e:
            r4 = 2131836872(0x7f113fc8, float:1.9306923E38)
            if (r1 == r0) goto La
            r3 = 2130774214(0x7f0108c6, float:1.7151597E38)
            goto Ld
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C737040Sve.LIZ():android.view.View");
    }

    @Override // X.AbstractC737180Svs
    public final boolean LIZIZ() {
        int iLJJIJLIJ = LJJIJLIJ();
        ILongPressVideoPrivacyService iLongPressVideoPrivacyService = this.LLILZ;
        if (iLongPressVideoPrivacyService != null) {
            return iLongPressVideoPrivacyService.LIZIZ(iLJJIJLIJ, this.LL.LIZ);
        }
        return false;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return LJJIJLIJ() == 1 ? R.raw.icon_lock_large_fill : R.raw.icon_lock_fill_slash;
    }

    @Override // X.AbstractC737180Svs
    public final void LJJ() {
        int iLJJIJLIJ = LJJIJLIJ();
        C734080Sqs c734080Sqs = C734080Sqs.LIZ;
        String value = this.LL.LJI.getValue();
        C735210Ssh c735210Ssh = this.LL;
        String str = c735210Ssh.LJFF ? "user" : "visitor";
        String str2 = iLJJIJLIJ == 1 ? "make_private" : "make_public";
        String str3 = c735210Ssh.LJIIIZ;
        c734080Sqs.getClass();
        C734080Sqs.LIZ(value, str, str2, str3);
        LJJIIZ();
    }

    public final void LJJIIZ() {
        int iLJJIJLIJ = LJJIJLIJ();
        ILongPressVideoPrivacyService iLongPressVideoPrivacyService = this.LLILZ;
        if (iLongPressVideoPrivacyService != null) {
            iLongPressVideoPrivacyService.LIZ(this.LL.LIZ, iLJJIJLIJ, new C737050Svf(this, iLJJIJLIJ));
            return;
        }
        if (this.LL.LJIIIIZZ) {
            Function2<? super Boolean, ? super Exception, Unit> function2 = this.LLILLL;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, null);
                return;
            }
            return;
        }
        C737030Svd c737030Svd = new C737030Svd(98, new C737060Svg(iLJJIJLIJ == 1, false, null));
        C0HTT<C737030Svd> c0htt = this.LLILLJJLI.get();
        if (c0htt != null) {
            c0htt.LLIIL(c737030Svd);
        }
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return LJJIJLIJ() == 1 ? 2131836869 : 2131836872;
    }

    public C737040Sve(C735210Ssh c735210Ssh, C0HTT<C737030Svd> c0htt) {
        this.LL = c735210Ssh;
        this.LLILLJJLI = new WeakReference<>(c0htt);
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        LJJIIZ();
    }
}
