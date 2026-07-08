package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.160c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207044160c implements C160K {
    public final Function1<C160U, Unit> LL;
    public Integer LLILZ;
    public boolean LLILZIL;
    public C207047160f LLILZLL;
    public boolean LLIZ;
    public VideoItemParams LLIZLLLIL;
    public C692890RFv LLJ;
    public C160B LLJI;
    public C207047160f LLJILJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(27));
    public List<String> LLILLL = new ArrayList();
    public C160U LLJIJIL = new C160U(EnumC1778990wOX.NOT_TRANSITIONING, null);

    @Override // X.C160K
    public final void EK() {
    }

    @Override // X.C160K
    public final void PU1(Context context) {
    }

    public final String LIZ() {
        Aweme aweme;
        VideoItemParams videoItemParams = this.LLIZLLLIL;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null) {
            return null;
        }
        return aweme.getAid();
    }

    public final void LIZJ() throws JSONException {
        EnumC1778990wOX enumC1778990wOX;
        C207047160f c207047160f;
        C207047160f c207047160f2;
        Aweme aweme;
        Integer num;
        if (this.LLILZ != null && !this.LLILZIL && this.LLIZ && (c207047160f = this.LLILZLL) != null && !Intrinsics.LJFF(Integer.valueOf(c207047160f.LIZ), this.LLILZ) && this.LLJI != C160B.HIDDEN && (c207047160f2 = this.LLILZLL) != null) {
            boolean z = c207047160f2.LIZLLL;
            String strLIZ = LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            int i = c207047160f2.LIZ;
            String str = c207047160f2.LIZJ;
            if (str == null) {
                str = "";
            }
            boolean zContains = ((ArrayList) this.LLILLL).contains(str);
            if (!((Boolean) C0BJ7.LIZ.getValue()).booleanValue() || (num = this.LLILZ) == null || i != num.intValue() || (z && !zContains && C123100dR.LIZ(c207047160f2.LJ))) {
                AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLILLJJLI.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CaptionLoadManager, switchCaptionLanguage, aweme: ");
                sbLIZ.append(strLIZ);
                sbLIZ.append(" targetLanguage: ");
                sbLIZ.append(str);
                sbLIZ.append(" isRealtimeTranslation: ");
                sbLIZ.append(z);
                sbLIZ.append(", isRealtimeLanAdded: ");
                sbLIZ.append(zContains);
                sbLIZ.append(", captionData.realtimeFilePath: ");
                sbLIZ.append(c207047160f2.LJ);
                abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
                if (z && !zContains && C123100dR.LIZ(c207047160f2.LJ)) {
                    String str2 = c207047160f2.LJ;
                    if (str2 == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    JSONObject jSONObject = new JSONObject();
                    VideoItemParams videoItemParams = this.LLIZLLLIL;
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null) ? null : aweme.getAid());
                    jSONObject.put("language", str);
                    jSONObject.put("url", str2);
                    jSONObject.put("sub_id", i);
                    jSONObject.put("expire", -1);
                    jSONObject.put("language_id", 1);
                    jSONObject.put("format", "webvtt");
                    jSONObject.put("source", "MU");
                    jSONObject.put("version", "");
                    jSONObject.put("is_realtime_translated", true);
                    ((ArrayList) this.LLILLL).add(str);
                    C1483410ohn.LJLJJI().LJIILL().LJJJZ(i, jSONObject);
                    ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
                    String strLIZ2 = LIZ();
                    iCLAPerfETServiceLIZ.LJIIL(strLIZ2 != null ? strLIZ2 : "", str, String.valueOf(i));
                } else {
                    C1483410ohn.LJLJJI().LJIILL().LJJLIIIJJI(i);
                    ICLAPerfETService iCLAPerfETServiceLIZ2 = C1485670olR.LIZ();
                    String strLIZ3 = LIZ();
                    iCLAPerfETServiceLIZ2.LJIIL(strLIZ3 != null ? strLIZ3 : "", str, String.valueOf(i));
                }
                this.LLJILJIL = c207047160f2;
                this.LLILZIL = true;
            }
        }
        if (this.LLILZIL) {
            C207047160f c207047160f3 = this.LLJILJIL;
            enumC1778990wOX = (c207047160f3 == null || !c207047160f3.LIZIZ) ? EnumC1778990wOX.TO_ORIGINAL : EnumC1778990wOX.TO_TRANSLATED;
        } else {
            enumC1778990wOX = EnumC1778990wOX.NOT_TRANSITIONING;
        }
        C160U c160u = new C160U(enumC1778990wOX, this.LLJILJIL);
        if (Intrinsics.LJFF(this.LLJIJIL, c160u)) {
            return;
        }
        this.LLJIJIL = c160u;
        this.LL.invoke(c160u);
    }

    public C207044160c(C160G c160g) {
        this.LL = c160g;
    }

    public static Integer LIZIZ(String str) {
        try {
            if (C703302op.LIZ(str)) {
                return Integer.valueOf(CastIntegerProtector.parseInt(new JSONObject(str).get("sub_id").toString()));
            }
            return null;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C160K
    public final void En1(VideoItemParams videoItemParams) {
        this.LLILLL.clear();
        this.LLILZ = null;
        this.LLILZIL = false;
        this.LLIZLLLIL = videoItemParams;
    }

    @Override // X.C160K
    public final void cL2(boolean z) throws JSONException {
        if (this.LLIZ == z) {
            return;
        }
        this.LLIZ = z;
        if (!z) {
            this.LLILLL = new ArrayList();
            this.LLILZ = null;
            this.LLILZIL = false;
            this.LLJILJIL = null;
            return;
        }
        C692890RFv c692890RFv = this.LLJ;
        if (c692890RFv != null) {
            Integer numLIZIZ = LIZIZ(c692890RFv.LIZIZ);
            C692890RFv c692890RFv2 = this.LLJ;
            if (c692890RFv2 == null || c692890RFv2.LIZ != 1 || numLIZIZ == null) {
                return;
            }
            this.LLILZ = numLIZIZ;
            this.LLILZIL = false;
            this.LLJILJIL = null;
            LIZJ();
            return;
        }
        LIZJ();
    }

    @Override // X.C160K
    public final void vD2(C0Q69 c0q69) throws JSONException {
        if (this.LLILZ == null) {
            this.LLILZ = c0q69.LIZLLL;
            LIZJ();
        }
    }
}
