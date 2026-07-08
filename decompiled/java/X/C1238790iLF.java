package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iLF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1238790iLF extends C2217421BqW implements Function1<String, Unit> {
    public C1238790iLF(C101N c101n) {
        super(1, c101n, C101N.class, "onEditAgeButtonClick", "onEditAgeButtonClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C101N c101n = (C101N) this.receiver;
        c101n.LJFF(4, "update_bd");
        ComplianceServiceProvider.LIZLLL().LJIIIIZZ(c101n.LIZ, new C1219190hpd(c101n), "content_classification_mask_layer");
        return Unit.LIZ;
    }
}
