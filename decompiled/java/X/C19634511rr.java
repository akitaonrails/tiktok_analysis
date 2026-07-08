package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.editview.StatusBarAdaptSoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.GregorianCalendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: renamed from: X.11rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19634511rr extends AbstractC390720FTq {
    public TextView LLILZ;
    public TextView LLILZIL;
    public TextView LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public final C19634811ru LLJ;
    public int LLJI;
    public Function0<? extends Point> LLJIJIL;
    public DialogC19635711s3 LLJILJIL;
    public C0FSC LLJILJILJ;
    public final C01GW LLJILLL;
    public int LLJJ;
    public EnumC19360110oh LLJJI;
    public LiveCountDownStickerModel LLJJIII;
    public C1664680tQA<LiveCountDownStickerModel> LLJJIJI;
    public C1664680tQA<LiveCountDownStickerModel> LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;

    public final void LJIILL() {
        Editable editableC;
        LJIIJ(-1);
        TextView textView = this.LLILZIL;
        if (textView != null) {
            C391430FWj edLiveTitle = getLiveCountDownStickerView().getEdLiveTitle();
            C786410Ut5.S4((edLiveTitle == null || (editableC = C2204961BRm.C(edLiveTitle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H4lAYPe+C+y1xhFJ1VDSby5gWRL060TeXVI2LSscvfhJiA==", null))) == null || editableC.length() == 0 || !LJIILIIL()) ? 0.5f : 1.0f, textView);
        }
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    private final C19635611s2 getAnimStickerView() {
        return (C19635611s2) this.LLJJJ.getValue();
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA = this.LLJJIJIIJIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(267), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(268), true);
        this.LLJJJIL = false;
        C0FSC c0fsc = this.LLJILJILJ;
        if (c0fsc != null) {
            LiveCountDownStickerModel liveCountDownStickerModel = this.LLJJIII;
            LiveCountDownStickerModel liveCountDownStickerModel2 = liveCountDownStickerModel != null ? liveCountDownStickerModel : null;
            c0fsc.LIZ(liveCountDownStickerModel2.copy(liveCountDownStickerModel2.baseStickerModel, getStateContainer().LIZ.getTitle(), getStateContainer().LIZ.getEndTime(), getStateContainer().LIZ.getLastEditTime(), liveCountDownStickerModel2.subscribeNum, liveCountDownStickerModel2.subscribe, liveCountDownStickerModel2.textAlreadyExpired, liveCountDownStickerModel2.textTobeSubscribed, liveCountDownStickerModel2.textAlreadySubscribed, liveCountDownStickerModel2.maxLine, false, liveCountDownStickerModel2.editable, true), false);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() {
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA = this.LLJJIJIIJIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(269), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(270), true);
        C391430FWj edLiveTitle = getLiveCountDownStickerView().getEdLiveTitle();
        if (edLiveTitle != null) {
            edLiveTitle.requestFocus();
        }
        LJIILJJIL(getAnimStickerView());
        LJIIJ(0);
        TextView textView = this.LLILZ;
        C786410Ut5.LLIL(textView != null ? textView : null, 0);
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJILJILJ;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    public final void LJIILLIIL() {
        this.LLJJI = EnumC19360110oh.EDIT_QUITED;
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA = this.LLJJIJIIJIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 490), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(271), true);
        String title = getStateContainer().LIZ.getTitle();
        if (title == null || title.length() == 0) {
            C1664680tQA<LiveCountDownStickerModel> c1664680tQA2 = this.LLJJIJIIJIL;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(272), true);
        }
        C19635611s2 animStickerView = getAnimStickerView();
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA3 = this.LLJJIJIIJIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA3.LIZ.getBaseStickerModel();
        LiveCountDownStickerModel liveCountDownStickerModel = this.LLJJIII;
        LJIIIIZZ(animStickerView, baseStickerModelCopy$default, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (liveCountDownStickerModel != null ? liveCountDownStickerModel : null).getBaseStickerModel().getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    public final C19635611s2 getLiveCountDownStickerView() {
        return (C19635611s2) this.LLJJIJIL.getValue();
    }

    public final InterfaceC19635111rx getMobService() {
        return (InterfaceC19635111rx) this.LLJILLL.getValue();
    }

    @Override // X.AbstractC390720FTq
    public SoftKeyBoardListener getSoftKeyBoardListenerInstance() {
        return new StatusBarAdaptSoftKeyBoardListener(C0FNT.LIZ(getContext()));
    }

    public final C1664680tQA<LiveCountDownStickerModel> getStateContainer() {
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA = this.LLJJIJI;
        if (c1664680tQA != null) {
            return c1664680tQA;
        }
        return null;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int bottom = frameLayout.getBottom();
        return ((bottom + (this.LLIZ != null ? r0 : null).getTop()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        LiveCountDownStickerModel liveCountDownStickerModel = this.LLJJIII;
        if (liveCountDownStickerModel == null) {
            liveCountDownStickerModel = null;
        }
        String title = liveCountDownStickerModel.getTitle();
        if (title == null || title.length() == 0) {
            return 0.0f;
        }
        LiveCountDownStickerModel liveCountDownStickerModel2 = this.LLJJIII;
        if (liveCountDownStickerModel2 == null) {
            liveCountDownStickerModel2 = null;
        }
        float centerY = liveCountDownStickerModel2.getBaseStickerModel().getCenterY();
        LiveCountDownStickerModel liveCountDownStickerModel3 = this.LLJJIII;
        if (liveCountDownStickerModel3 == null) {
            liveCountDownStickerModel3 = null;
        }
        return ((centerY + liveCountDownStickerModel3.getBaseStickerModel().getTranslateY()) + (this.LLJJIII != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    public final boolean LJIILIIL() {
        if (getStateContainer().LIZ.getEndTime() == 0) {
            return false;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(getStateContainer().LIZ.getEndTime());
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(System.currentTimeMillis());
        if (gregorianCalendar2.getTimeInMillis() > getStateContainer().LIZ.getEndTime()) {
            return false;
        }
        return (gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(2) == gregorianCalendar2.get(2) && gregorianCalendar.get(5) == gregorianCalendar2.get(5) && gregorianCalendar.get(11) == gregorianCalendar2.get(11) && gregorianCalendar.get(12) == gregorianCalendar2.get(12)) ? false : true;
    }

    public final EnumC19360110oh getEditState() {
        return this.LLJJI;
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        FrameLayout frameLayout = this.LLIZLLLIL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
            }
        } else {
            marginLayoutParams = null;
        }
        FrameLayout frameLayout3 = this.LLIZLLLIL;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        C786410Ut5.a6(frameLayout3, marginLayoutParams);
        if (i > 0) {
            FrameLayout frameLayout4 = this.LLIZ;
            if (frameLayout4 == null) {
                frameLayout4 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout4.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = 0;
                }
            } else {
                marginLayoutParams2 = null;
            }
            FrameLayout frameLayout5 = this.LLIZ;
            if (frameLayout5 != null) {
                frameLayout2 = frameLayout5;
            }
            C786410Ut5.a6(frameLayout2, marginLayoutParams2);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLIZ;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
            }
        } else {
            marginLayoutParams = null;
        }
        FrameLayout frameLayout3 = this.LLIZ;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    public final void LJIIJ(int i) {
        this.LLJI = i;
        TextView textView = null;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                TextView textView2 = this.LLILZ;
                                if (textView2 != null) {
                                    textView = textView2;
                                }
                                textView.setText(2131829563);
                                return;
                            }
                            return;
                        }
                        TextView textView3 = this.LLILZ;
                        if (textView3 != null) {
                            textView = textView3;
                        }
                        textView.setText(2131829562);
                        return;
                    }
                    TextView textView4 = this.LLILZ;
                    if (textView4 != null) {
                        textView = textView4;
                    }
                    textView.setText(2131829564);
                    return;
                }
                if (this.LLJ.LIZ.getBoolean("has_live_cd_edit_hint_show", false)) {
                    TextView textView5 = this.LLILZ;
                    if (textView5 != null) {
                        textView = textView5;
                    }
                    textView.setText("");
                    return;
                }
                TextView textView6 = this.LLILZ;
                if (textView6 != null) {
                    textView = textView6;
                }
                textView.setText(2131829591);
                return;
            }
            if (this.LLJ.LIZ.getBoolean("has_live_cd_edit_hint_show", false)) {
                TextView textView7 = this.LLILZ;
                if (textView7 != null) {
                    textView = textView7;
                }
                textView.setText("");
                return;
            }
            TextView textView8 = this.LLILZ;
            if (textView8 != null) {
                textView = textView8;
            }
            textView.setText(2131834702);
            return;
        }
        TextView textView9 = this.LLILZ;
        if (textView9 != null) {
            textView = textView9;
        }
        textView.setText("");
    }

    public final void LJIIJJI(boolean z) {
        Editable editableD;
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(265), true);
        String title = getStateContainer().LIZ.getTitle();
        C391430FWj edLiveTitle = getLiveCountDownStickerView().getEdLiveTitle();
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA = null;
        if (edLiveTitle != null) {
            editableD = C2204961BRm.D(edLiveTitle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H4lAYPe+C+y1xhFJ1VDSby5gWRL060TeXVI2LSscvfhJiA==", null));
        } else {
            editableD = null;
        }
        if (!Intrinsics.LJFF(title, String.valueOf(editableD))) {
            getStateContainer().LIZLLL(new AwS608S0100000_29(this, 491), true);
        }
        TextView textView = this.LLILZ;
        if (textView == null) {
            textView = null;
        }
        C786410Ut5.LLIL(textView, 8);
        this.LLJJJIL = false;
        if (z) {
            if (C123100dR.LIZ(getStateContainer().LIZ.getTitle())) {
                getStateContainer().LIZLLL(new AwS608S0100000_29(this, 487), true);
            } else {
                InterfaceC19635111rx mobService = getMobService();
                if (mobService != null) {
                    mobService.LJFF(true);
                }
                getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(266), true);
                C391430FWj edLiveTitle2 = getLiveCountDownStickerView().getEdLiveTitle();
                if (edLiveTitle2 != null) {
                    LIZ(edLiveTitle2);
                }
            }
        }
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA2 = this.LLJJIJIIJIL;
        if (c1664680tQA2 != null) {
            c1664680tQA = c1664680tQA2;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 489), true);
        if (this.LLJJ > 0) {
            this.LLJJI = EnumC19360110oh.EDIT_CLOSING;
            C391430FWj edLiveTitle3 = getLiveCountDownStickerView().getEdLiveTitle();
            if (edLiveTitle3 != null) {
                LIZ(edLiveTitle3);
                return;
            }
            return;
        }
        LJIILLIIL();
    }

    public final void LJIILJJIL(View view) {
        TextView textView = this.LLILZ;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        marginLayoutParams.topMargin = iArr[1] + view.getHeight() + C384720F6o.LIZ(8.0d, getContext());
        marginLayoutParams.width = ScreenUtils.getScreenWidth(getContext());
        TextView textView3 = this.LLILZ;
        if (textView3 != null) {
            textView2 = textView3;
        }
        C786410Ut5.g6(textView2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        LIZLLL(i);
        this.LLJJ = i;
        if (this.LLJJI == EnumC19360110oh.EDIT_OPENING) {
            this.LLJJI = EnumC19360110oh.EDITING;
            C19635611s2 liveCountDownStickerView = getLiveCountDownStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveCountDownStickerView);
            liveCountDownStickerView.setTranslationX(0.0f);
            C19635611s2 liveCountDownStickerView2 = getLiveCountDownStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveCountDownStickerView2);
            liveCountDownStickerView2.setTranslationY(0.0f);
            LiveCountDownStickerModel liveCountDownStickerModel = this.LLJJIII;
            C1664680tQA<LiveCountDownStickerModel> c1664680tQA = null;
            if (liveCountDownStickerModel == null) {
                liveCountDownStickerModel = null;
            }
            String title = liveCountDownStickerModel.getTitle();
            if (title == null || title.length() == 0) {
                C1664680tQA<LiveCountDownStickerModel> c1664680tQA2 = this.LLJJIJIIJIL;
                if (c1664680tQA2 == null) {
                    c1664680tQA2 = null;
                }
                c1664680tQA2.LIZLLL(new AwS608S0100000_29(this, 488), true);
            }
            C1664680tQA<LiveCountDownStickerModel> c1664680tQA3 = this.LLJJIJIIJIL;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(AFwS273S0000000_29.get$arr$(263), true);
            getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(264), true);
            C19635611s2 animStickerView = getAnimStickerView();
            C1664680tQA<LiveCountDownStickerModel> c1664680tQA4 = this.LLJJIJIIJIL;
            if (c1664680tQA4 != null) {
                c1664680tQA = c1664680tQA4;
            }
            LJIIIZ(animStickerView, c1664680tQA.LIZ.getBaseStickerModel(), BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
        }
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        super.LJZI(i);
        this.LLJJ = 0;
        if (this.LLJJI == EnumC19360110oh.EDIT_CLOSING) {
            LJIILLIIL();
        }
    }

    public final void setEditState(EnumC19360110oh enumC19360110oh) {
        this.LLJJI = enumC19360110oh;
    }

    public final void setStateContainer(C1664680tQA<LiveCountDownStickerModel> c1664680tQA) {
        this.LLJJIJI = c1664680tQA;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJILJILJ = c0fsc;
    }

    public C19634511rr(Context context, C390420FSm c390420FSm) {
        super(context, null, 0);
        this.LLJ = new C19634811ru();
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(c390420FSm, 794));
        this.LLJJI = EnumC19360110oh.EDIT_QUITED;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(context, 793));
        this.LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(context, 792));
        this.LLJJJIL = true;
    }

    public final void LJIIL(LiveCountDownStickerModel liveCountDownStickerModel, AwS573S0100000_29 awS573S0100000_29, LifecycleOwner lifecycleOwner) {
        setStateContainer(new C1664680tQA<>(liveCountDownStickerModel.copy(liveCountDownStickerModel.baseStickerModel, liveCountDownStickerModel.title, liveCountDownStickerModel.endTime, liveCountDownStickerModel.lastEditTime, liveCountDownStickerModel.subscribeNum, liveCountDownStickerModel.subscribe, liveCountDownStickerModel.textAlreadyExpired, liveCountDownStickerModel.textTobeSubscribed, liveCountDownStickerModel.textAlreadySubscribed, liveCountDownStickerModel.maxLine, true, true, false)));
        this.LLJJIJIIJIL = new C1664680tQA<>(liveCountDownStickerModel.copy(liveCountDownStickerModel.baseStickerModel, liveCountDownStickerModel.title, liveCountDownStickerModel.endTime, liveCountDownStickerModel.lastEditTime, liveCountDownStickerModel.subscribeNum, liveCountDownStickerModel.subscribe, liveCountDownStickerModel.textAlreadyExpired, liveCountDownStickerModel.textTobeSubscribed, liveCountDownStickerModel.textAlreadySubscribed, liveCountDownStickerModel.maxLine, true, liveCountDownStickerModel.editable, false));
        this.LLJJIII = liveCountDownStickerModel;
        setBackgroundColor(C960203pA.LIZ(R.attr.a1_, getContext()));
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d67, this, true);
        this.LLIZ = (FrameLayout) findViewById(R.id.muo);
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.mvu);
        this.LLILZ = (TextView) findViewById(R.id.mup);
        this.LLILZIL = (TextView) findViewById(R.id.zta);
        TextView textView = this.LLILZIL;
        if (textView != null) {
            C786410Ut5.S4(0.5f, textView);
        }
        this.LLILZLL = (TextView) findViewById(R.id.zt_);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout frameLayout = this.LLIZ;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.addView(getLiveCountDownStickerView(), layoutParams);
        addView(getAnimStickerView(), layoutParams);
        C19635611s2 liveCountDownStickerView = getLiveCountDownStickerView();
        int visibility = liveCountDownStickerView.getVisibility();
        liveCountDownStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, liveCountDownStickerView);
        C19635611s2 animStickerView = getAnimStickerView();
        int visibility2 = animStickerView.getVisibility();
        animStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, animStickerView);
        getLiveCountDownStickerView().LIZIZ(lifecycleOwner, getStateContainer());
        C19635611s2 animStickerView2 = getAnimStickerView();
        C1664680tQA<LiveCountDownStickerModel> c1664680tQA = this.LLJJIJIIJIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        animStickerView2.LIZIZ(lifecycleOwner, c1664680tQA);
        FrameLayout frameLayout3 = this.LLIZLLLIL;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.O7(frameLayout2, new AkS95S0100000_29(this, 64));
        TextView textView2 = this.LLILZIL;
        if (textView2 != null) {
            C786410Ut5.T7(textView2, new AkS95S0100000_29(this, 65));
        }
        TextView textView3 = this.LLILZLL;
        if (textView3 != null) {
            C786410Ut5.T7(textView3, new AkS95S0100000_29(this, 66));
        }
        C418610GbD llCountDown = getLiveCountDownStickerView().getLlCountDown();
        if (llCountDown != null) {
            View.OnClickListener akS95S0100000_29 = new AkS95S0100000_29(this, 67);
            if (C1848410yCV.LIZ) {
                akS95S0100000_29 = new f(akS95S0100000_29);
            }
            a aVar = new a(akS95S0100000_29);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(llCountDown);
            }
            llCountDown.setOnClickListener(aVar);
        }
        this.LLJIJIL = awS573S0100000_29;
        final C391430FWj edLiveTitle = getLiveCountDownStickerView().getEdLiveTitle();
        if (edLiveTitle != null) {
            final AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(this, 494);
            edLiveTitle.addTextChangedListener(new TextWatcher(edLiveTitle, awS608S0100000_29) { // from class: X.0FWi
                public final EditText LL;
                public final Function1<String, Unit> LLILLJJLI;

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    Editable editableLLJILLL;
                    EditText editText = this.LL;
                    if (editText != null && (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null))) != null && editableLLJILLL.length() != 0) {
                        int iLIZ = C384720F6o.LIZ(190.0d, editText.getContext());
                        try {
                            String string = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).toString();
                            if (a0.LJJIJIL(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)), " ")) {
                                string = a0.LJJLIIIJLLLLLLLZ(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).toString(), new IntRange(0, C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).toString().length() - 2)) + '-';
                            }
                            if (new StaticLayout(string, editText.getPaint(), iLIZ, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() > 2) {
                                String string2 = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).toString();
                                if (string2.length() >= 100) {
                                    string2 = string2.substring(0, 100);
                                }
                                String strSubstring = string2.substring(0, string2.length() - 1);
                                for (int length = strSubstring.length() - 1; length >= 0 && Character.isHighSurrogate(strSubstring.charAt(length)); length--) {
                                    strSubstring = strSubstring.substring(0, length);
                                }
                                editText.setText(strSubstring);
                                editText.setSelection(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).length());
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    String strValueOf = String.valueOf(editable);
                    if (a0.LJJIZ(strValueOf, '\r', 0, false, 6) >= 0 || a0.LJJIZ(strValueOf, '\n', 0, false, 6) >= 0) {
                        this.LL.setText(u.LJJIFFI(u.LJJIFFI(strValueOf, "\r", "", false), "\n", "", false));
                        EditText editText2 = this.LL;
                        editText2.setSelection(C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).length());
                    }
                    this.LLILLJJLI.invoke(C2204961BRm.LLJILLL(this.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).toString());
                }

                {
                    this.LL = edLiveTitle;
                    this.LLILLJJLI = awS608S0100000_29;
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    EditText editText = this.LL;
                    if (editText != null) {
                        if (TextUtils.isEmpty(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7A==", null)).toString()) && editText.getHint() != null) {
                            Paint paint = new Paint();
                            paint.setTextSize(editText.getTextSize());
                            paint.setTypeface(editText.getTypeface());
                            int iMeasureText = (int) ((editText.getLayoutParams().width - paint.measureText(editText.getHint().toString())) / 2);
                            if (iMeasureText < 0) {
                                editText.setPaddingRelative(0, 0, 0, 0);
                                editText.setGravity(8388659);
                                return;
                            } else {
                                editText.setPaddingRelative(iMeasureText, 0, 0, 0);
                                editText.setGravity(8388627);
                                return;
                            }
                        }
                        editText.setGravity(17);
                        editText.setPaddingRelative(C384720F6o.LIZ(0.0d, editText.getContext()), 0, C384720F6o.LIZ(0.0d, editText.getContext()), 0);
                    }
                }
            });
        }
    }
}
