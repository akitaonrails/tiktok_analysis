package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0wDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772010wDH extends C09AY implements Function1<AbstractC1771170wBv, Unit> {
    public final /* synthetic */ C1772030wDJ LL;
    public final /* synthetic */ C1771590wCb LLILLJJLI;
    public final /* synthetic */ EnumC1771830wCz LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ AbstractC1772170wDX LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772010wDH(C1772030wDJ c1772030wDJ, C1771590wCb c1771590wCb, EnumC1771830wCz enumC1771830wCz, C013C c013c, C1772160wDW c1772160wDW, C013C c013c2) {
        super(1);
        this.LL = c1772030wDJ;
        this.LLILLJJLI = c1771590wCb;
        this.LLILLL = enumC1771830wCz;
        this.LLILZ = c013c;
        this.LLILZIL = c1772160wDW;
        this.LLILZLL = c013c2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1771170wBv abstractC1771170wBv) throws JSONException {
        int i;
        C1773710wG1 c1773710wG1LIZIZ;
        List<C1772690wEN> list;
        C1772690wEN c1772690wEN;
        C1773710wG1 c1773710wG1LIZIZ2;
        List<C1772690wEN> list2;
        C1772690wEN c1772690wEN2;
        AbstractC1771170wBv abstractC1771170wBv2 = abstractC1771170wBv;
        int i2 = -1;
        if (abstractC1771170wBv2 instanceof C1771640wCg) {
            C1771640wCg c1771640wCg = (C1771640wCg) abstractC1771170wBv2;
            EnumC1771620wCe enumC1771620wCe = c1771640wCg.LIZLLL;
            if (enumC1771620wCe != null) {
                i2 = C1771650wCh.LIZ[enumC1771620wCe.ordinal()];
            }
            String str = CardStruct.IStatusCode.DEFAULT;
            if (i2 != 1) {
                if (i2 == 2) {
                    this.LLILLJJLI.LJ = true;
                    this.LL.LIZ();
                    if (this.LLILLL == EnumC1771830wCz.REFRESH) {
                        ConcurrentHashMap<String, Integer> concurrentHashMap = this.LL.LJFF;
                        String str2 = this.LLILLJJLI.LIZ;
                        if (str2 != null) {
                            str = str2;
                        }
                        concurrentHashMap.put(str, 0);
                        C013C c013c = this.LLILZLL;
                        C1515950pYH c1515950pYHLIZIZ = C1515940pYG.LIZIZ(this.LLILLJJLI.LJIIJJI, c1771640wCg.LIZLLL.getValue());
                        if (c1515950pYHLIZIZ != null) {
                            c1515950pYHLIZIZ.LJII = System.currentTimeMillis();
                            if (c013c.element) {
                                c1515950pYHLIZIZ.LJIIIZ = true;
                                c013c.element = false;
                            }
                        }
                        this.LL.LIZJ.LJIILL(new C1772150wDV(c1771640wCg.LIZ, c1771640wCg.LIZIZ, this.LLILLJJLI, false));
                    }
                    this.LL.LJIIIZ = null;
                    this.LL.LJIIJ = null;
                }
            } else {
                this.LL.LJIIIZ = c1771640wCg.LIZ;
                this.LL.LJIIJ = c1771640wCg.LIZIZ;
                C1771590wCb c1771590wCb = this.LLILLJJLI;
                if (c1771590wCb.LIZLLL) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Request Canceled: ");
                    sbLIZ.append(this.LLILLJJLI);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                    this.LLILLJJLI.LIZLLL = false;
                } else if (this.LLILLL == EnumC1771830wCz.REFRESH) {
                    ConcurrentHashMap<String, Integer> concurrentHashMap2 = this.LL.LJFF;
                    String str3 = c1771590wCb.LIZ;
                    if (str3 != null) {
                        str = str3;
                    }
                    concurrentHashMap2.put(str, 0);
                    C013C c013c2 = this.LLILZLL;
                    C1515950pYH c1515950pYHLIZIZ2 = C1515940pYG.LIZIZ(this.LLILLJJLI.LJIIJJI, c1771640wCg.LIZLLL.getValue());
                    if (c1515950pYHLIZIZ2 != null) {
                        c1515950pYHLIZIZ2.LJII = System.currentTimeMillis();
                        if (c013c2.element) {
                            c1515950pYHLIZIZ2.LJIIIZ = true;
                            c013c2.element = false;
                        }
                    }
                    this.LL.LIZJ.LJIILL(new C1772140wDU(c1771640wCg.LIZ, c1771640wCg.LIZIZ, this.LLILLJJLI, true));
                }
                this.LL.LIZ.LJII.LIZIZ();
            }
        } else if (abstractC1771170wBv2 instanceof C1771480wCQ) {
            C1771480wCQ c1771480wCQ = (C1771480wCQ) abstractC1771170wBv2;
            EnumC1771620wCe enumC1771620wCe2 = c1771480wCQ.LIZIZ;
            if (enumC1771620wCe2 == null) {
                i = -1;
            } else {
                i = C1771650wCh.LIZ[enumC1771620wCe2.ordinal()];
            }
            if (i != -1) {
                if (i != 1) {
                    if (i == 2) {
                        C1771590wCb c1771590wCb2 = this.LLILLJJLI;
                        if (!c1771590wCb2.LJ) {
                            c1771590wCb2.LJ = true;
                            this.LL.LIZ();
                            if (this.LL.LJIIIZ != null) {
                                C1772630wEH c1772630wEH = this.LL.LJIIIZ;
                                if (c1772630wEH != null && (c1773710wG1LIZIZ2 = c1772630wEH.LIZIZ()) != null && (list2 = c1773710wG1LIZIZ2.LJJIII) != null && (c1772690wEN2 = (C1772690wEN) C13LP.LJJJLZIJ(c1773710wG1LIZIZ2.LJJ, list2)) != null) {
                                    c1772690wEN2.LJII = null;
                                }
                                EnumC1771830wCz enumC1771830wCz = this.LLILLL;
                                EnumC1771830wCz enumC1771830wCz2 = EnumC1771830wCz.REFRESH;
                                if (enumC1771830wCz == enumC1771830wCz2) {
                                    C1772030wDJ c1772030wDJ = this.LL;
                                    C1772620wEG c1772620wEG = c1772030wDJ.LIZJ;
                                    C1772630wEH c1772630wEH2 = c1772030wDJ.LJIIIZ;
                                    if (c1772630wEH2 != null) {
                                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c1772620wEG.LIZIZ), C0PEM.LIZJ, null, new C1772070wDN(c1772620wEG, new C1772150wDV(c1772630wEH2, this.LL.LJIIJ, this.LLILLJJLI, false), null), 2);
                                    } else {
                                        c1772620wEG.getClass();
                                    }
                                    this.LL.LJIIJ = null;
                                    this.LL.LIZJ.LJIILL(new C1772200wDa(this.LLILZIL.LIZ, c1771480wCQ.LIZ, true));
                                    this.LLILZ.element = true;
                                }
                                if (Intrinsics.LJFF(this.LLILZIL.LIZ.LJFF, "first_fetch")) {
                                    this.LL.LJII = true;
                                }
                                if (this.LLILLL == enumC1771830wCz2) {
                                    if (Intrinsics.LJFF(this.LL.LIZIZ.LLJJIII.getValue(), C1772440wDy.LIZIZ)) {
                                        this.LL.LIZJ.LJFF(EnumC1772960wEo.CACHE);
                                    }
                                    C1772030wDJ c1772030wDJ2 = this.LL;
                                    C948503nH.LJFF(c1772030wDJ2.LIZIZ, C23271099x.INSTANCE, new C863070XtR(c1772030wDJ2, null));
                                }
                                this.LL.LJIIIZ = null;
                            }
                        }
                        this.LL.LJIIJJI = true;
                    }
                } else {
                    EnumC1771830wCz enumC1771830wCz3 = this.LLILLL;
                    EnumC1771830wCz enumC1771830wCz4 = EnumC1771830wCz.REFRESH;
                    if (enumC1771830wCz3 == enumC1771830wCz4) {
                        this.LL.LIZJ.LJIILL(new C1772200wDa(this.LLILZIL.LIZ, c1771480wCQ.LIZ, this.LLILZ.element));
                        this.LLILZ.element = true;
                    }
                    if (Intrinsics.LJFF(this.LLILZIL.LIZ.LJFF, "first_fetch")) {
                        this.LL.LJII = true;
                    }
                    if (this.LLILLL == enumC1771830wCz4) {
                        if (Intrinsics.LJFF(this.LL.LIZIZ.LLJJIII.getValue(), C1772440wDy.LIZIZ)) {
                            this.LL.LIZJ.LJFF(EnumC1772960wEo.CACHE);
                        }
                        C1772030wDJ c1772030wDJ3 = this.LL;
                        C948503nH.LJFF(c1772030wDJ3.LIZIZ, C23271099x.INSTANCE, new C863060XtQ(c1772030wDJ3, null));
                    }
                }
            } else {
                C1771590wCb c1771590wCb3 = this.LLILLJJLI;
                if (!c1771590wCb3.LJ) {
                    c1771590wCb3.LJ = true;
                    this.LL.LIZ();
                    if (this.LL.LJIIIZ != null) {
                        C1772630wEH c1772630wEH3 = this.LL.LJIIIZ;
                        if (c1772630wEH3 != null && (c1773710wG1LIZIZ = c1772630wEH3.LIZIZ()) != null && (list = c1773710wG1LIZIZ.LJJIII) != null && (c1772690wEN = (C1772690wEN) C13LP.LJJJLZIJ(c1773710wG1LIZIZ.LJJ, list)) != null) {
                            c1772690wEN.LJII = null;
                        }
                        if (this.LLILLL == EnumC1771830wCz.REFRESH) {
                            C1772030wDJ c1772030wDJ4 = this.LL;
                            C1772620wEG c1772620wEG2 = c1772030wDJ4.LIZJ;
                            C1772630wEH c1772630wEH4 = c1772030wDJ4.LJIIIZ;
                            if (c1772630wEH4 != null) {
                                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c1772620wEG2.LIZIZ), C0PEM.LIZJ, null, new C1772070wDN(c1772620wEG2, new C1772150wDV(c1772630wEH4, this.LL.LJIIJ, this.LLILLJJLI, false), null), 2);
                            } else {
                                c1772620wEG2.getClass();
                            }
                            this.LL.LJIIJ = null;
                            this.LLILZ.element = true;
                        }
                        this.LL.LJIIIZ = null;
                    } else if (this.LLILLL == EnumC1771830wCz.REFRESH) {
                        this.LL.LIZJ.LJIIIZ(false, new C1772200wDa(this.LLILZIL.LIZ, c1771480wCQ.LIZ, this.LLILZ.element), false);
                        this.LLILZ.element = true;
                    }
                    if (Intrinsics.LJFF(this.LLILZIL.LIZ.LJFF, "first_fetch")) {
                        this.LL.LJII = true;
                    }
                    if (this.LLILLL == EnumC1771830wCz.REFRESH) {
                        C1772030wDJ c1772030wDJ5 = this.LL;
                        C948503nH.LJFF(c1772030wDJ5.LIZIZ, C23271099x.INSTANCE, new C863050XtP(c1772030wDJ5, null));
                    }
                    C1768370w7P.LIZ(null, EnumC1771210wBz.REQUEST_ERROR, c1771480wCQ.LIZ, null);
                    C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("request chunk catch exception:");
                    sbLIZ2.append(c1771480wCQ.LIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c599820Nfo2.getClass();
                    C599820Nfo.LIZIZ();
                }
                this.LL.LJIIJJI = true;
            }
            Long l = this.LLILLJJLI.LJIIJJI;
            if (l != null) {
                Long lValueOf = Long.valueOf(l.longValue());
                EnumC1771620wCe enumC1771620wCe3 = c1771480wCQ.LIZIZ;
                if (enumC1771620wCe3 != null) {
                    enumC1771620wCe3.getValue();
                }
                C1515940pYG.LIZJ(lValueOf, c1771480wCQ.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
