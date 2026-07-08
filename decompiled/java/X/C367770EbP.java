package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C367770EbP extends C2217421BqW implements Function2<String, Integer, Bitmap> {
    public C367770EbP(C367920Ebe c367920Ebe) {
        super(2, c367920Ebe, InterfaceC367910Ebd.class, "getFrameBitmap", "getFrameBitmap(Ljava/lang/String;I)Landroid/graphics/Bitmap;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Bitmap invoke(String str, Integer num) {
        int iIntValue = num.intValue();
        return ((InterfaceC367910Ebd) this.receiver).LIZIZ(iIntValue, str);
    }
}
