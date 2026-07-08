package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C331500Cz6 extends C2217421BqW implements Function1<String, Boolean> {
    public C331500Cz6(Object obj) {
        super(1, obj, C0DH8.class, "toggleExpanded", "toggleExpanded(Ljava/lang/String;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        boolean z;
        C0DH8 c0dh8 = (C0DH8) this.receiver;
        if (c0dh8.LLILLJJLI.contains(str)) {
            c0dh8.LLILLJJLI.remove(str);
            z = false;
        } else {
            c0dh8.LLILLJJLI.add(str);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
