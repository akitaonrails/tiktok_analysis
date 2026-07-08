package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C577260MkW extends C2217421BqW implements Function1<Boolean, Unit> {
    public C577260MkW(C577240MkU c577240MkU) {
        super(1, c577240MkU, C577240MkU.class, "manualClickUploadButton", "manualClickUploadButton(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C577240MkU) this.receiver).manualClickUploadButton(bool.booleanValue());
        return Unit.LIZ;
    }
}
