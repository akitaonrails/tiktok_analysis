package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC764660Tz6;
import X.AbstractC765930U2t;
import X.C097M;
import X.C0U0I;
import X.C0U17;
import X.C0U22;
import X.C0U2D;
import X.C0U2E;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C765190Tzx;
import X.C781660UlQ;
import X.C786410Ut5;
import X.EnumC764770TzH;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeViewerSingsSongListFragment extends KaraokeRequestSongListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjIip9LjHELIOSctLiI2JjE/ZwQyOiQjIioFISA7LD0AISsrOhw8JiIAIDwnDjctLiI2JjE=";
    public final C0U2D LLJJI = new C0U2E() { // from class: X.0U2D
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
    public View LLJJIII;
    public View LLJJIJI;

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final int ZR() {
        return C500260Jjc.LJIIZILJ(this.LLJI) ? R.layout.gx2 : R.layout.gx1;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void hS() {
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannel = this.LLJI;
        EnumC764770TzH enumC764770TzH = EnumC764770TzH.REQUESTS;
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        c0u17.LJIIIZ(dataChannel, enumC764770TzH, karaokeViewModel != null ? Integer.valueOf(karaokeViewModel.HQ2()) : null, EnumC764770TzH.VIEWER_SINGS, this.LLJILLL);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C20441214yg.LIZIZ("user_show", "onResume");
        super.onResume();
        C0U17 c0u17 = C0U17.LIZ;
        ((List) C0U17.LJI.getValue()).clear();
        if (C500260Jjc.LJJJJIZL(this.LLJJIJI)) {
            C0U17.LJ.lO();
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment
    public final void rS() {
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        int size = karaokeViewModel != null ? ((int) karaokeViewModel.LLIZLLLIL.LIZLLL) + karaokeViewModel.LLIZLLLIL.LJIIJJI.size() : 0;
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannel = this.LLJI;
        EnumC764770TzH enumC764770TzH = EnumC764770TzH.REQUESTS;
        boolean z = size > 0;
        KaraokeViewModel karaokeViewModel2 = this.LLILZIL;
        c0u17.LJIIJ(dataChannel, enumC764770TzH, z, karaokeViewModel2 != null ? Integer.valueOf(karaokeViewModel2.HQ2()) : null, EnumC764770TzH.VIEWER_SINGS);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C20441214yg.LIZIZ("user_show", "onPause");
        C0U17 c0u17 = C0U17.LIZ;
        ((List) C0U17.LJI.getValue()).clear();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final AbstractC765930U2t<C0U22> SR() {
        return this.LLJJI;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void dS(AbstractC764660Tz6 abstractC764660Tz6) {
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtTWR;
        super.dS(abstractC764660Tz6);
        if ((abstractC764660Tz6 instanceof C097M) && !((C097M) abstractC764660Tz6).LIZIZ && (viewOnClickListenerC1836610xtTWR = WR()) != null) {
            viewOnClickListenerC1836610xtTWR.LJ();
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void gS(ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT) {
        View viewFindViewById;
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            this.LLJJIII = viewOnClickListenerC1836610xtT.findViewById(R.id.h2t);
            View viewFindViewById2 = viewOnClickListenerC1836610xtT.findViewById(R.id.axv);
            this.LLJJIJI = viewFindViewById2;
            if (viewFindViewById2 != null && (viewFindViewById = viewFindViewById2.findViewById(R.id.axt)) != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 47), viewFindViewById);
            }
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void kS(int i) {
        NR();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handle Layout Change: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("KaraokeViewerSingsSongListFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 1) {
            C500260Jjc.LLFFF(this.LLJJIJI);
            C500260Jjc.LJIILIIL(this.LLJJIII);
            if (isResumed()) {
                C0U17 c0u17 = C0U17.LIZ;
                C0U17.LJ.lO();
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJJIJI);
        C500260Jjc.LLFFF(this.LLJJIII);
        Gj();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void mS(List<C0U22> list) {
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            C0U17 c0u17 = C0U17.LIZ;
            ((List) C0U17.LJI.getValue()).retainAll(list);
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void cS(C0U0I c0u0i, long j) {
        C781660UlQ c781660UlQ;
        if (C765190Tzx.LIZ[c0u0i.ordinal()] == 1 && (c781660UlQ = this.LLJIJIL) != null) {
            c781660UlQ.LIZJ(true);
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
