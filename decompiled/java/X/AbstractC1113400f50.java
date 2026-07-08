package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0f50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1113400f50 implements InterfaceC1112730f3v {
    public final C2091508Hh<Long, ArrayList<Integer>> LIZ = new C2091508Hh<>(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    public abstract PublicAreaMessageCommon.CreatorSuccessInfo.Topic LIZIZ(AbstractC1110800f0o<?> abstractC1110800f0o);

    public abstract void LIZJ(AbstractC1110790f0n abstractC1110790f0n, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic);
}
