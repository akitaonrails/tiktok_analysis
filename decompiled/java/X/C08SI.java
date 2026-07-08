package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08SI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SI {
    public static final byte[] LIZJ;
    public static final byte[] LIZLLL;
    public static final byte[] LJ;
    public final C793720VBq LIZ;
    public final List<C08SH> LIZIZ = new ArrayList();

    static {
        try {
            LIZJ = "null".getBytes("UTF-8");
            LIZLLL = "true".getBytes("UTF-8");
            LJ = "false".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final void LIZ() throws JSONException {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        C08SH c08shLIZLLL = LIZLLL();
        if (c08shLIZLLL == C08SH.EMPTY_ARRAY) {
            C08SH c08sh = C08SH.NONEMPTY_ARRAY;
            ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, c08sh);
        } else {
            if (c08shLIZLLL == C08SH.NONEMPTY_ARRAY) {
                this.LIZ.write(44);
                return;
            }
            if (c08shLIZLLL != C08SH.DANGLING_KEY) {
                if (c08shLIZLLL != C08SH.NULL) {
                    throw new JSONException("Nesting problem");
                }
            } else {
                this.LIZ.write(58);
                C08SH c08sh2 = C08SH.NONEMPTY_OBJECT;
                ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, c08sh2);
            }
        }
    }

    public final C08SH LIZLLL() throws JSONException {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            throw new JSONException("Nesting problem");
        }
        return (C08SH) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
    }

    public final String toString() {
        C793720VBq c793720VBq = this.LIZ;
        return c793720VBq.LLILLJJLI == 0 ? "" : c793720VBq.toString();
    }

    public C08SI(C793720VBq c793720VBq) {
        this.LIZ = c793720VBq;
    }

    public final void LJ(String str) throws IOException {
        this.LIZ.write(34);
        int length = str.length();
        int length2 = str.length();
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\f') {
                if (cCharAt != '\r') {
                    if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                this.LIZ.write(92);
                                this.LIZ.write(98);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                this.LIZ.write(92);
                                this.LIZ.write(116);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                this.LIZ.write(92);
                                this.LIZ.write(110);
                                break;
                            default:
                                if (cCharAt <= 31) {
                                    this.LIZ.write(C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(cCharAt)}).getBytes("UTF-8"));
                                } else if (cCharAt < 128) {
                                    this.LIZ.write((byte) cCharAt);
                                } else if (cCharAt < 2048) {
                                    this.LIZ.write((byte) ((cCharAt >> 6) | 192));
                                    this.LIZ.write((byte) ((cCharAt & '?') | 128));
                                } else if (Character.isHighSurrogate(cCharAt)) {
                                    if (length - i >= 2) {
                                        i++;
                                        char cCharAt2 = str.charAt(i);
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                                            this.LIZ.write((byte) ((codePoint >> 18) | 240));
                                            this.LIZ.write((byte) (((codePoint >> 12) & 63) | 128));
                                            this.LIZ.write((byte) (((codePoint >> 6) & 63) | 128));
                                            this.LIZ.write((byte) ((codePoint & 63) | 128));
                                        } else {
                                            throw new RuntimeException("malformed");
                                        }
                                    } else {
                                        throw new RuntimeException("overflow");
                                    }
                                } else if (!Character.isLowSurrogate(cCharAt)) {
                                    this.LIZ.write((byte) ((cCharAt >> '\f') | 224));
                                    this.LIZ.write((byte) (((cCharAt >> 6) & 63) | 128));
                                    this.LIZ.write((byte) ((cCharAt & '?') | 128));
                                } else {
                                    throw new RuntimeException("malformed");
                                }
                                break;
                        }
                    } else {
                        this.LIZ.write(92);
                        this.LIZ.write(cCharAt);
                    }
                } else {
                    this.LIZ.write(92);
                    this.LIZ.write(114);
                }
            } else {
                this.LIZ.write(92);
                this.LIZ.write(102);
            }
            i++;
        }
        this.LIZ.write(34);
    }

    public final void LJFF(Object obj) throws JSONException, IOException {
        if (!((ArrayList) this.LIZIZ).isEmpty()) {
            int i = 0;
            if (obj instanceof JSONArray) {
                LIZJ(C08SH.EMPTY_ARRAY, '[');
                while (true) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (i < jSONArray.length()) {
                        LJFF(jSONArray.get(i));
                        i++;
                    } else {
                        LIZIZ(C08SH.EMPTY_ARRAY, C08SH.NONEMPTY_ARRAY, ']');
                        return;
                    }
                }
            } else {
                if (obj instanceof JSONObject) {
                    LJI((JSONObject) obj);
                    return;
                }
                LIZ();
                if (obj != null && obj != JSONObject.NULL) {
                    if (obj instanceof Boolean) {
                        if (((Boolean) obj).booleanValue()) {
                            this.LIZ.write(LIZLLL);
                            return;
                        } else {
                            this.LIZ.write(LJ);
                            return;
                        }
                    }
                    if (obj instanceof Number) {
                        String strNumberToString = JSONObject.numberToString((Number) obj);
                        int length = strNumberToString.length();
                        while (i < length) {
                            this.LIZ.write(strNumberToString.charAt(i));
                            i++;
                        }
                        return;
                    }
                    LJ(obj.toString());
                    return;
                }
                this.LIZ.write(LIZJ);
            }
        } else {
            throw new JSONException("Nesting problem");
        }
    }

    public final C08SI LJI(JSONObject jSONObject) {
        LIZJ(C08SH.EMPTY_OBJECT, '{');
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                C08SH c08shLIZLLL = LIZLLL();
                if (c08shLIZLLL == C08SH.NONEMPTY_OBJECT) {
                    this.LIZ.write(44);
                } else if (c08shLIZLLL != C08SH.EMPTY_OBJECT) {
                    throw new JSONException("Nesting problem");
                }
                C08SH c08sh = C08SH.DANGLING_KEY;
                ListProtector.set(this.LIZIZ, ((ArrayList) r1).size() - 1, c08sh);
                LJ(next);
                LJFF(jSONObject.get(next));
            } else {
                throw new JSONException("Names must be non-null");
            }
        }
        LIZIZ(C08SH.EMPTY_OBJECT, C08SH.NONEMPTY_OBJECT, '}');
        return this;
    }

    public final void LIZJ(C08SH c08sh, char c) throws JSONException {
        if (((ArrayList) this.LIZIZ).isEmpty() && this.LIZ.LLILLJJLI > 0) {
            throw new JSONException("Nesting problem: multiple top-level roots");
        }
        LIZ();
        ((ArrayList) this.LIZIZ).add(c08sh);
        this.LIZ.write(c);
    }

    public final void LIZIZ(C08SH c08sh, C08SH c08sh2, char c) throws JSONException {
        C08SH c08shLIZLLL = LIZLLL();
        if (c08shLIZLLL != c08sh2 && c08shLIZLLL != c08sh) {
            throw new JSONException("Nesting problem");
        }
        ListProtector.remove(this.LIZIZ, ((ArrayList) r1).size() - 1);
        this.LIZ.write(c);
    }
}
