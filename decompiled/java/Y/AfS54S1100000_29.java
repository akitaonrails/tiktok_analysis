package Y;

import X.C09JN;
import X.C19641211sw;
import X.C19641511sz;
import X.C19651911uf;
import X.C19652211ui;
import X.C19652811uo;
import X.C1C7U;
import X.C20467080b;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.Status;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AfS54S1100000_29 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS54S1100000_29 afS54S1100000_29, Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("ArticleTitleEditorVM$Companion@59f.checkTitle$6");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) afS54S1100000_29.l1;
        String str = afS54S1100000_29.s0;
        if (th instanceof C19641211sw) {
            strLIZIZ = ((C19641211sw) th).getVerifyResult();
        } else {
            strLIZIZ = C20467080b.LIZIZ(R.string.m25);
        }
        function1.invoke(new C19641511sz(str, false, strLIZIZ));
        C1C7U.LIZIZ("ArticleTitleEditorVM$Companion@59f.checkTitle$6");
    }

    public static final void accept$1(AfS54S1100000_29 afS54S1100000_29, Object obj) {
        C1C7U.LIZ("NewsAnchorPublishRepo@bd0e.requestLinkVerify$5");
        ((Function1) afS54S1100000_29.l1).invoke(new C19652811uo(afS54S1100000_29.s0, false, new Status("003", C20467080b.LIZIZ(R.string.m25)), false));
        C1C7U.LIZIZ("NewsAnchorPublishRepo@bd0e.requestLinkVerify$5");
    }

    public static final void accept$2(AfS54S1100000_29 afS54S1100000_29, Object obj) {
        C1C7U.LIZ("NewsAnchorPublishRepo@bd0e.requestTitleVerify$6");
        ((Function1) afS54S1100000_29.l1).invoke(new C19652211ui(afS54S1100000_29.s0, false, new C19651911uf(new Status("003", C20467080b.LIZIZ(R.string.m25)))));
        C1C7U.LIZIZ("NewsAnchorPublishRepo@bd0e.requestTitleVerify$6");
    }

    public AfS54S1100000_29(String str, Object obj, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
