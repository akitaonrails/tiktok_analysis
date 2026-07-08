package Y;

import X.C0I7D;
import X.C0IJS;
import X.C0WZX;
import X.C1700410uLn;
import X.C1745530vWZ;
import X.C1C7U;
import X.C2179971ATj;
import X.C2204961BRm;
import X.C465930IOx;
import X.C703302op;
import X.C948503nH;
import X.EnumC1700470uLt;
import X.InterfaceC1700420uLo;
import android.widget.EditText;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomSuccessMsgOptExp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import defpackage.RegionCandHelper;
import defpackage.l7;
import java.util.Iterator;
import kotlin.jvm.internal.AwS62S1300000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS2S1301000_26 implements Runnable {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String str = this.s0;
        if (Intrinsics.LJFF(str, "zipcode") || Intrinsics.LJFF(this.s0, "address_detail")) {
            str = "address";
        }
        String str2 = (Intrinsics.LJFF(this.s0, "address_detail") && C703302op.LIZ(((AddressEditViewModel) this.l1).LLLLLLLLL)) ? ((AddressEditViewModel) this.l1).LLLLLLLLL : null;
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) this.l1;
        String str3 = this.s0;
        AddressEditViewModel.vR2(addressEditViewModel, str, str3, str2, new C1745530vWZ(this.i4, (EditText) this.l3, (CandHelper) this.l2, addressEditViewModel, str3), 8);
    }

    public final void LIZ$1() {
        RegionCandHelper regionCandHelper = (RegionCandHelper) this.l1;
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) this.l2;
        String string = a0.LJLIIIL(C2204961BRm.LLJILLL((EditText) this.l3, new C0WZX("Rjp5VQ00fMvSUX8kSQKBdA==", null))).toString();
        String str = this.s0;
        AwS62S1300000_26 awS62S1300000_26 = new AwS62S1300000_26(this.i4, (RegionCandHelper) this.l1, (EditText) this.l3, (AddressEditViewModel) this.l2, str, 6);
        EditText editText = regionCandHelper.LIZIZ;
        if (editText != null) {
            C948503nH.LJII(editText, new l7(string, addressEditViewModel, str, awS62S1300000_26, null));
        }
    }

    public static final void run$0(ARunnableS2S1301000_26 aRunnableS2S1301000_26) {
        C1700410uLn c1700410uLn = (C1700410uLn) aRunnableS2S1301000_26.l1;
        EnumC1700470uLt enumC1700470uLt = (EnumC1700470uLt) aRunnableS2S1301000_26.l2;
        int i = aRunnableS2S1301000_26.i4;
        Object obj = aRunnableS2S1301000_26.l3;
        String str = aRunnableS2S1301000_26.s0;
        c1700410uLn.getClass();
        C1C7U.LIZ("TTLivePlayerBase@8765.<field>$1$onEvent$1L");
        InterfaceC1700420uLo interfaceC1700420uLo = c1700410uLn.LL.LLILZ;
        if (interfaceC1700420uLo != null) {
            interfaceC1700420uLo.LJIILJJIL(enumC1700470uLt, i, obj);
        }
        if (enumC1700470uLt == EnumC1700470uLt.RENDERING_START && LiveEnterRoomSuccessMsgOptExp.INSTANCE.enableCoreMsgSentNotify()) {
            ConcurrentHashSet<String> concurrentHashSet = C465930IOx.LIZ;
            concurrentHashSet.remove(str);
            if (concurrentHashSet.isEmpty()) {
                Iterator<C0IJS> it2 = C465930IOx.LIZIZ.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().LIZ(false);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        C1C7U.LIZIZ("TTLivePlayerBase@8765.<field>$1$onEvent$1L");
    }

    public static final void run$1(ARunnableS2S1301000_26 aRunnableS2S1301000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CandHelper@42bd.requestCandShow$1");
        try {
            aRunnableS2S1301000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CandHelper@42bd.requestCandShow$1");
    }

    public static final void run$2(ARunnableS2S1301000_26 aRunnableS2S1301000_26) {
        try {
            aRunnableS2S1301000_26.LIZ$1();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ARunnableS2S1301000_26(RegionCandHelper regionCandHelper, C0I7D c0i7d, AddressEditViewModel addressEditViewModel, String str, int i) {
        this.$t = i;
        this.l1 = regionCandHelper;
        this.l2 = addressEditViewModel;
        this.l3 = c0i7d;
        this.s0 = str;
        this.i4 = 1;
    }

    public ARunnableS2S1301000_26(int i, Object obj, Object obj2, Object obj3, String str, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.l1 = obj3;
        this.l2 = obj2;
        this.l3 = obj;
        this.i4 = i;
    }
}
