package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679090QkN extends AbstractC679110QkP {
    public final List<Pair<String, String>> LJ;

    @Override // X.AbstractC679110QkP
    public final String LIZ() {
        return "v_search_widgets_layer";
    }

    public C679090QkN(C679100QkO c679100QkO) {
        super(c679100QkO);
        this.LJ = C1697810uHb.LJIILJJIL(new Pair("show_survey_widget", "show_progress_pendant"), new Pair("show_survey_widget", "show_voucher_widget"));
    }

    @Override // X.AbstractC679110QkP
    public final boolean LIZJ(AbstractC679120QkQ abstractC679120QkQ) {
        if (Intrinsics.LJFF(abstractC679120QkQ.LJFF(), "show_voucher_widget")) {
            return this.LIZ.LIZLLL(abstractC679120QkQ);
        }
        if (Intrinsics.LJFF(abstractC679120QkQ.LJFF(), "show_survey_widget")) {
            if (this.LIZ.LIZJ.contains("show_gold_coin_widget")) {
                this.LIZIZ.remove(abstractC679120QkQ);
                this.LIZ.LIZIZ.remove(abstractC679120QkQ);
                return false;
            }
            return this.LIZ.LIZLLL(abstractC679120QkQ);
        }
        if (this.LIZ.LIZIZ.contains(abstractC679120QkQ)) {
            return this.LIZ.LIZLLL(abstractC679120QkQ);
        }
        return true;
    }

    @Override // X.AbstractC679110QkP
    public final boolean LIZIZ(String str, String str2) {
        for (Pair<String, String> pair : this.LJ) {
            if (!Intrinsics.LJFF(pair.getFirst(), str) || !Intrinsics.LJFF(pair.getSecond(), str2)) {
                if (Intrinsics.LJFF(pair.getFirst(), str2) && Intrinsics.LJFF(pair.getSecond(), str)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
