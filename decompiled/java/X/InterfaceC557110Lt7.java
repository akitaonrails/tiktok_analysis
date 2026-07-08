package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS374S0200000_8;

/* JADX INFO: renamed from: X.0Lt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC557110Lt7 {
    boolean LIZ(C558570LvT c558570LvT);

    List<String> LIZIZ(C0M4M c0m4m);

    AwemeDraft LIZJ(C0M4L c0m4l);

    AwemeDraft LIZLLL(String str);

    Exception LJ(C0M4J c0m4j, AwS374S0200000_8 awS374S0200000_8);

    List<AwemeDraft> LJFF(C0M4K c0m4k);

    AwemeDraft LJI(C558570LvT c558570LvT);

    C0M5Z LJII(AwemeDraft awemeDraft);

    C0M5Z LJIIIIZZ();

    Pair<List<AwemeDraft>, Exception> LJIIIZ(C0M4J c0m4j);

    String getSaveDate(AwemeDraft awemeDraft);

    int queryDraftCount(C0M4M c0m4m);

    List<AwemeDraft> queryDraftList(C0M4J c0m4j);

    List<C561420M0e> queryDraftMetaList(C0M4J c0m4j);

    C553680Lna queryDraftsInfo(C0M4M c0m4m);

    List<AwemeDraft> queryDraftsInfoWithLimited(C0M4M c0m4m, int i);
}
