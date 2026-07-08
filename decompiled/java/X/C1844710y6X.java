package X;

import android.app.Activity;
import android.util.LruCache;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0y6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844710y6X extends AbstractC1801620wz2 {
    public final C1844720y6Y LLILLL = new C1844720y6Y(this);

    public static InterfaceC1801630wz3 LIZJ(InterfaceC1553650qX5 interfaceC1553650qX5) {
        InterfaceC1801630wz3 interfaceC1801630wz3 = (InterfaceC1801630wz3) C1909107dp.LIZJ(InterfaceC1801630wz3.class, null);
        interfaceC1801630wz3.setOid(interfaceC1553650qX5.getOid());
        String strLIZ = interfaceC1553650qX5.LIZ();
        String str = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        interfaceC1801630wz3.setPsrefer(strLIZ);
        String strLIZ2 = interfaceC1553650qX5.LIZ();
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        String str2 = new C1844680y6U(strLIZ2).LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        interfaceC1801630wz3.setPsreferSPM(str2);
        String strLIZ3 = interfaceC1553650qX5.LIZ();
        if (strLIZ3 == null) {
            strLIZ3 = "";
        }
        interfaceC1801630wz3.setPgrefer(strLIZ3);
        String strLIZ4 = interfaceC1553650qX5.LIZ();
        if (strLIZ4 == null) {
            strLIZ4 = "";
        }
        String str3 = new C1844680y6U(strLIZ4).LIZJ;
        if (str3 != null) {
            str = str3;
        }
        interfaceC1801630wz3.setPgreferSPM(str);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it2 = interfaceC1553650qX5.getMultirefers().iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        interfaceC1801630wz3.setMultirefers(jSONArray.toString());
        return interfaceC1801630wz3;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ViewParent parent;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C1847770yBT c1847770yBT;
        String strLJI;
        Long lValueOf;
        C1847800yBW c1847800yBW;
        C1847770yBT c1847770yBT2;
        View view;
        InterfaceC1801600wz0 interfaceC1801600wz0 = (InterfaceC1801600wz0) xBaseParamModel;
        if (((Boolean) C1844750y6b.LIZ.getValue()).booleanValue()) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
                parent = view.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) parent;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = null;
            }
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                new ITracingService() { // from class: X.0yCg
                    public final /* synthetic */ ITracingService LIZ;

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LIZ(View view2, EnumC1847910yBh enumC1847910yBh, String str, Map<String, ? extends Object> map, Boolean bool) {
                        this.LIZ.LIZ(view2, enumC1847910yBh, str, map, bool);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LIZIZ(Object obj) {
                        this.LIZ.LIZIZ(obj);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LIZJ(InterfaceC1848340yCO interfaceC1848340yCO) {
                        this.LIZ.LIZJ(interfaceC1848340yCO);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LIZLLL(Object obj, InterfaceC1848330yCN interfaceC1848330yCN) {
                        this.LIZ.LIZLLL(obj, interfaceC1848330yCN);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJ(Object obj, EnumC1847910yBh enumC1847910yBh) {
                        this.LIZ.LJ(obj, enumC1847910yBh);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJFF(Object obj) {
                        this.LIZ.LJFF(obj);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJI(Fragment fragment) {
                        this.LIZ.LJI(fragment);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJII() {
                        this.LIZ.LJII();
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIIIIZZ(View view2) {
                        this.LIZ.LJIIIIZZ(view2);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIIIZ(Object obj, String str) {
                        this.LIZ.LJIIIZ(obj, str);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIIJ(Object obj, String str) {
                        this.LIZ.LJIIJ(obj, str);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIIJJI(C1848120yC2 c1848120yC2) {
                        this.LIZ.LJIIJJI(c1848120yC2);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIIL(Object obj, EnumC1847910yBh enumC1847910yBh, String str) {
                        this.LIZ.LJIIL(obj, enumC1847910yBh, str);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIILIIL(int i, Object obj) {
                        this.LIZ.LJIILIIL(i, obj);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIILJJIL(Object obj, Map<String, ? extends Object> map) {
                        this.LIZ.LJIILJJIL(obj, map);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIILL(Object obj) {
                        this.LIZ.LJIILL(obj);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIILLIIL(Object obj, String str, EnumC1848020yBs enumC1848020yBs) {
                        this.LIZ.LJIILLIIL(obj, str, enumC1848020yBs);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final void LJIIZILJ(Activity activity) {
                        this.LIZ.LJIIZILJ(activity);
                    }

                    @Override // com.ss.android.ugc.aweme.nxet.ITracingService
                    public final InterfaceC1848550yCj LJIJ() {
                        return this.LIZ.LJIJ();
                    }

                    {
                        ITracingService iTracingService = (ITracingService) PluggableExtentionKt.pluggableSpi$default(ITracingService.class, false, false, false, 14, null);
                        if (iTracingService != null) {
                            this.LIZ = iTracingService;
                        } else {
                            "no impl for ITracingService".toString();
                            throw new IllegalStateException("no impl for ITracingService");
                        }
                    }
                }.getClass();
                if (!C1848410yCV.LIZ) {
                    C2382909Vj.LIZ(completionBlock, -10001, "NxET not start", null, 4);
                    return;
                }
                String url = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getUrl();
                if (C1846620y9c.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) != null && (c1847800yBW = C1844740y6a.LIZ) != null && (c1847770yBT2 = c1847800yBW.LIZ) != null) {
                    C13E8 c13e8 = new C13E8();
                    c13e8.addFirst(c1847770yBT2);
                    while (!c13e8.isEmpty()) {
                        c1847770yBT = (C1847770yBT) c13e8.removeLast();
                        if (Intrinsics.LJFF(c1847770yBT.LJFF(), sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
                            break;
                        }
                        if (!((ArrayList) c1847770yBT.LJI).isEmpty()) {
                            Iterator it2 = ((ArrayList) c1847770yBT.LJI).iterator();
                            while (it2.hasNext()) {
                                c13e8.addFirst(it2.next());
                            }
                        }
                    }
                    c1847770yBT = null;
                } else {
                    c1847770yBT = null;
                }
                LruCache<String, String> lruCache = C1529000ptK.LIZ;
                if (c1847770yBT == null) {
                    strLJI = "";
                } else {
                    strLJI = c1847770yBT.LJI();
                }
                String str = lruCache.get(strLJI);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handle shouldWait: ");
                sbLIZ.append(interfaceC1801600wz0.getShouldWait());
                sbLIZ.append(" curUrl: ");
                sbLIZ.append(url);
                sbLIZ.append("  exposureTime:");
                if (c1847770yBT != null) {
                    lValueOf = Long.valueOf(c1847770yBT.LJ());
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
                if (c1847770yBT != null && c1847770yBT.LJ() > 0 && Intrinsics.LJFF(str, url)) {
                    completionBlock.onSuccess(LIZJ(c1847770yBT), "");
                    return;
                } else if (!interfaceC1801600wz0.getShouldWait()) {
                    C2382909Vj.LIZ(completionBlock, -10002, "NXET_REFER_HAS_BEEN_CREATED", null, 4);
                    return;
                } else {
                    this.LLILLL.LIZ = completionBlock;
                    C1848530yCh.LJ(new AwS606S0100000_27(this, 532), sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "spark view is null", null, 4);
        }
    }
}
