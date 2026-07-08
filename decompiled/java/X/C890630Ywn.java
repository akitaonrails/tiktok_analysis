package X;

import Y.AAListenerS325S0100000_14;
import Y.AObjectS389S0100000_14;
import Y.AUListenerS263S0100000_14;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ywn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890630Ywn {
    public final View LIZ;
    public final Point LIZIZ;
    public final Function0<VideoPublishEditModel> LIZJ;
    public final Function0<Unit> LIZLLL;
    public View LJI;
    public RecyclerView LJII;
    public String LJIIIIZZ;
    public final View LJIIIZ;
    public final View LJIIJ;
    public AnonymousClass0956 LJIIJJI;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1602));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(563));
    public boolean LJIIL = true;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(550));

    public final C434710H2v LIZIZ() {
        return (C434710H2v) this.LJ.getValue();
    }

    public final VideoPublishEditModel LIZJ() {
        return this.LIZJ.invoke();
    }

    public final List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> LIZLLL() {
        return (List) this.LJFF.getValue();
    }

    public final List LIZ() {
        List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> listLIZLLL = LIZLLL();
        ArrayList arrayList = new ArrayList();
        for (AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText addYoursAutoSuggestTopicForText : listLIZLLL) {
            String str = addYoursAutoSuggestTopicForText.text;
            if (!Intrinsics.LJFF(((AddYoursStickerModel) C13LP.LJJJLL(LIZJ().creativeModel.stickerModel.addYoursStickerModels)) != null ? r0.getTopicText() : null, str)) {
                arrayList.add(addYoursAutoSuggestTopicForText);
            }
        }
        return arrayList;
    }

    public final void LJ(String str) {
        String string;
        AnonymousClass0956 anonymousClass0956;
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, this.LJIIIIZZ)) {
            return;
        }
        if (string != null && !a0.LJJJIL(string)) {
            this.LJIIIIZZ = string;
            AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(this, 333);
            AnonymousClass0956 anonymousClass09562 = this.LJIIJJI;
            if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = this.LJIIJJI) != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJIIJJI = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05F8(this, string, awS593S0100000_14, null), 3);
            return;
        }
        LJFF(C13BV.INSTANCE);
        this.LJIIIIZZ = null;
    }

    public final void LJFF(List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> list) {
        View view;
        RecyclerView recyclerView;
        LIZLLL().clear();
        LIZLLL().addAll(list);
        LIZLLL();
        List listLIZ = LIZ();
        if (this.LJII == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) this.LIZ.findViewById(R.id.sfz));
            this.LJI = viewLJLLLL;
            if (viewLJLLLL != null) {
                recyclerView = (RecyclerView) viewLJLLLL.findViewById(R.id.sg0);
            } else {
                recyclerView = null;
            }
            this.LJII = recyclerView;
            View view2 = this.LJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            RecyclerView recyclerView2 = this.LJII;
            if (recyclerView2 != null) {
                C786410Ut5.LLIZLLLIL(recyclerView2, 8);
            }
            RecyclerView recyclerView3 = this.LJII;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(LIZIZ());
            }
            RecyclerView recyclerView4 = this.LJII;
            if (recyclerView4 != null) {
                recyclerView4.setLayoutManager(new LinearLayoutManager(this.LIZ.getContext(), 0, false));
            }
            LIZIZ().setData(listLIZ);
        } else {
            LIZIZ().setData(listLIZ);
        }
        if (!(!((ArrayList) listLIZ).isEmpty())) {
            View view3 = this.LJI;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            RecyclerView recyclerView5 = this.LJII;
            if (recyclerView5 != null) {
                C786410Ut5.LLIZLLLIL(recyclerView5, 8);
                return;
            }
            return;
        }
        View view4 = this.LJI;
        if (view4 == null || this.LJII == null) {
            return;
        }
        if ((view4.getVisibility() == 0 && (view = this.LJI) != null && view.getHeight() > 0) || !this.LJIIL) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(400L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(new AUListenerS263S0100000_14(this, 16));
        valueAnimator.addListener(new AAListenerS325S0100000_14(this, 37));
        valueAnimator.start();
    }

    public C890630Ywn(View view, Point point, AObjectS389S0100000_14 aObjectS389S0100000_14, AObjectS389S0100000_14 aObjectS389S0100000_142) {
        this.LIZ = view;
        this.LIZIZ = point;
        this.LIZJ = aObjectS389S0100000_14;
        this.LIZLLL = aObjectS389S0100000_142;
        this.LJIIIZ = view.findViewById(R.id.o7j);
        this.LJIIJ = view.findViewById(R.id.jh0);
    }
}
