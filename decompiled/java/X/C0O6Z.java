package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O6Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6Z extends C09AY implements Function0<C712220Rwi> {
    public C0O6Z() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Rwi] */
    @Override // kotlin.jvm.functions.Function0
    public final C712220Rwi invoke() {
        return new InterfaceC614780O9k() { // from class: X.0Rwi
            @Override // X.InterfaceC614780O9k
            public final int LIZIZ(Aweme aweme, Integer num, String str) {
                String authorUid;
                String authorUid2;
                User author;
                if (num != null && num.intValue() == 2) {
                    return 5;
                }
                String authorUid3 = null;
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                if (C729510SjV.LJIILJJIL(authorUid)) {
                    return 7;
                }
                if (aweme != null) {
                    authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid2 = null;
                }
                if (Intrinsics.LJFF(authorUid2, str)) {
                    return 6;
                }
                if (aweme != null) {
                    author = aweme.getAuthor();
                } else {
                    author = null;
                }
                boolean zLJIILJJIL = C10EU.LJIILJJIL(author);
                C1605650rsx c1605650rsx = C1605650rsx.LIZIZ;
                EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
                if (aweme != null) {
                    authorUid3 = AwemeExtKt.getAuthorUid(aweme);
                }
                int iLJIIZILJ = c1605650rsx.LJIIZILJ(enumC1615506Uf, authorUid3);
                if (iLJIIZILJ != 0) {
                    if (iLJIIZILJ != 1) {
                        if (iLJIIZILJ == 2) {
                            if (zLJIILJJIL) {
                                return 2;
                            }
                            return 3;
                        }
                        return 0;
                    }
                    if (!zLJIILJJIL) {
                        return 5;
                    }
                    return 4;
                }
                if (!zLJIILJJIL) {
                    return 1;
                }
                return 0;
            }

            @Override // X.InterfaceC614780O9k
            public final int LIZ(User user, boolean z, String str, String str2) {
                if (z) {
                    return 5;
                }
                if (C729510SjV.LJIILJJIL(str)) {
                    return 7;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    return 6;
                }
                boolean zLJIILJJIL = C10EU.LJIILJJIL(user);
                int iLJIIZILJ = C1605650rsx.LIZIZ.LJIIZILJ(EnumC1615506Uf.STORY, str);
                int i = 1;
                if (iLJIIZILJ != 0) {
                    if (iLJIIZILJ != 1) {
                        i = 2;
                        if (iLJIIZILJ == 2) {
                            if (!zLJIILJJIL) {
                                return 3;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        if (!zLJIILJJIL) {
                            return 5;
                        }
                        return 4;
                    }
                } else if (zLJIILJJIL) {
                    return 0;
                }
                return i;
            }
        };
    }
}
