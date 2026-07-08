package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.144e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C202054144e extends C2217421BqW implements Function0<Boolean> {
    public C202054144e(C202051144b c202051144b) {
        super(0, c202051144b, C202051144b.class, "loadVMSDKLib", "loadVMSDKLib()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.receiver.getClass();
        C202051144b.LIZIZ();
        int i = C2187451AjH.LIZ;
        return Boolean.valueOf(C202051144b.LIZJ("v8_libfull.cr") && C202051144b.LIZJ("napi_v8") && C202051144b.LIZJ("ttminisnative"));
    }
}
