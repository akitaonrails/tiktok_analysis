package X;

import com.bytedance.android.livesdk.like.LikeHelper;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151760g4s implements InterfaceC781210Ukh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C1151760g4s c1151760g4s) {
        LikeHelper likeHelper = (LikeHelper) c1151760g4s.l1;
        ((HashMap) likeHelper.LLJLLL).remove(c1151760g4s.s0);
    }

    public static final void run$1(C1151760g4s c1151760g4s) {
        LikeHelper likeHelper = (LikeHelper) c1151760g4s.l1;
        ((HashMap) likeHelper.LLJLLL).remove(c1151760g4s.s0);
    }

    public C1151760g4s(LikeHelper likeHelper, String str, int i) {
        this.$t = i;
        this.l1 = likeHelper;
        this.s0 = str;
    }
}
