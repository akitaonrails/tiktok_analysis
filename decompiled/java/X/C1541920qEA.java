package X;

import Y.ARunnableS31S0400000_23;
import Y.ARunnableS92S0200000_23;
import android.os.Looper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.common.autoservice.ISDUIAPI;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541920qEA extends AbstractC1537870q7d {
    public boolean LL;
    public boolean LLILLJJLI;
    public AbstractC1542100qES LLILLL;
    public AbstractC1542200qEc LLILZ;
    public InterfaceC1538950q9N LLILZIL;
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZLL;
    public final /* synthetic */ SparkContext LLIZ;
    public final /* synthetic */ AbstractC1537870q7d LLIZLLLIL;

    @Override // X.AbstractC1537870q7d
    public final void LJLILLLLZI() {
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLILLLLZI();
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLILLLLZI();
                Object next = abstractC1542200qEc.next();
                if (next == null || !(next instanceof AbstractC1542200qEc)) {
                    break;
                } else {
                    abstractC1542200qEc = (AbstractC1542200qEc) next;
                }
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLILLLLZI();
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJI() {
        C1530030puz.LIZIZ("SparkView", "onPreKitCreate", this.LLIZ);
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLJJI();
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLJJI();
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLJJI();
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        C1530030puz.LIZIZ("SparkView", "onDestroy", this.LLIZ);
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.onDestroy();
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.onDestroy();
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.onDestroy();
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJJJL(Map<String, ? extends Object> map) {
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZLL.LLJJI;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJJJJL(map);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1530030puz.LIZIZ("SparkView", "onDestroy", this.LLIZ);
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJJZ(interfaceC1541990qEH);
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJJZ(interfaceC1541990qEH);
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJJZ(interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
        String str;
        Object obj;
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLIIIL(interfaceC1541990qEH);
        }
        boolean z = interfaceC1541990qEH instanceof C1537710q7N;
        if (z && this.LLILLJJLI) {
            this.LLILLJJLI = false;
            return;
        }
        C587540N2q.LIZ.getClass();
        ISDUIAPI isduiapi = (ISDUIAPI) C587540N2q.LIZ(ISDUIAPI.class);
        if (isduiapi != null && isduiapi.isSDUIView(interfaceC1541990qEH) && this.LLILLJJLI) {
            this.LLILLJJLI = false;
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        EnumC1538460q8a enumC1538460q8a = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLILLLLZIIL;
        if (enumC1538460q8a == EnumC1538460q8a.LOADING || enumC1538460q8a == EnumC1538460q8a.INIT) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLILLLLZIIL = EnumC1538460q8a.SUCCESS;
            if (!this.LL) {
                str = "success";
            } else {
                str = "failure";
            }
            this.LLIZ.LJIJI();
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIZ(str, null);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILZLL;
        long j = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LLJZ;
        if (j != -1) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJJJI(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, Long.valueOf(j), null, 2);
            this.LLILZLL.LIZ("hybridViewCacheUsed", null);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLILZLL;
            JSONObject jSONObject = new JSONObject();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this.LLILZLL;
            String str2 = "1";
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getOptimization() == 2) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("isPreload", obj);
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.getOptimization() != 4) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("isReUse", str2);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LIZ("sparkViewMounted", jSONObject);
        }
        C1530030puz.LIZIZ("SparkView", "onLoadFinish", this.LLIZ);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this.LLILZLL;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LJJIJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.getHybridKitType());
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6 = this.LLILZLL;
            HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6, new ARunnableS31S0400000_23(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB6, this.LLIZ, this, interfaceC1541990qEH, 0));
        } else {
            this.LLILZLL.LJJJI(this.LLIZ, this.LL, z);
        }
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIIL(interfaceC1541990qEH);
        }
        InterfaceC1538950q9N interfaceC1538950q9N = this.LLILZIL;
        if (interfaceC1538950q9N != null) {
            interfaceC1538950q9N.LJJIZ();
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLIIIL(interfaceC1541990qEH);
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        this.LLILZLL.forceDowngradeWebView = false;
        this.LL = false;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1530030puz.LIZIZ("SparkView", "onPostKitCreated", this.LLIZ);
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLJI(interfaceC1541990qEH);
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLJI(interfaceC1541990qEH);
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLJI(interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLJJLL(enumC1067640dtC);
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLJJLL(enumC1067640dtC);
                Object next = abstractC1542200qEc.next();
                if (next == null || !(next instanceof AbstractC1542200qEc)) {
                    break;
                } else {
                    abstractC1542200qEc = (AbstractC1542200qEc) next;
                }
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLJJLL(enumC1067640dtC);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) throws Throwable {
        this.LLILZLL.LLJILLL = (AbstractC1542100qES) this.LLIZ.LJFF(AbstractC1542100qES.class);
        this.LLILZLL.LLJJ = (InterfaceC1538950q9N) this.LLIZ.LJFF(InterfaceC1538950q9N.class);
        this.LLILZLL.LLJJI = (AbstractC1542200qEc) this.LLIZ.LJFF(AbstractC1542200qEc.class);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJILLL;
        this.LLILZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJI;
        this.LLILZIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJ;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIII = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getStatusViewProvider();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILZLL;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LLJJIJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getLoadingProvider();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadStart url:");
        sbLIZ.append(str);
        C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ), this.LLIZ);
        this.LL = false;
        this.LLILLJJLI = false;
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLIIL(interfaceC1541990qEH, str);
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLIIL(interfaceC1541990qEH, str);
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLILZLL;
            HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3, new ARunnableS92S0200000_23(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3, this.LLIZ, str, 12));
        } else {
            this.LLILZLL.LJJJIL(this.LLIZ);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLIIL(interfaceC1541990qEH, str);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final C1036960d5i LJLIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1036960d5i c1036960d5iLJLIL;
        AbstractC1542100qES abstractC1542100qES = this.LLILLL;
        if (abstractC1542100qES != null && (c1036960d5iLJLIL = abstractC1542100qES.LJLIL(interfaceC1541990qEH, str)) != null) {
            return c1036960d5iLJLIL;
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZ;
        if (abstractC1542200qEc != null) {
            do {
                C1036960d5i c1036960d5iLJLIL2 = abstractC1542200qEc.LJLIL(interfaceC1541990qEH, str);
                if (c1036960d5iLJLIL2 != null) {
                    return c1036960d5iLJLIL2;
                }
                Object next = abstractC1542200qEc.next();
                if (next == null || !(next instanceof AbstractC1542200qEc)) {
                    break;
                }
                abstractC1542200qEc = (AbstractC1542200qEc) next;
            } while (abstractC1542200qEc != null);
        }
        return null;
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJL(String str, byte[] bArr) {
        AbstractC1542100qES abstractC1542100qES = this.LLILZLL.LLJILLL;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLJJL(str, bArr);
        }
        AbstractC1542200qEc abstractC1542200qEc = this.LLILZLL.LLJJI;
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLJJL(str, bArr);
                Object next = abstractC1542200qEc.next();
                if (next == null || !(next instanceof AbstractC1542200qEc)) {
                    break;
                } else {
                    abstractC1542200qEc = (AbstractC1542200qEc) next;
                }
            } while (abstractC1542200qEc != null);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLIZLLLIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLJJL(str, bArr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541920qEA(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SparkContext sparkContext, AbstractC1537870q7d abstractC1537870q7d) {
        super((Object) null);
        this.LLILZLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LLIZ = sparkContext;
        this.LLIZLLLIL = abstractC1537870q7d;
        this.LLILLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJILLL;
        this.LLILZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJI;
        this.LLILZIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
    @Override // X.AbstractC1537870q7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL(X.InterfaceC1541990qEH r11, java.lang.String r12, X.C1542120qEU r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541920qEA.LJL(X.0qEH, java.lang.String, X.0qEU):void");
    }
}
