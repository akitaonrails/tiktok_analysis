package X;

import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;

/* JADX INFO: renamed from: X.0I5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460800I5e {
    public static final C460800I5e LIZ = new C460800I5e();

    public static final String LIZ(C869590Y9l c869590Y9l) {
        ShareAwemeContent.Companion companion = ShareAwemeContent.Companion;
        if (companion.isEncourageMufLikeMsg(c869590Y9l)) {
            if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                return C1383370m6R.LJIIJ(2131831165);
            }
            return C1383370m6R.LJIIJ(2131831164);
        }
        if (companion.isEncourageMufCommentMsg(c869590Y9l)) {
            if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                return C1383370m6R.LJIIJ(2131831161);
            }
            return C1383370m6R.LJIIJ(2131831160);
        }
        if (companion.isEncourageMufRepostMsg(c869590Y9l)) {
            if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                return C1383370m6R.LJIIJ(2131831169);
            }
            return C1383370m6R.LJIIJ(2131831168);
        }
        if (companion.isEncourageMufFavouriteMsg(c869590Y9l)) {
            if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                return C1383370m6R.LJIIJ(2131831159);
            }
            return C1383370m6R.LJIIJ(2131831158);
        }
        if (companion.isEncourageMufLikeStoryMsg(c869590Y9l)) {
            if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                return C1383370m6R.LJIIJ(2131831167);
            }
            return C1383370m6R.LJIIJ(2131831166);
        }
        if (companion.isEncourageMufCommentStoryMsg(c869590Y9l)) {
            if (C0W8I.LIZLLL(Long.valueOf(c869590Y9l.getSender()))) {
                return C1383370m6R.LJIIJ(2131831163);
            }
            return C1383370m6R.LJIIJ(2131831162);
        }
        return "";
    }
}
