package X;

import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004770cFn {
    public static final C1004770cFn LIZ = new C1004770cFn();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C1004770cFn c1004770cFn, String str, String str2, String str3, String str4) {
        c1004770cFn.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("request_trigger", str);
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("content_type", "video");
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            C065R.LIZ().queryPackage("quick_share_button", new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.internalshare.impl.analytics.QuickShareAnalytics$getPitayaPackageVersion$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
                @Override // com.bytedance.pitaya.api.PTYPackageCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onResult(boolean r3, com.bytedance.pitaya.api.bean.PTYError r4, com.bytedance.pitaya.api.bean.PTYPackageInfo r5) {
                    /*
                        r2 = this;
                        if (r3 == 0) goto L10
                        X.00zU<java.lang.String> r1 = r1
                        if (r5 == 0) goto Lc
                        java.lang.String r0 = r5.getVersion()
                        if (r0 != 0) goto Le
                    Lc:
                        java.lang.String r0 = ""
                    Le:
                        r1.element = r0
                    L10:
                        java.util.concurrent.CountDownLatch r0 = r2
                        r0.countDown()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.analytics.QuickShareAnalytics$getPitayaPackageVersion$1.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError, com.bytedance.pitaya.api.bean.PTYPackageInfo):void");
                }
            });
            countDownLatch.await(1L, TimeUnit.SECONDS);
            str5 = (String) c259800zU.element;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c2344009Gk.LJIIIIZZ("pitaya_package_version", str5);
        C20684815ws.LJIILLIIL("quick_share_btn_call", c2344009Gk.LIZ);
    }

    public static void LIZJ(boolean z, String str, String str2, String str3, String str4, IMContact iMContact, String str5, Boolean bool, Map map) {
        String str6;
        String string;
        Object obj;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        if (z) {
            str6 = "show";
        } else {
            str6 = "click";
        }
        c2344009Gk.LJIIIIZZ("action_type", str6);
        c2344009Gk.LJIIIIZZ("trigger", str3);
        if (iMContact instanceof IMUser) {
            c2344009Gk.LJIIIIZZ("to_user_id", iMContact.getUid());
            c2344009Gk.LJFF("chat_type", "private");
        } else if (iMContact instanceof IMConversation) {
            c2344009Gk.LJIIIIZZ("to_user_id", ((IMConversation) iMContact).getConversationId());
            c2344009Gk.LJFF("chat_type", "group");
        }
        c2344009Gk.LJIIIIZZ("content_type", "video");
        Boolean bool2 = Boolean.TRUE;
        c2344009Gk.LIZJ(Intrinsics.LJFF(bool, bool2) ? 1 : 0, "use_default");
        if (Intrinsics.LJFF(bool, bool2)) {
            string = "default";
        } else if (map == null || (obj = map.get("strategy_type")) == null || (string = obj.toString()) == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("strategy_type", string);
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("author_id", str2);
        c2344009Gk.LJIIIIZZ("pitaya_trace_id", str5);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), entry.getValue().toString());
            }
        }
        C20684815ws.LJIILLIIL("quick_share_button", c2344009Gk.LIZ);
    }

    public static void LIZIZ(boolean z, String str, String str2, boolean z2, String str3, IMContact iMContact, String str4, String str5, String str6, String str7, Boolean bool, Map map) {
        String str8;
        Object obj;
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        if (iMContact instanceof IMUser) {
            c2344009Gk.LJIIIIZZ("to_user_id", iMContact.getUid());
            c2344009Gk.LJFF("chat_type", "private");
        } else if (iMContact instanceof IMConversation) {
            c2344009Gk.LJIIIIZZ("to_user_id", ((IMConversation) iMContact).getConversationId());
            c2344009Gk.LJFF("chat_type", "group");
        }
        if (C065U.LIZ()) {
            c2344009Gk.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "use_default");
        }
        String str9 = "";
        if (!z2) {
            str8 = "";
        } else {
            str8 = "video";
        }
        c2344009Gk.LJIIIIZZ("content_type", str8);
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("author_id", str2);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_show");
        c2344009Gk.LJIIIIZZ("show_reason", str5);
        c2344009Gk.LJIIIIZZ("unshow_reason", str6);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str9 = "default";
        } else if (map != null && (obj = map.get("strategy_type")) != null && (string = obj.toString()) != null) {
            str9 = string;
        }
        c2344009Gk.LJIIIIZZ("strategy_type", str9);
        c2344009Gk.LJIIIIZZ("pitaya_trace_id", str4);
        c2344009Gk.LJIIIIZZ("request_trigger", str7);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), entry.getValue().toString());
            }
        }
        C20684815ws.LJIILLIIL("recall_quick_share_button", c2344009Gk.LIZ);
    }
}
