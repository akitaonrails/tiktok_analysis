package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionUiAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1Dhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263001Dhq {
    public static void LIZIZ(boolean z) {
        if (z) {
            View view = SearchRelatedSuggestionUiAssem.LLJIJIL.get();
            if (view != null) {
                view.setBackgroundResource(R.drawable.d4y);
                return;
            }
            return;
        }
        View view2 = SearchRelatedSuggestionUiAssem.LLJIJIL.get();
        if (view2 == null) {
            return;
        }
        view2.setBackgroundResource(0);
    }

    public static void LIZJ(boolean z) {
        View view = SearchRelatedSuggestionUiAssem.LLJIJIL.get();
        if (view != null) {
            if (z) {
                C786410Ut5.LJLLLLLL(8, view);
            } else {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
    }

    public static void LIZ(View view, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        Context context = view.getContext();
        if (context != null) {
            SearchRelatedSuggestionUiAssem.LLJ.getClass();
            LIZIZ(true);
            searchRelatedSuggestionVM.vQ2(context, view);
        }
    }

    public static void LIZLLL(boolean z, SearchRelatedSuggestionVM searchRelatedSuggestionVM) {
        View view = SearchRelatedSuggestionUiAssem.LLJIJIL.get();
        if (view != null) {
            if (z) {
                view.findViewById(R.id.m37).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(view, searchRelatedSuggestionVM, 4));
                view.findViewById(R.id.jwr).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(view, searchRelatedSuggestionVM, 5));
                view.findViewById(R.id.jws).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(view, searchRelatedSuggestionVM, 6));
                view.setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(view, searchRelatedSuggestionVM, 7));
                view.findViewById(R.id.g21).setOnLongClickListener(new ViewOnLongClickListenerC2325301G0i(view, searchRelatedSuggestionVM, 8));
                return;
            }
            view.findViewById(R.id.g21).setLongClickable(false);
            view.setBackground(null);
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.1Dhy
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return false;
                }
            });
            view.setLongClickable(false);
        }
    }
}
