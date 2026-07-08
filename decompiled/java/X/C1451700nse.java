package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1451700nse extends C2217421BqW implements Function2<C1451600nsU, Bitmap, Unit> {
    public C1451700nse(C1451580nsS c1451580nsS) {
        super(2, c1451580nsS, C1451580nsS.class, "onSave", "onSave(Lcom/ss/android/ugc/aweme/comment/image/crop/data/CropOutput;Landroid/graphics/Bitmap;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1451600nsU c1451600nsU, Bitmap bitmap) throws Throwable {
        ((C1451580nsS) this.receiver).D5(c1451600nsU, bitmap);
        return Unit.LIZ;
    }
}
