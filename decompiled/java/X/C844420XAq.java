package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.tako.botpage.components.easteregg.model.TakoEasterEggConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0XAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844420XAq {
    public static List<TakoEasterEggConfig> LIZ;
    public static final Gson LIZIZ;
    public static InterfaceC844400XAo LIZJ;

    static {
        C1227904rF.LIZ.getClass();
        Gson gsonLIZLLL = C1227904rF.LIZLLL();
        gsonLIZLLL.getClass();
        e eVar = new e(gsonLIZLLL);
        eVar.LIZJ(new TakoEasterEggConfig.TakoEasterEggConfigSerializer(), TakoEasterEggConfig.class);
        eVar.LIZJ(new TakoEasterEggConfig.TakoEasterEggConfigDeserializer(), TakoEasterEggConfig.class);
        LIZIZ = eVar.LIZ();
    }
}
