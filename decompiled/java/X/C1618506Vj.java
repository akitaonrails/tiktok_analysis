package X;

import Y.ARunnableS8S1100000_2;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06Vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1618506Vj {
    public static final /* synthetic */ C1618506Vj LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C1618606Vk LIZJ;
    public static final C01GW<C1618306Vh> LIZLLL;
    public static final C01GW<C1231270i97> LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1618506Vj.class, "inst", "getInst()Lcom/ss/android/ugc/aweme/IMGroupChatApi;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZ = new C1618506Vj();
        LIZJ = new C1618606Vk(IMGroupChatApi.class);
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(132));
        LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(131));
    }

    public final IMGroupChatApi LIZ() {
        return (IMGroupChatApi) LIZJ.getValue(this, LIZIZ[0]);
    }

    public static void LIZJ(LifecycleOwner lifecycleOwner, Function1 function1) {
        C1311205Be c1311205Be = C1311205Be.LIZ;
        if (lifecycleOwner == null) {
            lifecycleOwner = ProcessLifecycleOwner.Companion.get();
        }
        C1311005Bc c1311005Bc = new C1311005Bc("com.ss.android.ugc.aweme.IMGroupChatDelegate", function1, null);
        c1311205Be.getClass();
        C1311205Be.LIZJ(lifecycleOwner, c1311005Bc, null);
    }

    public static void LIZLLL(Object obj, String str) {
        C2182901Abw.LIZ(C0PEM.LIZJ).execute(new ARunnableS8S1100000_2(obj, str, 0));
    }

    public static void LJ(Context context, Function1 function1) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null)) {
            return;
        }
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activityLIZ);
        C786410Ut5.J4(dialogC1389620mGW);
        C1618706Vl c1618706Vl = new C1618706Vl(dialogC1389620mGW);
        AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(dialogC1389620mGW, (DialogC1389620mGW) function1, (Function1<? super IMGroupChatApi, Unit>) 10);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(dialogC1389620mGW, 56);
        C1311205Be c1311205Be = C1311205Be.LIZ;
        C1311505Bh c1311505Bh = new C1311505Bh("com.ss.android.ugc.aweme.IMGroupChatDelegate", awS368S0200000_2, null);
        c1311205Be.getClass();
        C1311205Be.LIZJ(c1618706Vl, c1311505Bh, awS546S0100000_2);
    }

    public static C1231470i9R LIZIZ(C1618506Vj c1618506Vj, String str, String str2) {
        c1618506Vj.getClass();
        return new C1231470i9R(str, str2, "native");
    }
}
