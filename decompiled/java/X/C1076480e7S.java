package X;

import Y.AfS185S0100000_16;
import Y.AfS42S1200000_16;
import android.net.Uri;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0e7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076480e7S {
    public final InterfaceC1076430e7N LIZ;
    public final IAdLandPagePreloadService LIZIZ;
    public final C11NJ LIZJ = new C11NJ();
    public final C11PQ<AbstractC1076520e7W> LIZLLL = new C11PQ<>();
    public final C11PQ<AbstractC1076560e7a> LJ = new C11PQ<>();
    public boolean LJFF;
    public String LJI;
    public long LJII;
    public boolean LJIIIIZZ;

    public final void LIZIZ() {
        this.LIZJ.LIZ(this.LIZ.LIZ().LJL(C11S5.LIZ()).LJJIJIL(new AfS185S0100000_16(this, 29)).LJJLL(new AfS185S0100000_16(this, 30), new AfS185S0100000_16(this, 31)));
    }

    public final C2344009Gk LIZ(boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(z ? 1 : 0, "success");
        c2344009Gk.LJIIIIZZ("load_time", String.valueOf((System.currentTimeMillis() - this.LJII) / 1000.0f));
        String str = this.LJI;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("schema_url", str);
        Uri uri = UriProtector.parse(this.LJI);
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
            c2344009Gk.LJFF("channel", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        }
        Uri uri2 = UriProtector.parse(this.LJI);
        if (uri2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "bundle")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            c2344009Gk.LJFF("bundle", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        return c2344009Gk;
    }

    public C1076480e7S(InterfaceC1076430e7N interfaceC1076430e7N, IAdLandPagePreloadService iAdLandPagePreloadService) {
        this.LIZ = interfaceC1076430e7N;
        this.LIZIZ = iAdLandPagePreloadService;
    }

    public final void LIZJ(SparkFragment sparkFragment, String str) {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sparkFragment.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.X0("favoritePageShow", C13BV.INSTANCE);
        }
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        this.LIZIZ.G0();
        final C19488511Ml c19488511MlLJ = C1024380clQ.LJ();
        C11PQ<AbstractC1076520e7W> c11pq = this.LIZLLL;
        c11pq.getClass();
        final C19475711Hn c19475711Hn = new C19475711Hn(c11pq);
        this.LIZJ.LIZ(new C11J7<T, R>(c19488511MlLJ, c19475711Hn) { // from class: X.11PJ
            public final InterfaceC500500Jk0<? super T, ? super U, ? extends R> LLILLJJLI = new InterfaceC500500Jk0<Object, Object, Pair<Object, Object>>() { // from class: X.0Jjx
                @Override // X.InterfaceC500500Jk0
                public final Pair<Object, Object> apply(Object obj, Object obj2) {
                    return new Pair<>(obj, obj2);
                }
            };
            public final C098D<? extends U> LLILLL;

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super R> interfaceC626120Oh8) {
                C11PI c11pi = new C11PI(interfaceC626120Oh8);
                final C11PK c11pk = new C11PK(c11pi, this.LLILLJJLI);
                c11pi.onSubscribe(c11pk);
                this.LLILLL.LIZIZ((InterfaceC626120Oh8<? super Object>) new InterfaceC626120Oh8<U>(c11pk) { // from class: X.11PL
                    public final C11PK<T, U, R> LL;

                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                    }

                    {
                        this.LL = c11pk;
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                        C11PK<T, U, R> c11pk2 = this.LL;
                        C11JE.dispose(c11pk2.LLILLL);
                        c11pk2.LL.onError(th);
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(U u) {
                        this.LL.lazySet(u);
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        C11JE.setOnce(this.LL.LLILZ, interfaceC420801kM);
                    }
                });
                this.LL.LIZIZ(c11pk);
            }

            {
                this.LLILLL = c19475711Hn;
            }
        }.LJJIL(new InterfaceC19483011Ki() { // from class: X.0e7P
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                Pair pair = (Pair) obj;
                if ((pair.getFirst() instanceof C1024440clW) && (pair.getSecond() instanceof C1076510e7V)) {
                    return true;
                }
                return false;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS42S1200000_16(this, sparkFragment, str, 1), new C09JN() { // from class: X.0e7U
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("WishListManager@8a.loadUrl$3");
                C1C7U.LIZIZ("WishListManager@8a.loadUrl$3");
            }
        }));
    }
}
