package X;

import Y.AComparatorS22S0000000_3;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS22S0000100_3;
import kotlin.sequences.Sequence;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2152808c2 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final C0VSJ LIZ() {
        if (this.LIZJ.length() <= 0) {
            "bbId required for draft/pending/process directories".toString();
            throw new IllegalArgumentException("bbId required for draft/pending/process directories");
        }
        C0VSJ c0vsj = new C0VSJ(LJIILJJIL(), this.LIZJ);
        c0vsj.mkdirs();
        return c0vsj;
    }

    public final C0VSJ LJFF() {
        C0VSJ c0vsj = new C0VSJ(LJIILJJIL(), "download");
        c0vsj.mkdirs();
        return c0vsj;
    }

    public final C0VSJ LJII() {
        C0VSJ c0vsj = new C0VSJ(LIZ(), "draft");
        c0vsj.mkdirs();
        return c0vsj;
    }

    public final C0VSJ LJIIIZ() {
        C0VSJ c0vsj = new C0VSJ(LIZ(), "pending");
        c0vsj.mkdirs();
        return c0vsj;
    }

    public final C0VSJ LJIILJJIL() {
        File fileW2 = C786410Ut5.w2(this.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bulletin_board/voice/");
        sbLIZ.append(this.LIZIZ);
        C0VSJ c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ));
        c0vsj.mkdirs();
        return c0vsj;
    }

    public final void LIZIZ() {
        List listLJIIJJI;
        long jCurrentTimeMillis = System.currentTimeMillis() - 2592000000L;
        if (this.LIZJ.length() == 0) {
            listLJIIJJI = Collections.singletonList(LJFF());
        } else {
            C0VSJ c0vsj = new C0VSJ(LIZ(), "process");
            c0vsj.mkdirs();
            listLJIIJJI = C1697810uHb.LJIIJJI(LJFF(), LJII(), LJIIIZ(), c0vsj);
        }
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            File[] fileArrListFiles = ((File) it2.next()).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.lastModified() < jCurrentTimeMillis) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BulletinVoiceFileStorage: cleaning expired ");
                        sbLIZ.append(file.getName());
                        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                        file.delete();
                    }
                }
            }
        }
    }

    public final void LIZJ() {
        Set<String> setLJJIIJ;
        Sequence sequenceLJIIJJI;
        long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
        File[] fileArrListFiles = LJIIIZ().listFiles();
        if (fileArrListFiles == null || (sequenceLJIIJJI = C13LQ.LJIIJJI(fileArrListFiles)) == null || (setLJJIIJ = C09RB.LJJIIJ(new C08LY(C09RB.LJIIIZ(sequenceLJIIJJI, new AwS22S0000100_3(jCurrentTimeMillis, 2)), AFwS231S0000000_3.get$arr$(215)))) == null) {
            setLJJIIJ = C08CX.INSTANCE;
        }
        for (String str : setLJJIIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceFileStorage: stale-reaping pair ");
            sbLIZ.append(str);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL(str);
        }
    }

    public final void LJ() {
        File[] fileArrListFiles = LJIIIZ().listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (u.LJIIZILJ(file.getName(), ".published", false)) {
                    arrayList.add(file);
                }
            }
            for (File file2 : arrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinVoiceFileStorage: cleaning published pending ");
                sbLIZ.append(file2.getName());
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                file2.delete();
            }
        }
    }

    public final void LJIIL() {
        File[] fileArrListFiles = LJFF().listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        long length = 0;
        for (File file : fileArrListFiles) {
            length += file.length();
        }
        if (length <= 52428800) {
            return;
        }
        for (File file2 : C13LQ.LJJLIIIIJ(new AComparatorS22S0000000_3(35), fileArrListFiles)) {
            if (length <= 41943040) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceFileStorage: LRU evicting download ");
            sbLIZ.append(file2.getName());
            sbLIZ.append(" (");
            sbLIZ.append(file2.length());
            sbLIZ.append(" bytes)");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            length -= file2.length();
            file2.delete();
        }
    }

    public final void LJIILIIL() {
        File[] fileArrListFiles = LJIIIZ().listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (u.LJIIZILJ(file.getName(), ".m4a", false) && !u.LJIIZILJ(file.getName(), ".published", false)) {
                arrayList.add(file);
            }
        }
        if (arrayList.size() <= 20) {
            return;
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(36), arrayList);
        int size = listLJLLLL.size() - 20;
        for (int i = 0; i < size; i++) {
            String strLJIJI = C08QA.LJIJI((File) ListProtector.get(listLJLLLL, i));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinVoiceFileStorage: FIFO evicting pending ");
            sbLIZ.append(strLJIJI);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL(strLJIJI);
        }
    }

    public final void LIZLLL(String str) {
        LJIIJ(str).delete();
        LJIIJJI(str).delete();
        C0VSJ c0vsjLJIIIZ = LJIIIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".m4a.published");
        new C0VSJ(c0vsjLJIIIZ, C2188811AlT.LIZIZ(sbLIZ)).delete();
        C0VSJ c0vsjLJIIIZ2 = LJIIIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(".wav.published");
        new C0VSJ(c0vsjLJIIIZ2, C2188811AlT.LIZIZ(sbLIZ2)).delete();
    }

    public final void LJIIIIZZ(String str) {
        for (File file : C1697810uHb.LJIIJJI(LJIIJ(str), LJIIJJI(str))) {
            if (file.exists()) {
                File parentFile = file.getParentFile();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(file.getName());
                sbLIZ.append(".published");
                C0VSJ c0vsj = new C0VSJ(parentFile, C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists()) {
                    c0vsj.delete();
                }
                if (file.renameTo(c0vsj)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BulletinVoiceFileStorage: marked published ");
                    sbLIZ2.append(file.getName());
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    public final C0VSJ LJIIJ(String str) {
        C0VSJ c0vsjLJIIIZ = LJIIIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".m4a");
        return new C0VSJ(c0vsjLJIIIZ, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C0VSJ LJIIJJI(String str) {
        C0VSJ c0vsjLJIIIZ = LJIIIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".wav");
        return new C0VSJ(c0vsjLJIIIZ, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C0VSJ LJI(String str, String str2) {
        C0VSJ c0vsjLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append(".m4a");
        return new C0VSJ(c0vsjLJFF, C2188811AlT.LIZIZ(sbLIZ));
    }

    public C2152808c2(Context context, String str, String str2) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
