package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.common.model.InternalShareSortedListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0leX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.datamgr.repo.ShareSortedListRepoImpl$requestSortList$2", f = "ShareSortedListRepoImpl.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 82, 92}, m = "invokeSuspend")
public final class C1366070leX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1366080leY LL;
    public Object LLILLJJLI;
    public InternalShareSortedListResponse LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1366090leZ LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ InterfaceC1366080leY LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366070leX(C1366090leZ c1366090leZ, String str, String str2, int i, InterfaceC1366080leY interfaceC1366080leY, InterfaceC1364105Vn<? super C1366070leX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c1366090leZ;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = i;
        this.LLJILJIL = interfaceC1366080leY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1366070leX c1366070leX = new C1366070leX(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c1366070leX.LLIZ = obj;
        return c1366070leX;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: all -> 0x01cb, TryCatch #1 {all -> 0x01cb, blocks: (B:8:0x002b, B:24:0x00a7, B:25:0x00aa, B:27:0x00b0, B:29:0x00c5, B:32:0x00cd, B:34:0x00eb, B:36:0x00fa, B:37:0x00fd, B:39:0x0101, B:40:0x0103, B:31:0x00cb, B:18:0x008f, B:19:0x0092, B:21:0x009e, B:23:0x00a2, B:44:0x011e, B:46:0x0122, B:47:0x0124, B:14:0x0065), top: B:85:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172 A[Catch: all -> 0x01cd, TRY_ENTER, TryCatch #2 {all -> 0x01cd, blocks: (B:60:0x0172, B:70:0x01a6, B:72:0x01b3, B:73:0x01b6, B:75:0x01c0, B:76:0x01c2, B:48:0x012f, B:50:0x0142, B:52:0x0151, B:54:0x0156, B:55:0x0158, B:62:0x0176, B:64:0x0181, B:67:0x0187, B:68:0x01a1), top: B:86:0x012f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181 A[Catch: all -> 0x01a5, TryCatch #0 {all -> 0x01a5, blocks: (B:62:0x0176, B:64:0x0181, B:67:0x0187, B:68:0x01a1), top: B:83:0x0176, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187 A[Catch: all -> 0x01a5, TryCatch #0 {all -> 0x01a5, blocks: (B:62:0x0176, B:64:0x0181, B:67:0x0187, B:68:0x01a1), top: B:83:0x0176, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b3 A[Catch: all -> 0x01cd, TryCatch #2 {all -> 0x01cd, blocks: (B:60:0x0172, B:70:0x01a6, B:72:0x01b3, B:73:0x01b6, B:75:0x01c0, B:76:0x01c2, B:48:0x012f, B:50:0x0142, B:52:0x0151, B:54:0x0156, B:55:0x0158, B:62:0x0176, B:64:0x0181, B:67:0x0187, B:68:0x01a1), top: B:86:0x012f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0 A[Catch: all -> 0x01cd, TryCatch #2 {all -> 0x01cd, blocks: (B:60:0x0172, B:70:0x01a6, B:72:0x01b3, B:73:0x01b6, B:75:0x01c0, B:76:0x01c2, B:48:0x012f, B:50:0x0142, B:52:0x0151, B:54:0x0156, B:55:0x0158, B:62:0x0176, B:64:0x0181, B:67:0x0187, B:68:0x01a1), top: B:86:0x012f, inners: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366070leX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
