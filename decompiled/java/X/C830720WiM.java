package X;

import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830720WiM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C830720WiM(JSONObject jSONObject, String str, boolean z, boolean z2, JSONObject jSONObject2, long j, long j2, String str2) {
        super(0);
        this.LL = jSONObject;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = jSONObject2;
        this.LLILZLL = j;
        this.LLIZ = j2;
        this.LLIZLLLIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLJJJ;
        String strLJJJ2;
        String str = TTWebViewHelper.versionCode;
        if (str != null) {
            if (TTWebViewHelper.isTTWebViewInitialized) {
                TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
                if (tTWebViewHelper.getKeva().getString("last_valid_version", null) == null) {
                    tTWebViewHelper.getKeva().storeString("last_valid_version", str);
                }
            } else {
                TTWebViewHelper tTWebViewHelper2 = TTWebViewHelper.INSTANCE;
                if (tTWebViewHelper2.getKeva().getString("last_invalid_version", null) == null) {
                    tTWebViewHelper2.getKeva().storeString("last_invalid_version", str);
                }
            }
        }
        try {
            JSONObject jSONObject = this.LL;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("message", this.LLILLJJLI);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LLILLL);
            jSONObject.put("local_test", this.LLILZ);
            TTWebViewHelper tTWebViewHelper3 = TTWebViewHelper.INSTANCE;
            String string = tTWebViewHelper3.getKeva().getString("last_valid_version", null);
            if (string != null) {
                jSONObject.put("last_valid_version", string);
            }
            String string2 = tTWebViewHelper3.getKeva().getString("last_invalid_version", null);
            if (string2 != null) {
                jSONObject.put("last_invalid_version", string2);
            }
            jSONObject.put("ttwebview_assets_ready", false);
            jSONObject.put("has_tried_install_ttwebview", tTWebViewHelper3.getKeva().getInt("tried_times", -1) != -1);
            try {
                String str2 = TTWebViewHelper.versionCode;
                if (str2 != null) {
                    C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                    File filesDir = C1161970gLL.LIZIZ().LIZJ().getFilesDir();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("splitcompat/");
                    sbLIZ.append(str2);
                    sbLIZ.append("/verified-splits");
                    C0VSJ c0vsj = new C0VSJ(filesDir, C2188811AlT.LIZIZ(sbLIZ));
                    String str3 = "";
                    if (c0vsj.isDirectory()) {
                        File[] fileArrListFiles = c0vsj.listFiles();
                        if (fileArrListFiles == null || (strLJJJ2 = C13LQ.LJJJ(fileArrListFiles, ", ", null, null, null, 62)) == null) {
                            strLJJJ2 = "";
                        }
                        jSONObject.put("verified_file", strLJJJ2);
                    }
                    File filesDir2 = C1161970gLL.LIZIZ().LIZJ().getFilesDir();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("splitcompat/");
                    sbLIZ2.append(str2);
                    sbLIZ2.append("/unverified-splits");
                    C0VSJ c0vsj2 = new C0VSJ(filesDir2, C2188811AlT.LIZIZ(sbLIZ2));
                    if (c0vsj2.isDirectory()) {
                        File[] fileArrListFiles2 = c0vsj2.listFiles();
                        if (fileArrListFiles2 != null && (strLJJJ = C13LQ.LJJJ(fileArrListFiles2, ", ", null, null, null, 62)) != null) {
                            str3 = strLJJJ;
                        }
                        jSONObject.put("unverified_file", str3);
                    }
                }
                C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
                InputStream inputStreamOpen = C1161970gLL.LIZIZ().LIZJ().getAssets().open("tt_icudtl.dat");
                if (inputStreamOpen.read() != -1) {
                    jSONObject.put("ttwebview_assets_ready", true);
                }
                inputStreamOpen.close();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            jSONObject.put("is_ttwebview_remove", TTWebViewHelper.isTTWebViewRemoved);
            JSONObject jSONObject2 = this.LLILZIL;
            if (jSONObject2 != null) {
                jSONObject.put("extra", jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("cost", this.LLILZLL - this.LLIZ);
            TTWebViewHelper tTWebViewHelper4 = TTWebViewHelper.INSTANCE;
            Long coldBootEndTime = tTWebViewHelper4.getColdBootEndTime();
            if (coldBootEndTime != null) {
                long j = this.LLILZLL;
                long jLongValue = coldBootEndTime.longValue();
                jSONObject3.put("dur_cold_boot", j - jLongValue);
                Long l = TTWebViewHelper.splitCompatInstallExecuteTime;
                if (l != null) {
                    jSONObject3.put("install_dur_cold_boot", l.longValue() - jLongValue);
                }
            }
            Long initTime = tTWebViewHelper4.getInitTime();
            if (initTime != null) {
                long j2 = this.LLILZLL;
                long jLongValue2 = initTime.longValue();
                jSONObject3.put("dur_init", j2 - jLongValue2);
                Long l2 = TTWebViewHelper.splitCompatInstallExecuteTime;
                if (l2 != null) {
                    jSONObject3.put("install_dur_init", l2.longValue() - jLongValue2);
                }
            }
            Long firstFeedEndTime = tTWebViewHelper4.getFirstFeedEndTime();
            if (firstFeedEndTime != null) {
                long j3 = this.LLILZLL;
                long jLongValue3 = firstFeedEndTime.longValue();
                jSONObject3.put("dur_first_feed", j3 - jLongValue3);
                Long l3 = TTWebViewHelper.splitCompatInstallExecuteTime;
                if (l3 != null) {
                    jSONObject3.put("install_dur_first_feed", l3.longValue() - jLongValue3);
                }
            }
            Long l4 = TTWebViewHelper.splitCompatInstallTimeCost;
            if (l4 != null) {
                jSONObject3.put("split_compat_time_cost", l4.longValue());
            }
            Long l5 = TTWebViewHelper.splitCompatInstallExecuteTime;
            if (l5 != null) {
                jSONObject3.put("dur_split_compat", this.LLILZLL - l5.longValue());
            }
            C1520360pfO c1520360pfO = new C1520360pfO(this.LLIZLLLIL);
            c1520360pfO.LIZIZ = "hybridkit_default_bid";
            c1520360pfO.LIZLLL = jSONObject;
            c1520360pfO.LJ = jSONObject3;
            c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
            C1520080pew.LIZ(null, c1520360pfO.LIZ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
