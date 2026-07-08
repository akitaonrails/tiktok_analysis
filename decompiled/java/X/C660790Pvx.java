package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Pvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660790Pvx {
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0PvM] */
    public static C660780Pvw LIZ(final Aweme aweme, final Function0 function0) {
        String str;
        InterfaceC1165104h7 c1165004h6;
        List<PoiSubTag> list;
        PoiSubTag poiSubTag;
        String str2 = null;
        if (C1840007Io.LIZ() == 0) {
            return null;
        }
        C660380PvI.LIZ.getClass();
        if (!C660380PvI.LIZJ(aweme)) {
            return null;
        }
        C660800Pvy.LIZ.getClass();
        PoiDataStruct poiDataStructLIZ = C660800Pvy.LIZ(aweme);
        if (poiDataStructLIZ == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(poiDataStructLIZ.poiName);
        PoiAnchorInfo poiAnchorInfo = poiDataStructLIZ.videoAnchor;
        if (poiAnchorInfo != null) {
            str = poiAnchorInfo.suffix;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            sb.append(" · ");
            sb.append(str);
        }
        String string = sb.toString();
        PoiAnchorInfo poiAnchorInfo2 = poiDataStructLIZ.videoAnchor;
        if (poiAnchorInfo2 != null && (list = poiAnchorInfo2.subTags) != null && (poiSubTag = (PoiSubTag) C13LP.LJJJLL(list)) != null) {
            str2 = poiSubTag.name;
        }
        if (str2 != null && str2.length() != 0) {
            c1165004h6 = new C1169304hn(string, str2);
        } else {
            c1165004h6 = new C1165004h6(string);
        }
        return new C660780Pvw(c1165004h6, new InterfaceC660480PvS() { // from class: X.0PvM
            @Override // X.InterfaceC660480PvS
            public final Map<String, String> LIZIZ(Aweme aweme2) {
                C660380PvI.LIZ.getClass();
                return C660380PvI.LIZ(aweme2);
            }

            @Override // X.InterfaceC660480PvS
            public final void LIZ(Context context, View view) {
                String str3;
                C0PCY<C646370PWx> c0pcyWO2;
                C646370PWx c646370PWx;
                C654710Pm9 c654710Pm9 = C654710Pm9.LIZ;
                ISearchContextAbility iSearchContextAbilityInvoke = function0.invoke();
                Aweme aweme2 = aweme;
                c654710Pm9.getClass();
                C654710Pm9.LIZ(aweme2, iSearchContextAbilityInvoke);
                ISearchContextAbility iSearchContextAbilityInvoke2 = function0.invoke();
                if (iSearchContextAbilityInvoke2 == null || (c0pcyWO2 = iSearchContextAbilityInvoke2.wO2()) == null || (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) == null || (str3 = c646370PWx.LLILLL) == null) {
                    str3 = "";
                }
                C660380PvI c660380PvI = C660380PvI.LIZ;
                Aweme aweme3 = aweme;
                c660380PvI.getClass();
                C660380PvI.LIZIZ(context, view, aweme3, str3, "search_video_anchor_outflow");
            }
        });
    }
}
