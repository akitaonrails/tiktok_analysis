package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS123S0110000_5;
import kotlin.jvm.internal.AwS154S1100000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376960EqE implements C0EJ4 {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public static void LJFF(Function0 function0) {
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "UgcTemplateChecker", (String) function0.invoke());
    }

    @Override // X.C0EJ4
    public final Boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        return (Boolean) LJ("showOriginTemplateAnchor", new AwS549S0100000_5(videoPublishEditModel, 1256));
    }

    @Override // X.C0EJ4
    public final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        return ((Boolean) LJ("hasCutOutOrVideoBG", new AwS549S0100000_5(videoPublishEditModel, 1254))).booleanValue();
    }

    @Override // X.C0EJ4
    public final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        return ((Boolean) LJ("needToProduceTemplate", new AwS549S0100000_5(videoPublishEditModel, 1255))).booleanValue();
    }

    @Override // X.C0EJ4
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needToProducePUgcTemplate_");
        sbLIZ.append(z);
        return ((Boolean) LJ(C2188811AlT.LIZIZ(sbLIZ), new AwS123S0110000_5(videoPublishEditModel, z, 9))).booleanValue();
    }

    public final <T> T LJ(String str, Function0<? extends T> function0) {
        T t = (T) this.LIZ.get(str);
        if (t == null) {
            T tInvoke = function0.invoke();
            if (tInvoke != null) {
                this.LIZ.put(str, tInvoke);
            }
            LJFF(new AwS154S1100000_5(str, (String) tInvoke, 6));
            return tInvoke;
        }
        LJFF(new AwS154S1100000_5(str, (String) t, 5));
        return t;
    }
}
