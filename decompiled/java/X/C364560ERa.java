package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ERa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364560ERa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0ERO LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C364560ERa(C0ERO c0ero, boolean z, String str, int i, int i2, boolean z2, float f, int i3, int i4) {
        super(0);
        this.LL = c0ero;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z2;
        this.LLIZ = f;
        this.LLIZLLLIL = i3;
        this.LLJ = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NLERectF nLERectF;
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        C0FGR c0fgrLIZJ;
        C0ERO c0ero = this.LL;
        C364590ERd c364590ERd = c0ero.LJIJJ;
        Rect rect = null;
        if (c364590ERd != null) {
            boolean z = this.LLILLJJLI;
            String str = this.LLILLL;
            int i = this.LLILZ;
            int i2 = this.LLILZIL;
            boolean z2 = this.LLILZLL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            float fMax = 0.0f;
            if (z) {
                TextStickerModel textStickerModel = c0ero.LJIILIIL.LIZ;
                String textStrWithLineBreak = textStickerModel.getTextStrWithLineBreak();
                if (textStrWithLineBreak.length() == 0) {
                    textStrWithLineBreak = textStickerModel.getHint();
                }
                TextPaint textPaint = c364590ERd.LJFF;
                textPaint.setTypeface(c364590ERd.LIZIZ.LIZ(textStickerModel.getFontModel().fileName));
                textPaint.setTextSize(C418440Gaw.LJ(Integer.valueOf(textStickerModel.getFontModel().fontSize)));
                List listLJJLIIIJ = a0.LJJLIIIJ(textStrWithLineBreak, new char[]{'\n'}, false, 0, 6);
                int width = c364590ERd.LIZ.getWidth() > 0 ? c364590ERd.LIZ.getWidth() : c364590ERd.LIZ.getLayoutParams().width;
                int height = c364590ERd.LIZ.getHeight() > 0 ? c364590ERd.LIZ.getHeight() : c364590ERd.LIZ.getLayoutParams().height;
                Iterator it2 = listLJJLIIIJ.iterator();
                while (it2.hasNext()) {
                    fMax = Math.max(fMax, c364590ERd.LJFF.measureText((String) it2.next()));
                }
                StaticLayout staticLayout = new StaticLayout(textStrWithLineBreak, c364590ERd.LJFF, 536870911, Layout.Alignment.ALIGN_NORMAL, 1.0f, textStickerModel.getLineSpacingExtra(), true);
                int iLIZIZ = ((int) fMax) + (c364590ERd.LIZLLL * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                int height2 = staticLayout.getHeight() + (c364590ERd.LJ * 2);
                rect = new Rect();
                int i3 = (width - iLIZIZ) / 2;
                rect.left = i3;
                rect.right = i3 + iLIZIZ;
                int i4 = (height - height2) / 2;
                rect.top = i4;
                rect.bottom = i4 + height2;
            } else {
                InterfaceC386690FEd interfaceC386690FEd = c0ero.LJIIJJI;
                if (interfaceC386690FEd == null || (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) == null || (stickerApi = iNLEMediaSessionF1.getStickerApi()) == null || (nLERectF = stickerApi.getInfoStickerBoundingBox(str, false)) == null) {
                    nLERectF = new NLERectF(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (nLERectF.getTop() != nLERectF.getBottom() && nLERectF.getLeft() != nLERectF.getRight()) {
                    float scale = c0ero.LJIILJJIL.LIZ.getScale();
                    RectF rectF = new RectF();
                    rectF.left = C363400EMo.LIZJ(nLERectF.getLeft() / scale);
                    rectF.top = C363400EMo.LIZLLL(nLERectF.getTop() / scale);
                    rectF.right = C363400EMo.LIZJ(nLERectF.getRight() / scale);
                    rectF.bottom = C363400EMo.LIZLLL(nLERectF.getBottom() / scale);
                    float f = i;
                    int iAbs = (int) Math.abs((rectF.right - rectF.left) * f);
                    float f2 = i2;
                    int iAbs2 = (int) Math.abs((rectF.bottom - rectF.top) * f2);
                    rect = new Rect();
                    int i5 = (int) (rectF.left * f);
                    rect.left = i5;
                    int i6 = (int) (rectF.top * f2);
                    rect.top = i6;
                    rect.right = i5 + iAbs;
                    rect.bottom = i6 + iAbs2;
                }
            }
            C0FF8 c0ff8LIZ = c0ero.LJIIZILJ.LIZ();
            if (c0ff8LIZ != null && (c0fgrLIZJ = c0ff8LIZ.LIZJ()) != null) {
                c0fgrLIZJ.LJJIJ(System.currentTimeMillis() - jCurrentTimeMillis, z2, z);
            }
            if (rect != null) {
                this.LL.LJIILJJIL.LIZLLL(new C364580ERc(rect, this.LLILZ, this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ), true);
            }
        }
        return Unit.LIZ;
    }
}
