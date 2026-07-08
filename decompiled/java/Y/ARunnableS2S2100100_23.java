package Y;

import X.C08LA;
import X.C0VSJ;
import X.C1521500phE;
import X.C1521750phd;
import X.C1551360qTO;
import X.C1551940qUK;
import X.C1553130qWF;
import X.C1C7U;
import X.C2188811AlT;
import X.C797990VSb;
import android.view.View;
import com.bytedance.geckox.policy.meta.file.ChannelFileRecordSettings;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS2S2100100_23 implements Runnable {
    public final int $t;
    public long j3;
    public Object l2;
    public String s0;
    public String s1;

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

    public final void LIZ$0() {
        C1551360qTO c1551360qTO = C1551360qTO.LIZ;
        String str = this.s0;
        String str2 = this.s1;
        c1551360qTO.getClass();
        if (C1551360qTO.LJ(str, str2) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("recordLocal: skip, file record already exists:");
            sbLIZ.append(this.s0);
            sbLIZ.append(", ");
            sbLIZ.append(this.s1);
            C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.s0);
        String str3 = File.separator;
        sbLIZ2.append(str3);
        sbLIZ2.append(this.s1);
        C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ2));
        if (!c0vsj.exists()) {
            C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", "recordLocal: skip, channelDir missing:", c0vsj.getAbsolutePath());
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.j3);
        sbLIZ3.append("--compress");
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ3));
        if (c0vsj2.exists() && new C0VSJ(c0vsj2, "res.zst").exists()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("recordLocal: compressed (res.zst), skip cold-start: ");
            sbLIZ4.append(this.s0);
            sbLIZ4.append(' ');
            sbLIZ4.append(this.s1);
            sbLIZ4.append(' ');
            sbLIZ4.append(this.j3);
            C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(this.j3);
        sbLIZ5.append(str3);
        sbLIZ5.append("res");
        C0VSJ c0vsj3 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ5));
        if (!c0vsj3.isDirectory()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("recordLocal: no res dir, skip: ");
            sbLIZ6.append(c0vsj3.getAbsolutePath());
            C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ6));
            return;
        }
        List listLIZ = C08LA.LIZ(c0vsj3);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("recordLocal: apply cold-start:  ");
        sbLIZ7.append(this.s0);
        sbLIZ7.append(' ');
        sbLIZ7.append(this.s1);
        sbLIZ7.append(' ');
        sbLIZ7.append(this.j3);
        sbLIZ7.append(" bundleCount=");
        sbLIZ7.append(listLIZ.size());
        C1553130qWF.LIZ("gecko-debug-tag-ChannelFileRecord", C2188811AlT.LIZIZ(sbLIZ7));
        C1551360qTO.LIZIZ(this.s0, this.s1, this.j3, listLIZ, (ChannelFileRecordSettings) this.l2);
    }

    public static final void run$0(ARunnableS2S2100100_23 aRunnableS2S2100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("ChannelFileAccessManager@6fd1.recordLocalChannelFileRecordIfAbsent$1");
        try {
            aRunnableS2S2100100_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChannelFileAccessManager@6fd1.recordLocalChannelFileRecordIfAbsent$1");
    }

    public static final void run$1(ARunnableS2S2100100_23 aRunnableS2S2100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("HybridPageClientGroup@dddc.onSessionCreate$1");
        try {
            CopyOnWriteArrayList<C1521750phd> copyOnWriteArrayList = C1521500phE.LIZIZ;
            View view = (View) aRunnableS2S2100100_23.l2;
            String str = aRunnableS2S2100100_23.s0;
            String str2 = aRunnableS2S2100100_23.s1;
            long j = aRunnableS2S2100100_23.j3;
            Iterator<C1521750phd> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(view, str, str2, j);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HybridPageClientGroup@dddc.onSessionCreate$1");
    }

    public ARunnableS2S2100100_23(Object obj, String str, String str2, long j, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.j3 = j;
    }
}
