package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.google.gson.n;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839500WwW {
    public final Function0<SettingsModel> LIZ;
    public final Function0<C839590Wwf> LIZIZ;
    public final Function0<C822040WMo> LIZJ;
    public final Function0<n> LIZLLL;

    public C839500WwW() {
        this(null, null, null, 15);
    }

    public C839500WwW(Function0 function0, Function0 function02, C301890BsR c301890BsR, int i) {
        function0 = (i & 1) != 0 ? null : function0;
        function02 = (i & 2) != 0 ? null : function02;
        c301890BsR = (i & 8) != 0 ? null : c301890BsR;
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = null;
        this.LIZLLL = c301890BsR;
    }
}
