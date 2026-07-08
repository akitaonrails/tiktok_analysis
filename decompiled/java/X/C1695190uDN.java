package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695190uDN extends CharacterStyle implements UpdateAppearance {
    public final AbstractC1695860uES LL;

    public C1695190uDN(AbstractC1695860uES abstractC1695860uES) {
        this.LL = abstractC1695860uES;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        PathEffect pathEffect;
        if (textPaint != null) {
            AbstractC1695860uES abstractC1695860uES = this.LL;
            if (Intrinsics.LJFF(abstractC1695860uES, C1695700uEC.LIZ)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC1695860uES instanceof C1695210uDP)) {
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((C1695210uDP) this.LL).LIZ);
            textPaint.setStrokeMiter(((C1695210uDP) this.LL).LIZIZ);
            textPaint.setStrokeJoin(C1695290uDX.LIZIZ(((C1695210uDP) this.LL).LIZLLL));
            textPaint.setStrokeCap(C1695290uDX.LIZ(((C1695210uDP) this.LL).LIZJ));
            InterfaceC1669090tXH interfaceC1669090tXH = ((C1695210uDP) this.LL).LJ;
            if (interfaceC1669090tXH != null) {
                pathEffect = ((C1669080tXG) interfaceC1669090tXH).LIZIZ;
            } else {
                pathEffect = null;
            }
            textPaint.setPathEffect(pathEffect);
        }
    }
}
