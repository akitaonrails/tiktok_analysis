package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08c9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.openstory.intent.OpenStoryEditorActivityLauncher$launchSocialVideoEditActivity$1", f = "OpenStoryEditorActivityLauncher.kt", l = {}, m = "invokeSuspend")
public final class C2153508c9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Intent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2153508c9(Context context, Intent intent, InterfaceC1364105Vn<? super C2153508c9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2153508c9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenStoryEditorActivityLauncher@5876.launchSocialVideoEditActivity$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1660680tJi.LIZ().LJIIZILJ(this.LL, this.LLILLJJLI, true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OpenStoryEditorActivityLauncher@5876.launchSocialVideoEditActivity$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to launch story creation activity: ");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
