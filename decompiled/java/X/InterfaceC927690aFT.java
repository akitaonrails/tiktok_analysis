package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS629S0100000_15;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.0aFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC927690aFT {
    void LIZ(SeiAppData seiAppData);

    void LIZIZ(Long l, Function2<? super String, ? super LiveEffect, Unit> function2);

    boolean LIZJ();

    long LIZLLL(Long l);

    void LJ(CountdownForAllContent countdownForAllContent);

    boolean LJFF();

    void LJI(CountdownForAllConfig countdownForAllConfig, C334801Rq c334801Rq, AwS629S0100000_15 awS629S0100000_15);

    CountdownForAllConfig getConfig();

    String getEffectId();

    Long getPlayId();
}
