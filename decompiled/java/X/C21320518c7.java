package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.forest.Forest;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tiktok.myna.render.render.MynaElement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS17S0111000_26;
import kotlin.jvm.internal.AwS669S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18c7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21320518c7 {
    public static final C21320518c7 LIZ = new C21320518c7();
    public static final C1300780jxE LIZIZ = new C1300780jxE();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final synchronized void LIZ() {
        AtomicBoolean atomicBoolean = LIZJ;
        if (!atomicBoolean.get()) {
            C1168270gVV.LIZ.LJIIJJI(new InterfaceC1168310gVZ() { // from class: X.0kvj
                @Override // X.InterfaceC1168310gVZ
                public final Map<String, Object> LIZLLL() {
                    return null;
                }

                @Override // X.InterfaceC1168310gVZ
                public final InterfaceC1321540kUi LJFF() {
                    return null;
                }

                @Override // X.InterfaceC1168310gVZ
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1168310gVZ
                public final void LJIIJJI() {
                }

                @Override // X.InterfaceC1168310gVZ
                public final void LJIIL() {
                }

                @Override // X.InterfaceC1168310gVZ
                public final JSONObject LIZIZ() {
                    boolean zLJ;
                    boolean zLJFF;
                    C1338320kvm.LIZ.getClass();
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    n nVar = C1338320kvm.LIZIZ;
                    n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("ec_gec_card_config", n.class, nVar);
                    if (nVar2 != null) {
                        nVar = nVar2;
                    }
                    n nVar3 = new n();
                    Iterator<T> it2 = nVar.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        nVar3.LJJIFFI((String) entry.getKey(), ((k) entry.getValue()).LIZJ());
                    }
                    Boolean boolLIZ = C2399609ak.LIZ(nVar, "gec_card_element_view_reuse_enable");
                    boolean z = false;
                    nVar3.LJJII(Boolean.valueOf(boolLIZ != null ? boolLIZ.booleanValue() : false), "element_view_reuse_enable");
                    Boolean boolLIZ2 = C2399609ak.LIZ(nVar, "gec_card_element_view_reuse_only_cache_image_enable");
                    nVar3.LJJII(Boolean.valueOf(boolLIZ2 != null ? boolLIZ2.booleanValue() : false), "element_view_reuse_only_cache_image_enable");
                    Boolean boolLIZ3 = C2399609ak.LIZ(nVar, "gec_card_inline_image_reuse_enable");
                    nVar3.LJJII(Boolean.valueOf(boolLIZ3 != null ? boolLIZ3.booleanValue() : false), "inline_image_reuse_enable");
                    Integer numLIZIZ = C2399609ak.LIZIZ(nVar, "gec_card_reuse_pool_max_count");
                    nVar3.LJJIII(Integer.valueOf(numLIZIZ != null ? numLIZIZ.intValue() : 50), "reuse_pool_max_count");
                    Boolean boolLIZ4 = C2399609ak.LIZ(nVar, "gec_card_enable_leaf_flatten");
                    if (boolLIZ4 != null) {
                        zLJ = boolLIZ4.booleanValue();
                    } else {
                        C1168270gVV.LIZ.getClass();
                        zLJ = C1168270gVV.LJ();
                    }
                    if (zLJ) {
                        Boolean boolLIZ5 = C2399609ak.LIZ(nVar, "gec_card_enable_level_flatten");
                        if (boolLIZ5 != null) {
                            zLJFF = boolLIZ5.booleanValue();
                        } else {
                            C1168270gVV.LIZ.getClass();
                            zLJFF = C1168270gVV.LJFF();
                        }
                        if (zLJFF) {
                            z = true;
                        }
                    }
                    nVar3.LJJII(Boolean.valueOf(zLJ), "enable_leaf_flatten");
                    nVar3.LJJII(Boolean.valueOf(z), "enable_level_flatten");
                    if (!nVar3.LJJIJIIJIL("enable_exposure_tracking")) {
                        nVar3.LJJII(Boolean.FALSE, "enable_exposure_tracking");
                    }
                    return new JSONObject(nVar3.toString());
                }

                @Override // X.InterfaceC1168310gVZ
                public final InterfaceC1321110kU1 LIZJ() {
                    return new C1326010kbv("mall");
                }

                @Override // X.InterfaceC1168310gVZ
                public final Object LJII() {
                    if (Intrinsics.LJFF("tt_shop_mall", "tt_shop_mall")) {
                        return "tt_shop_mall";
                    }
                    return null;
                }

                @Override // X.InterfaceC1168310gVZ
                public final C1168340gVc LJIIJ() {
                    C1168340gVc c1168340gVc = C1168340gVc.LIZJ;
                    return C1168330gVb.LIZ(750.0f, 1.0f, 1.0f);
                }

                @Override // X.InterfaceC1168310gVZ
                public final boolean LJIIIIZZ() {
                    IECommerceHostService iECommerceHostService;
                    IECommerceHostService iECommerceHostService2;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    if (((IApplicationDependencyService) iECommerceHostService).isOffline()) {
                        return true;
                    }
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    return ((IApplicationDependencyService) iECommerceHostService2).isRegressionTest();
                }

                @Override // X.InterfaceC1168310gVZ
                public final String LJ(String str) {
                    C1957107lZ.LIZ.getClass();
                    return C1957107lZ.LIZ(str);
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.InterfaceC1168310gVZ
                public final AbstractC21333318eB LIZ(final C21325918cz c21325918cz, String str) {
                    switch (str.hashCode()) {
                        case -1561806008:
                            if (!str.equals("mmk-s-live")) {
                                return null;
                            }
                            return new AbstractC21333318eB<C1775590wJ3>(c21325918cz) { // from class: X.18fS
                                @Override // X.AbstractC21333318eB
                                public final View LJJJLZIJ(Context context) {
                                    C599820Nfo.LIZ.getClass();
                                    C599820Nfo.LIZLLL();
                                    return new C1775590wJ3(context, null);
                                }

                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                @Override // X.AbstractC21333318eB
                                public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
                                    if (map.isEmpty()) {
                                        return;
                                    }
                                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                                        String key = entry.getKey();
                                        String str2 = null;
                                        String str3 = null;
                                        Boolean bool = null;
                                        String str4 = null;
                                        String str5 = null;
                                        String str6 = null;
                                        Boolean bool2 = null;
                                        String str7 = null;
                                        String str8 = null;
                                        String str9 = null;
                                        String str10 = null;
                                        String str11 = null;
                                        switch (key.hashCode()) {
                                            case -1489589134:
                                                if (key.equals("objectfit")) {
                                                    C1775590wJ3 view = getView();
                                                    Object value = entry.getValue();
                                                    if (value instanceof String) {
                                                        str2 = (String) value;
                                                    }
                                                    view.setObjectfit(str2);
                                                }
                                                break;
                                            case -1247523363:
                                                if (key.equals("qualities")) {
                                                    C1775590wJ3 view2 = getView();
                                                    Object value2 = entry.getValue();
                                                    if (value2 instanceof String) {
                                                        str11 = (String) value2;
                                                    }
                                                    view2.setQualities(str11);
                                                }
                                                break;
                                            case -1194425296:
                                                if (key.equals("stream_url")) {
                                                    C1775590wJ3 view3 = getView();
                                                    Object value3 = entry.getValue();
                                                    if (value3 instanceof String) {
                                                        str10 = (String) value3;
                                                    }
                                                    view3.setStreamURL(str10);
                                                }
                                                break;
                                            case -1095685225:
                                                if (key.equals("optimizetype")) {
                                                    C1775590wJ3 view4 = getView();
                                                    Object value4 = entry.getValue();
                                                    if (value4 instanceof String) {
                                                        str9 = (String) value4;
                                                    }
                                                    view4.setOptimizeType(str9);
                                                }
                                                break;
                                            case -982450867:
                                                if (key.equals("poster")) {
                                                    C1775590wJ3 view5 = getView();
                                                    Object value5 = entry.getValue();
                                                    if (value5 instanceof String) {
                                                        str8 = (String) value5;
                                                    }
                                                    view5.setPoster(str8);
                                                    getView().LJIILIIL(false);
                                                }
                                                break;
                                            case -685906904:
                                                if (key.equals("enter_method")) {
                                                    C1775590wJ3 view6 = getView();
                                                    Object value6 = entry.getValue();
                                                    if (value6 instanceof String) {
                                                        str7 = (String) value6;
                                                    }
                                                    view6.setEnterMethod(str7);
                                                }
                                                break;
                                            case 3363353:
                                                if (key.equals("mute")) {
                                                    C1775590wJ3 view7 = getView();
                                                    Object value7 = entry.getValue();
                                                    if (value7 instanceof Boolean) {
                                                        bool2 = (Boolean) value7;
                                                    }
                                                    view7.setMute(bool2);
                                                }
                                                break;
                                            case 3601339:
                                                if (key.equals("uuid")) {
                                                    C1775590wJ3 view8 = getView();
                                                    Object value8 = entry.getValue();
                                                    if (value8 instanceof String) {
                                                        str6 = (String) value8;
                                                    }
                                                    view8.setUuId(str6);
                                                }
                                                break;
                                            case 1337020202:
                                                if (key.equals("enter_from_merge")) {
                                                    C1775590wJ3 view9 = getView();
                                                    Object value9 = entry.getValue();
                                                    if (value9 instanceof String) {
                                                        str5 = (String) value9;
                                                    }
                                                    view9.setEnterFromMerge(str5);
                                                }
                                                break;
                                            case 1379892991:
                                                if (key.equals("room_id")) {
                                                    C1775590wJ3 view10 = getView();
                                                    Object value10 = entry.getValue();
                                                    if (value10 instanceof String) {
                                                        str4 = (String) value10;
                                                    }
                                                    view10.setRoomId(str4);
                                                }
                                                break;
                                            case 1439562083:
                                                if (key.equals("autoplay")) {
                                                    C1775590wJ3 view11 = getView();
                                                    Object value11 = entry.getValue();
                                                    if (value11 instanceof Boolean) {
                                                        bool = (Boolean) value11;
                                                    }
                                                    view11.setAutoPlay(bool);
                                                }
                                                break;
                                            case 1583758243:
                                                if (key.equals("action_type")) {
                                                    C1775590wJ3 view12 = getView();
                                                    Object value12 = entry.getValue();
                                                    if (value12 instanceof String) {
                                                        str3 = (String) value12;
                                                    }
                                                    view12.setActionType(str3);
                                                }
                                                break;
                                        }
                                    }
                                }
                            };
                        case -1162127969:
                            if (!str.equals("mmk-s-video")) {
                                return null;
                            }
                            return new AbstractC21332518e3<C1775290wIZ>(c21325918cz) { // from class: X.18fH
                                @Override // X.AbstractC21332518e3, X.AbstractC21333318eB
                                public final void LJJJJZI(Map<String, ? extends Object> map) {
                                    super.LJJJJZI(map);
                                }

                                @Override // X.AbstractC21332518e3, X.AbstractC21333318eB
                                public final void LJJJLL(MynaElement mynaElement) {
                                    super.LJJJLL(mynaElement);
                                }

                                @Override // X.AbstractC21333318eB
                                public final View LJJJLZIJ(Context context) {
                                    String strLJIIJ;
                                    Object objLJII;
                                    C1775290wIZ c1775290wIZ = new C1775290wIZ(context, null, 14);
                                    C1168270gVV.LIZ.getClass();
                                    InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(this.LL.LIZ.LIZIZ);
                                    if (interfaceC1168310gVZ == null || (objLJII = interfaceC1168310gVZ.LJII()) == null || (strLJIIJ = C1337850kv1.LJIIJ(objLJII)) == null) {
                                        strLJIIJ = "";
                                    }
                                    if (this.LL.LIZ.LJJJ && !C1168320gVa.LIZIZ()) {
                                        c1775290wIZ.setSinglePlayerScene(strLJIIJ);
                                        c1775290wIZ.getVideoPlayer();
                                    }
                                    return c1775290wIZ;
                                }

                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // X.AbstractC21333318eB
                                public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
                                    double dDoubleValue;
                                    String str2;
                                    String str3;
                                    boolean z;
                                    List listLJJLIIIJILLIZJL;
                                    C14TU c14tu;
                                    JSONObject jSONObject;
                                    C14TU c14tu2;
                                    String str4;
                                    if (map.isEmpty()) {
                                        return;
                                    }
                                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                                        String key = entry.getKey();
                                        Double d = null;
                                        switch (key.hashCode()) {
                                            case -1992012396:
                                                if (key.equals("duration")) {
                                                    Object value = entry.getValue();
                                                    if (value instanceof Double) {
                                                        d = (Double) value;
                                                    }
                                                    C1775290wIZ c1775290wIZ = (C1775290wIZ) getView();
                                                    if (d != null) {
                                                        dDoubleValue = d.doubleValue();
                                                    } else {
                                                        dDoubleValue = 0.0d;
                                                    }
                                                    c1775290wIZ.setDuration(Double.valueOf(dDoubleValue));
                                                }
                                                break;
                                            case -1664825047:
                                                if (key.equals("singleplayer")) {
                                                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("SlcVideoElementViewManager- singleplayer -> ");
                                                    sbLIZ.append(zBooleanValue);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                                                    ((C14TU) getView()).setSinglePlayer(zBooleanValue);
                                                }
                                                break;
                                            case -1596019157:
                                                if (key.equals("videowidth")) {
                                                    int iIntValue = ((Integer) entry.getValue()).intValue();
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append("SlcVideoElementViewManager- videowidth -> ");
                                                    sbLIZ2.append(iIntValue);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                                                    ((C14TU) getView()).setVideoWidth(iIntValue);
                                                }
                                                break;
                                            case -1489589134:
                                                if (key.equals("objectfit")) {
                                                    String str5 = (String) entry.getValue();
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("SlcVideoElementViewManager- objectfit -> ");
                                                    sbLIZ3.append(str5);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ3));
                                                    ((C14TU) getView()).setObjectFit(str5);
                                                }
                                                break;
                                            case -982450867:
                                                if (key.equals("poster")) {
                                                    Object value2 = entry.getValue();
                                                    if ((value2 instanceof String) && (str2 = (String) value2) != null) {
                                                        ((C14TU) getView()).setPoster(str2);
                                                    }
                                                }
                                                break;
                                            case -894681731:
                                                if (!key.equals("__control")) {
                                                    break;
                                                } else {
                                                    Object value3 = entry.getValue();
                                                    if (value3 instanceof String) {
                                                        str3 = (String) value3;
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                    sbLIZ4.append("SlcVideoElementViewManager- __control -> ");
                                                    sbLIZ4.append(str3);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ4));
                                                    if (str3 == null) {
                                                        break;
                                                    } else {
                                                        boolean z2 = false;
                                                        if (str3.length() > 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (!z || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{"_*_"}, 0, 6)) == null || listLJJLIIIJILLIZJL.size() != 3) {
                                                            break;
                                                        } else {
                                                            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str3, new String[]{"_*_"}, 0, 6);
                                                            String str6 = (String) ListProtector.get(listLJJLIIIJILLIZJL2, 0);
                                                            switch (str6.hashCode()) {
                                                                case -1879513255:
                                                                    if (str6.equals("exitfullscreen")) {
                                                                        ((C14TU) getView()).LJIIJJI();
                                                                    }
                                                                    break;
                                                                case -619198582:
                                                                    if (str6.equals("requestfullscreen")) {
                                                                        ((C14TU) getView()).LJIIJ();
                                                                    }
                                                                    break;
                                                                case 3443508:
                                                                    if (str6.equals("play") && (c14tu = (C14TU) getView()) != null) {
                                                                        c14tu.LIZ(null);
                                                                    }
                                                                    break;
                                                                case 3526264:
                                                                    if (str6.equals("seek")) {
                                                                        try {
                                                                            jSONObject = new JSONObject((String) listLJJLIIIJILLIZJL2.get(1));
                                                                        } catch (Exception e) {
                                                                            TryCatchGuardChecker.doCheck(e);
                                                                            jSONObject = new JSONObject();
                                                                        }
                                                                        C14TU c14tu3 = (C14TU) getView();
                                                                        if (c14tu3 != null) {
                                                                            int iOptInt = jSONObject.optInt("position", 0);
                                                                            if (jSONObject.optInt("play") == 1) {
                                                                                z2 = true;
                                                                            }
                                                                            c14tu3.LLJJIJIIJIL = true;
                                                                            c14tu3.LLJ = iOptInt;
                                                                            c14tu3.LIZ(new AwS17S0111000_26(c14tu3, z2, iOptInt, 1));
                                                                        }
                                                                    }
                                                                    break;
                                                                case 106440182:
                                                                    if (str6.equals("pause") && (c14tu2 = (C14TU) getView()) != null) {
                                                                        c14tu2.pause();
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                            case -818786127:
                                                if (key.equals("enter_from")) {
                                                    ((C1775290wIZ) getView()).setEnterFrom((String) entry.getValue());
                                                }
                                                break;
                                            case -810883302:
                                                if (key.equals("volume")) {
                                                    float fFloatValue = ((Float) entry.getValue()).floatValue();
                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                    sbLIZ5.append("SlcVideoElementViewManager- preload -> ");
                                                    sbLIZ5.append(fFloatValue);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ5));
                                                    ((C14TU) getView()).setVolume(fFloatValue);
                                                }
                                                break;
                                            case -489962661:
                                                if (key.equals("vod_scenes")) {
                                                    ((C1775290wIZ) getView()).setVodSceneTag((String) entry.getValue());
                                                }
                                                break;
                                            case -318476791:
                                                if (key.equals("preload")) {
                                                    boolean zBooleanValue2 = ((Boolean) entry.getValue()).booleanValue();
                                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                    sbLIZ6.append("SlcVideoElementViewManager- preload -> ");
                                                    sbLIZ6.append(zBooleanValue2);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ6));
                                                    ((C14TU) getView()).setPreload(zBooleanValue2);
                                                }
                                                break;
                                            case 114148:
                                                if (key.equals("src")) {
                                                    Object value4 = entry.getValue();
                                                    if ((value4 instanceof String) && (str4 = (String) value4) != null) {
                                                        ((C14TU) getView()).setSrc(str4);
                                                    }
                                                }
                                                break;
                                            case 3327652:
                                                if (key.equals("loop")) {
                                                    boolean zBooleanValue3 = ((Boolean) entry.getValue()).booleanValue();
                                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                    sbLIZ7.append("SlcVideoElementViewManager- loop -> ");
                                                    sbLIZ7.append(zBooleanValue3);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ7));
                                                    ((C14TU) getView()).setLoop(zBooleanValue3);
                                                }
                                                break;
                                            case 3493088:
                                                if (key.equals("rate")) {
                                                    int iIntValue2 = ((Integer) entry.getValue()).intValue();
                                                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                    sbLIZ8.append("SlcVideoElementViewManager- rate -> ");
                                                    sbLIZ8.append(iIntValue2);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ8));
                                                    ((C14TU) getView()).setRate(iIntValue2);
                                                }
                                                break;
                                            case 104264043:
                                                if (key.equals("muted")) {
                                                    boolean zBooleanValue4 = ((Boolean) entry.getValue()).booleanValue();
                                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                    sbLIZ9.append("SlcVideoElementViewManager- muted -> ");
                                                    sbLIZ9.append(zBooleanValue4);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ9));
                                                    ((C14TU) getView()).setMuted(zBooleanValue4);
                                                }
                                                break;
                                            case 139108611:
                                                if (key.equals("singleplayerscene")) {
                                                    String str7 = (String) entry.getValue();
                                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                    sbLIZ10.append("SlcVideoElementViewManager- singleplayerscene -> ");
                                                    sbLIZ10.append(str7);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ10));
                                                    ((C14TU) getView()).setSinglePlayerScene(str7);
                                                }
                                                break;
                                            case 269397981:
                                                if (key.equals("inittime")) {
                                                    int iIntValue3 = ((Integer) entry.getValue()).intValue();
                                                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                    sbLIZ11.append("SlcVideoElementViewManager- inittime -> ");
                                                    sbLIZ11.append(iIntValue3);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ11));
                                                    ((C14TU) getView()).setInitTime(iIntValue3);
                                                }
                                                break;
                                            case 624384550:
                                                if (key.equals("vod_tag")) {
                                                    ((C1775290wIZ) getView()).setVodTag((String) entry.getValue());
                                                }
                                                break;
                                            case 894041755:
                                                if (key.equals("autolifecycle")) {
                                                    boolean zBooleanValue5 = ((Boolean) entry.getValue()).booleanValue();
                                                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                                    sbLIZ12.append("SlcVideoElementViewManager- autolifecycle -> ");
                                                    sbLIZ12.append(zBooleanValue5);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ12));
                                                    ((C14TU) getView()).setAutoLifecycle(zBooleanValue5);
                                                }
                                                break;
                                            case 1439562083:
                                                if (key.equals("autoplay")) {
                                                    boolean zBooleanValue6 = ((Boolean) entry.getValue()).booleanValue();
                                                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                                    sbLIZ13.append("SlcVideoElementViewManager- autoplay -> ");
                                                    sbLIZ13.append(zBooleanValue6);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ13));
                                                    ((C14TU) getView()).setAutoPlay(zBooleanValue6);
                                                }
                                                break;
                                            case 1630018914:
                                                if (key.equals("videoheight")) {
                                                    int iIntValue4 = ((Integer) entry.getValue()).intValue();
                                                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                                    sbLIZ14.append("SlcVideoElementViewManager- videoheight -> ");
                                                    sbLIZ14.append(iIntValue4);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ14));
                                                    ((C14TU) getView()).setVideoHeight(iIntValue4);
                                                }
                                                break;
                                            case 1933829272:
                                                if (key.equals("devicechangeaware")) {
                                                    boolean zBooleanValue7 = ((Boolean) entry.getValue()).booleanValue();
                                                    StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                                    sbLIZ15.append("SlcVideoElementViewManager- devicechangeaware -> ");
                                                    sbLIZ15.append(zBooleanValue7);
                                                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ15));
                                                    ((C14TU) getView()).setDeviceChangeAware(zBooleanValue7);
                                                }
                                                break;
                                        }
                                    }
                                    ((C14TU) getView()).LJIIIIZZ();
                                }
                            };
                        case -535508421:
                            if (!str.equals("mmk-s-video-time")) {
                                return null;
                            }
                            return new AbstractC21333318eB<C21281718Qd>(c21325918cz) { // from class: X.18Qf
                                @Override // X.AbstractC21333318eB
                                public final View LJJJLZIJ(Context context) {
                                    C599820Nfo.LIZ.getClass();
                                    C599820Nfo.LIZLLL();
                                    return new C21281718Qd(context);
                                }

                                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                @Override // X.AbstractC21333318eB
                                public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
                                    if (map.isEmpty()) {
                                        return;
                                    }
                                    try {
                                        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                                            String key = entry.getKey();
                                            switch (key.hashCode()) {
                                                case -2115337775:
                                                    if (key.equals("text_color")) {
                                                        getView().setTextColor((String) entry.getValue());
                                                    }
                                                    break;
                                                case -2100542604:
                                                    if (key.equals("text_space")) {
                                                        getView().setTextSpace(((Number) entry.getValue()).floatValue());
                                                    }
                                                    break;
                                                case -1903327537:
                                                    if (key.equals("show_time")) {
                                                        getView().setShowTime(((Boolean) entry.getValue()).booleanValue());
                                                    }
                                                    break;
                                                case -1877849436:
                                                    if (key.equals("play_icon")) {
                                                        getView().setPlayIcon((String) entry.getValue());
                                                    }
                                                    break;
                                                case -1390460921:
                                                    if (key.equals("icon_size")) {
                                                        getView().setIconSize(((Number) entry.getValue()).floatValue());
                                                    }
                                                    break;
                                                case -795913889:
                                                    if (key.equals("text_font_size")) {
                                                        getView().setTextFontSize(((Number) entry.getValue()).floatValue());
                                                    }
                                                    break;
                                                case -749015742:
                                                    if (key.equals("text_font_family")) {
                                                        getView().setTextFontFamily((String) entry.getValue());
                                                    }
                                                    break;
                                                case -258747306:
                                                    if (key.equals("text_font_weight")) {
                                                        getView().setTextFontWeight(((Number) entry.getValue()).floatValue());
                                                    }
                                                    break;
                                                case 1629789846:
                                                    if (key.equals("stop_icon")) {
                                                        getView().setStopIcon((String) entry.getValue());
                                                    }
                                                    break;
                                            }
                                        }
                                        getView().h0(new AwS669S0100000_20(this, 1));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            };
                        case 100313435:
                            if (!str.equals("image")) {
                                return null;
                            }
                            if (c21325918cz.LIZ.LJJJJL) {
                                return new C1321390kUT(c21325918cz);
                            }
                            return new C1322980kX2(c21325918cz);
                        default:
                            return null;
                    }
                }

                @Override // X.InterfaceC1168310gVZ
                public final Typeface LJI(int i, String str, boolean z) {
                    C21320518c7.LIZIZ.getClass();
                    return C1300780jxE.LIZIZ(str);
                }
            }, "MixMall");
            C21322218cO c21322218cO = C21322218cO.LIZ;
            C1123804aS.LIZ.getClass();
            Forest forest = (Forest) C1123804aS.LIZLLL.getValue();
            c21322218cO.getClass();
            C21322218cO.LJIIIZ("MixMall", "tiktok_ecom_hybrid_mall", forest);
            atomicBoolean.set(true);
        }
    }
}
