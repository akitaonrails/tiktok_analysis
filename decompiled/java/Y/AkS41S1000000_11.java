package Y;

import X.C13BV;
import X.InterfaceC1487280oo2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AkS41S1000000_11 implements InterfaceC1487280oo2 {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS41S1000000_11(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(AkS41S1000000_11 akS41S1000000_11, Object obj) {
        Aweme aweme;
        List<Aweme> awemes = ((UserStoriesResponse) obj).getAwemes();
        if (awemes == null) {
            awemes = C13BV.INSTANCE;
        }
        if (awemes.isEmpty()) {
            aweme = new Aweme();
        } else {
            aweme = (Aweme) ListProtector.get(awemes, 0);
        }
        String str = akS41S1000000_11.s0;
        if (aweme.getAid() == null) {
            aweme.setAid(str);
        }
        if (aweme.getAuthor() == null) {
            User user = new User();
            user.setUid(str);
            aweme.setAuthor(user);
        }
        return aweme;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$1(Y.AkS41S1000000_11 r8, java.lang.Object r9) {
        /*
            com.ss.android.ugc.aweme.story.model.UserStoriesResponse r9 = (com.ss.android.ugc.aweme.story.model.UserStoriesResponse) r9
            java.util.List r7 = r9.getAwemes()
            if (r7 != 0) goto La
            X.13BV r7 = X.C13BV.INSTANCE
        La:
            boolean r1 = r7.isEmpty()
            r0 = 0
            if (r1 == 0) goto L88
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = new com.ss.android.ugc.aweme.feed.model.Aweme
            r0.<init>()
        L16:
            java.lang.String r2 = r8.s0
            java.lang.String r1 = r0.getAid()
            if (r1 != 0) goto L21
            r0.setAid(r2)
        L21:
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getAuthor()
            if (r1 != 0) goto L32
            com.ss.android.ugc.aweme.profile.model.User r1 = new com.ss.android.ugc.aweme.profile.model.User
            r1.<init>()
            r1.setUid(r2)
            r0.setAuthor(r1)
        L32:
            java.util.List r1 = r9.getQueryResults()
            r6 = 0
            r5 = 20000(0x4e20, float:2.8026E-41)
            if (r1 == 0) goto L85
            java.lang.String r4 = r8.s0
            java.util.Iterator r3 = r1.iterator()
        L41:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.ss.android.ugc.aweme.story.model.StoryQueryResult r1 = (com.ss.android.ugc.aweme.story.model.StoryQueryResult) r1
            java.lang.String r1 = r1.authorUid
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r1)
            if (r1 == 0) goto L41
        L56:
            com.ss.android.ugc.aweme.story.model.StoryQueryResult r2 = (com.ss.android.ugc.aweme.story.model.StoryQueryResult) r2
            if (r2 == 0) goto L85
            int r3 = r2.code
            if (r3 != r5) goto L79
        L5e:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L76
            com.ss.android.ugc.aweme.feed.model.story.UserStory r1 = r0.getUserStory()
            if (r1 == 0) goto L76
            java.util.List r1 = r1.getStories()
            if (r1 == 0) goto L76
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L79
        L76:
            r3 = 60000(0xea60, float:8.4078E-41)
        L79:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2.<init>(r0, r1)
            return r2
        L83:
            r2 = r6
            goto L56
        L85:
            r3 = 20000(0x4e20, float:2.8026E-41)
            goto L5e
        L88:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS41S1000000_11.apply$1(Y.AkS41S1000000_11, java.lang.Object):java.lang.Object");
    }
}
