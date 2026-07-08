package X;

import Y.ACListenerS125S0200000_22;
import Y.ACListenerS134S0200000_32;
import Y.ACListenerS96S0300000_32;
import Y.AObjectS406S0100000_32;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21372118kR extends FrameLayout implements InterfaceC21372218kS {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final TuxTextView LLILZIL;
    public final View LLILZLL;
    public final TuxTextView LLIZ;
    public final boolean LLIZLLLIL;

    @Override // X.InterfaceC21372218kS
    public final void LIZIZ(int i, List<? extends UrlModel> list) {
    }

    public C21372118kR(C19EG c19eg) {
        TuxTextView tuxTextView;
        View viewFindViewById;
        View viewFindViewById2;
        TuxTextView tuxTextView2;
        View viewFindViewById3;
        super(c19eg, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19eg), R.layout.d3m, this, true);
        this.LL = viewTd;
        if (viewTd != null) {
            tuxTextView = (TuxTextView) viewTd.findViewById(R.id.wlq);
        } else {
            tuxTextView = null;
        }
        this.LLILLJJLI = tuxTextView;
        if (viewTd != null) {
            viewFindViewById = viewTd.findViewById(R.id.ril);
        } else {
            viewFindViewById = null;
        }
        this.LLILLL = viewFindViewById;
        if (viewTd != null) {
            viewFindViewById2 = viewTd.findViewById(R.id.rls);
        } else {
            viewFindViewById2 = null;
        }
        this.LLILZ = viewFindViewById2;
        if (viewTd != null) {
            tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.rlu);
        } else {
            tuxTextView2 = null;
        }
        this.LLILZIL = tuxTextView2;
        if (viewTd != null) {
            viewFindViewById3 = viewTd.findViewById(R.id.tzf);
        } else {
            viewFindViewById3 = null;
        }
        this.LLILZLL = viewFindViewById3;
        this.LLIZ = viewFindViewById3 != null ? (TuxTextView) viewFindViewById3.findViewById(R.id.g7o) : null;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        this.LLIZLLLIL = currentUser != null ? currentUser.LJIIJJI() : false;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    @Override // X.InterfaceC21372218kS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Long r8, java.lang.Long r9) {
        /*
            r7 = this;
            r5 = 1
            r6 = 0
            if (r9 == 0) goto L69
            long r3 = r9.longValue()
            X.0KWL r0 = X.C0KWL.LIZ
            r0.getClass()
            long r1 = X.C0KWL.LJ()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L69
            com.bytedance.tux.input.TuxTextView r3 = r7.LLILLJJLI
            if (r3 == 0) goto L2c
            android.content.Context r2 = r7.getContext()
            long r0 = r9.longValue()
            java.lang.String r0 = X.C447070Hg1.LIZ(r0)
            android.text.SpannableString r0 = X.C0KWL.LJFF(r2, r0)
            r3.setText(r0)
        L2c:
            boolean r0 = X.C08A4.LIZIZ(r8)
            if (r0 == 0) goto L56
            com.bytedance.tux.input.TuxTextView r4 = r7.LLIZ
            if (r4 == 0) goto L52
            android.content.Context r3 = r7.getContext()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            if (r8 == 0) goto L53
            long r0 = r8.longValue()
        L42:
            java.lang.String r0 = X.C447070Hg1.LIZ(r0)
            r2[r6] = r0
            r0 = 2131846753(0x7f116661, float:1.9326964E38)
            java.lang.String r0 = r3.getString(r0, r2)
            r4.setText(r0)
        L52:
            return
        L53:
            r0 = 0
            goto L42
        L56:
            com.bytedance.tux.input.TuxTextView r2 = r7.LLIZ
            if (r2 == 0) goto L52
            android.content.Context r1 = r7.getContext()
            r0 = 2131846747(0x7f11665b, float:1.9326952E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            return
        L69:
            com.bytedance.tux.input.TuxTextView r2 = r7.LLILLJJLI
            if (r2 == 0) goto L2c
            android.content.Context r1 = r7.getContext()
            r0 = 2131846737(0x7f116651, float:1.9326932E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21372118kR.LIZJ(java.lang.Long, java.lang.Long):void");
    }

    @Override // X.InterfaceC21372218kS
    public final void LIZ(VideoPublishEditModel videoPublishEditModel, AObjectS406S0100000_32 aObjectS406S0100000_32, AObjectS406S0100000_32 aObjectS406S0100000_322) {
        Rect rect;
        ViewGroup viewGroup;
        String string;
        ViewGroup viewGroup2;
        View view = this.LL;
        if (view != null && (viewGroup2 = (ViewGroup) view.findViewById(R.id.v4e)) != null) {
            C0KWL c0kwl = C0KWL.LIZ;
            Context context = getContext();
            c0kwl.getClass();
            viewGroup2.addView(C0KWL.LIZLLL(context));
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS96S0300000_32(this, videoPublishEditModel, aObjectS406S0100000_32, 2), view2);
        }
        View view3 = this.LLILZLL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS134S0200000_32(aObjectS406S0100000_322, this, 11), view3);
        }
        View view4 = this.LLILZ;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS125S0200000_22(this, videoPublishEditModel, 9), view4);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            String str = videoPublishEditModel.creativeModel.postPageModel.draftPanelModel.draftPanelSelectedVisibility;
            if (Intrinsics.LJFF(str, "Everyone")) {
                if (this.LLIZLLLIL) {
                    string = getContext().getString(2131846743);
                } else {
                    string = getContext().getString(2131846742);
                }
            } else if (Intrinsics.LJFF(str, "Friends")) {
                string = getContext().getString(2131846744);
            } else {
                string = "";
            }
            tuxTextView.setText(string);
        }
        View view5 = this.LLILZ;
        if (view5 != null) {
            if (C444960Hcc.LIZJ(getContext())) {
                rect = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            } else {
                rect = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            }
            C19713912Bd c19713912Bd = C19713912Bd.LIZ;
            ViewParent parent = view5.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            c19713912Bd.getClass();
            C19713912Bd.LIZ(rect, view5, viewGroup);
        }
    }
}
