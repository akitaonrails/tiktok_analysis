package X;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.interactiveemoji.InteractiveEmojiStickerView$initEmojiView$1$1", f = "InteractiveEmojiStickerView.kt", l = {}, m = "invokeSuspend")
public final class C433640GzS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C19602311mf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433640GzS(Bitmap bitmap, C19602311mf c19602311mf, InterfaceC1364105Vn<? super C433640GzS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c19602311mf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433640GzS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractiveEmojiStickerView@b67e.initEmojiView$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        if (bitmap != null) {
            C19602311mf c19602311mf = this.LLILLJJLI;
            ImageView imageView = new ImageView(c19602311mf.LLIZ);
            imageView.setImageBitmap(bitmap);
            c19602311mf.setEmojiImageView(imageView);
            c19602311mf.addView(c19602311mf.getEmojiImageView(), new FrameLayout.LayoutParams(-1, -1, 17));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractiveEmojiStickerView@b67e.initEmojiView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
