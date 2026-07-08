package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.image.airewrite.AIRewriteModule;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LQ extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19LQ(Object obj, int i) {
        super(600, true);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C19LQ c19lq, View view) {
        C196Q c196q = ((C196T) c19lq.l0).LLIZLLLIL;
        if (c196q != null) {
            c196q.LLILZLL();
        }
    }

    public static final void LIZ$1(C19LQ c19lq, View view) {
        InterfaceC214845196d interfaceC214845196d = ((C196T) c19lq.l0).LLILZLL;
        if (interfaceC214845196d != null) {
            interfaceC214845196d.LIZ();
        }
    }

    public static final void LIZ$2(C19LQ c19lq, View view) {
        AIRewriteModule aIRewriteModule = (AIRewriteModule) c19lq.l0;
        aIRewriteModule.LLJLLL = "click_button";
        aIRewriteModule.LJII();
        AIRewriteModule aIRewriteModule2 = (AIRewriteModule) c19lq.l0;
        C197H c197h = C197H.SIMPLIFY;
        aIRewriteModule2.LJJIIJ(c197h, false);
        C856190XiL c856190XiL = C856190XiL.LIZ;
        VideoPublishEditModel videoPublishEditModel = ((AIRewriteModule) c19lq.l0).LLILLJJLI;
        String style = c197h.getStyle();
        int iLJIIL = ((AIRewriteModule) c19lq.l0).LJIIL();
        c856190XiL.getClass();
        C856190XiL.LIZJ(iLJIIL, videoPublishEditModel, style);
    }

    public static final void LIZ$3(C19LQ c19lq, View view) {
        ((AIRewriteModule) c19lq.l0).LJII();
        AIRewriteModule aIRewriteModule = (AIRewriteModule) c19lq.l0;
        if (aIRewriteModule.LJIIJJI() == C197H.RANGE_REWRITE) {
            C1156050gBn c1156050gBn = aIRewriteModule.LLJLILLLLZIIL;
            if (c1156050gBn == null) {
                aIRewriteModule.LJJIIJ(C197H.ENHANCE, false);
            } else if (aIRewriteModule.LLJLLIL != null && !Intrinsics.LJFF(String.valueOf(aIRewriteModule.LJIIJ()), aIRewriteModule.LLJLLIL)) {
                aIRewriteModule.LJJIIJ(C197H.ENHANCE, false);
            } else {
                aIRewriteModule.LJJIII(true, true);
                aIRewriteModule.LJIIIIZZ(c1156050gBn);
            }
        } else {
            aIRewriteModule.LJJIIJ(aIRewriteModule.LJIIJJI(), false);
        }
        C856190XiL c856190XiL = C856190XiL.LIZ;
        AIRewriteModule aIRewriteModule2 = (AIRewriteModule) c19lq.l0;
        VideoPublishEditModel videoPublishEditModel = aIRewriteModule2.LLILLJJLI;
        int iLJIIL = aIRewriteModule2.LJIIL();
        c856190XiL.getClass();
        C0LAB c0labLIZ = C856190XiL.LIZ(videoPublishEditModel);
        c0labLIZ.LIZ(iLJIIL, "text_length");
        C20684815ws.LJIILLIIL("click_ai_write_retry", c0labLIZ.LIZ);
    }

    public static final void LIZ$4(C19LQ c19lq, View view) {
        ((AIRewriteModule) c19lq.l0).LJII();
    }

    public static final void LIZ$5(C19LQ c19lq, View view) throws Throwable {
        int iLJIIL = ((AIRewriteModule) c19lq.l0).LJIIL();
        ((AIRewriteModule) c19lq.l0).LJII();
        AIRewriteModule aIRewriteModule = (AIRewriteModule) c19lq.l0;
        AwS576S0100000_32 awS576S0100000_32 = aIRewriteModule.LLLIL;
        if (awS576S0100000_32 != null) {
            awS576S0100000_32.invoke();
        } else {
            aIRewriteModule.LJJ();
        }
        AIRewriteModule aIRewriteModule2 = (AIRewriteModule) c19lq.l0;
        aIRewriteModule2.LLLII.isCurUsedAIRewrite = false;
        C856190XiL c856190XiL = C856190XiL.LIZ;
        VideoPublishEditModel videoPublishEditModel = aIRewriteModule2.LLILLJJLI;
        c856190XiL.getClass();
        C0LAB c0labLIZ = C856190XiL.LIZ(videoPublishEditModel);
        c0labLIZ.LIZ(iLJIIL, "text_length");
        c0labLIZ.LIZ(iLJIIL, "cur_text_length");
        C20684815ws.LJIILLIIL("click_ai_rewrite_original", c0labLIZ.LIZ);
    }

    public static final void LIZ$6(C19LQ c19lq, View view) {
        C1156050gBn c1156050gBn;
        int iLJIIL = ((AIRewriteModule) c19lq.l0).LJIIL();
        ((AIRewriteModule) c19lq.l0).LJII();
        AIRewriteModule aIRewriteModule = (AIRewriteModule) c19lq.l0;
        if (aIRewriteModule.LJIIJJI() == C197H.RANGE_REWRITE) {
            if ((aIRewriteModule.LLJLL == null || Intrinsics.LJFF(String.valueOf(aIRewriteModule.LJIIJ()), aIRewriteModule.LLJLL)) && (c1156050gBn = aIRewriteModule.LLJLILLLLZIIL) != null) {
                C197G c197g = aIRewriteModule.LLLIILIL;
                if (c197g != null) {
                    c197g.LIZLLL = true;
                } else {
                    aIRewriteModule.LLL = true;
                }
                aIRewriteModule.LJJIII(true, true);
                if (!aIRewriteModule.LJI(c1156050gBn, true)) {
                    aIRewriteModule.LJIIIIZZ(c1156050gBn);
                }
            } else {
                aIRewriteModule.LJJIIJ(C197H.ENHANCE, true);
            }
        } else {
            aIRewriteModule.LJJIIJ(aIRewriteModule.LJIIJJI(), true);
        }
        C856190XiL c856190XiL = C856190XiL.LIZ;
        VideoPublishEditModel videoPublishEditModel = ((AIRewriteModule) c19lq.l0).LLILLJJLI;
        c856190XiL.getClass();
        C0LAB c0labLIZ = C856190XiL.LIZ(videoPublishEditModel);
        c0labLIZ.LIZ(iLJIIL, "text_length");
        c0labLIZ.LIZ(iLJIIL, "cur_text_length");
        C20684815ws.LJIILLIIL("click_ai_rewrite_regenerate", c0labLIZ.LIZ);
    }

    public static final void LIZ$7(C19LQ c19lq, View view) {
        AIRewriteModule aIRewriteModule = (AIRewriteModule) c19lq.l0;
        aIRewriteModule.LLJLLL = "click_button";
        aIRewriteModule.LJII();
        AIRewriteModule aIRewriteModule2 = (AIRewriteModule) c19lq.l0;
        C197H c197h = C197H.ENHANCE;
        aIRewriteModule2.LJJIIJ(c197h, false);
        C856190XiL c856190XiL = C856190XiL.LIZ;
        VideoPublishEditModel videoPublishEditModel = ((AIRewriteModule) c19lq.l0).LLILLJJLI;
        String style = c197h.getStyle();
        int iLJIIL = ((AIRewriteModule) c19lq.l0).LJIIL();
        c856190XiL.getClass();
        C856190XiL.LIZJ(iLJIIL, videoPublishEditModel, style);
    }

    public static final void LIZ$8(C19LQ c19lq, View view) {
        AIRewriteModule aIRewriteModule = (AIRewriteModule) c19lq.l0;
        aIRewriteModule.LLJLLL = "click_button";
        aIRewriteModule.LJII();
        AIRewriteModule aIRewriteModule2 = (AIRewriteModule) c19lq.l0;
        C197H c197h = C197H.STRUCTURE;
        aIRewriteModule2.LJJIIJ(c197h, false);
        C856190XiL c856190XiL = C856190XiL.LIZ;
        VideoPublishEditModel videoPublishEditModel = ((AIRewriteModule) c19lq.l0).LLILLJJLI;
        String style = c197h.getStyle();
        int iLJIIL = ((AIRewriteModule) c19lq.l0).LJIIL();
        c856190XiL.getClass();
        C856190XiL.LIZJ(iLJIIL, videoPublishEditModel, style);
    }
}
