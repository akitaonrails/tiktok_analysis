package com.bytedance.android.live.walletnew.ui;

import X.C1602160rnK;
import X.C1697810uHb;
import X.C16FS;
import X.C1888870zFl;
import X.C19263510Xx;
import X.C20441214yg;
import X.C21630419l0;
import X.C21691019um;
import X.C21691219uo;
import X.C2188811AlT;
import X.C23250099c;
import X.C497740JfY;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C817503Hh;
import X.C836730Ws3;
import X.InterfaceC1888890zFn;
import X.InterfaceC21630919l5;
import X.InterfaceC21691419uq;
import X.InterfaceC21691519ur;
import X.InterfaceC596190NZx;
import Y.ACListenerS167S0100000_33;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.wallet.model.LocationAddress;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.live.walletnew.ui.LocationList;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.wallet.LocationHostSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LocationKeySetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LocationList extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiHELIOSPi4/JCA4JyokZjAlZwM8KyQ4ICA9BCw/PQ==";
    public Context LL;
    public View LLILLJJLI;
    public String LLILLL;
    public InterfaceC21691419uq LLILZ;
    public InterfaceC21691519ur LLILZIL;
    public RecyclerView LLILZLL;
    public List<LocationObject> LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJIJIL;
    public C16FS LLJILJIL;
    public LocationObject LLJILLL;
    public List<String> LLJJ;
    public LocationObject[] LLJJI;
    public int LLJI = 1;
    public String LLJILJILJ = "";
    public String LLJJIII = "Invalid Status";
    public final C21691019um LLJJIJI = new InterfaceC1888890zFn() { // from class: X.19um
        @Override // X.InterfaceC1888890zFn
        public final void LIZ(LocationObject locationObject) {
            LocationList locationList = this.LIZ;
            LocationObject[] locationObjectArr = locationList.LLJJI;
            C16FS c16fs = null;
            if (locationObjectArr == null) {
                locationObjectArr = null;
            }
            locationObjectArr[locationList.LLIZLLLIL] = locationObject;
            C16FS c16fs2 = locationList.LLJILJIL;
            if (c16fs2 == null) {
                c16fs2 = null;
            }
            if (!c16fs2.isEnabled()) {
                C16FS c16fs3 = this.LIZ.LLJILJIL;
                if (c16fs3 != null) {
                    c16fs = c16fs3;
                }
                c16fs.setEnabled(true);
            }
        }

        @Override // X.InterfaceC1888890zFn
        public final void LIZIZ(int i, LocationObject locationObject) {
            LocationList locationList = this.LIZ;
            LocationObject[] locationObjectArr = locationList.LLJJI;
            if (locationObjectArr == null) {
                locationObjectArr = null;
            }
            locationObjectArr[i] = locationObject;
            locationList.NR(i, 1);
        }
    };
    public final C21691219uo LLJJIJIIJIL = new InterfaceC596190NZx() { // from class: X.19uo
        @Override // X.InterfaceC596190NZx
        public final void LIZ(String str) {
            JSONObject jSONObject = new JSONObject(str);
            InterfaceC21691419uq interfaceC21691419uq = null;
            View view = null;
            if (!jSONObject.has(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) || (jSONObject.has(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) && Intrinsics.LJFF(jSONObject.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), CardStruct.IStatusCode.DEFAULT))) {
                if (this.LIZ.LLJI != 2) {
                    C20441214yg.LIZIZ("USLocationDialog", C786410Ut5.J3(jSONObject));
                    LocationList locationList = this.LIZ;
                    locationList.LLJI = 2;
                    locationList.OR(null, "US");
                    return;
                }
                C20441214yg.LIZIZ("USLocationDialog", C786410Ut5.J3(jSONObject));
                InterfaceC21691419uq interfaceC21691419uq2 = this.LIZ.LLILZ;
                if (interfaceC21691419uq2 != null) {
                    interfaceC21691419uq = interfaceC21691419uq2;
                }
                interfaceC21691419uq.LJIIJ("Location API Incorrect Status");
                return;
            }
            LocationList locationList2 = this.LIZ;
            locationList2.LLJI = 1;
            LocationObject locationObject = locationList2.LLJILLL;
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "district");
            if (locationObject == null) {
                locationObject = new LocationObject(null, JSONObjectProtectorUtils.getString(jSONObject2, "name"), JSONObjectProtectorUtils.getString(jSONObject2, "code"), JSONObjectProtectorUtils.getString(jSONObject2, "asci_name"), JSONObjectProtectorUtils.getInt(jSONObject2, "geoname_id"), JSONObjectProtectorUtils.getString(jSONObject2, "description"));
            }
            C21691319up.LIZ(locationObject, JSONObjectProtectorUtils.getJSONArray(jSONObject2, "sub_region"));
            locationList2.LLJILLL = locationObject;
            LocationList locationList3 = this.LIZ;
            LocationObject[] locationObjectArr = locationList3.LLJJI;
            if (locationObjectArr == null) {
                locationObjectArr = null;
            }
            locationObjectArr[locationList3.LLJ] = locationList3.LLJILLL;
            View view2 = locationList3.LLILLJJLI;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2.findViewById(R.id.nog));
            View view3 = locationList3.LLILLJJLI;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.nof));
            LocationList locationList4 = this.LIZ;
            locationList4.NR(locationList4.LLJ, 1);
        }

        @Override // X.InterfaceC596190NZx
        public final void LIZIZ(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fetch Failure ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("USLocationDialog", C2188811AlT.LIZIZ(sbLIZ));
            LocationList locationList = this.LIZ;
            locationList.LLJJIII = str;
            locationList.LLJI = 2;
            locationList.dismiss();
        }
    };

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void LJ() {
        View view = this.LLILLJJLI;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.nof));
        View view2 = this.LLILLJJLI;
        C786410Ut5.LJLLLLLL(0, (view2 != null ? view2 : null).findViewById(R.id.nog));
    }

    public final String MR() {
        LocationObject[] locationObjectArr = this.LLJJI;
        if (locationObjectArr == null) {
            locationObjectArr = null;
        }
        int i = new IntRange(0, locationObjectArr.length - 1).LLILLJJLI;
        int i2 = 1;
        String strLIZIZ = "";
        if (1 <= i) {
            while (true) {
                LocationObject[] locationObjectArr2 = this.LLJJI;
                if (locationObjectArr2 == null) {
                    locationObjectArr2 = null;
                }
                if (locationObjectArr2[i2] == null) {
                    break;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                LocationObject[] locationObjectArr3 = this.LLJJI;
                if (locationObjectArr3 == null) {
                    locationObjectArr3 = null;
                }
                LocationObject locationObject = locationObjectArr3[i2];
                sbLIZ.append(locationObject != null ? locationObject.LIZ() : null);
                sbLIZ.append(", ");
                sbLIZ.append(strLIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        LocationObject[] locationObjectArr4 = this.LLJJI;
        if (locationObjectArr4 == null) {
            locationObjectArr4 = null;
        }
        LocationObject locationObject2 = locationObjectArr4[0];
        sbLIZ2.append(locationObject2 != null ? locationObject2.name : null);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gyi);
        c500980Jkm.LIZLLL = true;
        c500980Jkm.LJII = 80;
        if (getActivity() != null) {
            c500980Jkm.LJIIIZ = -1;
            c500980Jkm.LJIIJ = (int) C497740JfY.LIZIZ(694.0f);
        }
        return c500980Jkm;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.19un
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4 && keyEvent.getAction() == 0) {
                        LocationList locationList = this.LL;
                        int i2 = locationList.LLIZLLLIL;
                        int i3 = locationList.LLJ;
                        if (2 <= i3 && i3 <= i2) {
                            locationList.NR(i3, -1);
                            return true;
                        }
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        LocationObject[] locationObjectArr;
        super.onDismiss(dialogInterface);
        InterfaceC21691419uq interfaceC21691419uq = null;
        if (this.LLJI != 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            if (this.LLJI == 0) {
                LocationObject[] locationObjectArr2 = this.LLJJI;
                if (locationObjectArr2 == null) {
                    locationObjectArr2 = null;
                }
                int length = locationObjectArr2.length;
                List<String> list = this.LLJJ;
                if (list == null) {
                    list = null;
                }
                if (length != list.size()) {
                    this.LLJI = 1;
                } else {
                    LocationObject[] locationObjectArr3 = this.LLJJI;
                    if (locationObjectArr3 == null) {
                        locationObjectArr3 = null;
                    }
                    int length2 = locationObjectArr3.length;
                    int i = 0;
                    while (true) {
                        if (i >= length2) {
                            break;
                        }
                        LocationObject[] locationObjectArr4 = this.LLJJI;
                        if (locationObjectArr4 == null) {
                            locationObjectArr = null;
                        } else {
                            locationObjectArr = locationObjectArr4;
                        }
                        if (locationObjectArr[i] == null) {
                            this.LLJI = 1;
                            break;
                        }
                        if (locationObjectArr4 == null) {
                            locationObjectArr4 = null;
                        }
                        LocationObject locationObject = locationObjectArr4[i];
                        if (locationObject != null) {
                            List<String> list2 = this.LLJJ;
                            if (list2 == null) {
                                list2 = null;
                            }
                            linkedHashMap.put(ListProtector.get(list2, i), locationObject);
                        }
                        i++;
                    }
                }
            }
            InterfaceC21691419uq interfaceC21691419uq2 = this.LLILZ;
            if (interfaceC21691419uq2 != null) {
                interfaceC21691419uq = interfaceC21691419uq2;
            }
            if (this.LLJI == 0) {
                z = true;
            }
            interfaceC21691419uq.LIZ(z, new LocationAddress(linkedHashMap));
            return;
        }
        InterfaceC21691419uq interfaceC21691419uq3 = this.LLILZ;
        if (interfaceC21691419uq3 != null) {
            interfaceC21691419uq = interfaceC21691419uq3;
        }
        interfaceC21691419uq.LJIIJ(this.LLJJIII);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void NR(int i, int i2) {
        LocationObject locationObject;
        List<LocationObject> list;
        boolean z;
        int iIntValue;
        Integer numValueOf;
        InterfaceC21691519ur interfaceC21691519ur;
        int i3 = i + i2;
        if (i3 >= 1 && i3 <= this.LLIZLLLIL) {
            int i4 = i3 - 1;
            LocationObject[] locationObjectArr = this.LLJJI;
            List<String> list2 = null;
            if (locationObjectArr == null) {
                locationObjectArr = null;
            }
            int length = locationObjectArr.length;
            for (int i5 = i4 + 1; i5 < length; i5++) {
                LocationObject[] locationObjectArr2 = this.LLJJI;
                if (locationObjectArr2 == null) {
                    locationObjectArr2 = null;
                }
                locationObjectArr2[i5] = null;
            }
            if (i2 == -1) {
                LocationObject locationObject2 = this.LLJILLL;
                if (locationObject2 != null) {
                    locationObject = locationObject2.LIZ;
                } else {
                    locationObject = null;
                }
            } else {
                LocationObject[] locationObjectArr3 = this.LLJJI;
                if (locationObjectArr3 == null) {
                    locationObjectArr3 = null;
                }
                locationObject = locationObjectArr3[i4];
            }
            this.LLJILLL = locationObject;
            if (locationObject != null && locationObject.subRegion != null && (interfaceC21691519ur = this.LLILZIL) != null) {
                List<String> list3 = this.LLJJ;
                if (list3 == null) {
                    list3 = null;
                }
                interfaceC21691519ur.LJJJJI((String) ListProtector.get(list3, i3));
            }
            LocationObject[] locationObjectArr4 = this.LLJJI;
            if (locationObjectArr4 == null) {
                locationObjectArr4 = null;
            }
            if (locationObjectArr4[i4] != null) {
                LocationObject locationObject3 = this.LLJILLL;
                if (locationObject3 != null) {
                    list = locationObject3.subRegion;
                } else {
                    list = null;
                }
                this.LLIZ = list;
                if (list == null) {
                    if (locationObject3 != null) {
                        numValueOf = Integer.valueOf(locationObject3.geonameId);
                    } else {
                        numValueOf = null;
                    }
                    OR(numValueOf, null);
                    return;
                }
                if (list.size() > 30) {
                    z = true;
                } else {
                    z = false;
                }
                View view = this.LLILLJJLI;
                if (view == null) {
                    view = null;
                }
                TextView textView = (TextView) view.findViewById(R.id.nos);
                C21630419l0 c21630419l0 = (C21630419l0) view.findViewById(R.id.non);
                View view2 = this.LLILLJJLI;
                if (view2 == null) {
                    view2 = null;
                }
                LiveIconView liveIconView = (LiveIconView) view2.findViewById(R.id.noe);
                View view3 = this.LLILLJJLI;
                if (view3 == null) {
                    view3 = null;
                }
                TuxIconView tuxIconView = (TuxIconView) view3.findViewById(R.id.no7);
                if (this.LLJILJIL == null) {
                    View view4 = this.LLILLJJLI;
                    if (view4 == null) {
                        view4 = null;
                    }
                    this.LLJILJIL = (C16FS) view4.findViewById(R.id.no8);
                }
                String str = this.LLILLL;
                if (str == null) {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "CA")) {
                    iIntValue = ((Number) ListProtector.get(Collections.singletonList(2131844047), i4)).intValue();
                } else {
                    iIntValue = ((Number) ListProtector.get(C1697810uHb.LJIIJJI(2131844049, 2131844043, 2131844042), i4)).intValue();
                }
                textView.setText(C497740JfY.LJIJI(iIntValue));
                if (i3 == 1) {
                    C786410Ut5.LLJJIJIL(liveIconView, 8);
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                } else {
                    C786410Ut5.LLJJIJIL(liveIconView, 0);
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                }
                if (i3 == this.LLIZLLLIL) {
                    C16FS c16fs = this.LLJILJIL;
                    if (c16fs == null) {
                        c16fs = null;
                    }
                    C786410Ut5.LLJJJ(c16fs, 0);
                    C16FS c16fs2 = this.LLJILJIL;
                    if (c16fs2 == null) {
                        c16fs2 = null;
                    }
                    c16fs2.j0(R.style.a7b);
                    C16FS c16fs3 = this.LLJILJIL;
                    if (c16fs3 == null) {
                        c16fs3 = null;
                    }
                    c16fs3.setEnabled(false);
                } else {
                    C16FS c16fs4 = this.LLJILJIL;
                    if (c16fs4 == null) {
                        c16fs4 = null;
                    }
                    C786410Ut5.LLJJJ(c16fs4, 8);
                }
                if (z) {
                    int visibility = c21630419l0.getVisibility();
                    c21630419l0.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c21630419l0);
                } else {
                    int visibility2 = c21630419l0.getVisibility();
                    c21630419l0.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility2, 8, c21630419l0);
                }
                if (this.LLJIJIL == 1) {
                    c21630419l0.setSideBarPosition(1);
                }
                if (this.LLILZLL == null) {
                    View view5 = this.LLILLJJLI;
                    if (view5 == null) {
                        view5 = null;
                    }
                    RecyclerView recyclerView = (RecyclerView) view5.findViewById(R.id.nof);
                    this.LLILZLL = recyclerView;
                    if (recyclerView != null) {
                        Context context = this.LL;
                        if (context == null) {
                            context = null;
                        }
                        recyclerView.setLayoutManager(new LinearLayoutManager(context));
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("defaultLocation: ");
                sbLIZ.append(this.LLJILJILJ);
                C20441214yg.LIZIZ("USLocation", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("defaultLocationKey ");
                List<String> list4 = this.LLJJ;
                if (list4 != null) {
                    list2 = list4;
                }
                sbLIZ2.append((String) ListProtector.get(list2, this.LLIZLLLIL));
                C20441214yg.LIZIZ("USLocation", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Current Location ");
                sbLIZ3.append(MR());
                C20441214yg.LIZIZ("USLocation", C2188811AlT.LIZIZ(sbLIZ3));
                C1888870zFl c1888870zFl = new C1888870zFl(i3, this.LLIZLLLIL, list, this.LLJILJILJ, MR(), z);
                c1888870zFl.LLJ = this.LLJJIJI;
                RecyclerView recyclerView2 = this.LLILZLL;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(c1888870zFl);
                }
                this.LLJ = i3;
            }
        }
    }

    public final void OR(Integer num, String str) {
        URL url;
        String value = LocationHostSetting.INSTANCE.getValue();
        if (Intrinsics.LJFF(value, "")) {
            url = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(value);
            sbLIZ.append("/administrative/district?key=");
            sbLIZ.append(LocationKeySetting.INSTANCE.getValue());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (num != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("&geonameid=");
                sbLIZ2.append(num);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (str != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("&code=");
                sbLIZ3.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            url = new URL(strLIZIZ);
        }
        LJ();
        if (url != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C836730Ws3(url, this.LLJJIJIIJIL, null), 3);
        } else {
            this.LLJJIII = "Location URL Fetch Failure";
            this.LLJI = 2;
            dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = view;
        if (Intrinsics.LJFF(C19263510Xx.LIZIZ(), "ar")) {
            this.LLJIJIL = 1;
        }
        String str2 = this.LLILLL;
        C16FS c16fs = null;
        if (str2 == null) {
            str = null;
        } else {
            str = str2;
        }
        if (str2 == null) {
            str2 = null;
        }
        if (u.LJIJI(str2, "CA", false)) {
            num = 6251999;
        } else {
            num = null;
        }
        OR(num, str);
        LJ();
        View view2 = this.LLILLJJLI;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJILJIL = (C16FS) view2.findViewById(R.id.no8);
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            view3 = null;
        }
        LiveIconView liveIconView = (LiveIconView) view3.findViewById(R.id.noe);
        View view4 = this.LLILLJJLI;
        if (view4 == null) {
            view4 = null;
        }
        TuxIconView tuxIconView = (TuxIconView) view4.findViewById(R.id.no7);
        View view5 = this.LLILLJJLI;
        if (view5 == null) {
            view5 = null;
        }
        C21630419l0 c21630419l0 = (C21630419l0) view5.findViewById(R.id.non);
        C16FS c16fs2 = this.LLJILJIL;
        if (c16fs2 != null) {
            c16fs = c16fs2;
        }
        C786410Ut5.h8(c16fs, new ACListenerS167S0100000_33(this, 70));
        C786410Ut5.a9(tuxIconView, new ACListenerS167S0100000_33(this, 71));
        C786410Ut5.g8(liveIconView, new ACListenerS167S0100000_33(this, 72));
        c21630419l0.setOnSelectIndexItemListener(new InterfaceC21630919l5() { // from class: X.19uS
            @Override // X.InterfaceC21630919l5
            public final void LIZ(String str3) {
                String strLIZIZ;
                RecyclerView recyclerView;
                RecyclerView.LayoutManager layoutManager;
                LocationObject locationObject;
                List<LocationObject> list = this.LIZ.LLIZ;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        List<LocationObject> list2 = this.LIZ.LLIZ;
                        if (list2 != null && (locationObject = (LocationObject) ListProtector.get(list2, i)) != null) {
                            strLIZIZ = locationObject.LIZIZ();
                        } else {
                            strLIZIZ = null;
                        }
                        if (TextUtils.equals(strLIZIZ, str3) && (recyclerView = this.LIZ.LLILZLL) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                            layoutManager.scrollToPosition(i);
                        }
                    }
                }
            }
        });
    }
}
