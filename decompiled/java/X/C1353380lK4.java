package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* JADX INFO: renamed from: X.0lK4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353380lK4 extends AbstractC1353420lK8 {
    public final InterfaceC1353430lK9 LLILLL;
    public final TextExtraStruct LLILZ;
    public final int LLILZIL;
    public final /* synthetic */ C1353360lK2 LLILZLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        boolean zLJI = MethodIDManager.LJI(71908);
        if (C0OBG.LIZIZ(view)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            InterfaceC1353430lK9 interfaceC1353430lK9 = this.LLILLL;
            if (interfaceC1353430lK9 != null) {
                interfaceC1353430lK9.LIZ(view, this.LLILZ);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int iLIZ = this.LLILZIL;
        if (iLIZ == 0) {
            iLIZ = textPaint.linkColor;
        }
        if (this.LL) {
            iLIZ = C1353410lK7.LIZ(this.LLILZLL.getPressAlpha(), iLIZ);
        }
        textPaint.setColor(iLIZ);
        textPaint.setUnderlineText(false);
    }

    public C1353380lK4(C1353360lK2 c1353360lK2, InterfaceC1353430lK9 interfaceC1353430lK9, TextExtraStruct textExtraStruct, int i) {
        this.LLILZLL = c1353360lK2;
        this.LLILLL = interfaceC1353430lK9;
        this.LLILZ = textExtraStruct;
        this.LLILZIL = i;
    }
}
