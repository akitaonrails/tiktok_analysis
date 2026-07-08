package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.lifecycle.RefCountImpl$1", f = "RefCountImpl.kt", l = {30, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 37}, m = "invokeSuspend")
public final class C557020Lsy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C557010Lsx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557020Lsy(C557010Lsx c557010Lsx, InterfaceC1364105Vn<? super C557020Lsy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c557010Lsx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557020Lsy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0042 -> B:9:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0067 -> B:8:0x0019). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "RefCountImpl@866e.<init>$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L6d
            if (r0 == r2) goto L31
            if (r0 == r3) goto L54
            if (r0 != r4) goto L71
            X.C155000ia.LIZIZ(r8)
        L19:
            X.0Lsx r0 = r7.LLILLJJLI
            X.0Lt1 r1 = r0.LIZLLL
            r0 = 0
            r1.LIZJ(r0)
        L21:
            X.0Lsx r0 = r7.LLILLJJLI
            X.1DEK r0 = r0.LJFF
            r7.LL = r2
            java.lang.Object r8 = r0.LJIILIIL(r7)
            if (r8 != r5) goto L34
            X.C1C7U.LIZIZ(r6)
            return r5
        L31:
            X.C155000ia.LIZIZ(r8)
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r1 = r8.booleanValue()
            X.0Lsx r0 = r7.LLILLJJLI
            X.0Lt1 r0 = r0.LIZLLL
            boolean r0 = r0.LIZIZ()
            if (r1 == r0) goto L21
            if (r1 == 0) goto L5f
            X.0Lsx r0 = r7.LLILLJJLI
            r7.LL = r3
            java.lang.Object r0 = r0.LJ(r7)
            if (r0 != r5) goto L57
            X.C1C7U.LIZIZ(r6)
            return r5
        L54:
            X.C155000ia.LIZIZ(r8)
        L57:
            X.0Lsx r0 = r7.LLILLJJLI
            X.0Lt1 r0 = r0.LIZLLL
            r0.LIZJ(r2)
            goto L21
        L5f:
            X.0Lsx r0 = r7.LLILLJJLI
            r7.LL = r4
            java.lang.Object r0 = r0.LIZLLL(r7)
            if (r0 != r5) goto L19
            X.C1C7U.LIZIZ(r6)
            return r5
        L6d:
            X.C155000ia.LIZIZ(r8)
            goto L21
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557020Lsy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
