package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.01Ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C289101Ab extends ConstraintLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public final ConstraintLayout LL;
    public final C1324720kZq LLILLJJLI;
    public final C16F5 LLILLL;

    public C289101Ab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h89, this, true);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.mb8);
        this.LL = constraintLayout;
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.k0u);
        this.LLILLL = (C16F5) findViewById(R.id.zno);
        C500260Jjc.LJIILIIL(constraintLayout);
    }

    public static void e0(final C289101Ab c289101Ab, GiftMode giftMode, final Text text, boolean z, int i) {
        int width;
        if ((i & 1) != 0) {
            giftMode = null;
        }
        if ((i & 2) != 0) {
            text = null;
        }
        int height = 0;
        if ((i & 4) == 0 && z) {
            C500260Jjc.LJIILIIL(c289101Ab);
            return;
        }
        if (giftMode != null) {
            C500260Jjc.LLFFF(c289101Ab);
            if (giftMode.giftId == 0) {
                C500260Jjc.LJIILIIL(c289101Ab.LL);
                return;
            }
            C500260Jjc.LLFFF(c289101Ab.LL);
            C500260Jjc.LLFFF(c289101Ab.LLILLJJLI);
            C16F5 c16f5 = c289101Ab.LLILLL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJJ(2131843048, giftMode.giftName));
            }
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(giftMode.giftIconImage);
            C1324720kZq c1324720kZq = c289101Ab.LLILLJJLI;
            if (c1324720kZq != null) {
                width = c1324720kZq.getWidth();
            } else {
                width = 0;
            }
            C1324720kZq c1324720kZq2 = c289101Ab.LLILLJJLI;
            if (c1324720kZq2 != null) {
                height = c1324720kZq2.getHeight();
            }
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJJI(c289101Ab.LLILLJJLI);
            return;
        }
        if (text != null) {
            C500260Jjc.LLFFF(c289101Ab);
            C500260Jjc.LLFFF(c289101Ab.LL);
            C500260Jjc.LJIILIIL(c289101Ab.LLILLJJLI);
            C16F5 c16f52 = c289101Ab.LLILLL;
            if (c16f52 != null) {
                c16f52.setText(C1133830fbx.LJIILIIL(text, ""));
            }
            List<TextPiece> list = text.pieces;
            if (list == null) {
                return;
            }
            for (TextPiece textPiece : list) {
                if (textPiece.type == EnumC1133850fbz.IMAGE.getPieceType()) {
                    ((IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)).xW1(textPiece.imageValue.imageModel, new InterfaceC177000m8() { // from class: X.01Ac
                        @Override // X.InterfaceC177000m8
                        public final void LIZ(Bitmap bitmap) {
                            C16F5 c16f53 = this.LIZ.LLILLL;
                            if (c16f53 != null) {
                                c16f53.setText(C1133830fbx.LJIILIIL(text, ""));
                            }
                        }
                    });
                }
            }
            return;
        }
        C500260Jjc.LJIILIIL(c289101Ab);
    }
}
