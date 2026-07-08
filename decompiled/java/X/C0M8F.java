package X;

import Y.AObjectS383S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0M8F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8F extends C09AY implements Function0<C564230MAz> {
    public C0M8F() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MAz] */
    @Override // kotlin.jvm.functions.Function0
    public final C564230MAz invoke() {
        return new InterfaceC557090Lt5() { // from class: X.0MAz
            @Override // X.InterfaceC557090Lt5
            public final void openDraftActivity(Context context, Bundle bundle) throws Throwable {
                Object obj;
                Context context2 = context;
                C562090M2t c562090M2t = C562090M2t.LIZLLL;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = c562090M2t.LIZJ;
                if (j != -1) {
                    jCurrentTimeMillis = j;
                }
                c562090M2t.LIZJ = jCurrentTimeMillis;
                C0CHQ.LIZ().LJJIL().LIZ().refreshData();
                if (bundle == null) {
                    C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJaLu1Cz0M+dqT3i7ofYiV2S2a8R86Nuj71aBpFus/5lIBpw=", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = {context2};
                    C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Context;)V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/ugc/aweme/tools/draft/DraftBoxActivity", "startActivity", DraftBoxActivity.class, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(11098, "com/ss/android/ugc/aweme/tools/draft/DraftBoxActivity", "startActivity", null, objArr, DraftBoxActivity.class, c0wzw, false);
                        return;
                    }
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null && (obj = objArr2[0]) != null) {
                        context2 = (Context) obj;
                    }
                    String str = DraftBoxActivity._pnsPageId;
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_draft_not_request_album_permission", true, false)) {
                        C2204961BRm.z(context2, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJZX5xzzpEu08SmmujryVlhA=", null));
                    } else if (context2 != null) {
                        DraftBoxActivity.LLLLZLLIL(context2, new AObjectS383S0100000_8(context2, 20), new AObjectS383S0100000_8(context2, 21));
                    }
                    c0wst.LIZ(11098, "com/ss/android/ugc/aweme/tools/draft/DraftBoxActivity", "startActivity", null, objArr, DraftBoxActivity.class, c0wzw, true);
                    return;
                }
                C2204961BRm.z(context2, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJaLu1Cz0M+dqT3i7ofYiV2S2a8R86Nuj71aBpFus/5lIBpw=", null));
            }

            @Override // X.InterfaceC557090Lt5
            public final void LIZ(Activity activity, Intent intent, boolean z, boolean z2) {
                C1660680tJi.LIZ().LIZ(activity, intent, z, z2);
            }
        };
    }
}
