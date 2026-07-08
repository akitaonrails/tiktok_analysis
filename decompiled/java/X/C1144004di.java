package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.dialog.PcsServiceBioDialog;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1144004di extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsServiceBioDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144004di(PcsServiceBioDialog pcsServiceBioDialog) {
        super(1);
        this.LL = pcsServiceBioDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.RQ2(this.LL, new C1140404d8());
        assembler2.RQ2(this.LL, new C1144104dj());
        assembler2.RQ2(this.LL, new C1144204dk());
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue()) {
            assembler2.RQ2(this.LL, new C1139404cy());
            assembler2.RQ2(this.LL, new C1143904dh());
        }
        return Unit.LIZ;
    }
}
