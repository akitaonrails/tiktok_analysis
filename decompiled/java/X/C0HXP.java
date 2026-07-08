package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HXP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXP implements InterfaceC908170Zjz {
    public static final List<String> LLILZIL = C1697810uHb.LJIIJJI("😍", "😂", "😳");
    public static final C01GW<C0HXP> LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(611));
    public AnonymousClass0956 LLILLJJLI;
    public boolean LLILZ;
    public final Keva LL = Keva.getRepo("recent_clicked_emoji_keva");
    public List<String> LLILLL = C13BV.INSTANCE;

    public C0HXP() {
        C0I0B.LJFF.LIZ().LIZLLL(this);
    }

    public final List<String> LIZIZ(int i) {
        String strJ4;
        if (!this.LLILZ) {
            String strLIZIZ = C461720I8s.LIZIZ();
            if (!Intrinsics.LJFF(strLIZIZ, "-1") && (strJ4 = C786410Ut5.j4("emoji_list_%s", new Object[]{strLIZIZ})) != null) {
                this.LLILLL = C13LQ.LJLI(this.LL.getStringArray(strJ4, new String[0]));
                this.LLILZ = true;
            } else {
                return C13BV.INSTANCE;
            }
        }
        ArrayList arrayList = new ArrayList(this.LLILLL);
        if (i != 7 && arrayList.size() < i) {
            arrayList.addAll(LLILZIL);
            return C13LP.LL(C13LP.LJJJJI(arrayList), Math.min(arrayList.size(), i));
        }
        return C13LP.LL(arrayList, i);
    }

    public final void LIZJ(String str) {
        String strJ4;
        if (str.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.LLILLL);
        ListProtector.add(arrayList, 0, str);
        this.LLILLL = C13LP.LL(C13LP.LJJJJI(arrayList), 7);
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!Intrinsics.LJFF(strLIZIZ, "-1") && (strJ4 = C786410Ut5.j4("emoji_list_%s", new Object[]{strLIZIZ})) != null) {
            this.LLILLJJLI = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C377001dI(this, strJ4, null), 3);
        }
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (!z) {
            return;
        }
        if (i != 2 && i != 3) {
            return;
        }
        this.LLILLL = C13BV.INSTANCE;
        this.LLILZ = false;
    }
}
