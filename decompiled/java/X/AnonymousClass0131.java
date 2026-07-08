package X;

import android.view.View;
import com.bytedance.android.livesdk.billboard.broadcast.BillboardMultiDeleteConfirmSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0131, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0131 extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ BillboardMultiDeleteConfirmSheetFragment LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0131(BillboardMultiDeleteConfirmSheetFragment billboardMultiDeleteConfirmSheetFragment, int i, View view) {
        super(1);
        this.LL = billboardMultiDeleteConfirmSheetFragment;
        this.LLILLJJLI = i;
        this.LLILLL = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r1 == 0) goto L12;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(java.lang.Integer r7) {
        /*
            r6 = this;
            java.lang.Number r7 = (java.lang.Number) r7
            int r1 = r7.intValue()
            com.bytedance.android.livesdk.billboard.broadcast.BillboardMultiDeleteConfirmSheetFragment r5 = r6.LL
            X.014x r0 = r5.LLJLLL
            if (r0 == 0) goto L23
            int r0 = r6.LLILLJJLI
            if (r1 >= r0) goto L23
            if (r1 == 0) goto L25
            r3 = 450(0x1c2, double:2.223E-321)
        L14:
            android.view.View r2 = r6.LLILLL
            X.01zW r1 = new X.01zW
            r0 = 34
            r1.<init>(r5, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r2, r1, r3)
        L20:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L23:
            if (r1 != 0) goto L20
        L25:
            r3 = 200(0xc8, double:9.9E-322)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0131.invoke(java.lang.Object):java.lang.Object");
    }
}
