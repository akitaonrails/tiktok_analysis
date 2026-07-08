package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest;

import X.C1117360fBO;
import X.C1143680frq;
import X.C13LP;
import X.C15PT;
import X.C15PX;
import X.C16F5;
import X.C16FS;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2188811AlT;
import X.C23250099c;
import X.C410901il;
import X.C417600GZa;
import X.C497740JfY;
import X.C500260Jjc;
import X.C512401z8;
import X.C786410Ut5;
import X.C945880aio;
import X.C946090aj9;
import X.C948600anC;
import X.C986840bms;
import X.InterfaceC1813060xHU;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import android.os.Build;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.guest.AigcWallpaperGuestCreateDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperPicStyleSetting;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperGuestEditFragment extends AbsAigcWallpaperFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTHELIOSxiPi4/JDUtOSohZjMlLDh9LjctLiI2JjFiLjo2OzFiCCY0KxItJSMjKTUpOwgmLTY4DCs6PAM+KCg+LSs4";
    public ViewOnClickListenerC1836610xtT LLILLJJLI;
    public C15PT LLILLL;
    public C16FS LLILZ;
    public C16F5 LLILZIL;
    public MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem LLILZLL;
    public AigcWallpaperGuestCreateDialog LLIZ;
    public boolean LLIZLLLIL;
    public AigcWallpaperGuestViewModel LLJ;
    public String LLJI;
    public C417600GZa LLJIJIL;
    public C16F5 LLJILJIL;
    public RelativeLayout LLJILJILJ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final int getLayoutId() {
        return R.layout.hcc;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void PR() {
        RelativeLayout relativeLayout = this.LLJILJILJ;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void RR() {
        RelativeLayout relativeLayout = this.LLJILJILJ;
        if (relativeLayout != null) {
            C786410Ut5.LLIIL(relativeLayout, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void initData() {
        List list;
        MutableLiveData mutableLiveData;
        Pair pair;
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLJ;
        if (aigcWallpaperGuestViewModel == null || (mutableLiveData = aigcWallpaperGuestViewModel.LLILZIL) == null || (pair = (Pair) mutableLiveData.getValue()) == null) {
            list = null;
        } else {
            list = (List) pair.getFirst();
            if (list != null) {
                C13LP.LJLLLL(new C512401z8(6), list);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(((WallpaperContext) it2.next()).userKeywords);
                sb.append(",");
            }
        }
        this.LLJI = sb.toString();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void NR() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C945880aio(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        super.onResume();
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLJ;
        if (aigcWallpaperGuestViewModel == null || (mutableLiveData = aigcWallpaperGuestViewModel.LLJJJIL) == null || (value = mutableLiveData.getValue()) == null) {
            return;
        }
        UR(value.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.AbsAigcWallpaperFragment
    public final void OR(View view) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        Integer value;
        ImageSpan imageSpan;
        MutableLiveData mutableLiveData4;
        Pair pair;
        List<WallpaperContext> list;
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.grh);
        viewOnClickListenerC1836610xtT.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0ajA
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
            }
        });
        viewOnClickListenerC1836610xtT.setOfflineClickListener(new InterfaceC1813060xHU() { // from class: X.0ajB
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
            }
        });
        viewOnClickListenerC1836610xtT.LIZLLL();
        this.LLILLJJLI = viewOnClickListenerC1836610xtT;
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 109), view);
        this.LLJILJILJ = (RelativeLayout) view.findViewById(R.id.asv);
        C16FS c16fs = (C16FS) view.findViewById(R.id.ast);
        C786410Ut5.h8(c16fs, new ACListenerS118S0200000_15(this, c16fs, 29));
        this.LLILZ = c16fs;
        this.LLILZIL = (C16F5) view.findViewById(R.id.kyl);
        C15PT c15pt = (C15PT) view.findViewById(R.id.sbn);
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = this.LLJ;
        if (aigcWallpaperGuestViewModel != null && (mutableLiveData4 = aigcWallpaperGuestViewModel.LLILZIL) != null && (pair = (Pair) mutableLiveData4.getValue()) != null && (list = (List) pair.getFirst()) != null) {
            c15pt.setListData(list);
        }
        c15pt.setOutInputStateListener(new C15PX() { // from class: X.0aj8
            @Override // X.C15PX
            public final void LIZIZ(boolean z) {
                C16FS c16fs2;
                if (z) {
                    this.LIZ.SR(C497740JfY.LJIJI(2131842435));
                    return;
                }
                AigcWallpaperGuestEditFragment aigcWallpaperGuestEditFragment = this.LIZ;
                aigcWallpaperGuestEditFragment.LLIZLLLIL = true;
                C16F5 c16f5 = aigcWallpaperGuestEditFragment.LLILZIL;
                if (c16f5 != null) {
                    C500260Jjc.LJIILIIL(c16f5);
                }
                if (aigcWallpaperGuestEditFragment.LLILZLL == null || (c16fs2 = aigcWallpaperGuestEditFragment.LLILZ) == null) {
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
                    C16FS c16fs3 = this.LIZ.LLILZ;
                    if (c16fs3 != null) {
                        c16fs3.setEnabled(false);
                    }
                    this.LIZ.SR("");
                    C16F5 c16f5 = this.LIZ.LLILZIL;
                    if (c16f5 == null) {
                        return;
                    }
                    C500260Jjc.LJIILIIL(c16f5);
                    return;
                }
                AigcWallpaperGuestEditFragment aigcWallpaperGuestEditFragment = this.LIZ;
                aigcWallpaperGuestEditFragment.LLIZLLLIL = true;
                C16F5 c16f52 = aigcWallpaperGuestEditFragment.LLILZIL;
                if (c16f52 != null) {
                    C500260Jjc.LJIILIIL(c16f52);
                }
                if (aigcWallpaperGuestEditFragment.LLILZLL == null || (c16fs2 = aigcWallpaperGuestEditFragment.LLILZ) == null) {
                    return;
                }
                c16fs2.setEnabled(true);
            }
        });
        this.LLILLL = c15pt;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tx8);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            C1117360fBO c1117360fBO = new C1117360fBO();
            c1117360fBO.LLLI(MultiGuestAigcWallpaperPicStyleSetting.PicStyleItem.class, new C948600anC(new AwS381S0200000_15(c1117360fBO, this, 43)));
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
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new AwS594S0100000_15(this, 414));
        }
        View viewFindViewById2 = view.findViewById(R.id.asy);
        if (viewFindViewById2 != null) {
            C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_interaction_normal_1", "ttlive_multiguest_aigc_wallpaper_edit_dialog_big_bg.png");
        }
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at9), new ACListenerS150S0100000_15(this, 110));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.at1), new ACListenerS150S0100000_15(this, 111));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.atb), new ACListenerS150S0100000_15(this, 106));
        C786410Ut5.g8((LiveIconView) view.findViewById(R.id.atr), new ACListenerS150S0100000_15(this, 107));
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
                C786410Ut5.p2(spannableString, new C986840bms(this, 1), length2, length, 33);
            }
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(C497740JfY.LJFF(android.R.color.transparent));
        }
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.ftf);
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel2 = this.LLJ;
        if (aigcWallpaperGuestViewModel2 != null && (mutableLiveData3 = aigcWallpaperGuestViewModel2.LLJJJIL) != null && (value = mutableLiveData3.getValue()) != null) {
            UR(value.intValue());
        }
        this.LLJILJIL = c16f5;
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel3 = this.LLJ;
        if (aigcWallpaperGuestViewModel3 != null && (mutableLiveData2 = aigcWallpaperGuestViewModel3.LLJJJIL) != null) {
            mutableLiveData2.observe(this, new AObserverS219S0100000_15(this, 18));
        }
        AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel4 = this.LLJ;
        if (aigcWallpaperGuestViewModel4 != null && (mutableLiveData = aigcWallpaperGuestViewModel4.LLJJJJ) != null) {
            mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 19));
        }
        this.LLJIJIL = (C417600GZa) view.findViewById(R.id.lxv);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.xxy), new ACListenerS150S0100000_15(this, 108));
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
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(int r6) {
        /*
            r5 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel r0 = r5.LLJ
            if (r0 == 0) goto L5d
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LLJJJJ
            if (r0 == 0) goto L5d
            java.lang.Object r4 = r0.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L5d
            int r1 = r4.intValue()
            r0 = 3
            if (r1 != r0) goto L30
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r3] = r0
            r0 = 2131755557(0x7f100225, float:1.9141997E38)
            java.lang.String r1 = X.C497740JfY.LJIIL(r0, r6, r1)
        L28:
            X.16F5 r0 = r5.LLJILJIL
            if (r0 == 0) goto L2f
            r0.setText(r1)
        L2f:
            return
        L30:
            int r1 = r4.intValue()
            r0 = 2
            if (r1 != r0) goto L47
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r3] = r0
            r0 = 2131755556(0x7f100224, float:1.9141995E38)
            java.lang.String r1 = X.C497740JfY.LJIIL(r0, r6, r1)
            goto L28
        L47:
            int r0 = r4.intValue()
            if (r0 != r2) goto L5d
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r3] = r0
            r0 = 2131755555(0x7f100223, float:1.9141993E38)
            java.lang.String r1 = X.C497740JfY.LJIIL(r0, r6, r1)
            goto L28
        L5d:
            java.lang.String r1 = ""
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment.UR(int):void");
    }
}
