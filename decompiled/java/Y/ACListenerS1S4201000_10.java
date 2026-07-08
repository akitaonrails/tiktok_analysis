package Y;

import X.AbstractC848400XPy;
import X.C08JS;
import X.C0QTJ;
import X.C0XQ7;
import X.C1389890mGx;
import X.C19EG;
import android.net.Uri;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* JADX INFO: loaded from: classes11.dex */
public class ACListenerS1S4201000_10 implements View.OnClickListener {
    public final int $t;
    public int i6;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS1S4201000_10 aCListenerS1S4201000_10, View view) {
        String strLIZLLL;
        C0QTJ c0qtj = C0QTJ.LIZ;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS1S4201000_10.l4;
        int i = aCListenerS1S4201000_10.i6;
        String str = aCListenerS1S4201000_10.s0;
        String str2 = aCListenerS1S4201000_10.s1;
        C19EG c19eg = (C19EG) aCListenerS1S4201000_10.l5;
        String str3 = aCListenerS1S4201000_10.s2;
        String str4 = aCListenerS1S4201000_10.s3;
        c0qtj.getClass();
        Word word = searchSugEntity.mWord;
        if (word != null) {
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "suggestion").appendQueryParameter("object_id", word.getWord()).appendQueryParameter("owner_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            n nVar = new n();
            try {
                nVar.LJJIIJ("raw_query", str3);
                nVar.LJJIIJ("words_content", word.getWord());
                nVar.LJJIII(Integer.valueOf(i), "words_position");
                nVar.LJJIIJ("impr_id", str4);
                nVar.LJJIIJ("group_id", word.getId());
                nVar.LJJIIJ("words_source", "sug");
                nVar.LJJIIJ("sug_type", str);
                nVar.LJJIIJ("feedback_id", str2);
                strLIZLLL = C08JS.LIZLLL(nVar);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZLLL = "";
            }
            builderAppendQueryParameter.appendQueryParameter("extra", strLIZLLL);
            ComplianceServiceProvider.LJJ().LIZIZ(c19eg, builderAppendQueryParameter);
        }
        C0QTJ c0qtj2 = C0QTJ.LIZ;
        SearchSugEntity searchSugEntity2 = (SearchSugEntity) aCListenerS1S4201000_10.l4;
        int i2 = aCListenerS1S4201000_10.i6;
        String str5 = aCListenerS1S4201000_10.s0;
        String str6 = aCListenerS1S4201000_10.s1;
        String str7 = aCListenerS1S4201000_10.s2;
        String str8 = aCListenerS1S4201000_10.s3;
        c0qtj2.getClass();
        C0QTJ.LIZ(searchSugEntity2, i2, "confirm", str5, str6, str7, str8);
    }

    public static final void onClick$1(ACListenerS1S4201000_10 aCListenerS1S4201000_10, View view) {
        C0QTJ c0qtj = C0QTJ.LIZ;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS1S4201000_10.l4;
        int i = aCListenerS1S4201000_10.i6;
        String str = aCListenerS1S4201000_10.s0;
        String str2 = aCListenerS1S4201000_10.s1;
        String str3 = aCListenerS1S4201000_10.s2;
        String str4 = aCListenerS1S4201000_10.s3;
        c0qtj.getClass();
        C0QTJ.LIZ(searchSugEntity, i, "not_relevant", str, str2, str3, str4);
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) aCListenerS1S4201000_10.l5);
        c1389890mGx.LJIIIZ(2131849337);
        c1389890mGx.LJIIJJI();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS1S4201000_10(int r2, X.C19EG r3, com.ss.android.ugc.aweme.search.model.SearchSugEntity r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r1 = this;
            r1.$t = r9
            if (r9 == 0) goto L17
            r0 = r1
            r0.l4 = r4
            r0.i6 = r2
            r0.s0 = r5
            r0.s1 = r6
            r0.s2 = r7
            r0.s3 = r8
            r0.l5 = r3
        L13:
            r0.<init>()
            return
        L17:
            r0 = r1
            r0.l4 = r4
            r0.i6 = r2
            r0.s0 = r5
            r0.s1 = r6
            r0.l5 = r3
            r0.s2 = r7
            r0.s3 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS1S4201000_10.<init>(int, X.19EG, com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
