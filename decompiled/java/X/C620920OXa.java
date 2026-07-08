package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel$publishComment$2$1", f = "BulletinCommentActionViewModel.kt", l = {291}, m = "invokeSuspend")
public final class C620920OXa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinCommentActionViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Comment LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C0OTS LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ C0OTS LLJI;
    public final /* synthetic */ C0OTS LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C620920OXa(BulletinCommentActionViewModel bulletinCommentActionViewModel, String str, Comment comment, boolean z, C0OTS c0ots, String str2, String str3, Context context, C0OTS c0ots2, C0OTS c0ots3, InterfaceC1364105Vn<? super C620920OXa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinCommentActionViewModel;
        this.LLILLL = str;
        this.LLILZ = comment;
        this.LLILZIL = z;
        this.LLILZLL = c0ots;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = context;
        this.LLJI = c0ots2;
        this.LLJIJIL = c0ots3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C620920OXa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0600  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C620920OXa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
