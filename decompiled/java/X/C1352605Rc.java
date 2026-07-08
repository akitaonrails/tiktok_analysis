package X;

import com.ss.android.ugc.aweme.publish.service.InternalDraftSizeCalculatorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.service.InternalDraftSizeCalculatorImpl$calculateDraftSize$2", f = "InternalDraftSizeCalculatorImpl.kt", l = {}, m = "invokeSuspend")
public final class C1352605Rc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InternalDraftSizeCalculatorImpl LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352605Rc(InternalDraftSizeCalculatorImpl internalDraftSizeCalculatorImpl, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C1352605Rc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = internalDraftSizeCalculatorImpl;
        this.LLILLJJLI = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352605Rc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, blocks: (B:3:0x0011, B:5:0x0058, B:7:0x0062, B:9:0x006e, B:10:0x0077, B:11:0x008a, B:12:0x00ab), top: B:28:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1352605Rc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
