package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1225200hzK extends C2217421BqW implements Function1<Integer, String> {
    public C1225200hzK(InterfaceC1224490hyB interfaceC1224490hyB) {
        super(1, interfaceC1224490hyB, C1227460i2y.class, "getSuccessToastTextWhenOnlyHaveNotMuf", "getSuccessToastTextWhenOnlyHaveNotMuf(I)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(Integer num) {
        int iIntValue = num.intValue();
        this.receiver.getClass();
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getResources().getQuantityString(2131755191, iIntValue, String.valueOf(iIntValue));
    }
}
