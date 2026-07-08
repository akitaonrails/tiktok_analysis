package X;

import android.app.Activity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.reservation.anchor.ShortDramaReserveAnchorProvider;
import com.ss.android.ugc.aweme.series.reservation.api.ReservationRegisterResponse;
import com.ss.android.ugc.aweme.series.reservation.model.ShortDramaReserveExtraModel;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580920rF4 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ ShortDramaReserveAnchorProvider LL;
    public final /* synthetic */ WeakReference<C704830Rkn> LLILLJJLI;

    public C1580920rF4(ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider, WeakReference<C704830Rkn> weakReference) {
        this.LL = shortDramaReserveAnchorProvider;
        this.LLILLJJLI = weakReference;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        final C19EG c19egLIZ;
        final Aweme aweme;
        final ShortDramaReserveExtraModel shortDramaReserveExtraModelLIZJ;
        final String str;
        String str2;
        C11NJ c11nj;
        InterfaceC1580990rFB interfaceC1580990rFB;
        InterfaceC2661011f interfaceC2661011fLIZ;
        C704830Rkn c704830Rkn;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        VideoItemParams videoItemParams2 = videoItemParams;
        final ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider = this.LL;
        WeakReference<C704830Rkn> weakReference = this.LLILLJJLI;
        if (weakReference != null && (c704830Rkn = weakReference.get()) != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null) {
            c19egLIZ = C0O0B.LIZ(c690870R8bInvoke);
        } else {
            c19egLIZ = null;
        }
        shortDramaReserveAnchorProvider.getClass();
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (shortDramaReserveExtraModelLIZJ = shortDramaReserveAnchorProvider.LIZJ(aweme)) != null) {
            InterfaceC1580990rFB.LIZ.getClass();
            if (C1580980rFA.LIZIZ == null) {
                IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
                if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) != null) {
                    interfaceC1580990rFB = (InterfaceC1580990rFB) interfaceC2661011fLIZ.create(InterfaceC1580990rFB.class);
                } else {
                    interfaceC1580990rFB = null;
                }
                C1580980rFA.LIZIZ = interfaceC1580990rFB;
            }
            InterfaceC1580990rFB interfaceC1580990rFB2 = C1580980rFA.LIZIZ;
            if (interfaceC1580990rFB2 == null) {
                if (c19egLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                    c1389890mGx.LJIIIZ(2131848597);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                final boolean zLIZIZ = shortDramaReserveAnchorProvider.LIZIZ(shortDramaReserveExtraModelLIZJ);
                boolean z = !zLIZIZ;
                if (z) {
                    str = "unregister_to_register";
                } else {
                    str = "register_to_unregister";
                }
                C2344009Gk c2344009GkLIZ = ShortDramaReserveAnchorProvider.LIZ(aweme, shortDramaReserveExtraModelLIZJ, videoItemParams2.mEventType);
                if (shortDramaReserveAnchorProvider.LIZIZ(shortDramaReserveExtraModelLIZJ)) {
                    str2 = "registered";
                } else {
                    str2 = "unregistered";
                }
                c2344009GkLIZ.LJIIIIZZ("series_register_status", str2);
                c2344009GkLIZ.LJIIIIZZ("click_method", str);
                C20684815ws.LJIILLIIL("series_anchor_click", c2344009GkLIZ.LIZ);
                shortDramaReserveAnchorProvider.LLILLL.put(Long.valueOf(shortDramaReserveExtraModelLIZJ.getCollectionId()), Boolean.valueOf(z));
                C1259670isv.LIZ(aweme, z, false);
                final String str3 = videoItemParams2.mEventType;
                final C19EG c19eg = c19egLIZ;
                InterfaceC420801kM interfaceC420801kMLJJIIZ = interfaceC1580990rFB2.LIZ(String.valueOf(shortDramaReserveExtraModelLIZJ.getCollectionId()), z ? 1 : 0, "fyp_anchor").LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0rF5
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        int i;
                        C1C7U.LIZ("ShortDramaReserveAnchorProvider@3238.handleCtaClick$disposable$1");
                        ReservationRegisterResponse reservationRegisterResponse = (ReservationRegisterResponse) obj;
                        ShortDramaReserveAnchorProvider shortDramaReserveAnchorProvider2 = shortDramaReserveAnchorProvider;
                        Aweme aweme2 = aweme;
                        ShortDramaReserveExtraModel shortDramaReserveExtraModel = shortDramaReserveExtraModelLIZJ;
                        String str4 = str3;
                        String str5 = str;
                        shortDramaReserveAnchorProvider2.getClass();
                        C2344009Gk c2344009GkLIZ2 = ShortDramaReserveAnchorProvider.LIZ(aweme2, shortDramaReserveExtraModel, str4);
                        c2344009GkLIZ2.LJIIIIZZ("click_method", str5);
                        C20684815ws.LJIILLIIL("series_register", c2344009GkLIZ2.LIZ);
                        shortDramaReserveAnchorProvider.LLILLL.put(Long.valueOf(shortDramaReserveExtraModelLIZJ.getCollectionId()), Boolean.valueOf(reservationRegisterResponse.isReserved()));
                        C1259670isv.LIZ(aweme, reservationRegisterResponse.isReserved(), true);
                        Activity activity = c19egLIZ;
                        if (activity != null) {
                            if (reservationRegisterResponse.isReserved()) {
                                i = 2131822141;
                            } else {
                                i = 2131822143;
                            }
                            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                            c1389890mGx2.LJIIIZ(i);
                            c1389890mGx2.LJIIJJI();
                        }
                        C1C7U.LIZIZ("ShortDramaReserveAnchorProvider@3238.handleCtaClick$disposable$1");
                    }
                }, new C09JN() { // from class: X.0rF6
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("ShortDramaReserveAnchorProvider@3238.handleCtaClick$disposable$2");
                        shortDramaReserveAnchorProvider.LLILLL.put(Long.valueOf(shortDramaReserveExtraModelLIZJ.getCollectionId()), Boolean.valueOf(zLIZIZ));
                        C1259670isv.LIZ(aweme, zLIZIZ, true);
                        Activity activity = c19eg;
                        if (activity != null) {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                            c1389890mGx2.LJIIIZ(2131848597);
                            c1389890mGx2.LJIIJJI();
                        }
                        C1C7U.LIZIZ("ShortDramaReserveAnchorProvider@3238.handleCtaClick$disposable$2");
                    }
                });
                if (c19egLIZ != null) {
                    synchronized (shortDramaReserveAnchorProvider.LLILZ) {
                        try {
                            c11nj = shortDramaReserveAnchorProvider.LLILZIL.get(c19egLIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (c11nj != null) {
                        c11nj.LIZ(interfaceC420801kMLJJIIZ);
                    }
                }
            }
        }
        return new C1387205bq(null);
    }
}
