package Y;

import X.C1C7U;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS0S2210200_24 implements Runnable {
    public final int $t;
    public long j5;
    public long j6;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S2210200_24.LIZ$0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S2210200_24.LIZ$1():void");
    }

    public static final void run$0(ARunnableS0S2210200_24 aRunnableS0S2210200_24) {
        boolean zLIZ;
        C1C7U.LIZ("FollowingLiveSkylightDoubleBigAvatarCell@23fd.logSkyLightHeadShow$1");
        try {
            aRunnableS0S2210200_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowingLiveSkylightDoubleBigAvatarCell@23fd.logSkyLightHeadShow$1");
    }

    public static final void run$1(ARunnableS0S2210200_24 aRunnableS0S2210200_24) {
        boolean zLIZ;
        C1C7U.LIZ("LiveSkylightDoubleBigAvatarCell@ec2e.logSkyLightHeadShow$1");
        try {
            aRunnableS0S2210200_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveSkylightDoubleBigAvatarCell@ec2e.logSkyLightHeadShow$1");
    }

    public ARunnableS0S2210200_24(Object obj, long j, long j2, String str, boolean z, Object obj2, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.j5 = j;
        this.j6 = j2;
        this.s0 = str;
        this.z4 = z;
        this.l3 = obj2;
        this.s1 = str2;
    }
}
