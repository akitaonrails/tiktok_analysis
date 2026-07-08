package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.DualStreamViewModel;

/* JADX INFO: renamed from: X.0PDT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public interface C0PDT {
    RecyclerView LLII();

    C0PHT g1();

    GlobalDoodleConfig getGlobalDoodleConfig();

    String getKeyword();

    String getLabelName();

    SearchResultParam getSearchParam();

    String h1();

    C0PI3 i1();

    C0PJV j1();

    String k1();

    C0PRW l1();

    void m1(String str);

    C0PN8 n1(boolean z);

    SurveyViewModel o1();

    C643810PNb<SearchJediMixFeedFragment> p1();

    void q1(String str);

    DualStreamViewModel r1();

    String s1();

    void t1(C0PJH c0pjh);
}
