package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12FT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.botshare.drawer.BotSharedDrawer$drawCover$2", f = "BotSharedDrawer.kt", l = {}, m = "invokeSuspend")
public final class C12FT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ AIBotInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12FT(Bitmap bitmap, AIBotInfo aIBotInfo, InterfaceC1364105Vn<? super C12FT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = aIBotInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12FT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BotSharedDrawer@74f5.drawCover$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        AIBotInfo aIBotInfo = this.LLILLJJLI;
        int i = C12FV.LIZIZ;
        float width = i / bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, (int) (bitmap.getHeight() * width), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int iSave = canvas.save();
        canvas.translate(0.0f, 0.0f);
        try {
            canvas.scale(width, width);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.restoreToCount(iSave);
            C12FV c12fv = C12FV.LIZ;
            C12FV.LIZIZ(canvas);
            if (aIBotInfo == null || (str = aIBotInfo.botName) == null) {
                str = "";
            }
            Bitmap bitmapLIZJ = C12FV.LIZJ(str);
            if (bitmapLIZJ != null) {
                canvas.drawBitmap(bitmapLIZJ, (canvas.getWidth() - bitmapLIZJ.getWidth()) / 2.0f, (bitmapCreateBitmap.getHeight() - bitmapLIZJ.getHeight()) - C12FV.LIZLLL, (Paint) null);
            }
            C1C7U.LIZIZ("BotSharedDrawer@74f5.drawCover$2");
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
