package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager$getEmojiDrawable$1", f = "OnlineDrawableEmojiResourceManager.kt", l = {85}, m = "invokeSuspend")
public final class C314860CVw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OnlineDrawableEmojiResourceManager LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC314870CVx LLILZ;
    public final /* synthetic */ Resources LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314860CVw(OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager, String str, InterfaceC314870CVx interfaceC314870CVx, Resources resources, InterfaceC1364105Vn<? super C314860CVw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = onlineDrawableEmojiResourceManager;
        this.LLILLL = str;
        this.LLILZ = interfaceC314870CVx;
        this.LLILZIL = resources;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314860CVw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OnlineDrawableEmojiResourceManager@2e65.getEmojiDrawable$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            BitmapDrawable bitmapDrawable = null;
            if (this.LLILLJJLI.LJFF.LIZJ(this.LLILLL) != null) {
                InterfaceC314870CVx interfaceC314870CVx = this.LLILZ;
                Bitmap bitmapLIZJ = this.LLILLJJLI.LJFF.LIZJ(this.LLILLL);
                if (bitmapLIZJ != null) {
                    bitmapDrawable = new BitmapDrawable(this.LLILZIL, bitmapLIZJ);
                }
                interfaceC314870CVx.onDrawableLoaded(bitmapDrawable);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getEmojiDrawable$1");
                return unit;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C314850CVv c314850CVv = new C314850CVv(this.LLILLJJLI, this.LLILLL, this.LLILZIL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c314850CVv);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getEmojiDrawable$1");
                return objLJFF;
            }
        }
        this.LLILZ.onDrawableLoaded((Drawable) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OnlineDrawableEmojiResourceManager@2e65.getEmojiDrawable$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
