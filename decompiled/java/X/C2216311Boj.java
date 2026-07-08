package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Boj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2216311Boj extends C2217421BqW implements Function1<String, Unit> {
    public C2216311Boj(Object obj) {
        super(1, obj, C2216321Bok.class, "destroyCreationSession", "destroyCreationSession(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.receiver.getClass();
        ((HashMap) C2216321Bok.LIZIZ).remove(str);
        return Unit.LIZ;
    }
}
