package X;

import com.lynx.animax.loader.AnimaXLoaderCompletionHandler;

/* JADX INFO: renamed from: X.0jdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1288550jdV implements InterfaceC1288590jdZ {
    public final /* synthetic */ InterfaceC1285780jZ2 LIZ;

    public final void LIZ(InterfaceC1288580jdY interfaceC1288580jdY, String str) {
        C1288570jdX<Throwable> c1288570jdXLIZIZ;
        InterfaceC1285780jZ2 interfaceC1285780jZ2 = this.LIZ;
        if (interfaceC1288580jdY != null && str.isEmpty()) {
            c1288570jdXLIZIZ = new C1288570jdX<>(EnumC1288560jdW.BITMAP, interfaceC1288580jdY);
        } else {
            c1288570jdXLIZIZ = C1288570jdX.LIZIZ(new Throwable(str));
        }
        ((AnimaXLoaderCompletionHandler) interfaceC1285780jZ2).LIZ(c1288570jdXLIZIZ);
    }
}
