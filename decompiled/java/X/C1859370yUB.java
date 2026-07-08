package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859370yUB extends C1860130yVP {
    public final C1859410yUF LLJJJJLIIL;
    public final C1859380yUC LLJJL;
    public Message LLJJLIIIJLLLLLLLZ;

    public C1859370yUB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJJJJL() {
        int length;
        C1859380yUC c1859380yUC = this.LLJJL;
        CharSequence text = getText();
        c1859380yUC.getClass();
        if (text.length() > 0) {
            if (c1859380yUC.LIZJ.length() <= 0 || (length = c1859380yUC.LIZJ.length() - c1859380yUC.LIZLLL.length()) < 0) {
                length = 0;
            }
            c1859380yUC.LJFF = this;
            c1859380yUC.LIZJ = text;
            c1859380yUC.LIZLLL = "";
            if (length == 0) {
                c1859380yUC.LJ.put(0, 0);
            } else if (text.length() > length) {
                c1859380yUC.LJ.put(Integer.valueOf(length), 0);
            }
            if (c1859380yUC.LJ.isEmpty()) {
                return;
            }
            c1859380yUC.LIZ();
            AnonymousClass0956 anonymousClass0956 = c1859380yUC.LJI;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                c1859380yUC.LJI = C23250099c.LIZLLL(c1859380yUC.LIZIZ, null, null, new C479201tm(c1859380yUC, null), 3);
            }
        }
    }

    @Override // X.C1860130yVP
    public final void LJJJJI() {
        String str;
        String str2;
        super.LJJJJI();
        C1859380yUC c1859380yUC = this.LLJJL;
        AnonymousClass0956 anonymousClass0956 = c1859380yUC.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1859380yUC.LJI = null;
        ((LinkedHashMap) c1859380yUC.LJ).clear();
        c1859380yUC.LJFF = null;
        String str3 = "";
        c1859380yUC.LIZJ = "";
        c1859380yUC.LIZLLL = "";
        C01GW c01gw = C0DR3.LIZ;
        Message message = this.LLJJLIIIJLLLLLLLZ;
        if (message == null || (str = message.uuid) == null) {
            str = "";
        }
        Set setKeySet = ((LinkedHashMap) C0DR3.LIZJ).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('#');
            if (u.LJJIIJZLJL((String) obj, C2188811AlT.LIZIZ(sbLIZ), false)) {
                arrayList.add(obj);
            }
        }
        Set setKeySet2 = ((LinkedHashMap) C0DR3.LIZIZ).keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setKeySet2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('#');
            if (u.LJJIIJZLJL((String) obj2, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0DR3.LIZJ.remove(it2.next());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C0DR3.LIZIZ.remove(it3.next());
        }
        if (C07IH.LIZ()) {
            C1859360yUA c1859360yUA = C1859360yUA.LIZ;
            Message message2 = this.LLJJLIIIJLLLLLLLZ;
            if (message2 != null && (str2 = message2.uuid) != null) {
                str3 = str2;
            }
            c1859360yUA.getClass();
            C1859360yUA.LIZLLL(str3);
        }
    }

    public final C1859410yUF getTypewriterManager() {
        return this.LLJJJJLIIL;
    }

    public final boolean LJJJJLI(String str) {
        String str2;
        C1859410yUF c1859410yUF = this.LLJJJJLIIL;
        Message message = c1859410yUF.LIZIZ;
        if (message != null && (str2 = message.uuid) != null && str != null && Intrinsics.LJFF(str, str2)) {
            if (c1859410yUF.LIZLLL) {
                return C1785140wYS.LIZJ(c1859410yUF.LJ, str2);
            }
            return C1785140wYS.LIZLLL(str2);
        }
        return false;
    }

    public C1859370yUB(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJJJJLIIL = new C1859410yUF();
        this.LLJJL = new C1859380yUC();
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJLL(X.C1859370yUB r24, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r25, java.util.Map r26, java.lang.Long r27, java.lang.Integer r28, java.lang.String r29, X.C21419418s4 r30, X.C0HXO r31, X.C689230R1t r32, X.C1859280yU2 r33, X.C1859260yU0 r34, X.C1859290yU3 r35, X.C1859300yU4 r36, kotlin.jvm.internal.AwS428S0200000_27 r37, kotlin.jvm.internal.AwS462S0200000_27 r38, int r39) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1859370yUB.LJJJJLL(X.0yUB, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, java.util.Map, java.lang.Long, java.lang.Integer, java.lang.String, X.18s4, X.0HXO, X.0R1t, X.0yU2, X.0yU0, X.0yU3, X.0yU4, kotlin.jvm.internal.AwS428S0200000_27, kotlin.jvm.internal.AwS462S0200000_27, int):void");
    }
}
