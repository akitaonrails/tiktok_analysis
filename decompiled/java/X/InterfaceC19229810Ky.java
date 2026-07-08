package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19229810Ky {
    void Cv2(int i);

    CopyOnWriteArrayList<C1261860iwS> Dz1();

    boolean Js2();

    long LA();

    void P22(int i);

    void Ql1();

    CopyOnWriteArrayList<C1261860iwS> R20(String str);

    InterfaceC1263910izl XB1();

    void Xn1(List<C1261860iwS> list);

    void a22(String str, Function0<Unit> function0);

    void ab0(boolean z);

    boolean cM0(C1261860iwS c1261860iwS, String str);

    void dI1(int i);

    String getEventType();

    C1910890zpH getLogger();

    CopyOnWriteArrayList<C1261860iwS> hX0();

    void k20(PlaceUserInfo placeUserInfo, Function0<Unit> function0);

    void kl2(AbstractC323330Clv<C1261860iwS> abstractC323330Clv, boolean z);

    boolean pc(String str);

    void s21(long j);

    void setEventType(String str);

    void uf0(Aweme aweme);
}
