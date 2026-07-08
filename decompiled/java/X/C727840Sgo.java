package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727840Sgo extends C09AY implements Function0<C727920Sgw> {
    public C727840Sgo() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Sgw] */
    @Override // kotlin.jvm.functions.Function0
    public final C727920Sgw invoke() {
        return new InterfaceC728740SiG() { // from class: X.0Sgw
            public final EnumC727930Sgx LIZ;

            {
                this.LIZ = C281310B0v.LIZ() ? EnumC727930Sgx.LOTTIE_ANIMATION : EnumC727930Sgx.PROGRESS_BAR;
            }

            @Override // X.InterfaceC728740SiG
            public final EnumC727930Sgx LIZ() {
                return this.LIZ;
            }
        };
    }
}
