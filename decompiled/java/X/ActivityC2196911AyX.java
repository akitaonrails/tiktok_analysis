package X;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class ActivityC2196911AyX extends BaseActivity implements C18RP, InterfaceC2196591Ay1 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgHELIOSZjUtLip9JSQlJ2ERKTYpBCY9ITYNKjs6Piw4MA==";
    public MinisFragment LL;
    public boolean LLILLJJLI;
    public SchemaParserData LLILLL;
    public final C2196921AyY LLILZ = new InterfaceC2196941Aya() { // from class: X.1AyY
        @Override // X.InterfaceC2196941Aya
        public final void LIZ() {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("minisCloseCallback, onMinisReadyToClose:");
            sbLIZ.append(this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZ.finish();
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1AyY] */
    public ActivityC2196911AyX() {
        new AbstractC2173821A5s() { // from class: X.0hvP
            @Override // X.AbstractC2173821A5s
            public final void LIZIZ() {
                int i = C2187451AjH.LIZ;
            }
        };
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        int i = C2187451AjH.LIZ;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i2 = C1389600mGU.LIZIZ(this) ? 0 : R.anim.jc;
        overridePendingTransition(i2, 0);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        int i = C2187451AjH.LIZ;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i = C2187451AjH.LIZ;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        super.onResume();
        int i = C2187451AjH.LIZ;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        SchemaParserData schemaParserData;
        MinisMetaResp minisMetaResp;
        Serializable serializableExtra;
        Window window;
        String str;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate， savedInstanceState:");
        sbLIZ.append(bundle);
        C2188811AlT.LIZIZ(sbLIZ);
        C2196371Axf c2196371Axf = C2195221Avo.LJIIIZ;
        if (c2196371Axf != null) {
            c2196371Axf.setActivityCreateTime(0L);
            c2196371Axf.setActivityHideTimestamp(0L);
        }
        super.onCreate(bundle);
        C2196371Axf c2196371Axf2 = null;
        String str2 = null;
        if (bundle != null) {
            this.LLILLJJLI = true;
            C2196101AxE c2196101AxE = C2196101AxE.LIZ;
            SchemaParserData schemaParserData2 = this.LLILLL;
            if (schemaParserData2 != null) {
                str = schemaParserData2.clientKey;
            } else {
                str = null;
            }
            c2196101AxE.getClass();
            C2196101AxE.LIZJ(str);
            C2194771Av5 c2194771Av5 = C2194771Av5.LIZ;
            SchemaParserData schemaParserData3 = this.LLILLL;
            if (schemaParserData3 != null) {
                str2 = schemaParserData3.clientKey;
            }
            c2194771Av5.getClass();
            C2194771Av5.LIZJ(str2);
            finish();
            return;
        }
        setContentView(R.layout.ji);
        Intent intent = getIntent();
        if (intent != null) {
            schemaParserData = (SchemaParserData) intent.getParcelableExtra("intent_key_minis_schema_data");
        } else {
            schemaParserData = null;
        }
        this.LLILLL = schemaParserData;
        if (schemaParserData != null && Intrinsics.LJFF(schemaParserData.getEnterFrom(), "fyf_promotion_direct_feed_play") && (window = getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        if (intent != null) {
            minisMetaResp = (MinisMetaResp) intent.getParcelableExtra("intent_key_minis_meta_data_from_token_link");
            serializableExtra = intent.getSerializableExtra("intent_key_minis_load_perf_data");
        } else {
            minisMetaResp = null;
            serializableExtra = null;
        }
        if (serializableExtra instanceof C2196371Axf) {
            c2196371Axf2 = (C2196371Axf) serializableExtra;
        }
        LLLLLZL(this.LLILLL, minisMetaResp, c2196371Axf2);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        SchemaParserData schemaParserData;
        MinisMetaResp minisMetaResp;
        Serializable serializableExtra;
        C2196371Axf c2196371Axf;
        String str;
        super.onNewIntent(intent);
        int i = C2187451AjH.LIZ;
        MinisFragment minisFragment = this.LL;
        if (minisFragment != null) {
            minisFragment.LLLL = true;
        }
        setIntent(intent);
        String strIS = null;
        if (intent != null) {
            schemaParserData = (SchemaParserData) intent.getParcelableExtra("intent_key_minis_schema_data");
        } else {
            schemaParserData = null;
        }
        this.LLILLL = schemaParserData;
        if (intent != null) {
            minisMetaResp = (MinisMetaResp) intent.getParcelableExtra("intent_key_minis_meta_data_from_token_link");
            serializableExtra = intent.getSerializableExtra("intent_key_minis_load_perf_data");
        } else {
            minisMetaResp = null;
            serializableExtra = null;
        }
        if (serializableExtra instanceof C2196371Axf) {
            c2196371Axf = (C2196371Axf) serializableExtra;
        } else {
            c2196371Axf = null;
        }
        SchemaParserData schemaParserData2 = this.LLILLL;
        if (schemaParserData2 != null) {
            str = schemaParserData2.clientKey;
        } else {
            str = null;
        }
        MinisFragment minisFragment2 = this.LL;
        if (minisFragment2 != null) {
            strIS = minisFragment2.iS();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentMinisClientKey:");
        sbLIZ.append(strIS);
        sbLIZ.append(", targetMinisClientKey:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C123100dR.LIZ(strIS) && strIS.equals(str)) {
            SchemaParserData schemaParserData3 = C2195221Avo.LJII;
            if (schemaParserData3 != null) {
                TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData3.tiktokMinisParams;
                if (tiktokMinisQueryParams != null) {
                    tiktokMinisQueryParams.enterFrom = "desktop_shortcut";
                }
                schemaParserData3.enterMethod = "desktop_shortcut";
            }
            MinisFragment minisFragment3 = this.LL;
            if (minisFragment3 != null) {
                SchemaParserData schemaParserData4 = this.LLILLL;
                minisFragment3.LLJJLIIIJLLLLLLLZ = minisFragment3.LLJJL;
                minisFragment3.LLJJL = schemaParserData4;
                minisFragment3.LLJL = c2196371Axf;
                minisFragment3.LLJLIL = minisMetaResp;
                minisFragment3.oS();
                return;
            }
            return;
        }
        LLLLLZL(this.LLILLL, minisMetaResp, c2196371Axf);
    }

    public final void LLLLLZL(SchemaParserData schemaParserData, MinisMetaResp minisMetaResp, C2196371Axf c2196371Axf) {
        String str;
        String str2;
        String str3;
        if (this.LL != null) {
            this.LL = null;
        }
        C2196871AyT c2196871AyT = C2196731AyF.LIZ;
        C2196731AyF c2196731AyF = C2196731AyF.LIZIZ;
        if (c2196731AyF == null) {
            synchronized (c2196871AyT) {
                try {
                    c2196731AyF = C2196731AyF.LIZIZ;
                    if (c2196731AyF == null) {
                        c2196731AyF = new C2196731AyF();
                        C2196731AyF.LIZIZ = c2196731AyF;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        MinisFragment minisFragmentLIZ = C2196731AyF.LIZ(c2196731AyF, schemaParserData, c2196371Axf, minisMetaResp, null, null, 24);
        this.LL = minisFragmentLIZ;
        if (!C20616085u.LIZJ) {
            Npth.addAttachUserData((C20615085t) C20616085u.LIZIZ.getValue(), CrashType.ALL);
            C20616085u.LIZJ = true;
        }
        Pair[] pairArr = new Pair[3];
        SchemaParserData schemaParserData2 = this.LLILLL;
        String str4 = "";
        if (schemaParserData2 == null || (str = schemaParserData2.schemaUrl) == null) {
            str = "";
        }
        pairArr[0] = new Pair("minis_schema", str);
        SchemaParserData schemaParserData3 = this.LLILLL;
        if (schemaParserData3 == null || (str2 = schemaParserData3.clientKey) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("minis_id", str2);
        C09ZS.LIZ.getClass();
        C09ZW c09zwLIZJ = C09ZS.LIZJ();
        if (c09zwLIZJ != null && (str3 = c09zwLIZJ.LIZIZ) != null) {
            str4 = str3;
        }
        pairArr[2] = new Pair("minis_ttmg_core_version", str4);
        Map<? extends String, ? extends String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        Map<String, String> map = C20616085u.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(mapLJIIIIZZ);
        minisFragmentLIZ.LLLLIILL = this.LLILLJJLI;
        minisFragmentLIZ.LLLIZZ = this.LLILZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addFragment, fragment:");
        sbLIZ.append(minisFragmentLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, minisFragmentLIZ, null);
        c19ehLJIIJ.LJII("MinisFragmentStack");
        c19ehLJIIJ.LJIIIZ();
        minisFragmentLIZ.rS();
    }
}
