package androidx.fragment.app;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C451320Hms;
import X.C786410Ut5;
import Y.ARunnableS106S0100000_6;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class ListFragment extends Fragment {
    public static final String _pnsPageId = "KSsoOyA6LD1iLz0yLygpJzt9HELIOSKTU8ZwM6OzEKOy40JSAiPQ==";
    public final Handler LL = new Handler();
    public final ARunnableS106S0100000_6 LLILLJJLI = new ARunnableS106S0100000_6(this, 9);
    public final C451320Hms LLILLL = new AdapterView.OnItemClickListener() { // from class: X.0Hms
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            this.LL.getClass();
        }
    };
    public ListAdapter LLILZ;
    public ListView LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public boolean LLJ;

    public final void MR() {
        if (this.LLILZIL != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.LLILZIL = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            if (textView == null) {
                this.LLILZLL = view.findViewById(R.id.empty);
            } else {
                C786410Ut5.LLIL(textView, 8);
            }
            this.LLIZ = view.findViewById(16711682);
            this.LLIZLLLIL = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.LLILZIL = listView;
            View view2 = this.LLILZLL;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.LLJ = true;
        C786410Ut5.vb(this.LLILZIL, this.LLILLL);
        ListAdapter listAdapter = this.LLILZ;
        if (listAdapter != null) {
            this.LLILZ = listAdapter;
            ListView listView2 = this.LLILZIL;
            if (listView2 != null) {
                listView2.setAdapter(listAdapter);
                if (!this.LLJ) {
                    NR(true, requireView().getWindowToken() != null);
                }
            }
        } else if (this.LLIZ != null) {
            NR(false, false);
        }
        C786410Ut5.LJJZZIII(this.LL, this.LLILLJJLI);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LL.removeCallbacks(this.LLILLJJLI);
        this.LLILZIL = null;
        this.LLJ = false;
        this.LLIZLLLIL = null;
        this.LLIZ = null;
        this.LLILZLL = null;
        super.onDestroyView();
    }

    public final void NR(boolean z, boolean z2) {
        MR();
        View view = this.LLIZ;
        if (view != null) {
            if (this.LLJ == z) {
                return;
            }
            this.LLJ = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                    this.LLIZLLLIL.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                } else {
                    view.clearAnimation();
                    this.LLIZLLLIL.clearAnimation();
                }
                C786410Ut5.LJLLLLLL(8, this.LLIZ);
                C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                this.LLIZLLLIL.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
            } else {
                view.clearAnimation();
                this.LLIZLLLIL.clearAnimation();
            }
            C786410Ut5.LJLLLLLL(0, this.LLIZ);
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        C786410Ut5.LJZL(8, linearLayout);
        linearLayout.setGravity(17);
        C19GS c19gs = null;
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
