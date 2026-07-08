package X;

import Y.ACListenerS134S0200000_32;
import Y.ACListenerS166S0100000_32;
import Y.ACListenerS96S0300000_32;
import Y.AObjectS406S0100000_32;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21372018kQ extends FrameLayout implements InterfaceC21372218kS {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final C0HZQ LLILLL;
    public final View LLILZ;
    public final C197039127h LLILZIL;
    public final C197039127h LLILZLL;

    @Override // X.InterfaceC21372218kS
    public final void LIZIZ(int i, List<? extends UrlModel> list) {
    }

    public C21372018kQ(C19EG c19eg) {
        TuxTextView tuxTextView;
        C0HZQ c0hzq;
        View viewFindViewById;
        C197039127h c197039127h;
        super(c19eg, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.d3o, this, true);
        this.LL = viewTd;
        if (viewTd != null) {
            tuxTextView = (TuxTextView) viewTd.findViewById(R.id.wlq);
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        if (viewTd != null) {
            c0hzq = (C0HZQ) viewTd.findViewById(R.id.rua);
        } else {
            c0hzq = null;
        }
        this.LLILLL = c0hzq;
        if (viewTd != null) {
            viewFindViewById = viewTd.findViewById(R.id.rub);
        } else {
            viewFindViewById = null;
        }
        this.LLILZ = viewFindViewById;
        if (viewTd != null) {
            c197039127h = (C197039127h) viewTd.findViewById(R.id.tzf);
        } else {
            c197039127h = null;
        }
        this.LLILZIL = c197039127h;
        this.LLILZLL = viewTd != null ? (C197039127h) viewTd.findViewById(R.id.ril) : null;
    }

    public final void setPostPrivacyFromDraftPanelChoice(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        int i = 0;
        creativeModel.privacySettingModel.isSubscribeOnly = false;
        if (Intrinsics.LJFF(creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility, "Friends")) {
            i = 2;
        }
        videoPublishEditModel.isPrivate = i;
    }

    @Override // X.InterfaceC21372218kS
    public final void LIZJ(Long l, Long l2) {
        if (l2 != null) {
            long jLongValue = l2.longValue();
            C0KWL.LIZ.getClass();
            if (jLongValue > C0KWL.LJ()) {
                TuxTextView tuxTextView = this.LLILLJJLI;
                if (tuxTextView != null) {
                    tuxTextView.setText(C0KWL.LJFF(getContext(), C447070Hg1.LIZ(l2.longValue())));
                    return;
                }
                return;
            }
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setText(getContext().getString(2131846737));
    }

    @Override // X.InterfaceC21372218kS
    public final void LIZ(VideoPublishEditModel videoPublishEditModel, AObjectS406S0100000_32 aObjectS406S0100000_32, AObjectS406S0100000_32 aObjectS406S0100000_322) {
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup viewGroup;
        View view = this.LL;
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.v4e)) != null) {
            C0KWL c0kwl = C0KWL.LIZ;
            Context context = getContext();
            c0kwl.getClass();
            viewGroup.addView(C0KWL.LIZLLL(context));
        }
        C0HZQ c0hzq = this.LLILLL;
        if (c0hzq != null) {
            c0hzq.setChecked(Intrinsics.LJFF(videoPublishEditModel.creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility, "Friends"));
        }
        C0HZQ c0hzq2 = this.LLILLL;
        if (c0hzq2 != null) {
            C786410Ut5.D7(c0hzq2, new C913870ZtB(videoPublishEditModel, 3));
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 59), view2);
        }
        C197039127h c197039127h = this.LLILZIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS134S0200000_32(aObjectS406S0100000_322, this, 13));
        }
        C197039127h c197039127h2 = this.LLILZLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS96S0300000_32(this, videoPublishEditModel, aObjectS406S0100000_32, 5));
        }
        float f = videoPublishEditModel.creativeModel.postPageModel.draftPanelModel.draftPublishButtonHeight;
        C197039127h c197039127h3 = this.LLILZIL;
        if (c197039127h3 != null && (layoutParams2 = c197039127h3.getLayoutParams()) != null) {
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
        }
        C197039127h c197039127h4 = this.LLILZLL;
        if (c197039127h4 != null && (layoutParams = c197039127h4.getLayoutParams()) != null) {
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f)));
        }
        C197039127h c197039127h5 = this.LLILZIL;
        if (c197039127h5 != null && (viewTreeObserver = c197039127h5.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC21523819Lg viewTreeObserverOnGlobalLayoutListenerC21523819Lg = new ViewTreeObserverOnGlobalLayoutListenerC21523819Lg(this, 2);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC21523819Lg);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC21523819Lg, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C197039127h c197039127h6 = this.LLILZIL;
        if (c197039127h6 != null) {
            c197039127h6.setMinTextSize(10.0f);
        }
    }
}
