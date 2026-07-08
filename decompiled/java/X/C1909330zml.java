package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS139S0100000_4;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ug.IRateFeedbackService;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909330zml extends LinearLayout {
    public final int LL;
    public final AbstractC1909290zmh LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    static {
        new UgCommonServiceImpl();
        C14MJ c14mj = C14MJ.LIZ;
    }

    private final C197039127h getDone() {
        return (C197039127h) this.LLILZIL.getValue();
    }

    private final C197039127h getFeedback() {
        return (C197039127h) this.LLILZ.getValue();
    }

    public final ImageView getBanner() {
        return (ImageView) this.LLILLL.getValue();
    }

    public final IRateFeedbackService getRateFeedbackService() {
        return (IRateFeedbackService) this.LLILZLL.getValue();
    }

    public C1909330zml(Context context, int i, AbstractC1909290zmh abstractC1909290zmh) {
        super(context, null, 0);
        this.LL = i;
        this.LLILLJJLI = abstractC1909290zmh;
        this.LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 967));
        this.LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 969));
        this.LLILZIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 968));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i5v, this, true);
        HandlerHook.viewPost(getBanner(), new ARunnableS104S0100000_4(this, 134));
        C197039127h feedback = getFeedback();
        C786410Ut5.U8(feedback, new ACListenerS130S0200000_28(this, feedback, 62));
        C786410Ut5.U8(getDone(), new ACListenerS139S0100000_4(this, 100));
        abstractC1909290zmh.LJ(0, "feedback_show");
        this.LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(685));
    }
}
