package X;

import android.graphics.Color;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.RichTextContent;
import com.bytedance.android.livesdk.model.RichTextStyle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C232900v9 extends AbstractC233200vC {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.00vB] */
    public static int LIZIZ(Board board) {
        Integer numValueOf;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        String str;
        List<BoardItem> list = board.boardItemList;
        ArrayList arrayList = new ArrayList();
        for (BoardItem boardItem : list) {
            if (boardItem.boardItemType == 5) {
                arrayList.add(boardItem);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RichTextContent richTextContent = ((BoardItem) it2.next()).richTextContent;
            if (richTextContent != null) {
                for (C229100uX c229100uX : new C049900Gb(richTextContent).LIZ().LIZ) {
                    Iterator<C050000Gc> it3 = c229100uX.LIZIZ.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZ.getClass();
                    }
                    Iterator<C050000Gc> it4 = c229100uX.LIZIZ.iterator();
                    int length = 0;
                    while (it4.hasNext()) {
                        length += it4.next().LIZ.length();
                    }
                    RichTextStyle richTextStyle = c229100uX.LJ;
                    arrayList2.add(new C443120HZe(richTextStyle.color, Integer.valueOf(richTextStyle.fontSize), Integer.valueOf(length)));
                }
            }
        }
        final ?? r1 = new Comparator() { // from class: X.00vB
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ((Comparable) ((C443120HZe) t2).getSecond(), (Comparable) ((C443120HZe) t).getSecond());
            }
        };
        C443120HZe c443120HZe = (C443120HZe) C13LP.LJJLJLI(new Comparator() { // from class: X.00vA
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = r1.compare(t, t2);
                if (iCompare == 0) {
                    return C20085613iQ.LIZIZ((Comparable) ((C443120HZe) t2).getThird(), (Comparable) ((C443120HZe) t).getThird());
                }
                return iCompare;
            }
        }, arrayList2);
        if (c443120HZe != null && (str = (String) c443120HZe.getFirst()) != null) {
            numValueOf = Integer.valueOf(C202500qF.LIZJ(-1, str));
        } else {
            numValueOf = null;
        }
        if (!arrayList.isEmpty() && numValueOf != null) {
            float[] fArr = new float[3];
            Color.colorToHSV(numValueOf.intValue(), fArr);
            return LIZJ(Color.HSVToColor(new float[]{fArr[0], C13LZ.LIZLLL(0.1f, 0.0f, 1.0f), C13LZ.LIZLLL(0.55f, 0.0f, 1.0f)}), Color.argb(C814420VxA.LIZIZ(102.0f), 0, 0, 0));
        }
        String strLJJJJZ = a0.LJJJJZ("#", "#8C8C8C");
        if (strLJJJJZ.length() != 6 && strLJJJJZ.length() != 8) {
            "Color hex must be 6 or 8 chars".toString();
            throw new IllegalArgumentException("Color hex must be 6 or 8 chars");
        }
        if (strLJJJJZ.length() == 6) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FF");
            sbLIZ.append(strLJJJJZ);
            strLJJJJZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        Integer numLJIIJ = C2095008Iq.LJIIJ(16, strLJJJJZ.substring(0, 2));
        if (numLJIIJ != null) {
            iIntValue = numLJIIJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLJIIJ2 = C2095008Iq.LJIIJ(16, strLJJJJZ.substring(2, 4));
        if (numLJIIJ2 != null) {
            iIntValue2 = numLJIIJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numLJIIJ3 = C2095008Iq.LJIIJ(16, strLJJJJZ.substring(4, 6));
        if (numLJIIJ3 != null) {
            iIntValue3 = numLJIIJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        Integer numLJIIJ4 = C2095008Iq.LJIIJ(16, strLJJJJZ.substring(6, 8));
        if (numLJIIJ4 != null) {
            iIntValue4 = numLJIIJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        return LIZJ(Color.argb(iIntValue, iIntValue2, iIntValue3, iIntValue4), Color.argb(C814420VxA.LIZIZ(102.0f), 0, 0, 0));
    }

    public static int LIZJ(int i, int i2) {
        float fAlpha = Color.alpha(i) / 255.0f;
        float fRed = Color.red(i);
        float fGreen = Color.green(i);
        float fBlue = Color.blue(i);
        float fAlpha2 = Color.alpha(i2) / 255.0f;
        float f = 1 - fAlpha2;
        return Color.argb(C13LZ.LJ(C814420VxA.LIZIZ(((fAlpha * f) + fAlpha2) * 255.0f), 0, 255), C13LZ.LJ(C814420VxA.LIZIZ((Color.red(i2) * fAlpha2) + (fRed * f)), 0, 255), C13LZ.LJ(C814420VxA.LIZIZ((Color.green(i2) * fAlpha2) + (fGreen * f)), 0, 255), C13LZ.LJ(C814420VxA.LIZIZ((Color.blue(i2) * fAlpha2) + (fBlue * f)), 0, 255));
    }

    @Override // X.AbstractC233200vC
    public final Object LIZ(C1816270xMf c1816270xMf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Board board = c1816270xMf.LIZIZ;
        if (board.version == 2) {
            String strLIZLLL = C202500qF.LIZLLL(LIZIZ(board));
            if (strLIZLLL == null) {
                strLIZLLL = "#8C8C8C";
            }
            board.previewBgColor = strLIZLLL;
        }
        AbstractC233200vC abstractC233200vC = this.LIZ;
        if (abstractC233200vC != null) {
            Object objLIZ = abstractC233200vC.LIZ(c1816270xMf, interfaceC1364105Vn);
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
