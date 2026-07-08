package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xJW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814320xJW extends C09AY implements Function0<DialogC780480UjW> {
    public final /* synthetic */ SaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814320xJW(SaveAssem saveAssem) {
        super(0);
        this.LL = saveAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DialogC780480UjW invoke() {
        C780470UjV c780470UjV = new C780470UjV(this.LL.getContext());
        c780470UjV.LIZLLL = false;
        return c780470UjV.LIZ();
    }
}
