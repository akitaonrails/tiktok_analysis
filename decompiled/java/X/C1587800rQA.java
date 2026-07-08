package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587800rQA {
    public static final InsertStory LIZ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        Object c098200Yq;
        Object obj = null;
        if (!C295190Bhd.LIZ() || intent == null) {
            return null;
        }
        try {
            stringExtra = intent.getStringExtra("to_inbox_key");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (!Intrinsics.LJFF("to_inbox_value", stringExtra)) {
            return null;
        }
        intent.removeExtra("to_inbox_key");
        try {
            stringExtra2 = intent.getStringExtra("uid");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        try {
            stringExtra3 = intent.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra3 = null;
        }
        if (stringExtra2 == null || stringExtra3 == null || stringExtra2.length() == 0 || stringExtra3.length() == 0) {
            return null;
        }
        try {
            c098200Yq = new InsertStory(CastLongProtector.parseLong(stringExtra2), CastLongProtector.parseLong(stringExtra3));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (InsertStory) obj;
    }
}
