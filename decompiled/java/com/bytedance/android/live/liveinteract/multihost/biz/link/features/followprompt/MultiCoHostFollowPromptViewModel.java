package com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt;

import X.C1559260qg8;
import X.C963290bAt;
import X.C963810bBj;
import X.C964290bCV;
import X.InterfaceC0148002o;
import X.InterfaceC963820bBk;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.DisplayUserInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostFollowPromptViewModel extends AssemViewModel<C964290bCV> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C963290bAt.class, (Class<Object>) null, (String) 13), true);

    public final C963290bAt vQ2() {
        return (C963290bAt) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        List<DisplayUserInfo> list = vQ2().LLILLJJLI.LIZ.LIZ.displayUserInfos;
        ArrayList arrayList = new ArrayList();
        Iterator<DisplayUserInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            User user = it2.next().userData;
            if (user != null && user.getId() != 0) {
                long id = user.getId();
                FollowInfo followInfo = user.getFollowInfo();
                arrayList.add(new C963810bBj(id, followInfo != null ? (int) followInfo.getFollowStatus() : 0, user));
            }
        }
        vQ2().LLILZ.LIZLLL = arrayList;
        return new C964290bCV(arrayList.size() <= 2, arrayList, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        runOnUIThread(new AwS594S0100000_15(this, 661));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[PHI: r1
      0x0023: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:3:0x0012, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(X.C963810bBj r4) {
        /*
            r3 = this;
            X.0bAt r0 = r3.vQ2()
            X.0bAr r1 = r0.LLILZ
            java.lang.String r0 = "follow_prompt_after_cohost_anchor_click"
            X.0IjA r0 = r1.LIZIZ(r0, r4)
            r0.LIZ()
            int r2 = r4.LIZIZ
            r1 = 1
            if (r2 == 0) goto L23
            if (r2 == r1) goto L21
            r1 = 3
            r0 = 2
            if (r2 == r0) goto L23
            if (r2 != r1) goto L1d
            r2 = 2
        L1d:
            r3.xQ2(r4, r2)
            return
        L21:
            r2 = 0
            goto L1d
        L23:
            r2 = r1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptViewModel.wQ2(X.0bBj):void");
    }

    public final void xQ2(C963810bBj c963810bBj, int i) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC963820bBk interfaceC963820bBk : getState().LLILLJJLI) {
            if (interfaceC963820bBk instanceof C963810bBj) {
                C963810bBj c963810bBj2 = (C963810bBj) interfaceC963820bBk;
                long j = c963810bBj2.LIZ;
                if (j == c963810bBj.LIZ) {
                    User user = c963810bBj2.LIZJ;
                    c963810bBj2.getClass();
                    C963810bBj c963810bBj3 = new C963810bBj(j, i, user);
                    FollowInfo followInfo = user.getFollowInfo();
                    if (followInfo != null) {
                        followInfo.setFollowStatus(i);
                    }
                    arrayList.add(c963810bBj3);
                }
            }
            arrayList.add(interfaceC963820bBk);
        }
        setStateImmediate(new AwS594S0100000_15(arrayList, (List<InterfaceC963820bBk>) 468));
    }
}
