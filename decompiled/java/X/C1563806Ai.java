package X;

import Y.ACallableS16S2100000_2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1563806Ai {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(Aweme aweme, String str, String str2) {
        C15O7.LIZIZ(new ACallableS16S2100000_2(aweme, str, str2, 0), C20684815ws.LJFF(), null);
    }

    public static final void LIZ(final int i, final Aweme aweme, final String str, final String str2, final String str3, final String str4, final List list, final List list2) {
        C15O7.LIZIZ(new Callable() { // from class: X.06Aj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ChooseReasonMobUtils@9af7.mobDislikeSubmit$1");
                ArrayList arrayList = new ArrayList();
                Iterator<DislikeHashTag> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().name);
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
                c2344009Gk.LJ(list, "reason_id");
                Music music = aweme.getMusic();
                c2344009Gk.LJ(music != null ? Long.valueOf(music.getId()) : null, "music_id");
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJ(arrayList, "hashtag_name");
                c2344009Gk.LIZJ(list.size(), "reason_cnt");
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
                c2344009Gk.LJIIIIZZ("error_code", str3);
                c2344009Gk.LJIIIIZZ("dislike_method", str4);
                C20684815ws.LJIILLIIL("dislike_submit", c2344009Gk.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ChooseReasonMobUtils@9af7.mobDislikeSubmit$1");
                return unit;
            }
        }, C20684815ws.LJFF(), null);
    }
}
