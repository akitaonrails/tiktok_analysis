package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS151S0100000_16;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MiniCardDeeplinkModel;
import com.ss.android.ugc.aweme.feed.model.MiniCardModel;
import com.ss.android.ugc.aweme.feed.model.ad.AdCipInfo;
import com.ss.android.ugc.aweme.feed.model.ad.Policy;
import com.ss.android.ugc.aweme.feed.model.ad.PolicyContent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0chm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022120chm implements InterfaceC1017820caq {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C11PQ<InterfaceC1022150chp> LIZJ;
    public final C01GW LIZLLL;
    public final Map<Function1<AbstractC1017850cat, Unit>, InterfaceC420801kM> LJ;
    public final Map<String, EnumC1017980cb6> LJFF;
    public final Map<String, C11PQ<AbstractC1017850cat>> LJI;
    public C1017940cb2 LJII;
    public C1022140cho LJIIIIZZ;
    public String LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public String LJIIL;

    public final InterfaceC1022150chp LJIJJ() {
        return (InterfaceC1022150chp) this.LIZ.getValue();
    }

    public final boolean LJIJJLI() {
        return ((Boolean) this.LIZLLL.getValue()).booleanValue();
    }

    public final void LJIL() {
        InterfaceC1022150chp interfaceC1022150chpLJLZ = this.LIZJ.LJLZ();
        if (Intrinsics.LJFF(interfaceC1022150chpLJLZ, LJIJJ()) || interfaceC1022150chpLJLZ == null) {
            this.LIZJ.onNext((InterfaceC1022150chp) this.LIZIZ.getValue());
            Intent intent = new Intent();
            intent.setPackage("com.sec.android.app.samsungapps");
            intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.downloadservice.GalaxyStoreDownloadService");
            try {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                C1022620cia.LJ("AdCIPServiceImpl", "onlyBindOnceService : bind service");
                boolean zLJJJJ = C2204961BRm.LJJJJ(contextLIZ, intent, new ServiceConnection() { // from class: X.0dTh
                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                        C1022620cia.LJ("AdCIPServiceImpl", "onlyBindOnceService : onServiceDisconnected");
                        C1022120chm c1022120chm = this.LL;
                        c1022120chm.LIZJ.onNext(c1022120chm.LJIJJ());
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) throws Throwable {
                        IInterface iInterfaceQueryLocalInterface = null;
                        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/ss/android/ugc/aweme/api/cip/AdCIPServiceImpl$onlyBindOnceService$bindService$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4atHN1SLy2qYVbgQKlbAvaYIfun74JQ==", null)));
                        if (c0wsuLIZIZ.LIZ) {
                            return;
                        }
                        Object[] objArr = c0wsuLIZIZ.LIZJ;
                        if (objArr != null) {
                            Object obj = objArr[0];
                            Object obj2 = objArr[1];
                            if (obj2 != null) {
                                iBinder = (IBinder) obj2;
                            }
                        }
                        C1022620cia.LJ("AdCIPServiceImpl", "onlyBindOnceService : onServiceConnected");
                        if (iBinder != null && ((iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService")) == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1022150chp))) {
                            iInterfaceQueryLocalInterface = new InterfaceC1022150chp(iBinder) { // from class: X.0dTk
                                public final IBinder LL;

                                @Override // android.os.IInterface
                                public final IBinder asBinder() {
                                    return this.LL;
                                }

                                {
                                    this.LL = iBinder;
                                }

                                @Override // X.InterfaceC1022150chp
                                public final void LJJL(String str) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                                        parcelObtain.writeString(str);
                                        this.LL.transact(2, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC1022150chp
                                public final void LLD(Bundle bundle) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                                        if (bundle != null) {
                                            parcelObtain.writeInt(1);
                                            bundle.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        this.LL.transact(3, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }

                                @Override // X.InterfaceC1022150chp
                                public final void d0(Bundle bundle, C1ASW c1asw) {
                                    Parcel parcelObtain = Parcel.obtain();
                                    Parcel parcelObtain2 = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                                        if (bundle != null) {
                                            parcelObtain.writeInt(1);
                                            bundle.writeToParcel(parcelObtain, 0);
                                        } else {
                                            parcelObtain.writeInt(0);
                                        }
                                        parcelObtain.writeStrongInterface(c1asw);
                                        this.LL.transact(1, parcelObtain, parcelObtain2, 0);
                                        parcelObtain2.readException();
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        parcelObtain2.recycle();
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                }
                            };
                        }
                        this.LL.LIZJ.onNext((InterfaceC1022150chp) iInterfaceQueryLocalInterface);
                    }
                }, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4atHN1SLy2qYVbgQKlbAvaYIfun74JQ==", null));
                if (!zLJJJJ) {
                    this.LIZJ.onNext(LJIJJ());
                }
                C1022620cia.LJ("AdCIPServiceImpl", "onlyBindOnceService : bind service end " + zLJJJJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1022620cia.LIZJ("AdCIPServiceImpl", th);
                this.LIZJ.onNext(LJIJJ());
            }
        }
    }

    public C1022120chm() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZ = C452501pT.LIZ(enumC452301pR, AFwS204S0000000_16.get$arr$(564));
        this.LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS204S0000000_16.get$arr$(563));
        this.LIZJ = new C11PQ<>();
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS560S0100000_16(this, 1037));
        this.LJ = new ConcurrentHashMap();
        this.LJFF = new ConcurrentHashMap();
        this.LJI = new ConcurrentHashMap();
        this.LJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1038));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1036));
    }

    @Override // X.InterfaceC1017820caq
    public final void preloadService() {
        if (LJIJJLI()) {
            LJIL();
        }
    }

    @Override // X.InterfaceC1017820caq
    public final String LIZIZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1017820caq
    public final C1017940cb2 LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1017820caq
    public final String LJII() {
        return this.LJIIIZ;
    }

    public static Bundle LJIJ(AwemeRawAd awemeRawAd) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("packageName", awemeRawAd.getPackageName(), bundle);
        AdCipInfo cipInfo = awemeRawAd.getCipInfo();
        if (cipInfo != null && (str2 = cipInfo.linkInfo) != null) {
            C786410Ut5.LJJJI("linkInfo", str2, bundle);
        }
        AdCipInfo cipInfo2 = awemeRawAd.getCipInfo();
        if (cipInfo2 != null && (str = cipInfo2.ads) != null) {
            C786410Ut5.LJJJI("ads", str, bundle);
        }
        return bundle;
    }

    @Override // X.InterfaceC1017820caq
    public final void LIZLLL(String str) {
        this.LJIIIZ = str;
    }

    @Override // X.InterfaceC1017820caq
    public final void LJFF(AwemeRawAd awemeRawAd) {
        Bundle bundleLJIJ = LJIJ(awemeRawAd);
        String string = bundleLJIJ.getString("packageName", null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("impressionLogging : ");
        sbLIZ.append(string);
        C1022620cia.LJ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJJ(new AwS130S1100000_16(string, this, bundleLJIJ, 30));
    }

    @Override // X.InterfaceC1017820caq
    public final C1D2P LJIIIIZZ(AwemeRawAd awemeRawAd) {
        return new C1D2P(awemeRawAd);
    }

    @Override // X.InterfaceC1017820caq
    public final boolean LJIIIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getCipInfo() != null) {
            return LJIJJLI();
        }
        return false;
    }

    @Override // X.InterfaceC1017820caq
    public final void LJIILJJIL(String str) {
        this.LJIIL = str;
    }

    @Override // X.InterfaceC1017820caq
    public final void LJIILLIIL(Function1<? super AbstractC1017850cat, Unit> function1) {
        synchronized (this) {
            try {
                InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((ConcurrentHashMap) this.LJ).get(function1);
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                    ((ConcurrentHashMap) this.LJ).remove(function1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1017820caq
    public final EnumC1017980cb6 LJIIZILJ(String str) {
        EnumC1017980cb6 enumC1017980cb6 = (EnumC1017980cb6) ((ConcurrentHashMap) this.LJFF).get(str);
        if (enumC1017980cb6 == null) {
            return EnumC1017980cb6.FAILED;
        }
        return enumC1017980cb6;
    }

    public final C11PQ<AbstractC1017850cat> LJIJI(String str) {
        synchronized (this) {
            try {
                C11PQ<AbstractC1017850cat> c11pq = (C11PQ) ((ConcurrentHashMap) this.LJI).get(str);
                if (c11pq != null) {
                    return c11pq;
                }
                C11PQ<AbstractC1017850cat> c11pq2 = new C11PQ<>();
                ((ConcurrentHashMap) this.LJI).put(str, c11pq2);
                return c11pq2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJ(final Function1<? super InterfaceC1022150chp, Unit> function1) {
        if (!LJIJJLI()) {
            function1.invoke(null);
            return;
        }
        InterfaceC1022150chp interfaceC1022150chpLJLZ = this.LIZJ.LJLZ();
        if (interfaceC1022150chpLJLZ != null && !Intrinsics.LJFF(interfaceC1022150chpLJLZ, LJIJJ()) && !Intrinsics.LJFF(interfaceC1022150chpLJLZ, this.LIZIZ.getValue())) {
            function1.invoke(interfaceC1022150chpLJLZ);
            return;
        }
        C1022620cia.LJ("AdCIPServiceImpl", "requestDownloadService : bind service");
        LJIL();
        this.LIZJ.LJLJI(5L, TimeUnit.SECONDS).LJLJLJ(EnumC19496911Pr.LATEST).LJIILL(new C11NE<InterfaceC1022150chp>() { // from class: X.0chn
            @Override // X.C11M9
            public final void onComplete() {
            }

            @Override // X.C11M9
            public final void onError(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestDownloadService : get service error ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1022620cia.LIZIZ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                function1.invoke(null);
                dispose();
                C1022120chm c1022120chm = this.LLILZ;
                c1022120chm.LIZJ.onNext(c1022120chm.LJIJJ());
            }

            @Override // X.C11M9
            public final void onNext(Object obj) {
                if (Intrinsics.LJFF(obj, this.LLILZ.LJIJJ())) {
                    C1022620cia.LJ("AdCIPServiceImpl", "requestDownloadService : get service fail");
                    function1.invoke(null);
                    dispose();
                } else {
                    if (Intrinsics.LJFF(obj, this.LLILZ.LIZIZ.getValue())) {
                        return;
                    }
                    C1022620cia.LJ("AdCIPServiceImpl", "requestDownloadService : get service");
                    function1.invoke(obj);
                    dispose();
                }
            }
        });
        C1022620cia.LJ("AdCIPServiceImpl", "requestDownloadService : bind service execute");
    }

    @Override // X.InterfaceC1017820caq
    public final void LJJL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelDownload: ");
        sbLIZ.append(str);
        C1022620cia.LIZ("AdCIPServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        LJJ(new AwS67S1000000_16(str, this, 50));
    }

    @Override // X.InterfaceC1017820caq
    public final void LJ(Context context, AwemeRawAd awemeRawAd) {
        Policy policy;
        PolicyContent policyContent;
        PolicyContent policyContent2;
        C1D2P c1d2pLJIIIIZZ;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        C1022140cho c1022140cho = this.LJIIIIZZ;
        if (c1022140cho != null) {
            c1022140cho.LIZ();
        }
        C1022140cho c1022140cho2 = new C1022140cho(context, awemeRawAd);
        this.LJIIIIZZ = c1022140cho2;
        c1022140cho2.LIZ();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d4d, new FrameLayout(context), false);
        ViewGroup viewGroup = (ViewGroup) viewTd.findViewById(R.id.rew);
        ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.rex);
        TextView textView = (TextView) viewTd.findViewById(R.id.rf6);
        TextView textView2 = (TextView) viewTd.findViewById(R.id.rf7);
        LinearLayout linearLayout = (LinearLayout) viewTd.findViewById(R.id.rf4);
        LinearLayout linearLayout2 = (LinearLayout) viewTd.findViewById(R.id.rf5);
        TextView textView3 = (TextView) viewTd.findViewById(R.id.rf3);
        View viewFindViewById = viewTd.findViewById(R.id.e1g);
        View viewFindViewById2 = viewTd.findViewById(R.id.rev);
        Drawable background = viewFindViewById2.getBackground();
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(6);
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(24);
        c19659111vp.LJ = Integer.valueOf(R.attr.ox);
        viewFindViewById2.setBackground(C426750GoL.LJIILIIL(background, c19659111vp.LIZ(context)));
        C786410Ut5.I7(new ACListenerS151S0100000_16(c1022140cho2, 186), viewTd);
        C786410Ut5.I7(new ACListenerS151S0100000_16(c1022140cho2, 187), viewTd.findViewById(R.id.j41));
        AdCipInfo cipInfo = awemeRawAd.getCipInfo();
        if (cipInfo != null && (policy = cipInfo.policy) != null) {
            textView3.setText(policy.policyName);
            List<PolicyContent> list = policy.content;
            if (list != null) {
                policyContent = (PolicyContent) C13LP.LJJJLZIJ(0, list);
            } else {
                policyContent = null;
            }
            List<PolicyContent> list2 = policy.content;
            if (list2 != null) {
                policyContent2 = (PolicyContent) C13LP.LJJJLZIJ(1, list2);
            } else {
                policyContent2 = null;
            }
            if (policyContent == null) {
                C786410Ut5.LJZL(8, linearLayout);
                C786410Ut5.LJLZ(8, viewGroup);
            } else {
                C786410Ut5.LJZL(0, linearLayout);
                C786410Ut5.LJLZ(0, viewGroup);
                textView.setText(policyContent.title);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                String str = policyContent.uri;
                if (str == null) {
                    str = "";
                }
                sparkContext.LJJLIIJ(str);
                sparkContext.bizCert = new ThirdPartyBizCert(402657282);
                c1537900q7g.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new ViewGroup.LayoutParams(-1, -1));
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
                c1022140cho2.LJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
                C786410Ut5.R7(linearLayout, new ACListenerS119S0200000_16(c1022140cho2, policyContent, 41));
            }
            if (policyContent2 == null) {
                C786410Ut5.LJZL(8, linearLayout2);
                C786410Ut5.LJLZ(8, viewGroup2);
            } else {
                C786410Ut5.LJZL(0, linearLayout2);
                C786410Ut5.LJLZ(0, viewGroup2);
                textView2.setText(policyContent2.title);
                C1537900q7g c1537900q7g2 = C1541950qED.LIZJ;
                SparkContext sparkContext2 = new SparkContext();
                String str2 = policyContent2.uri;
                if (str2 == null) {
                    str2 = "";
                }
                sparkContext2.LJJLIIJ(str2);
                sparkContext2.bizCert = new ThirdPartyBizCert(402657282);
                c1537900q7g2.getClass();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2 = new C1541950qED(context, sparkContext2).LIZ(false);
                viewGroup2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2, new ViewGroup.LayoutParams(-1, -1));
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2.LJIIIIZZ();
                c1022140cho2.LJFF = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ2;
                C786410Ut5.R7(linearLayout2, new ACListenerS119S0200000_16(c1022140cho2, policyContent2, 42));
            }
            C786410Ut5.I7(new ACListenerS151S0100000_16(c1022140cho2, 188), viewFindViewById);
            DialogC1378340lyK dialogC1378340lyK = new DialogC1378340lyK(context, viewTd);
            c1022140cho2.LIZLLL = dialogC1378340lyK;
            dialogC1378340lyK.setOnDismissListener(new DialogInterfaceOnDismissListenerC1077320e8o(c1022140cho2, 2));
            final C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null)) {
                final DialogC1378340lyK dialogC1378340lyK2 = c1022140cho2.LIZLLL;
                PopupManager.LJIIZILJ(new AbstractC20659715sp<DialogC1378340lyK>(c19egLIZIZ, dialogC1378340lyK2) { // from class: X.0Ou0
                    public final DialogC1378340lyK LL;

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return 0;
                    }

                    @Override // com.bytedance.poplayer.IStandardPopupTask
                    public final Object LJII(C688120Qyw c688120Qyw) {
                        return this.LL;
                    }

                    {
                        super(new InterfaceC20660615sy(c19egLIZIZ) { // from class: X.0Otz
                            public final C19EG LL;

                            @Override // X.InterfaceC20660615sy
                            public final boolean t2() {
                                return false;
                            }

                            @Override // X.InterfaceC20658015sY
                            public final boolean Xu() {
                                return this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
                            }

                            @Override // X.InterfaceC20658015sY
                            public final C688120Qyw i2() {
                                Fragment fragment;
                                Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(this.LL);
                                if (objLJIILLIIL == null || (fragment = (Fragment) objLJIILLIIL) == null) {
                                    C19EG c19eg = this.LL;
                                    return new C688120Qyw(c19eg, c19eg, null);
                                }
                                Context context2 = fragment.getContext();
                                if (context2 != null) {
                                    return new C688120Qyw(context2, fragment, null);
                                }
                                C19EG c19eg2 = this.LL;
                                return new C688120Qyw(c19eg2, c19eg2, null);
                            }

                            @Override // X.InterfaceC20658015sY
                            public final String getSceneId() {
                                return C634060Otw.LIZ(this);
                            }

                            {
                                this.LL = c19egLIZIZ;
                            }
                        });
                        this.LL = dialogC1378340lyK2;
                    }
                }, new C1668306g5("m10n_ad_cip_policy"));
                InterfaceC1017820caq interfaceC1017820caq = (InterfaceC1017820caq) c1022140cho2.LIZJ.getValue();
                if (interfaceC1017820caq != null && (c1d2pLJIIIIZZ = interfaceC1017820caq.LJIIIIZZ(awemeRawAd)) != null) {
                    c1d2pLJIIIIZZ.LJJIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC1017820caq
    public final void LJI(n nVar, AwemeRawAd awemeRawAd) {
        String packageName;
        nVar.LJJII(Boolean.valueOf(LJIIIZ(awemeRawAd)), "support_cip_service");
        if (awemeRawAd != null && (packageName = awemeRawAd.getPackageName()) != null) {
            nVar.LJJIII(Integer.valueOf(LJIIZILJ(packageName).getValue()), "cip_init_state");
        }
    }

    @Override // X.InterfaceC1017820caq
    public final void LJIIJ(String str, Function1<? super AbstractC1017850cat, Unit> function1) {
        synchronized (this) {
            try {
                LJIILLIIL(function1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1017820caq
    public final Map<String, Object> LJIIJJI(AwemeRawAd awemeRawAd, String str) {
        int i;
        int i2;
        if (awemeRawAd != null && awemeRawAd.getCipInfo() != null) {
            if (LJIJJLI()) {
                i = 1;
            } else {
                i = 2;
            }
            if (Intrinsics.LJFF(str, "button")) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            return C2097608Jq.LJIIIIZZ(new Pair("is_support_cip", Integer.valueOf(i)), new Pair("cip_type", Integer.valueOf(i2)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x016c  */
    @Override // X.InterfaceC1017820caq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r17, com.ss.android.ugc.aweme.feed.model.Aweme r18, int r19) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1022120chm.LIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    @Override // X.InterfaceC1017820caq
    public final void LJIIL(Context context, Aweme aweme, int i) {
        AwemeRawAd awemeRawAd;
        Integer appMarket;
        MiniCardDeeplinkModel deeplink;
        String fullScreenDL = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        int iIntValue = 0;
        if (awemeRawAd != null && C1017180cZo.LJIIIIZZ(awemeRawAd) == 3) {
            MiniCardModel miniCardModel = awemeRawAd.getMiniCardModel();
            if (miniCardModel != null && (deeplink = miniCardModel.getDeeplink()) != null) {
                fullScreenDL = deeplink.getFullScreenDL();
            }
            MiniCardModel miniCardModel2 = awemeRawAd.getMiniCardModel();
            if (miniCardModel2 != null && (appMarket = miniCardModel2.getAppMarket()) != null) {
                iIntValue = appMarket.intValue();
            }
        }
        LJIILL(context, fullScreenDL, iIntValue, aweme, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1017820caq
    public final void LJIILIIL(Context context, C1009000cMc c1009000cMc, Aweme aweme) {
        String packageName;
        String str;
        AwemeRawAd awemeRawAd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle ");
        sbLIZ.append(c1009000cMc.LIZJ);
        sbLIZ.append(' ');
        sbLIZ.append(c1009000cMc.LIZLLL);
        C1022620cia.LJ("cip_jsb", C2188811AlT.LIZIZ(sbLIZ));
        String str2 = c1009000cMc.LIZJ;
        switch (str2.hashCode()) {
            case -1004527684:
                if (str2.equals("openPolicyDetailPage")) {
                    try {
                        String str3 = c1009000cMc.LIZLLL;
                        if (str3 != null) {
                            JSONObject jSONObject = new JSONObject(str3);
                            String strOptString = jSONObject.optString("url");
                            String strOptString2 = jSONObject.optString("title");
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("aweme://webview?url=");
                            sbLIZ2.append(strOptString);
                            sbLIZ2.append("&use_spark=1&title=");
                            sbLIZ2.append(strOptString2);
                            sbLIZ2.append("&hide_nav_bar=0");
                            SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ2)).open();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1022620cia.LIZJ("runCIPCatching", th);
                        return;
                    }
                }
                break;
            case -503430878:
                if (str2.equals("cancelDownload")) {
                    try {
                        String str4 = c1009000cMc.LIZLLL;
                        if (str4 != null) {
                            JSONObject jSONObject2 = new JSONObject(str4);
                            LJJL(jSONObject2.optString("packageName"));
                            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                            if (awemeRawAd2 != null) {
                                LJIIIIZZ(awemeRawAd2).LJJIIZI(Long.valueOf(jSONObject2.optLong("component_id")), jSONObject2.optString("tag"), jSONObject2.optString("component_type"), "cip_cancel");
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1022620cia.LIZJ("runCIPCatching", th2);
                        return;
                    }
                }
                break;
            case -411968866:
                if (str2.equals("downloadPackage")) {
                    try {
                        String str5 = c1009000cMc.LIZLLL;
                        if (str5 != null) {
                            JSONObject jSONObject3 = new JSONObject(str5);
                            String strOptString3 = jSONObject3.optString("packageName");
                            if (context != null) {
                                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                                if (awemeRawAd3 != null) {
                                    packageName = awemeRawAd3.getPackageName();
                                } else {
                                    packageName = null;
                                }
                                if (TextUtils.equals(strOptString3, packageName)) {
                                    if (C2162308dZ.LJFF(context, strOptString3)) {
                                        str = "cip_open";
                                    } else {
                                        str = "cip_download";
                                    }
                                    AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                                    if (awemeRawAd4 != null) {
                                        LJIIIIZZ(awemeRawAd4).LJJIIZI(Long.valueOf(jSONObject3.optLong("component_id")), jSONObject3.optString("tag"), jSONObject3.optString("component_type"), str);
                                    }
                                    if (!LIZ(context, aweme, 1001)) {
                                        LJIIL(context, aweme, 1001);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C1022620cia.LIZJ("runCIPCatching", th3);
                        return;
                    }
                }
                break;
            case 866827396:
                if (str2.equals("openPolicyDialog") && context != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    LJ(context, awemeRawAd);
                    break;
                }
                break;
        }
    }

    @Override // X.InterfaceC1017820caq
    public final void LJIILL(Context context, String str, int i, Aweme aweme, int i2) {
        AwemeRawAd awemeRawAd;
        boolean z;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        C1D2P c1d2pLJIIIIZZ;
        IFeedService iFeedServiceLIZIZ2;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL2;
        C1D2P c1d2pLJIIIIZZ2;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1029590ctp.LIZIZ().getClass();
                C1021860chM.LJJJIL(context, aweme, "", i2);
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(str));
                intent.addFlags(268435456);
                C2429209fW.LIZ().appendDataFlowId(intent, 1207964161);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4atHN1SLy2qYVbgQKlbAvaYIfun74JQ==", null));
                ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
                if (iCommerceService != null && (iFeedServiceLIZIZ2 = iCommerceService.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL2 = iFeedServiceLIZIZ2.LJIILIIL()) != null && (c1d2pLJIIIIZZ2 = interfaceC1017820caqLJIILIIL2.LJIIIIZZ(awemeRawAd)) != null) {
                    c1d2pLJIIIIZZ2.LJJIJIL(null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ICommerceService iCommerceService2 = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
                if (iCommerceService2 != null && (iFeedServiceLIZIZ = iCommerceService2.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) != null && (c1d2pLJIIIIZZ = interfaceC1017820caqLJIILIIL.LJIIIIZZ(awemeRawAd)) != null) {
                    c1d2pLJIIIIZZ.LJJIJIL(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT));
                }
                if (i == 1) {
                    try {
                        C786410Ut5.re(Toast.makeText(context, 2131824734, 0));
                        return;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1022620cia.LIZJ("runCIPCatching", th2);
                        return;
                    }
                }
                C1029590ctp.LIZIZ().getClass();
                C1021860chM.LJJJIL(context, aweme, "", i2);
            }
        }
    }
}
