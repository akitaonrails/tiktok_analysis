package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import webcast.api.profit.Icon;
import webcast.api.profit.LinkGroupItem;
import webcast.api.profit.TemplateButton;
import webcast.api.profit.TemplatePlaceholder;
import webcast.api.profit.TemplateStyle;
import webcast.api.profit.TemplateText;
import webcast.api.profit.Text;

/* JADX INFO: renamed from: X.0x8L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807390x8L {
    public static C1807450x8R LIZ(TemplateStyle templateStyle) {
        if (templateStyle == null) {
            return new C1807450x8R(null, null, null, null, 15);
        }
        return new C1807450x8R(Integer.valueOf(LIZJ(templateStyle.font)), LIZIZ(templateStyle.color), LIZIZ(templateStyle.bgColor), null, 8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer LIZIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -979063018) {
            switch (iHashCode) {
                case -438473631:
                    if (!str.equals("tux_ui_text1")) {
                        return null;
                    }
                    return Integer.valueOf(R.attr.ewy);
                case -438473630:
                    if (!str.equals("tux_ui_text2")) {
                        return null;
                    }
                    return Integer.valueOf(R.attr.ex3);
                case -438473629:
                    if (!str.equals("tux_ui_text3")) {
                        return null;
                    }
                    return Integer.valueOf(R.attr.ex7);
                default:
                    return null;
            }
        }
        if (!str.equals("tux_ui_text_primary_display")) {
            return null;
        }
        return Integer.valueOf(R.attr.eu5);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZJ(String str) {
        switch (str.hashCode()) {
            case 244089630:
                str.equals("p1_regular");
                return 51;
            case 487035375:
                if (!str.equals("p3_semibold")) {
                    return 51;
                }
                return 72;
            case 683548880:
                if (!str.equals("p2_semibold")) {
                    return 51;
                }
                return 62;
            case 924148000:
                if (!str.equals("p3_regular")) {
                    return 51;
                }
                return 71;
            case 1977744359:
                if (!str.equals("h3_semibold")) {
                    return 51;
                }
                return 32;
            default:
                return 51;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0x8G] */
    public final C1807340x8G LIZLLL(TemplateButton templateButton) {
        TemplateText templateText = new TemplateText();
        templateText.template = templateButton.template;
        templateText.placeholders = templateButton.placeholders;
        AFwS216S0000000_27 aFwS216S0000000_27 = AFwS216S0000000_27.get$arr$(71);
        getClass();
        final C1807410x8N c1807410x8NLJ = LJ(templateText, null, aFwS216S0000000_27);
        final C1807450x8R c1807450x8RLIZ = LIZ(templateButton.style);
        Iterator<LinkGroupItem> it2 = templateButton.links.iterator();
        while (it2.hasNext() && it2.next().entrance != 2) {
        }
        return new InterfaceC1806620x76(c1807410x8NLJ, c1807450x8RLIZ) { // from class: X.0x8G
            public final InterfaceC1806470x6r LIZ;
            public final C1807450x8R LIZIZ;

            @Override // X.InterfaceC1806620x76
            public final Integer getBackgroundColor() {
                return this.LIZIZ.LIZJ;
            }

            @Override // X.InterfaceC1806470x6r
            public final CharSequence LIZIZ(Context context) {
                return this.LIZ.LIZIZ(context);
            }

            {
                this.LIZ = c1807410x8NLJ;
                this.LIZIZ = c1807450x8RLIZ;
            }
        };
    }

    public static C1807410x8N LJ(TemplateText templateText, Function0 function0, Function0 function02) {
        Integer numValueOf;
        Integer numValueOf2;
        StringBuilder sb = new StringBuilder(templateText.template);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TemplatePlaceholder> entry : templateText.placeholders.entrySet()) {
            String str = templateText.template;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            sbLIZ.append(entry.getKey());
            sbLIZ.append('}');
            int iLJJJ = a0.LJJJ(str, C2188811AlT.LIZIZ(sbLIZ), 0, false, 6);
            if (iLJJJ >= 0) {
                linkedHashMap.put(entry.getKey(), Integer.valueOf(iLJJJ));
            }
        }
        ArrayList<Map.Entry> arrayList3 = new ArrayList();
        arrayList3.addAll(linkedHashMap.entrySet());
        C08XD.LJJ(arrayList3, new Comparator() { // from class: X.00td
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) ((Map.Entry) obj).getValue()).intValue() - ((Number) ((Map.Entry) obj2).getValue()).intValue();
            }
        });
        for (Map.Entry entry2 : arrayList3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('{');
            sbLIZ2.append((String) entry2.getKey());
            sbLIZ2.append('}');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            TemplatePlaceholder templatePlaceholder = templateText.placeholders.get(entry2.getKey());
            String str2 = null;
            if (templatePlaceholder != null && (numValueOf = Integer.valueOf(templatePlaceholder.type)) != null) {
                if (numValueOf.intValue() == 1) {
                    Text text = templatePlaceholder.text;
                    if (text != null) {
                        str2 = text.value;
                    }
                    LJI(str2, sb, templatePlaceholder, strLIZIZ, arrayList, arrayList2);
                } else if (numValueOf.intValue() == 2) {
                    Icon icon = templatePlaceholder.icon;
                    if (icon != null) {
                        str2 = icon.id;
                    }
                    if (Intrinsics.LJFF(str2, "coin_icon") && (numValueOf2 = Integer.valueOf(R.drawable.el0)) != null) {
                        int iIndexOf = sb.indexOf(strLIZIZ);
                        arrayList.add(new C1807430x8P(iIndexOf, iIndexOf + 1, numValueOf2.intValue()));
                        sb.replace(iIndexOf, strLIZIZ.length() + iIndexOf, " ");
                    }
                } else if (numValueOf.intValue() == 3) {
                    if (function0 != null) {
                        str2 = (String) function0.invoke();
                    }
                    LJI(str2, sb, templatePlaceholder, strLIZIZ, arrayList, arrayList2);
                } else if (numValueOf.intValue() == 4) {
                    if (function02 != null) {
                        str2 = (String) function02.invoke();
                    }
                    LJI(str2, sb, templatePlaceholder, strLIZIZ, arrayList, arrayList2);
                }
            }
        }
        return new C1807410x8N(sb.toString(), LIZ(templateText.style), arrayList, arrayList2);
    }

    public static void LJI(String str, StringBuilder sb, TemplatePlaceholder templatePlaceholder, String str2, List list, List list2) {
        LinkGroupItem next;
        if (str == null) {
            return;
        }
        int iIndexOf = sb.indexOf(str2);
        Text text = templatePlaceholder.text;
        C1807450x8R c1807450x8R = null;
        String str3 = null;
        if (text != null) {
            Integer numValueOf = Integer.valueOf(LIZJ(text.font));
            Integer numLIZIZ = LIZIZ(text.color);
            Iterator<LinkGroupItem> it2 = text.links.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.entrance == 2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LinkGroupItem linkGroupItem = next;
            if (linkGroupItem != null) {
                str3 = linkGroupItem.url;
            }
            c1807450x8R = new C1807450x8R(numValueOf, numLIZIZ, null, str3, 4);
        }
        ((ArrayList) list).add(new C1807420x8O(iIndexOf, str.length() + iIndexOf, c1807450x8R));
        if (templatePlaceholder.animated) {
            ((ArrayList) list2).add(new IntRange(iIndexOf, str.length() + iIndexOf));
        }
        sb.replace(iIndexOf, str2.length() + iIndexOf, str);
    }
}
