package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0o8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1461650o8h extends C05YF {
    LiveEvent<Pair<Float, Long>> Ak0();

    boolean B8();

    void Bh0(int i);

    void Bt0(String str);

    void Ci1(StickerItemModel stickerItemModel);

    void Dc2(List<? extends StickerItemModel> list);

    LiveEvent<Unit> Ks1();

    InterfaceC1444160ngU LJJIFFI();

    void LJJJLZIJ();

    void LLZZ();

    List<StickerItemModel> Lm();

    void Nm();

    void OC();

    void Oi2(float f, long j);

    void QZ1(String str, float f);

    void Qj(String str);

    void Qq(C121I<?> c121i);

    void Rg2(float f, float f2, float f3);

    Object X7();

    StickerItemModel YS0(String str);

    void a6(int i, int i2, int[] iArr);

    void cF1(String str, int i);

    void cS(int i, int i2, int i3, int i4, int i5);

    LiveEvent<Pair<Integer, Integer>> eQ2();

    C196874120y eX(String str);

    void fb1(InfoStickerModel infoStickerModel);

    LiveEvent<C529150Kp7> gG();

    void l0(Pair<Integer, Integer> pair);

    void l7(C121I<?> c121i);

    void m9(String str, String str2, int i, int i2, boolean z, Map<String, String> map);

    LiveEvent<C443120HZe<Float, Float, Float>> mF2();

    void nF0(String str, int i, int i2);

    void na2(Effect effect, Map<String, String> map);

    void pausePlay();

    void sB(boolean z);

    void sJ0(C348460DlM c348460DlM, String[] strArr, int i);

    boolean sL1(int i);

    void show();

    void ss1(C121M c121m);

    void u1();

    boolean ub();

    void v1(int i, boolean z);

    LiveEvent<StickerItemModel> v61();

    void v7(boolean z);

    LiveEvent<Unit> wq();
}
