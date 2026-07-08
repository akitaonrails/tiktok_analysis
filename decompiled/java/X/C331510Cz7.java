package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C331510Cz7 extends C2217421BqW implements Function1<String, Boolean> {
    public C331510Cz7(Object obj) {
        super(1, obj, C0DH8.class, "isExpanded", "isExpanded(Ljava/lang/String;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(((C0DH8) this.receiver).LLILLJJLI.contains(str));
    }
}
