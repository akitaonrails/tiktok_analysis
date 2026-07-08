package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import defpackage.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Pgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.utils.SearchCommonHorizontalLoadMoreUtil$executeLoadMoreRequest$1", f = "SearchCommonHorizontalLoadMoreUtil.kt", l = {71, 78, 90}, m = "invokeSuspend")
public final class C651440Pgs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public SearchHorizontalData LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ j.d LLILZ;
    public final /* synthetic */ InterfaceC651280Pgc LLILZIL;
    public final /* synthetic */ CompletionBlock<j.c> LLILZLL;
    public final /* synthetic */ InterfaceC634840OvC LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C651440Pgs(j.d dVar, InterfaceC651280Pgc interfaceC651280Pgc, CompletionBlock<j.c> completionBlock, InterfaceC634840OvC interfaceC634840OvC, InterfaceC1364105Vn<? super C651440Pgs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = dVar;
        this.LLILZIL = interfaceC651280Pgc;
        this.LLILZLL = completionBlock;
        this.LLIZ = interfaceC634840OvC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C651440Pgs(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C651440Pgs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
