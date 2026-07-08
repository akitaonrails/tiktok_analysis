package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Us3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785770Us3 extends ClickableSpan {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    public static final void updateDrawState$0(C785770Us3 c785770Us3, TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C785770Us3 c785770Us3, View view) {
        Context contextLJJIIZI = C520010KaN.LJJIIZI((Context) c785770Us3.l1, false);
        if (contextLJJIIZI != null) {
            C771930UPv.LIZIZ((DataChannel) c785770Us3.l2, contextLJJIIZI, c785770Us3.s0);
        }
        C771930UPv.LIZ((DataChannel) c785770Us3.l2, c785770Us3.s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(C785770Us3 c785770Us3, View view) {
        ClipboardManager clipboardManager;
        Object objH2 = C786410Ut5.H2((Context) c785770Us3.l1, "clipboard");
        if (objH2 instanceof ClipboardManager) {
            clipboardManager = (ClipboardManager) objH2;
        } else {
            clipboardManager = null;
        }
        String str = c785770Us3.s0;
        ClipData clipDataNewPlainText = ClipData.newPlainText(str, str);
        if (clipboardManager != null) {
            try {
                C20145713s7.LIZJ(clipboardManager, clipDataNewPlainText, CertProviderManagerKt.findCert("bpea-poi_claim_dialog_email_copy", 1476399150));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("something was wrong when clip, e=");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
        }
        C1397510mTF c1397510mTF = (C1397510mTF) ((C259800zU) c785770Us3.l2).element;
        if (c1397510mTF != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c1397510mTF.LLJJIJI);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIIZ(2131826411);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void updateDrawState$1(C785770Us3 c785770Us3, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1o, (Context) c785770Us3.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C785770Us3(Object obj, Context context, String str, C259800zU<C1397510mTF> c259800zU) {
        this.$t = c259800zU;
        this.l1 = obj;
        this.s0 = context;
        this.l2 = str;
    }
}
