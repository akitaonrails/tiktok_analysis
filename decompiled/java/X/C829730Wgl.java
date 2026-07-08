package X;

import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMJSONObjectParam;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829730Wgl extends C829720Wgk {
    public final String LJFF;
    public final JSONObject LJI;
    public final JSONObject LJII;
    public final JSONObject LJIIIIZZ;
    public final JSONObject LJIIIZ;

    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final boolean removeValue(String str, int i) {
        return false;
    }

    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final boolean replaceValue(String str, int i, Object obj) {
        return false;
    }

    @Override // X.C829720Wgk
    /* JADX INFO: renamed from: LIZLLL */
    public final C829720Wgk LIZIZ() {
        return new C829730Wgl(this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ);
    }

    @Override // X.C829720Wgk, X.InterfaceC829710Wgj
    public final /* bridge */ /* synthetic */ InterfaceC829710Wgj LIZIZ() {
        return LIZIZ();
    }

    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final String[] getDictKeys() {
        String[] dictKeys = super.getDictKeys();
        JSONObject jSONObject = this.LJI;
        int i = 0;
        int length = jSONObject != null ? jSONObject.length() : 0;
        JSONObject jSONObject2 = this.LJII;
        int length2 = length + (jSONObject2 != null ? jSONObject2.length() : 0);
        JSONObject jSONObject3 = this.LJIIIIZZ;
        int length3 = length2 + (jSONObject3 != null ? jSONObject3.length() : 0);
        JSONObject jSONObject4 = this.LJIIIZ;
        String[] strArr = new String[length3 + (jSONObject4 != null ? jSONObject4.length() : 0) + dictKeys.length + 4];
        int length4 = dictKeys.length;
        int i2 = 0;
        while (i < length4) {
            strArr[i2] = dictKeys[i];
            i++;
            i2++;
        }
        int i3 = i2 + 1;
        strArr[i2] = "category";
        int i4 = i3 + 1;
        strArr[i3] = "metric";
        int i5 = i4 + 1;
        strArr[i4] = "extra";
        int i6 = i5 + 1;
        strArr[i5] = "custom_data";
        JSONObject jSONObject5 = this.LJI;
        if (jSONObject5 != null) {
            Iterator<String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                strArr[i6] = itKeys.next();
                i6++;
            }
        }
        JSONObject jSONObject6 = this.LJII;
        if (jSONObject6 != null) {
            Iterator<String> itKeys2 = jSONObject6.keys();
            while (itKeys2.hasNext()) {
                strArr[i6] = itKeys2.next();
                i6++;
            }
        }
        JSONObject jSONObject7 = this.LJIIIIZZ;
        if (jSONObject7 != null) {
            Iterator<String> itKeys3 = jSONObject7.keys();
            while (itKeys3.hasNext()) {
                strArr[i6] = itKeys3.next();
                i6++;
            }
        }
        JSONObject jSONObject8 = this.LJIIIZ;
        if (jSONObject8 != null) {
            Iterator<String> itKeys4 = jSONObject8.keys();
            while (itKeys4.hasNext()) {
                strArr[i6] = itKeys4.next();
                i6++;
            }
        }
        return strArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue() {
        return super.getStringValue();
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return super.getType();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final boolean containsKey(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1778017352:
                    if (str.equals("custom_data")) {
                        return true;
                    }
                    break;
                case -1077545552:
                    if (str.equals("metric")) {
                        return true;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        return true;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        return true;
                    }
                    break;
            }
        }
        return super.containsKey(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final double[] getAllDoubleValue(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1778017352:
                    if (str.equals("custom_data")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ = C829660Wge.LIZIZ(this.LJIIIZ);
                        if (tTMJSONObjectParamLIZIZ != null) {
                            return tTMJSONObjectParamLIZIZ.getAllDoubleValue(str);
                        }
                        return null;
                    }
                    break;
                case -1077545552:
                    if (str.equals("metric")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ2 = C829660Wge.LIZIZ(this.LJII);
                        if (tTMJSONObjectParamLIZIZ2 != null) {
                            return tTMJSONObjectParamLIZIZ2.getAllDoubleValue(str);
                        }
                        return null;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ3 = C829660Wge.LIZIZ(this.LJI);
                        if (tTMJSONObjectParamLIZIZ3 != null) {
                            return tTMJSONObjectParamLIZIZ3.getAllDoubleValue(str);
                        }
                        return null;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ4 = C829660Wge.LIZIZ(this.LJIIIIZZ);
                        if (tTMJSONObjectParamLIZIZ4 != null) {
                            return tTMJSONObjectParamLIZIZ4.getAllDoubleValue(str);
                        }
                        return null;
                    }
                    break;
            }
        }
        return super.getAllDoubleValue(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final long[] getAllIntValue(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1778017352:
                    if (str.equals("custom_data")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ = C829660Wge.LIZIZ(this.LJIIIZ);
                        if (tTMJSONObjectParamLIZIZ != null) {
                            return tTMJSONObjectParamLIZIZ.getAllIntValue(str);
                        }
                        return null;
                    }
                    break;
                case -1077545552:
                    if (str.equals("metric")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ2 = C829660Wge.LIZIZ(this.LJII);
                        if (tTMJSONObjectParamLIZIZ2 != null) {
                            return tTMJSONObjectParamLIZIZ2.getAllIntValue(str);
                        }
                        return null;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ3 = C829660Wge.LIZIZ(this.LJI);
                        if (tTMJSONObjectParamLIZIZ3 != null) {
                            return tTMJSONObjectParamLIZIZ3.getAllIntValue(str);
                        }
                        return null;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ4 = C829660Wge.LIZIZ(this.LJIIIIZZ);
                        if (tTMJSONObjectParamLIZIZ4 != null) {
                            return tTMJSONObjectParamLIZIZ4.getAllIntValue(str);
                        }
                        return null;
                    }
                    break;
            }
        }
        return super.getAllIntValue(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final String[] getAllStringValue(String str) {
        String[] allStringValue;
        String[] allStringValue2;
        String[] allStringValue3;
        String[] allStringValue4;
        if (str != null) {
            switch (str.hashCode()) {
                case -1778017352:
                    if (str.equals("custom_data")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ = C829660Wge.LIZIZ(this.LJIIIZ);
                        if (tTMJSONObjectParamLIZIZ != null && (allStringValue4 = tTMJSONObjectParamLIZIZ.getAllStringValue(str)) != null) {
                            return allStringValue4;
                        }
                        return new String[0];
                    }
                    break;
                case -1077545552:
                    if (str.equals("metric")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ2 = C829660Wge.LIZIZ(this.LJII);
                        if (tTMJSONObjectParamLIZIZ2 != null && (allStringValue3 = tTMJSONObjectParamLIZIZ2.getAllStringValue(str)) != null) {
                            return allStringValue3;
                        }
                        return new String[0];
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ3 = C829660Wge.LIZIZ(this.LJI);
                        if (tTMJSONObjectParamLIZIZ3 != null && (allStringValue2 = tTMJSONObjectParamLIZIZ3.getAllStringValue(str)) != null) {
                            return allStringValue2;
                        }
                        return new String[0];
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        TTMJSONObjectParam tTMJSONObjectParamLIZIZ4 = C829660Wge.LIZIZ(this.LJIIIIZZ);
                        if (tTMJSONObjectParamLIZIZ4 != null && (allStringValue = tTMJSONObjectParamLIZIZ4.getAllStringValue(str)) != null) {
                            return allStringValue;
                        }
                        return new String[0];
                    }
                    break;
            }
        }
        return super.getAllStringValue(str);
    }

    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        if (Intrinsics.LJFF(str, "category")) {
            return C829660Wge.LIZIZ(this.LJI);
        }
        if (Intrinsics.LJFF(str, "metric")) {
            return C829660Wge.LIZIZ(this.LJII);
        }
        if (Intrinsics.LJFF(str, "extra")) {
            return C829660Wge.LIZIZ(this.LJIIIIZZ);
        }
        if (Intrinsics.LJFF(str, "custom_data")) {
            return C829660Wge.LIZIZ(this.LJIIIZ);
        }
        return super.getObjectItem(str);
    }

    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final void removeData(String str) throws JSONException {
        super.removeData(str);
    }

    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        return super.getStringValue(str, i);
    }

    @Override // X.C829720Wgk, com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final void mergeDataAsSubData(String str, ITTMParamData iTTMParamData) throws JSONException {
        super.mergeDataAsSubData(str, iTTMParamData);
    }

    public C829730Wgl(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        super(str, null);
        this.LJFF = str;
        this.LJI = jSONObject;
        this.LJII = jSONObject2;
        this.LJIIIIZZ = jSONObject3;
        this.LJIIIZ = jSONObject4;
    }
}
