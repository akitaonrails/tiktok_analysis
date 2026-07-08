package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModeLastImageHintAssem;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0SRE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SRE extends C09AY implements Function1<C0S9P, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ PhotoModeLastImageHintAssem LLILLL;
    public final /* synthetic */ TuxIconView LLILZ;
    public final /* synthetic */ PhotosViewHolderV3 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C259800zU<C21647019ng> LLIZ;
    public final /* synthetic */ C259800zU<C21647019ng> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SRE(int i, int i2, PhotoModeLastImageHintAssem photoModeLastImageHintAssem, TuxIconView tuxIconView, PhotosViewHolderV3 photosViewHolderV3, int i3, C259800zU<C21647019ng> c259800zU, C259800zU<C21647019ng> c259800zU2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = photoModeLastImageHintAssem;
        this.LLILZ = tuxIconView;
        this.LLILZIL = photosViewHolderV3;
        this.LLILZLL = i3;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0S9P c0s9p) {
        float fFloatValue;
        View view;
        boolean zLIZLLL;
        String str;
        BaseFeedPageParams baseFeedPageParams;
        int i;
        float fFloatValue2;
        int iL40;
        C0S9P c0s9p2 = c0s9p;
        float f = this.LL;
        float f2 = this.LLILLJJLI;
        if (this.LLILLL.LLLFF) {
            fFloatValue = ((Number) C2553809zc.LIZ.getValue()).floatValue();
        } else {
            fFloatValue = 0.2f;
        }
        if (f > f2 * fFloatValue) {
            PhotoModeLastImageHintAssem photoModeLastImageHintAssem = this.LLILLL;
            photoModeLastImageHintAssem.LLJLILLLLZIIL = true;
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                C259800zU<C21647019ng> c259800zU = this.LLIZ;
                C259800zU<C21647019ng> c259800zU2 = this.LLIZLLLIL;
                if (!photoModeLastImageHintAssem.LLJLIL) {
                    C21647019ng c21647019ng = c259800zU.element;
                    if (c21647019ng != null) {
                        c21647019ng.LJI(true);
                    }
                    tuxIconView.setIconRes(R.raw.icon_tick_circle_fill);
                    tuxIconView.setTintColorRes(R.attr.zi);
                    C21647019ng c21647019ng2 = c259800zU2.element;
                    if (c21647019ng2 != null) {
                        c21647019ng2.LJI(true);
                    }
                    PhotoModeLastImageHintAssem.LLLILZ = true;
                    photoModeLastImageHintAssem.LLLFF = true;
                    Context context = tuxIconView.getContext();
                    if (context != null) {
                        new C0ZDN(context).LIZ(0);
                    }
                }
            }
            C0SLX c0slx = this.LLILLL.LLJJJJLIIL;
            if (c0slx != null) {
                c0slx.setSmoothScrollDelay(true);
            }
        } else {
            if (this.LL > 0) {
                PhotoModeLastImageHintAssem photoModeLastImageHintAssem2 = this.LLILLL;
                photoModeLastImageHintAssem2.LLJLILLLLZIIL = false;
                int i2 = this.LLILLJJLI;
                C0SLX c0slx2 = photoModeLastImageHintAssem2.LLJJJJLIIL;
                if (c0slx2 != null && !photoModeLastImageHintAssem2.LLLFF && c0slx2.getMIsActionFling().booleanValue() && Math.abs(r2) < i2 * 0.3f && ((Number) C0BKL.LIZ.getValue()).intValue() >= 1 && !PhotoModeLastImageHintAssem.LLLILZ) {
                    PhotoModeLastImageHintAssem.LLLILZ = true;
                    photoModeLastImageHintAssem2.ip().RQ2(true);
                    TuxTextView tuxTextView = photoModeLastImageHintAssem2.LLJJL;
                    if (tuxTextView != null) {
                        C786410Ut5.LLLLZLL(tuxTextView, 0);
                        C21647019ng c21647019ng3 = new C21647019ng(tuxTextView.getContext(), tuxTextView, new C19746312Np(EnumC19746112Nn.SPRING, photoModeLastImageHintAssem2.LLLIIIIL, photoModeLastImageHintAssem2.LLLIIIL), false);
                        photoModeLastImageHintAssem2.LLLFFI = c21647019ng3;
                        c21647019ng3.LIZJ("alpha", new C738910Syf(tuxTextView, 1));
                    }
                    C12P4 c12p4 = photoModeLastImageHintAssem2.LLJJLIIIJLLLLLLLZ;
                    if (c12p4 != null) {
                        C786410Ut5.LLLLLLZ(c12p4, 0);
                        C21647019ng c21647019ng4 = new C21647019ng(c12p4.getContext(), c12p4, new C19746312Np(EnumC19746112Nn.SPRING, photoModeLastImageHintAssem2.LLLIIIIL, photoModeLastImageHintAssem2.LLLIIIL), false);
                        photoModeLastImageHintAssem2.LLLFZ = c21647019ng4;
                        c21647019ng4.LIZJ("alpha", new C738900Sye(c12p4, photoModeLastImageHintAssem2, 2));
                    }
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(photoModeLastImageHintAssem2);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0HIZ(photoModeLastImageHintAssem2, null), 2);
                }
                TuxIconView tuxIconView2 = this.LLILZ;
                if (tuxIconView2 != null) {
                    PhotoModeLastImageHintAssem photoModeLastImageHintAssem3 = this.LLILLL;
                    C259800zU<C21647019ng> c259800zU3 = this.LLIZ;
                    C259800zU<C21647019ng> c259800zU4 = this.LLIZLLLIL;
                    if (photoModeLastImageHintAssem3.LLJLIL) {
                        C21647019ng c21647019ng5 = c259800zU3.element;
                        if (c21647019ng5 != null) {
                            c21647019ng5.LJI(true);
                        }
                        tuxIconView2.setIconRes(R.raw.icon_arrow_left_circle_ltr);
                        tuxIconView2.setTintColorRes(R.attr.zl);
                        C21647019ng c21647019ng6 = c259800zU4.element;
                        if (c21647019ng6 != null) {
                            c21647019ng6.LJI(true);
                        }
                    }
                }
                C0SLX c0slx3 = this.LLILLL.LLJJJJLIIL;
                if (c0slx3 != null) {
                    c0slx3.setSmoothScrollDelay(false);
                }
            }
        }
        PhotoModeLastImageHintAssem photoModeLastImageHintAssem4 = this.LLILLL;
        PhotosViewHolderV3 photosViewHolderV3 = this.LLILZIL;
        if (photosViewHolderV3 != null) {
            view = photosViewHolderV3.LL;
        } else {
            view = null;
        }
        Context context2 = photoModeLastImageHintAssem4.getContext();
        if (context2 != null) {
            zLIZLLL = C426750GoL.LIZLLL(context2);
        } else {
            zLIZLLL = false;
        }
        int i3 = this.LL;
        if (view != null) {
            TuxIconView tuxIconView3 = (TuxIconView) view.findViewById(R.id.qcv);
            C736680Sv4.LJIJJLI(photoModeLastImageHintAssem4.ip(), new AwS377S0200000_11(photoModeLastImageHintAssem4, view, 172));
            if (photoModeLastImageHintAssem4.LLLIIII == null) {
                if (photoModeLastImageHintAssem4.LLL == null) {
                    photoModeLastImageHintAssem4.LLL = (InteractAreaCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(photoModeLastImageHintAssem4), InteractAreaCommonAbility.class, null);
                }
                InteractAreaCommonAbility interactAreaCommonAbility = photoModeLastImageHintAssem4.LLL;
                if (interactAreaCommonAbility != null) {
                    iL40 = interactAreaCommonAbility.l40();
                } else {
                    iL40 = 0;
                }
                photoModeLastImageHintAssem4.LLLIIII = Float.valueOf(-Math.abs(Math.min(iL40 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0)));
            }
            if (zLIZLLL) {
                i = -1;
            } else {
                i = 1;
            }
            C786410Ut5.Uc(tuxIconView3, i * ((i3 / 2.0f) - (tuxIconView3.getWidth() / 2)));
            Float f3 = photoModeLastImageHintAssem4.LLLIIII;
            if (f3 != null) {
                fFloatValue2 = f3.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            C786410Ut5.vd(tuxIconView3, fFloatValue2);
        }
        int i4 = this.LLILZLL;
        int i5 = c0s9p2.LL;
        if (i4 == i5) {
            PhotoModeLastImageHintAssem photoModeLastImageHintAssem5 = this.LLILLL;
            photoModeLastImageHintAssem5.LLJZ = photoModeLastImageHintAssem5.LLJLLIL;
        } else if (i4 == i5 - 1) {
            PhotoModeLastImageHintAssem photoModeLastImageHintAssem6 = this.LLILLL;
            photoModeLastImageHintAssem6.LLJZ = photoModeLastImageHintAssem6.LLJLLL;
        }
        PhotoModeLastImageHintAssem photoModeLastImageHintAssem7 = this.LLILLL;
        photoModeLastImageHintAssem7.LLJLIL = photoModeLastImageHintAssem7.LLJLILLLLZIIL;
        if (this.LL > this.LLILLJJLI * 0.8f) {
            photoModeLastImageHintAssem7.kp();
        }
        PhotoModeLastImageHintAssem photoModeLastImageHintAssem8 = this.LLILLL;
        if (!photoModeLastImageHintAssem8.LLJZIJLIL && this.LL > 0) {
            C721190SQr c721190SQr = C721190SQr.LIZ;
            VideoItemParams videoItemParams = photoModeLastImageHintAssem8.ip().LLILLL;
            if (videoItemParams == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (str = baseFeedPageParams.eventType) == null) {
                str = "";
            }
            c721190SQr.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("hint_type", "profile");
            C20684815ws.LJIILLIIL("swipe_at_last_image_hint", c2344009Gk.LIZ);
            this.LLILLL.LLJZIJLIL = true;
        }
        return Unit.LIZ;
    }
}
