package com.bytedance.android.live.effect.karaoke.fragments;

import X.C0U0I;
import X.C0U17;
import X.C23250099c;
import X.C500260Jjc;
import X.C765160Tzu;
import X.C765180Tzw;
import X.C781660UlQ;
import X.EnumC764770TzH;
import X.InterfaceC1813060xHU;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public class KaraokeRequestSongListFragment extends KaraokeLibrarySongListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjIip9HELIOSLjctLiI2JjE/ZwQyOiQjIioBLTQ5LDwnGyoiLgM6OzEKOy40JSAiPQ==";

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public boolean nS() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void oS() {
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public int ZR() {
        return C500260Jjc.LJIIZILJ(this.LLJI) ? R.layout.gwn : R.layout.gwm;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public void hS() {
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannel = this.LLJI;
        EnumC764770TzH enumC764770TzH = EnumC764770TzH.REQUESTS;
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        c0u17.LJIIIZ(dataChannel, enumC764770TzH, karaokeViewModel != null ? Integer.valueOf(karaokeViewModel.HQ2()) : null, EnumC764770TzH.CREATOR_SINGS, this.LLJILLL);
    }

    public void rS() {
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        int size = karaokeViewModel != null ? ((int) karaokeViewModel.LLIZLLLIL.LIZLLL) + karaokeViewModel.LLIZLLLIL.LJIIJJI.size() : 0;
        C0U17 c0u17 = C0U17.LIZ;
        DataChannel dataChannel = this.LLJI;
        EnumC764770TzH enumC764770TzH = EnumC764770TzH.REQUESTS;
        boolean z = size > 0;
        KaraokeViewModel karaokeViewModel2 = this.LLILZIL;
        c0u17.LJIIJ(dataChannel, enumC764770TzH, z, karaokeViewModel2 != null ? Integer.valueOf(karaokeViewModel2.HQ2()) : null, EnumC764770TzH.CREATOR_SINGS);
    }

    public final void Gj() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C765160Tzu(this, null), 3);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        rS();
        super.onResume();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void OR() {
        Gj();
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public void cS(C0U0I c0u0i, long j) {
        C781660UlQ c781660UlQ;
        super.cS(c0u0i, j);
        if (C765180Tzw.LIZ[c0u0i.ordinal()] == 1 && (c781660UlQ = this.LLJIJIL) != null) {
            c781660UlQ.LIZJ(true);
        }
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment, com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WR().setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0Tzv
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                this.LIZ.Gj();
            }
        });
    }
}
