package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1625000sOA extends InterfaceC1623390sLZ, C05YF {
    @Override // X.InterfaceC1623390sLZ
    /* synthetic */ InterfaceC1624480sNK C0();

    void Es2(boolean z);

    @Override // X.InterfaceC1622570sKF
    /* synthetic */ InterfaceC1622080sJS I2(Function1<? super InterfaceC1622080sJS, Boolean> function1);

    boolean II0(C1627370sRz c1627370sRz);

    LiveEvent<Unit> Iq0();

    LiveData<Effect> Lq0();

    LiveEvent<AbstractC1627380sS0> Ma2();

    void Mg2();

    void QV(InterfaceC1623190sLF interfaceC1623190sLF);

    InterfaceC1638150sjN Qb0();

    void RK2(boolean z);

    @Override // X.InterfaceC1623390sLZ
    /* synthetic */ InterfaceC1623190sLF U();

    /* synthetic */ C11NZ<AbstractC1557360qd4> U6();

    boolean VS1();

    C11NZ<Pair<Effect, C991780buq>> WJ0();

    C1623150sLB Ye1();

    void Zw2(boolean z);

    LiveEvent<Boolean> aD0();

    void aR0(InterfaceC1622330sJr interfaceC1622330sJr, FrameLayout frameLayout, C1635820sfc c1635820sfc);

    void ao0(boolean z);

    @Override // X.InterfaceC1623390sLZ
    /* synthetic */ SafeHandler b1();

    void c21(Effect effect);

    LiveEvent<Boolean> dN1();

    /* synthetic */ C11NZ<EnumC1159860gHw> dj();

    void e62();

    void ez2();

    void fE0();

    LiveEvent<Boolean> gH();

    /* synthetic */ LifecycleOwner getLifecycleOwner();

    void jg2();

    FaceStickerBean jr();

    void kd1(boolean z);

    void kx0(List<? extends Effect> list, boolean z);

    void nS1(boolean z);

    void ng2(Effect effect);

    LiveData<Boolean> o60();

    LiveEvent<AbstractC1448380nnI> pb2();

    void pp2(boolean z, String str);

    /* synthetic */ void qf();

    LiveEvent<Boolean> qr1();

    LiveEvent<Effect> rV1();

    /* synthetic */ void rf(InterfaceC1623190sLF interfaceC1623190sLF);

    /* synthetic */ void sb(InterfaceC1622080sJS interfaceC1622080sJS);

    /* synthetic */ void sk(InterfaceC1622080sJS interfaceC1622080sJS);

    void sv1();

    /* synthetic */ void t8(Function1<? super InterfaceC1622080sJS, Boolean> function1);

    void tb1(InterfaceC1622330sJr interfaceC1622330sJr, FrameLayout frameLayout);

    C0LH1 vS0();

    /* synthetic */ void vq(int i, int i2, int i3, String str);

    @Override // X.InterfaceC1623390sLZ
    /* synthetic */ InterfaceC1625410sOp w4();

    LiveEvent<Boolean> xP0();

    AiMeStyleInfo zH2();

    LiveEvent<Boolean> zI();
}
