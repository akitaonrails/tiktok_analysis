package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.101g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C191786101g extends C2217421BqW implements Function1<String, Unit> {
    public C191786101g(C101P c101p) {
        super(1, c101p, C101P.class, "showPostClick", "showPostClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C101P c101p = (C101P) this.receiver;
        c101p.LJFF(c101p.LJ);
        c101p.LJI("showpost_click");
        c101p.LJFF.invoke();
        return Unit.LIZ;
    }
}
