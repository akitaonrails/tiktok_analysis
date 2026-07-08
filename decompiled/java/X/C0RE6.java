package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.interact.InteractContainerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RE6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RE6 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ InteractContainerComponent LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RE6(InteractContainerComponent interactContainerComponent, View view) {
        super(1);
        this.LL = interactContainerComponent;
        this.LLILLJJLI = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.bytedance.assem.arch.core.Assembler r6) {
        /*
            r5 = this;
            com.bytedance.assem.arch.core.Assembler r6 = (com.bytedance.assem.arch.core.Assembler) r6
            boolean r0 = X.C1157604fu.LIZ()
            if (r0 == 0) goto L3e
            X.0Ruh r1 = X.C710970Ruh.LJ
            com.ss.android.ugc.feed.platform.cell.interact.InteractContainerComponent r0 = r5.LL
            java.lang.Object r0 = X.C631370Opb.LIZ(r0)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r0 = r0.getAid()
            r1.getClass()
            boolean r0 = X.C710970Ruh.LIZ(r0)
            if (r0 == 0) goto L3e
            com.ss.android.ugc.feed.platform.cell.interact.InteractContainerComponent r3 = r5.LL
            kotlin.jvm.internal.AwS377S0200000_11 r2 = new kotlin.jvm.internal.AwS377S0200000_11
            android.view.View r1 = r5.LLILLJJLI
            r0 = 73
            r2.<init>(r3, r1, r0)
            X.C0RI6.LIZ(r6, r3, r2)
        L31:
            com.ss.android.ugc.feed.platform.cell.interact.InteractContainerComponent r1 = r5.LL
            X.0RAy r0 = new X.0RAy
            r0.<init>()
            r6.LQ2(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            long r2 = X.C0RQN.LJFF()
            com.ss.android.ugc.feed.platform.cell.interact.InteractContainerComponent r4 = r5.LL
            X.0REE r1 = new X.0REE
            android.view.View r0 = r5.LLILLJJLI
            r1.<init>(r4, r2, r0)
            r6.LQ2(r4, r1)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RE6.invoke(java.lang.Object):java.lang.Object");
    }
}
