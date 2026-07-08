package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C802903Br extends ConstraintLayout implements InterfaceC1164530gPT {
    public String LL;
    public C719102rN LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    private final SmartImageView getIcon() {
        return (SmartImageView) this.LLILZIL.getValue();
    }

    private final TuxTextView getPromotionCountdownTime() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final ConstraintLayout getPromotionCountdownView() {
        return (ConstraintLayout) this.LLILZ.getValue();
    }

    private final TuxTextView getText() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_osp_promotion_event", this);
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public final void e0(long j) {
        if (j <= 0) {
            C03DZ.LIZ(getPromotionCountdownView());
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j);
        long j2 = 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        long seconds = timeUnit.toSeconds(j) % j2;
        if (hours >= 24) {
            C03DZ.LIZ(getText());
            C0H1U.LJIIL(getPromotionCountdownTime(), this.LL, true);
            ConstraintLayout promotionCountdownView = getPromotionCountdownView();
            C19MB c19mb = new C19MB();
            c19mb.LJII(promotionCountdownView);
            c19mb.LJI(R.id.sat, 6);
            c19mb.LJI(R.id.sat, 7);
            c19mb.LJIIIIZZ(R.id.sat, 6, R.id.sag, 6);
            c19mb.LIZIZ(promotionCountdownView);
            TuxTextView promotionCountdownTime = getPromotionCountdownTime();
            ViewGroup.LayoutParams layoutParams = promotionCountdownTime.getLayoutParams();
            C426750GoL.LJIIL(promotionCountdownTime, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
            C786410Ut5.R6(promotionCountdownTime, layoutParams);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZ = C1308910kAL.LIZ(R.attr.gl, promotionCountdownTime.getContext());
            promotionCountdownTime.setBackground(c384050F3z.LIZ(promotionCountdownTime.getContext()));
            SmartImageView icon = getIcon();
            ViewGroup.LayoutParams layoutParams2 = icon.getLayoutParams();
            layoutParams2.width = C679280Qkg.LIZ(11);
            layoutParams2.height = C679280Qkg.LIZ(11);
            C426750GoL.LJIIIZ(icon, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            C786410Ut5.G6(icon, layoutParams2);
            return;
        }
        C0H1U.LJIIL(getText(), this.LL, true);
        TuxTextView promotionCountdownTime2 = getPromotionCountdownTime();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z2.LIZ = C1308910kAL.LIZ(R.attr.gl, getContext());
        promotionCountdownTime2.setBackground(c384050F3z2.LIZ(getContext()));
        getPromotionCountdownTime().setText(C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3)));
        getIcon().setColorFilter(C0HEZ.LIZIZ("#ffface15"));
        SmartImageView icon2 = getIcon();
        ViewGroup.LayoutParams layoutParams3 = icon2.getLayoutParams();
        layoutParams3.width = C679280Qkg.LIZ(22);
        layoutParams3.height = C679280Qkg.LIZ(22);
        C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), icon2);
        C786410Ut5.G6(icon2, layoutParams3);
    }

    public C802903Br(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint r6, X.C719102rN r7) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802903Br.h0(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint, X.02rN):void");
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        C719102rN c719102rN;
        String str3;
        if (Intrinsics.LJFF(str, "ec_osp_promotion_event") && (c719102rN = this.LLILLJJLI) != null && (str3 = c719102rN.LLILZLL) != null) {
            C799403Ai.LIZ.getClass();
            Long lLIZJ = C799403Ai.LIZJ(str3);
            if (lLIZJ != null) {
                e0(lLIZJ.longValue());
            }
        }
    }

    public C802903Br(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 405));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 406));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 404));
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 407));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b49, this, true);
    }
}
