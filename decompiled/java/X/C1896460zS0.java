package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.ActivityTask;
import java.util.List;

/* JADX INFO: renamed from: X.0zS0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896460zS0 extends C1896480zS2 {
    public static final C01GW<C1896460zS0> LLJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1896540zS8());

    @Override // X.C1896480zS2
    public final boolean LJIJJ() {
        return false;
    }

    @Override // X.C1896480zS2
    public final boolean LJIL() {
        return false;
    }

    @Override // X.C1896480zS2
    public final ActivityTask LJIIL() {
        List<ActivityTask> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ActivityTask) ListProtector.get(this.LLILZ, 0);
    }

    @Override // X.InterfaceC1895240zQ2
    public final void LJFF(List list) {
        LJIIZILJ("incentive_share_task", "current_task_time", "task_total_time", "", "background_task_date", "task_total_time");
        LJIJJLI(list);
    }

    @Override // X.C1896480zS2
    public final void LJIJ(List<ActivityTask> list) {
        this.LLILZ = C1896850zSd.LIZIZ(17, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(long r15, java.lang.String r17, java.lang.String r18) {
        /*
            r14 = this;
            java.util.List<com.bytedance.touchpoint.api.model.ActivityTask> r0 = r14.LLILZ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lb3
            java.util.List<com.bytedance.touchpoint.api.model.ActivityTask> r1 = r14.LLILZ
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            com.bytedance.touchpoint.api.model.ActivityTask r0 = (com.bytedance.touchpoint.api.model.ActivityTask) r0
            int r5 = r0.taskType
            java.lang.String r6 = r0.taskKey
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.bytedance.touchpoint.api.model.Item r4 = new com.bytedance.touchpoint.api.model.Item
            java.lang.String r7 = ""
            long r12 = java.lang.System.currentTimeMillis()
            r11 = 0
            r3 = r5
            r8 = r17
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            r2.add(r4)
            com.bytedance.touchpoint.api.model.TaskInfo r1 = new com.bytedance.touchpoint.api.model.TaskInfo
            r5 = r18
            int r4 = r5.hashCode()
            r0 = -485371922(0xffffffffe311cfee, float:-2.6897608E21)
            if (r4 == r0) goto La7
            r0 = 417874450(0x18e84212, float:6.003731E-24)
            if (r4 == r0) goto L9d
            r0 = 527528074(0x1f71708a, float:5.1126825E-20)
            if (r4 != r0) goto Lb1
            java.lang.String r0 = "gameplay_detail"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb1
            r0 = 3
        L4f:
            r1.<init>(r3, r6, r0, r2)
            com.bytedance.touchpoint.api.model.ActivityTask r0 = r14.LJIIL()
            if (r0 == 0) goto L9c
            java.lang.String r7 = r0.taskKey
            if (r7 == 0) goto L9c
            r0 = 3
            kotlin.jvm.internal.AFwS271S0000000_28 r6 = kotlin.jvm.internal.AFwS271S0000000_28.get$arr$(r0)
            r0 = 2
            kotlin.jvm.internal.AFwS271S0000000_28 r5 = kotlin.jvm.internal.AFwS271S0000000_28.get$arr$(r0)
            X.01GW r0 = r14.LLJILLL
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            X.0zRv r0 = new X.0zRv
            r0.<init>()
            X.11Kf r4 = X.C11NZ.LJIJJLI(r0)
            X.0zXy r3 = new X.0zXy
            r1 = 3000(0xbb8, double:1.482E-320)
            r0 = 2
            r3.<init>(r0, r1)
            X.11QK r1 = r4.LJJLIIIJLJLI(r3)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.0zRx r0 = new X.0zRx
            r0.<init>()
            r1.LIZIZ(r0)
        L9c:
            return
        L9d:
            java.lang.String r0 = "feed_detail"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb1
            r0 = 2
            goto L4f
        La7:
            java.lang.String r0 = "homepage"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb1
            r0 = 1
            goto L4f
        Lb1:
            r0 = 0
            goto L4f
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1896460zS0.LJJIFFI(long, java.lang.String, java.lang.String):void");
    }
}
