package X;

import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194421AuW extends C1504590pFx {
    public final WeakReference<Activity> LIZJ;

    public static JSONObject LJII(InterfaceC2194401AuU interfaceC2194401AuU) throws JSONException {
        Object errorCode;
        Object errorMsg;
        Number statusCode;
        String statusMsg;
        Number statusCode2;
        String statusMsg2;
        Object statusCode3;
        Object statusMsg3;
        Object statusCode4;
        InterfaceC2194431AuX getFriendCloudStorageResponse;
        List<InterfaceC2194411AuV> data;
        InterfaceC2194431AuX getFriendCloudStorageResponse2;
        InterfaceC2194431AuX getFriendCloudStorageResponse3;
        InterfaceC2194441AuY getUserCloudStorageResponse;
        List<InterfaceC2194471Aub> data2;
        InterfaceC2194441AuY getUserCloudStorageResponse2;
        InterfaceC2194441AuY getUserCloudStorageResponse3;
        InterfaceC2194451AuZ removeUserCloudStorageResponse;
        InterfaceC2194451AuZ removeUserCloudStorageResponse2;
        InterfaceC2194461Aua setUserCloudStorageResponse;
        InterfaceC2194461Aua setUserCloudStorageResponse2;
        JSONObject jSONObject = new JSONObject();
        Object statusMsg4 = null;
        if (interfaceC2194401AuU != null) {
            errorCode = interfaceC2194401AuU.getErrorCode();
        } else {
            errorCode = null;
        }
        jSONObject.put("error_code", errorCode);
        if (interfaceC2194401AuU != null) {
            errorMsg = interfaceC2194401AuU.getErrorMsg();
        } else {
            errorMsg = null;
        }
        jSONObject.put("error_msg", errorMsg);
        JSONObject jSONObject2 = new JSONObject();
        if (interfaceC2194401AuU != null && (setUserCloudStorageResponse2 = interfaceC2194401AuU.getSetUserCloudStorageResponse()) != null) {
            statusCode = setUserCloudStorageResponse2.getStatusCode();
        } else {
            statusCode = null;
        }
        jSONObject2.put("statusCode", statusCode);
        if (interfaceC2194401AuU != null && (setUserCloudStorageResponse = interfaceC2194401AuU.getSetUserCloudStorageResponse()) != null) {
            statusMsg = setUserCloudStorageResponse.getStatusMsg();
        } else {
            statusMsg = null;
        }
        jSONObject2.put("statusMsg", statusMsg);
        jSONObject.put("setUserCloudStorageResponse", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        if (interfaceC2194401AuU != null && (removeUserCloudStorageResponse2 = interfaceC2194401AuU.getRemoveUserCloudStorageResponse()) != null) {
            statusCode2 = removeUserCloudStorageResponse2.getStatusCode();
        } else {
            statusCode2 = null;
        }
        jSONObject3.put("statusCode", statusCode2);
        if (interfaceC2194401AuU != null && (removeUserCloudStorageResponse = interfaceC2194401AuU.getRemoveUserCloudStorageResponse()) != null) {
            statusMsg2 = removeUserCloudStorageResponse.getStatusMsg();
        } else {
            statusMsg2 = null;
        }
        jSONObject3.put("statusMsg", statusMsg2);
        jSONObject.put("removeUserCloudStorageResponse", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        if (interfaceC2194401AuU != null && (getUserCloudStorageResponse3 = interfaceC2194401AuU.getGetUserCloudStorageResponse()) != null) {
            statusCode3 = getUserCloudStorageResponse3.getStatusCode();
        } else {
            statusCode3 = null;
        }
        jSONObject4.put("statusCode", statusCode3);
        if (interfaceC2194401AuU != null && (getUserCloudStorageResponse2 = interfaceC2194401AuU.getGetUserCloudStorageResponse()) != null) {
            statusMsg3 = getUserCloudStorageResponse2.getStatusMsg();
        } else {
            statusMsg3 = null;
        }
        jSONObject4.put("statusMsg", statusMsg3);
        JSONArray jSONArray = new JSONArray();
        if (interfaceC2194401AuU != null && (getUserCloudStorageResponse = interfaceC2194401AuU.getGetUserCloudStorageResponse()) != null && (data2 = getUserCloudStorageResponse.getData()) != null) {
            for (InterfaceC2194471Aub interfaceC2194471Aub : data2) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("key", interfaceC2194471Aub.getKey());
                jSONObject5.put("value", interfaceC2194471Aub.getValue());
                jSONArray.put(jSONObject5);
            }
        }
        jSONObject4.put("data", jSONArray);
        jSONObject.put("getUserCloudStorageResponse", jSONObject4);
        JSONObject jSONObject6 = new JSONObject();
        if (interfaceC2194401AuU != null && (getFriendCloudStorageResponse3 = interfaceC2194401AuU.getGetFriendCloudStorageResponse()) != null) {
            statusCode4 = getFriendCloudStorageResponse3.getStatusCode();
        } else {
            statusCode4 = null;
        }
        jSONObject6.put("statusCode", statusCode4);
        if (interfaceC2194401AuU != null && (getFriendCloudStorageResponse2 = interfaceC2194401AuU.getGetFriendCloudStorageResponse()) != null) {
            statusMsg4 = getFriendCloudStorageResponse2.getStatusMsg();
        }
        jSONObject6.put("statusMsg", statusMsg4);
        JSONArray jSONArray2 = new JSONArray();
        if (interfaceC2194401AuU != null && (getFriendCloudStorageResponse = interfaceC2194401AuU.getGetFriendCloudStorageResponse()) != null && (data = getFriendCloudStorageResponse.getData()) != null) {
            for (InterfaceC2194411AuV interfaceC2194411AuV : data) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("displayName", interfaceC2194411AuV.getDisplayName());
                jSONObject7.put("avatarUrl", interfaceC2194411AuV.getAvatarUrl());
                jSONObject7.put("openId", interfaceC2194411AuV.getOpenId());
                JSONArray jSONArray3 = new JSONArray();
                List<InterfaceC2194481Auc> data3 = interfaceC2194411AuV.getData();
                if (data3 != null) {
                    for (InterfaceC2194481Auc interfaceC2194481Auc : data3) {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("key", interfaceC2194481Auc.getKey());
                        jSONObject8.put("value", interfaceC2194481Auc.getValue());
                        jSONArray3.put(jSONObject8);
                    }
                }
                jSONObject7.put("data", jSONArray3);
                jSONArray2.put(jSONObject7);
            }
        }
        jSONObject6.put("data", jSONArray2);
        jSONObject.put("getFriendCloudStorageResponse", jSONObject6);
        return jSONObject;
    }

    public C2194421AuW(WeakReference<Activity> weakReference, InterfaceC1177504j7 interfaceC1177504j7) {
        super(interfaceC1177504j7);
        this.LIZJ = weakReference;
    }

    @Override // X.C1504590pFx
    public final JSONObject LIZLLL(Number number, JSONObject jSONObject) {
        super.LIZLLL(number, jSONObject);
        if (jSONObject == null) {
            return C1504590pFx.LIZ(-1, null, "params is null", new JSONObject());
        }
        Activity activity = this.LIZJ.get();
        if (activity == null) {
            return C1504590pFx.LIZ(-1, null, "activity is null", new JSONObject());
        }
        activity.runOnUiThread(new ARunnableS67S0300000_34(this, jSONObject, number, 21));
        return C1504590pFx.LIZJ(new JSONObject());
    }
}
