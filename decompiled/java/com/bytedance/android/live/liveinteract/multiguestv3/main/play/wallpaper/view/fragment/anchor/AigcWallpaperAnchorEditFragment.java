package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor;

import X.C1117360fBO;
import X.C1143680frq;
import X.C15PU;
import X.C15PX;
import X.C16F5;
import X.C16FS;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2188811AlT;
import X.C23250099c;
import X.C410901il;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C943000aeA;
import X.C946090aj9;
import X.C948600anC;
import X.C986840bms;
import X.InterfaceC1813060xHU;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import android.os.Build;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperAnchorCreateDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperPicStyleSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperAnchorEditFragment extends AbsAigcWallpaperFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiHELIOSPi4/JDUtOSohZjMlLDh9LjctLiI2JjFiKCEwICo+Zw46LyYbKCM/OCQ8LD0SJiYkJj0WLCw4Dz0yLygpJzs=";
    public ViewOnClickListenerC1836610xtT LLILLJJLI;
    public C15PU LLILLL;
    public C16FS LLILZ;
    public C16F5 LLILZIL;
    public MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem LLILZLL;
    public AigcWallpaperAnchorCreateDialog LLIZ;
    public boolean LLIZLLLIL;
    public AigcWallpaperAnchorViewModel LLJ;
    public String LLJI = "";
    public RelativeLayout LLJIJIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final int getLayoutId() {
        return R.layout.hc9;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void PR() {
        RelativeLayout relativeLayout = this.LLJIJIL;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void RR() {
        RelativeLayout relativeLayout = this.LLJIJIL;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 8);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void initData() {
        AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LLJ;
        if (aigcWallpaperAnchorViewModel != null) {
            aigcWallpaperAnchorViewModel.EQ2();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void NR() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C943000aeA(this, null), 3);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void OR(View view) {
        String strHQ2;
        ImageSpan imageSpan;
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.grh);
        viewOnClickListenerC1836610xtT.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0aj3
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LIZ.LLJ;
                if (aigcWallpaperAnchorViewModel != null) {
                    aigcWallpaperAnchorViewModel.EQ2();
                }
            }
        });
        viewOnClickListenerC1836610xtT.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0aj4
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = this.LIZ.LLJ;
                if (aigcWallpaperAnchorViewModel != null) {
                    aigcWallpaperAnchorViewModel.EQ2();
                }
            }
        });
        viewOnClickListenerC1836610xtT.LJI();
        this.LLILLJJLI = viewOnClickListenerC1836610xtT;
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 97), view);
        this.LLJIJIL = (RelativeLayout) view.findViewById(R.id.asv);
        C16FS c16fs = (C16FS) view.findViewById(R.id.ast);
        C786410Ut5.h8(c16fs, new ACListenerS118S0200000_15(this, c16fs, 28));
        this.LLILZ = c16fs;
        this.LLILZIL = (C16F5) view.findViewById(R.id.kyl);
        C15PU c15pu = (C15PU) view.findViewById(R.id.sbn);
        Object[] objArr = new Object[1];
        if (this.LLJ != null) {
            strHQ2 = AigcWallpaperAnchorViewModel.HQ2(c15pu.getContext());
        } else {
            strHQ2 = null;
        }
        objArr[0] = strHQ2;
        c15pu.setHint(C497740JfY.LJIJJ(2131842473, objArr));
        c15pu.getTextDirection();
        c15pu.setInputStateListener(new C15PX() { // from class: X.0aj7
            @Override // X.C15PX
            public final void LIZIZ(boolean z) {
                C16FS c16fs2;
                if (z) {
                    this.LIZ.SR(C497740JfY.LJIJI(2131842435));
                    return;
                }
                AigcWallpaperAnchorEditFragment aigcWallpaperAnchorEditFragment = this.LIZ;
                aigcWallpaperAnchorEditFragment.LLIZLLLIL = true;
                C16F5 c16f5 = aigcWallpaperAnchorEditFragment.LLILZIL;
                if (c16f5 != null) {
                    C500260Jjc.LJIILIIL(c16f5);
                }
                if (aigcWallpaperAnchorEditFragment.LLILZLL == null || (c16fs2 = aigcWallpaperAnchorEditFragment.LLILZ) == null) {
                    return;
                }
                c16fs2.setEnabled(true);
            }

            @Override // X.C15PX
            public final void LIZ(boolean z, boolean z2) {
                C16FS c16fs2;
                if (z) {
                    this.LIZ.SR(C497740JfY.LJIJI(2131842418));
                    return;
                }
                if (z2) {
                    this.LIZ.SR("");
                    C16F5 c16f5 = this.LIZ.LLILZIL;
                    if (c16f5 != null) {
                        C500260Jjc.LJIILIIL(c16f5);
                        return;
                    }
                    return;
                }
                AigcWallpaperAnchorEditFragment aigcWallpaperAnchorEditFragment = this.LIZ;
                aigcWallpaperAnchorEditFragment.LLIZLLLIL = true;
                C16F5 c16f52 = aigcWallpaperAnchorEditFragment.LLILZIL;
                if (c16f52 != null) {
                    C500260Jjc.LJIILIIL(c16f52);
                }
                if (aigcWallpaperAnchorEditFragment.LLILZLL != null && (c16fs2 = aigcWallpaperAnchorEditFragment.LLILZ) != null) {
                    c16fs2.setEnabled(true);
                }
            }
        });
        this.LLILLL = c15pu;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tx8);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            C1117360fBO c1117360fBO = new C1117360fBO();
            c1117360fBO.LLLI(MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem.class, new C948600anC(new AwS381S0200000_15(c1117360fBO, this, 42)));
            C410901il c410901il = new C410901il();
            c410901il.add(new MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem("ttlive_multiguest_aigc_wallpaper_general_style.png", C497740JfY.LJIJI(2131842436), 0, false, 1L));
            c410901il.add(new MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem("ttlive_multiguest_aigc_wallpaper_stylized_style.png", C497740JfY.LJIJI(2131842437), 0, false, 2L));
            c410901il.add(new MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem("ttlive_multiguest_aigc_wallpaper_inkpunk_style.png", C497740JfY.LJIJI(2131842438), 0, false, 3L));
            c410901il.add(new MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem("ttlive_multiguest_aigc_wallpaper_lizzylawrence_style.png", C497740JfY.LJIJI(2131842439), 0, false, 4L));
            c1117360fBO.LL = c410901il;
            recyclerView.setAdapter(c1117360fBO);
            recyclerView.addItemDecoration(new C946090aj9());
        }
        View viewFindViewById = view.findViewById(R.id.asx);
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS594S0100000_15(this, 413));
        }
        View viewFindViewById2 = view.findViewById(R.id.asy);
        if (viewFindViewById2 != null) {
            C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_interaction_normal_1", "ttlive_multiguest_aigc_wallpaper_edit_dialog_big_bg.png");
        }
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at9), new ACListenerS150S0100000_15(this, 98));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at1), new ACListenerS150S0100000_15(this, 99));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.atb), new ACListenerS150S0100000_15(this, 96));
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.cv6);
        if (liveIconView != null) {
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS381S0200000_15(this, liveIconView, 41));
        }
        TextView textView = (TextView) view.findViewById(R.id.fti);
        if (textView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJI(2131842471));
            sbLIZ.append(C497740JfY.LJIJI(2131840893));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int length = strLIZIZ.length();
            SpannableString spannableString = new SpannableString(strLIZIZ);
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dw4, getContext());
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ewz, textView.getContext()));
                int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
                c20743516FdLIZLLL.setBounds(0, 0, iLIZIZ, iLIZIZ);
                if (Build.VERSION.SDK_INT >= 29) {
                    imageSpan = new ImageSpan(c20743516FdLIZLLL, 1);
                } else {
                    imageSpan = new ImageSpan(c20743516FdLIZLLL);
                }
                int length2 = length - C497740JfY.LJIJI(2131840893).length();
                C786410Ut5.p2(spannableString, imageSpan, length2, length, 33);
                C786410Ut5.p2(spannableString, new C986840bms(this, 0), length2, length, 33);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(C497740JfY.LJFF(android.R.color.transparent));
        }
    }

    public final void SR(String str) {
        this.LLIZLLLIL = false;
        C16F5 c16f5 = this.LLILZIL;
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
        }
        C16F5 c16f52 = this.LLILZIL;
        if (c16f52 != null) {
            c16f52.setText(str);
        }
        C16FS c16fs = this.LLILZ;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
        C16FS c16fs2 = this.LLILZ;
        if (c16fs2 != null) {
            c16fs2.j0(R.style.a7g);
        }
    }
}
