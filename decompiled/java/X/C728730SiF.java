package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS138S1100000_24;

/* JADX INFO: renamed from: X.0SiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728730SiF extends C09AY implements Function0<C728690SiB> {
    public C728730SiF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SiB] */
    @Override // kotlin.jvm.functions.Function0
    public final C728690SiB invoke() {
        return new InterfaceC1605730rt5() { // from class: X.0SiB
            @Override // X.InterfaceC1605730rt5
            public final void LIZIZ(String str, InterfaceC727810Sgl interfaceC727810Sgl) {
            }

            @Override // X.InterfaceC1605730rt5
            public final int LIZJ(Context context) {
                return 0;
            }

            @Override // X.InterfaceC1605730rt5
            public final C694200RKw LIZLLL(Context context) {
                return null;
            }

            @Override // X.InterfaceC1605730rt5
            public final void LJ(String str) {
            }

            @Override // X.InterfaceC1605730rt5
            public final boolean LJIIIIZZ(EnumC1606080rte enumC1606080rte) {
                return false;
            }

            @Override // X.InterfaceC1605730rt5
            public final String LJIIJ() {
                return null;
            }

            @Override // X.InterfaceC1605730rt5
            public final void LJIIJJI(String str, Map<String, ? extends Object> map) {
            }

            @Override // X.InterfaceC1605730rt5
            public final int[] LJIIL(Context context) {
                return new int[3];
            }

            @Override // X.InterfaceC1605730rt5
            public final void LJIILIIL(LifecycleOwner lifecycleOwner, AwS138S1100000_24 awS138S1100000_24) {
            }

            @Override // X.InterfaceC1605730rt5
            public final void LJIIZILJ(String str) {
            }

            @Override // X.InterfaceC1605730rt5
            public final InterfaceC1605850rtH LJI() {
                return new InterfaceC1605850rtH() { // from class: X.0SiE
                    @Override // X.InterfaceC1605850rtH
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1605850rtH
                    public final String LIZIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1605850rtH
                    public final boolean LIZJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1605850rtH
                    public final boolean LIZLLL() {
                        return false;
                    }
                };
            }

            @Override // X.InterfaceC1605730rt5
            public final InterfaceC728740SiG LJIILL() {
                return new InterfaceC728740SiG() { // from class: X.0SiD
                    @Override // X.InterfaceC728740SiG
                    public final EnumC727930Sgx LIZ() {
                        return null;
                    }
                };
            }

            @Override // X.InterfaceC1605730rt5
            public final C727780Sgi LIZ(Aweme aweme) {
                return new C727780Sgi(-1, null, null, null, null, 62);
            }

            @Override // X.InterfaceC1605730rt5
            public final C727780Sgi LJII(User user) {
                return new C727780Sgi(0, null, null, null, null, 62);
            }

            @Override // X.InterfaceC1605730rt5
            public final InterfaceC1605840rtG LJIIIZ(EnumC1606080rte enumC1606080rte) {
                return new InterfaceC1605840rtG() { // from class: X.0SiC
                    @Override // X.InterfaceC1605840rtG
                    public final void onEnterPlayer(SmartRoute smartRoute, String str, String str2) {
                    }

                    @Override // X.InterfaceC1605840rtG
                    public final void onMineAvatarShown(String str) {
                    }

                    @Override // X.InterfaceC1605840rtG
                    public final boolean skipGray() {
                        return false;
                    }
                };
            }

            @Override // X.InterfaceC1605730rt5
            public final C727780Sgi LJIILLIIL(String str) {
                return new C727780Sgi(0, null, null, null, null, 63);
            }

            @Override // X.InterfaceC1605730rt5
            public final C727780Sgi LJFF(User user, UserFilterStoryInfo userFilterStoryInfo, UserAllStoryMetadata userAllStoryMetadata) {
                return new C727780Sgi(0, null, null, null, null, 63);
            }

            @Override // X.InterfaceC1605730rt5
            public final C727510SgH LJIILJJIL(String str, C727780Sgi c727780Sgi, String str2) {
                return new C727510SgH(new C727780Sgi(0, null, null, null, null, 63));
            }
        };
    }
}
