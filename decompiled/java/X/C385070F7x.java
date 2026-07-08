package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0F7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385070F7x implements Serializable {
    public static final int $stable = 8;
    public transient boolean b;
    public transient List<Float> bgColor;
    public transient Pair<String, String> effectStyle;
    public transient Pair<String, String> font;
    public transient List<Float> outlineColor;
    public transient float outlineWidth;
    public transient List<Float> shadowColor;
    public transient List<Float> shadowOffset;
    public transient float shadowSmooth;
    public transient float sizePt;
    public transient List<Float> textColor;
    public transient String textStr;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C385070F7x() {
        float f = 0.0f;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, false, f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
    }

    public final C385070F7x copy(String str, Pair<String, String> pair, List<Float> list, float f, boolean z, float f2, List<Float> list2, List<Float> list3, List<Float> list4, float f3, Pair<String, String> pair2, List<Float> list5) {
        return new C385070F7x(str, pair, list, f, z, f2, list2, list3, list4, f3, pair2, list5);
    }

    public String toString() {
        return "NLERichText(textStr=" + this.textStr + ", font=" + this.font + ", textColor=" + this.textColor + ", sizePt=" + this.sizePt + ", b=" + this.b + ", outlineWidth=" + this.outlineWidth + ", outlineColor=" + this.outlineColor + ", shadowColor=" + this.shadowColor + ", shadowOffset=" + this.shadowOffset + ", shadowSmooth=" + this.shadowSmooth + ", effectStyle=" + this.effectStyle + ", bgColor=" + this.bgColor + ')';
    }

    public final String toLabelStr() {
        ArrayList<String> arrayList = new ArrayList();
        Pair<String, String> pair = this.font;
        String strLIZIZ = "";
        if (pair != null && pair.getFirst().length() > 0 && pair.getSecond().length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append('<');
            sbLIZ.append("font");
            sbLIZ.append(" id=\"");
            sbLIZ.append(pair.getFirst());
            sbLIZ.append("\" path=\"");
            sbLIZ.append(new C0VSJ(pair.getSecond()).getAbsolutePath());
            sbLIZ.append("\">");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            arrayList.add("font");
        }
        Pair<String, String> pair2 = this.effectStyle;
        if (pair2 != null && pair2.getFirst().length() > 0 && pair2.getSecond().length() > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('<');
            sbLIZ2.append("effectStyle");
            sbLIZ2.append(" id=\"");
            sbLIZ2.append(pair2.getFirst());
            sbLIZ2.append("\" path=\"");
            sbLIZ2.append(new C0VSJ(pair2.getSecond()).getAbsolutePath());
            sbLIZ2.append("\">");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            arrayList.add("effectStyle");
            if (!Intrinsics.LJFF(this.textColor, C0F9I.LIZ(-1))) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("<useLetterColor>");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                arrayList.add("useLetterColor");
            }
        }
        List<Float> list = this.bgColor;
        if (list != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append('<');
            sbLIZ4.append("bg");
            sbLIZ4.append(" color=");
            sbLIZ4.append(LIZ(list));
            sbLIZ4.append(" alpha=1.0>");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            arrayList.add("bg");
        }
        if (this.sizePt > 0.0f) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append('<');
            sbLIZ5.append("size");
            sbLIZ5.append('=');
            sbLIZ5.append(this.sizePt);
            sbLIZ5.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            arrayList.add("size");
        }
        if (this.b) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(strLIZIZ);
            sbLIZ6.append('<');
            sbLIZ6.append("b");
            sbLIZ6.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            arrayList.add("b");
        }
        List<Float> list2 = this.textColor;
        if (list2 != null) {
            LIZ(list2);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(strLIZIZ);
            sbLIZ7.append('<');
            sbLIZ7.append("color");
            sbLIZ7.append('=');
            sbLIZ7.append(LIZ(list2));
            sbLIZ7.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
            arrayList.add("color");
        }
        List<Float> list3 = this.outlineColor;
        if (list3 != null) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(strLIZIZ);
            sbLIZ8.append('<');
            sbLIZ8.append("outline");
            sbLIZ8.append(" color=");
            sbLIZ8.append(LIZ(list3));
            sbLIZ8.append(" width=");
            sbLIZ8.append(this.outlineWidth);
            sbLIZ8.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
            arrayList.add("outline");
        }
        List<Float> list4 = this.shadowColor;
        if (list4 != null) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(strLIZIZ);
            sbLIZ9.append('<');
            sbLIZ9.append("shadow");
            sbLIZ9.append(" color=");
            sbLIZ9.append(LIZ(list4));
            sbLIZ9.append(" offset=");
            sbLIZ9.append(LIZ(this.shadowOffset));
            sbLIZ9.append(" smooth=");
            sbLIZ9.append(this.shadowSmooth);
            sbLIZ9.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
            arrayList.add("shadow");
        }
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append(strLIZIZ);
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append('[');
        sbLIZ11.append(u.LJJIFFI(this.textStr, e3.f, "]]", false));
        sbLIZ11.append(']');
        sbLIZ10.append(C2188811AlT.LIZIZ(sbLIZ11));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ10);
        Collections.reverse(arrayList);
        for (String str : arrayList) {
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append(strLIZIZ2);
            sbLIZ12.append("</");
            sbLIZ12.append(str);
            sbLIZ12.append('>');
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ12);
        }
        return strLIZIZ2;
    }

    public static String LIZ(List list) {
        return C13LP.LJJLIIIJ(list, ", ", e3.h, ")", 0, null, null, 56);
    }

    public static List LIZIZ(String str) {
        ArrayList arrayList;
        if (((Boolean) C285980BIu.LIZ.getValue()).booleanValue()) {
            String strLJJLIL = a0.LJJLIL(str, e3.h, str);
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJJZ(strLJJLIL, ")", strLJJLIL), new String[]{","}, 0, 6);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(CastFloatProtector.parseFloat(a0.LJLIIIL((String) it2.next()).toString())));
            }
        } else {
            String strLJJLIL2 = a0.LJJLIL(str, e3.h, str);
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(a0.LJJZ(strLJJLIL2, ")", strLJJLIL2), new String[]{", "}, 0, 6);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
            Iterator it3 = listLJJLIIIJILLIZJL2.iterator();
            while (it3.hasNext()) {
                arrayList.add(Float.valueOf(CastFloatProtector.parseFloat((String) it3.next())));
            }
        }
        return arrayList;
    }

    public final void fromLabelStr(String str) {
        String strLJJZ = a0.LJJZ(str, "]</", str);
        this.textStr = u.LJJIFFI(a0.LJJLJLI(strLJJZ, ">[", strLJJZ), "]]", e3.f, false);
        for (String str2 : C09RB.LJJII(new C08LY(Regex.findAll$default(new Regex("<(?!/)([^>]+)>"), str, 0, 2, null), AFwS234S0000000_5.get$arr$(468)))) {
            if (u.LJJIIJZLJL(str2, "font", false)) {
                String strLJJLIL = a0.LJJLIL(str2, "id=\"", str2);
                String strLJJZ2 = a0.LJJZ(strLJJLIL, "\"", strLJJLIL);
                String strLJJLIL2 = a0.LJJLIL(str2, "path=\"", str2);
                this.font = new Pair<>(strLJJZ2, a0.LJJZ(strLJJLIL2, "\"", strLJJLIL2));
            } else if (u.LJJIIJZLJL(str2, "effectStyle", false)) {
                String strLJJLIL3 = a0.LJJLIL(str2, "id=\"", str2);
                String strLJJZ3 = a0.LJJZ(strLJJLIL3, "\"", strLJJLIL3);
                String strLJJLIL4 = a0.LJJLIL(str2, "path=\"", str2);
                this.effectStyle = new Pair<>(strLJJZ3, a0.LJJZ(strLJJLIL4, "\"", strLJJLIL4));
            } else if (u.LJJIIJZLJL(str2, "size", false)) {
                this.sizePt = CastFloatProtector.parseFloat(a0.LJJLIL(str2, "size=", str2));
            } else if (u.LJJIIJZLJL(str2, "color", false)) {
                this.textColor = LIZIZ(a0.LJJLIL(str2, "color=", str2));
            } else if (u.LJJIIJZLJL(str2, "outline", false)) {
                String strLJJLIL5 = a0.LJJLIL(str2, "outline color=", str2);
                this.outlineColor = LIZIZ(a0.LJJZ(strLJJLIL5, "width", strLJJLIL5));
                this.outlineWidth = CastFloatProtector.parseFloat(a0.LJJLIL(str2, "width=", str2));
            } else if (u.LJJIIJZLJL(str2, "shadow", false)) {
                String strLJJLIL6 = a0.LJJLIL(str2, "shadow color=", str2);
                this.shadowColor = LIZIZ(a0.LJJZ(strLJJLIL6, "offset", strLJJLIL6));
                String strLJJLIL7 = a0.LJJLIL(str2, "offset", str2);
                this.shadowOffset = LIZIZ(a0.LJJZ(strLJJLIL7, "smooth", strLJJLIL7));
                this.shadowSmooth = CastFloatProtector.parseFloat(a0.LJJLIL(str2, "smooth=", str2));
            } else if (u.LJJIIJZLJL(str2, "effectStyle", false)) {
                String strLJJLIL8 = a0.LJJLIL(str2, "id=\"", str2);
                String strLJJZ4 = a0.LJJZ(strLJJLIL8, "\"", strLJJLIL8);
                String strLJJLIL9 = a0.LJJLIL(str2, "path=\"", str2);
                this.effectStyle = new Pair<>(strLJJZ4, a0.LJJZ(strLJJLIL9, "\"", strLJJLIL9));
            } else if (u.LJJIIJZLJL(str2, "bg", false)) {
                this.bgColor = LIZIZ(a0.LJJLIL(str2, "bg=", str2));
            } else if (u.LJJIIJZLJL(str2, "b", false)) {
                this.b = true;
            }
        }
    }

    public final void setB(boolean z) {
        this.b = z;
    }

    public final void setBgColor(List<Float> list) {
        this.bgColor = list;
    }

    public final void setEffectStyle(Pair<String, String> pair) {
        this.effectStyle = pair;
    }

    public final void setFont(Pair<String, String> pair) {
        this.font = pair;
    }

    public final void setOutlineColor(List<Float> list) {
        this.outlineColor = list;
    }

    public final void setOutlineWidth(float f) {
        this.outlineWidth = f;
    }

    public final void setShadowColor(List<Float> list) {
        this.shadowColor = list;
    }

    public final void setShadowOffset(List<Float> list) {
        this.shadowOffset = list;
    }

    public final void setShadowSmooth(float f) {
        this.shadowSmooth = f;
    }

    public final void setSizePt(float f) {
        this.sizePt = f;
    }

    public final void setTextColor(List<Float> list) {
        this.textColor = list;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public C385070F7x(String str, Pair<String, String> pair, List<Float> list, float f, boolean z, float f2, List<Float> list2, List<Float> list3, List<Float> list4, float f3, Pair<String, String> pair2, List<Float> list5) {
        this.textStr = str;
        this.font = pair;
        this.textColor = list;
        this.sizePt = f;
        this.b = z;
        this.outlineWidth = f2;
        this.outlineColor = list2;
        this.shadowColor = list3;
        this.shadowOffset = list4;
        this.shadowSmooth = f3;
        this.effectStyle = pair2;
        this.bgColor = list5;
    }

    public /* synthetic */ C385070F7x(String str, Pair pair, List list, float f, boolean z, float f2, List list2, List list3, List list4, float f3, Pair pair2, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : pair, (i & 4) != 0 ? null : list, (i & 8) != 0 ? 48.0f : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0.0f : f2, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)) : list4, (i & 512) != 0 ? 0.2f : f3, (i & 1024) != 0 ? null : pair2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? list5 : null);
    }
}
