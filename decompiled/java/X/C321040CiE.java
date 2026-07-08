package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler$dispatchPullHistoryCommerceAgentMessages$1", f = "MessageOperatorHandler.kt", l = {466, 465}, m = "invokeSuspend")
public final class C321040CiE extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public MessageRemote LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C321020CiC LLILZLL;
    public final /* synthetic */ C320830Cht LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321040CiE(C321020CiC c321020CiC, C320830Cht c320830Cht, InterfaceC1364105Vn<? super C321040CiE> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZLL = c321020CiC;
        this.LLIZ = c320830Cht;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321040CiE(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|99|(1:(1:(19:6|24|25|(1:27)(1:37)|28|(1:32)|33|(2:36|34)|103|38|(3:40|(4:43|(3:105|45|108)(1:107)|106|41)|104)(1:46)|47|(4:50|(1:116)(4:111|54|(1:59)(2:58|60)|(5:95|62|113|(1:67)(2:66|68)|(1:118)(6:112|70|(1:75)(2:74|76)|(1:78)|79|119))(1:117))|114|48)|109|82|(1:84)(1:86)|85|93|94)(2:7|8))(3:9|97|10))(2:11|(2:13|14)(3:15|16|(2:18|19)))|101|20|(2:22|23)|25|(0)(0)|28|(13:30|32|33|(1:34)|103|38|(0)(0)|47|(1:48)|109|82|(0)(0)|85)(0)|93|94|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f1, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[Catch: Exception -> 0x01f3, TryCatch #2 {Exception -> 0x01f3, blocks: (B:24:0x00a7, B:25:0x00aa, B:27:0x00c9, B:28:0x00d1, B:30:0x00e1, B:33:0x00e7, B:34:0x0104, B:36:0x010a, B:38:0x0118, B:40:0x011c, B:41:0x0125, B:43:0x012b, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014c, B:52:0x0158, B:54:0x015c, B:56:0x0160, B:81:0x019d, B:82:0x01aa, B:84:0x01b2, B:85:0x01d4, B:86:0x01df, B:46:0x0140, B:16:0x006b, B:62:0x016c, B:64:0x0170, B:70:0x017c, B:72:0x018a, B:79:0x0199), top: B:99:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a A[Catch: Exception -> 0x01f3, LOOP:0: B:34:0x0104->B:36:0x010a, LOOP_END, TryCatch #2 {Exception -> 0x01f3, blocks: (B:24:0x00a7, B:25:0x00aa, B:27:0x00c9, B:28:0x00d1, B:30:0x00e1, B:33:0x00e7, B:34:0x0104, B:36:0x010a, B:38:0x0118, B:40:0x011c, B:41:0x0125, B:43:0x012b, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014c, B:52:0x0158, B:54:0x015c, B:56:0x0160, B:81:0x019d, B:82:0x01aa, B:84:0x01b2, B:85:0x01d4, B:86:0x01df, B:46:0x0140, B:16:0x006b, B:62:0x016c, B:64:0x0170, B:70:0x017c, B:72:0x018a, B:79:0x0199), top: B:99:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c A[Catch: Exception -> 0x01f3, TryCatch #2 {Exception -> 0x01f3, blocks: (B:24:0x00a7, B:25:0x00aa, B:27:0x00c9, B:28:0x00d1, B:30:0x00e1, B:33:0x00e7, B:34:0x0104, B:36:0x010a, B:38:0x0118, B:40:0x011c, B:41:0x0125, B:43:0x012b, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014c, B:52:0x0158, B:54:0x015c, B:56:0x0160, B:81:0x019d, B:82:0x01aa, B:84:0x01b2, B:85:0x01d4, B:86:0x01df, B:46:0x0140, B:16:0x006b, B:62:0x016c, B:64:0x0170, B:70:0x017c, B:72:0x018a, B:79:0x0199), top: B:99:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140 A[Catch: Exception -> 0x01f3, TryCatch #2 {Exception -> 0x01f3, blocks: (B:24:0x00a7, B:25:0x00aa, B:27:0x00c9, B:28:0x00d1, B:30:0x00e1, B:33:0x00e7, B:34:0x0104, B:36:0x010a, B:38:0x0118, B:40:0x011c, B:41:0x0125, B:43:0x012b, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014c, B:52:0x0158, B:54:0x015c, B:56:0x0160, B:81:0x019d, B:82:0x01aa, B:84:0x01b2, B:85:0x01d4, B:86:0x01df, B:46:0x0140, B:16:0x006b, B:62:0x016c, B:64:0x0170, B:70:0x017c, B:72:0x018a, B:79:0x0199), top: B:99:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c A[Catch: Exception -> 0x01f3, TryCatch #2 {Exception -> 0x01f3, blocks: (B:24:0x00a7, B:25:0x00aa, B:27:0x00c9, B:28:0x00d1, B:30:0x00e1, B:33:0x00e7, B:34:0x0104, B:36:0x010a, B:38:0x0118, B:40:0x011c, B:41:0x0125, B:43:0x012b, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014c, B:52:0x0158, B:54:0x015c, B:56:0x0160, B:81:0x019d, B:82:0x01aa, B:84:0x01b2, B:85:0x01d4, B:86:0x01df, B:46:0x0140, B:16:0x006b, B:62:0x016c, B:64:0x0170, B:70:0x017c, B:72:0x018a, B:79:0x0199), top: B:99:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2 A[Catch: Exception -> 0x01f3, TryCatch #2 {Exception -> 0x01f3, blocks: (B:24:0x00a7, B:25:0x00aa, B:27:0x00c9, B:28:0x00d1, B:30:0x00e1, B:33:0x00e7, B:34:0x0104, B:36:0x010a, B:38:0x0118, B:40:0x011c, B:41:0x0125, B:43:0x012b, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014c, B:52:0x0158, B:54:0x015c, B:56:0x0160, B:81:0x019d, B:82:0x01aa, B:84:0x01b2, B:85:0x01d4, B:86:0x01df, B:46:0x0140, B:16:0x006b, B:62:0x016c, B:64:0x0170, B:70:0x017c, B:72:0x018a, B:79:0x0199), top: B:99:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01df A[Catch: Exception -> 0x01f3, TRY_LEAVE, TryCatch #2 {Exception -> 0x01f3, blocks: (B:24:0x00a7, B:25:0x00aa, B:27:0x00c9, B:28:0x00d1, B:30:0x00e1, B:33:0x00e7, B:34:0x0104, B:36:0x010a, B:38:0x0118, B:40:0x011c, B:41:0x0125, B:43:0x012b, B:45:0x013c, B:47:0x0142, B:48:0x0146, B:50:0x014c, B:52:0x0158, B:54:0x015c, B:56:0x0160, B:81:0x019d, B:82:0x01aa, B:84:0x01b2, B:85:0x01d4, B:86:0x01df, B:46:0x0140, B:16:0x006b, B:62:0x016c, B:64:0x0170, B:70:0x017c, B:72:0x018a, B:79:0x0199), top: B:99:0x0013, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r5v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321040CiE.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
