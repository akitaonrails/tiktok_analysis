package X;

import com.ss.android.ugc.aweme.slash.cell.card.SlashImgCardCell;
import com.ss.android.ugc.aweme.slash.cell.card.SlashImgCardCellModel;
import com.ss.android.ugc.aweme.slash.cell.divider.SlashDividerCell;
import com.ss.android.ugc.aweme.slash.cell.divider.SlashDividerCellModel;
import com.ss.android.ugc.aweme.slash.cell.list.horizontal.SlashHorizontalListCellGroup;
import com.ss.android.ugc.aweme.slash.cell.list.horizontal.SlashHorizontalListCellModel;
import com.ss.android.ugc.aweme.slash.cell.list.vertical.SlashVerticalLimitedListCellGroup;
import com.ss.android.ugc.aweme.slash.cell.list.vertical.SlashVerticalLimitedListCellModel;
import com.ss.android.ugc.aweme.slash.cell.summary.SlashTextCell;
import com.ss.android.ugc.aweme.slash.cell.summary.SlashTextCellModel;
import com.ss.android.ugc.aweme.slash.cell.title.SlashTitleCell;
import com.ss.android.ugc.aweme.slash.cell.title.SlashTitleCellModel;
import com.ss.android.ugc.aweme.slash.cell.vertical.SlashVerticalLayoutCellGroup;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.lynx.icon.LynxFloatComponent;
import com.ss.android.ugc.aweme.slash.component.lynx.icon.LynxFloatIconModel;
import com.ss.android.ugc.aweme.slash.component.popup.spark.SparkPopupModel;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import com.ss.android.ugc.aweme.slash.data.SlashEventAction;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0goh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180170goh {
    public static InterfaceC1173960geg LIZ;
    public static final HashMap<C1180090goZ, InterfaceC1180970gpz> LIZIZ;
    public static final HashMap<String, InterfaceC1175990ghx> LIZJ;

    static {
        HashMap<C1180090goZ, InterfaceC1180970gpz> map = new HashMap<>();
        LIZIZ = map;
        HashMap<String, InterfaceC1175990ghx> map2 = new HashMap<>();
        LIZJ = map2;
        map.put(new C1180090goZ("slash_spark_popup"), new InterfaceC1181610gr1() { // from class: X.0gr2
            @Override // X.InterfaceC1180970gpz
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1180970gpz
            public final InterfaceC1181340gqa LJII() {
                return null;
            }

            @Override // X.InterfaceC1180970gpz
            public final InterfaceC1181670gr7 service() {
                return null;
            }

            @Override // X.InterfaceC1180970gpz
            public final InterfaceC1180980gq0<?> LIZIZ() {
                return new C1208890hZ1(43);
            }

            @Override // X.InterfaceC1180970gpz
            public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
                SparkPopupModel sparkPopupModel;
                if ((baseComponentData instanceof SparkPopupModel) && (sparkPopupModel = (SparkPopupModel) baseComponentData) != null && sparkPopupModel.isDataReady$slash_release()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1181610gr1
            public final C1187730h0t LJIIIIZZ(C1180920gpu c1180920gpu, InterfaceC1181010gq3 interfaceC1181010gq3) {
                return new C1187730h0t(interfaceC1181010gq3.S8().getContext(), c1180920gpu.LIZ, interfaceC1181010gq3);
            }
        });
        map.put(new C1180090goZ("slash_compose"), new C1179220gnA());
        map.put(new C1180090goZ("slash_float_lynx"), new InterfaceC1180800gpi() { // from class: X.0gpG
            @Override // X.InterfaceC1180970gpz
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1180800gpi
            public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
                return C13LE.LIZ(LynxFloatComponent.class);
            }

            @Override // X.InterfaceC1180970gpz
            public final InterfaceC1181340gqa LJII() {
                return null;
            }

            @Override // X.InterfaceC1180970gpz
            public final InterfaceC1181670gr7 service() {
                return null;
            }

            @Override // X.InterfaceC1180970gpz
            public final InterfaceC1180980gq0<?> LIZIZ() {
                return new C1208890hZ1(18);
            }

            @Override // X.InterfaceC1180970gpz
            public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
                LynxFloatIconModel lynxFloatIconModel;
                if ((baseComponentData instanceof LynxFloatIconModel) && (lynxFloatIconModel = (LynxFloatIconModel) baseComponentData) != null && lynxFloatIconModel.isDataReady$slash_release()) {
                    return true;
                }
                return false;
            }
        });
        map2.put("title", new InterfaceC1175990ghx() { // from class: X.0gmo
            @Override // X.InterfaceC1175990ghx
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(SlashTitleCell.class);
            }

            @Override // X.InterfaceC1175990ghx
            public final Class<?> LIZ() {
                return SlashTitleCellModel.class;
            }
        });
        map2.put("section_divider", new InterfaceC1175990ghx() { // from class: X.0gn5
            @Override // X.InterfaceC1175990ghx
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(SlashDividerCell.class);
            }

            @Override // X.InterfaceC1175990ghx
            public final Class<?> LIZ() {
                return SlashDividerCellModel.class;
            }
        });
        map2.put("vertical_limited_list", new InterfaceC1175990ghx() { // from class: X.0gmr
            @Override // X.InterfaceC1175990ghx
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(SlashVerticalLimitedListCellGroup.class);
            }

            @Override // X.InterfaceC1175990ghx
            public final Class<?> LIZ() {
                return SlashVerticalLimitedListCellModel.class;
            }
        });
        map2.put("horizontal_list", new InterfaceC1175990ghx() { // from class: X.0gmq
            @Override // X.InterfaceC1175990ghx
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(SlashHorizontalListCellGroup.class);
            }

            @Override // X.InterfaceC1175990ghx
            public final Class<?> LIZ() {
                return SlashHorizontalListCellModel.class;
            }
        });
        map2.put("img_card", new InterfaceC1175990ghx() { // from class: X.0gmw
            @Override // X.InterfaceC1175990ghx
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(SlashImgCardCell.class);
            }

            @Override // X.InterfaceC1175990ghx
            public final Class<?> LIZ() {
                return SlashImgCardCellModel.class;
            }
        });
        map2.put("text", new InterfaceC1175990ghx() { // from class: X.0gn8
            @Override // X.InterfaceC1175990ghx
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(SlashTextCell.class);
            }

            @Override // X.InterfaceC1175990ghx
            public final Class<?> LIZ() {
                return SlashTextCellModel.class;
            }
        });
        map2.put("vertical_linear_layout", new InterfaceC1175990ghx() { // from class: X.0gmv
            @Override // X.InterfaceC1175990ghx
            public final C19719912Dl LIZIZ() {
                return C13LE.LIZ(SlashVerticalLayoutCellGroup.class);
            }

            @Override // X.InterfaceC1175990ghx
            public final Class<?> LIZ() {
                return C1179060gmu.class;
            }
        });
        C1180190goj c1180190goj = new C1180190goj();
        c1180190goj.LIZ.LIZ("remove_slash_component", new AwS597S0100000_18(c1180190goj, 938));
    }

    public static InterfaceC1173960geg LIZLLL() {
        InterfaceC1173960geg interfaceC1173960geg = LIZ;
        return interfaceC1173960geg != null ? interfaceC1173960geg : new InterfaceC1173960geg() { // from class: X.0goi
            @Override // X.InterfaceC1173960geg
            public final void LIZ(Function0 function0) {
            }

            @Override // X.InterfaceC1173960geg
            public final void LIZIZ(String str, Function0<String> function0) {
            }
        };
    }

    public static List LJ() {
        Collection<InterfaceC1180970gpz> collectionValues = LIZIZ.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof InterfaceC1181600gr0) {
                arrayList.add(obj);
            }
        }
        return C13LP.LLIIII(arrayList);
    }

    public static C1180090goZ LIZIZ(InterfaceC1180800gpi interfaceC1180800gpi) {
        Object next;
        Iterator<T> it2 = LIZIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Map.Entry) next).getValue().getClass() == interfaceC1180800gpi.getClass()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (C1180090goZ) entry.getKey();
    }

    public static InterfaceC1181010gq3 LJFF(String str) {
        return C1180470gpB.LIZIZ.get(str);
    }

    public static boolean LIZ(C1180920gpu c1180920gpu, boolean z) {
        InterfaceC1180970gpz interfaceC1180970gpz = LIZIZ.get(c1180920gpu.LIZIZ);
        if (interfaceC1180970gpz != null) {
            return interfaceC1180970gpz.LIZLLL(c1180920gpu.LIZLLL, z);
        }
        return false;
    }

    public static SlashParam LIZJ(String str, String str2) {
        Collection<EventModel> collectionValues;
        EventModel eventModel;
        SlashEvent next;
        List<SlashEventAction> actions;
        SlashEventAction next2;
        InterfaceC1181010gq3 interfaceC1181010gq3 = C1180470gpB.LIZIZ.get(str);
        if (interfaceC1181010gq3 == null) {
            return null;
        }
        List<SlashEvent> listL00 = interfaceC1181010gq3.l00(str2);
        if (listL00 != null) {
            Iterator<SlashEvent> it2 = listL00.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getName(), "refresh")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SlashEvent slashEvent = next;
            if (slashEvent != null && (actions = slashEvent.getActions()) != null) {
                Iterator<SlashEventAction> it3 = actions.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.type, "request")) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                SlashEventAction slashEventAction = next2;
                if (slashEventAction != null) {
                    SlashParam slashParam = slashEventAction.slashParam;
                    if (slashParam == null) {
                        if (interfaceC1181010gq3 == null) {
                            return null;
                        }
                    } else {
                        return slashParam;
                    }
                }
            }
        }
        Map<String, EventModel> mapHm = interfaceC1181010gq3.Hm(str2);
        if (mapHm == null || (collectionValues = mapHm.values()) == null || (eventModel = (EventModel) C13LP.LJJJLIIL(collectionValues)) == null) {
            return null;
        }
        return eventModel.slashParam;
    }
}
