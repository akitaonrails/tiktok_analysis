package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStructDescSize;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStructIconSize;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStructMargin;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import irm.AkS54S0200000_9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630110OnZ implements InterfaceC629870OnB {
    public final MusicDetail LIZ;
    public C419960GdO LIZIZ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZJ;

    @Override // X.InterfaceC629870OnB
    public final void LIZ(TuxNavBar tuxNavBar) {
        MusicResourceBitStruct musicResourceBitStruct;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        Context context = this.LIZJ.getContext();
        if (context == null || (musicResourceBitStruct = this.LIZ.musicResourceBitStruct) == null) {
            return;
        }
        C1250280idm c1250280idm = new C1250280idm();
        c1250280idm.LIZIZ = "music_campaign";
        C419960GdO c419960GdO = new C419960GdO(context);
        List<String> channels = musicResourceBitStruct.getChannels();
        String idStr = null;
        if (channels != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : channels) {
                if (str.length() > 0) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new CheckRequestBodyModel.TargetChannel((String) it2.next()));
            }
            if (!arrayList2.isEmpty()) {
                try {
                    OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                    optionCheckUpdateParams.setLazyUpdate(true);
                    String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                    C1537050q6J.LIZ.getClass();
                    C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
                    if (c1551950qULLIZ != null) {
                        c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList2)), optionCheckUpdateParams);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        Object musicResourceBitStructMargin = new MusicResourceBitStructMargin(CardStruct.IStatusCode.DEFAULT, "8", "12");
        Object musicResourceBitStructIconSize = new MusicResourceBitStructIconSize("28", "28");
        Object musicResourceBitStructDescSize = new MusicResourceBitStructDescSize("15", "12");
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            String margin = musicResourceBitStruct.getMargin();
            c1227904rF.getClass();
            musicResourceBitStructMargin = C1227904rF.LIZIZ(margin, MusicResourceBitStructMargin.class);
            musicResourceBitStructIconSize = C1227904rF.LIZIZ(musicResourceBitStruct.getIconSize(), MusicResourceBitStructIconSize.class);
            musicResourceBitStructDescSize = C1227904rF.LIZIZ(musicResourceBitStruct.getDescSize(), MusicResourceBitStructDescSize.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        RemoteImageView remoteImageView = c419960GdO.LLILLJJLI;
        if (remoteImageView != null) {
            String icon = musicResourceBitStruct.getIcon();
            if (icon != null && icon.length() != 0) {
                C1324840ka2.LJIIJ(remoteImageView, musicResourceBitStruct.getIcon(), -1, -1);
            } else {
                remoteImageView.setBackgroundResource(R.drawable.f644com);
            }
            ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                MusicResourceBitStructIconSize musicResourceBitStructIconSize2 = (MusicResourceBitStructIconSize) musicResourceBitStructIconSize;
                marginLayoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(CastIntegerProtector.parseInt(musicResourceBitStructIconSize2.width))));
                marginLayoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(CastIntegerProtector.parseInt(musicResourceBitStructIconSize2.height))));
                MusicResourceBitStructMargin musicResourceBitStructMargin2 = (MusicResourceBitStructMargin) musicResourceBitStructMargin;
                marginLayoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(CastIntegerProtector.parseInt(musicResourceBitStructMargin2.start)))));
                marginLayoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(CastIntegerProtector.parseInt(musicResourceBitStructMargin2.middle)))));
            }
        }
        TuxTextView tuxTextView = c419960GdO.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(musicResourceBitStruct.getDesc());
            String descColor = musicResourceBitStruct.getDescColor();
            if (descColor == null) {
                descColor = "#cc000000";
            }
            tuxTextView.setTextColor(ColorProtector.parseColor(descColor));
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(CastIntegerProtector.parseInt(((MusicResourceBitStructMargin) musicResourceBitStructMargin).end)))));
            }
            tuxTextView.setTuxFont(43);
            tuxTextView.setMinTextSize(CastFloatProtector.parseFloat(((MusicResourceBitStructDescSize) musicResourceBitStructDescSize).minSize));
            tuxTextView.setMaxLines(1);
        }
        LinearLayout linearLayout = c419960GdO.LL;
        if (linearLayout != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(200.0f);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            List<String> colors = musicResourceBitStruct.getColors();
            if (colors == null) {
                colors = C1697810uHb.LJIIJJI("#0d000000", "#0d000000");
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(colors, 10));
            Iterator<String> it3 = colors.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(ColorProtector.parseColor(it3.next())));
            }
            gradientDrawable.setColors(C13LP.LLII(arrayList3));
            linearLayout.setBackground(gradientDrawable);
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                String height = musicResourceBitStruct.getHeight();
                if (height != null) {
                    i = CastIntegerProtector.parseInt(height);
                } else {
                    i = 12;
                }
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            }
        }
        c419960GdO.requestLayout();
        c1250280idm.LIZJ = c419960GdO;
        tuxNavBar.LIZ(c1250280idm);
        Music music = this.LIZ.music;
        if (music != null) {
            idStr = music.getIdStr();
        }
        C1398280mUU.LJIILLIIL(idStr, this.LIZJ.getAwemeId(), C178200mK.LIZ(musicResourceBitStruct.getLogExtra()));
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZIZ(TuxNavBar tuxNavBar) {
        C419960GdO c419960GdO;
        View viewLJII = tuxNavBar.LJII("music_campaign");
        if (viewLJII instanceof C419960GdO) {
            c419960GdO = (C419960GdO) viewLJII;
        } else {
            c419960GdO = null;
        }
        this.LIZIZ = c419960GdO;
        C419960GdO c419960GdO2 = this.LIZIZ;
        if (c419960GdO2 != null) {
            ViewGroup.LayoutParams layoutParams = c419960GdO2.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                layoutParams2.width = -2;
                layoutParams2.height = -2;
                C786410Ut5.W5(c419960GdO2, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        C419960GdO c419960GdO3 = this.LIZIZ;
        if (c419960GdO3 != null) {
            C786410Ut5.I7(new AkS54S0200000_9(this, this.LIZJ, 2), c419960GdO3);
        }
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZJ(int i) {
        int i2;
        C419960GdO c419960GdO = this.LIZIZ;
        if (c419960GdO != null) {
            MusicDetailNavBarAssem musicDetailNavBarAssem = this.LIZJ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            musicDetailNavBarAssem.getClass();
            float fMp = 1.0f - MusicDetailNavBarAssem.mp(iLIZIZ, iLIZIZ2, i);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419960GdO);
            c419960GdO.setAlpha(fMp);
        }
        C419960GdO c419960GdO2 = this.LIZIZ;
        if (c419960GdO2 != null) {
            if (Intrinsics.LIZLLL(Float.valueOf(c419960GdO2.getAlpha()), 0.0f)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            int visibility = c419960GdO2.getVisibility();
            c419960GdO2.setVisibility(i2);
            C1602160rnK.LIZIZ(visibility, i2, c419960GdO2);
        }
    }

    public C630110OnZ(MusicDetailNavBarAssem musicDetailNavBarAssem, MusicDetail musicDetail) {
        this.LIZJ = musicDetailNavBarAssem;
        this.LIZ = musicDetail;
    }
}
