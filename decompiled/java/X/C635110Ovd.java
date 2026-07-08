package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ovd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635110Ovd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC635180Ovk LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C635110Ovd(C635120Ove c635120Ove, int i, int i2, int i3) {
        super(0);
        this.LL = c635120Ove;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke() {
        /*
            r9 = this;
            X.0Ovk r0 = r9.LL
            r0.LIZ()
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting> r0 = com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel.LLIZLLLIL
            r2 = -1
            if (r0 == 0) goto L64
            int r7 = r9.LLILLL
            int r6 = r9.LLILZ
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L13:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r3 = r5.next()
            int r1 = r4 + 1
            if (r4 < 0) goto L30
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting) r3
            if (r3 == 0) goto L2e
            int r0 = r3.source
            if (r7 != r0) goto L2e
            int r0 = r3.subSource
            if (r6 != r0) goto L2e
            r2 = r4
        L2e:
            r4 = r1
            goto L13
        L30:
            X.C1697810uHb.LJIJI()
            r0 = 0
            throw r0
        L35:
            if (r2 < 0) goto L64
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting> r0 = com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel.LLIZLLLIL
            if (r0 == 0) goto L64
            int r0 = r0.size()
            if (r2 >= r0) goto L64
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting> r0 = com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel.LLIZLLLIL
            if (r0 == 0) goto L77
            java.lang.Object r3 = X.C13LP.LJJJLZIJ(r2, r0)
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting) r3
            if (r3 == 0) goto L77
            int r4 = r9.LLILLJJLI
            java.lang.String r5 = r3.text
            int r6 = r3.source
            int r7 = r3.subSource
            java.lang.String r8 = r3.subSourceLabel
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting r0 = r3.copy(r4, r5, r6, r7, r8)
            if (r0 == 0) goto L77
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting> r1 = com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel.LLIZLLLIL
            if (r1 == 0) goto L64
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r2, r0)
        L64:
            X.0Odr r4 = new X.0Odr
            X.0Odv r3 = new X.0Odv
            int r2 = r9.LLILLL
            int r1 = r9.LLILZ
            int r0 = r9.LLILLJJLI
            r3.<init>(r2, r1, r0)
            r4.<init>(r3)
            X.C1440005kM.LIZ(r4)
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C635110Ovd.invoke():java.lang.Object");
    }
}
