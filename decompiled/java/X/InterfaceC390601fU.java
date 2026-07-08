package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01fU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC390601fU {
    void LIZ(DataChannel dataChannel);

    void LIZIZ(long j, boolean z);

    C11KS LIZJ(Context context, EnumC389301fH enumC389301fH);

    void LIZLLL(String str);

    void LJ();

    List<InterfaceC395901gL> LJFF();

    C11KS LJI(Context context, EnumC389301fH enumC389301fH);

    void LJII(boolean z);

    boolean LJIIIIZZ();

    Object LJIIIZ(Context context, EnumC389301fH enumC389301fH, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    C11KS LJIIJ(Context context, InterfaceC395901gL interfaceC395901gL, C388501f9 c388501f9);

    InterfaceC395901gL LJIIJJI(long j);

    void LJIIL(LifecycleOwner lifecycleOwner, Function2<? super Integer, ? super LiveEffect, Unit> function2);

    void LJIILIIL(InterfaceC395901gL interfaceC395901gL);

    void LJIILJJIL(InterfaceC395901gL interfaceC395901gL);

    void pauseEffect();

    void release();
}
