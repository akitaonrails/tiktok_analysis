package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0ryp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1609290ryp {
    boolean LIZ();

    HashMap<EnumC1608710rxt, View> LIZIZ();

    C1609360ryw LIZJ();

    void LIZLLL(Context context, AvatarComponentView avatarComponentView);

    Map<EnumC1607270rvZ, InterfaceC1606880ruw> LJ();

    void LJFF(Canvas canvas, AwS425S0200000_24 awS425S0200000_24);

    void LJI(EnumC1607270rvZ enumC1607270rvZ, Function1<? super InterfaceC1606880ruw, Unit> function1);

    void LJII(C1608750rxx c1608750rxx);

    void LJIIIIZZ(EnumC1607270rvZ enumC1607270rvZ, C1256520inq c1256520inq);

    int LJIIIZ();

    void LJIIJ(Integer num, Integer num2);

    C1609600rzK LJIIJJI();

    int LJIIL();

    void LJIILIIL(EnumC1607270rvZ enumC1607270rvZ, EnumC1256840ioM enumC1256840ioM, InterfaceC713050Ry3 interfaceC713050Ry3, boolean z);

    void LJIILJJIL(LifecycleOwner lifecycleOwner, Object obj, String str, Function1 function1, boolean z, boolean z2);

    void LJIILL(int i);

    void LJIILLIIL(AwS598S0100000_19 awS598S0100000_19);

    void LJIJ(C03IT c03it);

    void LJIJI(Object obj, boolean z, EnumC1607270rvZ enumC1607270rvZ);

    void onSizeChanged(int i, int i2, int i3, int i4);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
