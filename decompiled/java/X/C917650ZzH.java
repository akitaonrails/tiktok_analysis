package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917650ZzH {
    public static final void LIZ(Map map) {
        Integer numValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            numValueOf = Integer.valueOf((int) room.visibleScopeType);
        } else {
            numValueOf = null;
        }
        ((HashMap) map).put("distribution_type", C473420IhQ.LIZ(numValueOf));
    }

    public static final void LIZIZ(Map map) {
        map.put("layout_id", C917520Zz4.LIZJ());
        EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
        if (enumC918970a1PLJIILIIL != null) {
            Integer num = null;
            if (!C781520UlC.LJFF(null) && !C930540aK4.LJJIJ()) {
                int i = C915810ZwJ.LIZ[enumC918970a1PLJIILIIL.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                num = 3;
                            }
                        } else {
                            num = 4;
                        }
                    } else {
                        num = 1;
                    }
                } else {
                    num = 2;
                }
            } else {
                num = 5;
            }
            map.put("layout_style", String.valueOf(num));
            Pair pairLJII = C917520Zz4.LJII(enumC918970a1PLJIILIIL);
            map.put("layout_setting", pairLJII.getFirst());
            map.put("window_setting", pairLJII.getSecond());
        }
        if (C931790aM5.LIZIZ()) {
            map.put("layout_key", C940770aaZ.LIZ().getDataSource().LIZ());
            map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        }
    }

    public static final void LIZJ(C474500IjA c474500IjA) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c474500IjA.LJJII(entry.getValue(), (String) entry.getKey());
        }
    }

    public static final Boolean LIZLLL(Integer num) {
        if (num != null) {
            if (num.intValue() != 2 && num.intValue() != 4) {
                if (num.intValue() == 3 || num.intValue() == 1) {
                    return Boolean.FALSE;
                }
                return null;
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public static final void LJ(View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            C439101nJ.LJI(view2);
        }
        C439101nJ.LJI(view);
    }

    public static final void LJFF(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            C12ES.LJIILL(0, view2);
        }
        C12ES.LJIILL(0, view);
    }

    public static final Integer LJI(int i) {
        if (LIZLLL(Integer.valueOf(i)) == null) {
            return null;
        }
        if (Intrinsics.LJFF(LIZLLL(Integer.valueOf(i)), Boolean.TRUE)) {
            return 0;
        }
        return 1;
    }

    public static final int LJII(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings.fixMicNumAction == 0) {
            if (multiLiveAnchorPanelSettings.layoutType == 0) {
                return 4;
            }
            return 2;
        }
        if (multiLiveAnchorPanelSettings.layoutType == 0) {
            return 3;
        }
        return 1;
    }

    public static final Integer LJIIIIZZ(int i) {
        if (i == 0) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null && (numValueOf.intValue() == 2 || numValueOf.intValue() == 1)) {
            return 1;
        }
        return 0;
    }
}
