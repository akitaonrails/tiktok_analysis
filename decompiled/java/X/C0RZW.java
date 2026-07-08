package X;

import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RZW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZW {
    public static final C0RZW LIZ = new C0RZW();

    public static final void LIZ(Aweme aweme, String str) {
        Object objValueOf;
        if (aweme == null) {
            return;
        }
        LIZ.getClass();
        boolean zIsValid = false;
        if ((Intrinsics.LJFF(str, "homepage_hot") || Intrinsics.LJFF(str, "homepage_follow") || Intrinsics.LJFF(str, "homepage_popular") || Intrinsics.LJFF(str, "homepage_nearby") || Intrinsics.LJFF(str, "homepage_friends")) && !C727520SgI.LJFF(aweme)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            c2344009Gk.LJIIIIZZ("rec_type", C727520SgI.LIZLLL(aweme));
            c2344009Gk.LJIIIIZZ("label_text", "");
            if (!C727520SgI.LJI(aweme)) {
                c2344009Gk.LJIIIIZZ("is_avatar", "1");
                MutualStruct mutualStructLIZIZ = C727520SgI.LIZIZ(aweme);
                if (mutualStructLIZIZ != null) {
                    objValueOf = Integer.valueOf(mutualStructLIZIZ.total);
                } else {
                    objValueOf = Boolean.FALSE;
                }
                c2344009Gk.LJ(objValueOf, "maf_num");
            }
            C20684815ws.LJIILLIIL("show_label", c2344009Gk.LIZ);
            return;
        }
        RelationDynamicLabel relationLabel = aweme.getRelationLabel();
        if (relationLabel != null) {
            zIsValid = relationLabel.isValid();
        }
        if (aweme.getRelationLabel() != null && zIsValid) {
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("show");
            mobClickObtain.setLabelName("like_banner");
            mobClickObtain.setValue(aweme.getAid());
            mobClickObtain.setExtValueString(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            C20684815ws.onEvent(mobClickObtain);
        }
    }

    public static final void LIZIZ(String str, Aweme aweme, List<String> list) {
        String string;
        String str2;
        String strLJJLIIIJ;
        String str3;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("aweme_type", String.valueOf(aweme.getAwemeType()));
        if (AwemeSaaSExtKt.isLive(aweme)) {
            string = CardStruct.IStatusCode.DEFAULT;
        } else {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                C697780RYq c697780RYq = C697770RYp.LIZIZ.get(it2.next());
                if (c697780RYq != null) {
                    str2 = c697780RYq.LIZIZ;
                } else {
                    str2 = null;
                }
                arrayList.add(str2);
            }
            string = arrayList.toString();
        }
        c2344009Gk.LJIIIIZZ("tag_code", string);
        if (AwemeSaaSExtKt.isLive(aweme)) {
            strLJJLIIIJ = "relationship";
        } else {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it3 = list.iterator();
            while (it3.hasNext()) {
                C697780RYq c697780RYq2 = C697770RYp.LIZIZ.get(it3.next());
                if (c697780RYq2 != null) {
                    str3 = c697780RYq2.LIZ;
                } else {
                    str3 = null;
                }
                arrayList2.add(str3);
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, null, null, null, 0, null, null, 63);
        }
        c2344009Gk.LJIIIIZZ("tag_type", strLJJLIIIJ);
        c2344009Gk.LJIIIIZZ("tag_number", String.valueOf(list.size()));
        C20684815ws.LJIILLIIL("show_core_fdmt_tag", c2344009Gk.LIZ);
    }
}
