package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import java.util.ArrayList;
import java.util.Map;
import v7.o;

/* JADX INFO: renamed from: X.0Mq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580680Mq2 implements IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Map LIZIZ;
    public final /* synthetic */ boolean[] LIZJ;
    public final /* synthetic */ ProgressDialogC1399790mWv[] LIZLLL;
    public final /* synthetic */ o LJ;
    public final /* synthetic */ Bundle LJFF;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(InterfaceC1635410sex interfaceC1635410sex) {
        InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
        if (interfaceC1635410sex2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.LIZ);
            interfaceC1635410sex2.LJFF(arrayList, false, this.LIZIZ, new C581070Mqf(this, 0));
        }
    }

    public C580680Mq2(String str, Map map, boolean[] zArr, ProgressDialogC1399790mWv[] progressDialogC1399790mWvArr, o oVar, Bundle bundle) {
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = zArr;
        this.LIZLLL = progressDialogC1399790mWvArr;
        this.LJ = oVar;
        this.LJFF = bundle;
    }
}
