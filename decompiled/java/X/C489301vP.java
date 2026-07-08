package X;

import android.text.TextPaint;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01vP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C489301vP extends C2217421BqW implements InterfaceC1631620sYq<String, TextPaint, Integer, Pair<? extends String, ? extends Integer>> {
    public C489301vP(C489401vQ c489401vQ) {
        super(3, c489401vQ, C489401vQ.class, "splitIntoTwoLinesSmartly", "splitIntoTwoLinesSmartly(Ljava/lang/String;Landroid/text/TextPaint;I)Lkotlin/Pair;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Pair<? extends String, ? extends Integer> invoke(String str, TextPaint textPaint, Integer num) {
        String str2 = str;
        TextPaint textPaint2 = textPaint;
        int iIntValue = num.intValue();
        this.receiver.getClass();
        List<String> listSplit = new Regex("\\s+").split(a0.LJLIIIL(str2).toString(), 0);
        int iMeasureText = (int) textPaint2.measureText(str2);
        if (listSplit.size() <= 1) {
            return new Pair<>(str2, Integer.valueOf(iMeasureText));
        }
        int size = listSplit.size();
        float fMeasureText = 0.0f;
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) ListProtector.get(listSplit, i2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append(' ');
            fMeasureText += textPaint2.measureText(C2188811AlT.LIZIZ(sbLIZ));
            if (fMeasureText > iIntValue) {
                break;
            }
            i = i2;
        }
        if (i >= 0 && i < listSplit.size() - 1) {
            int i3 = i + 1;
            String strLJJLIIIJ = C13LP.LJJLIIIJ(listSplit.subList(0, i3), " ", null, null, 0, null, null, 62);
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(listSplit.subList(i3, listSplit.size()), " ", null, null, 0, null, null, 62);
            int iMeasureText2 = (int) textPaint2.measureText(strLJJLIIIJ);
            int iMeasureText3 = (int) textPaint2.measureText(strLJJLIIIJ2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJJLIIIJ);
            sbLIZ2.append('\n');
            sbLIZ2.append(strLJJLIIIJ2);
            return new Pair<>(C2188811AlT.LIZIZ(sbLIZ2), Integer.valueOf(Math.max(iMeasureText2, iMeasureText3)));
        }
        return new Pair<>(str2, Integer.valueOf(iMeasureText));
    }
}
