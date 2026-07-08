package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0388, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0388 extends LinearLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final C197039127h LLILLL;

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar r5) {
        /*
            r4 = this;
            com.bytedance.lighten.loader.SmartImageView r3 = r4.LL
            r2 = 0
            if (r3 == 0) goto L28
            X.0kdB r1 = X.C1326790kdB.LIZ
            android.content.Context r0 = r4.getContext()
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 == 0) goto L41
            if (r5 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r0 = r5.locationIcon
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getIconDark()
        L1b:
            r1.getClass()
            X.0kl3 r0 = X.C1326790kdB.LIZLLL(r0)
            r0.LJJ(r3)
            X.C786410Ut5.h3(r0)
        L28:
            com.bytedance.tux.input.TuxTextView r1 = r4.LLILLJJLI
            if (r1 == 0) goto L33
            if (r5 == 0) goto L3f
            java.lang.String r0 = r5.grantTipsText
        L30:
            r1.setText(r0)
        L33:
            X.127h r0 = r4.LLILLL
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L3b
            java.lang.String r2 = r5.grantButtonText
        L3b:
            r0.setText(r2)
        L3e:
            return
        L3f:
            r0 = r2
            goto L30
        L41:
            if (r5 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r0 = r5.locationIcon
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.getIcon()
            goto L1b
        L4c:
            r0 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0388.LIZ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar):void");
    }

    public final void setGrantBtnClickListener(Function0<Unit> function0) {
        C197039127h c197039127h = this.LLILLL;
        if (c197039127h != null) {
            C786410Ut5.I7(new AjS60S0100000_1((Function0) function0, 11), c197039127h);
        }
    }

    public AnonymousClass0388(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.aip, C786410Ut5.ne(context), this);
        this.LL = (SmartImageView) findViewById(R.id.noc);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.j4z);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.j4w);
        this.LLILLL = c197039127h;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0c);
        setBackground(c384050F3z.LIZ(getContext()));
        if (c197039127h != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            c197039127h.setBackground(c384050F3z2.LIZ(getContext()));
        }
    }
}
