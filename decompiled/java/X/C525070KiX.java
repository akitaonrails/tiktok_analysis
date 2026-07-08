package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0KiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525070KiX extends AbstractC2255721DQs<InterfaceC525080KiY> implements InterfaceC525080KiY, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final InterfaceC525080KiY LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525880Kjq.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525070KiX.class, "selectionDataApi", "getSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525070KiX.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final Set<String> G2() {
        if (this.LLILLJJLI) {
            return C2295608z4.LIZIZ();
        }
        if (!C527950KnB.LIZJ()) {
            return null;
        }
        if (C311120CHm.LIZ() == 1) {
            return Collections.singleton("clip_d128");
        }
        s.LIZ.getClass();
        return C15442062u.LJII(C15442062u.LJIIIZ(C2295608z4.LIZIZ(), C2295608z4.LIZ()), C118600ci.LIZ());
    }

    private final IMixEditingFeatureExtractionService X1() {
        return (IMixEditingFeatureExtractionService) PluggableExtentionKt.pluggableSpi$default(IMixEditingFeatureExtractionService.class, false, false, false, 14, null);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZIL.getValue(this, LLILZLL[1]);
    }

    public final InterfaceC525880Kjq Z1() {
        return (InterfaceC525880Kjq) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526280KkU(this, null), 3);
    }

    public InterfaceC525080KiY W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final void o2(TikTokMediaModel tikTokMediaModel) {
        IMixEditingFeatureExtractionService iMixEditingFeatureExtractionServiceX1;
        String str;
        Set<String> setG2 = G2();
        if (setG2 != null && (iMixEditingFeatureExtractionServiceX1 = X1()) != null) {
            String strLJFF = tikTokMediaModel.LJFF();
            String str2 = "";
            if (strLJFF == null) {
                strLJFF = "";
            }
            long j = tikTokMediaModel.duration;
            Boolean boolValueOf = Boolean.valueOf(tikTokMediaModel.LJIILJJIL());
            String strLJFF2 = tikTokMediaModel.LJFF();
            if (strLJFF2 != null) {
                str2 = strLJFF2;
            }
            C2262608tk c2262608tk = new C2262608tk(strLJFF, j, boolValueOf, null, str2, ((MediaModel) tikTokMediaModel).id, false, 72);
            ShortVideoContext shortVideoContext = getShortVideoContext();
            if (shortVideoContext != null) {
                str = shortVideoContext.shootWay;
            } else {
                str = null;
            }
            iMixEditingFeatureExtractionServiceX1.LJ(c2262608tk, setG2, new C2263508tt(str, "upload", null, 12));
        }
    }

    public final void w2(TikTokMediaModel tikTokMediaModel) {
        IMixEditingFeatureExtractionService iMixEditingFeatureExtractionServiceX1;
        String strLJFF = tikTokMediaModel.LJFF();
        if (strLJFF != null && (iMixEditingFeatureExtractionServiceX1 = X1()) != null) {
            iMixEditingFeatureExtractionServiceX1.LJIIJ(strLJFF, false);
        }
    }

    public C525070KiX(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }
}
