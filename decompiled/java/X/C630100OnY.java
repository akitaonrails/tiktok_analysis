package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630100OnY implements InterfaceC629870OnB {
    public final MusicDetail LIZ;
    public C344320Deg LIZIZ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZJ;

    @Override // X.InterfaceC629870OnB
    public final void LIZ(TuxNavBar tuxNavBar) {
        MusicResourceBitStruct musicResourceBitStruct;
        String mid;
        Context context = this.LIZJ.getContext();
        if (context == null || (musicResourceBitStruct = this.LIZ.musicResourceBitStruct) == null) {
            return;
        }
        String scene = musicResourceBitStruct.getScene();
        String str = "";
        if (scene == null) {
            scene = "";
        }
        Music music = this.LIZ.music;
        if (music != null && (mid = music.getMid()) != null) {
            str = mid;
        }
        String schema = musicResourceBitStruct.getSchema();
        if (schema != null && schema.length() != 0) {
            C1250280idm c1250280idm = new C1250280idm();
            c1250280idm.LIZIZ = "rewarded_music";
            C344320Deg c344320Deg = new C344320Deg(context);
            List<String> channels = musicResourceBitStruct.getChannels();
            ArrayList arrayList = new ArrayList();
            if (channels != null) {
                for (String str2 : channels) {
                    if (str2 != null && str2.length() != 0) {
                        arrayList.add(new CheckRequestBodyModel.TargetChannel(str2));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                    optionCheckUpdateParams.setLazyUpdate(true);
                    String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                    C1537050q6J.LIZ.getClass();
                    C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
                    if (c1551950qULLIZ != null) {
                        c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList)), optionCheckUpdateParams);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            String icon = musicResourceBitStruct.getIcon();
            if (icon != null && icon.length() != 0) {
                RemoteImageView remoteImageView = c344320Deg.LLILLJJLI;
                if (remoteImageView != null) {
                    C1324840ka2.LJIIJ(remoteImageView, icon, -1, -1);
                    C630120Ona.LIZIZ(remoteImageView);
                }
            } else {
                RemoteImageView remoteImageView2 = c344320Deg.LLILLJJLI;
                if (remoteImageView2 != null) {
                    C630120Ona.LIZ(remoteImageView2);
                }
            }
            TuxTextView tuxTextView = c344320Deg.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setText(musicResourceBitStruct.getDesc());
            }
            List<String> colors = musicResourceBitStruct.getColors();
            ArrayList arrayList2 = new ArrayList();
            if (colors != null) {
                Iterator<String> it2 = colors.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(ColorProtector.parseColor(it2.next())));
                }
            }
            if (!arrayList2.isEmpty()) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(27));
                gradientDrawable.setGradientType(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(C13LP.LLII(arrayList2));
                View view = c344320Deg.LL;
                if (view != null) {
                    view.setBackground(gradientDrawable);
                }
            }
            c1250280idm.LIZJ = c344320Deg;
            tuxNavBar.LIZ(c1250280idm);
            C1398280mUU.LJIJ(scene, str);
        }
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZIZ(TuxNavBar tuxNavBar) {
        C344320Deg c344320Deg;
        View viewLJII = tuxNavBar.LJII("rewarded_music");
        if (viewLJII instanceof C344320Deg) {
            c344320Deg = (C344320Deg) viewLJII;
        } else {
            c344320Deg = null;
        }
        this.LIZIZ = c344320Deg;
        C344320Deg c344320Deg2 = this.LIZIZ;
        if (c344320Deg2 != null) {
            ViewGroup.LayoutParams layoutParams = c344320Deg2.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                layoutParams2.width = -2;
                layoutParams2.height = -2;
                C786410Ut5.W5(c344320Deg2, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        C344320Deg c344320Deg3 = this.LIZIZ;
        if (c344320Deg3 != null) {
            c344320Deg3.setActionListener(new C0P4D(this, this.LIZJ, 2));
        }
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZJ(int i) {
        int i2;
        C344320Deg c344320Deg = this.LIZIZ;
        if (c344320Deg != null) {
            MusicDetailNavBarAssem musicDetailNavBarAssem = this.LIZJ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            musicDetailNavBarAssem.getClass();
            float fMp = 1.0f - MusicDetailNavBarAssem.mp(iLIZIZ, iLIZIZ2, i);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c344320Deg);
            c344320Deg.setAlpha(fMp);
        }
        C344320Deg c344320Deg2 = this.LIZIZ;
        if (c344320Deg2 != null) {
            if (Intrinsics.LIZLLL(Float.valueOf(c344320Deg2.getAlpha()), 0.0f)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            int visibility = c344320Deg2.getVisibility();
            c344320Deg2.setVisibility(i2);
            C1602160rnK.LIZIZ(visibility, i2, c344320Deg2);
        }
    }

    public C630100OnY(MusicDetailNavBarAssem musicDetailNavBarAssem, MusicDetail musicDetail) {
        this.LIZJ = musicDetailNavBarAssem;
        this.LIZ = musicDetail;
    }
}
