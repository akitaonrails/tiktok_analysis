package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388840mFG extends AbstractC1066890drz {
    public final Context LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1388840mFG(this.LLJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012e  */
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1388840mFG.LIZLLL():java.lang.String");
    }

    public C1388840mFG(Context context) {
        this.LLJ = context;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        SuggestWordStruct next;
        List<WordStruct> words;
        WordStruct wordStruct;
        String scene;
        try {
            Aweme awemeLJIIZILJ = LJIIZILJ();
            String word = null;
            if (awemeLJIIZILJ != null && (commentSuggestWordList = awemeLJIIZILJ.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
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
                    try {
                        word = wordStruct.getWord();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            FullPageParam fullPageParam = new FullPageParam(awemeLJIIZILJ, null, new ArrayList(), false);
            C0SPA c0spa = C0SPA.LIZ;
            Context context = this.LLJ;
            c0spa.getClass();
            C0SPA.LJ(context, fullPageParam, word);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        LJJII(c2344009Gk, true, true);
    }
}
