package X;

import Y.ACListenerS41S0201000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS655S0100000_6;
import u4.q0;

/* JADX INFO: renamed from: X.0Hb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443980Hb2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C443970Hb1 LL;
    public final /* synthetic */ InterfaceC444050Hb9 LLILLJJLI;
    public final /* synthetic */ C443960Hb0 LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C443980Hb2(C443970Hb1 c443970Hb1, InterfaceC444050Hb9 interfaceC444050Hb9, C443960Hb0 c443960Hb0, int i) {
        super(0);
        this.LL = c443970Hb1;
        this.LLILLJJLI = interfaceC444050Hb9;
        this.LLILLL = c443960Hb0;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Drawable drawableLIZIZ;
        C1331730kl9 c1331730kl9;
        C443900Hau c443900Hau;
        StickerSetInfo stickerSetInfo;
        RemoteImageView remoteImageView;
        RemoteImageView remoteImageView2;
        C443970Hb1 c443970Hb1 = this.LL;
        c443970Hb1.LLILZIL = this.LLILLJJLI;
        RemoteImageView remoteImageView3 = c443970Hb1.LLILLJJLI;
        if (remoteImageView3 != null) {
            remoteImageView3.setPadding(0, 0, 0, 0);
        }
        View view = this.LL.LLILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(this.LLILLJJLI.LJIIJ() ? 0 : 8, view);
        }
        final String name = null;
        if (this.LLILLJJLI.LIZJ() == 2 || this.LLILLJJLI.LIZJ() == 9 || this.LLILLJJLI.LIZJ() == 10 || this.LLILLJJLI.LIZJ() == 11 || this.LLILLJJLI.LIZJ() == 12) {
            TuxIconView tuxIconView = this.LL.LLILZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            RemoteImageView remoteImageView4 = this.LL.LLILLJJLI;
            if (remoteImageView4 != null) {
                C786410Ut5.l(remoteImageView4, 0);
            }
            int iLIZJ = (int) C12ES.LIZJ(6.0f, this.LL.itemView.getContext());
            RemoteImageView remoteImageView5 = this.LL.LLILLJJLI;
            if (remoteImageView5 != null) {
                remoteImageView5.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
            }
            if (this.LLILLJJLI.LIZJ() == 10) {
                drawableLIZIZ = this.LLILLJJLI.LJFF(this.LL.itemView.getContext());
            } else {
                Context context = this.LL.itemView.getContext();
                IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJIILL();
                drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.cc2);
            }
            if (this.LLILLJJLI.LJI() <= 0) {
                c1331730kl9 = null;
            } else {
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C418440Gaw.LIZIZ(Integer.valueOf(this.LLILLJJLI.LJI()));
                c1331730kl9 = new C1331730kl9(c1331750klB);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LLILLJJLI.getIconUrl());
            c1331670kl3LJIIIZ.LJJI(this.LL.LLILLJJLI);
            c1331670kl3LJIIIZ.LJJIIZI(drawableLIZIZ);
            c1331670kl3LJIIIZ.LJIL(drawableLIZIZ);
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LJJI = c1331730kl9;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
            c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
            C1332130kln.LIZJ(c1331670kl3LJIIIZ, C06TB.STABLE_STICKER);
            C1332130kln.LJFF(c1331670kl3LJIIIZ, "TabIndicatorAdapterV2", new C444040Hb8(new AwS620S0100000_6(this.LL, 132), new C0IE5(this.LL, 5), new AwS655S0100000_6(this.LL, 10)), false, null, null, null, 60);
        } else if (this.LLILLJJLI.LIZJ() == 7) {
            TuxIconView tuxIconView2 = this.LL.LLILZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            RemoteImageView remoteImageView6 = this.LL.LLILLJJLI;
            if (remoteImageView6 != null) {
                C786410Ut5.l(remoteImageView6, 8);
            }
            TuxIconView tuxIconView3 = this.LL.LLILZ;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_star);
            }
            TuxIconView tuxIconView4 = this.LL.LLILZ;
            if (tuxIconView4 != null) {
                tuxIconView4.setTintColorRes(R.attr.a1h);
            }
        } else if (this.LLILLJJLI.LIZJ() == 13) {
            TuxIconView tuxIconView5 = this.LL.LLILZ;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
            }
            RemoteImageView remoteImageView7 = this.LL.LLILLJJLI;
            if (remoteImageView7 != null) {
                C786410Ut5.l(remoteImageView7, 8);
            }
            TuxIconView tuxIconView6 = this.LL.LLILZ;
            if (tuxIconView6 != null) {
                tuxIconView6.setIconRes(R.raw.icon_graph_arrow);
            }
            TuxIconView tuxIconView7 = this.LL.LLILZ;
            if (tuxIconView7 != null) {
                tuxIconView7.setTintColorRes(R.attr.a1h);
            }
        } else if (this.LLILLJJLI.LIZJ() == 8) {
            TuxIconView tuxIconView8 = this.LL.LLILZ;
            if (tuxIconView8 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView8, 0);
            }
            RemoteImageView remoteImageView8 = this.LL.LLILLJJLI;
            if (remoteImageView8 != null) {
                C786410Ut5.l(remoteImageView8, 8);
            }
            TuxIconView tuxIconView9 = this.LL.LLILZ;
            if (tuxIconView9 != null) {
                tuxIconView9.setIconRes(R.raw.icon_gif);
            }
            TuxIconView tuxIconView10 = this.LL.LLILZ;
            if (tuxIconView10 != null) {
                tuxIconView10.setTintColorRes(R.attr.a1h);
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31));
            TuxIconView tuxIconView11 = this.LL.LLILZ;
            if (tuxIconView11 != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView11.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iLIZIZ3;
                layoutParams.width = iLIZIZ3;
                C786410Ut5.W5(tuxIconView11, layoutParams);
            }
        } else if (this.LLILLJJLI.LIZJ() == 5) {
            TuxIconView tuxIconView12 = this.LL.LLILZ;
            if (tuxIconView12 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView12, 0);
            }
            RemoteImageView remoteImageView9 = this.LL.LLILLJJLI;
            if (remoteImageView9 != null) {
                C786410Ut5.l(remoteImageView9, 8);
            }
            TuxIconView tuxIconView13 = this.LL.LLILZ;
            if (tuxIconView13 != null) {
                tuxIconView13.setIconRes(R.raw.icon_emoji);
            }
            TuxIconView tuxIconView14 = this.LL.LLILZ;
            if (tuxIconView14 != null) {
                tuxIconView14.setTintColorRes(R.attr.a1h);
            }
        } else if (this.LLILLJJLI instanceof C443870Har) {
            TuxIconView tuxIconView15 = this.LL.LLILZ;
            if (tuxIconView15 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView15, 0);
            }
            RemoteImageView remoteImageView10 = this.LL.LLILLJJLI;
            if (remoteImageView10 != null) {
                C786410Ut5.l(remoteImageView10, 8);
            }
            TuxIconView tuxIconView16 = this.LL.LLILZ;
            if (tuxIconView16 != null) {
                tuxIconView16.setIconRes(R.raw.icon_store);
            }
            TuxIconView tuxIconView17 = this.LL.LLILZ;
            if (tuxIconView17 != null) {
                tuxIconView17.setTintColorRes(R.attr.a1h);
            }
        } else {
            TuxIconView tuxIconView18 = this.LL.LLILZ;
            if (tuxIconView18 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView18, 8);
            }
            RemoteImageView remoteImageView11 = this.LL.LLILLJJLI;
            if (remoteImageView11 != null) {
                C786410Ut5.l(remoteImageView11, 0);
            }
            if (this.LLILLJJLI.LIZLLL() > 0) {
                RemoteImageView remoteImageView12 = this.LL.LLILLJJLI;
                if (remoteImageView12 != null) {
                    remoteImageView12.setImageResource(this.LLILLJJLI.LIZLLL());
                }
            } else {
                Drawable drawableLJFF = this.LLILLJJLI.LJFF(this.LL.itemView.getContext());
                if (drawableLJFF != null && (remoteImageView2 = this.LL.LLILLJJLI) != null) {
                    remoteImageView2.setImageDrawable(drawableLJFF);
                }
            }
        }
        String name2 = this.LLILLJJLI.getName();
        if (name2 == null || name2.length() == 0) {
            InterfaceC444050Hb9 interfaceC444050Hb9 = this.LLILLJJLI;
            if ((interfaceC444050Hb9 instanceof C443900Hau) && (c443900Hau = (C443900Hau) interfaceC444050Hb9) != null && (stickerSetInfo = c443900Hau.LIZIZ) != null) {
                name = stickerSetInfo.name;
            }
        } else {
            name = this.LLILLJJLI.getName();
        }
        if (!TextUtils.isEmpty(name) && (remoteImageView = this.LL.LLILLJJLI) != null) {
            q0.LJIJ(remoteImageView, new C20094213jo() { // from class: X.0Hb4
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    String str = name;
                    if (str != null && str.length() != 0) {
                        view2.setContentDescription(name);
                    }
                    accessibilityNodeInfoCompat.setClassName(TextView.class.getName());
                }
            });
        }
        this.LL.itemView.setSelected(this.LLILZ == this.LLILLL.LLILLJJLI.getState().LLILLJJLI);
        C786410Ut5.I7(new ACListenerS41S0201000_6(this.LLILLJJLI, this.LLILLL, this.LLILZ, 3), this.LL.itemView);
        final Function2<View, Integer, Boolean> function2 = this.LLILLL.LLILZ;
        if (function2 != null) {
            C443970Hb1 c443970Hb12 = this.LL;
            final int i = this.LLILZ;
            c443970Hb12.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0Hb3
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return function2.invoke(view2, Integer.valueOf(i)).booleanValue();
                }
            });
        }
        return Unit.LIZ;
    }
}
