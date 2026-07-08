package X;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Egj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C371070Egj extends C2217421BqW implements Function2<String, Integer, Bitmap> {
    public C371070Egj(C371020Ege c371020Ege) {
        super(2, c371020Ege, C371020Ege.class, "getFrameCache", "getFrameCache(Ljava/lang/String;I)Landroid/graphics/Bitmap;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Bitmap invoke(String str, Integer num) {
        int iIntValue = num.intValue();
        return ((C371020Ege) this.receiver).F4(str, iIntValue);
    }
}
