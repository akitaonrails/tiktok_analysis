package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C599690Nfb extends C2217421BqW implements Function0<String> {
    public C599690Nfb(Object obj) {
        super(0, obj, Class.class, "getName", "getName()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((Class) this.receiver).getName();
    }
}
