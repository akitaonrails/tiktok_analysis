package Y;

import X.C098200Yq;
import X.C1189060h32;
import X.C1191220h6W;
import X.C1191760h7O;
import X.C1191790h7R;
import X.C1201010hMJ;
import X.C1201050hMN;
import X.C1558360qeg;
import X.C189200o6;
import X.C786410Ut5;
import X.InterfaceC1191710h7J;
import X.InterfaceC1191840h7W;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import kotlin.jvm.internal.AwS83S1300000_18;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS29S1300000_18 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final void onClick$0(ACListenerS29S1300000_18 aCListenerS29S1300000_18, View view) {
        Context context;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        Object c098200Yq;
        String strLJJLIIIJJI;
        String str;
        String strZZ1;
        String logId;
        String strYy;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        Fragment fragmentLJIIJ;
        View viewLJIIJJI = ((C1191760h7O) aCListenerS29S1300000_18.l1).LJIIJJI();
        if (viewLJIIJJI != null && (context = viewLJIIJJI.getContext()) != null) {
            InterfaceC1191840h7W interfaceC1191840h7W = ((C1191760h7O) aCListenerS29S1300000_18.l1).LIZLLL;
            String strO32 = null;
            if (interfaceC1191840h7W != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) != null && (fragmentLJIIJ = C1189060h32.LJIIJ(abstractRefactorPoiReviewCellLLLLLLIL)) != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            } else {
                interfaceC665370Q7zLJFF = null;
            }
            C1191760h7O c1191760h7O = (C1191760h7O) aCListenerS29S1300000_18.l1;
            PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) aCListenerS29S1300000_18.l3;
            try {
                JSONObject jSONObject = new JSONObject();
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL = c1191760h7O.LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL != null) {
                    strLJJLIIIJJI = interfaceC1191710h7JLJIILIIL.LJJLIIIJJI();
                } else {
                    strLJJLIIIJJI = null;
                }
                jSONObject.putOpt("enter_from", strLJJLIIIJJI);
                jSONObject.putOpt("enter_method", "click_review_head");
                jSONObject.putOpt("poi_id", poiReviewModel.getPoiId());
                jSONObject.putOpt("review_id", poiReviewModel.getReviewId());
                PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
                if (author != null) {
                    str = author.userId;
                } else {
                    str = null;
                }
                jSONObject.putOpt("author_id", str);
                jSONObject.putOpt("review_source", poiReviewModel.getSource());
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL2 = c1191760h7O.LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL2 != null) {
                    strZZ1 = interfaceC1191710h7JLJIILIIL2.ZZ1();
                } else {
                    strZZ1 = null;
                }
                jSONObject.putOpt("collect_info", strZZ1);
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL3 = c1191760h7O.LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL3 != null) {
                    logId = interfaceC1191710h7JLJIILIIL3.getLogId();
                } else {
                    logId = null;
                }
                jSONObject.putOpt("log_id", logId);
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL4 = c1191760h7O.LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL4 != null) {
                    strYy = interfaceC1191710h7JLJIILIIL4.yy();
                } else {
                    strYy = null;
                }
                jSONObject.putOpt("from_group_id", strYy);
                InterfaceC1191710h7J interfaceC1191710h7JLJIILIIL5 = c1191760h7O.LJIILIIL();
                if (interfaceC1191710h7JLJIILIIL5 != null) {
                    strO32 = interfaceC1191710h7JLJIILIIL5.o32();
                }
                jSONObject.putOpt("enter_position", strO32);
                c098200Yq = C786410Ut5.J3(jSONObject);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = "";
            }
            String string = UriProtector.parse("aweme://poi_third_party").buildUpon().appendQueryParameter("url", aCListenerS29S1300000_18.s0).appendQueryParameter("mob_extra", (String) c098200Yq).appendQueryParameter("start_time", String.valueOf(System.currentTimeMillis())).toString();
            C1191220h6W c1191220h6W = C1191220h6W.LIZ;
            C1191790h7R c1191790h7R = (C1191790h7R) aCListenerS29S1300000_18.l2;
            PoiReviewsApi.PoiReviewDisclaimer poiReviewDisclaimer = c1191790h7R.LIZ;
            UrlModel urlModel = c1191790h7R.LIZIZ;
            AwS83S1300000_18 awS83S1300000_18 = new AwS83S1300000_18(interfaceC665370Q7zLJFF, (C1191760h7O) aCListenerS29S1300000_18.l1, context, string, 8);
            c1191220h6W.getClass();
            C1191220h6W.LIZIZ(context, poiReviewDisclaimer, urlModel, awS83S1300000_18);
        }
    }

    public static final void onClick$1(ACListenerS29S1300000_18 aCListenerS29S1300000_18, View view) {
        ((C1201010hMJ) aCListenerS29S1300000_18.l1).LJ((VideoItemParams) aCListenerS29S1300000_18.l2, false);
        C1201050hMN c1201050hMN = C1201050hMN.LIZ;
        String authorUid = AwemeExtKt.getAuthorUid((Aweme) aCListenerS29S1300000_18.l3);
        String aid = ((Aweme) aCListenerS29S1300000_18.l3).getAid();
        int awemeType = ((Aweme) aCListenerS29S1300000_18.l3).getAwemeType();
        ((C1201010hMJ) aCListenerS29S1300000_18.l1).getClass();
        String strLIZLLL = ((C1201010hMJ) aCListenerS29S1300000_18.l1).LIZLLL();
        String str = aCListenerS29S1300000_18.s0;
        Integer numValueOf = Integer.valueOf(awemeType);
        c1201050hMN.getClass();
        C1201050hMN.LIZIZ(str, authorUid, aid, true, numValueOf, strLIZLLL, "video", null, null, null);
    }

    public ACListenerS29S1300000_18(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
