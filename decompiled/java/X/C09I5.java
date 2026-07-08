package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS186S1100000_3;

/* JADX INFO: renamed from: X.09I5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C09I5 extends C2217421BqW implements InterfaceC1685420txc<String, String, Integer, Integer, Function1<? super Boolean, ? extends Unit>, Unit> {
    public C09I5(C09IB c09ib) {
        super(5, c09ib, C09IB.class, "cameraGreenScreenTranscodeImage", "cameraGreenScreenTranscodeImage(Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(String str, String str2, Integer num, Integer num2, Function1<? super Boolean, ? extends Unit> function1) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        this.receiver.getClass();
        C09I4.LIZ(str, new int[]{iIntValue, iIntValue2}, new AwS186S1100000_3(str2, function1, 0));
        return Unit.LIZ;
    }
}
