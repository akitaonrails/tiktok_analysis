package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel$addRemoteTasks$1", f = "SingleChatNoticeViewModel.kt", l = {116, 117, 120, 121, 123, 124, 133, 139, 146, 149}, m = "invokeSuspend")
public final class C15601068x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C909290Zln LL;
    public Function2 LLILLJJLI;
    public Object LLILLL;
    public SingleChatNoticeViewModel LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ SingleChatNoticeViewModel LLIZ;
    public final /* synthetic */ List<IMNoticeMsgStruct> LLIZLLLIL;
    public final /* synthetic */ Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> LLJ;
    public final /* synthetic */ Context LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15601068x(SingleChatNoticeViewModel singleChatNoticeViewModel, List<IMNoticeMsgStruct> list, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, Context context, InterfaceC1364105Vn<? super C15601068x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = singleChatNoticeViewModel;
        this.LLIZLLLIL = list;
        this.LLJ = function2;
        this.LLJI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15601068x(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Path cross not found for [B:24:0x006f, B:16:0x0044], limit reached: 206 */
    /* JADX WARN: Path cross not found for [B:35:0x00a6, B:77:0x018a], limit reached: 206 */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0205 -> B:81:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x021e -> B:81:0x01b0). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15601068x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
