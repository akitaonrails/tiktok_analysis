package X;

import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717660SDc extends C09AY implements Function2<VideoAuthorInfoRelationAssem, String, Unit> {
    public final /* synthetic */ VideoAuthorInfoRelationAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C717660SDc(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem) {
        super(2);
        this.LL = videoAuthorInfoRelationAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, String str) {
        String eventType;
        Object obj;
        int i;
        int i2;
        C2189821An6 c2189821An6;
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
        String str2 = str;
        boolean z = true;
        TuxTextView tuxTextView = null;
        if (videoAuthorInfoRelationAssem2.Fp(str2)) {
            C1AV2 c1av2LIZ = C1AV3.LIZ(4, "Feed", null, "author");
            c1av2LIZ.LJI = true;
            HandlerHook.viewPost(videoAuthorInfoRelationAssem2.LJJIJL(), new RunnableC693200RHa(videoAuthorInfoRelationAssem2, 8, c1av2LIZ));
        } else {
            HandlerHook.viewPost(videoAuthorInfoRelationAssem2.LJJIJL(), new RunnableC693200RHa(videoAuthorInfoRelationAssem2, 0, null));
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) videoAuthorInfoRelationAssem2.LLLLLILLIL.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(this.LL);
            }
            TuxTextView tuxTextView2 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C0RJN c0rjnLIZIZ = videoAuthorInfoRelationAssem2.jm().LIZIZ();
            if (c0rjnLIZIZ == null || (c2189821An6 = c0rjnLIZIZ.LIZJ) == null || (eventType = c2189821An6.getEventType()) == null) {
                eventType = "";
            }
            if (Intrinsics.LJFF(eventType, "paid_series_detail_page") && tuxTextView2 != null) {
                tuxTextView2.setOnTouchListener(null);
            }
            C724270Sb3 c724270Sb3 = videoAuthorInfoRelationAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (!C1017070cZd.LLLI(((VideoItemParams) obj).getAweme())) {
                TuxTextView tuxTextView3 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setText(str2);
            } else {
                TuxTextView tuxTextView4 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                videoAuthorInfoRelationAssem2.iq(tuxTextView4, str2);
            }
            videoAuthorInfoRelationAssem2.Bp(str2);
            C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
            if (c1618440sDa.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(videoAuthorInfoRelationAssem2))) {
                i = 102;
            } else {
                Context context = videoAuthorInfoRelationAssem2.getContext();
                if (context != null && C0SXF.LJIL(context)) {
                    if (C0HCN.LIZIZ()) {
                        i = 61;
                    } else {
                        i = 41;
                    }
                } else if (C0FEA.LIZIZ()) {
                    i = 32;
                } else {
                    i = 42;
                }
            }
            Context context2 = videoAuthorInfoRelationAssem2.getContext();
            if (context2 == null || !C0SXF.LJIL(context2)) {
                z = false;
            }
            if (!z && !c1618440sDa.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(videoAuthorInfoRelationAssem2)) && C0FEA.LIZIZ()) {
                if (videoAuthorInfoRelationAssem2.LLLILZLLLI) {
                    i2 = 20;
                } else {
                    i2 = 22;
                }
                TuxTextView tuxTextView5 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                if (tuxTextView5 == null) {
                    tuxTextView5 = null;
                }
                TuxTextView.LJJJJ(tuxTextView5, 17.0f, i2, C417060GWy.LIZ(), 0.02f);
                if (C2540509xT.LIZ() == 3) {
                    TuxTextView tuxTextView6 = videoAuthorInfoRelationAssem2.LLLILZ;
                    if (tuxTextView6 == null) {
                        tuxTextView6 = null;
                    }
                    TuxTextView.LJJJJ(tuxTextView6, 17.0f, i2, C417060GWy.LIZ(), 0.02f);
                    TuxTextView tuxTextView7 = videoAuthorInfoRelationAssem2.LLLILZJ;
                    if (tuxTextView7 == null) {
                        tuxTextView7 = null;
                    }
                    TuxTextView.LJJJJ(tuxTextView7, 17.0f, i2, C417060GWy.LIZ(), 0.02f);
                }
            } else {
                TuxTextView tuxTextView8 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                if (tuxTextView8 == null) {
                    tuxTextView8 = null;
                }
                tuxTextView8.setTuxFont(i);
                if (C2540509xT.LIZ() == 3) {
                    TuxTextView tuxTextView9 = videoAuthorInfoRelationAssem2.LLLILZ;
                    if (tuxTextView9 == null) {
                        tuxTextView9 = null;
                    }
                    tuxTextView9.setTuxFont(i);
                    TuxTextView tuxTextView10 = videoAuthorInfoRelationAssem2.LLLILZJ;
                    if (tuxTextView10 == null) {
                        tuxTextView10 = null;
                    }
                    tuxTextView10.setTuxFont(i);
                }
            }
            if (videoAuthorInfoRelationAssem2.Up()) {
                TuxTextView tuxTextView11 = videoAuthorInfoRelationAssem2.LLL;
                if (tuxTextView11 == null) {
                    tuxTextView11 = null;
                }
                tuxTextView11.setTuxFont(62);
            }
            if (videoAuthorInfoRelationAssem2.dq()) {
                TuxTextView tuxTextView12 = videoAuthorInfoRelationAssem2.LLL;
                if (tuxTextView12 != null) {
                    tuxTextView = tuxTextView12;
                }
                tuxTextView.setTuxFont(42);
            }
        }
        return Unit.LIZ;
    }
}
