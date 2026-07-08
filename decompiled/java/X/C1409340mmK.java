package X;

import Y.AObjectS245S0100000_22;
import Y.ARunnableS122S0100000_22;
import androidx.lifecycle.AtomicReference;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409340mmK extends AbstractC2255721DQs<InterfaceC1409500mma> implements InterfaceC1409500mma, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(77));
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1441090nbX.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 134));
    public boolean LLIZ;
    public final C560530Lyd<C1409380mmO> LLIZLLLIL;
    public final LiveEvent<C1409380mmO> LLJ;
    public final C560530Lyd<List<String>> LLJI;
    public final LiveEvent<List<String>> LLJIJIL;
    public final C560530Lyd<Unit> LLJILJIL;
    public final LiveEvent<Unit> LLJILJILJ;
    public final AtomicReference<C1409380mmO> LLJILLL;
    public final AtomicBoolean LLJJ;
    public final List<InterfaceC1409290mmF> LLJJI;
    public List<C09AE> LLJJIII;
    public boolean LLJJIJI;
    public List<String> LLJJIJIIJIL;
    public List<String> LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1409340mmK.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1409340mmK.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1409340mmK.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJJIL = 8;
    }

    public InterfaceC1409500mma W1() {
        return this;
    }

    private final C1409480mmY H2() {
        return (C1409480mmY) this.LLILZLL.getValue();
    }

    private final InterfaceC1451050nrb Z1() {
        return (InterfaceC1451050nrb) this.LLILLJJLI.getValue(this, LLJJJ[0]);
    }

    private final InterfaceC1441090nbX w2() {
        return (InterfaceC1441090nbX) this.LLILZ.getValue(this, LLJJJ[1]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJJJ[2]);
    }

    public final C1409380mmO X1() {
        return this.LLJILLL.get();
    }

    public final InterfaceC1635410sex o2() {
        return (InterfaceC1635410sex) this.LLILLL.getValue();
    }

    private final void m3() {
        H2().LIZJ = null;
        this.LLJJIII.add(C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1409230mm9(this, null), 3));
    }

    public final boolean W2() {
        ArrayList arrayList;
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = LJJJLIIL().getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSrcImageInfo().getPath());
            }
        }
        return Intrinsics.LJFF(arrayList, this.LLJJIJIIJIL);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C560530Lyd<Integer> c560530LydAd;
        super.onCreate();
        InterfaceC1441090nbX interfaceC1441090nbXW2 = w2();
        if (interfaceC1441090nbXW2 != null && (c560530LydAd = interfaceC1441090nbXW2.Ad()) != null) {
            c560530LydAd.LIZ(this, new AObjectS245S0100000_22(this, 21));
        }
        Z1().yd1().LIZ(this, new AObjectS245S0100000_22(this, 22));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C201955140j.LIZLLL(C1421590n65.LIZIZ, "inspiration_data", "inspiration data onDestroy");
        try {
            Iterator<C09AE> it2 = this.LLJJIII.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(null);
            }
            this.LLJJIII.clear();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1409500mma
    public LiveEvent<Unit> Ad() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1409500mma
    public LiveEvent<C1409380mmO> BM0() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1409500mma
    public LiveEvent<List<String>> vI2() {
        return this.LLJIJIL;
    }

    public C1409340mmK(C1DRG c1drg) {
        this.LL = c1drg;
        C560530Lyd<C1409380mmO> c560530Lyd = new C560530Lyd<>();
        this.LLIZLLLIL = c560530Lyd;
        this.LLJ = c560530Lyd;
        C560530Lyd<List<String>> c560530Lyd2 = new C560530Lyd<>();
        this.LLJI = c560530Lyd2;
        this.LLJIJIL = c560530Lyd2;
        C560530Lyd<Unit> c560530Lyd3 = new C560530Lyd<>();
        this.LLJILJIL = c560530Lyd3;
        this.LLJILJILJ = c560530Lyd3;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJILLL = new AtomicReference<>(new C1409380mmO(c13bv, c13bv, c13bv));
        this.LLJJ = new AtomicBoolean(false);
        this.LLJJI = new ArrayList();
        this.LLJJIII = new ArrayList();
        this.LLJJIJIIJIL = c13bv;
        this.LLJJIJIL = c13bv;
    }

    private final boolean T2(C1409380mmO c1409380mmO) {
        if (!this.LLJJIJI && (!c1409380mmO.LIZ.isEmpty()) && (!c1409380mmO.LIZIZ.isEmpty())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // X.InterfaceC1409500mma
    public void fB0(EnumC1409650mmp enumC1409650mmp) {
        ?? arrayList;
        List<SingleImageData> imageList;
        C201955140j.LIZLLL(C1421590n65.LIZIZ, "inspiration_data", "refreshInspirations");
        H2().LIZJ = null;
        ImageAlbumData imageAlbumData = LJJJLIIL().getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSrcImageInfo().getPath());
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        this.LLJJIJIIJIL = arrayList;
        this.LLJJIII.add(C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1409240mmA(this, enumC1409650mmp, null), 3));
    }

    @Override // X.InterfaceC1409500mma
    public void ju0(EnumC1409650mmp enumC1409650mmp) {
        LifecycleOwnerExtensionsKt.LIZIZ(this, 700L, new ARunnableS122S0100000_22(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // X.InterfaceC1409500mma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object nb1(X.InterfaceC1364105Vn<? super java.util.List<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1409330mmJ
            if (r0 == 0) goto L48
            r5 = r7
            X.0mmJ r5 = (X.C1409330mmJ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse r1 = (com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse) r1
            java.util.List<java.lang.String> r0 = r1.labels
            if (r0 != 0) goto L2a
            X.13BV r0 = X.C13BV.INSTANCE
        L2a:
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.0n65 r2 = X.C1421590n65.LIZIZ
            java.lang.String r1 = "inspiration_data"
            java.lang.String r0 = "getInspirationLabelData"
            X.C201955140j.LIZLLL(r2, r1, r0)
            X.0mmY r1 = r6.H2()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LJJJLIIL()
            r5.LLILLL = r3
            java.lang.Object r1 = r1.LIZIZ(r0, r5)
            if (r1 != r4) goto L22
            return r4
        L48:
            X.0mmJ r5 = new X.0mmJ
            r5.<init>(r6, r7)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409340mmK.nb1(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1409500mma
    public void oW(boolean z) {
        this.LLIZ = z;
    }

    public final void q3(C1409380mmO c1409380mmO) {
        AtomicReference<C1409380mmO> atomicReference = this.LLJILLL;
        while (!atomicReference.compareAndSet(atomicReference.get(), c1409380mmO)) {
        }
    }

    public static final void c3(C1409340mmK c1409340mmK, EnumC1409650mmp enumC1409650mmp) {
        c1409340mmK.LLJJIJI = true;
        if (!c1409340mmK.LLIZ) {
            C201955140j.LIZLLL(C1421590n65.LIZIZ, "inspiration_data", "don't support auto refresh, skip auto refresh inspiration data");
            c1409340mmK.m3();
        } else {
            c1409340mmK.fB0(enumC1409650mmp);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149 A[Catch: all -> 0x01cb, Exception -> 0x01ce, CancellationException -> 0x01d0, LOOP:1: B:60:0x0143->B:62:0x0149, LOOP_END, TryCatch #18 {CancellationException -> 0x01d0, Exception -> 0x01ce, all -> 0x01cb, blocks: (B:59:0x0132, B:60:0x0143, B:62:0x0149, B:63:0x015f, B:64:0x016e, B:66:0x0174, B:67:0x0193), top: B:157:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174 A[Catch: all -> 0x01cb, Exception -> 0x01ce, CancellationException -> 0x01d0, LOOP:2: B:64:0x016e->B:66:0x0174, LOOP_END, TryCatch #18 {CancellationException -> 0x01d0, Exception -> 0x01ce, all -> 0x01cb, blocks: (B:59:0x0132, B:60:0x0143, B:62:0x0149, B:63:0x015f, B:64:0x016e, B:66:0x0174, B:67:0x0193), top: B:157:0x0132 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G2(boolean r18, X.EnumC1409650mmp r19, X.InterfaceC1364105Vn<? super X.AbstractC1409420mmS> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409340mmK.G2(boolean, X.0mmp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0266 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c3 A[PHI: r2 r3 r4 r6 r9 r10
      0x02c3: PHI (r2v18 X.0mmp) = (r2v15 X.0mmp), (r2v21 X.0mmp) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r3v15 ??) = (r3v24 ??), (r3v25 ??) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r4v19 ??) = (r4v30 ??), (r4v31 ??) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r6v15 com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) = 
      (r6v12 com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel)
      (r6v19 com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel)
     binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r9v4 boolean) = (r9v3 boolean), (r9v7 boolean) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r10v6 long) = (r10v5 long), (r10v10 long) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d0 A[PHI: r2 r4 r6 r9 r10
      0x02d0: PHI (r2v20 X.0mmp) = (r2v15 X.0mmp), (r2v21 X.0mmp) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r4v21 ??) = (r4v26 ??), (r4v27 ??) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r6v17 com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) = 
      (r6v12 com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel)
      (r6v19 com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel)
     binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r9v6 boolean) = (r9v3 boolean), (r9v7 boolean) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r10v8 long) = (r10v5 long), (r10v10 long) binds: [B:120:0x02c1, B:110:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e A[Catch: all -> 0x0219, Exception -> 0x021c, CancellationException -> 0x021e, LOOP:0: B:67:0x0188->B:69:0x018e, LOOP_END, TryCatch #13 {CancellationException -> 0x021e, Exception -> 0x021c, all -> 0x0219, blocks: (B:66:0x0171, B:67:0x0188, B:69:0x018e, B:70:0x01a4, B:71:0x01b9, B:73:0x01bf, B:74:0x01de), top: B:153:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf A[Catch: all -> 0x0219, Exception -> 0x021c, CancellationException -> 0x021e, LOOP:1: B:71:0x01b9->B:73:0x01bf, LOOP_END, TryCatch #13 {CancellationException -> 0x021e, Exception -> 0x021c, all -> 0x0219, blocks: (B:66:0x0171, B:67:0x0188, B:69:0x018e, B:70:0x01a4, B:71:0x01b9, B:73:0x01bf, B:74:0x01de), top: B:153:0x0171 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [long] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v25, types: [long] */
    /* JADX WARN: Type inference failed for: r0v26, types: [long] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [long] */
    /* JADX WARN: Type inference failed for: r0v31, types: [long] */
    /* JADX WARN: Type inference failed for: r0v32, types: [long] */
    /* JADX WARN: Type inference failed for: r0v35, types: [long] */
    /* JADX WARN: Type inference failed for: r0v36, types: [long] */
    /* JADX WARN: Type inference failed for: r0v43, types: [long] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v11, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r5v22, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.0mmk] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0mmk] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1409500mma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d61(boolean r19, X.EnumC1409650mmp r20, X.InterfaceC1409290mmF r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409340mmK.d61(boolean, X.0mmp, X.0mmF, X.05Vn):java.lang.Object");
    }
}
