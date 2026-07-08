package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0N0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0N0Y extends InterfaceC583520Muc, InterfaceC708860RrI {
    void LIZ();

    <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3);

    void LJ();

    void LJFF();

    void LJIIIZ();

    void LJIIL(OnUIPlayListener onUIPlayListener);

    String LJIILIIL(Video video, OnUIPlayListener onUIPlayListener);

    InterfaceC1483670oiD LJIILL();

    void LJIILLIIL();

    void LJIJI(String str);

    void LJIJJ();

    String LJIJJLI(Video video, int i);

    void LJJ(boolean z);

    void LJJI();

    String LJJIFFI(C584150Mvd c584150Mvd, OnUIPlayListener onUIPlayListener);

    String LJJII(C584150Mvd c584150Mvd);

    Integer LJJIIJ();

    void LJJIIJZLJL();

    void LJJIIZ();

    void LJJIIZI();

    void LJJIJ(OnUIPlayListener onUIPlayListener);

    void LJJIJIIJI(int i);

    void LJJIJIIJIL(OnUIPlayListener onUIPlayListener);

    void LJJIJIL(Aweme aweme, String str);

    void LJJIJL();

    void LJJIJLIJ(Long l);

    void LJJIL(Surface surface);

    void LJJIZ(String str);

    void LJJJ();

    void LJJJI(InterfaceC585470Mxl interfaceC585470Mxl);

    void LJJJIL(InterfaceC1483670oiD interfaceC1483670oiD);

    void LJJJJ(C586880N0c c586880N0c);

    String LJJJJI(Video video, Audio audio, boolean z, boolean z2);

    String LJJJJIZL(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i, boolean z2, HashMap map, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7, EnumC2281141EQm enumC2281141EQm, String str);

    void LJJJJJ();

    String LJJJJJL(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7, boolean z2, boolean z3, HashMap map, EnumC2281141EQm enumC2281141EQm, String str);

    void LJJJJL(Aweme aweme, EnumC2281141EQm enumC2281141EQm);

    void LJJJJLI(Aweme aweme, boolean z);

    String LJJJJLL(VideoUrlModel videoUrlModel, boolean z, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7);

    void LJJJJZ(Aweme aweme);

    void LJJJJZI(HashMap<String, Object> map);

    String LJJJLIIL();

    long LJJJLL(String str);

    void LJJJLZIJ(String str);

    void LJJJZ(C1479530obX c1479530obX);

    void LJJL();

    void LJJLI(boolean z);

    String LJJLIIIIJ(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3, boolean z4, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7);

    void LJJLIIIJ();

    void LJJLIIIJILLIZJL(Aweme aweme, OnPlayerPreparedListener onPlayerPreparedListener);

    Integer LJJLIIIJJI();

    String LJJLIIIJJIZ(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i);

    void LJJLIIIJL();

    void LJJLIIIJLJLI(Aweme aweme, C1913420ztM c1913420ztM);

    void LJJLIIIJLLLLLLLZ(Aweme aweme, String str);

    void LJJLIIJ(OnUIPlayListener onUIPlayListener);

    void LJJLIL(float f, float f2);

    void LJJLJ(Aweme aweme);

    void LJJLJLI();

    String LJJLL(Video video, OnUIPlayListener onUIPlayListener);

    String LJJZ(Video video, boolean z, int i, boolean z2, HashMap map);

    Long LJJZZI();

    String LJJZZIII(C1479530obX c1479530obX);

    String LJL(Video video, boolean z);

    String LJLI(Video video, int i, C581750Mrl c581750Mrl);

    boolean LJLJI(OnUIPlayListener onUIPlayListener);

    float getSpeed();

    void preload(List<Aweme> list);

    void release();

    void seek(float f);

    void setSpeed(float f);

    void setSurface(Surface surface);
}
