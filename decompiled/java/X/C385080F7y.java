package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0F7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385080F7y implements Serializable {
    public static final int $stable = 8;
    public transient boolean b;
    public transient Pair<String, String> font;
    public transient List<Float> outlineColor;
    public transient float outlineWidth;
    public transient List<Float> shadowColor;
    public transient List<Float> shadowOffset;
    public transient float shadowSmooth;
    public transient float sizePt;
    public transient List<Float> textColor;
    public transient String textStr;

    public C385080F7y() {
        this("", null, null, 48.0f, false, 0.0f, null, null, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.2f);
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
        if (this.sizePt > 0.0f) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('<');
            sbLIZ2.append("size");
            sbLIZ2.append('=');
            sbLIZ2.append(this.sizePt);
            sbLIZ2.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            arrayList.add("size");
        }
        if (this.b) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append('<');
            sbLIZ3.append("b");
            sbLIZ3.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            arrayList.add("b");
        }
        List<Float> list = this.textColor;
        if (list != null) {
            LIZ(list);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append('<');
            sbLIZ4.append("color");
            sbLIZ4.append('=');
            sbLIZ4.append(LIZ(list));
            sbLIZ4.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            arrayList.add("color");
        }
        List<Float> list2 = this.outlineColor;
        if (list2 != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append('<');
            sbLIZ5.append("outline");
            sbLIZ5.append(" color=");
            sbLIZ5.append(LIZ(list2));
            sbLIZ5.append(" width=");
            sbLIZ5.append(this.outlineWidth);
            sbLIZ5.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            arrayList.add("outline");
        }
        List<Float> list3 = this.shadowColor;
        if (list3 != null) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(strLIZIZ);
            sbLIZ6.append('<');
            sbLIZ6.append("shadow");
            sbLIZ6.append(" color=");
            sbLIZ6.append(LIZ(list3));
            sbLIZ6.append(" offset=");
            sbLIZ6.append(LIZ(this.shadowOffset));
            sbLIZ6.append(" smooth=");
            sbLIZ6.append(this.shadowSmooth);
            sbLIZ6.append('>');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            arrayList.add("shadow");
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append(strLIZIZ);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append('[');
        sbLIZ8.append(u.LJJIFFI(this.textStr, e3.f, "]]", false));
        sbLIZ8.append(']');
        sbLIZ7.append(C2188811AlT.LIZIZ(sbLIZ8));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
        Collections.reverse(arrayList);
        for (String str : arrayList) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(strLIZIZ2);
            sbLIZ9.append("</");
            sbLIZ9.append(str);
            sbLIZ9.append('>');
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ9);
        }
        return strLIZIZ2;
    }

    public static String LIZ(List list) {
        return C13LP.LJJLIIIJ(list, ", ", e3.h, ")", 0, null, null, 56);
    }

    public static List LIZIZ(String str) {
        String strLJJLIL = a0.LJJLIL(str, e3.h, str);
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJJZ(strLJJLIL, ")", strLJJLIL), new String[]{", "}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(CastFloatProtector.parseFloat((String) it2.next())));
        }
        return arrayList;
    }

    public final void fromLabelStr(String str) {
        String strLJJZ = a0.LJJZ(str, "]</", str);
        this.textStr = u.LJJIFFI(a0.LJJLJLI(strLJJZ, ">[", strLJJZ), "]]", e3.f, false);
        for (String str2 : C09RB.LJJII(new C08LY(Regex.findAll$default(new Regex("<(?!/)([^>]+)>"), str, 0, 2, null), AFwS234S0000000_5.get$arr$(592)))) {
            if (u.LJJIIJZLJL(str2, "font", false)) {
                String strLJJLIL = a0.LJJLIL(str2, "id=\"", str2);
                String strLJJZ2 = a0.LJJZ(strLJJLIL, "\"", strLJJLIL);
                String strLJJLIL2 = a0.LJJLIL(str2, "path=\"", str2);
                this.font = new Pair<>(strLJJZ2, a0.LJJZ(strLJJLIL2, "\"", strLJJLIL2));
            } else if (u.LJJIIJZLJL(str2, "size", false)) {
                this.sizePt = CastFloatProtector.parseFloat(a0.LJJLIL(str2, "size=", str2));
            } else if (u.LJJIIJZLJL(str2, "color", false)) {
                this.textColor = LIZIZ(a0.LJJLIL(str2, "color=", str2));
            } else if (u.LJJIIJZLJL(str2, "outline", false)) {
                String strLJJLIL3 = a0.LJJLIL(str2, "outline color=", str2);
                this.outlineColor = LIZIZ(a0.LJJZ(strLJJLIL3, "width", strLJJLIL3));
                this.outlineWidth = CastFloatProtector.parseFloat(a0.LJJLIL(str2, "width=", str2));
            } else if (u.LJJIIJZLJL(str2, "shadow", false)) {
                String strLJJLIL4 = a0.LJJLIL(str2, "shadow color=", str2);
                this.shadowColor = LIZIZ(a0.LJJZ(strLJJLIL4, "offset", strLJJLIL4));
                String strLJJLIL5 = a0.LJJLIL(str2, "offset", str2);
                this.shadowOffset = LIZIZ(a0.LJJZ(strLJJLIL5, "smooth", strLJJLIL5));
                this.shadowSmooth = CastFloatProtector.parseFloat(a0.LJJLIL(str2, "smooth=", str2));
            }
        }
    }

    public final void setB(boolean z) {
        this.b = z;
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

    public C385080F7y(String str, Pair<String, String> pair, List<Float> list, float f, boolean z, float f2, List<Float> list2, List<Float> list3, List<Float> list4, float f3) {
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
    }
}
