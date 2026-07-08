package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.anchor_data.RealtimeLiveCenterDetailData;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;

/* JADX INFO: renamed from: X.1AHD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1AHD {
    void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);

    RealtimeLiveCenterLayoutTab LIZIZ(String str);

    void LIZJ(C2176721AGw c2176721AGw);

    void LIZLLL(InterfaceC1541990qEH interfaceC1541990qEH, InterfaceC1541990qEH interfaceC1541990qEH2);

    void LJ(Function1<? super Boolean, Unit> function1);

    AbstractC20368114mt LJFF();

    boolean LJI();

    boolean LJII();

    Drawable LJIIIIZZ();

    long LJIIIZ();

    void LJIIJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);

    RealtimeLiveCenterDetailData LJIIJJI();

    void LJIIL();

    RealtimeLiveCenterLayoutTab LJIILIIL(int i);

    void LJIILJJIL(InterfaceC1541990qEH interfaceC1541990qEH);

    Context getContext();

    DataChannel getDataChannel();

    String getDataSource();
}
