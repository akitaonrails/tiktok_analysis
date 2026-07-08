package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478560oZy extends C09AY implements Function0<C1478930oaZ> {
    public C1478560oZy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oaZ] */
    @Override // kotlin.jvm.functions.Function0
    public final C1478930oaZ invoke() {
        return new C1479020oai() { // from class: X.0oaZ
            @Override // X.C1479020oai, X.InterfaceC1475670oVJ
            public final int getVersion() {
                return C2547109yX.LIZ.booleanValue() ? 2 : 1;
            }
        };
    }
}
