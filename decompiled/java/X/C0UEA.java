package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UEA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public interface C0UEA {
    void Kc(Map map);

    Object LIZ(String str, InterfaceC1364105Vn<? super LiveEffect> interfaceC1364105Vn);

    boolean LIZIZ(Effect effect);

    Object LIZJ(String str, String str2, String str3, InterfaceC1364105Vn<? super LiveEffect> interfaceC1364105Vn);

    void LIZLLL(List<String> list, Function1<? super List<? extends LiveEffect>, Unit> function1);

    Object LJ(List<String> list, InterfaceC1364105Vn<? super List<? extends LiveEffect>> interfaceC1364105Vn);

    Object LJFF(String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1, Function1 function12, boolean z, boolean z2);

    Object LJI(String str, String str2, String str3, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void LJII();

    boolean LJIIIIZZ(String str, String str2);

    Object LJIIIZ(String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJIIJ();
}
