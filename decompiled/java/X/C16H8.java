package X;

import android.view.View;
import com.bytedance.poplayer.IStandardPopupTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.tag.BaseFriendsListCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS24S1201000_31;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.16H8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H8 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewDetachedFromWindow$1(C16H8 c16h8, View view) {
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
        }
    }

    public static final void onViewAttachedToWindow$0(C16H8 c16h8, View view) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C20656115sF) c16h8.l0).LLILLJJLI);
        sbLIZ.append(" change state from ");
        sbLIZ.append(((C20656115sF) c16h8.l0).LLILZLL.getState().name());
        sbLIZ.append(" to SHOWED");
        C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((C20656115sF) c16h8.l0).LLILZLL.getStateWrapper().LIZJ();
    }

    public static final void onViewAttachedToWindow$1(C16H8 c16h8, View view) {
        Object c098200Yq;
        Object c098200Yq2;
        C15NZ c15nz = (C15NZ) c16h8.l0;
        if (c15nz instanceof C20509315Nb) {
            VideoTagSearchListViewModel videoTagSearchListViewModelL5 = ((BaseFriendsListCell) c16h8.l1).L5();
            IMUser iMUser = ((C15NZ) c16h8.l0).LL;
            String uid = iMUser.getUid();
            if (uid != null && (true ^ videoTagSearchListViewModelL5.LLIZLLLIL.contains(uid))) {
                videoTagSearchListViewModelL5.LLIZLLLIL.add(uid);
                try {
                    C737520SwQ.LIZ("tag_mention_head_show", new AwS397S0200000_31(videoTagSearchListViewModelL5, iMUser, 120));
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m1boximpl(c098200Yq2);
            }
            C20509415Nc c20509415Nc = ((C20509315Nb) ((C15NZ) c16h8.l0)).LLILZ;
            if (c20509415Nc != null) {
                try {
                    C737520SwQ.LIZ("trending_words_show", new AwS24S1201000_31(c20509415Nc.LIZ, ((BaseFriendsListCell) c16h8.l1).L5(), c20509415Nc.LIZIZ, (r0.getAbsoluteAdapterPosition() - r3.LLILZ.size()) - 1, 2));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                    return;
                }
            }
            return;
        }
        if (c15nz instanceof C15NZ) {
            VideoTagFriendsListViewModel videoTagFriendsListViewModelN5 = ((BaseFriendsListCell) c16h8.l1).N5();
            IMUser iMUser2 = ((C15NZ) c16h8.l0).LL;
            String uid2 = iMUser2.getUid();
            if (uid2 != null && uid2.length() > 0 && !videoTagFriendsListViewModelN5.LLJJIII.contains(uid2)) {
                videoTagFriendsListViewModelN5.LLJJIII.add(uid2);
                try {
                    C737520SwQ.LIZ("tag_mention_head_show", new AwS397S0200000_31(videoTagFriendsListViewModelN5, iMUser2, 122));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
    }

    public static final void onViewDetachedFromWindow$0(C16H8 c16h8, View view) {
        IStandardPopupTask iStandardPopupTask;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C20656115sF) c16h8.l0).LLILLJJLI);
        sbLIZ.append(" change state from ");
        sbLIZ.append(((C20656115sF) c16h8.l0).LLILZLL.getState().name());
        sbLIZ.append(" to DISMISSED");
        C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((C20656115sF) c16h8.l0).LLILZLL.getStateWrapper().LIZ();
        InterfaceC20660515sx interfaceC20660515sx = ((C20656115sF) c16h8.l0).LLILZLL;
        if ((interfaceC20660515sx instanceof IStandardPopupTask) && (interfaceC20660515sx instanceof IStandardPopupTask) && (iStandardPopupTask = (IStandardPopupTask) interfaceC20660515sx) != null) {
            iStandardPopupTask.onPopupDismiss();
        }
        ((View) c16h8.l1).removeOnAttachStateChangeListener(c16h8);
    }

    public C16H8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
