package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0i3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227770i3T {
    public static final void LIZ(final Context context, final C1226850i1z c1226850i1z) {
        Integer next;
        C1227140i2S c1227140i2S;
        Map map = null;
        boolean zLIZ = C1228910i5J.LIZ(new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), "", EnumC1219960hqs.UNKNOWN.getValue()));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("open_platform_biz_scene", "live"), new Pair("open_platform_biz_line", "live_endpage"), new Pair("open_platform_source", "schema"));
        String str = c1226850i1z.enterFrom;
        String str2 = c1226850i1z.enterMethod;
        List<Integer> list = c1226850i1z.inviteTypeList;
        if (list != null) {
            Iterator<Integer> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C1226910i25.LJ(next.intValue()) == EnumC1226540i1U.TAB_KEY_LIVE_TOP_GUEST) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Integer num = next;
            if (num == null || (c1227140i2S = (C1227140i2S) C13LP.LJJJLL(C1226910i25.LIZIZ(Collections.singletonList(Integer.valueOf(num.intValue())), 0L, c1226850i1z.timeRange, c1226850i1z.roomId, context.getString(2131831591)))) == null) {
                return;
            }
            C1226970i2B c1226970i2B = new C1226970i2B(context, mapLJIIIIZZ, null, zLIZ, zLIZ, EnumC1222430hur.BOTTOM, false, str, str2, c1227140i2S, c1226850i1z, null, true, null, AFwS257S0000000_19.get$arr$(538), new C5183020f(context, 282));
            if (zLIZ) {
                EnumC1228990i5R enumC1228990i5R = EnumC1228990i5R.PRIVATE_GROUP;
                String str3 = c1226970i2B.LLJI;
                String str4 = c1226970i2B.LLJIJIL;
                boolean z = c1226970i2B.LLJ;
                EnumC1228990i5R enumC1228990i5R2 = EnumC1228990i5R.PUBLIC_GROUP;
                C1228470i4b c1228470i4b = new C1228470i4b(new C1228650i4t(str3, str4, enumC1228990i5R2.getValue(), null, 0, new C1228700i4y(EnumC1228720i50.NONE.getValue(), 0, c1226970i2B.LLJI, new InterfaceC1228750i53() { // from class: X.0i1g
                    @Override // X.InterfaceC1228750i53
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1228750i53
                    public final void LIZ(C0Y8T c0y8t) {
                        Context context2 = context;
                        C1226850i1z c1226850i1z2 = c1226850i1z;
                        C1226610i1b c1226610i1b = new C1226610i1b(context2, c1226850i1z2.enterFrom, c1226850i1z2.enterMethod, c1226850i1z2, c0y8t.getConversationId());
                        C1227130i2R.LIZ.getClass();
                        C1227130i2R.LJ(context2, c1226610i1b);
                    }
                }, map, 18), false, null, null, z, null, false, null, null, null, null, 0, 0, false, null, null, enumC1228990i5R, -1064, 0), new C1228810i59(c1226970i2B.LLJI, c1226970i2B.LLJIJIL, C461720I8s.LIZIZ(), c1226970i2B.LLJ, false, enumC1228990i5R2.getValue(), 0L, null, null, null, 0, null, null, null, null, null, false, null, null, 4194256));
                IMGroupChatApi.LIZIZ.getClass();
                new C1231470i9R("live", "live_endpage", "schema").LIZLLL(context, c1228470i4b, c1226970i2B);
                return;
            }
            C1227130i2R.LIZ.getClass();
            C1227130i2R.LJ(context, c1226970i2B);
        }
    }
}
