package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912150zrJ extends AbstractC1912160zrK implements InterfaceC1912230zrR {
    public final C1295960jpS LLJJ;
    public final C1295960jpS LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public boolean LLJJJ;

    @Override // X.AbstractC1912160zrK
    public final void LIZIZ() {
    }

    @Override // X.AbstractC1912160zrK
    public final void LIZLLL() {
        super.LIZLLL();
        if (this.LLJILJILJ) {
            if (this.LLJJ.getVisibility() == 0) {
                if (this.LLJJJ) {
                    C1295960jpS c1295960jpS = this.LLJJ;
                    c1295960jpS.setMinAndMaxFrame(0, this.LLJJIJIIJIL);
                    c1295960jpS.setRepeatCount(-1);
                    c1295960jpS.setRepeatMode(1);
                } else {
                    C1295960jpS c1295960jpS2 = this.LLJJ;
                    c1295960jpS2.setMinAndMaxFrame(0, this.LLJJIII);
                    c1295960jpS2.setRepeatCount(-1);
                    c1295960jpS2.setRepeatMode(1);
                }
                if (!this.LLJJ.isAnimating()) {
                    this.LLJJ.playAnimation();
                }
            }
            if (this.LLJJI.getVisibility() == 0) {
                if (this.LLJJJ) {
                    C1295960jpS c1295960jpS3 = this.LLJJI;
                    c1295960jpS3.setMinAndMaxFrame(0, this.LLJJIJIL);
                    c1295960jpS3.setRepeatCount(-1);
                    c1295960jpS3.setRepeatMode(1);
                } else {
                    C1295960jpS c1295960jpS4 = this.LLJJI;
                    c1295960jpS4.setMinAndMaxFrame(0, this.LLJJIJI);
                    c1295960jpS4.setRepeatCount(-1);
                    c1295960jpS4.setRepeatMode(1);
                }
                if (this.LLJJI.isAnimating()) {
                    return;
                }
                this.LLJJI.playAnimation();
            }
        }
    }

    @Override // X.InterfaceC1912230zrR
    public final boolean getTimeLimitState() {
        return this.LLJJJ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Lu8] */
    @Override // X.InterfaceC1912220zrQ
    public final void LIZ(C1911990zr3 c1911990zr3) {
        final InputStream inputStream = c1911990zr3.LIZ;
        final InputStream inputStream2 = c1911990zr3.LIZIZ;
        final String str = c1911990zr3.LIZJ;
        if (inputStream != null && inputStream2 != null && str != null && !TextUtils.isEmpty(str)) {
            final ?? r3 = new InterfaceC1294390jmv() { // from class: X.0Lu8
                @Override // X.InterfaceC1294390jmv
                public final Bitmap LIZ(C1294320jmo c1294320jmo) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    C844470XAv.LIZ.getClass();
                    options.inDensity = C12ES.LJII(C844470XAv.LIZ());
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(File.separator);
                        sbLIZ.append(c1294320jmo.LIZLLL);
                        return BitmapFactory.decodeFile(C2188811AlT.LIZIZ(sbLIZ), options);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }
            };
            final int i = 0;
            C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU(this, r3, inputStream, i) { // from class: X.10kq
                public final int $t;
                public Object l0;
                public Object l1;
                public Object l2;

                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<String> c09aj) {
                    switch (this.$t) {
                        case 0:
                            subscribe$0(this, c09aj);
                            break;
                        case 1:
                            subscribe$1(this, c09aj);
                            break;
                    }
                }

                public static final void subscribe$0(C19336210kq c19336210kq, C09AJ c09aj) {
                    C1C7U.LIZ("LottiePendant@e43e.loadLottieResource$bigOb$1");
                    C1295960jpS c1295960jpS = ((C1912150zrJ) c19336210kq.l0).LLJJ;
                    C557740Lu8 c557740Lu8 = (C557740Lu8) c19336210kq.l1;
                    InputStream inputStream3 = (InputStream) c19336210kq.l2;
                    c1295960jpS.setRepeatCount(-1);
                    c1295960jpS.setRepeatMode(1);
                    c1295960jpS.setImageAssetDelegate(c557740Lu8);
                    C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(inputStream3, "bigLottie");
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c1292030jj7LJ.LIZIZ(new C19335910kn(c1295960jpS, c19482611Ke, 0));
                    c1292030jj7LJ.LIZ(new C19336010ko(c19482611Ke, 0));
                    C1C7U.LIZIZ("LottiePendant@e43e.loadLottieResource$bigOb$1");
                }

                public static final void subscribe$1(C19336210kq c19336210kq, C09AJ c09aj) {
                    C1C7U.LIZ("LottiePendant@e43e.loadLottieResource$smallOb$1");
                    C1295960jpS c1295960jpS = ((C1912150zrJ) c19336210kq.l0).LLJJI;
                    C557740Lu8 c557740Lu8 = (C557740Lu8) c19336210kq.l1;
                    InputStream inputStream3 = (InputStream) c19336210kq.l2;
                    c1295960jpS.setRepeatCount(-1);
                    c1295960jpS.setRepeatMode(1);
                    c1295960jpS.setImageAssetDelegate(c557740Lu8);
                    C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(inputStream3, "smallLottie");
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c1292030jj7LJ.LIZIZ(new C19335910kn(c1295960jpS, c19482611Ke, 1));
                    c1292030jj7LJ.LIZ(new C19336010ko(c19482611Ke, 1));
                    C1C7U.LIZIZ("LottiePendant@e43e.loadLottieResource$smallOb$1");
                }

                {
                    this.$t = i;
                    this.l0 = this;
                    this.l1 = r3;
                    this.l2 = inputStream;
                }
            });
            final int i2 = 1;
            C11NZ.LJLLILLLL(c19482711KfLJIJJLI, C11NZ.LJIJJLI(new InterfaceC1478005qU(this, r3, inputStream2, i2) { // from class: X.10kq
                public final int $t;
                public Object l0;
                public Object l1;
                public Object l2;

                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<String> c09aj) {
                    switch (this.$t) {
                        case 0:
                            subscribe$0(this, c09aj);
                            break;
                        case 1:
                            subscribe$1(this, c09aj);
                            break;
                    }
                }

                public static final void subscribe$0(C19336210kq c19336210kq, C09AJ c09aj) {
                    C1C7U.LIZ("LottiePendant@e43e.loadLottieResource$bigOb$1");
                    C1295960jpS c1295960jpS = ((C1912150zrJ) c19336210kq.l0).LLJJ;
                    C557740Lu8 c557740Lu8 = (C557740Lu8) c19336210kq.l1;
                    InputStream inputStream3 = (InputStream) c19336210kq.l2;
                    c1295960jpS.setRepeatCount(-1);
                    c1295960jpS.setRepeatMode(1);
                    c1295960jpS.setImageAssetDelegate(c557740Lu8);
                    C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(inputStream3, "bigLottie");
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c1292030jj7LJ.LIZIZ(new C19335910kn(c1295960jpS, c19482611Ke, 0));
                    c1292030jj7LJ.LIZ(new C19336010ko(c19482611Ke, 0));
                    C1C7U.LIZIZ("LottiePendant@e43e.loadLottieResource$bigOb$1");
                }

                public static final void subscribe$1(C19336210kq c19336210kq, C09AJ c09aj) {
                    C1C7U.LIZ("LottiePendant@e43e.loadLottieResource$smallOb$1");
                    C1295960jpS c1295960jpS = ((C1912150zrJ) c19336210kq.l0).LLJJI;
                    C557740Lu8 c557740Lu8 = (C557740Lu8) c19336210kq.l1;
                    InputStream inputStream3 = (InputStream) c19336210kq.l2;
                    c1295960jpS.setRepeatCount(-1);
                    c1295960jpS.setRepeatMode(1);
                    c1295960jpS.setImageAssetDelegate(c557740Lu8);
                    C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(inputStream3, "smallLottie");
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c1292030jj7LJ.LIZIZ(new C19335910kn(c1295960jpS, c19482611Ke, 1));
                    c1292030jj7LJ.LIZ(new C19336010ko(c19482611Ke, 1));
                    C1C7U.LIZIZ("LottiePendant@e43e.loadLottieResource$smallOb$1");
                }

                {
                    this.$t = i2;
                    this.l0 = this;
                    this.l1 = r3;
                    this.l2 = inputStream2;
                }
            }), new InterfaceC500500Jk0() { // from class: X.0Jjr
                @Override // X.InterfaceC500500Jk0
                public final Object apply(Object obj, Object obj2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) obj);
                    sbLIZ.append((String) obj2);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            }).LIZIZ(new InterfaceC626120Oh8<String>() { // from class: X.0zrL
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    try {
                        inputStream2.close();
                        inputStream.close();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(String str2) {
                    this.LL.LLILZLL.getClass();
                    this.LL.LLJJ.playAnimation();
                    this.LL.LLJJI.playAnimation();
                    C1912150zrJ c1912150zrJ = this.LL;
                    c1912150zrJ.LLJILJILJ = true;
                    Function0<Unit> function0 = c1912150zrJ.LLILZLL.LIZLLL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    try {
                        inputStream2.close();
                        inputStream.close();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1912230zrR
    public final void setTimeLimitState(boolean z) {
        if (this.LLJJJ != z) {
            this.LLJJJ = z;
            this.LLILZLL.getClass();
            if (this.LLJILJIL && z) {
                LIZJ(null);
            }
        }
    }

    public C1912150zrJ(Context context, View view, C450750Hlx c450750Hlx, C450750Hlx c450750Hlx2, View view2, RelativeLayout relativeLayout, C1912000zr4 c1912000zr4) {
        super(context, view, c450750Hlx, c450750Hlx2, view2, relativeLayout, c1912000zr4);
        this.LLJJ = c450750Hlx;
        this.LLJJI = c450750Hlx2;
        this.LLJJIII = Integer.MAX_VALUE;
        this.LLJJIJI = Integer.MAX_VALUE;
        this.LLJJIJIIJIL = Integer.MAX_VALUE;
        this.LLJJIJIL = Integer.MAX_VALUE;
    }
}
