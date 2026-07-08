package X;

import android.telephony.TelephonyManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0skE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638680skE extends AbstractC1396270mRF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C01GW LLIZ;
    public int LLIZLLLIL;
    public C443120HZe<String, String, String> LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1638680skE.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1638680skE.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1638680skE.class, "coroutineScope", "getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.AbstractC1396270mRF
    public final long LIZ() {
        return 12L;
    }

    public final C19EG LIZLLL() {
        return (C19EG) this.LLILZ.getValue(this, LLJIJIL[0]);
    }

    public final C1624790sNp LJ() {
        return (C1624790sNp) this.LLILZIL.getValue(this, LLJIJIL[1]);
    }

    public final ShortVideoContext LJFF() {
        Scene scene = (Scene) this.LL.LJIIL(null, AbstractC214814194y.class);
        return ((ShortVideoContextViewModel) (scene != null ? C1659630tI1.LJIIIIZZ(scene, null, null, 6) : ViewModelProviders.of(LIZLLL())).get(ShortVideoContextViewModel.class)).LL;
    }

    public C1638680skE(C1DRG c1drg) {
        super(c1drg);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C1624790sNp.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC497601wk.class, null);
        this.LLIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(376));
        this.LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 753));
    }

    public final void LJI(File file, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filepath", file.getPath());
        jSONObject.put("username", str);
        C1624790sNp c1624790sNpLJ = LJ();
        ((C1624800sNq) c1624790sNpLJ.LJIIIZ.getValue()).LIZ(16385, 11L, 0L, C786410Ut5.J3(jSONObject));
    }

    @Override // X.AbstractC1396270mRF
    public final void LIZIZ(int i, long j, String str) throws JSONException {
        String strLJIIJ;
        String[] strArr;
        boolean z;
        C443120HZe<String, String, String> c443120HZe;
        JSONObject jSONObjectLJIIIZ;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        JSONArray jSONArrayOptJSONArray3;
        String str2 = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(LIZLLL(), "phone");
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            strLJIIJ = C1300840jxK.LJIIJ(telephonyManager);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIIJ = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("my mcc code: ");
        sbLIZ.append(strLJIIJ);
        C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ));
        Effect effect = LJ().LJIIIIZZ;
        if (effect == null) {
            effect = null;
        }
        try {
            C1446130njf.LIZ.getClass();
            JSONObject jSONObjectLJIIIZ2 = C1446130njf.LJIIIZ(effect);
            if (jSONObjectLJIIIZ2 != null && (jSONArrayOptJSONArray3 = jSONObjectLJIIIZ2.optJSONArray("operator")) != null) {
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArrayOptJSONArray3.length());
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
                C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                while (it2.LLILLL) {
                    arrayList.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray3, it2.nextInt()));
                }
                Object[] array = arrayList.toArray(new String[0]);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("effect mcc codes: ");
                sbLIZ2.append(Arrays.toString((String[]) array));
                C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ2));
                strArr = (String[]) array;
            } else {
                strArr = new String[0];
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C201955140j.LJI("SharedAR", e2);
            strArr = new String[0];
        }
        EnumC804620VhM enumC804620VhME3 = C786410Ut5.e3(LIZLLL());
        if (enumC804620VhME3 == null) {
            z = false;
        } else {
            switch (C804540VhE.LIZ[enumC804620VhME3.ordinal()]) {
                case 1:
                case 2:
                    z = false;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    z = true;
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        Effect effect2 = LJ().LJIIIIZZ;
        if (effect2 == null) {
            effect2 = null;
        }
        try {
            C1446130njf.LIZ.getClass();
            jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect2);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C201955140j.LJI("SharedAR", e3);
        }
        if (jSONObjectLJIIIZ != null && (jSONArrayOptJSONArray = jSONObjectLJIIIZ.optJSONArray("operator_info")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("code")) != null) {
                    C804550VhF.LIZ = "";
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (Intrinsics.LJFF(jSONArrayOptJSONArray2.optString(i3), strLJIIJ)) {
                            C804550VhF.LIZ = jSONObjectOptJSONObject.optString("name");
                            if (jSONObjectOptJSONObject.optInt("requires_5g") == 1) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(C804550VhF.LIZ);
                                sbLIZ3.append("5G");
                                C804550VhF.LIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            }
                            String strOptString = jSONObjectOptJSONObject.optString("title");
                            if (strOptString == null) {
                                strOptString = "";
                            }
                            String strOptString2 = jSONObjectOptJSONObject.optString("desc");
                            if (strOptString2 == null) {
                                strOptString2 = "";
                            }
                            String strOptString3 = jSONObjectOptJSONObject.optString("icon");
                            if (strOptString3 != null) {
                                str2 = strOptString3;
                            }
                            jSONObjectOptJSONObject.optString("caption");
                            c443120HZe = new C443120HZe<>(strOptString, strOptString2, str2);
                        }
                        c443120HZe = null;
                    }
                }
            }
            c443120HZe = null;
        } else {
            c443120HZe = null;
        }
        this.LLJ = c443120HZe;
        if (z && strArr != null && strArr.length != 0 && C13LQ.LJIILLIIL(strLJIIJ, strArr)) {
            this.LLIZLLLIL = 1;
        }
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("username", currentUser.getUniqueId());
        jSONObject.put("uid", currentUser.getUid());
        jSONObject.put("is_special", this.LLIZLLLIL);
        jSONObject.put("type", C786410Ut5.b3(LIZLLL()));
        ((C1624800sNq) LJ().LJIIIZ.getValue()).LIZ(16385, 4L, 0L, C786410Ut5.J3(jSONObject));
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLILZLL.getValue(this, LLJIJIL[2]), null, null, new C09JR(this, null), 3);
        C443120HZe<String, String, String> c443120HZe2 = this.LLJ;
        if (c443120HZe2 != null && this.LLIZLLLIL != 0) {
            LIZJ(new AwS426S0200000_25(this, (C1638680skE) c443120HZe2, (C443120HZe<String, String, String>) 111));
        }
    }
}
