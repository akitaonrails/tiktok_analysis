package X;

import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.videolist.IPoiVideoListAbility;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0h0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187540h0a {
    public final void LIZ(C1187600h0g c1187600h0g, PowerCell<C1187600h0g> powerCell, View view, String str, String str2, Boolean bool, C1185490gxH c1185490gxH, PageFinder pageFinder, int i, String str3) {
        int iBW;
        Object c098200Yq;
        IPoiVideoListAbility iPoiVideoListAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(powerCell);
        Object obj = null;
        if (fragmentLJIIJ != null && (iPoiVideoListAbility = (IPoiVideoListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), IPoiVideoListAbility.class, null)) != null) {
            iBW = iPoiVideoListAbility.bW();
        } else {
            iBW = 0;
        }
        try {
            try {
                c098200Yq = (InterfaceC1184330gvP) C1170350gYr.LIZIZ(powerCell, C13LE.LIZ(InterfaceC1184330gvP.class));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        LIZIZ(this, c1187600h0g, iBW, (InterfaceC1184330gvP) obj, powerCell.getBindingAdapterPosition(), view, str, str2, bool, c1185490gxH, null, null, pageFinder, i, str3, 1536);
    }

    public static void LIZIZ(C1187540h0a c1187540h0a, C1187600h0g c1187600h0g, int i, InterfaceC1184330gvP interfaceC1184330gvP, int i2, View view, String str, String str2, Boolean bool, C1185490gxH c1185490gxH, String str3, String str4, PageFinder pageFinder, int i3, String str5, int i4) {
        String str6 = str5;
        int i5 = i3;
        String str7 = str4;
        String str8 = str3;
        if ((i4 & 512) != 0) {
            str8 = null;
        }
        if ((i4 & 1024) != 0) {
            str7 = null;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i5 = 0;
        }
        if ((i4 & 8192) != 0) {
            str6 = null;
        }
        c1187540h0a.getClass();
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
        LruCache<String, String> lruCache = C1180320gow.LIZ;
        C1180320gow.LIZIZ(c1187600h0g.LLILLJJLI.getAid(), c1187600h0g.LL);
        if (interfaceC1184330gvP != null) {
            Bundle bundleLJFF = c1606420ruCLIZ.LJFF();
            Aweme aweme = c1187600h0g.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c6581.d9055_i");
            sbLIZ.append(i2 - i);
            interfaceC1184330gvP.Oe(bundleLJFF, aweme, C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(view), null), 44, "POI_VIDEO_LIST_ENTRANCE", "post_feed", null, i5, new LinkedHashMap(), str6);
        }
        Aweme aweme2 = c1187600h0g.LLILLJJLI;
        String str9 = c1187600h0g.LL;
        if (str9 == null) {
            str9 = "";
        }
        C1188410h1z.LIZIZ(aweme2, str9, i2, str, str2, bool, c1185490gxH, "post_card", str8, null, str7, pageFinder, C1558360qeg.LJ(view, null), 1088);
    }
}
