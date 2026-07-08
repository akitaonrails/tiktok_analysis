package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.manager.QuickShareManager$onLoadComplete$2$1$1", f = "QuickShareManager.kt", l = {}, m = "invokeSuspend")
public final class C1364770lcR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewOnTouchListenerC1364760lcQ LL;
    public final /* synthetic */ List<AbstractC1364920lcg> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1364770lcR(ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ, List<? extends AbstractC1364920lcg> list, InterfaceC1364105Vn<? super C1364770lcR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewOnTouchListenerC1364760lcQ;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1364770lcR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r0 = r1.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if ((r0 instanceof android.view.ViewGroup) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        r1 = r1.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if ((r1 instanceof android.view.ViewGroup) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        r1 = (android.view.ViewGroup) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        r1.setClipChildren(false);
        r1.setClipToPadding(false);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        r15 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:30:0x00be). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364770lcR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
