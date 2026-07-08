package com.bytedance.android.live.effect.beauty.data;

import X.AbstractC399701gx;
import X.AnonymousClass0956;
import X.C089E;
import X.C0IJT;
import X.C0PEM;
import X.C0U74;
import X.C0U75;
import X.C0U7R;
import X.C0U7V;
import X.C0U7X;
import X.C0U7Y;
import X.C0U8I;
import X.C0UA1;
import X.C13BV;
import X.C1BNE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C403601ha;
import X.C474500IjA;
import X.C509001ya;
import X.C509201yc;
import X.C509401ye;
import X.C509601yg;
import X.C509801yi;
import X.C767080U7e;
import X.EnumC767070U7d;
import X.InterfaceC396201gO;
import X.InterfaceC510701yr;
import X.InterfaceC772190UQv;
import android.graphics.Bitmap;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMakeupEntrySetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveSmallItemBeautyViewModel extends BaseEffectViewModel<LiveEffect> {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public final InterfaceC510701yr LLILZ;
    public final C2252321DDq LLILZIL;
    public EnumC767070U7d LLILZLL;
    public EnumC767070U7d LLIZ;
    public JSONObject LLIZLLLIL;
    public JSONObject LLJ;
    public C767080U7e LLJI;
    public String LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public final long LLJJI;
    public AnonymousClass0956 LLJJIII;
    public String LLJJIJI;

    public final int DQ2() {
        return Math.max(this.LLJILJIL, 0);
    }

    public final boolean EQ2() {
        return this.LLILZLL == EnumC767070U7d.APPLIED;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        AnonymousClass0956 anonymousClass0956 = this.LLJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public LiveSmallItemBeautyViewModel(C0U8I c0u8i) {
        super(new InterfaceC396201gO<C0U74<LiveEffect>>() { // from class: X.0U7f
        }, c0u8i);
        this.LLILZ = c0u8i;
        this.LLILZIL = C1BNE.LIZ(new C403601ha((List) C13BV.INSTANCE, false, 6));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C509001ya(this, null), 3);
        EnumC767070U7d enumC767070U7d = EnumC767070U7d.UNKNOWN;
        this.LLILZLL = enumC767070U7d;
        this.LLIZ = enumC767070U7d;
        this.LLJIJIL = "";
        this.LLJILLL = -1L;
        this.LLJJ = -1L;
        this.LLJJI = 30000L;
        this.LLJJIJI = "";
    }

    public static List CQ2(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("content")) {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "content");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
            }
        }
        return arrayList;
    }

    public static List FQ2(List list) {
        if (!LiveMakeupEntrySetting.INSTANCE.show()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!u.LJJIIJZLJL(((C0U74) obj).LIZJ, "makeup", false)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return list;
    }

    public static void GQ2(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                C089E c089e = new C089E(fileArrListFiles);
                while (c089e.hasNext()) {
                    File file2 = (File) c089e.next();
                    if (file2.isDirectory()) {
                        GQ2(file2);
                    } else {
                        file2.delete();
                    }
                }
                file.delete();
                return;
            }
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel.AQ2(X.05Vn):java.lang.Object");
    }

    public final void JQ2(AbstractC399701gx<? extends LiveEffect> abstractC399701gx) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C509801yi(this, abstractC399701gx, null), 2);
    }

    public final void KQ2(EnumC767070U7d enumC767070U7d) {
        EnumC767070U7d enumC767070U7d2 = EnumC767070U7d.UNKNOWN;
        if (enumC767070U7d == enumC767070U7d2) {
            this.LLIZ = enumC767070U7d2;
        } else {
            this.LLIZ = this.LLILZLL;
        }
        this.LLILZLL = enumC767070U7d;
        if (enumC767070U7d == EnumC767070U7d.CANCELED) {
            C0UA1.LIZ().LJJIIZI();
        }
    }

    public final void BQ2(boolean z, boolean z2) {
        AnonymousClass0956 anonymousClass0956;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current: ");
        sbLIZ.append(this.LLILZLL.name());
        sbLIZ.append(", prev: ");
        sbLIZ.append(this.LLIZ.name());
        C20441214yg.LIZIZ("AIBeauty#enable", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (!InterfaceC772190UQv.e4.LIZIZ().booleanValue()) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C509201yc(this, null), 3);
                return;
            } else {
                KQ2(EnumC767070U7d.ANALYZING);
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C509401ye(this, null), 3);
                return;
            }
        }
        if (this.LLILZLL == EnumC767070U7d.APPLIED) {
            KQ2(EnumC767070U7d.CANCELED);
        } else {
            KQ2(this.LLIZ);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJIII;
        if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = this.LLJJIII) != null) {
            anonymousClass0956.LIZIZ(new CancellationException("Canceled"));
        }
        this.LLJJIII = null;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C509601yg(this, z2, null), 3);
    }

    public final void HQ2(DataChannel dataChannel, String str) {
        JSONObject jSONObject;
        String str2;
        C0U7R c0u7r = C0U7R.LIZ;
        String strValueOf = String.valueOf(this.LLJ);
        String strValueOf2 = String.valueOf(this.LLIZLLLIL);
        C767080U7e c767080U7e = this.LLJI;
        if (c767080U7e != null) {
            jSONObject = c767080U7e.LIZIZ;
        } else {
            jSONObject = null;
        }
        String strValueOf3 = String.valueOf(jSONObject);
        String strLIZIZ = C0U75.LIZIZ(this.LLJI);
        String str3 = this.LLJIJIL;
        int iDQ2 = DQ2();
        C767080U7e c767080U7e2 = this.LLJI;
        if (c767080U7e2 == null || (str2 = c767080U7e2.LIZLLL) == null) {
            str2 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_optimize_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LJJII(strValueOf, "color_correction_setting");
        c474500IjALIZ.LJJII(strValueOf2, "beauty_setting");
        c474500IjALIZ.LJJIIZ(strValueOf3, "ai_color_correction_setting", new AwS88S1000000_3(strValueOf3, 8));
        c474500IjALIZ.LJJIIZ(strLIZIZ, "ai_beauty_setting", new AwS88S1000000_3(strLIZIZ, 9));
        c474500IjALIZ.LJJIIZ(str2, "ai_result_key", new AwS88S1000000_3(str2, 10));
        c474500IjALIZ.LJJII(str3, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(iDQ2), "task_round");
        c474500IjALIZ.LIZ();
    }

    public final void IQ2(int i, DataChannel dataChannel, Bitmap bitmap, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (i != 1) {
            if (i != 2) {
                str2 = "exit";
            } else {
                str2 = "success";
            }
        } else {
            str2 = "fail";
        }
        String str7 = "";
        if (i == 2) {
            if (bitmap != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0U7V(this, bitmap, dataChannel, str2, str, null), 2);
                return;
            }
            C0U7R c0u7r = C0U7R.LIZ;
            String strValueOf = String.valueOf(this.LLJ);
            String strValueOf2 = String.valueOf(this.LLIZLLLIL);
            String strLIZJ = C0U75.LIZJ(this.LLJI);
            String strLIZIZ = C0U75.LIZIZ(this.LLJI);
            String strLIZ = C0U75.LIZ(this.LLJI);
            String str8 = this.LLJIJIL;
            int iDQ2 = DQ2();
            long j = this.LLJILLL;
            C767080U7e c767080U7e = this.LLJI;
            if (c767080U7e == null || (str5 = c767080U7e.LIZLLL) == null) {
                str5 = "";
            }
            if (c767080U7e != null && (str6 = c767080U7e.LJ) != null) {
                str7 = str6;
            }
            C0U7R.LJIIL(dataChannel, strValueOf, strValueOf2, strLIZJ, strLIZIZ, strLIZ, str8, iDQ2, str2, j, str5, "", str7, str);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0U7X(this, str2, null), 2);
            return;
        }
        C0U7R c0u7r2 = C0U7R.LIZ;
        String strValueOf3 = String.valueOf(this.LLJ);
        String strValueOf4 = String.valueOf(this.LLIZLLLIL);
        String strLIZJ2 = C0U75.LIZJ(this.LLJI);
        String strLIZIZ2 = C0U75.LIZIZ(this.LLJI);
        String strLIZ2 = C0U75.LIZ(this.LLJI);
        String str9 = this.LLJIJIL;
        int iDQ22 = DQ2();
        long j2 = this.LLJILLL;
        C767080U7e c767080U7e2 = this.LLJI;
        if (c767080U7e2 == null || (str3 = c767080U7e2.LIZLLL) == null) {
            str3 = "";
        }
        if (c767080U7e2 != null && (str4 = c767080U7e2.LJ) != null) {
            str7 = str4;
        }
        C0U7R.LJIIL(dataChannel, strValueOf3, strValueOf4, strLIZJ2, strLIZIZ2, strLIZ2, str9, iDQ22, str2, j2, str3, "", str7, str);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0U7Y(this, str2, null), 2);
    }
}
