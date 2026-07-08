package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.wheedmbadge.WheeDmBadgeMessageListViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.wheedmbadge.WheeDmBadgeSettings;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Zt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913780Zt2 extends ClickableSpan {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C913780Zt2 c913780Zt2, View view) {
        String conversationId;
        String conversationId2;
        C0Y8T c0y8tLIZ;
        SessionInfo sessionInfo = ((C897120ZHi) c913780Zt2.l0).LIZIZ;
        boolean z = false;
        if (sessionInfo != null && (conversationId2 = sessionInfo.getConversationId()) != null && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId2)) != null && C882340YjQ.LJ(c0y8tLIZ)) {
            return;
        }
        C897120ZHi c897120ZHi = (C897120ZHi) c913780Zt2.l0;
        Context context = view.getContext();
        String str = WheeDmBadgeSettings.LIZ().wheePackageName;
        String str2 = WheeDmBadgeSettings.LIZ().wheeAppScheme;
        c897120ZHi.getClass();
        if (str != null && !a0.LJJJIL(str)) {
            try {
                C786410Ut5.Y3(context.getPackageManager(), str, 0);
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else if (str2 != null && !a0.LJJJIL(str2)) {
            new Intent("android.intent.action.VIEW", UriProtector.parse(str2)).resolveActivity(context.getPackageManager());
        }
        C897040ZHa.LIZIZ().storeLong(C897040ZHa.LIZ(String.valueOf(C461720I8s.LIZJ())), System.currentTimeMillis());
        SessionInfo sessionInfo2 = ((C897120ZHi) c913780Zt2.l0).LIZIZ;
        if (sessionInfo2 == null || (conversationId = sessionInfo2.getConversationId()) == null) {
            conversationId = "";
        }
        SessionInfo sessionInfo3 = ((C897120ZHi) c913780Zt2.l0).LIZIZ;
        if (sessionInfo3 != null && sessionInfo3.isGroupChat()) {
            z = true;
        }
        C897200ZHq.LIZ(conversationId, z, "whee_content");
        WheeDmBadgeMessageListViewModel wheeDmBadgeMessageListViewModel = ((C897120ZHi) c913780Zt2.l0).LIZJ;
        if (wheeDmBadgeMessageListViewModel != null) {
            wheeDmBadgeMessageListViewModel.LL = true;
        }
        SmartRouter.buildRoute((Context) c913780Zt2.l1, WheeDmBadgeSettings.LIZ().wheeDeepLink).open();
    }

    public static final void onClick$1(C913780Zt2 c913780Zt2, View view) {
        ((C1ANM) c913780Zt2.l0).LLLLIL().LIZIZ.invoke((MentionDataItem) c913780Zt2.l1);
    }

    public static final void updateDrawState$0(C913780Zt2 c913780Zt2, TextPaint textPaint) {
        textPaint.setColor(c913780Zt2.i2);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C913780Zt2 c913780Zt2, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(c913780Zt2.i2);
    }

    public C913780Zt2(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
