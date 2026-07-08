package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC764660Tz6;
import X.AbstractC765930U2t;
import X.AnonymousClass0956;
import X.AnonymousClass0973;
import X.C01GW;
import X.C0PEM;
import X.C0U02;
import X.C0U03;
import X.C0U0B;
import X.C0U0I;
import X.C0U0R;
import X.C0U17;
import X.C0U22;
import X.C0U2E;
import X.C0U2F;
import X.C1161920gLG;
import X.C19ME;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C292401Bi;
import X.C500260Jjc;
import X.C765110Tzp;
import X.C781660UlQ;
import X.C786410Ut5;
import X.EnumC764770TzH;
import X.InterfaceC1813060xHU;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC1836610xtT;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeQueueSongListFragment extends KaraokeSongListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjIiHELIOSp9LjctLiI2JjE/ZwQyOiQjIioCPSA5LBw8JiIAIDwnDjctLiI2JjE=";
    public TextView LLJJIII;
    public TextView LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public final C0U2F LLJJI = new C0U2E() { // from class: X.0U2F
        @Override // X.C0U2E, X.AbstractC765930U2t
        public final /* bridge */ /* synthetic */ boolean LIZ(int i, int i2, Object obj, Object obj2) {
            return LIZ((C0U22) obj, (C0U22) obj2, i, i2);
        }

        @Override // X.C0U2E, X.AbstractC765930U2t
        public final /* bridge */ /* synthetic */ Object LIZJ(int i, int i2, Object obj, Object obj2) {
            return LIZJ((C0U22) obj, (C0U22) obj2, i, i2);
        }

        @Override // X.C0U2E
        /* JADX INFO: renamed from: LIZLLL */
        public final boolean LIZ(C0U22 c0u22, C0U22 c0u222, int i, int i2) {
            Long lValueOf;
            if (i2 == 0) {
                if (i != 0) {
                    return false;
                }
            } else if (i2 == 1) {
                if (i != 1) {
                    return false;
                }
            } else if (i2 == 2 && i != 2) {
                return false;
            }
            C0U2X c0u2x = c0u22.LJIILLIIL;
            Long lValueOf2 = null;
            if (c0u2x != null) {
                lValueOf = Long.valueOf(c0u2x.LIZIZ);
            } else {
                lValueOf = null;
            }
            C0U2X c0u2x2 = c0u222.LJIILLIIL;
            if (c0u2x2 != null) {
                lValueOf2 = Long.valueOf(c0u2x2.LIZIZ);
            }
            if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                return false;
            }
            return super.LIZ(c0u22, c0u222, i, i2);
        }

        @Override // X.C0U2E
        /* JADX INFO: renamed from: LJ */
        public final Object LIZJ(C0U22 c0u22, C0U22 c0u222, int i, int i2) {
            List list;
            Long lValueOf;
            Object objLIZJ = super.LIZJ(c0u22, c0u222, i, i2);
            Long lValueOf2 = null;
            if (C19719512Dh.LJI(objLIZJ)) {
                list = (List) objLIZJ;
            } else {
                list = null;
            }
            if (i2 == 0) {
                if (i != 0 && list != null) {
                    list.add(C0U2K.PLAY_STATUS);
                }
            } else if (i2 == 1) {
                if (i != 1 && list != null) {
                    list.add(C0U2K.HIDE_PIN);
                }
            } else if (i2 == 2 && i != 2 && list != null) {
                list.add(C0U2K.SHOW_PIN);
            }
            C0U2X c0u2x = c0u22.LJIILLIIL;
            if (c0u2x != null) {
                lValueOf = Long.valueOf(c0u2x.LIZIZ);
            } else {
                lValueOf = null;
            }
            C0U2X c0u2x2 = c0u222.LJIILLIIL;
            if (c0u2x2 != null) {
                lValueOf2 = Long.valueOf(c0u2x2.LIZIZ);
            }
            if (!Intrinsics.LJFF(lValueOf, lValueOf2) && list != null) {
                list.add(C0U2K.SINGER_CHANGED);
            }
            return list;
        }
    };
    public final C01GW LLJJIJIL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(18));

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final int RR() {
        return R.layout.gwl;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final boolean nS() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void oS() {
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final int ZR() {
        return C500260Jjc.LJIIZILJ(this.LLJI) ? R.layout.gwk : R.layout.gwj;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void hS() {
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannel = this.LLJI;
        EnumC764770TzH enumC764770TzH = EnumC764770TzH.QUEUE;
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        c0u17.LJIIIZ(dataChannel, enumC764770TzH, karaokeViewModel != null ? Integer.valueOf(karaokeViewModel.HQ2()) : null, null, this.LLJILLL);
    }

    public final ValueAnimator rS() {
        return (ValueAnimator) this.LLJJIJIL.getValue();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void OR() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0U03(this, null), 3);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannel = this.LLJI;
        EnumC764770TzH enumC764770TzH = EnumC764770TzH.QUEUE;
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        c0u17.LJIIJ(dataChannel, enumC764770TzH, false, karaokeViewModel != null ? Integer.valueOf(karaokeViewModel.HQ2()) : null, null);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final AbstractC765930U2t<C0U22> SR() {
        return this.LLJJI;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void bS(C0U0R c0u0r) {
        C781660UlQ c781660UlQ;
        int i = C0U0B.LIZIZ[c0u0r.ordinal()];
        if ((i != 1 && i != 2) || (c781660UlQ = this.LLJIJIL) == null) {
            return;
        }
        c781660UlQ.LIZJ(true);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void dS(AbstractC764660Tz6 abstractC764660Tz6) {
        Context context;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        if (abstractC764660Tz6 instanceof AnonymousClass0973) {
            AnonymousClass0973 anonymousClass0973 = (AnonymousClass0973) abstractC764660Tz6;
            UR().LLLI(anonymousClass0973.LIZIZ, anonymousClass0973.LIZ);
            return;
        }
        if (!(abstractC764660Tz6 instanceof C765110Tzp) || !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).oc() || (context = getContext()) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Resources resources = context.getResources();
        C765110Tzp c765110Tzp = (C765110Tzp) abstractC764660Tz6;
        int i = c765110Tzp.LIZ;
        sbLIZ.append(resources.getQuantityString(2131755566, i, Integer.valueOf(i)));
        Resources resources2 = context.getResources();
        int i2 = c765110Tzp.LIZIZ;
        sbLIZ.append(resources2.getQuantityString(2131755567, i2, Integer.valueOf(i2)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        rS().cancel();
        TextView textView = this.LLJJIII;
        if (textView == null) {
            textView = null;
        }
        C500260Jjc.LLFFF(textView);
        TextView textView2 = this.LLJJIII;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.cd(0.0f, textView2);
        TextView textView3 = this.LLJJIII;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(strLIZIZ);
        RunnableC781530UlD runnableC781530UlDVR = VR();
        if (runnableC781530UlDVR != null) {
            layoutParams = runnableC781530UlDVR.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
            c19me.topToTop = -1;
            c19me.topToBottom = R.id.m22;
            RunnableC781530UlD runnableC781530UlDVR2 = VR();
            if (runnableC781530UlDVR2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(runnableC781530UlDVR2);
                runnableC781530UlDVR2.setLayoutParams(c19me);
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJIJIIJIL = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0U02(this, null), 2);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void gS(ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT) {
        this.LLJJIJI = (TextView) viewOnClickListenerC1836610xtT.findViewById(R.id.h2m);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void kS(int i) {
        NR();
        TextView textView = null;
        if (i != 3 && i != 4) {
            KaraokeViewModel karaokeViewModel = this.LLILZIL;
            if (karaokeViewModel != null && karaokeViewModel.HQ2() == 1) {
                TextView textView2 = this.LLJJIJI;
                if (textView2 != null) {
                    textView = textView2;
                }
                textView.setText(textView.getContext().getResources().getString(2131840685));
                return;
            }
            TextView textView3 = this.LLJJIJI;
            if (textView3 != null) {
                textView = textView3;
            }
            textView.setText(textView.getContext().getResources().getString(2131840669));
            return;
        }
        TextView textView4 = this.LLJJIJI;
        if (textView4 != null) {
            textView = textView4;
        }
        textView.setText(textView.getContext().getResources().getString(2131843317));
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void cS(C0U0I c0u0i, long j) {
        C781660UlQ c781660UlQ;
        int i = C0U0B.LIZ[c0u0i.ordinal()];
        if ((i != 1 && i != 2 && i != 3) || (c781660UlQ = this.LLJIJIL) == null) {
            return;
        }
        c781660UlQ.LIZJ(true);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJIII = (TextView) view.findViewById(R.id.m22);
        WR().setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0U0A
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C0U06(this.LIZ, null), 3);
            }
        });
    }
}
