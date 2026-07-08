package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import duk.p;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS75S1000000_25;
import kotlin.jvm.internal.AwS88S1300000_25;

/* JADX INFO: renamed from: X.0sNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1624480sNK extends InterfaceC1623080sL4, InterfaceC1624490sNL {
    void LIZ(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void LIZIZ(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    void LIZJ(Effect effect, IFetchEffectListener iFetchEffectListener);

    void LIZLLL(Effect effect, boolean z);

    void LJ(Effect effect, boolean z, boolean z2, boolean z3, IFetchEffectListener iFetchEffectListener);

    void LJFF(List list, boolean z, Map map, IFetchEffectListListener iFetchEffectListListener);

    int LJI();

    InterfaceC1625470sOv LJII();

    Pair<String, String> LJIIIIZZ();

    void LJIIIZ();

    String LJIIJ();

    Effect LJIIJJI();

    void LJIIL(C1629230sUz c1629230sUz, AwS75S1000000_25 awS75S1000000_25);

    String LJIILIIL();

    int LJIILJJIL();

    void LJIILL(C05NX c05nx);

    void LJIILLIIL(Effect effect);

    int LJIIZILJ();

    String LJIJ();

    C1625920sPe LJIJI();

    void LJIJJ();

    long LJIJJLI();

    void LJIL();

    void LJJ(boolean z);

    InterfaceC1625550sP3 LJJI();

    void LJJIFFI(String str);

    void LJJII(String str);

    long LJJIII();

    boolean LJJIIJ(Effect effect);

    void LJJIIJZLJL(boolean z);

    void LJJIIZ(long j);

    C19475711Hn LJJIIZI();

    void LJJIJ();

    Integer LJJIJIIJI();

    long LJJIJIIJIL();

    long LJJIJIL();

    void LJJIJL(long j);

    String LJJIJLIJ();

    boolean LJJIL();

    InterfaceC1625530sP1 LJJIZ();

    void LJJJ(C1622680sKQ c1622680sKQ);

    MutableLiveData LJJJI();

    C1629270sV3 LJJJIL();

    void LJJJJ(Effect effect, AwS88S1300000_25 awS88S1300000_25, AFwS266S0000000_25 aFwS266S0000000_25);

    void LJJJJI(C1629220sUy c1629220sUy);

    p LJJJJIZL();

    void LJJJJJ(String str);

    String LJJJJJL();

    long LJJJJL();

    void LJJJJLI(boolean z);

    void LJJJJLL(String str);

    String LJJJJZ();

    void LJJJJZI(Effect effect);

    Map<String, List<Integer>> LJJJLIIL();

    void LJJJLZIJ();

    void LJJJZ(int i);

    Effect LJJL();

    void LJJLI(long j);

    void LJJLIIIJILLIZJL(int i);

    void LJJLIIIJJI(int i);

    C1629320sV8 LJJLIIIJJIZ();

    long LJJLIIIJL();

    void LJJLIIIJLJLI();

    long LJJLIIIJLLLLLLLZ();

    void LJJLIIJ(long j);

    boolean LJJLJ();

    p LJJLJLI();

    void LJJLL();

    Effect LLILIL();

    InterfaceC1627350sRx getStickerRepository();

    void release();
}
