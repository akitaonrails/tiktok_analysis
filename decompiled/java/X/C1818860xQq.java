package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1818860xQq extends C09AY implements Function1<C1818830xQn, C1818830xQn> {
    public final /* synthetic */ C1818820xQm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818860xQq(C1818820xQm c1818820xQm) {
        super(1);
        this.LL = c1818820xQm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1818830xQn invoke(C1818830xQn c1818830xQn) {
        EnumC1818710xQb enumC1818710xQb;
        C1818830xQn c1818830xQn2 = c1818830xQn;
        C1818820xQm c1818820xQm = this.LL;
        if (c1818820xQm == null || (enumC1818710xQb = c1818820xQm.LLILZLL) == null) {
            enumC1818710xQb = EnumC1818710xQb.LAYOUT;
        }
        return C1818830xQn.LIZ(c1818830xQn2, null, enumC1818710xQb, 1);
    }
}
