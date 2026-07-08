package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0heC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212100heC {
    public static final String LIZ(String str) {
        if (str != null) {
            try {
                String strOptString = new JSONObject(str).optString("resource_id");
                if (!a0.LJJJIL(strOptString)) {
                    return strOptString;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static final String LIZIZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct next;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == 28) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct = next;
        if (anchorCommonStruct == null) {
            return null;
        }
        return LIZLLL(anchorCommonStruct);
    }

    public static final String LIZLLL(AnchorCommonStruct anchorCommonStruct) {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS563S0100000_19(anchorCommonStruct, 2694));
        if (anchorCommonStruct.getType() == 28 && c01gwLIZIZ.getValue() != null) {
            return (String) c01gwLIZIZ.getValue();
        }
        return "";
    }

    public static final String LIZJ(Aweme aweme, Function1<? super AnchorCommonStruct, Boolean> function1) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (anchorCommonStruct2.getType() == 28 && (function1 == null || function1.invoke(anchorCommonStruct2).booleanValue())) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, new C1212120heE(), 30);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }

    public static final String LJ(Aweme aweme, String str) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct next;
        String strLIZLLL;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getId(), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct = next;
            if (anchorCommonStruct != null && (strLIZLLL = LIZLLL(anchorCommonStruct)) != null) {
                return strLIZLLL;
            }
        }
        return "";
    }

    public static final String LJFF(Aweme aweme, Function1<? super AnchorCommonStruct, Boolean> function1) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1212110heD(anchorCommonStruct));
                if (anchorCommonStruct.getType() == 28 && c01gwLIZIZ.getValue() != null && (function1 == null || function1.invoke(anchorCommonStruct).booleanValue())) {
                    Object value = c01gwLIZIZ.getValue();
                    if (value != null) {
                        arrayList.add(value);
                    }
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }
}
