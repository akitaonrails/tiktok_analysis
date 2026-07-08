package X;

import X.C2145908av;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tts.pigeon.container.BasePigeonContainer;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.components.EventCenterComponentApi;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876150YYr implements InterfaceC1769890w9r {
    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        for (C0YXO c0yxo : C0YXO.LLJILJIL.getValue()) {
            if (Intrinsics.LJFF(c0yxo.LLILLJJLI, str)) {
                if (c0yxo != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static void LIZLLL(C0YXO c0yxo, String str, String str2) {
        boolean z;
        int i;
        C2146308az.LIZ.getClass();
        String strLIZ = C2146308az.LIZIZ.LIZ(C2146308az.LIZ(C2146308az.LIZIZ(str2)));
        int i2 = 1;
        if (strLIZ != null && strLIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("client", c0yxo.LL);
        pairArr[1] = new Pair("shop_id", C2146308az.LIZIZ(str2));
        pairArr[2] = new Pair("scenario", c0yxo.LL);
        pairArr[3] = new Pair("action", str);
        pairArr[4] = new Pair("use_native_pigeon_sdk", Integer.valueOf(C296580Bjs.LIZ() ? 1 : 0));
        if (C2146308az.LIZIZ(str2).length() == 0) {
            i = 2;
        } else {
            i = 1;
        }
        pairArr[5] = new Pair("status_code", Integer.valueOf(i));
        if (!z2) {
            i2 = 2;
        }
        pairArr[6] = new Pair("is_cache", Integer.valueOf(i2));
        C1018703yb.LIZIZ("pigeon_router_interceptor", C2097608Jq.LJI(pairArr));
    }

    @Override // X.InterfaceC1769890w9r
    public final void LIZ(SparkContext sparkContext, String str, String str2) {
        LIZJ(sparkContext, str, false);
    }

    public final void LIZJ(SparkContext sparkContext, String str, boolean z) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C0YXO next;
        SparkActivity sparkActivity;
        Object c098200Yq;
        if (str != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "surl")) != null) {
            Iterator<C0YXO> it2 = C0YXO.LLJILJIL.getValue().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, next.LLILLL, false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0YXO c0yxo = next;
            if (c0yxo != null) {
                LIZLLL(c0yxo, "enter", str);
                sparkContext.LJJJLZIJ(1, "use_native_pigeon_sdk");
                c0yxo.LIZLLL(sparkContext.containerId, null);
                if (c0yxo instanceof C876100YYm) {
                    C2146308az.LIZ.getClass();
                    String strLIZ = C2146308az.LIZIZ.LIZ(C2146308az.LIZ(C2146308az.LIZIZ(str)));
                    if (strLIZ != null) {
                        C212391189t.LIZ.getClass();
                        String strLIZ2 = C212391189t.LIZ("seller_im", null);
                        if (strLIZ2 != null && strLIZ2.length() != 0) {
                            try {
                                JSONObject jSONObject = new JSONObject(strLIZ2);
                                JSONObject jSONObject2 = new JSONObject(strLIZ);
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    String next2 = itKeys.next();
                                    jSONObject.put(next2, jSONObject2.get(next2));
                                }
                                C212391189t c212391189t = C212391189t.LIZ;
                                String strJ3 = C786410Ut5.J3(jSONObject);
                                String str2 = C212391189t.LIZLLL;
                                c212391189t.getClass();
                                C212391189t.LIZIZ("seller_im", str2, strJ3);
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m1boximpl(c098200Yq);
                        } else {
                            C212391189t.LIZIZ("seller_im", C212391189t.LIZLLL, strLIZ);
                        }
                    }
                }
                if (sparkContext.LJFF(C0YXO.class) == null) {
                    sparkContext.LJJ(C0YXO.class, c0yxo);
                    InterfaceC2217701Bqy interfaceC2217701Bqy = new InterfaceC2217701Bqy() { // from class: X.0YYp
                        @Override // X.InterfaceC2217701Bqy
                        public final Context LIZJ(Context context) {
                            return context;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIILLIIL(boolean z2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJIL(Activity activity, Context context) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJI(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIII(SparkActivity sparkActivity2, boolean z2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIL(SparkActivity sparkActivity2, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIZ(SparkActivity sparkActivity2, int i, String[] strArr, int[] iArr) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJ(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJ(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJJL(SparkActivity sparkActivity2, Configuration configuration) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJLL(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJJJZI(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJI(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJJIZ(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIIJL(SparkActivity sparkActivity2, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity2) {
                            return false;
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLIIJ(SparkActivity sparkActivity2, Bundle bundle) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLJLI(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJLL(SparkActivity sparkActivity2) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void finish() {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onActivityResult(int i, int i2, Intent intent) {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void onRestoreInstanceState(Bundle bundle) {
                        }

                        @Override // X.InterfaceC1163130gND
                        public final void release() {
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIJZLJL(SparkActivity sparkActivity2) {
                            C876150YYr c876150YYr = this.LL;
                            SparkContext sparkContext2 = sparkActivity2.LL;
                            if (sparkContext2 == null) {
                                return;
                            }
                            c876150YYr.getClass();
                            C0YXO c0yxo2 = (C0YXO) sparkContext2.LJFF(C0YXO.class);
                            if (c0yxo2 != null) {
                                c0yxo2.LJFF(sparkContext2.containerId);
                                C876150YYr.LIZLLL(c0yxo2, "back", sparkContext2.LJIJI());
                            }
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIJIIJI(SparkActivity sparkActivity2) {
                            PigeonConversationDetailContainer pigeonConversationDetailContainer;
                            C876150YYr c876150YYr = this.LL;
                            SparkContext sparkContext2 = sparkActivity2.LL;
                            if (sparkContext2 == null) {
                                return;
                            }
                            c876150YYr.getClass();
                            Object objLJFF = sparkContext2.LJFF(C0YXO.class);
                            if ((objLJFF instanceof C876100YYm) && objLJFF != null && (pigeonConversationDetailContainer = (PigeonConversationDetailContainer) sparkContext2.LJFF(PigeonConversationDetailContainer.class)) != null) {
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C876140YYq(pigeonConversationDetailContainer, sparkContext2, null), 3);
                            }
                        }

                        @Override // X.InterfaceC2217701Bqy
                        public final void LJJIIZI(SparkActivity sparkActivity2, Bundle bundle) {
                            C0YXO c0yxo2;
                            String str3;
                            String strLJIJI;
                            C0YXO c0yxo3;
                            if (!C2190461Ao8.LIZIZ()) {
                                C876150YYr c876150YYr = this.LL;
                                SparkFragment sparkFragment = sparkActivity2.LLJILJIL;
                                SparkContext sparkContext2 = sparkActivity2.LL;
                                c876150YYr.getClass();
                                if (sparkFragment != null && sparkContext2 != null && (c0yxo3 = (C0YXO) sparkContext2.LJFF(C0YXO.class)) != null) {
                                    final BasePigeonContainer basePigeonContainerLIZ = C0YXD.LIZ(c0yxo3.LLILZIL, C13LE.LIZ(PigeonConversationDetailContainer.class), AFwS248S0000000_14.get$arr$(490));
                                    sparkFragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.tts.pigeon.container.PigeonContainerCoordinatorKt$bindLifecycle$1
                                        @Override // androidx.lifecycle.LifecycleEventObserver
                                        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                            int i = C2145908av.LIZ[event.ordinal()];
                                            if (i != 1) {
                                                if (i != 2) {
                                                    if (i != 3) {
                                                        if (i != 4) {
                                                            if (i == 5) {
                                                                basePigeonContainerLIZ.LJIIZILJ();
                                                                basePigeonContainerLIZ.LJJIIZI();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        basePigeonContainerLIZ.LJJIIJ();
                                                        return;
                                                    }
                                                    basePigeonContainerLIZ.LJJIJ();
                                                    return;
                                                }
                                                basePigeonContainerLIZ.LJJIIZ();
                                                return;
                                            }
                                            basePigeonContainerLIZ.LJIILJJIL();
                                        }
                                    });
                                    PigeonConversationDetailContainer pigeonConversationDetailContainer = (PigeonConversationDetailContainer) basePigeonContainerLIZ;
                                    C2146308az c2146308az = C2146308az.LIZ;
                                    String strLJIJI2 = sparkContext2.LJIJI();
                                    c2146308az.getClass();
                                    String strLIZIZ = C2146308az.LIZIZ(strLJIJI2);
                                    ((EventCenterComponentApi) pigeonConversationDetailContainer.LJJJJL(C13LE.LIZ(EventCenterComponentApi.class))).Ib2(sparkContext2.containerId, c0yxo3.LL, strLIZIZ);
                                    sparkContext2.LJJ(PigeonConversationDetailContainer.class, pigeonConversationDetailContainer);
                                    String strLIZ3 = C2146308az.LIZJ.LIZ(C2146308az.LIZ(strLIZIZ));
                                    if ((c0yxo3 instanceof C876100YYm) && strLIZ3 != null && strLIZ3.length() != 0 && c0yxo3.LLILZIL.getPigeonIMClient().isLogin()) {
                                        pigeonConversationDetailContainer.LLILLL = strLIZ3;
                                        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(514);
                                        Iterator it3 = ((CopyOnWriteArrayList) pigeonConversationDetailContainer.LL).iterator();
                                        while (it3.hasNext()) {
                                            aFwS248S0000000_14.invoke(it3.next());
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            SparkContext sparkContext3 = sparkActivity2.LL;
                            if (sparkContext3 != null && (c0yxo2 = (C0YXO) sparkContext3.LJFF(C0YXO.class)) != null) {
                                final BasePigeonContainer basePigeonContainerLIZ2 = C0YXD.LIZ(c0yxo2.LLILZIL, C13LE.LIZ(PigeonConversationDetailContainer.class), AFwS248S0000000_14.get$arr$(489));
                                sparkActivity2.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.tts.pigeon.container.PigeonContainerCoordinatorKt$bindLifecycle$1
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                        int i = C2145908av.LIZ[event.ordinal()];
                                        if (i != 1) {
                                            if (i != 2) {
                                                if (i != 3) {
                                                    if (i != 4) {
                                                        if (i == 5) {
                                                            basePigeonContainerLIZ2.LJIIZILJ();
                                                            basePigeonContainerLIZ2.LJJIIZI();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    basePigeonContainerLIZ2.LJJIIJ();
                                                    return;
                                                }
                                                basePigeonContainerLIZ2.LJJIJ();
                                                return;
                                            }
                                            basePigeonContainerLIZ2.LJJIIZ();
                                            return;
                                        }
                                        basePigeonContainerLIZ2.LJIILJJIL();
                                    }
                                });
                                PigeonConversationDetailContainer pigeonConversationDetailContainer2 = (PigeonConversationDetailContainer) basePigeonContainerLIZ2;
                                EventCenterComponentApi eventCenterComponentApi = (EventCenterComponentApi) pigeonConversationDetailContainer2.LJJJJL(C13LE.LIZ(EventCenterComponentApi.class));
                                SparkContext sparkContext4 = sparkActivity2.LL;
                                if (sparkContext4 == null || (str3 = sparkContext4.containerId) == null) {
                                    str3 = "";
                                }
                                String str4 = c0yxo2.LL;
                                C2146308az c2146308az2 = C2146308az.LIZ;
                                String strLLLLLZL = sparkActivity2.LLLLLZL();
                                c2146308az2.getClass();
                                eventCenterComponentApi.Ib2(str3, str4, C2146308az.LIZIZ(strLLLLLZL));
                                SparkContext sparkContext5 = sparkActivity2.LL;
                                if (sparkContext5 != null) {
                                    sparkContext5.LJJ(PigeonConversationDetailContainer.class, pigeonConversationDetailContainer2);
                                }
                                SparkContext sparkContext6 = sparkActivity2.LL;
                                if (sparkContext6 != null) {
                                    strLJIJI = sparkContext6.LJIJI();
                                } else {
                                    strLJIJI = null;
                                }
                                String strLIZ4 = C2146308az.LIZJ.LIZ(C2146308az.LIZ(C2146308az.LIZIZ(strLJIJI)));
                                if ((c0yxo2 instanceof C876100YYm) && strLIZ4 != null && strLIZ4.length() != 0 && c0yxo2.LLILZIL.getPigeonIMClient().isLogin()) {
                                    pigeonConversationDetailContainer2.LLILLL = strLIZ4;
                                    AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(514);
                                    Iterator it4 = ((CopyOnWriteArrayList) pigeonConversationDetailContainer2.LL).iterator();
                                    while (it4.hasNext()) {
                                        aFwS248S0000000_142.invoke(it4.next());
                                    }
                                }
                            }
                        }
                    };
                    sparkContext.LJJLIIIJJI(interfaceC2217701Bqy);
                    if (z) {
                        Object objLJFF = sparkContext.LJFF(InterfaceC1059280dfi.class);
                        if ((objLJFF instanceof SparkActivity) && (sparkActivity = (SparkActivity) objLJFF) != null) {
                            interfaceC2217701Bqy.LJJIIZI(sparkActivity, null);
                        }
                    }
                }
            }
        }
    }
}
