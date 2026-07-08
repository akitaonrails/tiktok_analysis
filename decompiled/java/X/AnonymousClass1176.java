package X;

import Y.ACListenerS163S0100000_29;
import android.os.Handler;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1176, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1176 extends AnonymousClass1173 implements AnonymousClass1178 {
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public TypeWords LJII;
    public boolean LJIIIIZZ;

    @Override // X.AnonymousClass1173
    public final void LIZJ() {
        this.LIZIZ = false;
        AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
        if (anonymousClass1177LJIIIIZZ != null) {
            ((Handler) anonymousClass1177LJIIIIZZ.LJI.getValue()).removeCallbacks((Runnable) anonymousClass1177LJIIIIZZ.LJIIIIZZ.getValue());
        }
    }

    @Override // X.AnonymousClass1173
    public final void LIZLLL() {
        AnonymousClass1177 anonymousClass1177LJIIIIZZ;
        this.LIZIZ = true;
        LinearLayout linearLayoutLJIIIZ = LJIIIZ();
        if (linearLayoutLJIIIZ == null || linearLayoutLJIIIZ.getVisibility() != 0 || (anonymousClass1177LJIIIIZZ = LJIIIIZZ()) == null) {
            return;
        }
        AnonymousClass1177.LIZ(anonymousClass1177LJIIIIZZ);
    }

    @Override // X.AnonymousClass1173
    public final void LJ() {
        LinearLayout linearLayoutLJIIIZ;
        this.LIZIZ = true;
        if (this.LJIIIIZZ || (linearLayoutLJIIIZ = LJIIIZ()) == null || linearLayoutLJIIIZ.getVisibility() != 0) {
            this.LJIIIIZZ = false;
            return;
        }
        AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
        if (anonymousClass1177LJIIIIZZ != null) {
            AnonymousClass1177.LIZ(anonymousClass1177LJIIIIZZ);
        }
    }

    @Override // X.AnonymousClass1173
    public final void LJFF() {
        this.LIZIZ = false;
        AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
        if (anonymousClass1177LJIIIIZZ != null) {
            ((Handler) anonymousClass1177LJIIIIZZ.LJI.getValue()).removeCallbacks((Runnable) anonymousClass1177LJIIIIZZ.LJIIIIZZ.getValue());
        }
        this.LJIIIIZZ = true;
    }

    @Override // X.AnonymousClass1173
    public final void LJI() {
        this.LIZIZ = false;
        AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
        if (anonymousClass1177LJIIIIZZ != null) {
            ((Handler) anonymousClass1177LJIIIIZZ.LJI.getValue()).removeCallbacks((Runnable) anonymousClass1177LJIIIIZZ.LJIIIIZZ.getValue());
        }
    }

    public final AnonymousClass1177 LJIIIIZZ() {
        return (AnonymousClass1177) this.LJI.getValue();
    }

    public final LinearLayout LJIIIZ() {
        return (LinearLayout) this.LIZLLL.getValue();
    }

    public final void LJIIJ() {
        AnonymousClass1177 anonymousClass1177LJIIIIZZ;
        if (!this.LIZIZ || (anonymousClass1177LJIIIIZZ = LJIIIIZZ()) == null) {
            return;
        }
        AnonymousClass1177.LIZ(anonymousClass1177LJIIIIZZ);
    }

    public AnonymousClass1176(C194483116z c194483116z) {
        super(c194483116z);
        this.LIZLLL = C452501pT.LIZIZ(new AwS573S0100000_29(c194483116z, 1074));
        this.LJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1076));
        this.LJFF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1075));
        this.LJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1073));
        LinearLayout linearLayoutLJIIIZ = LJIIIZ();
        if (linearLayoutLJIIIZ != null) {
            C786410Ut5.R7(linearLayoutLJIIIZ, new ACListenerS163S0100000_29(c194483116z, 307));
        }
        AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
        if (anonymousClass1177LJIIIIZZ != null) {
            anonymousClass1177LJIIIIZZ.LIZJ = 3000L;
            ((ArrayList) anonymousClass1177LJIIIIZZ.LJII).add(this);
        }
    }

    @Override // X.AnonymousClass1178
    public final void LIZ(int i) {
        List<Word> list;
        String str;
        TypeWords typeWords = this.LJII;
        if (typeWords != null && (list = typeWords.words) != null) {
            String str2 = null;
            if (!list.isEmpty()) {
                int size = list.size();
                if (i < 0 || i >= size) {
                    i = 0;
                }
                AnonymousClass1175 anonymousClass1175 = this.LIZ.LIZIZ;
                String id = ((Word) ListProtector.get(list, i)).getId();
                AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
                if (anonymousClass1177LJIIIIZZ != null) {
                    str = anonymousClass1177LJIIIIZZ.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                anonymousClass1175.LIZJ(new Word(id, str));
                Pair[] pairArr = new Pair[6];
                pairArr[0] = new Pair("search_bar_outer", "words_source");
                pairArr[1] = new Pair("discovery", "search_position");
                pairArr[2] = new Pair(Integer.valueOf(i), "words_position");
                pairArr[3] = new Pair(((Word) ListProtector.get(list, i)).getWord(), "words_content");
                pairArr[4] = new Pair(((Word) ListProtector.get(list, i)).getId(), "group_id");
                TypeWords typeWords2 = this.LJII;
                if (typeWords2 != null) {
                    str2 = typeWords2.logId;
                }
                pairArr[5] = new Pair(str2, "impr_id");
                C20684815ws.LJIJI("trending_words_show", pairArr);
            }
        }
    }

    @Override // X.AnonymousClass1173
    public final void LIZIZ(C0QRC<TypeWords> c0qrc) {
        List<Word> list;
        List<Word> list2;
        String str;
        TypeWords typeWords;
        if (c0qrc != null && (typeWords = c0qrc.LIZIZ) != null) {
            list = typeWords.words;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            TypeWords typeWords2 = this.LJII;
            if (typeWords2 != null) {
                list2 = typeWords2.words;
            } else {
                list2 = null;
            }
            if (Intrinsics.LJFF(list, list2)) {
                this.LIZJ = false;
                this.LJII = c0qrc.LIZIZ;
                LJIIJ();
                return;
            }
            this.LIZJ = true;
            this.LJII = c0qrc.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (Word word : list) {
                TypeWords typeWords3 = c0qrc.LIZIZ;
                if (typeWords3 != null) {
                    str = typeWords3.logId;
                } else {
                    str = null;
                }
                word.setImplId(str);
                arrayList.add(word.getShowWord());
            }
            AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
            if (anonymousClass1177LJIIIIZZ != null) {
                anonymousClass1177LJIIIIZZ.LIZLLL = arrayList;
                anonymousClass1177LJIIIIZZ.LJ = -1;
                if (this.LIZJ) {
                    this.LIZ.LIZIZ.LIZ();
                    LinearLayout linearLayoutLJIIIZ = LJIIIZ();
                    if (linearLayoutLJIIIZ != null) {
                        C786410Ut5.LJZL(0, linearLayoutLJIIIZ);
                    }
                }
                if (this.LIZIZ) {
                    AnonymousClass1177 anonymousClass1177LJIIIIZZ2 = LJIIIIZZ();
                    if (anonymousClass1177LJIIIIZZ2 != null) {
                        anonymousClass1177LJIIIIZZ2.LIZIZ(0, false);
                        AnonymousClass1177.LIZ(anonymousClass1177LJIIIIZZ2);
                        return;
                    }
                    return;
                }
                AnonymousClass1177 anonymousClass1177LJIIIIZZ3 = LJIIIIZZ();
                if (anonymousClass1177LJIIIIZZ3 == null || anonymousClass1177LJIIIIZZ3.LIZIZ != null) {
                    return;
                }
                anonymousClass1177LJIIIIZZ3.LIZIZ(0, false);
                return;
            }
            return;
        }
        this.LIZJ = false;
        LJIIJ();
    }

    @Override // X.AnonymousClass1173
    public final void LJII(boolean z) {
        LinearLayout linearLayoutLJIIIZ;
        this.LIZIZ = z;
        if (z && (linearLayoutLJIIIZ = LJIIIZ()) != null && linearLayoutLJIIIZ.getVisibility() == 0) {
            AnonymousClass1177 anonymousClass1177LJIIIIZZ = LJIIIIZZ();
            if (anonymousClass1177LJIIIIZZ != null) {
                AnonymousClass1177.LIZ(anonymousClass1177LJIIIIZZ);
                return;
            }
            return;
        }
        AnonymousClass1177 anonymousClass1177LJIIIIZZ2 = LJIIIIZZ();
        if (anonymousClass1177LJIIIIZZ2 == null) {
            return;
        }
        ((Handler) anonymousClass1177LJIIIIZZ2.LJI.getValue()).removeCallbacks((Runnable) anonymousClass1177LJIIIIZZ2.LJIIIIZZ.getValue());
    }
}
