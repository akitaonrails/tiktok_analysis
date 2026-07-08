package X;

import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0xqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class ViewOnTouchListenerC1834760xqU implements View.OnTouchListener {
    public final /* synthetic */ ViewGroup LL;
    public final /* synthetic */ int[] LLILLJJLI;
    public final /* synthetic */ C817403Hg LLILLL;
    public final /* synthetic */ C817403Hg LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ LiveHighLightPageFragment LLIZ;

    public ViewOnTouchListenerC1834760xqU(ViewGroup viewGroup, int[] iArr, C817403Hg c817403Hg, C817403Hg c817403Hg2, boolean z, View view, LiveHighLightPageFragment liveHighLightPageFragment) {
        this.LL = viewGroup;
        this.LLILLJJLI = iArr;
        this.LLILLL = c817403Hg;
        this.LLILZ = c817403Hg2;
        this.LLILZIL = z;
        this.LLILZLL = view;
        this.LLIZ = liveHighLightPageFragment;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById;
        View view2;
        int i;
        int i2;
        String str;
        long j;
        boolean z;
        C1835980xsS c1835980xsS;
        View viewFindViewById2;
        InterfaceC1836050xsZ interfaceC1836050xsZ;
        long j2;
        TextStickerConfig textStickerConfig;
        boolean z2;
        long j3;
        long j4;
        LiveHighLightPageFragment liveHighLightPageFragment;
        ViewGroup viewGroup;
        View view3;
        int i3;
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked != 0) {
            TextStickerConfig textStickerConfig2 = null;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else {
                    int width = this.LL.getWidth();
                    int height = this.LL.getHeight();
                    int width2 = this.LLILZLL.getWidth();
                    int height2 = this.LLILZLL.getHeight();
                    if (width <= 0 || height <= 0 || width2 <= 0 || height2 <= 0) {
                        return true;
                    }
                    this.LL.getLocationOnScreen(this.LLILLJJLI);
                    int[] iArr = this.LLILLJJLI;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float rawX = motionEvent.getRawX() - i5;
                    float rawY = motionEvent.getRawY() - i6;
                    C817403Hg c817403Hg = this.LLILLL;
                    float f = rawX - c817403Hg.element;
                    C817403Hg c817403Hg2 = this.LLILZ;
                    float f2 = rawY - c817403Hg2.element;
                    c817403Hg.element = rawX;
                    c817403Hg2.element = rawY;
                    float x = this.LLILZLL.getX();
                    float y = this.LLILZLL.getY() + f2;
                    float fMax = Math.max(0.0f, width - width2);
                    float fMax2 = Math.max(0.0f, height - height2);
                    float fLIZLLL = C13LZ.LIZLLL(x + f, 0.0f, fMax);
                    float fLIZLLL2 = C13LZ.LIZLLL(y, 0.0f, fMax2);
                    C786410Ut5.Fd(this.LLILZLL, fLIZLLL);
                    C786410Ut5.Ld(this.LLILZLL, fLIZLLL2);
                    View view4 = this.LLILZLL;
                    if ((view4 instanceof C385340F8y) && (viewGroup = (liveHighLightPageFragment = this.LLIZ).LLLLLILLIL) != null && (view3 = liveHighLightPageFragment.LLLLLJIL) != null) {
                        viewGroup.getLocationOnScreen(new int[2]);
                        view4.getLocationOnScreen(new int[2]);
                        int iLJ = (int) ((r11[0] - r12[0]) - 0.0f);
                        int iLJ2 = (int) ((r11[1] - r12[1]) - 0.0f);
                        int width3 = (int) (view4.getWidth() + 0.0f);
                        int height3 = (int) (view4.getHeight() + 0.0f);
                        int width4 = viewGroup.getWidth();
                        int height4 = viewGroup.getHeight();
                        if (width4 <= 0 || (i3 = width4 - width3) < 0) {
                            i3 = 0;
                        }
                        if (height4 <= 0 || (i4 = height4 - height3) < 0) {
                            i4 = 0;
                        }
                        if (width4 > 0) {
                            iLJ = C13LZ.LJ(iLJ, 0, i3);
                        }
                        if (height4 > 0) {
                            iLJ2 = C13LZ.LJ(iLJ2, 0, i4);
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        marginLayoutParams.width = width3;
                        marginLayoutParams.height = height3;
                        marginLayoutParams.leftMargin = iLJ;
                        marginLayoutParams.topMargin = iLJ2;
                        C786410Ut5.W5(view3, marginLayoutParams);
                    }
                    if (!this.LLILZIL && (this.LLILZLL instanceof C385340F8y)) {
                        C1834580xqC c1834580xqCLIZ = this.LLIZ.iS().getState().LLILZ.LIZ();
                        if (c1834580xqCLIZ != null) {
                            j4 = c1834580xqCLIZ.LLILZ;
                            textStickerConfig2 = c1834580xqCLIZ.LLJZIJLIL;
                        } else {
                            j4 = 0;
                        }
                        LiveHighLightPageFragment liveHighLightPageFragment2 = this.LLIZ;
                        C385340F8y c385340F8y = (C385340F8y) this.LLILZLL;
                        if (c1834580xqCLIZ != null) {
                            z3 = c1834580xqCLIZ.LLJZ;
                        }
                        liveHighLightPageFragment2.jT(j4, c385340F8y, textStickerConfig2, z3);
                    }
                    if (this.LLILZIL && (this.LLILZLL instanceof C385340F8y)) {
                        C1834580xqC c1834580xqCLIZ2 = this.LLIZ.iS().getState().LLILZ.LIZ();
                        if (c1834580xqCLIZ2 != null) {
                            j3 = c1834580xqCLIZ2.LLILZ;
                        } else {
                            j3 = 0;
                        }
                        this.LLIZ.ZS(j3, (C385340F8y) this.LLILZLL);
                        return true;
                    }
                    return true;
                }
            }
            if (this.LLILZLL instanceof C385340F8y) {
                View view5 = this.LLIZ.LLLLLJIL;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(8, view5);
                }
                if (!this.LLILZIL) {
                    C1834580xqC c1834580xqCLIZ3 = this.LLIZ.iS().getState().LLILZ.LIZ();
                    if (c1834580xqCLIZ3 != null) {
                        j2 = c1834580xqCLIZ3.LLILZ;
                        textStickerConfig = c1834580xqCLIZ3.LLJZIJLIL;
                    } else {
                        j2 = 0;
                        textStickerConfig = null;
                    }
                    LiveHighLightPageFragment liveHighLightPageFragment3 = this.LLIZ;
                    C385340F8y c385340F8y2 = (C385340F8y) this.LLILZLL;
                    if (c1834580xqCLIZ3 != null) {
                        z2 = c1834580xqCLIZ3.LLJZ;
                    } else {
                        z2 = false;
                    }
                    liveHighLightPageFragment3.jT(j2, c385340F8y2, textStickerConfig, z2);
                }
                if (this.LLILZIL) {
                    C1834580xqC c1834580xqCLIZ4 = this.LLIZ.iS().getState().LLILZ.LIZ();
                    if (c1834580xqCLIZ4 != null) {
                        j = c1834580xqCLIZ4.LLILZ;
                    } else {
                        j = 0;
                    }
                    this.LLIZ.ZS(j, (C385340F8y) this.LLILZLL);
                    LiveHighLightPageFragment liveHighLightPageFragment4 = this.LLIZ;
                    if (liveHighLightPageFragment4.LLLLLLZZ == EnumC1508960pN0.PLAYER_START && C1835120xr4.LIZ == EnumC1508960pN0.PLAYER_PAUSE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z4 = liveHighLightPageFragment4.LLLLLZIL;
                    liveHighLightPageFragment4.LLLLLZIL = false;
                    if (z) {
                        C1835970xsR c1835970xsR = liveHighLightPageFragment4.LLIZ;
                        if (c1835970xsR != null && (interfaceC1836050xsZ = c1835970xsR.LLJJJIL) != null) {
                            c1835970xsR.LLJJJ = false;
                            interfaceC1836050xsZ.LJIIIZ();
                            c1835970xsR.LJFF();
                        }
                    } else if (z4 && C1835120xr4.LIZ == EnumC1508960pN0.PLAYER_PAUSE && (c1835980xsS = liveHighLightPageFragment4.LLIZLLLIL) != null && (viewFindViewById2 = c1835980xsS.findViewById(R.id.qmi)) != null) {
                        C500260Jjc.LLFFF(viewFindViewById2);
                    }
                    this.LLIZ.LLLLLLZZ = null;
                }
                if (this.LLILZIL) {
                    str = "caption";
                } else {
                    str = "text";
                }
                C485260J1g c485260J1g = C485260J1g.LIZ;
                C2344009Gk c2344009GkBS = LiveHighLightPageFragment.bS(this.LLIZ, null, 0L, false, 7);
                c2344009GkBS.LJIIIIZZ("type", str);
                Map<String, String> map = c2344009GkBS.LIZ;
                c485260J1g.getClass();
                C20684815ws.LJIILLIIL("livesdk_anchor_highlight_text_drag", map);
            }
            LiveHighLightPageFragment liveHighLightPageFragment5 = this.LLIZ;
            View view6 = liveHighLightPageFragment5.LLLLLLL;
            if (view6 != null) {
                C500260Jjc.LJIILIIL(view6);
            }
            View view7 = liveHighLightPageFragment5.LLLLLLLLL;
            if (view7 != null) {
                C500260Jjc.LJIILIIL(view7);
                return true;
            }
            return true;
        }
        this.LL.getLocationOnScreen(this.LLILLJJLI);
        int[] iArr2 = this.LLILLJJLI;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        this.LLILLL.element = motionEvent.getRawX() - i7;
        this.LLILZ.element = motionEvent.getRawY() - i8;
        if (this.LLILZIL) {
            if (this.LLILZLL instanceof C385340F8y) {
                this.LLIZ.LLLLLLZZ = C1835120xr4.LIZ;
            }
            LiveHighLightPageFragment liveHighLightPageFragment6 = this.LLIZ;
            if (liveHighLightPageFragment6.LLLLLLLLLL) {
                View view8 = liveHighLightPageFragment6.LLLLLLL;
                if (view8 != null) {
                    C500260Jjc.LLFFF(view8);
                }
                View view9 = liveHighLightPageFragment6.LLLLLLLLL;
                if (view9 != null) {
                    C500260Jjc.LJIILIIL(view9);
                }
            }
        } else {
            LiveHighLightPageFragment liveHighLightPageFragment7 = this.LLIZ;
            if (liveHighLightPageFragment7.LLLLLLLLLL) {
                View view10 = liveHighLightPageFragment7.LLLLLLLLL;
                if (view10 != null) {
                    C500260Jjc.LLFFF(view10);
                }
                View view11 = liveHighLightPageFragment7.LLLLLLL;
                if (view11 != null) {
                    C500260Jjc.LJIILIIL(view11);
                }
            }
        }
        View view12 = this.LLILZLL;
        if (view12 instanceof C385340F8y) {
            LiveHighLightPageFragment liveHighLightPageFragment8 = this.LLIZ;
            ViewGroup viewGroup2 = liveHighLightPageFragment8.LLLLLILLIL;
            if (viewGroup2 != null && (view2 = liveHighLightPageFragment8.LLLLLJIL) != null) {
                viewGroup2.getLocationOnScreen(new int[2]);
                view12.getLocationOnScreen(new int[2]);
                int iLJ3 = (int) ((r12[0] - r11[0]) - 0.0f);
                int iLJ4 = (int) ((r12[1] - r11[1]) - 0.0f);
                int width5 = (int) (view12.getWidth() + 0.0f);
                int height5 = (int) (view12.getHeight() + 0.0f);
                int width6 = viewGroup2.getWidth();
                int height6 = viewGroup2.getHeight();
                if (width6 <= 0 || (i = width6 - width5) < 0) {
                    i = 0;
                }
                if (height6 <= 0 || (i2 = height6 - height5) < 0) {
                    i2 = 0;
                }
                if (width6 > 0) {
                    iLJ3 = C13LZ.LJ(iLJ3, 0, i);
                }
                if (height6 > 0) {
                    iLJ4 = C13LZ.LJ(iLJ4, 0, i2);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams2.width = width5;
                marginLayoutParams2.height = height5;
                marginLayoutParams2.leftMargin = iLJ3;
                marginLayoutParams2.topMargin = iLJ4;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 1.5f, liveHighLightPageFragment8.getResources().getDisplayMetrics());
                float fApplyDimension = TypedValue.applyDimension(1, 6.0f, liveHighLightPageFragment8.getResources().getDisplayMetrics());
                float fApplyDimension2 = TypedValue.applyDimension(1, 6.0f, liveHighLightPageFragment8.getResources().getDisplayMetrics());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke(iApplyDimension, -1, fApplyDimension, fApplyDimension2);
                gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 5.0f, liveHighLightPageFragment8.getResources().getDisplayMetrics()));
                view2.setBackground(gradientDrawable);
                C786410Ut5.LJLLLLLL(0, view2);
                view2.requestLayout();
            }
            if (this.LLILZIL) {
                C1835970xsR c1835970xsR2 = this.LLIZ.LLIZ;
                if (c1835970xsR2 != null) {
                    c1835970xsR2.LJI();
                }
                C1835980xsS c1835980xsS2 = this.LLIZ.LLIZLLLIL;
                if (c1835980xsS2 != null && (viewFindViewById = c1835980xsS2.findViewById(R.id.qmi)) != null) {
                    C500260Jjc.LJIILIIL(viewFindViewById);
                }
                this.LLIZ.LLLLLZIL = true;
                return true;
            }
            return true;
        }
        return true;
    }
}
