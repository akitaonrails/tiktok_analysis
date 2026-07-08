package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717640SDa extends C09AY implements Function2<VideoAuthorInfoRelationAssem, String, Unit> {
    public C717640SDa() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, String str) {
        int i;
        View viewLJJIJL;
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem2 = videoAuthorInfoRelationAssem;
        String str2 = str;
        TuxTextView tuxTextView = videoAuthorInfoRelationAssem2.LLL;
        Object obj = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(str2);
        TuxTextView tuxTextView2 = videoAuthorInfoRelationAssem2.LLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        Context context = videoAuthorInfoRelationAssem2.getContext();
        if ((context != null && C0SXF.LJIL(context)) || str2 == null || str2.length() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, i);
        if (videoAuthorInfoRelationAssem2.LLJLLIL) {
            TuxTextView tuxTextView3 = videoAuthorInfoRelationAssem2.LLL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else if (videoAuthorInfoRelationAssem2.dq()) {
            TuxTextView tuxTextView4 = videoAuthorInfoRelationAssem2.LLL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            TuxTextView tuxTextView5 = videoAuthorInfoRelationAssem2.LLL;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            tuxTextView5.setTuxFont(42);
        } else if (videoAuthorInfoRelationAssem2.Up()) {
            TuxTextView tuxTextView6 = videoAuthorInfoRelationAssem2.LLL;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            tuxTextView6.setTuxFont(62);
        }
        if (!videoAuthorInfoRelationAssem2.Up() && videoAuthorInfoRelationAssem2.fq()) {
            TuxTextView tuxTextView7 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
            if (tuxTextView7 == null) {
                tuxTextView7 = null;
            }
            if (tuxTextView7.getVisibility() == 0 && (viewLJJIJL = videoAuthorInfoRelationAssem2.LJJIJL()) != null && viewLJJIJL.getVisibility() == 0) {
                TuxTextView tuxTextView8 = videoAuthorInfoRelationAssem2.LLJZIJLIL;
                if (tuxTextView8 == null) {
                    tuxTextView8 = null;
                }
                CharSequence text = tuxTextView8.getText();
                if (text != null && text.length() != 0) {
                    TuxTextView tuxTextView9 = videoAuthorInfoRelationAssem2.LLL;
                    if (tuxTextView9 == null) {
                        tuxTextView9 = null;
                    }
                    CharSequence text2 = tuxTextView9.getText();
                    if (text2 != null && text2.length() != 0 && !C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(C724240Sb0.LJI(videoAuthorInfoRelationAssem2))) {
                        TuxTextView tuxTextView10 = videoAuthorInfoRelationAssem2.LLL;
                        if (tuxTextView10 == null) {
                            tuxTextView10 = null;
                        }
                        tuxTextView10.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC738740SyO(videoAuthorInfoRelationAssem2, 10));
                    }
                }
            }
        }
        C724270Sb3 c724270Sb3 = videoAuthorInfoRelationAssem2.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        videoAuthorInfoRelationAssem2.jq(((VideoItemParams) obj).getAweme());
        return Unit.LIZ;
    }
}
