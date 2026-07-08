package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHL implements InterfaceC1386220mB2 {
    public static final C0QHL LIZ = new C0QHL();

    @Override // X.InterfaceC1386220mB2
    public final boolean LLLLIILLL(Aweme aweme) {
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        SuggestWordStruct next;
        List<WordStruct> words;
        WordStruct wordStruct;
        String scene;
        String word = null;
        if (aweme != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            Iterator<SuggestWordStruct> it2 = suggestWords.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    SuggestWordStruct suggestWordStruct = next;
                    if (suggestWordStruct != null) {
                        scene = suggestWordStruct.getScene();
                    } else {
                        scene = null;
                    }
                    if (Intrinsics.LJFF(scene, "feed_bar")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SuggestWordStruct suggestWordStruct2 = next;
            if (suggestWordStruct2 != null && (words = suggestWordStruct2.getWords()) != null && (wordStruct = (WordStruct) C13LP.LJJJLL(words)) != null) {
                word = wordStruct.getWord();
            }
        }
        return C703302op.LIZ(word);
    }

    @Override // X.InterfaceC1386220mB2
    public final boolean LLZL(Aweme aweme) {
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        SuggestWordStruct next;
        List<WordStruct> words;
        WordStruct wordStruct;
        String scene;
        String word = null;
        if (aweme != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            Iterator<SuggestWordStruct> it2 = suggestWords.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    SuggestWordStruct suggestWordStruct = next;
                    if (suggestWordStruct != null) {
                        scene = suggestWordStruct.getScene();
                    } else {
                        scene = null;
                    }
                    if (Intrinsics.LJFF(scene, "comment_top")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SuggestWordStruct suggestWordStruct2 = next;
            if (suggestWordStruct2 != null && (words = suggestWordStruct2.getWords()) != null && (wordStruct = (WordStruct) C13LP.LJJJLL(words)) != null) {
                word = wordStruct.getWord();
            }
        }
        return C703302op.LIZ(word);
    }
}
