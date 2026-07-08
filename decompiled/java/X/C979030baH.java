package X;

import Y.AComparatorS514S0100000_15;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIsPlaybookFoldable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.0baH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979030baH {
    public static final /* synthetic */ int LJIIJ = 0;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public Playbook LJIIIZ;
    public C979040baI LIZ = new C979040baI();
    public final C979060baK LIZIZ = new Object() { // from class: X.0baK
    };
    public List<Playbook> LIZJ = C13BV.INSTANCE;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;

    static {
        new C979070baL();
    }

    public final void LJFF() {
        this.LIZLLL = false;
        this.LJII = true;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LIZJ = C13BV.INSTANCE;
        this.LJIIIZ = null;
        this.LIZ = new C979040baI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<webcast.data.multi_guest_play.Playbook>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final Pair<Integer, Integer> LIZIZ(C410901il c410901il) {
        Long lValueOf;
        ?? arrayList;
        int size = c410901il.size();
        Playbook playbook = this.LJIIIZ;
        if (playbook != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            List<Playbook> list = this.LIZJ;
            arrayList = new ArrayList();
            for (Playbook playbook2 : list) {
                Playbook playbook3 = playbook2;
                Playbook playbook4 = this.LJIIIZ;
                if (playbook4 == null || playbook3.playbookId != playbook4.playbookId) {
                    arrayList.add(playbook2);
                }
            }
        } else {
            arrayList = this.LIZJ;
        }
        Long lLIZJ = C978340bZA.LIZJ(false);
        ?? LJLLLL = arrayList;
        if (lLIZJ != null) {
            LJLLLL = C13LP.LJLLLL(new AComparatorS514S0100000_15(lLIZJ, 2), arrayList);
        }
        for (final Playbook playbook5 : LJLLLL) {
            c410901il.add(new C20390914qZ(playbook5) { // from class: X.0bbw
            });
        }
        return new Pair<>(Integer.valueOf(size), Integer.valueOf(LJLLLL.size()));
    }

    public final void LIZJ(C410901il c410901il) {
        if (C915980Zwa.LIZLLL().UN0() && !C915980Zwa.LIZLLL().AR0()) {
            C20441214yg.LIZIZ("MatchPlaybookEntranceHelper", "addPlaybookModule, currently in CHxMG, match playbooks disabled");
            return;
        }
        final Playbook playbook = this.LJIIIZ;
        if (playbook != null) {
            c410901il.add(new C20390914qZ(playbook) { // from class: X.0bbx
            });
        }
        if (!this.LJIIIIZZ) {
            if (!this.LIZJ.isEmpty()) {
                LIZIZ(c410901il);
                return;
            } else {
                c410901il.add(this.LIZIZ);
                return;
            }
        }
        if (!this.LJII) {
            LIZ(c410901il, true);
            if (!this.LIZJ.isEmpty()) {
                LIZIZ(c410901il);
                return;
            } else {
                c410901il.add(this.LIZIZ);
                return;
            }
        }
        if (!(!this.LIZJ.isEmpty())) {
            return;
        }
        LIZ(c410901il, false);
        if (LiveMatchIsPlaybookFoldable.INSTANCE.isEnabled()) {
            return;
        }
        LIZIZ(c410901il);
    }

    public final Pair<Integer, Integer> LJ(C410901il c410901il) {
        int iNextIndex;
        boolean z = !this.LIZLLL;
        this.LIZLLL = z;
        this.LIZ.LIZ = !z ? 1 : 0;
        if (z) {
            this.LJI = this.LJ;
            return LIZIZ(c410901il);
        }
        this.LJI = this.LJFF;
        Iterator<Object> it2 = c410901il.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next() instanceof C980060bbw) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        ListIterator<Object> listIterator = c410901il.listIterator(c410901il.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous() instanceof C980060bbw) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        int i2 = (iNextIndex - i) + 1;
        if (i != -1 && iNextIndex != -1 && iNextIndex >= i) {
            c410901il.subList(i, iNextIndex + 1).clear();
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void LIZLLL(C979030baH c979030baH, int i) {
        boolean z;
        List<Playbook> listLJ;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        c979030baH.LJFF();
        c979030baH.LJII = z;
        c979030baH.LJIIIIZZ = z2;
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF == null || (listLJ = interfaceC975870bVBLJFF.LJ()) == null) {
            listLJ = C13BV.INSTANCE;
        }
        c979030baH.LIZJ = listLJ;
    }

    public final void LIZ(C410901il c410901il, boolean z) {
        String str;
        String str2;
        boolean z2 = false;
        if (!z && LiveMatchIsPlaybookFoldable.INSTANCE.isEnabled()) {
            C979040baI c979040baI = this.LIZ;
            PlaybookContent playbookContent = ((Playbook) ListProtector.get(this.LIZJ, 0)).content;
            String str3 = "";
            if (playbookContent == null || (str = playbookContent.coverUrl) == null) {
                str = "";
            }
            c979040baI.LIZIZ = str;
            if (this.LIZJ.size() >= 2) {
                C979040baI c979040baI2 = this.LIZ;
                PlaybookContent playbookContent2 = ((Playbook) ListProtector.get(this.LIZJ, 1)).content;
                if (playbookContent2 != null && (str2 = playbookContent2.coverUrl) != null) {
                    str3 = str2;
                }
                c979040baI2.LIZJ = str3;
            }
            this.LIZ.LIZ = 1;
        } else {
            this.LIZ.LIZ = 2;
        }
        C979040baI c979040baI3 = this.LIZ;
        Playbook playbook = this.LJIIIZ;
        if (playbook != null && Long.valueOf(playbook.playbookId) != null) {
            z2 = true;
        }
        c979040baI3.LIZLLL = z2;
        c410901il.add(this.LIZ);
    }
}
