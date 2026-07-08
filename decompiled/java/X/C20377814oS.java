package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS49S0200100_31;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20377814oS {
    public final DataChannel LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(442));
    public final C20425514w9 LIZJ;
    public final C20359714lX LIZLLL;
    public C20379114of LJ;
    public PlaybookContent LJFF;
    public int LJI;
    public final CopyOnWriteArraySet<InterfaceC20378014oU> LJII;

    public final C20379114of LIZ() {
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        String str;
        List<C20425114w5> list2;
        C20425114w5 c20425114w5LIZIZ;
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", "autoAddStepCondition", null, null);
        String strLJIIJJI = C20359314lT.LJIIJJI(new Condition("countdown_check", null, null, 10));
        C20379114of c20379114of = this.LJ;
        if (c20379114of != null && (c20360614lg = c20379114of.LIZIZ) != null && (list = c20360614lg.LIZIZ) != null) {
            C20426114wF c20426114wFLJII = null;
            for (C20359414lU c20359414lU : list) {
                if (c20359414lU.LIZJ.isEmpty() && ((str = c20359414lU.LJ) == null || str.length() == 0)) {
                    c20359414lU.LJ = strLJIIJJI;
                    C20426114wF c20426114wFLJ = this.LIZJ.LJ();
                    if (c20426114wFLJ != null && (list2 = c20426114wFLJ.LIZLLL) != null && (c20425114w5LIZIZ = C20379214og.LIZIZ(Long.valueOf(c20359414lU.LIZ), list2)) != null) {
                        C20424714w1 c20424714w1 = c20425114w5LIZIZ.LIZLLL;
                        if (c20424714w1 != null) {
                            c20424714w1.LJ = c20359414lU.LJ;
                        }
                        c20426114wFLJII = this.LIZJ.LJII(c20425114w5LIZIZ);
                    }
                }
            }
            if (c20426114wFLJII != null) {
                C20379114of c20379114of2 = this.LJ;
                if (c20379114of2 != null) {
                    PlaybookUtilKt.LJIIJJI(c20379114of2, this.LIZLLL, c20426114wFLJII);
                }
                LIZIZ();
                return this.LJ;
            }
        }
        return null;
    }

    public final void LIZIZ() {
        Iterator<InterfaceC20378014oU> it2 = this.LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this.LJ);
        }
    }

    public final String LIZJ() {
        String strLIZLLL;
        C20426114wF c20426114wFLJ = this.LIZJ.LJ();
        return (c20426114wFLJ == null || (strLIZLLL = this.LIZJ.LIZLLL(c20426114wFLJ)) == null) ? "" : strLIZLLL;
    }

    public final C11NJ LIZLLL() {
        return (C11NJ) this.LIZIZ.getValue();
    }

    public final boolean LJ() {
        return this.LIZLLL.LJIIJ.size() > 0;
    }

    public final C20379114of LJI(List<Long> list) {
        C20379114of c20379114of;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeSteps step size=");
        sbLIZ.append(list.size());
        C20426114wF c20426114wF = null;
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20379114of c20379114of2 = this.LJ;
        if (c20379114of2 == null || c20379114of2.LIZIZ == null) {
            return null;
        }
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            C20426114wF c20426114wFLJIIL = this.LIZJ.LJIIL(it2.next().longValue());
            if (c20426114wFLJIIL != null) {
                c20426114wF = c20426114wFLJIIL;
            }
        }
        if (c20426114wF != null && (c20379114of = this.LJ) != null) {
            PlaybookUtilKt.LJIIJJI(c20379114of, this.LIZLLL, c20426114wF);
        }
        LIZIZ();
        return this.LJ;
    }

    public C20377814oS(DataChannel dataChannel, WeakReference<Context> weakReference) {
        this.LIZ = dataChannel;
        InterfaceC20356214ky interfaceC20356214ky = new InterfaceC20356214ky() { // from class: X.14oT
            @Override // X.InterfaceC20356214ky
            public final void LIZ(C20361314ln c20361314ln, long j) {
                C403501hZ.LIZ(new AwS49S0200100_31(this.LIZ, j, c20361314ln, 2));
            }
        };
        this.LIZJ = new C20425514w9(new C20378214oW(this));
        this.LIZLLL = new C20359714lX(weakReference, dataChannel, interfaceC20356214ky, null, null, null, null, null);
        this.LJII = new CopyOnWriteArraySet<>();
    }

    public final void LJFF(C20359414lU c20359414lU, C20361214lm c20361214lm) {
        C20426114wF c20426114wFLJ;
        List<C20425114w5> list;
        C20425114w5 c20425114w5LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modifyState step=");
        sbLIZ.append(c20359414lU);
        sbLIZ.append(" task=");
        sbLIZ.append(c20361214lm);
        C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
        C20379114of c20379114of = this.LJ;
        if (c20379114of != null && c20379114of.LIZIZ != null && (c20426114wFLJ = this.LIZJ.LJ()) != null && (list = c20426114wFLJ.LIZLLL) != null && (c20425114w5LIZIZ = C20379214og.LIZIZ(Long.valueOf(c20361214lm.LIZIZ), list)) != null) {
            C20424814w2 c20424814w2 = c20425114w5LIZIZ.LIZJ;
            if (c20424814w2 != null) {
                c20424814w2.LJII = c20361214lm.LJI;
                c20424814w2.LJIIIIZZ = c20361214lm.LJII;
            }
            C20426114wF c20426114wFLJII = this.LIZJ.LJII(c20425114w5LIZIZ);
            C20379114of c20379114of2 = this.LJ;
            if (c20379114of2 != null) {
                PlaybookUtilKt.LJIIJJI(c20379114of2, this.LIZLLL, c20426114wFLJII);
            }
            LIZIZ();
        }
    }

    public final void LJII(C20379114of c20379114of, String str) {
        PlaybookContent playbookContent;
        int size;
        List<C20359414lU> list;
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlaybookDetail, source=");
        sbLIZ.append(str);
        sbLIZ.append(", playbookDetail=");
        sbLIZ.append(c20379114of);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("Editor_PlaybookEditorModel", strLIZIZ, null, null);
        PlaybookContent playbookContent2 = c20379114of.LIZ.content;
        if (playbookContent2 != null) {
            playbookContent = new PlaybookContent();
            playbookContent.title = playbookContent2.title;
            playbookContent.description = playbookContent2.description;
            playbookContent.coverUri = playbookContent2.coverUri;
            playbookContent.coverUrl = playbookContent2.coverUrl;
            playbookContent.flowStr = playbookContent2.flowStr;
            playbookContent.textType = playbookContent2.textType;
        } else {
            playbookContent = null;
        }
        this.LJFF = playbookContent;
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (C20359414lU c20359414lU : list) {
                if (!C20374514nv.LJI(c20359414lU)) {
                    arrayList.add(c20359414lU);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        this.LJI = size;
        this.LJ = c20379114of;
        LIZIZ();
    }
}
