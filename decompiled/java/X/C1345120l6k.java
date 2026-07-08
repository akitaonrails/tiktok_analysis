package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.UserVoteInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0l6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345120l6k {
    public static final /* synthetic */ int LJIJ = 0;
    public final CharSequence LIZ;
    public final List<TextExtraStruct> LIZIZ;
    public final List<CommentImageModel> LIZJ;
    public final List<AudioCommentModel> LIZLLL;
    public final CommentStickerStruct LJ;
    public final GiftStruct LJFF;
    public final String LJI;
    public final int LJII;
    public final Comment LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final C1345150l6n LJIIL;
    public final EnumC1346360l8k LJIILIIL;
    public final boolean LJIILJJIL;
    public final String LJIILL;
    public final Aweme LJIILLIIL;
    public final UserVoteInfo LJIIZILJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1345120l6k() {
        int i = 0;
        this(null, i, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262143);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1345120l6k(CharSequence charSequence, int i, int i2, C1345150l6n c1345150l6n, Aweme aweme, int i3) {
        EnumC1346360l8k enumC1346360l8k;
        Aweme aweme2 = aweme;
        C1345150l6n c1345150l6n2 = c1345150l6n;
        int i4 = i2;
        int i5 = i;
        CharSequence charSequence2 = (i3 & 1) != 0 ? null : charSequence;
        i5 = (i3 & 512) != 0 ? 0 : i5;
        i4 = (i3 & 1024) != 0 ? 0 : i4;
        c1345150l6n2 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c1345150l6n2;
        if ((i3 & 8192) != 0) {
            enumC1346360l8k = EnumC1346360l8k.COMMENT_PANEL;
        } else {
            enumC1346360l8k = null;
        }
        this(charSequence2, null, null, null, null, null, null, 0, null, i5, i4, false, c1345150l6n2, enumC1346360l8k, false, null, (i3 & 65536) != 0 ? null : aweme2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1345120l6k(CharSequence charSequence, List<? extends TextExtraStruct> list, List<CommentImageModel> list2, List<AudioCommentModel> list3, CommentStickerStruct commentStickerStruct, GiftStruct giftStruct, String str, int i, Comment comment, int i2, int i3, boolean z, C1345150l6n c1345150l6n, EnumC1346360l8k enumC1346360l8k, boolean z2, String str2, Aweme aweme, UserVoteInfo userVoteInfo) {
        this.LIZ = charSequence;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = commentStickerStruct;
        this.LJFF = giftStruct;
        this.LJI = str;
        this.LJII = i;
        this.LJIIIIZZ = comment;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
        this.LJIIJJI = z;
        this.LJIIL = c1345150l6n;
        this.LJIILIIL = enumC1346360l8k;
        this.LJIILJJIL = z2;
        this.LJIILL = str2;
        this.LJIILLIIL = aweme;
        this.LJIIZILJ = userVoteInfo;
    }
}
