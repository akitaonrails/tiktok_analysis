package X;

import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.160d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207045160d extends C09AY implements Function2<CLACaptionAssemV2, C291001Au<? extends C692900RFw>, Unit> {
    public C207045160d() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CLACaptionAssemV2 cLACaptionAssemV2, C291001Au<? extends C692900RFw> c291001Au) throws JSONException {
        C692900RFw c692900RFw;
        Integer num;
        Integer numValueOf;
        CLACaptionAssemV2 cLACaptionAssemV22 = cLACaptionAssemV2;
        C291001Au<? extends C692900RFw> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c692900RFw = (C692900RFw) c291001Au2.LIZ) != null) {
            C207044160c c207044160cVQ2 = cLACaptionAssemV22.Bp().vQ2();
            c207044160cVQ2.getClass();
            if (c692900RFw instanceof C692890RFv) {
                if (C2511209sk.LIZ) {
                    if (!c207044160cVQ2.LLIZ) {
                        c207044160cVQ2.LLJ = (C692890RFv) c692900RFw;
                    } else {
                        C692890RFv c692890RFv = (C692890RFv) c692900RFw;
                        Integer numLIZIZ = C207044160c.LIZIZ(c692890RFv.LIZIZ);
                        if (c692890RFv.LIZ == 1 && numLIZIZ != null) {
                            c207044160cVQ2.LLILZ = numLIZIZ;
                            c207044160cVQ2.LLILZIL = false;
                            c207044160cVQ2.LLJILJIL = null;
                            c207044160cVQ2.LIZJ();
                        }
                    }
                }
            } else if (c692900RFw instanceof C692880RFu) {
                C692880RFu c692880RFu = (C692880RFu) c692900RFw;
                int i = c692880RFu.LIZJ;
                if ((c692880RFu.LIZ || c692880RFu.LIZIZ) && (((num = c207044160cVQ2.LLILZ) == null || num.intValue() != i) && (numValueOf = Integer.valueOf(i)) != null)) {
                    c207044160cVQ2.LLILZ = numValueOf;
                    c207044160cVQ2.LLILZIL = false;
                    c207044160cVQ2.LLJILJIL = null;
                    c207044160cVQ2.LIZJ();
                }
            }
        }
        return Unit.LIZ;
    }
}
