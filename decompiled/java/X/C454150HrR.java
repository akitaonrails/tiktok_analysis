package X;

import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HrR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454150HrR {
    public static final /* synthetic */ int LIZ = 0;

    public static C454300Hrg LIZJ(View view, Function0 function0) {
        return new C454300Hrg(view.getContext().getString(2131848897), 1, new C343950De5() { // from class: X.0Hrl
        }, EnumC454290Hrf.USE, new AwS550S0100000_6(function0, 1347), 12);
    }

    public static C454300Hrg LIZIZ(Context context, boolean z, Function0 function0) {
        if (!z) {
            return new C454300Hrg(context.getString(2131848898), 1, C454340Hrk.LIZ, EnumC454290Hrf.SHARE, null, 76);
        }
        return null;
    }

    public static void LIZLLL(AbstractC343940De4 abstractC343940De4, String str, Map map, Function0 function0, Function0 function02) {
        if (abstractC343940De4 instanceof C454340Hrk) {
            if (function0 != null) {
                function0.invoke();
            }
        } else if (abstractC343940De4 instanceof C454320Hri) {
            if (function02 == null) {
                return;
            }
            function02.invoke();
        } else {
            if (!(abstractC343940De4 instanceof C343970De7)) {
                return;
            }
            C1350920lG6.LJJII("blank", str, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r41, com.ss.android.ugc.aweme.im.common.model.StickerItem r42, android.view.View r43, boolean r44, final java.lang.String r45, final java.util.Map r46, final kotlin.jvm.functions.Function0 r47, final kotlin.jvm.functions.Function0 r48, kotlin.jvm.functions.Function0 r49) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454150HrR.LJ(java.lang.String, com.ss.android.ugc.aweme.im.common.model.StickerItem, android.view.View, boolean, java.lang.String, java.util.Map, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }

    public final C454300Hrg LIZ(View view, C454220HrY c454220HrY, boolean z, Long l, String str, int i, String str2, Function0<Unit> function0, Map<String, String> map, String str3) {
        if (z) {
            return LIZJ(view, function0);
        }
        return new C454300Hrg(view.getContext().getString(2131848896), 0, new C343950De5() { // from class: X.0Hrj
        }, EnumC454290Hrf.SAVE, new C454160HrS(c454220HrY, str3, l, str, i, str2, this, view, function0, map), 12);
    }
}
