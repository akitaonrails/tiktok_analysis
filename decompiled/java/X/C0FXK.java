package X;

import android.graphics.Canvas;
import android.text.Editable;
import android.text.Layout;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FXK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXK extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXK(C367840EbW c367840EbW, Canvas canvas, int i) {
        super(4);
        this.$t = i;
        this.l0 = c367840EbW;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXK(C388170FJv c388170FJv, C0FL4 c0fl4, int i) {
        super(4);
        this.$t = i;
        this.l0 = c388170FJv;
        this.l1 = c0fl4;
    }

    public static final Object invoke$0(C0FXK c0fxk, Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        int length;
        int lineCount;
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        C388170FJv c388170FJv = (C388170FJv) c0fxk.l0;
        if (c388170FJv.LLJIJIL == null) {
            return Boolean.FALSE;
        }
        C1664680tQA<TextStickerModel> c1664680tQA = c388170FJv.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (c1664680tQA.LIZ.getCompatModel().getSelectSlotIndex() != 0) {
            return Boolean.FALSE;
        }
        C0FL4 c0fl4 = (C0FL4) c0fxk.l1;
        C388170FJv c388170FJv2 = (C388170FJv) c0fxk.l0;
        Editable editableA = C2204961BRm.A(c0fl4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/ZIWQRTRl9aeopi+cKXIZl+XK/2okSrjqQBtENwQ==", null));
        boolean z = false;
        if (editableA != null) {
            length = editableA.length();
        } else {
            length = 0;
        }
        Layout layout = c0fl4.getLayout();
        if (layout != null) {
            lineCount = layout.getLineCount();
        } else {
            lineCount = 0;
        }
        C0F8J.LIZ("inspiration", "onTextChanged: charLength " + length + ", lines " + lineCount);
        if (lineCount > c388170FJv2.LLJIJIL.LJIIJJI() || length > c388170FJv2.LLJIJIL.LIZLLL()) {
            C01TT.LIZJ(new AwS549S0100000_5(c388170FJv2, 1641));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(C0FXK c0fxk, Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        float fFloatValue3 = ((Number) obj3).floatValue();
        float fFloatValue4 = ((Number) obj4).floatValue();
        ((C367840EbW) c0fxk.l0).LIZJ.reset();
        ((C367840EbW) c0fxk.l0).LIZJ.moveTo(fFloatValue, fFloatValue2);
        ((C367840EbW) c0fxk.l0).LIZJ.lineTo(fFloatValue3 + fFloatValue, fFloatValue2);
        ((C367840EbW) c0fxk.l0).LIZJ.quadTo(fFloatValue, fFloatValue2, fFloatValue, fFloatValue4 + fFloatValue2);
        ((C367840EbW) c0fxk.l0).LIZJ.close();
        Canvas canvas = (Canvas) c0fxk.l1;
        C367840EbW c367840EbW = (C367840EbW) c0fxk.l0;
        canvas.drawPath(c367840EbW.LIZJ, c367840EbW.LJ);
        return Unit.LIZ;
    }
}
