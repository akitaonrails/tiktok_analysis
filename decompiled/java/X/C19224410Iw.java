package X;

import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10Iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19224410Iw extends C193N<C10JL, C190Z, C19224710Iz> implements C10JL {
    public static final int LLJILJIL = 8;
    public final C01GW LLIZ;
    public final Function0<C190Z> LLIZLLLIL;
    public final C19224710Iz LLJ;
    public final InterfaceC1738600vLO LLJI;
    public final C10J3 LLJIJIL;

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    public final AudioCopyrightDetectAPI O4() {
        return (AudioCopyrightDetectAPI) this.LLIZ.getValue();
    }

    public final boolean P4() {
        return C856830XjN.LIZIZ();
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJI;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJIJIL;
    }

    public C19224710Iz K4() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLIZLLLIL;
    }

    public C19224410Iw(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        super(c1drg);
        this.LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
        this.LLIZLLLIL = new AwS572S0100000_28(this, 988);
        this.LLJ = new C19224710Iz(null, null, new C19332210kC(videoPublishEditModel, this, 7), null, 11);
        this.LLJI = EnumC214771193h.AUDIO_COPYRIGHT_TIPS_SHOW;
        this.LLJIJIL = AnonymousClass1937.LIZ;
    }
}
