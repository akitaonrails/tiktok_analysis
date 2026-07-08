package X;

import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09qK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2496209qK extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV, InterfaceC2495909qH {
    public static final C2496309qL LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525680KjW.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525880Kjq.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final int LLILZLL = 100;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.09qL] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2496209qK.class, "albumNextStepApi", "getAlbumNextStepApi()Lcom/ss/android/ugc/aweme/shortvideo/album/nextstep/AlbumNextStepApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C2496209qK.class, "selectionDataApi", "getSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0), new C2217381BqS(C2496209qK.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLIZ = new Object() { // from class: X.09qL
        };
        LLJ = 8;
    }

    private final InterfaceC525680KjW X1() {
        return (InterfaceC525680KjW) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final InterfaceC525880Kjq Z1() {
        return (InterfaceC525880Kjq) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().pB1(this);
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC2495909qH
    public int getPriority() {
        return this.LLILZLL;
    }

    public C2496209qK(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final Pair<Integer, Integer> o2(TikTokMediaModel tikTokMediaModel) {
        Object c098200Yq;
        int i = tikTokMediaModel.width;
        if (i > 0 && tikTokMediaModel.height > 0) {
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(tikTokMediaModel.height));
        }
        String strLJFF = tikTokMediaModel.LJFF();
        if (strLJFF == null) {
            return new Pair<>(0, 0);
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(strLJFF, options);
            c098200Yq = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Pair pair = new Pair(0, 0);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = pair;
        }
        return (Pair) c098200Yq;
    }

    public final boolean W1(TikTokMediaModel tikTokMediaModel, float f) {
        Pair<Integer, Integer> pairO2 = o2(tikTokMediaModel);
        int iIntValue = pairO2.getFirst().intValue();
        int iIntValue2 = pairO2.getSecond().intValue();
        boolean z = false;
        if (iIntValue > 0 && iIntValue2 > 0) {
            float fMax = Math.max(iIntValue, iIntValue2) / Math.min(iIntValue, iIntValue2);
            if (fMax > f) {
                z = true;
            }
            String str = C545870Laz.LIZIZ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIPortraitAlbumAspectRatioInterceptComponent -> exceedsAspectRatio id=");
            sbLIZ.append(((MediaModel) tikTokMediaModel).id);
            sbLIZ.append(", width=");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", height=");
            sbLIZ.append(iIntValue2);
            sbLIZ.append(", ratio=");
            sbLIZ.append(fMax);
            sbLIZ.append(", maxRatio=");
            sbLIZ.append(f);
            sbLIZ.append(", exceed=");
            sbLIZ.append(z);
            C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            return z;
        }
        String str2 = C545870Laz.LIZIZ.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AIPortraitAlbumAspectRatioInterceptComponent -> exceedsAspectRatio id=");
        sbLIZ2.append(((MediaModel) tikTokMediaModel).id);
        sbLIZ2.append(", size unresolved (width=");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append(", height=");
        sbLIZ2.append(iIntValue2);
        sbLIZ2.append("), treat as not-exceed");
        C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    @Override // X.InterfaceC2495909qH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object LJLIIIL(X.C525700KjY r12, X.InterfaceC2495009q8 r13, X.InterfaceC1364105Vn<? super X.InterfaceC2499409qq> r14) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2496209qK.LJLIIIL(X.0KjY, X.09q8, X.05Vn):java.lang.Object");
    }
}
