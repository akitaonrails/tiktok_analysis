package com.bytedance.android.live.effect.karaoke.fragments;

import X.AbstractC471570IeR;
import X.AbstractC764660Tz6;
import X.AnonymousClass0973;
import X.C0U04;
import X.C0U0R;
import X.C0U2N;
import X.C23250099c;
import X.C500260Jjc;
import X.InterfaceC1813060xHU;
import Y.AsS39S0100000_12;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes13.dex */
public class KaraokeLibrarySongListFragment extends KaraokeSongListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZyQyOiQjIip9HELIOSLjctLiI2JjE/ZwQyOiQjIiofISc+KD0qGyoiLgM6OzEKOy40JSAiPQ==";

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public final void bS(C0U0R c0u0r) {
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public int ZR() {
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        if (karaokeViewModel != null) {
            return karaokeViewModel.LL.LJIIIZ == this.LLILZLL ? R.layout.gwt : R.layout.gwr;
        }
        return R.layout.gwr;
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public void OR() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0U04(this, null), 3);
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    public void dS(AbstractC764660Tz6 abstractC764660Tz6) {
        C0U2N c0u2nUR;
        if ((abstractC764660Tz6 instanceof AnonymousClass0973) && (c0u2nUR = UR()) != null) {
            AnonymousClass0973 anonymousClass0973 = (AnonymousClass0973) abstractC764660Tz6;
            c0u2nUR.LLLI(anonymousClass0973.LIZIZ, anonymousClass0973.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cS(X.C0U0I r8, long r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment.cS(X.0U0I, long):void");
    }

    @Override // com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        C0U2N c0u2nUR;
        boolean z;
        super.onViewCreated(view, bundle);
        VR().addOnScrollListener(new AsS39S0100000_12(this, 0));
        WR().setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0U09
            @Override // X.InterfaceC1813060xHU
            public final void LIZIZ() {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C0U05(this.LIZ, null), 3);
            }
        });
        KaraokeViewModel karaokeViewModel = this.LLILZIL;
        if (karaokeViewModel != null) {
            if (karaokeViewModel.LL.LJIIIZ == this.LLILZLL) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (c0u2nUR = UR()) != null) {
            c0u2nUR.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0U0F
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    this.LIZ.VR().scrollToPosition(0);
                }
            });
        }
    }
}
