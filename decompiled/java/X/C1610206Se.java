package X;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1610206Se extends C09AY implements Function0<String> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C1610206Se();
    }

    public C1610206Se() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add spark view, all list size: ");
        sbLIZ.append(((LinkedList) C1610306Sf.LIZJ).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
