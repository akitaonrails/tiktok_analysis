package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575440r6E {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(471));

    public static final String LIZ() {
        return C0XQ7.LJFF().getCurUserId();
    }

    public static final Fragment LIZJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof UIAssem) {
            return LIZJ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof ReusedAssem) {
            return LIZJ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof PowerCell) {
            return LIZJ(((PowerCell) lifecycleOwner).getParent());
        }
        return null;
    }

    public static final IMUser LIZLLL(String str) {
        IMContactApi.LIZ.getClass();
        return C069P.LIZ().LJ().LIZLLL(str, null, "shared_feed");
    }

    public static final String LJ(String str) {
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(str, null);
        if (iMUserLJ == null) {
            return null;
        }
        return iMUserLJ.getDisplayName();
    }

    public static final EnumC912680ZrG LJI(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && c0y8tLIZ.isGroupChat()) {
            return EnumC912680ZrG.MUTUAL_FEED_SCENE_GROUP;
        }
        return EnumC912680ZrG.MUTUAL_FEED_SCENE_PRIVATE;
    }

    public static final String LJII(String str) {
        String string;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null || (string = Long.valueOf(c0y8tLIZ.getConversationShortId()).toString()) == null) {
            return "";
        }
        return string;
    }

    public static final void LIZIZ(String str, Map<String, String> map) {
        C805380Via.LIZJ(new Throwable("vibe_feed_biz_exception"), str);
        C13DA c13da = new C13DA();
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        c13da.putAll(map);
        c13da.put("type", str);
        Map mapBuild = c13da.build();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackException type=");
        sbLIZ.append(str);
        sbLIZ.append(" params=");
        sbLIZ.append(mapBuild);
        C2188811AlT.LIZIZ(sbLIZ);
        C20684815ws.LJIILLIIL("shared_feed_exception", mapBuild);
    }

    public static final C1331670kl3 LJFF(C0VSJ c0vsj, String str) {
        if (c0vsj != null && c0vsj.exists()) {
            return C1331660kl2.LJII(c0vsj);
        }
        if (str != null) {
            return C1331660kl2.LJIIIZ(str);
        }
        return C1331660kl2.LJIIIZ("");
    }

    public static final EnumC1575330r63 LJIIIIZZ(EnumC1575230r5t enumC1575230r5t, String str) {
        if (Intrinsics.LJFF(str, "menu_bar")) {
            return EnumC1575330r63.INTRODUCTION;
        }
        if (enumC1575230r5t == EnumC1575230r5t.ACCEPTING) {
            return EnumC1575330r63.ACCEPT;
        }
        if (enumC1575230r5t == EnumC1575230r5t.INVITE_GAP) {
            return EnumC1575330r63.INVITE_GAP;
        }
        if (enumC1575230r5t == EnumC1575230r5t.INVITE_OUTGAP) {
            return EnumC1575330r63.RE_INVITE;
        }
        return EnumC1575330r63.INVITE;
    }
}
