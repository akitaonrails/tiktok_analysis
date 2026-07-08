package X;

import Y.ACListenerS133S0200000_31;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.dislike.ChooseItemViewModel;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.ss.android.ugc.aweme.share.dislike.FilteredKeywords;
import com.ss.android.ugc.aweme.share.dislike.NewDislikeReason;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15n3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20623915n3 {
    public static TuxSheet LJIIZILJ;
    public final C19GS LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final TuxTextView LJ;
    public int LJFF;
    public final ChooseItemViewModel LJI;
    public final View LJII;
    public final C21578619ce LJIIIIZZ;
    public final C0N0Y LJIIIZ;
    public final AwS645S0100000_31 LJIIJ;
    public final C20623215mw LJIIJJI;
    public final C20624115n5 LJIIL;
    public final C20623615n0 LJIILIIL;
    public final C340650DXb LJIILJJIL;
    public final C20623515mz LJIILL;
    public final List<NewDislikeReason> LJIILLIIL;

    public final void LIZ() {
        FilteredKeywords filteredKeywords = C0NB4.LJII;
        C0NB4.LJII = null;
        if (filteredKeywords != null) {
            this.LJIIJ.invoke(filteredKeywords.getList(), Integer.valueOf(filteredKeywords.getCounts()));
        } else {
            C0NB4.LIZJ = this.LJIIJ;
        }
    }

    public final void LIZIZ() {
        List<DislikeHashTag> listLIZ = C20624015n4.LIZ(this.LIZIZ);
        C20624015n4.LIZ.getClass();
        NewDislikeReason newDislikeReason = C20624015n4.LJ;
        String str = newDislikeReason != null ? newDislikeReason.text : null;
        if (!(!listLIZ.isEmpty()) || str == null) {
            return;
        }
        C786410Ut5.LJZ(0, this.LJIILL.LIZ);
        C786410Ut5.LJZL(0, this.LJIILIIL.LIZIZ);
        C20623515mz c20623515mz = this.LJIILL;
        FrameLayout frameLayout = c20623515mz.LIZ;
        View viewLJLLJ = C786410Ut5.LJLLJ(frameLayout.getContext(), R.layout.ba8, null);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.vvh);
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.vvg);
        TuxTextView tuxTextView2 = (TuxTextView) viewLJLLJ.findViewById(R.id.vvf);
        tuxTextView2.setText(Html.fromHtml(viewLJLLJ.getContext().getString(2131838243)));
        tuxTextView2.setTuxFont(c20623515mz.LJ);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(c20623515mz.LJFF);
        C786410Ut5.a9(tuxIconView, new ACListenerS133S0200000_31(c20623515mz, tuxTextView2, 33));
        C786410Ut5.W5(viewLJLLJ, new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(viewLJLLJ);
        this.LJIILIIL.LIZIZ(listLIZ);
    }

    public final void LIZJ() {
        List<DislikeHashTag> listLIZ = C20624015n4.LIZ(this.LIZIZ);
        C20624015n4.LIZ.getClass();
        NewDislikeReason newDislikeReason = C20624015n4.LJ;
        String str = newDislikeReason != null ? newDislikeReason.text : null;
        if (!(!((ArrayList) listLIZ).isEmpty()) || str == null) {
            return;
        }
        C786410Ut5.LJZ(0, this.LJIILL.LIZ);
        C20623515mz c20623515mz = this.LJIILL;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 506);
        FrameLayout frameLayout = c20623515mz.LIZ;
        View viewLJLLJ = C786410Ut5.LJLLJ(frameLayout.getContext(), R.layout.ba7, null);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.vvh);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(c20623515mz.LJFF);
        TuxTextView tuxTextView2 = (TuxTextView) viewLJLLJ.findViewById(R.id.vv4);
        tuxTextView2.setText(Html.fromHtml(viewLJLLJ.getContext().getString(2131838243)));
        tuxTextView2.setTuxFont(c20623515mz.LJ);
        C0HZQ c0hzq = (C0HZQ) viewLJLLJ.findViewById(R.id.vve);
        C786410Ut5.D7(c0hzq, new C16HA(c20623515mz, tuxTextView2, 3));
        FrameLayout frameLayout2 = c20623515mz.LIZ;
        frameLayout2.setBackground(C800330VaR.LIZIZ(frameLayout2.getContext(), R.drawable.bbu));
        C786410Ut5.O7(frameLayout2, new ACListenerS154S0100000_19(c0hzq, 270));
        C786410Ut5.W5(viewLJLLJ, new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(viewLJLLJ);
        c20623515mz.LIZJ = awS610S0100000_31;
        this.LJIILIIL.LIZIZ(listLIZ);
    }

    public final void LIZLLL(int i) {
        Context contextLIZ;
        if (C2214201BlK.LJFF() != null) {
            contextLIZ = C2214201BlK.LJFF();
        } else {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        if (!(contextLIZ instanceof Activity)) {
            return;
        }
        new C0ZDN(this.LIZ).LIZ(0);
        if (i != -2 && i != 0) {
            if (i != 2) {
                return;
            }
            C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
            c1233040iBy.LIZIZ(2131838245);
            c1233040iBy.LIZLLL();
            return;
        }
        C1233040iBy c1233040iBy2 = new C1233040iBy(contextLIZ);
        c1233040iBy2.LIZIZ(2131838246);
        c1233040iBy2.LIZLLL();
    }

    public C20623915n3(C19GS c19gs, Aweme aweme, String str, String str2) {
        this.LIZ = c19gs;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJFF = C960203pA.LIZ(R.attr.c5, c19gs);
        ChooseItemViewModel chooseItemViewModel = (ChooseItemViewModel) ViewModelProviders.of(c19gs).get(ChooseItemViewModel.class);
        this.LJI = chooseItemViewModel;
        View viewLJLLJ = C786410Ut5.LJLLJ(c19gs, R.layout.ba6, null);
        this.LJII = viewLJLLJ;
        this.LJIIIIZZ = (C21578619ce) viewLJLLJ.findViewById(R.id.fxj);
        this.LJIIIZ = C1483410ohn.LJLJJI();
        this.LJIIJ = new AwS645S0100000_31(this, 113);
        this.LJ = (TuxTextView) viewLJLLJ.findViewById(R.id.fxe);
        this.LJIIJJI = new C20623215mw(c19gs, (LinearLayout) viewLJLLJ.findViewById(R.id.fxd));
        C20624115n5 c20624115n5 = new C20624115n5(c19gs, (LinearLayout) viewLJLLJ.findViewById(R.id.fxc));
        this.LJIIL = c20624115n5;
        LinearLayout linearLayout = (LinearLayout) viewLJLLJ.findViewById(R.id.fxh);
        this.LJIILIIL = new C20623615n0(c19gs, linearLayout);
        this.LJIILJJIL = new C340650DXb(c19gs, (FrameLayout) viewLJLLJ.findViewById(R.id.fxf));
        FrameLayout frameLayout = (FrameLayout) viewLJLLJ.findViewById(R.id.fxi);
        this.LJIILL = new C20623515mz(c19gs, frameLayout);
        C786410Ut5.LJZL(8, linearLayout);
        C786410Ut5.LJZ(8, frameLayout);
        chooseItemViewModel.LLILZIL = c20624115n5;
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 1511);
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 504);
        C0NB4.LIZLLL = awS575S0100000_31;
        C0NB4.LJ = awS610S0100000_31;
        AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31(this, 1512);
        AwS610S0100000_31 awS610S0100000_312 = new AwS610S0100000_31(this, 505);
        C0NB4.LJFF = awS575S0100000_312;
        C0NB4.LJI = awS610S0100000_312;
        C20624015n4 c20624015n4 = C20624015n4.LIZ;
        C20624015n4.LJI = new ArrayList();
        C089E c089e = new C089E(C20624015n4.LJFF);
        while (c089e.hasNext()) {
            NewDislikeReason newDislikeReason = (NewDislikeReason) c089e.next();
            if (TextUtils.equals(newDislikeReason.id, C20624015n4.LIZLLL)) {
                C20624015n4.LJ = newDislikeReason;
            } else {
                List<NewDislikeReason> list = C20624015n4.LJI;
                if (list != null) {
                    ((ArrayList) list).add(newDislikeReason);
                }
            }
        }
        C20624315n7.LIZ = new AtomicInteger(0);
        C20624015n4.LIZ.getClass();
        List<NewDislikeReason> list2 = C20624015n4.LJI;
        this.LJIILLIIL = list2 == null ? new ArrayList<>() : list2;
    }
}
