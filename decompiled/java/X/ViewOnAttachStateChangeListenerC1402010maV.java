package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.ui.IMDPMobAbility;
import com.ss.android.ugc.aweme.music.ui.MDPSquareShowMoreViewHolder;
import com.ss.android.ugc.aweme.music.ui.MDPSquareShowMoreViewHolder$bindAweme$lifecycleObserver$1;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0maV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewOnAttachStateChangeListenerC1402010maV implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
        }
    }

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
        Lifecycle lifecycleDy;
        MDPSquareShowMoreViewHolder mDPSquareShowMoreViewHolder = (MDPSquareShowMoreViewHolder) viewOnAttachStateChangeListenerC1402010maV.l0;
        mDPSquareShowMoreViewHolder.LLJ = false;
        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(mDPSquareShowMoreViewHolder.itemView, null), IMDPMobAbility.class, null);
        if (iMDPMobAbility != null && (lifecycleDy = iMDPMobAbility.dy()) != null) {
            lifecycleDy.addObserver((MDPSquareShowMoreViewHolder$bindAweme$lifecycleObserver$1) viewOnAttachStateChangeListenerC1402010maV.l1);
        }
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
        String aid;
        String enterFrom;
        String str;
        int iLIZ;
        String aid2;
        String aid3;
        NowPostInfo nowPostInfo;
        Context context;
        INowsTabService iNowsTabService = (INowsTabService) ServiceManager.get().getService(INowsTabService.class);
        View view2 = ((C1352950lJN) viewOnAttachStateChangeListenerC1402010maV.l0).LIZLLL;
        if (view2 != null && (context = view2.getContext()) != null) {
            C1388190mED.LIZIZ(context);
        }
        int iLIZLLL = iNowsTabService.LIZLLL(((C1352960lJO) viewOnAttachStateChangeListenerC1402010maV.l1).LL);
        C1352960lJO c1352960lJO = (C1352960lJO) viewOnAttachStateChangeListenerC1402010maV.l1;
        Aweme aweme = c1352960lJO.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        NowFeedMobHierarchyData nowFeedMobHierarchyData = ((C1352960lJO) viewOnAttachStateChangeListenerC1402010maV.l1).LLILLJJLI;
        if (nowFeedMobHierarchyData == null || (enterFrom = nowFeedMobHierarchyData.getEnterFrom()) == null) {
            enterFrom = "";
        }
        Aweme aweme2 = ((C1352960lJO) viewOnAttachStateChangeListenerC1402010maV.l1).LL;
        String authorUid = null;
        if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null) {
            str = nowPostInfo.nowMediaType;
        } else {
            str = null;
        }
        if (aweme2 != null) {
            iLIZ = C1352480lIc.LIZ(aweme2);
        } else {
            iLIZ = 1;
        }
        Map<String, Set<String>> map = C07ME.LIZ;
        Set set = (Set) ((LinkedHashMap) map).get(aid);
        if (set != null) {
            Aweme aweme3 = c1352960lJO.LL;
            if (aweme3 != null) {
                aid3 = aweme3.getAid();
            } else {
                aid3 = null;
            }
            if (C13LP.LJJJJ(aid3, set)) {
                return;
            }
        }
        if (!map.containsKey(aid)) {
            map.put(aid, new LinkedHashSet());
        }
        Set set2 = (Set) ((LinkedHashMap) map).get(aid);
        Aweme aweme4 = c1352960lJO.LL;
        if (aweme4 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme4);
        }
        C1350960lGA.LJFF(iLIZLLL, iLIZ, enterFrom, "caption", authorUid, str);
        Aweme aweme5 = c1352960lJO.LL;
        if (aweme5 == null || (aid2 = aweme5.getAid()) == null || set2 == null) {
            return;
        }
        set2.add(aid2);
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
        View view2 = (View) viewOnAttachStateChangeListenerC1402010maV.l0;
        C786410Ut5.w3(view2.getViewTreeObserver(), new C0T6C(view2, new AwS591S0100000_12((Function1) viewOnAttachStateChangeListenerC1402010maV.l1, (Function1<? super LiveEffect, Unit>) 1238)));
        ((View) viewOnAttachStateChangeListenerC1402010maV.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1402010maV);
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
        Lifecycle lifecycleDy;
        MDPSquareShowMoreViewHolder mDPSquareShowMoreViewHolder = (MDPSquareShowMoreViewHolder) viewOnAttachStateChangeListenerC1402010maV.l0;
        mDPSquareShowMoreViewHolder.LLJ = false;
        IMDPMobAbility iMDPMobAbility = (IMDPMobAbility) C1558520qew.LIZ(C1558360qeg.LJ(mDPSquareShowMoreViewHolder.itemView, null), IMDPMobAbility.class, null);
        if (iMDPMobAbility != null && (lifecycleDy = iMDPMobAbility.dy()) != null) {
            lifecycleDy.removeObserver((MDPSquareShowMoreViewHolder$bindAweme$lifecycleObserver$1) viewOnAttachStateChangeListenerC1402010maV.l1);
        }
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1402010maV viewOnAttachStateChangeListenerC1402010maV, View view) {
        InterfaceC661560PxC interfaceC661560PxC = ((C1398240mUQ) viewOnAttachStateChangeListenerC1402010maV.l0).LLLFZ;
        if (interfaceC661560PxC != null) {
            interfaceC661560PxC.LJI(0);
        }
        InterfaceC661560PxC interfaceC661560PxC2 = ((C1398240mUQ) viewOnAttachStateChangeListenerC1402010maV.l0).LLLFZ;
        if (interfaceC661560PxC2 != null) {
            interfaceC661560PxC2.onCleared();
        }
        Aweme aweme = (Aweme) viewOnAttachStateChangeListenerC1402010maV.l1;
        if (aweme != null) {
            C584710MwX.LIZIZ(0, aweme.getAid(), "photo");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnAttachStateChangeListenerC1402010maV(Object obj, V v, Function1<? super V, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = v;
    }
}
