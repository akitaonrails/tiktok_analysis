package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08SF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SF {
    public final Writer LIZ;
    public final List<C08SG> LIZIZ = new ArrayList();

    public final String toString() {
        return "";
    }

    public final void LIZIZ() throws JSONException, IOException {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        C08SG c08sgLIZLLL = LIZLLL();
        if (c08sgLIZLLL == C08SG.EMPTY_ARRAY) {
            C08SG c08sg = C08SG.NONEMPTY_ARRAY;
            ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, c08sg);
        } else {
            if (c08sgLIZLLL == C08SG.NONEMPTY_ARRAY) {
                this.LIZ.write(44);
                return;
            }
            if (c08sgLIZLLL != C08SG.DANGLING_KEY) {
                if (c08sgLIZLLL != C08SG.NULL) {
                    throw new JSONException("Nesting problem");
                }
            } else {
                this.LIZ.write(":");
                C08SG c08sg2 = C08SG.NONEMPTY_OBJECT;
                ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, c08sg2);
            }
        }
    }

    public final C08SG LIZLLL() {
        return (C08SG) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
    }

    public C08SF(Writer writer) {
        this.LIZ = writer;
    }

    public final void LIZ(JSONArray jSONArray) throws JSONException, IOException {
        C08SG c08sg = C08SG.EMPTY_ARRAY;
        LIZIZ();
        ((ArrayList) this.LIZIZ).add(c08sg);
        this.LIZ.write(e3.e);
        for (int i = 0; i < jSONArray.length(); i++) {
            LJFF(jSONArray.get(i));
        }
        LIZLLL();
        ListProtector.remove(this.LIZIZ, ((ArrayList) r1).size() - 1);
        this.LIZ.write(e3.f);
    }

    public final void LIZJ(JSONObject jSONObject) throws JSONException, IOException {
        C08SG c08sg = C08SG.EMPTY_OBJECT;
        LIZIZ();
        ((ArrayList) this.LIZIZ).add(c08sg);
        this.LIZ.write("{");
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            C08SG c08sgLIZLLL = LIZLLL();
            if (c08sgLIZLLL == C08SG.NONEMPTY_OBJECT) {
                this.LIZ.write(44);
            } else if (c08sgLIZLLL != C08SG.EMPTY_OBJECT) {
                throw new JSONException("Nesting problem");
            }
            C08SG c08sg2 = C08SG.DANGLING_KEY;
            ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, c08sg2);
            LJ(next);
            LJFF(obj);
        }
        LIZLLL();
        ListProtector.remove(this.LIZIZ, ((ArrayList) r1).size() - 1);
        this.LIZ.write("}");
    }

    public final void LJ(String str) throws IOException {
        this.LIZ.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\f') {
                if (cCharAt != '\r') {
                    if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                this.LIZ.write("\\b");
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                this.LIZ.write("\\t");
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                this.LIZ.write("\\n");
                                break;
                            default:
                                if (cCharAt <= 31) {
                                    this.LIZ.write(C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(cCharAt)}));
                                } else {
                                    this.LIZ.write(cCharAt);
                                }
                                break;
                        }
                    } else {
                        this.LIZ.write(92);
                        this.LIZ.write(cCharAt);
                    }
                } else {
                    this.LIZ.write("\\r");
                }
            } else {
                this.LIZ.write("\\f");
            }
        }
        this.LIZ.write("\"");
    }

    public final void LJFF(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            LIZ((JSONArray) obj);
            return;
        }
        if (obj instanceof JSONObject) {
            LIZJ((JSONObject) obj);
            return;
        }
        LIZIZ();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.LIZ.write(String.valueOf(obj));
                return;
            } else if (obj instanceof Number) {
                this.LIZ.write(JSONObject.numberToString((Number) obj));
                return;
            } else {
                LJ(obj.toString());
                return;
            }
        }
        this.LIZ.write("null");
    }
}
