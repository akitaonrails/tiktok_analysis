package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0dqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065780dqC implements InterfaceC736670Sv3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final InterfaceC1065790dqD LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS252S0000000_16.get$arr$(595));
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(597));
    public final C997320c3m LLILZ = new C997320c3m(AFwS252S0000000_16.get$arr$(596));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1065780dqC.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1065780dqC.class, "eventType", "getEventType()Ljava/lang/String;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1065780dqC.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC736670Sv3
    public final void Kv1() {
        C1591530rWB c1591530rWB = C1591530rWB.LIZIZ;
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        if (!c1591530rWB.N7((String) c997320c3m.LIZ(this))) {
            if (C13LQ.LJJIJIIJI(this.LLILLL.LIZ(this), new String[]{"homepage_hot", "general_search", "homepage_popular", "homepage_follow", "others_homepage"}) < 0) {
                return;
            }
        }
        C1029590ctp.LIZLLL().LJJIIJ((Context) this.LLILZ.LIZ(this), (Aweme) this.LLILLJJLI.LIZ(this));
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1065790dqD Mh() {
        return this.LL;
    }

    public C1065780dqC(InterfaceC1065790dqD interfaceC1065790dqD) {
        this.LL = interfaceC1065790dqD;
    }
}
