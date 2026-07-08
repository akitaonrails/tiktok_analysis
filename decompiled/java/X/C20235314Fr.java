package X;

import Y.ACListenerS61S0400000_30;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.14Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20235314Fr implements InterfaceC666720QDe {
    public static final C20235314Fr LIZ = new C20235314Fr();
    public static C1869550ykb LIZIZ;

    @Override // X.InterfaceC666720QDe
    public final boolean LIZ(TuxIconView tuxIconView, boolean z, Aweme aweme, C2189821An6 c2189821An6, Fragment fragment) throws JSONException {
        Context context;
        String searchId;
        String str;
        String str2;
        String str3 = null;
        if (tuxIconView == null) {
            LIZIZ = null;
            return false;
        }
        if (C1148304eP.LIZ() && C14FR.LIZ.LJIILIIL()) {
            C14TF c14tf = C14TF.LIZIZ;
            if (c14tf.LJIILL().LJIIL(c2189821An6) && (context = tuxIconView.getContext()) != null && !C0SXF.LJIL(context)) {
                if (z) {
                    C427690Gpr.LJI(tuxIconView, null);
                    tuxIconView.LIZJ(true);
                    tuxIconView.setImageResource(C1857680yRS.LIZ.LIZIZ(true));
                    C786410Ut5.a9(tuxIconView, new ACListenerS61S0400000_30(aweme, fragment, c2189821An6, tuxIconView, 0));
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    if (!AwemeSaaSExtKt.isLive(aweme)) {
                        String strLIZIZ = c14tf.LJJLJ().LIZIZ(c2189821An6);
                        if (c2189821An6 != null) {
                            searchId = c2189821An6.getSearchId();
                        } else {
                            searchId = null;
                        }
                        C1869550ykb c1869550ykb = LIZIZ;
                        if (c1869550ykb != null) {
                            str = c1869550ykb.LIZ;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, aweme.getAid())) {
                            C1869550ykb c1869550ykb2 = LIZIZ;
                            if (c1869550ykb2 != null) {
                                str2 = c1869550ykb2.LIZIZ;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str2, strLIZIZ)) {
                                C1869550ykb c1869550ykb3 = LIZIZ;
                                if (c1869550ykb3 != null) {
                                    str3 = c1869550ykb3.LIZJ;
                                }
                                if (Intrinsics.LJFF(str3, searchId)) {
                                    return true;
                                }
                            }
                        }
                        LIZIZ = new C1869550ykb(aweme.getAid(), strLIZIZ, searchId);
                        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                        String aid = aweme.getAid();
                        if (aid == null) {
                            aid = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("aweme_type", Integer.valueOf(aweme.getAwemeType()));
                        c1862330yYx.mobTikbotEntranceShow(strLIZIZ, "icon", aid, searchId, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, false);
                        return true;
                    }
                    return true;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                LIZIZ = null;
                return false;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            LIZIZ = null;
            return false;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        LIZIZ = null;
        return false;
    }
}
