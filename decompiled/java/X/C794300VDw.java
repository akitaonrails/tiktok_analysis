package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794300VDw {
    public final ArrayList<HashMap<String, String>> LIZ = new ArrayList<>();

    public final String LIZIZ() {
        String string;
        if (this.LIZ.isEmpty()) {
            return "none";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.LIZ.size(); i++) {
                HashMap<String, String> map = this.LIZ.get(i);
                if (map.size() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str : map.keySet()) {
                        jSONObject.put(str, map.get(str));
                    }
                    jSONArray.put(jSONObject);
                }
            }
            string = jSONArray.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1698940uJQ.LIZIZ();
            string = "none";
        }
        this.LIZ.clear();
        return !TextUtils.isEmpty(string) ? string : "none";
    }

    public final void LIZJ(ByteBuffer byteBuffer) {
        int i;
        ArrayList<HashMap<String, String>> arrayList;
        byte b;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
        byte[] bArr2 = new byte[iRemaining];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iRemaining) {
            int i4 = i2 + 3;
            if (i4 < iRemaining && bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3 && ((b = bArr[i4]) == 0 || b == 1 || b == 2 || b == 3)) {
                int i5 = i3 + 1;
                bArr2[i3] = 0;
                int i6 = i5 + 1;
                bArr2[i5] = 0;
                i3 = i6 + 1;
                bArr2[i6] = bArr[i4];
                i2 = i4;
            } else {
                bArr2[i3] = bArr[i2];
                i3++;
            }
            i2++;
        }
        if (iRemaining < 10) {
            return;
        }
        if (LIZ(9, bArr2) == 0 && (arrayList = this.LIZ) != null && arrayList.size() > 0) {
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("timestamp", String.valueOf(System.currentTimeMillis()));
        int iLIZ = (LIZ(7, bArr2) << 8) + LIZ(6, bArr2);
        if (iLIZ > 65280) {
            iLIZ = 65280;
        }
        int i7 = 10;
        for (int i8 = 0; i8 < iLIZ && (i = i7 + 5) < iRemaining; i8++) {
            int iLIZ2 = (LIZ(i7 + 1, bArr2) << 8) + LIZ(i7, bArr2);
            if (iLIZ2 <= 0) {
                break;
            }
            map.put(String.valueOf((LIZ(i7 + 3, bArr2) << 8) + LIZ(i7 + 2, bArr2)), String.valueOf((LIZ(i, bArr2) << 8) + LIZ(i7 + 4, bArr2)));
            i7 = i7 + iLIZ2 + 6;
        }
        ArrayList<HashMap<String, String>> arrayList2 = this.LIZ;
        map.containsKey(String.valueOf(6));
        map.containsKey(String.valueOf(5));
        map.containsKey(String.valueOf(10));
        map.containsKey(String.valueOf(11));
        arrayList2.add(map);
    }

    public static int LIZ(int i, byte[] bArr) {
        if (bArr.length > i) {
            byte b = bArr[i];
            if (b < 0) {
                return b + 256;
            }
            return b;
        }
        return 0;
    }
}
