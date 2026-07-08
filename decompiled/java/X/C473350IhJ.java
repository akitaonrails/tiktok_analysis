package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveTabsSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.LiveTab;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyData;
import webcast.data.NearbyTabConfig;
import webcast.data.Region;

/* JADX INFO: renamed from: X.0IhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473350IhJ {
    public static final String LIZ;
    public static final LiveTab LIZIZ;
    public static final MutableLiveData<LiveTab> LIZJ;
    public static boolean LIZLLL;

    static {
        TopLiveTabsSetting.TopLiveTab next;
        String str;
        String str2 = "Nearby";
        LIZ = "Nearby";
        LiveTab liveTab = new LiveTab();
        Iterator<TopLiveTabsSetting.TopLiveTab> it2 = TopLiveTabsSetting.getTopLiveTabs().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!Intrinsics.LJFF(next.id, "nearby"));
        TopLiveTabsSetting.TopLiveTab topLiveTab = next;
        if (topLiveTab == null || (str = topLiveTab.title) == null) {
            str = "ttlive_topLive_nearbyTab_tabDefault";
        }
        liveTab.type = 3;
        if (str.length() != 0) {
            Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
            Integer numValueOf = Integer.valueOf(C786410Ut5.n3(context.getResources(), str, "string", context.getPackageName()));
            if (numValueOf.intValue() > 0) {
                String string = context.getResources().getString(numValueOf.intValue());
                if (string != null) {
                    str2 = string;
                }
            }
        }
        LIZ = str2;
        liveTab.name = str2;
        liveTab.content = "";
        LIZIZ = liveTab;
        MutableLiveData<LiveTab> mutableLiveData = new MutableLiveData<>(liveTab);
        LIZJ = mutableLiveData;
        if (Intrinsics.LJFF(mutableLiveData.getValue(), liveTab)) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (LiveNearbyTabSetting.INSTANCE.enable() && iHostAppContext.isLocationPermissionGranted(iHostAppContext.context())) {
                C469620IbI c469620IbI = C469620IbI.LIZ;
                C469620IbI.LIZIZ(22, new InterfaceC469640IbK() { // from class: X.0IhD
                    @Override // X.InterfaceC469640IbK
                    public final void LIZ(StrategyData strategyData) {
                        String str3;
                        boolean z;
                        ShowMode showMode;
                        NearbyTabConfig nearbyTabConfig;
                        Region region;
                        ShowMode showMode2;
                        NearbyTabConfig nearbyTabConfig2;
                        Region region2;
                        String str4 = null;
                        if (strategyData != null && (showMode2 = strategyData.showMode) != null && (nearbyTabConfig2 = showMode2.nearbyTabConfig) != null && (region2 = nearbyTabConfig2.currentRegion) != null) {
                            str3 = region2.name;
                        } else {
                            str3 = null;
                        }
                        if (C123100dR.LIZ(str3)) {
                            MutableLiveData<LiveTab> mutableLiveData2 = C473350IhJ.LIZJ;
                            LiveTab value = mutableLiveData2.getValue();
                            if (value != null) {
                                str4 = value.name;
                            }
                            if (!Intrinsics.LJFF(str3, str4)) {
                                C469620IbI c469620IbI2 = C469620IbI.LIZ;
                                C469620IbI.LJIIL(22, strategyData);
                                LiveTab liveTab2 = new LiveTab();
                                liveTab2.type = 3;
                                if (str3 != null && str3.length() <= 13) {
                                    liveTab2.name = str3;
                                } else {
                                    String str5 = C473350IhJ.LIZ;
                                    liveTab2.name = C473350IhJ.LIZ;
                                }
                                mutableLiveData2.postValue(liveTab2);
                            }
                        }
                        String str6 = C473350IhJ.LIZ;
                        if (strategyData != null && (showMode = strategyData.showMode) != null && (nearbyTabConfig = showMode.nearbyTabConfig) != null && (region = nearbyTabConfig.currentRegion) != null && region.locationMethod == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C473350IhJ.LIZLLL = z;
                    }
                }, true, false, true);
            }
        }
    }
}
