package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Lyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C560630Lyn extends C1696260uF6 implements Function0<Unit> {
    public C560630Lyn(C560580Lyi c560580Lyi) {
        super(0, c560580Lyi, C560580Lyi.class, "onBackPressed", "onBackPressed()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((C560580Lyi) this.receiver).onBackPressed();
        return Unit.LIZ;
    }
}
