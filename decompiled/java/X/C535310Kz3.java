package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535310Kz3 implements InterfaceC21360318iX {
    public final /* synthetic */ int LIZ;

    @Override // X.InterfaceC21360318iX
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC21360318iX
    public final void LIZJ() {
        C530750Krh c530750Krh = C530750Krh.LJFF;
        if (c530750Krh != null) {
            c530750Krh.LIZ();
        }
    }

    public C535310Kz3(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC21360318iX
    public final void LIZ(Map map) {
        if (C522610KeZ.LIZ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(map);
            C20684815ws.LJIILLIIL("tool_performance_effects_image_tray", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC21360318iX
    public final void LIZLLL(int i, final Function2 function2) {
        C530750Krh.LJFF.LIZLLL(this.LIZ, i, 0, true, new InterfaceC535290Kz1() { // from class: X.0Kz2
            @Override // X.InterfaceC535290Kz1
            public final void LIZ(boolean z, int i2, List<MediaModel> list, AbstractC530360Kr4 abstractC530360Kr4) {
                function2.invoke(Boolean.valueOf(z), list);
            }
        });
    }
}
