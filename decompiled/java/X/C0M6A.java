package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0M6A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0M6A implements Runnable {
    public final /* synthetic */ C0M6E LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ SmartImageView LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ Function0 LLILZIL;

    public /* synthetic */ C0M6A(C0M6E c0m6e, int i, SmartImageView smartImageView, Bitmap bitmap, Function0 function0) {
        this.LL = c0m6e;
        this.LLILLJJLI = i;
        this.LLILLL = smartImageView;
        this.LLILZ = bitmap;
        this.LLILZIL = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0M6E c0m6e = this.LL;
        int i = this.LLILLJJLI;
        SmartImageView smartImageView = this.LLILLL;
        Bitmap bitmap = this.LLILZ;
        Function0 function0 = this.LLILZIL;
        c0m6e.getClass();
        C1C7U.LIZ("AbsDraftBoxViewHolder@51fe.setCoverBitmapInMainThread$1L");
        if (i != c0m6e.LLIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindVideoThumbnail: stale bitmap result, skip. seq=");
            sbLIZ.append(i);
            C201955140j.LIZIZ("AbsDraftBoxViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.setCoverBitmapInMainThread$1L");
            return;
        }
        if (c0m6e.LLIZLLLIL.LIZIZ()) {
            C201955140j.LIZIZ("AbsDraftBoxViewHolder", "bindVideoThumbnail: ai remix coverUrl is set, skip");
            C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.setCoverBitmapInMainThread$1L");
            return;
        }
        if (smartImageView != null) {
            smartImageView.setImageBitmap(bitmap);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(smartImageView.getResources(), bitmap);
            c0m6e.LLJ = bitmapDrawable;
            smartImageView.setPlaceholderImage(bitmapDrawable);
            C201955140j.LIZIZ("AbsDraftBoxViewHolder", "bindVideoThumbnail: set draft cover bitmap");
        }
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("AbsDraftBoxViewHolder@51fe.setCoverBitmapInMainThread$1L");
    }
}
