package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0NwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610000NwE implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1140));

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        EnumC2004807tG enumC2004807tG;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (videoItemParams2 == null) {
            return new C1387205bq(null);
        }
        C631140OpE.LIZ.getClass();
        EnumC631120OpC enumC631120OpCLIZ = C631140OpE.LIZ(videoItemParams2);
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        C610010NwF c610010NwFLIZIZ = c633020OsG.LIZIZ(enumC631120OpCLIZ, videoItemParams2.getAweme().getAid());
        if (c610010NwFLIZIZ != null) {
            enumC2004807tG = c610010NwFLIZIZ.LIZIZ;
        } else {
            enumC2004807tG = null;
        }
        if (enumC2004807tG == EnumC2004807tG.MULTI_DSP) {
            c633020OsG.LJ(enumC631120OpCLIZ);
        }
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C610020NwG(videoItemParams2, enumC631120OpCLIZ, null), 3);
        return new C1387205bq(null);
    }
}
