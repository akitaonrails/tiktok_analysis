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

/* JADX INFO: renamed from: X.01Dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC299101Dx {
    void LIZ(SeiAppData seiAppData);

    void LIZIZ(List<CountdownContent> list);

    void LIZJ(List<Long> list);

    void LIZLLL(String str);

    void LJFF(String str);

    void LJI(C01ED c01ed);

    void LJII(GetUserPlaySettingsParams getUserPlaySettingsParams, Function1<? super CountdownConfig, Unit> function1);

    String LJIIIIZZ(long j, long j2);

    void LJIIIZ(C01E5 c01e5);

    void LJIIJ(C01E9 c01e9);

    void LJIIJJI(C01E5 c01e5);

    void LJIIL(C01E5 c01e5);

    void destroy();

    void endOneCountdownPlay(CountdownEndParams countdownEndParams);

    void startOneCountdownPlay(CountdownStartParams countdownStartParams);
}
