package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C367780EbQ extends C2217421BqW implements Function2<String, Integer, Bitmap> {
    public C367780EbQ(Object obj) {
        super(2, obj, InterfaceC368360EcM.class, "getFrameBitmap", "getFrameBitmap(Ljava/lang/String;I)Landroid/graphics/Bitmap;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Bitmap invoke(String str, Integer num) {
        int iIntValue = num.intValue();
        return ((InterfaceC368360EcM) this.receiver).LIZIZ(iIntValue, str);
    }
}
