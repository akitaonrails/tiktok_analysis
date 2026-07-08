package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Mu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$addRemoteTasks$1", f = "BaseCommonChatNoticeViewModel.kt", l = {219, 221, 223, 231, 236, 238, 239, 241, 242, 244, 246}, m = "invokeSuspend")
public final class C1596206Mu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Function2 LL;
    public BaseCommonChatNoticeViewModel LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<IMNoticeMsgStruct> LLILZIL;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILZLL;
    public final /* synthetic */ Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1596206Mu(List<IMNoticeMsgStruct> list, BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super C1596206Mu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = baseCommonChatNoticeViewModel;
        this.LLIZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1596206Mu(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ac, code lost:
    
        if (r11.equals("receiver_permission_off") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03b0, code lost:
    
        r1 = new X.C06AH(X.EnumC1596306Mv.PERMISSION_OFF, r8);
        r15.LL = r4;
        r15.LLILLJJLI = r3;
        r15.LLILLL = r2;
        r15.LLILZ = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03c4, code lost:
    
        if (r4.invoke(r1, r15) != r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03c6, code lost:
    
        X.C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.addRemoteTasks$1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03c9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ed, code lost:
    
        if (r11.equals("sender_permission_off") == false) goto L35;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:130:0x02d8, B:158:0x03a4], limit reached: 182 */
    /* JADX WARN: Path cross not found for [B:134:0x02fb, B:157:0x03a0], limit reached: 182 */
    /* JADX WARN: Path cross not found for [B:15:0x0062, B:13:0x0050], limit reached: 182 */
    /* JADX WARN: Path cross not found for [B:33:0x00c5, B:35:0x00cd], limit reached: 182 */
    /* JADX WARN: Path cross not found for [B:67:0x018c, B:37:0x00d1], limit reached: 182 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0205  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.ss.android.ugc.aweme.im.message.content.SystemContent$Key, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0255 -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x026a -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x028b -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x02ad -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x02ce -> B:27:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x03c4 -> B:27:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x03e0 -> B:27:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x03f5 -> B:27:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0186 -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x018d -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0195 -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01ba -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01cc -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01e3 -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0219 -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0225 -> B:28:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x023b -> B:28:0x00b3). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1596206Mu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
