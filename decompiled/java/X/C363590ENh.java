package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ENh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C363590ENh extends C2217421BqW implements Function2<String, Boolean, Unit> {
    public C363590ENh(C363550ENd c363550ENd) {
        super(2, c363550ENd, C363550ENd.class, "onTextContentEditing", "onTextContentEditing(Ljava/lang/String;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C363550ENd) this.receiver).N6(str, zBooleanValue);
        return Unit.LIZ;
    }
}
