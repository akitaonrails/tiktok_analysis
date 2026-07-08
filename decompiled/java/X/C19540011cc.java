package X;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19540011cc extends AbstractC1219760hqY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final String LJIIIZ;
    public final C19523211Zu LJIIJ = new C19523211Zu(this, "DownloadAudioFile");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19540011cc.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPDownloadAudioFileAbility;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC19524311a5
    public final String LJIILLIIL() {
        return this.LJIIIZ;
    }

    public C19540011cc(String str) {
        this.LJIIIZ = str;
    }

    @Override // X.AbstractC1219760hqY
    public final Object LJJIJL(List list) {
        boolean z;
        String str;
        Iterator it2 = list.iterator();
        loop0: while (true) {
            z = true;
            while (it2.hasNext()) {
                InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) it2.next();
                if (!z || (str = (String) LJJIII(interfaceC19526611aS, "VC_FILE_PATH")) == null || str.length() <= 0) {
                    z = false;
                }
            }
        }
        if (z) {
            return "_CONNECT_ID_DEFAULT";
        }
        return "_CONNECT_ID_TERMINATION_ERROR";
    }

    @Override // X.AbstractC19526011aM
    public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        String str;
        if (c11zu == null || (str = (String) LJJIII(interfaceC19526611aS, "SPEAKER_ID")) == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19526611aS.LJJ());
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        long jUptimeMillis = SystemClock.uptimeMillis();
        C11ZT<?> c11zt = c11zu.LIZ.get(strLIZIZ);
        Object obj = null;
        if (c11zt != null) {
            Integer num = c11zt.LIZIZ;
            if (num == null) {
                Object obj2 = c11zt.LIZ;
                if (obj2 instanceof String) {
                    obj = obj2;
                }
            } else if (jUptimeMillis - c11zt.LIZJ < ((long) num.intValue()) * 1000) {
                Object obj3 = c11zt.LIZ;
                if (obj3 instanceof String) {
                    obj = obj3;
                }
            }
        }
        LJJIJIIJI(interfaceC19526611aS, "VC_FILE_PATH", obj);
        if (obj == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC19526011aM
    public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
        Object objLJJIII;
        String str;
        if (c11zu == null || (objLJJIII = LJJIII(interfaceC19526611aS, "VC_FILE_PATH")) == null || (str = (String) LJJIII(interfaceC19526611aS, "SPEAKER_ID")) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19526611aS.LJJ());
        sbLIZ.append(str);
        c11zu.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), objLJJIII);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    @Override // X.AbstractC1219760hqY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIL(X.InterfaceC19526511aR r21, X.InterfaceC19526611aS r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19540011cc.LJJIJIL(X.11aR, X.11aS, X.05Vn):java.lang.Object");
    }
}
