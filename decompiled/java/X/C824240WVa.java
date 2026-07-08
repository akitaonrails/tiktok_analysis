package X;

import android.graphics.Bitmap;
import android.util.Base64;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.ByteArrayOutputStream;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824240WVa extends C0WVZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final C0WVY c0wvy = (C0WVY) xBaseParamModel;
        if (!u.LJJIIJZLJL(c0wvy.getImageUrl(), "https:", false)) {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
        } else {
            C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(c0wvy.getImageUrl())).LJJII(new InterfaceC1331910klR() { // from class: X.0WVX
                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                    C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, c0wvy.getWidth().intValue(), (int) ((c0wvy.getWidth().floatValue() / bitmap.getWidth()) * bitmap.getHeight()), false);
                    InterfaceC824250WVb interfaceC824250WVb = (InterfaceC824250WVb) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC824250WVb.class));
                    this.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    interfaceC824250WVb.setImageData(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                    completionBlock.onSuccess(interfaceC824250WVb, "");
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                    bitmapCreateScaledBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateScaledBitmap);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
                }
            });
        }
    }
}
