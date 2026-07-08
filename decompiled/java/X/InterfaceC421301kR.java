package X;

import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;

/* JADX INFO: renamed from: X.01kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC421301kR {
    void LIZ(SeiAppData seiAppData);

    void LIZIZ(List<CountdownContent> list);

    void LIZJ(List<Long> list);

    void LIZLLL(String str);

    void LJ(C01FV c01fv);

    void LJFF(String str);

    void LJI(C01ED c01ed);

    void LJII(GetUserPlaySettingsParams getUserPlaySettingsParams, Function1<? super CountdownConfig, Unit> function1);

    void LJIIIIZZ(CountdownConfig countdownConfig);

    C01EB LJIIIZ();

    void LJIIJ(long j, long j2);

    C01E9 LJIIJJI(String str);

    C01EB LJIIL(String str);

    C01E5 LJIILIIL(String str);

    void LJIILJJIL(String str);

    void LJIILL(C01EE c01ee);

    List<C01E5> LJIILLIIL();

    Long LJIIZILJ(String str);

    Long LJIJ(String str);

    C01ED LJIJI();

    boolean LJIJJ(String str);

    C01EB LJIJJLI(String str);

    void LJIL(C01EE c01ee);

    void LJJ();

    void clearCache();

    void destroy();

    void endOneCountdownPlay(CountdownEndParams countdownEndParams);

    void startOneCountdownPlay(CountdownStartParams countdownStartParams);
}
