package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.SubSpaceDetailListAssem;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507410Jv9 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ SubSpaceDetailListAssem LL;
    public final /* synthetic */ C504910Jr7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507410Jv9(SubSpaceDetailListAssem subSpaceDetailListAssem, C504910Jr7 c504910Jr7) {
        super(1);
        this.LL = subSpaceDetailListAssem;
        this.LLILLJJLI = c504910Jr7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        Object objH2;
        Context context = this.LL.getContext();
        if (context != null) {
            objH2 = C786410Ut5.H2(context, "clipboard");
        } else {
            objH2 = null;
        }
        try {
            C20145713s7.LIZJ((ClipboardManager) objH2, ClipData.newPlainText("label", this.LLILLJJLI.LIZ.text), CertProviderManagerKt.findCert("bpea-sub_space_copy", 1476399129));
            this.LL.kp().wQ2().LIZIZ("copy");
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
