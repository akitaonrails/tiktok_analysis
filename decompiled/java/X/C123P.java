package X;

import Y.AComparatorS48S0000000_29;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.123P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123P {
    public static int LIZ;

    public static final TextStickerTextWrap LIZJ(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                linkedHashMap.put(new TextStickerString(str), new ArrayList());
            }
            TextStickerTextPair textStickerTextPair = new TextStickerTextPair(sb.toString(), new ArrayList());
            return new TextStickerTextWrap(linkedHashMap, textStickerTextPair, textStickerTextPair.first.length(), false, false);
        }
        HashMap map = new HashMap();
        TextStickerTextPair textStickerTextPair2 = new TextStickerTextPair("", new ArrayList());
        return new TextStickerTextWrap(map, textStickerTextPair2, textStickerTextPair2.first.length(), false, false);
    }

    public static final List<TextStickerTextWrap> LIZLLL(String str) {
        return C1697810uHb.LJ(LIZIZ(str, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5 A[Catch: Exception -> 0x0126, TryCatch #0 {Exception -> 0x0126, blocks: (B:17:0x004e, B:23:0x0078, B:25:0x0080, B:26:0x0086, B:28:0x008e, B:35:0x00a3, B:36:0x00ad, B:38:0x00d5, B:41:0x00db, B:43:0x00e5, B:50:0x00f3, B:51:0x00f6, B:22:0x0072), top: B:57:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3 A[Catch: Exception -> 0x0126, TryCatch #0 {Exception -> 0x0126, blocks: (B:17:0x004e, B:23:0x0078, B:25:0x0080, B:26:0x0086, B:28:0x008e, B:35:0x00a3, B:36:0x00ad, B:38:0x00d5, B:41:0x00db, B:43:0x00e5, B:50:0x00f3, B:51:0x00f6, B:22:0x0072), top: B:57:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> LJ(java.util.List<? extends com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r35) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123P.LJ(java.util.List):java.util.List");
    }

    public static final String LJFF(List<TextStickerTextWrap> list) {
        boolean z;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (TextStickerTextWrap textStickerTextWrap : list) {
            if (textStickerTextWrap.isValid()) {
                arrayList.add(textStickerTextWrap);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (arrayList.size() > 1) {
            int size = arrayList.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, i)).safeStrPair().first);
                    sb.append("\n");
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, arrayList.size() - 1)).safeStrPair().first);
        } else {
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, 0)).safeStrPair().first);
        }
        return sb.toString();
    }

    public static final List<InteractTextStructWrap> LJI(List<TextStickerTextWrap> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (TextStickerTextWrap textStickerTextWrap : list) {
                if (textStickerTextWrap.isValid()) {
                    arrayList.add(textStickerTextWrap);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    return ((TextStickerTextWrap) ListProtector.get(arrayList, 0)).safeStrPair().second;
                }
                int size = arrayList.size();
                for (int i = 1; i < size; i++) {
                    for (InteractTextStructWrap interactTextStructWrap : ((TextStickerTextWrap) ListProtector.get(arrayList, i)).safeStrPair().second) {
                        interactTextStructWrap.getRange().getStart();
                        interactTextStructWrap.getRange().getEnd();
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<TextStickerTextWrap> it2 = list.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().safeStrPair().second, arrayList2);
                }
                return arrayList2;
            }
            return new ArrayList();
        }
        return new ArrayList();
    }

    public static final TextStickerString[] LJII(List<TextStickerTextWrap> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (TextStickerTextWrap textStickerTextWrap : list) {
                if (a0.LJLIIIL(textStickerTextWrap.safeStrPair().first).toString().length() > 0) {
                    arrayList2.add(textStickerTextWrap);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(C13LP.LLIIII(((TextStickerTextWrap) it2.next()).getStrMap().keySet()));
            }
            return (TextStickerString[]) arrayList.toArray(new TextStickerString[0]);
        }
        return new TextStickerString[0];
    }

    public static final String LJIIIIZZ(List<TextStickerTextWrap> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator<TextStickerTextWrap> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getText());
        }
        return sb.toString();
    }

    public static final List<CreateAnchorInfo> LJIIJ(List<? extends InteractStickerStruct> list) {
        boolean z;
        TextStruct textStruct;
        List<CreateAnchorInfo> arrayList;
        ArrayList<CreateAnchorInfo> arrayList2 = new ArrayList();
        if (list == null) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<? extends InteractStickerStruct> it2 = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it2.hasNext()) {
                break;
            }
            InteractStickerStruct next = it2.next();
            if (next.getType() != 5) {
                z2 = false;
            }
            if (z2) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            try {
                textStruct = (TextStruct) C123O.LIZ().LJII(((InteractStickerStruct) it3.next()).getTextStruct(), TextStruct.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                textStruct = null;
            }
            if (textStruct == null || (arrayList = textStruct.getAnchors()) == null) {
                arrayList = new ArrayList<>();
            }
            C19719612Di.LJJI(arrayList, arrayList4);
        }
        arrayList2.addAll(arrayList4);
        for (CreateAnchorInfo createAnchorInfo : arrayList2) {
            String iconUrl = createAnchorInfo.getIconUrl();
            if (iconUrl != null && iconUrl.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                createAnchorInfo.setIconUrl("https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png");
                createAnchorInfo.setAddTime(0L);
            }
        }
        return arrayList2;
    }

    public static final boolean LJIIJJI(List<TextStickerTextWrap> list) {
        Iterator<TextStickerTextWrap> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextStickerTextWrap next = it2.next();
            if (a0.LJLIIIL(next.safeStrPair().first).toString().length() > 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJIILIIL(List<TextStickerTextWrap> list) {
        if (list == null) {
            return false;
        }
        Iterator<TextStickerTextWrap> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextStickerTextWrap next = it2.next();
            if (next.isValid()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final TextStickerTextWrap LIZ(C21410318qb c21410318qb, List list) {
        TextStickerString textStickerString;
        if (c21410318qb == null) {
            HashMap map = new HashMap();
            TextStickerTextPair textStickerTextPair = new TextStickerTextPair("", new ArrayList());
            return new TextStickerTextWrap(map, textStickerTextPair, textStickerTextPair.first.length(), false, false);
        }
        String string = c21410318qb.getText().toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int lineCount = c21410318qb.getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = c21410318qb.getLayout().getLineEnd(i);
            String strSubstring = string.substring(i2, lineEnd);
            if (strSubstring.length() > 1 && u.LJIIZILJ(strSubstring, "\n", false)) {
                textStickerString = new TextStickerString(strSubstring.substring(0, strSubstring.length() - 1));
            } else {
                textStickerString = new TextStickerString(strSubstring);
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) it2.next();
                    if (interactTextStructWrap.getRange().getStart() < lineEnd && interactTextStructWrap.getRange().getEnd() > i2) {
                        if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = new TextStickerTextUnderlineIndexRange(i2 - i2, lineEnd - i2);
                            CreateAnchorInfo struct = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange, struct.copy(struct.type, struct.keyword, struct.url, struct.language, struct.content, struct.iconUrl, struct.addTime, struct.extra, struct.thirdId, struct.time, struct.subtype, struct.canDelete, struct.display, struct.pluginInfo, struct.minisInfos, struct.isEditProp, struct.iconRawId)));
                        } else if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange2 = new TextStickerTextUnderlineIndexRange(i2 - i2, interactTextStructWrap.getRange().getEnd() - i2);
                            CreateAnchorInfo struct2 = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange2, struct2.copy(struct2.type, struct2.keyword, struct2.url, struct2.language, struct2.content, struct2.iconUrl, struct2.addTime, struct2.extra, struct2.thirdId, struct2.time, struct2.subtype, struct2.canDelete, struct2.display, struct2.pluginInfo, struct2.minisInfos, struct2.isEditProp, struct2.iconRawId)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange3 = new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, lineEnd - i2);
                            CreateAnchorInfo struct3 = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange3, struct3.copy(struct3.type, struct3.keyword, struct3.url, struct3.language, struct3.content, struct3.iconUrl, struct3.addTime, struct3.extra, struct3.thirdId, struct3.time, struct3.subtype, struct3.canDelete, struct3.display, struct3.pluginInfo, struct3.minisInfos, struct3.isEditProp, struct3.iconRawId)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange4 = new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, interactTextStructWrap.getRange().getEnd() - i2);
                            CreateAnchorInfo struct4 = interactTextStructWrap.getStruct();
                            arrayList.add(new InteractTextStructWrap(textStickerTextUnderlineIndexRange4, struct4.copy(struct4.type, struct4.keyword, struct4.url, struct4.language, struct4.content, struct4.iconUrl, struct4.addTime, struct4.extra, struct4.thirdId, struct4.time, struct4.subtype, struct4.canDelete, struct4.display, struct4.pluginInfo, struct4.minisInfos, struct4.isEditProp, struct4.iconRawId)));
                        }
                    }
                }
            }
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS48S0000000_29(1));
            }
            linkedHashMap.put(textStickerString, arrayList);
            c21410318qb.getLayout().getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                InteractTextStructWrap interactTextStructWrap2 = (InteractTextStructWrap) it3.next();
                arrayList2.add(interactTextStructWrap2.copy(interactTextStructWrap2.range, interactTextStructWrap2.struct));
            }
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(string, arrayList2), c21410318qb.getSelectionStart(), c21410318qb.hasFocus(), false);
    }

    public static final TextStickerTextWrap LIZIZ(String str, boolean z) {
        if (str != null && str.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(new TextStickerString(str), new ArrayList());
            TextStickerTextPair textStickerTextPair = new TextStickerTextPair(str, new ArrayList());
            return new TextStickerTextWrap(linkedHashMap, textStickerTextPair, textStickerTextPair.first.length(), false, z);
        }
        HashMap map = new HashMap();
        TextStickerTextPair textStickerTextPair2 = new TextStickerTextPair("", new ArrayList());
        return new TextStickerTextWrap(map, textStickerTextPair2, textStickerTextPair2.first.length(), false, false);
    }

    public static final boolean LJIIL(int i, List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((InteractTextStructWrap) next).isValid(i)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String[] LJIILJJIL(TextStickerData textStickerData, Context context) throws Throwable {
        String string;
        Layout layout;
        ArrayList arrayList = new ArrayList();
        C124Q c124q = new C124Q(context, null);
        c124q.setAligin(textStickerData.getAlign());
        c124q.LJIILJJIL(textStickerData.getBgMode(), textStickerData.getColor());
        c124q.setFontType(C0FI2.LJJI(textStickerData.getFontType()));
        c124q.LJIILL(0, textStickerData.getTextStr());
        c124q.setTextSize(textStickerData.getFontSize());
        c124q.setPadding((int) C11VU.LIZIZ(32.0f, context), (int) C11VU.LIZIZ(12.0f, context), (int) C11VU.LIZIZ(32.0f, context), (int) C11VU.LIZIZ(12.0f, context));
        c124q.measure(View.MeasureSpec.makeMeasureSpec(C14KQ.LJIIIZ(context), 1073741824), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        c124q.layout(0, 0, c124q.getMeasuredWidth(), c124q.getMeasuredHeight());
        Editable editableLLZILL = C2204961BRm.LLZILL(c124q, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLuzRHK438c1FGs/l0PGuJLoUrnORkxpfLzKTdA", null));
        if (editableLLZILL != null && (string = editableLLZILL.toString()) != null && (layout = c124q.getLayout()) != null) {
            int lineCount = layout.getLineCount();
            int i = 0;
            int i2 = 0;
            while (i < lineCount) {
                int lineEnd = layout.getLineEnd(i);
                arrayList.add(string.substring(i2, lineEnd));
                i++;
                i2 = lineEnd;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final Pair LJIILL(int i, String str, List list) {
        Object next;
        String strLIZIZ;
        if (list == null) {
            return new Pair(null, 0);
        }
        if (str == null) {
            return new Pair(null, 0);
        }
        if (i >= 0 && i < str.length()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) next;
                    if (i > interactTextStructWrap.getRange().getStart() && i < interactTextStructWrap.getRange().getEnd()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InteractTextStructWrap interactTextStructWrap2 = (InteractTextStructWrap) next;
            if (interactTextStructWrap2 != null && interactTextStructWrap2.getRange().isValid(str.length())) {
                if (interactTextStructWrap2.getRange().getStart() == 0 && interactTextStructWrap2.getRange().getEnd() == str.length()) {
                    strLIZIZ = "";
                } else if (interactTextStructWrap2.getRange().getStart() == 0) {
                    strLIZIZ = str.substring(interactTextStructWrap2.getRange().getEnd(), str.length());
                } else if (interactTextStructWrap2.getRange().getEnd() == str.length()) {
                    strLIZIZ = str.substring(0, interactTextStructWrap2.getRange().getStart());
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str.substring(0, interactTextStructWrap2.getRange().getStart()));
                    sbLIZ.append(str.substring(interactTextStructWrap2.getRange().getEnd(), str.length()));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (list.remove(interactTextStructWrap2)) {
                    int end = interactTextStructWrap2.getRange().getEnd() - interactTextStructWrap2.getRange().getStart();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        InteractTextStructWrap interactTextStructWrap3 = (InteractTextStructWrap) it3.next();
                        if (interactTextStructWrap3.getRange().getStart() >= interactTextStructWrap2.getRange().getEnd()) {
                            TextStickerTextUnderlineIndexRange range = interactTextStructWrap3.getRange();
                            range.setStart(range.getStart() - end);
                            TextStickerTextUnderlineIndexRange range2 = interactTextStructWrap3.getRange();
                            range2.setEnd(range2.getEnd() - end);
                        }
                    }
                }
                return new Pair(strLIZIZ, Integer.valueOf(interactTextStructWrap2.getRange().getStart()));
            }
            return new Pair(null, 0);
        }
        return new Pair(null, 0);
    }

    public static final void LJIILLIIL(int i, int i2, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InteractTextStructWrap interactTextStructWrap = (InteractTextStructWrap) it2.next();
                if (interactTextStructWrap.getRange().getStart() >= i && i2 != 0) {
                    TextStickerTextUnderlineIndexRange range = interactTextStructWrap.getRange();
                    range.setStart(range.getStart() + i2);
                    TextStickerTextUnderlineIndexRange range2 = interactTextStructWrap.getRange();
                    range2.setEnd(range2.getEnd() + i2);
                }
            }
        }
    }

    public static final int LJIIIZ(Paint paint, String str, int i, int i2) {
        if (str == null || str.length() == 0 || i < 0 || i2 > str.length() || i >= i2) {
            return 0;
        }
        String strSubstring = str.substring(i, i2);
        int length = strSubstring.length();
        paint.getTextWidths(strSubstring, new float[length]);
        int iCeil = 0;
        for (int i3 = 0; i3 < length; i3++) {
            iCeil += (int) Math.ceil(r4[i3]);
        }
        return iCeil;
    }
}
