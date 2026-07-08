package X;

import com.bytedance.android.btm.api.config.BtmEventConfigModel;

/* JADX INFO: renamed from: X.18Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class RunnableC21244718Bx implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        BtmEventConfigModel btmEventConfigModelLIZ;
        C1C7U.LIZ("BtmLibra@3666.scheduleNextPoll$1L");
        int[] iArr = C21244618Bw.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pollEventConfig, time:");
        sbLIZ.append(C21244618Bw.LIZJ + 1);
        C18CK.LIZJ("BtmLibra", new C18C0(C2188811AlT.LIZIZ(sbLIZ)), false);
        C18IP c18ip = C18IP.LIZ;
        c18ip.getClass();
        InterfaceC21244918Bz interfaceC21244918Bz = (InterfaceC21244918Bz) C18IP.LJII.getValue(c18ip, C18IP.LIZIZ[4]);
        if (interfaceC21244918Bz != null && (btmEventConfigModelLIZ = interfaceC21244918Bz.LIZ()) != null) {
            C21244618Bw.LIZIZ(btmEventConfigModelLIZ);
        }
        int i = C21244618Bw.LIZJ + 1;
        C21244618Bw.LIZJ = i;
        int i2 = i < 4 ? C21244618Bw.LIZ[i] : 60;
        C18GU c18gu = C18GU.LIZ;
        RunnableC21244718Bx runnableC21244718Bx = new RunnableC21244718Bx();
        c18gu.getClass();
        C18GU.LIZLLL(((long) i2) * 60000, runnableC21244718Bx);
        C1C7U.LIZIZ("BtmLibra@3666.scheduleNextPoll$1L");
    }
}
