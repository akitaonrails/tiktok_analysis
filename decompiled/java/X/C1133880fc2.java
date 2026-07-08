package X;

import android.graphics.Bitmap;
import android.text.Spannable;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133880fc2 extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ C259800zU<Spannable> LL;
    public final /* synthetic */ TextPiece LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ CountDownLatch LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133880fc2(C259800zU<Spannable> c259800zU, TextPiece textPiece, int i, int i2, CountDownLatch countDownLatch) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = textPiece;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        C20441214yg.LIZIZ("RightTagViewUtils", "loadImage(it)");
        C1133830fbx.LIZJ(this.LL.element, bitmap, this.LLILLJJLI.imageValue.imageModel, this.LLILLL, this.LLILZ);
        this.LLILZIL.countDown();
        return Unit.LIZ;
    }
}
