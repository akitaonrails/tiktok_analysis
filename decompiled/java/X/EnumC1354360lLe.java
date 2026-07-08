package X;

import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class EnumC1354360lLe {
    public static final EnumC1354360lLe COMMENT;
    public static final EnumC1354360lLe DEFAULT;
    public static final /* synthetic */ EnumC1354360lLe[] LLJ;
    public static final /* synthetic */ C2254308sP LLJI;
    public final EnumC585750MyD LL;
    public final EnumC1354390lLh LLILLJJLI;
    public final List<EnumC1354390lLh> LLILLL;
    public final List<EnumC1354390lLh> LLILZ;
    public final List<EnumC1354390lLh> LLILZIL;
    public final EnumC1354390lLh LLILZLL;
    public final EnumC1354390lLh LLIZ;
    public final List<EnumC1354390lLh> LLIZLLLIL;

    public static InterfaceC2044707zh<EnumC1354360lLe> getEntries() {
        return LLJI;
    }

    public abstract boolean match(C1354140lLI c1354140lLI);

    static {
        EnumC1354360lLe enumC1354360lLe = new EnumC1354360lLe() { // from class: X.0lLg
            {
                EnumC585750MyD enumC585750MyD = EnumC585750MyD.COMMENT;
                EnumC1354390lLh enumC1354390lLh = EnumC1354390lLh.COMMENT_CONTEXT;
                C13BV c13bv = C13BV.INSTANCE;
                Collections.singletonList(EnumC1354390lLh.COMMENT_NAV);
                C1697810uHb.LJIIJJI(EnumC1354390lLh.DESC, EnumC1354390lLh.ANCHOR, EnumC1354390lLh.AI_AGENT, EnumC1354390lLh.MUSIC_MARQUEE, EnumC1354390lLh.DIVIDER, EnumC1354390lLh.SEARCH_WORD, EnumC1354390lLh.PRODUCT_INFO, EnumC1354390lLh.COMMENT_ACTION);
                EnumC1354390lLh enumC1354390lLh2 = EnumC1354390lLh.COMMENT;
                EnumC1354390lLh enumC1354390lLh3 = EnumC1354390lLh.COMMENT_INPUT;
                Collections.singletonList(EnumC1354390lLh.SEARCH_MAGNIFIER);
            }

            @Override // X.EnumC1354360lLe
            public final boolean match(C1354140lLI c1354140lLI) {
                C1350320lF8 c1350320lF8;
                Object obj;
                if (c1354140lLI == null || (((c1350320lF8 = c1354140lLI.LL) != null && c1350320lF8.LLILZ) || (obj = c1354140lLI.LLILLJJLI) == null)) {
                    return false;
                }
                return obj instanceof C1349800lEI;
            }
        };
        COMMENT = enumC1354360lLe;
        EnumC1354360lLe enumC1354360lLe2 = new EnumC1354360lLe() { // from class: X.0lLi
            @Override // X.EnumC1354360lLe
            public final boolean match(C1354140lLI c1354140lLI) {
                return true;
            }

            {
                C1697810uHb.LJIIJJI(EnumC1354390lLh.DESC, EnumC1354390lLh.ANCHOR, EnumC1354390lLh.AI_AGENT, EnumC1354390lLh.MUSIC_MARQUEE, EnumC1354390lLh.DIVIDER, EnumC1354390lLh.SEARCH_WORD, EnumC1354390lLh.PRODUCT_INFO);
                Collections.singletonList(EnumC1354390lLh.COMMENT_NAV);
                Collections.singletonList(EnumC1354390lLh.SEARCH_MAGNIFIER);
                EnumC585750MyD enumC585750MyD = EnumC585750MyD.DEFAULT;
                C13BV c13bv = C13BV.INSTANCE;
            }
        };
        DEFAULT = enumC1354360lLe2;
        EnumC1354360lLe[] enumC1354360lLeArr = {enumC1354360lLe, enumC1354360lLe2};
        LLJ = enumC1354360lLeArr;
        LLJI = new C2254308sP(enumC1354360lLeArr);
    }

    public static EnumC1354360lLe[] values() {
        return (EnumC1354360lLe[]) LLJ.clone();
    }

    public final EnumC1354390lLh getBottomItemCandidate() {
        return this.LLIZ;
    }

    public final EnumC585750MyD getConfigCollector() {
        return this.LL;
    }

    public final EnumC1354390lLh getContextItemCandidate() {
        return this.LLILLJJLI;
    }

    public final EnumC1354390lLh getListItemCandidate() {
        return this.LLILZLL;
    }

    public final List<EnumC1354390lLh> getLogicCandidates() {
        return this.LLILLL;
    }

    public final List<EnumC1354390lLh> getNavActionCandidates() {
        return this.LLILZ;
    }

    public final List<EnumC1354390lLh> getTopItemCandidates() {
        return this.LLILZIL;
    }

    public final List<EnumC1354390lLh> getTopLayerItemCandidate() {
        return this.LLIZLLLIL;
    }

    public static EnumC1354360lLe valueOf(String str) {
        return (EnumC1354360lLe) C08FF.LIZ(EnumC1354360lLe.class, str);
    }

    public EnumC1354360lLe(String str, int i, EnumC585750MyD enumC585750MyD, EnumC1354390lLh enumC1354390lLh, List list, List list2, List list3, EnumC1354390lLh enumC1354390lLh2, EnumC1354390lLh enumC1354390lLh3, List list4) {
        this.LL = enumC585750MyD;
        this.LLILLJJLI = enumC1354390lLh;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
        this.LLILZLL = enumC1354390lLh2;
        this.LLIZ = enumC1354390lLh3;
        this.LLIZLLLIL = list4;
    }
}
