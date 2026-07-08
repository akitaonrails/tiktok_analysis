package com.bytedance.android.live.walletnew.ui;

import X.C1150130g2F;
import X.C1388190mED;
import X.C1697810uHb;
import X.C19EG;
import X.InterfaceC21691419uq;
import X.InterfaceC21691519ur;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.android.live.wallet.model.LocationObject;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public class LocationService implements ILocationPickerService {
    public static final /* synthetic */ int LL = 0;

    public final void LIZ(Context context, String str, InterfaceC21691419uq interfaceC21691419uq, C1150130g2F c1150130g2F) {
        wA(context, "CA", str, 1, interfaceC21691419uq, c1150130g2F);
    }

    public final void LIZIZ(Context context, String str, InterfaceC21691419uq interfaceC21691419uq, C1150130g2F c1150130g2F) {
        wA(context, "US", str, 3, interfaceC21691419uq, c1150130g2F);
    }

    @Override // com.bytedance.android.live.wallet.api.ILocationPickerService
    public final void sH0(Context context, String str, String str2, InterfaceC21691419uq interfaceC21691419uq, C1150130g2F c1150130g2F) {
        if (Intrinsics.LJFF(str, "United States")) {
            LIZIZ(context, str2, interfaceC21691419uq, c1150130g2F);
        } else {
            if (!Intrinsics.LJFF(str, "Canada")) {
                return;
            }
            LIZ(context, str2, interfaceC21691419uq, c1150130g2F);
        }
    }

    @Override // com.bytedance.android.live.wallet.api.ILocationPickerService
    public final void wA(Context context, String str, String str2, int i, InterfaceC21691419uq interfaceC21691419uq, InterfaceC21691519ur interfaceC21691519ur) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        List<String> listLJIIJJI;
        FragmentManager supportFragmentManager2;
        List<String> list = null;
        if (context != null) {
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            if ((c19egLIZIZ2 == null || (supportFragmentManager2 = c19egLIZIZ2.getSupportFragmentManager()) == null || (supportFragmentManager2.LJJJJZI("LocationPicker") == null && context != null)) && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                LocationList locationList = new LocationList();
                locationList.LL = context;
                locationList.LLILLL = str;
                if (str2 == null) {
                    str2 = "";
                }
                locationList.LLJILJILJ = str2;
                locationList.LLIZLLLIL = i;
                locationList.LLILZ = interfaceC21691419uq;
                locationList.LLILZIL = interfaceC21691519ur;
                if (str == null) {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "CA")) {
                    listLJIIJJI = C1697810uHb.LJIIJJI("region", "province");
                } else {
                    listLJIIJJI = C1697810uHb.LJIIJJI("region", "state", "county", "city");
                }
                locationList.LLJJ = listLJIIJJI;
                if (listLJIIJJI != null) {
                    list = listLJIIJJI;
                }
                if (list.size() != locationList.LLIZLLLIL + 1) {
                    locationList.LLJI = 2;
                    locationList.LLJJIII = "Location Key Size not Match, Please set the location key in LocationService.kt";
                    locationList.dismiss();
                }
                int i2 = locationList.LLIZLLLIL + 1;
                LocationObject[] locationObjectArr = new LocationObject[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    locationObjectArr[i3] = new LocationObject();
                }
                locationList.LLJJI = locationObjectArr;
                locationList.show(supportFragmentManager, "LocationPicker");
            }
        }
    }
}
