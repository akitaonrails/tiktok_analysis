package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0y1W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841600y1W extends C0J9V {
    public final Fragment LLILZLL;
    public List<ExploreCustomTopicResponse> LLIZ;
    public List<? extends IExploreTopicTabProtocol> LLIZLLLIL;

    public final List<ExploreCustomTopicResponse> LJJIL() {
        List<ExploreCustomTopicResponse> list = this.LLIZ;
        if (list != null) {
            return list;
        }
        ExploreManageTabAbility exploreManageTabAbility = (ExploreManageTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZLL, null), ExploreManageTabAbility.class, null);
        if (exploreManageTabAbility != null) {
            return exploreManageTabAbility.zV0();
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<ExploreCustomTopicResponse> listLJJIL = LJJIL();
        if (listLJJIL != null) {
            return listLJJIL.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        Fragment fragment;
        Bundle arguments;
        ExploreManageTabAbility exploreManageTabAbility;
        if (obj instanceof Fragment) {
            fragment = (Fragment) obj;
        } else {
            fragment = null;
        }
        if (fragment == null || (arguments = fragment.getArguments()) == null) {
            return -2;
        }
        long j = arguments.getLong("com.ss.android.ugc.aweme.intent.extra.TOPIC_PANEL_ID", -1L);
        if (j == -1) {
            return -2;
        }
        List listZ02 = this.LLIZLLLIL;
        if (listZ02 == null && ((exploreManageTabAbility = (ExploreManageTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZLL, null), ExploreManageTabAbility.class, null)) == null || (listZ02 = exploreManageTabAbility.z02()) == null)) {
            return -2;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listZ02, 10));
        Iterator it2 = listZ02.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((IExploreTopicTabProtocol) it2.next()).getTabId()));
        }
        if (!arrayList.contains(Long.valueOf(j))) {
            return -2;
        }
        return arrayList.indexOf(Long.valueOf(j));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        ExploreCustomTopicResponse exploreCustomTopicResponse;
        String str;
        List<ExploreCustomTopicResponse> listLJJIL = LJJIL();
        if (listLJJIL != null && (exploreCustomTopicResponse = (ExploreCustomTopicResponse) C13LP.LJJJLZIJ(i, listLJJIL)) != null && (str = exploreCustomTopicResponse.topicName) != null) {
            return str;
        }
        return "";
    }

    @Override // X.C0J9V
    public final Fragment LJJIJIL(int i) {
        IExploreTopicTabProtocol iExploreTopicTabProtocol;
        ExploreManageTabAbility exploreManageTabAbility;
        List listZ02 = this.LLIZLLLIL;
        if ((listZ02 == null && ((exploreManageTabAbility = (ExploreManageTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LLILZLL, null), ExploreManageTabAbility.class, null)) == null || (listZ02 = exploreManageTabAbility.z02()) == null)) || (iExploreTopicTabProtocol = (IExploreTopicTabProtocol) C13LP.LJJJLZIJ(i, listZ02)) == null) {
            return null;
        }
        Context contextRequireContext = this.LLILZLL.requireContext();
        return Fragment.instantiate(contextRequireContext, iExploreTopicTabProtocol.LLJIJIL().getName(), iExploreTopicTabProtocol.V9(contextRequireContext));
    }

    @Override // X.C0J9V
    public final long LJJIJL(int i) {
        ExploreCustomTopicResponse exploreCustomTopicResponse;
        Long l;
        List<ExploreCustomTopicResponse> listLJJIL = LJJIL();
        if (listLJJIL != null && (exploreCustomTopicResponse = (ExploreCustomTopicResponse) C13LP.LJJJLZIJ(i, listLJJIL)) != null && (l = exploreCustomTopicResponse.topicId) != null) {
            return l.longValue();
        }
        return -1L;
    }

    public C1841600y1W(FragmentManager fragmentManager, Fragment fragment) {
        super(fragmentManager);
        this.LLILZLL = fragment;
    }

    @Override // X.C0J9V, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        Object c098200Yq;
        super.LJIIZILJ(viewGroup, i, obj);
        if (obj instanceof Fragment) {
            try {
                C19EH c19eh = this.LLILLL;
                if (c19eh != null) {
                    c19eh.LJIIZILJ((Fragment) obj);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("destroyItem remove fragment exception: ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                c2276411E8h.log("ExploreTopicTabAdapter", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
