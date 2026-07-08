package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.MusicStreamConfig;

/* JADX INFO: renamed from: X.15Jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20500415Jq {
    void Mf();

    void Nf(int i, InterfaceC1485090okV interfaceC1485090okV);

    void Of(InterfaceC1485080okU interfaceC1485080okU);

    void Pf(MusicModel musicModel, int i);

    void Qf();

    void Rf(InterfaceC1485100okW interfaceC1485100okW);

    void Sf(int i, MusicModel musicModel, boolean z, boolean z2, boolean z3);

    void Tf(C15IZ c15iz);

    void Uf(int i, MusicModel musicModel, boolean z, boolean z2);

    void Vf(MusicStreamConfig musicStreamConfig);

    void Wf();

    void Xf(MusicModel musicModel, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    void Yf(MusicModel musicModel);

    void Zf(MusicModel musicModel, int i, boolean z, int i2, int i3);

    void ag(int i, MusicModel musicModel, boolean z, boolean z2, boolean z3);

    int getDuration();

    boolean isPlaying();

    void onDestroy();

    void pause();

    void setCreationId(String str);

    void stop();
}
