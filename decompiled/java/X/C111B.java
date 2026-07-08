package X;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.111B, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C111B extends C111D {
    public final C01GW LIZJ;
    public RecyclerView LIZLLL;
    public Drawable LJ;
    public final C01GW LJFF;
    public C1856690yPr LJI;
    public final C11JF LJII;
    public final C01GW LJIIIIZZ;

    public final C19411610x0 LIZ() {
        return (C19411610x0) this.LJIIIIZZ.getValue();
    }

    public final void LIZLLL() {
        C1856690yPr c1856690yPr = this.LJI;
        if (c1856690yPr != null) {
            c1856690yPr.LJIIJ();
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.LIZJ.getValue();
        if (appCompatTextView != null) {
            appCompatTextView.setCompoundDrawablePadding(((Number) this.LJFF.getValue()).intValue());
            appCompatTextView.setCompoundDrawables(this.LJ, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C111B(X.C111C r12) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111B.<init>(X.111C):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        r6.add(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse r9) {
        /*
            r8 = this;
            r8.LIZLLL()
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = r9.items
            int r1 = r0.size()
            r0 = 2
            if (r1 > r0) goto Ld
            return
        Ld:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.111C r0 = r8.LIZ
            java.util.List<java.lang.String> r0 = r0.LIZLLL
            if (r0 == 0) goto L42
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L42
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = r9.items
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag r2 = (com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag) r2
            X.111C r0 = r8.LIZ
            java.util.List<java.lang.String> r1 = r0.LIZLLL
            java.lang.String r0 = r2.getChallengeName()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L24
            r4.add(r2)
            goto L24
        L42:
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = r9.items
            r4.addAll(r0)
        L47:
            X.112C r0 = X.C112C.LIZ
            r0.getClass()
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = X.C112C.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto La3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r4.iterator()
        L61:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r5 = r7.next()
            r4 = r5
            com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag r4 = (com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag) r4
            X.112C r0 = X.C112C.LIZ
            r0.getClass()
            java.util.List<com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag> r0 = X.C112C.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L7b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag r0 = (com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag) r0
            java.lang.String r1 = r0.getChallengeName()
            java.lang.String r0 = r4.getChallengeName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7b
            if (r2 != 0) goto L61
        L98:
            r6.add(r5)
            goto L61
        L9c:
            boolean r0 = X.C19719512Dh.LJI(r6)
            if (r0 == 0) goto Lc0
            r4 = r6
        La3:
            X.10x0 r1 = r8.LIZ()
            java.lang.String r0 = r9.logId
            if (r0 != 0) goto Lbd
            r1.getClass()
        Lae:
            X.10x0 r0 = r8.LIZ()
            r0.setData(r4)
            X.10x0 r0 = r8.LIZ()
            r0.notifyDataSetChanged()
            return
        Lbd:
            r1.LLJJ = r0
            goto Lae
        Lc0:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111B.LIZJ(com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse):void");
    }

    public final void LIZIZ(int i, List<RecommendHashtag> list) {
        String string;
        Object next;
        C736480Suk c736480Suk = new C736480Suk();
        c736480Suk.LIZ("result_type", String.valueOf(i));
        String str = this.LIZ.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c736480Suk.LIZ("creation_id", str);
        if (list == null || (string = Integer.valueOf(list.size()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c736480Suk.LIZ("hashtag_count", string);
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<RecommendHashtag> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getChallengeName());
            }
            Iterator it3 = arrayList.iterator();
            if (!it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) next);
                    sbLIZ.append(',');
                    sbLIZ.append(str3);
                    next = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            String str4 = (String) next;
            if (str4 != null) {
                str2 = str4;
            }
        }
        c736480Suk.LIZ("hashtag_list", str2);
        C20684815ws.LJIJ("fetch_recommend_hashtag_result", c736480Suk.LIZIZ());
    }
}
