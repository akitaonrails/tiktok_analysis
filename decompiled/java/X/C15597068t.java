package X;

import android.content.Context;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$addRemoteTasks$1", f = "GroupChatNoticeViewModel.kt", l = {105, 107, 108, 113, 118}, m = "invokeSuspend")
public final class C15597068t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Function2 LL;
    public Object LLILLJJLI;
    public GroupChatNoticeViewModel LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ List<IMNoticeMsgStruct> LLILZLL;
    public final /* synthetic */ Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ GroupChatNoticeViewModel LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15597068t(List<IMNoticeMsgStruct> list, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, Context context, GroupChatNoticeViewModel groupChatNoticeViewModel, InterfaceC1364105Vn<? super C15597068t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = list;
        this.LLIZ = function2;
        this.LLIZLLLIL = context;
        this.LLJ = groupChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15597068t(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0047, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:13:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c1 -> B:13:0x0047). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15597068t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
