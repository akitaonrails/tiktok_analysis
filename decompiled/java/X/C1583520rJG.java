package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rJG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583520rJG extends C0J9V {
    public final Context LLILZLL;
    public List<SocialTopTabNode> LLIZ;
    public List<? extends ISocialTabProtocol> LLIZLLLIL;

    public final List<SocialTopTabNode> LJJIL() {
        List<SocialTopTabNode> list = this.LLIZ;
        if (list != null) {
            return list;
        }
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJ = C1583510rJF.LJ(this.LLILZLL);
        if (iSocial2TabProtocolAbilityLJ != null) {
            return iSocial2TabProtocolAbilityLJ.oK1();
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<SocialTopTabNode> listLJJIL = LJJIL();
        if (listLJJIL != null) {
            return listLJJIL.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJ;
        if (!(obj instanceof Fragment)) {
            obj = null;
        }
        if (obj == null) {
            return -2;
        }
        List listB9 = this.LLIZLLLIL;
        if (listB9 == null && ((iSocial2TabProtocolAbilityLJ = C1583510rJF.LJ(this.LLILZLL)) == null || (listB9 = iSocial2TabProtocolAbilityLJ.b9()) == null)) {
            return -2;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listB9, 10));
        Iterator it2 = listB9.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ISocialTabProtocol) it2.next()).LLJIJIL());
        }
        if (!arrayList.contains(obj.getClass())) {
            return -2;
        }
        return arrayList.indexOf(obj.getClass());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        SocialTopTabNode socialTopTabNode;
        String strLIZLLL;
        List<SocialTopTabNode> listLJJIL = LJJIL();
        if (listLJJIL != null && (socialTopTabNode = (SocialTopTabNode) C13LP.LJJJLZIJ(i, listLJJIL)) != null && (strLIZLLL = socialTopTabNode.LIZLLL()) != null) {
            return strLIZLLL;
        }
        return "";
    }

    @Override // X.C0J9V
    public final Fragment LJJIJIL(int i) {
        ISocialTabProtocol iSocialTabProtocol;
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJ;
        List listB9 = this.LLIZLLLIL;
        if ((listB9 == null && ((iSocial2TabProtocolAbilityLJ = C1583510rJF.LJ(this.LLILZLL)) == null || (listB9 = iSocial2TabProtocolAbilityLJ.b9()) == null)) || (iSocialTabProtocol = (ISocialTabProtocol) C13LP.LJJJLZIJ(i, listB9)) == null) {
            return null;
        }
        return Fragment.instantiate(this.LLILZLL, iSocialTabProtocol.LLJIJIL().getName(), iSocialTabProtocol.V9(this.LLILZLL));
    }

    @Override // X.C0J9V
    public final long LJJIJL(int i) {
        AbstractC1583720rJa abstractC1583720rJa;
        String strTag;
        List<SocialTopTabNode> listLJJIL = LJJIL();
        if (listLJJIL != null && (abstractC1583720rJa = (AbstractC1583720rJa) C13LP.LJJJLZIJ(i, listLJJIL)) != null && (strTag = abstractC1583720rJa.tag()) != null) {
            return strTag.hashCode();
        }
        return 0L;
    }

    public C1583520rJG(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.LLILZLL = context;
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
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("destroyItem remove fragment exception: ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C2344809Gs.LJFF("FriendsTabAdapter", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
