package X;

import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0U78, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0U78 extends InterfaceC769000UEo {
    public static final C397601gc LIZ = C397601gc.LIZ;

    void LIZ(C0UD1 c0ud1);

    void LIZJ(int i, int i2, String str, String str2);

    String LIZLLL();

    List<LiveEffect> LJ(String str);

    void LJFF();

    void LJI(String str, LiveEffect liveEffect, float f, int i);

    void LJII(List<? extends LiveEffect> list, List<String> list2, List<Float> list3);

    void LJIIIIZZ(LiveEffect liveEffect, String str);

    JSONObject LJIIIZ();

    void LJIIJ(LiveEffect liveEffect, String str);

    void LJIIJJI(boolean z);

    void LJIIL();

    LiveComposerNode LJIILIIL(LiveEffect liveEffect);

    boolean LJIILJJIL(String str);

    int LJIILL(String str, String str2);

    void LJIILLIIL(LiveEffect liveEffect);

    void LJIIZILJ(int i, LiveEffect liveEffect);

    Float LJIJ(String str, String str2);

    void LJIJJ();

    void LJIJJLI(boolean z);

    void LJIL(int i, LiveEffect liveEffect, String str);

    boolean LJJ(LiveEffect liveEffect);

    void LJJI(JSONObject jSONObject);

    List<LiveComposerNode> LJJIFFI();

    void LJJII(String str, List<? extends LiveEffect> list);

    void LJJIII();

    List<LiveComposerNode> LJJIIJ(List<? extends LiveEffect> list);

    boolean LJJIIJZLJL(LiveEffect liveEffect, String str);

    boolean LJJIIZ(List<? extends LiveEffect> list);

    void LJJIIZI();

    void LJJIJ();

    void LJJLIIIJJI();

    C0UD1 createEffectTrack();

    boolean isInitialized();
}
