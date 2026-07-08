package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchSecondaryComment$1$2$1", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C1342820l32 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1344210l5H LL;
    public final /* synthetic */ C1340820kzo LLILLJJLI;
    public final /* synthetic */ CommentItemList LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C20600815jK<InterfaceC1891350zJl> LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342820l32(C1344210l5H c1344210l5H, C1340820kzo c1340820kzo, CommentItemList commentItemList, boolean z, C20600815jK<InterfaceC1891350zJl> c20600815jK, long j, InterfaceC1364105Vn<? super C1342820l32> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1344210l5H;
        this.LLILLJJLI = c1340820kzo;
        this.LLILLL = commentItemList;
        this.LLILZ = z;
        this.LLILZIL = c20600815jK;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342820l32(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1342820l32.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
