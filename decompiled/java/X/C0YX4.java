package X;

import com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YX4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent$startPoling$1", f = "PigeonIDCChangeComponent.kt", l = {BaseNotice.RECOMMEND_LIVE, 51}, m = "invokeSuspend")
public final class C0YX4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonIDCChangeComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YX4(PigeonIDCChangeComponent pigeonIDCChangeComponent, InterfaceC1364105Vn<? super C0YX4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonIDCChangeComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YX4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008c -> B:7:0x0016). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "PigeonIDCChangeComponent@bd58.startPoling$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L92
            if (r0 == r3) goto L7b
            if (r0 != r4) goto L96
            X.C155000ia.LIZIZ(r11)
        L16:
            X.0YX7 r11 = (X.C0YX7) r11
            if (r11 == 0) goto L65
            com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent r7 = r10.LLILLJJLI
            r7.getClass()
            java.lang.String r8 = r11.LIZ
            X.0YXE r0 = r7.LLILLL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi r0 = (com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi) r0
            X.1DDq r0 = r0.LJJJJI()
            java.lang.Object r6 = r0.getValue()
            X.0YWT r6 = (X.C0YWT) r6
            int r0 = r8.length()
            if (r0 == 0) goto L65
            java.lang.String r0 = r6.LJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 != 0) goto L65
            X.0YIy r0 = com.bytedance.tts.pigeon.GECPigeon.Companion
            r0.getClass()
            X.0YWU r0 = X.C872060YIy.LIZ()
            X.052P r2 = r0.LIZ()
            kotlin.jvm.internal.AwS128S1100000_14 r1 = new kotlin.jvm.internal.AwS128S1100000_14
            r0 = 12
            r1.<init>(r8, r6, r0)
            java.lang.String r0 = "rd_switch_flow"
            r2.LIZ(r0, r1)
            X.0YXE r0 = r7.LLILLL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi r0 = (com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi) r0
            r0.LJIILLIIL()
        L65:
            com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent r0 = r10.LLILLJJLI
            X.0YX7 r0 = r0.LLILZ
            int r0 = r0.LIZJ
            long r0 = (long) r0
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            r10.LL = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r5) goto L7e
            X.C1C7U.LIZIZ(r9)
            return r5
        L7b:
            X.C155000ia.LIZIZ(r11)
        L7e:
            com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent r2 = r10.LLILLJJLI
            X.0YX5 r1 = new X.0YX5
            r0 = 0
            r1.<init>(r2, r0)
            r10.LL = r4
            java.lang.Object r11 = r2.LJJLIIIJILLIZJL(r10, r1)
            if (r11 != r5) goto L16
            X.C1C7U.LIZIZ(r9)
            return r5
        L92:
            X.C155000ia.LIZIZ(r11)
            goto L65
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YX4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
