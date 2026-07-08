package Y;

import X.AbstractC1542200qEc;
import X.C1165930gRj;
import X.C1540620qC4;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.business.music.raven.RavenMusicCollectionFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AObjectS314S0200000_18 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS314S0200000_18 aObjectS314S0200000_18, Object obj) {
        final RavenMusicCollectionFragment ravenMusicCollectionFragment = (RavenMusicCollectionFragment) aObjectS314S0200000_18.l0;
        final C1540620qC4 c1540620qC4 = (C1540620qC4) aObjectS314S0200000_18.l1;
        ((SparkContext) obj).LJJJJZI(new AbstractC1542200qEc() { // from class: X.0gVH
            public C1537720q7O LLILLJJLI;

            @Override // X.AbstractC1537870q7d
            public final void LJLJJI() {
                ravenMusicCollectionFragment.NS().LIZIZ("first_body_component_create_start");
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                ravenMusicCollectionFragment.NS().LIZIZ("first_body_component_create_end");
                RavenMusicCollectionFragment ravenMusicCollectionFragment2 = ravenMusicCollectionFragment;
                if (ravenMusicCollectionFragment2.LLLLLLLLL) {
                    AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(ravenMusicCollectionFragment2, 308);
                    if (ravenMusicCollectionFragment2.LLLLLLZ == null) {
                        ((ArrayList) ravenMusicCollectionFragment2.LLLLLLZZ).add(awS562S0100000_18);
                    } else {
                        awS562S0100000_18.invoke();
                    }
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                C1537720q7O c1537720q7O;
                if (interfaceC1541990qEH instanceof C1537720q7O) {
                    c1537720q7O = (C1537720q7O) interfaceC1541990qEH;
                } else {
                    c1537720q7O = null;
                }
                this.LLILLJJLI = c1537720q7O;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
                Object tag;
                String str;
                Object c098200Yq;
                C679540Ql6 c679540Ql6;
                C1540620qC4 c1540620qC42 = c1540620qC4;
                C1537720q7O c1537720q7O = this.LLILLJJLI;
                c1540620qC42.getClass();
                Object obj2 = null;
                if (c1537720q7O != null) {
                    tag = c1537720q7O.getTag(R.id.vs8);
                } else {
                    tag = null;
                }
                if ((tag instanceof C679540Ql6) && (c679540Ql6 = (C679540Ql6) tag) != null) {
                    str = c679540Ql6.LJIJJLI;
                } else {
                    str = null;
                }
                try {
                    c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1537540q76.LJ(str), "spark_page");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj2 = c098200Yq;
                }
                if (Intrinsics.LJFF(obj2, "music_collection_music_audio_card")) {
                    RavenMusicCollectionFragment ravenMusicCollectionFragment2 = ravenMusicCollectionFragment;
                    ravenMusicCollectionFragment2.LLLLLLZ = this.LLILLJJLI;
                    Iterator<Function0<Unit>> it2 = ravenMusicCollectionFragment2.LLLLLLZZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke();
                    }
                    ((ArrayList) ravenMusicCollectionFragment.LLLLLLZZ).clear();
                }
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS314S0200000_18 aObjectS314S0200000_18, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        Map map = (Map) aObjectS314S0200000_18.l0;
        RavenMusicCollectionFragment ravenMusicCollectionFragment = (RavenMusicCollectionFragment) aObjectS314S0200000_18.l1;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                sparkContext.LJJJZ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        sparkContext.LJJ(C1165930gRj.class, new C1165930gRj(ravenMusicCollectionFragment.sT(), ravenMusicCollectionFragment.Ld1()));
        sparkContext.lifecycleOwner = ravenMusicCollectionFragment;
        sparkContext.LJJ(Fragment.class, ravenMusicCollectionFragment);
        return Unit.LIZ;
    }

    public AObjectS314S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
