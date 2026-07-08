package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.streaming.sugar.StreamingSugar;
import com.ss.android.ugc.aweme.im.streaming.sugar.internal.StreamingSugarImpl;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905180ZfA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILIIL;
    public final EnumC542860LQu LIZ;
    public final LifecycleOwner LIZIZ;
    public final ViewModelStoreOwner LIZJ;
    public final C1887607aM LIZLLL;
    public final InterfaceC1493505sz LJ = C0I0B.LJFF.LIZIZ();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1045));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1044));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1043));
    public C01GW<? extends ChatroomEventAbility> LJIIIIZZ;
    public volatile C905950ZgP LJIIIZ;
    public volatile C906070Zgb LJIIJ;
    public volatile StreamingSugarImpl LJIIJJI;
    public volatile C905200ZfC LJIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C905180ZfA.class, "streamRepository", "getStreamRepository()Lcom/ss/android/ugc/aweme/im/streaming/api/StreamRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C905180ZfA.class, "convStreamingSessionTracker", "getConvStreamingSessionTracker()Lcom/ss/android/ugc/aweme/im/streaming/sugar/event/ConvStreamingSessionTracker;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C905180ZfA.class, "streamSugar", "getStreamSugar()Lcom/ss/android/ugc/aweme/im/streaming/sugar/StreamingSugar;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C905180ZfA.class, "streamingAbilityFactory", "getStreamingAbilityFactory()Lcom/ss/android/ugc/aweme/im/streaming/sugar/IStreamingAbilityFactory;", 0);
        c09r3.getClass();
        LJIILIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final InterfaceC905630Zft LIZ() {
        C906070Zgb c906070Zgb = this.LJIIJ;
        if (c906070Zgb == null) {
            synchronized (this) {
                c906070Zgb = this.LJIIJ;
                if (c906070Zgb == null) {
                    C906070Zgb c906070Zgb2 = new C906070Zgb(this.LIZ, this.LJ);
                    this.LJIIJ = c906070Zgb2;
                    return c906070Zgb2;
                }
            }
        }
        return c906070Zgb;
    }

    public final InterfaceC905300ZfM LIZIZ() {
        return (InterfaceC905300ZfM) this.LJI.getValue();
    }

    public final InterfaceC905750Zg5 LIZJ() {
        C905950ZgP c905950ZgP = this.LJIIIZ;
        if (c905950ZgP == null) {
            synchronized (this) {
                c905950ZgP = this.LJIIIZ;
                if (c905950ZgP == null) {
                    C905950ZgP c905950ZgP2 = new C905950ZgP(this.LIZ, (C906660ZhY) C1807670x8n.LLZLI((C906700Zhc) C1807670x8n.LLZLL()), (C0YVE) C1807670x8n.LLZL());
                    this.LJIIIZ = c905950ZgP2;
                    return c905950ZgP2;
                }
            }
        }
        return c905950ZgP;
    }

    public final StreamingSugar LIZLLL() {
        StreamingSugarImpl streamingSugarImpl = this.LJIIJJI;
        if (streamingSugarImpl == null) {
            synchronized (this) {
                streamingSugarImpl = this.LJIIJJI;
                if (streamingSugarImpl == null) {
                    StreamingSugarImpl streamingSugarImpl2 = new StreamingSugarImpl(new C905950ZgP(this.LIZ, (C906660ZhY) C1807670x8n.LLZLI((C906700Zhc) C1807670x8n.LLZLL()), (C0YVE) C1807670x8n.LLZL()), LIZ());
                    this.LJIIJJI = streamingSugarImpl2;
                    return streamingSugarImpl2;
                }
            }
        }
        return streamingSugarImpl;
    }

    public C905180ZfA(EnumC542860LQu enumC542860LQu, LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, C1887607aM c1887607aM) {
        this.LIZ = enumC542860LQu;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = viewModelStoreOwner;
        this.LIZLLL = c1887607aM;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C905170Zf9(this, null), 3);
    }
}
