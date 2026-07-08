package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0K7V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7V implements C0K4L {
    public static final C0K7V LIZ = new C0K7V();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.13BV] */
    public static C0K7X LIZLLL(String str) {
        ?? arrayList;
        C0K7W c0k7w;
        C0K7U c0k7u;
        ?? arrayList2;
        Object c098200Yq;
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("spaceId");
        String strOptString2 = jSONObject.optString("draftId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        if (jSONObjectOptJSONObject == null) {
            c0k7u = new C0K7U(null, null, null, null, null, null, null, null, 8191);
        } else {
            String strOptString3 = jSONObjectOptJSONObject.optString("draftId");
            String strOptString4 = jSONObjectOptJSONObject.optString("title");
            String strOptString5 = jSONObjectOptJSONObject.optString("text");
            String strOptString6 = jSONObjectOptJSONObject.optString("postId");
            String strOptString7 = jSONObjectOptJSONObject.optString("commentId");
            String strOptString8 = jSONObjectOptJSONObject.optString("replyToCommentId");
            String strOptString9 = jSONObjectOptJSONObject.optString("enterFrom");
            int iOptInt = jSONObjectOptJSONObject.optInt("visibility");
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("isPinned");
            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("isCommentDisabled");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("mediaItems");
            if (jSONArrayOptJSONArray == null) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList.add(new C0K7Y(jSONObjectOptJSONObject2.optString("mediaId"), jSONObjectOptJSONObject2.optString("localUri"), jSONObjectOptJSONObject2.optString("remoteUrl"), jSONObjectOptJSONObject2.optString("mimeType"), jSONObjectOptJSONObject2.optLong("sizeBytes"), jSONObjectOptJSONObject2.optLong("durationMs"), jSONObjectOptJSONObject2.optInt("width"), jSONObjectOptJSONObject2.optInt("height"), jSONObjectOptJSONObject2.optBoolean("isRemote")));
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("pollSpec");
            if (jSONObjectOptJSONObject3 != null) {
                String strOptString10 = jSONObjectOptJSONObject3.optString("question");
                List listLJIIIIZZ = LJIIIIZZ(jSONObjectOptJSONObject3.optJSONArray("options"));
                long jOptLong = jSONObjectOptJSONObject3.optLong("deadlineAt");
                boolean zOptBoolean3 = jSONObjectOptJSONObject3.optBoolean("allowMultiple");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("defaultSelectedIndices");
                if (jSONArrayOptJSONArray2 == null) {
                    arrayList2 = C13BV.INSTANCE;
                } else {
                    arrayList2 = new ArrayList(jSONArrayOptJSONArray2.length());
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i2)));
                    }
                }
                c0k7w = new C0K7W(zOptBoolean3, jOptLong, jSONObjectOptJSONObject3.optInt("maxSelectCount", 1), strOptString10, listLJIIIIZZ, arrayList2);
            } else {
                c0k7w = null;
            }
            c0k7u = new C0K7U(strOptString3, strOptString4, strOptString5, strOptString6, strOptString7, strOptString8, strOptString9, iOptInt, zOptBoolean, zOptBoolean2, arrayList, c0k7w, LJIIIIZZ(jSONObjectOptJSONObject.optJSONArray("topics")));
        }
        String strOptString11 = jSONObject.optString("ownerSecUid");
        long jOptLong2 = jSONObject.optLong("updatedAt");
        long jOptLong3 = jSONObject.optLong("createdAt");
        String strOptString12 = jSONObject.optString("mode");
        if (strOptString12 == null) {
            strOptString12 = "";
        }
        try {
            c098200Yq = C0K46.valueOf(strOptString12);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C0K46 c0k46 = C0K46.POST;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c0k46;
        }
        return new C0K7X(strOptString, strOptString2, c0k7u, strOptString11, jOptLong2, jOptLong3, (C0K46) c098200Yq);
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pgc_sub_space_editor_draft_index_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJI(C0K7X c0k7x) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("spaceId", c0k7x.LIZ);
        jSONObject2.put("draftId", c0k7x.LIZIZ);
        jSONObject2.put("ownerSecUid", c0k7x.LIZLLL);
        jSONObject2.put("updatedAt", c0k7x.LJ);
        jSONObject2.put("createdAt", c0k7x.LJFF);
        jSONObject2.put("mode", c0k7x.LJI.name());
        C0K7V c0k7v = LIZ;
        C0K7U c0k7u = c0k7x.LIZJ;
        c0k7v.getClass();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("draftId", c0k7u.LIZ);
        jSONObject3.put("title", c0k7u.LIZIZ);
        jSONObject3.put("text", c0k7u.LIZJ);
        jSONObject3.put("postId", c0k7u.LIZLLL);
        jSONObject3.put("commentId", c0k7u.LJ);
        jSONObject3.put("replyToCommentId", c0k7u.LJFF);
        jSONObject3.put("enterFrom", c0k7u.LJI);
        jSONObject3.put("visibility", c0k7u.LJII);
        jSONObject3.put("isPinned", c0k7u.LJIIIIZZ);
        jSONObject3.put("isCommentDisabled", c0k7u.LJIIIZ);
        jSONObject3.put("topics", LJII(c0k7u.LJIIL));
        List<C0K7Y> list = c0k7u.LJIIJ;
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(0);
        JSONArray jSONArray = new JSONArray();
        Iterator<C0K7Y> it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(aFwS237S0000000_7.invoke(it2.next()));
        }
        jSONObject3.put("mediaItems", jSONArray);
        C0K7W c0k7w = c0k7u.LJIIJJI;
        if (c0k7w != null) {
            LIZ.getClass();
            jSONObject = new JSONObject();
            jSONObject.put("question", c0k7w.LIZ);
            jSONObject.put("options", LJII(c0k7w.LIZIZ));
            jSONObject.put("deadlineAt", c0k7w.LIZJ);
            jSONObject.put("allowMultiple", c0k7w.LIZLLL);
            jSONObject.put("defaultSelectedIndices", LJII(c0k7w.LJ));
            jSONObject.put("maxSelectCount", c0k7w.LJFF);
        } else {
            jSONObject = null;
        }
        jSONObject3.put("pollSpec", jSONObject);
        jSONObject2.put("payload", jSONObject3);
        return C786410Ut5.J3(jSONObject2);
    }

    public static JSONArray LJII(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        return jSONArray;
    }

    public static List LJIIIIZZ(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    @Override // X.C0K4L
    public final boolean LIZ(C0K7X c0k7x) {
        Object c098200Yq;
        if (a0.LJJJIL(c0k7x.LIZ) || a0.LJJJIL(c0k7x.LIZIZ)) {
            return false;
        }
        try {
            AnonymousClass0512.LIZIZ(LJI(c0k7x), LJ(c0k7x.LIZ, c0k7x.LIZIZ));
            AnonymousClass0512.LIZIZ(c0k7x.LIZ, LJFF(c0k7x.LIZIZ));
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("space_id", c0k7x.LIZ), new Pair("draft_id", c0k7x.LIZIZ));
            C1973307oB.LIZ.getClass();
            C1973307oB.LIZJ(6, "LegacyEditorAdapter", "saveDraft failed", thM5exceptionOrNullimpl, mapLJIIIIZZ);
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // X.C0K4L
    public final boolean LIZJ(String str) {
        if (a0.LJJJIL(str)) {
            return false;
        }
        String str2 = (String) AnonymousClass0512.LIZ(LJFF(str));
        if (a0.LJJJIL(str2)) {
            return false;
        }
        String strLJ = LJ(str2, str);
        boolean zContains = AnonymousClass0512.LIZJ().contains(strLJ);
        AnonymousClass0512.LIZJ().erase(strLJ);
        AnonymousClass0512.LIZJ().erase(LJFF(str));
        return zContains;
    }

    public static String LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pgc_sub_space_editor_draft_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0K4L
    public final C0K7X LIZIZ(String str, String str2) {
        Object c098200Yq;
        Object obj = null;
        if (a0.LJJJIL(str) || a0.LJJJIL(str2)) {
            return null;
        }
        String strLJ = LJ(str, str2);
        if (!AnonymousClass0512.LIZJ().contains(strLJ)) {
            return null;
        }
        String str3 = (String) AnonymousClass0512.LIZ(strLJ);
        if (a0.LJJJIL(str3)) {
            return null;
        }
        try {
            c098200Yq = LIZLLL(str3);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            obj = c098200Yq;
        } else {
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("space_id", str), new Pair("draft_id", str2));
            C1973307oB.LIZ.getClass();
            C1973307oB.LIZJ(6, "LegacyEditorAdapter", "loadDraft failed", thM5exceptionOrNullimpl, mapLJIIIIZZ);
        }
        return (C0K7X) obj;
    }
}
