package X;

import Y.AObserverS212S0100000_8;
import Y.AfS177S0100000_8;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import ge.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS3S1010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551470Lk1 extends i<InterfaceC549620Lh2, C21305518Zh, C551480Lk2, C551490Lk3> implements InterfaceC549620Lh2, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C549500Lgq LLJILJILJ;
    public final C19A3 LLJILLL;
    public final C1DRG LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final C11NJ LLJJIII;
    public final Function0<C551480Lk2> LLJJIJI;
    public final Function0<C551490Lk3> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C551470Lk1.class, "inputFeatureApi", "getInputFeatureApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/input/AICreationInputApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final InterfaceC549200LgM F4() {
        return (InterfaceC549200LgM) this.LLJJI.getValue(this, LLJJIJIL[0]);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        String strLIZ;
        Boolean boolLIZ;
        super.onCreate();
        this.LLJJIII.LIZ(F4().O0().LJLILLLLZI(300L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 6)));
        F4().LLLLIIL().observe(this, new AObserverS212S0100000_8(this, 14));
        F4().XV().observe(this, new AObserverS212S0100000_8(this, 15));
        C550000Lhe<String> initVideoUri$tools_ai_uikit_df_release = this.LLJILJILJ.getInitVideoUri$tools_ai_uikit_df_release();
        if (initVideoUri$tools_ai_uikit_df_release == null || (strLIZ = initVideoUri$tools_ai_uikit_df_release.LIZ()) == null) {
            return;
        }
        C550000Lhe<Boolean> videoNeedToken$tools_ai_uikit_df_release = this.LLJILJILJ.getVideoNeedToken$tools_ai_uikit_df_release();
        H4(strLIZ, (videoNeedToken$tools_ai_uikit_df_release == null || (boolLIZ = videoNeedToken$tools_ai_uikit_df_release.LIZ()) == null) ? false : boolLIZ.booleanValue());
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIII.dispose();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C551480Lk2> o2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C551490Lk3> w2() {
        return this.LLJJIJIIJIL;
    }

    public final void K4(List<MentionDataItem> list) {
        i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 40));
    }

    public final void O4(MediaModel mediaModel) {
        i3(new AwS587S0100000_8(mediaModel, 41));
    }

    private final void H4(String str, boolean z) {
        i3(new AwS3S1010000_8(str, z, 0));
        if (this.LLJILJILJ.getClickXonPreview$tools_ai_uikit_df_release() != null) {
            i3(AFwS239S0000000_8.get$arr$(26));
        }
    }

    public C551470Lk1(C549500Lgq c549500Lgq, C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c549500Lgq;
        this.LLJILLL = c19a3;
        this.LLJJ = c1drg;
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC549200LgM.class, null);
        this.LLJJIII = new C11NJ();
        this.LLJJIJI = new AwS552S0100000_8(this, 63);
        this.LLJJIJIIJIL = new AwS552S0100000_8(this, 64);
    }
}
