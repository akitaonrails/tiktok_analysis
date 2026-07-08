package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814330xJX extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ SaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814330xJX(SaveAssem saveAssem) {
        super(1);
        this.LL = saveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        C291301Ax c291301AxHo = this.LL.Ho();
        if (c291301AxHo != null) {
            c291301AxHo.LL = str2;
        }
        return Unit.LIZ;
    }
}
