package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.IntelligentBoardSaveAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814250xJP extends C09AY implements Function0<DialogC780480UjW> {
    public final /* synthetic */ IntelligentBoardSaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814250xJP(IntelligentBoardSaveAssem intelligentBoardSaveAssem) {
        super(0);
        this.LL = intelligentBoardSaveAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DialogC780480UjW invoke() {
        C780470UjV c780470UjV = new C780470UjV(this.LL.getContext());
        c780470UjV.LIZLLL = false;
        return c780470UjV.LIZ();
    }
}
