package X;

import com.bytedance.librarian.Librarian;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ow9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1492310ow9 extends C2217421BqW implements Function1<String, Unit> {
    public static final C1492310ow9 LL = new C1492310ow9();

    public C1492310ow9() {
        super(1, Librarian.class, "loadLibrary", "loadLibrary(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Librarian.LJFF(str);
        return Unit.LIZ;
    }
}
