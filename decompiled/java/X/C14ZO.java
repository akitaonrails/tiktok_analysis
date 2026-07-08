package X;

import Y.ARunnableS34S1100000_30;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.14ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZO {
    public static final C14ZO LIZ = new C14ZO();
    public static final List<C0TCB> LIZIZ = C1697810uHb.LJIIJJI(C0TCB.AVOID_AD_STRATEGY, C0TCB.AVOID_STORY_STRATEGY, C0TCB.AVOID_AUTOSCROLL_STRATEGY, C0TCB.AVOID_CCTEMPLATE_STRATEGY, C0TCB.AVOID_DUPLICATE_SUB_AWEME_STRATEGY, C0TCB.AVOID_SUB_AWEME_STRATEGY, C0TCB.AVOID_DISABLE_CONDITION_STRATEGY);
    public static final List<C14ZJ> LIZJ = C1697810uHb.LJIIJJI(C14ZJ.SURVEY_NOT_EMPTY_STRATEGY, C14ZJ.SURVEY_HAS_SUBMIT_STRATEGY, C14ZJ.SURVEY_TURNSGROUP_STRATEGY, C14ZJ.SURVEY_FREQUENCY_STEATEGY, C14ZJ.MAX_SUBMIT_TIME_STRATEGY, C14ZJ.MAX_UNSUBMIT_SHOW_TIME_STRATEGY);

    public static boolean LIZIZ(Aweme aweme) {
        C14ZP.LIZ(aweme);
        ArrayList<C14ZJ> arrayList = new ArrayList();
        new C1264170j0B(arrayList).addAll(LIZJ);
        arrayList.add(C14ZJ.CLA_SURVEY_STRATEGY);
        arrayList.add(C14ZJ.CONTENT_DIVERSITY_SURVEY_STRATEGY);
        for (C14ZJ c14zj : arrayList) {
            if (c14zj.getStrategy().invoke(aweme).booleanValue()) {
                String lowerCase = c14zj.name().toLowerCase(Locale.ROOT);
                if (aweme != null) {
                    HashSet<String> hashSet = C14ZP.LIZJ;
                    if (!hashSet.contains(aweme.getAid())) {
                        hashSet.add(aweme.getAid());
                        C20684815ws.LJFF().execute(new ARunnableS34S1100000_30(aweme, lowerCase, 11));
                        return false;
                    }
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0290, code lost:
    
        if (X.C988000bok.LIZ().LIZ(r10.getAid()) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        if (X.C988000bok.LIZ().LIZLLL(r8.getType(), r10.getAid()) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r10, X.C14ZQ r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14ZO.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.14ZQ, java.lang.String):boolean");
    }
}
