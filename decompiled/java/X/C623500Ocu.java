package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ocu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem$loadPictureSourceWithCache$1", f = "SearchTop1BackgroundAssem.kt", l = {509}, m = "invokeSuspend")
public final class C623500Ocu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchTop1BackgroundAssem LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623500Ocu(SearchTop1BackgroundAssem searchTop1BackgroundAssem, Fragment fragment, InterfaceC1364105Vn<? super C623500Ocu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchTop1BackgroundAssem;
        this.LLILLL = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C623500Ocu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function0<String> function0;
        final String strInvoke;
        String absolutePath;
        C1C7U.LIZ("SearchTop1BackgroundAssem@1019.loadPictureSourceWithCache$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LLJLLIL = System.currentTimeMillis();
            C0PC5 c0pc5Lo = this.LLILLJJLI.Lo();
            if (c0pc5Lo != null && (function0 = c0pc5Lo.LL) != null && (strInvoke = function0.invoke()) != null && strInvoke.length() != 0) {
                File fileLIZLLL = C1331660kl2.LIZJ().LIZLLL(UriProtector.parse(strInvoke));
                if (fileLIZLLL != null) {
                    absolutePath = fileLIZLLL.getAbsolutePath();
                } else {
                    absolutePath = null;
                }
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath);
                if (bitmapDecodeFile != null) {
                    C623520Ocw c623520Ocw = C623520Ocw.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SearchTop1BackgroundAssem searchTop1BackgroundAssem = this.LLILLJJLI;
                    long j = jCurrentTimeMillis - searchTop1BackgroundAssem.LLJLLIL;
                    boolean zLIZ = C467860IWi.LIZ(searchTop1BackgroundAssem.getContext());
                    c623520Ocw.getClass();
                    C623520Ocw.LIZ(j, zLIZ, true);
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C591580NIe c591580NIe = new C591580NIe(this.LLILLJJLI, bitmapDecodeFile, this.LLILLL, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c591580NIe) == objLJFF) {
                        C1C7U.LIZIZ("SearchTop1BackgroundAssem@1019.loadPictureSourceWithCache$1");
                        return objLJFF;
                    }
                } else {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strInvoke);
                    c1331670kl3LJIIIZ.LJJIL(C724240Sb0.LIZ(this.LLILLJJLI));
                    c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                    final SearchTop1BackgroundAssem searchTop1BackgroundAssem2 = this.LLILLJJLI;
                    final Fragment fragment = this.LLILLL;
                    c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0Ocv
                        @Override // X.InterfaceC1331910klR
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onProgress(float f) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap != null) {
                                SearchTop1BackgroundAssem searchTop1BackgroundAssem3 = searchTop1BackgroundAssem2;
                                Fragment fragment2 = fragment;
                                String str = strInvoke;
                                if (bitmap.isRecycled()) {
                                    return;
                                }
                                C623520Ocw c623520Ocw2 = C623520Ocw.LIZ;
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - searchTop1BackgroundAssem3.LLJLLIL;
                                boolean zLIZ2 = C467860IWi.LIZ(searchTop1BackgroundAssem3.getContext());
                                c623520Ocw2.getClass();
                                C623520Ocw.LIZ(jCurrentTimeMillis2, zLIZ2, false);
                                searchTop1BackgroundAssem3.No(bitmap, fragment2);
                                Bitmap.Config config = bitmap.getConfig();
                                if (config != null) {
                                    C1331660kl2.LIZJ().LJI(bitmap.copy(config, true), UriProtector.parse(str));
                                    if (Unit.LIZ != null) {
                                        return;
                                    }
                                }
                            }
                            SearchTop1BackgroundAssem.LLJZ.getClass();
                        }
                    });
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchTop1BackgroundAssem@1019.loadPictureSourceWithCache$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchTop1BackgroundAssem@1019.loadPictureSourceWithCache$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
