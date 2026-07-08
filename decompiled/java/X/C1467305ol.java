package X;

import android.graphics.Bitmap;
import android.util.Size;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1467305ol extends C09AY implements Function2<Bitmap, Throwable, Unit> {
    public final /* synthetic */ ImageView LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ MediaModel LLILZ;
    public final /* synthetic */ Size LLILZIL;
    public final /* synthetic */ Function2<Bitmap, Throwable, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1467305ol(ImageView imageView, String str, boolean z, MediaModel mediaModel, Size size, Function2<? super Bitmap, ? super Throwable, Unit> function2) {
        super(2);
        this.LL = imageView;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = mediaModel;
        this.LLILZIL = size;
        this.LLILZLL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Bitmap bitmap, Throwable th) {
        Bitmap bitmap2 = bitmap;
        Throwable th2 = th;
        if (Intrinsics.LJFF(this.LL.getTag(), this.LLILLJJLI) && bitmap2 != null) {
            if (this.LLILLL) {
                C23216097u c23216097u = C23215097t.LIZ;
                C23215097t.LJII(this.LLILZ, this.LLILZIL, bitmap2);
            }
            this.LL.setImageBitmap(bitmap2);
            this.LLILZLL.invoke(bitmap2, th2);
        } else {
            this.LLILZLL.invoke(null, th2);
        }
        if (th2 != null) {
            C2344809Gs.LJI(th2);
        }
        return Unit.LIZ;
    }
}
