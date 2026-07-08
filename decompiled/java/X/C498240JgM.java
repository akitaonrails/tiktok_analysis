package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.livesetting.other.LivePrivilegeCenterSchemaSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import qo2.w;
import tikcast.api.privilege.CentreEntranceResponse;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* JADX INFO: renamed from: X.0JgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498240JgM {
    public static final PrivilegeCenterConfig LJI() {
        C0JT6<String> c0jt6;
        String strLIZ;
        try {
            c0jt6 = InterfaceC1106030et7.q7;
            strLIZ = c0jt6.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (TextUtils.isEmpty(strLIZ)) {
            Boolean bool = (Boolean) c0jt6.LIZ();
            return new PrivilegeCenterConfig(bool != null ? bool.booleanValue() : false, null, null, 4, null);
        }
        PrivilegeCenterConfig privilegeCenterConfig = (PrivilegeCenterConfig) C19748512Ol.LIZJ.LJII(strLIZ, PrivilegeCenterConfig.class);
        return privilegeCenterConfig == null ? new PrivilegeCenterConfig(false, null, null, 4, null) : privilegeCenterConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C498250JgN r6) {
        /*
            android.view.View r2 = r6.LIZ
            r5 = 0
            if (r2 == 0) goto L20
            com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig r0 = r6.LJ
            int r1 = r6.LJI
            if (r0 == 0) goto L7e
            tikcast.api.privilege.QueryUserPrivilegesResponse$EntranceConfig r0 = r0.entranceConfig
            if (r0 == 0) goto L7e
            com.bytedance.android.live.base.model.ImageModel r0 = r0.background
            if (r0 == 0) goto L7e
            java.lang.String r0 = r0.getUri()
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L7a
            r2.setBackgroundResource(r1)
        L20:
            X.0kZq r2 = r6.LIZIZ
            r4 = 1
            if (r2 == 0) goto L3f
            com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig r0 = r6.LJ
            if (r0 == 0) goto L77
            tikcast.api.privilege.QueryUserPrivilegesResponse$EntranceConfig r0 = r0.entranceConfig
            if (r0 == 0) goto L77
            com.bytedance.android.live.base.model.ImageModel r1 = r0.background
            if (r1 == 0) goto L78
            java.lang.String r0 = r1.getUri()
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L64
            r0 = 0
            X.C500260Jjc.LJLJLJ(r2, r0)
        L3f:
            X.0kZq r3 = r6.LIZJ
            if (r3 == 0) goto L61
            com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig r0 = r6.LJ
            if (r0 == 0) goto L62
            tikcast.api.privilege.QueryUserPrivilegesResponse$EntranceConfig r0 = r0.entranceConfig
            if (r0 == 0) goto L62
            com.bytedance.android.live.base.model.ImageModel r1 = r0.img
        L4d:
            int r2 = r6.LJFF
            X.C500260Jjc.LJLJLJ(r3, r4)
            if (r1 == 0) goto L58
            java.lang.String r5 = r1.getUri()
        L58:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L80
            r3.setImageResource(r2)
        L61:
            return
        L62:
            r1 = r5
            goto L4d
        L64:
            X.C500260Jjc.LJLJLJ(r2, r4)
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.LJIIIZ(r1)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.LJIJJ = r0
            r1.LJJI(r2)
            goto L3f
        L77:
            r1 = r5
        L78:
            r0 = r5
            goto L35
        L7a:
            r2.setBackground(r5)
            goto L20
        L7e:
            r0 = r5
            goto L17
        L80:
            X.0JBN r0 = X.C1819620xS4.LIZ()
            X.0kZf r1 = r0.LJIIIZ(r1)
            r1.LJIIIZ = r2
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.LJIJJ = r0
            r1.LJJI(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C498240JgM.LIZ(X.0JgN):void");
    }

    public static final QueryUserPrivilegesResponse.EntranceConfig LIZIZ(CentreEntranceResponse centreEntranceResponse) {
        CentreEntranceResponse.Data data = centreEntranceResponse.data;
        if (data != null) {
            QueryUserPrivilegesResponse.EntranceConfig entranceConfig = new QueryUserPrivilegesResponse.EntranceConfig();
            entranceConfig.img = data.entranceIcon;
            entranceConfig.background = data.entranceIconBackground;
            entranceConfig.showRedDot = data.showRedDot;
            entranceConfig.openSchema = data.openSchema;
            return entranceConfig;
        }
        return null;
    }

    public static final void LJII(PrivilegeCenterConfig privilegeCenterConfig) {
        if (privilegeCenterConfig == null) {
            return;
        }
        try {
            InterfaceC1106030et7.q7.LIZJ(C1516000pYM.LIZJ(privilegeCenterConfig));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LIZJ(Context context, Room room, String str) {
        String value = str;
        if (TextUtils.isEmpty(value)) {
            value = LivePrivilegeCenterSchemaSetting.INSTANCE.getValue();
        }
        if (context != null) {
            return LJ(value, "personal_profile", C497740JfY.LJJI(C465640INu.LIZIZ(context)), C497740JfY.LJJI(C465640INu.LIZ(context)), room, false);
        }
        return value;
    }

    public static String LIZLLL(String str, Context context, Room room, PrivilegeCenterConfig privilegeCenterConfig, boolean z) {
        String value;
        QueryUserPrivilegesResponse.EntranceConfig entranceConfig;
        if (privilegeCenterConfig != null && (entranceConfig = privilegeCenterConfig.entranceConfig) != null) {
            value = entranceConfig.openSchema;
        } else {
            value = null;
        }
        if (TextUtils.isEmpty(value)) {
            value = LivePrivilegeCenterSchemaSetting.INSTANCE.getValue();
        } else if (value == null) {
            value = "";
        }
        if (context != null) {
            return LJ(value, str, C497740JfY.LJJI(C465640INu.LIZIZ(context)), C497740JfY.LJJI(C465640INu.LIZ(context)), room, z);
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.String r5, java.lang.String r6, com.bytedance.ies.sdk.datachannel.DataChannel r7, com.bytedance.android.livesdkapi.depend.model.live.Room r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C498240JgM.LJFF(java.lang.String, java.lang.String, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.model.live.Room, boolean):void");
    }

    public static final String LJ(String str, String str2, float f, float f2, Room room, boolean z) {
        int i;
        String strValueOf;
        String strLIZ;
        String str3;
        LiveMode streamType;
        if (f <= f2) {
            i = (int) ((f / 750) * 900);
        } else {
            i = (int) ((f2 / 750) * 900);
        }
        Uri.Builder builderBuildUpon = C500260Jjc.LJJL(UriProtector.parse(str), "height", String.valueOf(i)).buildUpon();
        if (TextUtils.equals(str2, "gift_panel")) {
            strValueOf = String.valueOf(EnumC496820Je4.REQUEST_FROM_SCENE_GIFT_PANEL.getType());
        } else {
            strValueOf = String.valueOf(EnumC496820Je4.REQUEST_FROM_SCENE_PERSONAL_CARD.getType());
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("request_from", strValueOf);
        w.LIZ.getClass();
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("enter_from_merge", w.LJIIIZ()).appendQueryParameter("enter_method", w.LJIIL());
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("live_type", strLIZ).appendQueryParameter("action_type", w.LIZLLL()).appendQueryParameter("entrance", str2);
        if (z) {
            str3 = "reddot";
        } else {
            str3 = "other";
        }
        builderAppendQueryParameter3.appendQueryParameter("source_type", str3);
        return builderBuildUpon.toString();
    }
}
