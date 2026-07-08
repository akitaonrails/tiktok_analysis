package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lPV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel$publishReplyServer$2", f = "RepostSyncViewModel.kt", l = {246, 288, 334}, m = "invokeSuspend")
public final class C1356750lPV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super RepostReplyStruct>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<TextExtraStruct> LLILLL;
    public final /* synthetic */ C1356730lPT LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ RepostSyncViewModel LLIZLLLIL;
    public final /* synthetic */ RepostReplyStruct LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1356750lPV(List<? extends TextExtraStruct> list, C1356730lPT c1356730lPT, String str, String str2, String str3, RepostSyncViewModel repostSyncViewModel, RepostReplyStruct repostReplyStruct, InterfaceC1364105Vn<? super C1356750lPV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1356730lPT;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = repostSyncViewModel;
        this.LLJ = repostReplyStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1356750lPV c1356750lPV = new C1356750lPV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1356750lPV.LLILLJJLI = obj;
        return c1356750lPV;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: all -> 0x00a7, TryCatch #1 {all -> 0x00a7, blocks: (B:10:0x0023, B:13:0x0035, B:19:0x0045, B:20:0x0049, B:24:0x0052, B:26:0x0056, B:27:0x0058, B:29:0x005c, B:34:0x0068, B:36:0x006c, B:38:0x0070, B:39:0x0074, B:41:0x0078, B:43:0x007e, B:48:0x008a), top: B:173:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356750lPV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super RepostReplyStruct> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
