package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1648906cx extends C09AY implements Function0<IMRecentActivityService> {
    public C1648906cx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMRecentActivityService invoke() {
        ?? PluggableSpiForReal = PluggableExtentionKt.pluggableSpiForReal(IMRecentActivityService.class);
        return PluggableSpiForReal == 0 ? new IMRecentActivityService() { // from class: X.06cw
            @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService
            public final InterfaceC1648006co LIZIZ() {
                return new InterfaceC1648006co() { // from class: X.06cq
                    @Override // X.InterfaceC1648006co
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1648006co
                    public final void LIZIZ(SessionInfo sessionInfo, AwS546S0100000_2 awS546S0100000_2) {
                    }

                    @Override // X.InterfaceC1648006co
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1648006co
                    public final void LIZLLL(SessionInfo sessionInfo) {
                    }
                };
            }

            @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService
            public final InterfaceC893360Z2w LIZJ() {
                return new InterfaceC893360Z2w() { // from class: X.06cz
                    @Override // X.InterfaceC893360Z2w
                    public final void LIZ(EnumC461080I6g enumC461080I6g) {
                    }

                    @Override // X.InterfaceC893360Z2w
                    public final void LIZIZ(EnumC461080I6g enumC461080I6g, InterfaceC1493105sv interfaceC1493105sv) {
                    }

                    @Override // X.InterfaceC893360Z2w
                    public final void LIZJ(EnumC461080I6g enumC461080I6g) {
                    }

                    @Override // X.InterfaceC893360Z2w
                    public final void LIZLLL(EnumC461080I6g enumC461080I6g) {
                    }

                    @Override // X.InterfaceC893360Z2w
                    public final void LJ(EnumC461080I6g enumC461080I6g) {
                    }
                };
            }

            @Override // com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService
            public final InterfaceC1647906cn LIZ(String str) {
                return new InterfaceC1647906cn() { // from class: X.06cv
                    @Override // X.InterfaceC1647906cn
                    public final void LIZIZ(String str2) {
                    }

                    @Override // X.InterfaceC1647906cn
                    public final C1722406oo LIZLLL(String str2) {
                        return null;
                    }

                    @Override // X.InterfaceC1647906cn
                    public final C1722406oo LJ(String str2) {
                        return null;
                    }

                    @Override // X.InterfaceC1647906cn
                    public final void LJI(List<C1722406oo> list) {
                    }

                    @Override // X.InterfaceC1647906cn
                    public final void LJII(String str2) {
                    }

                    @Override // X.InterfaceC1647906cn
                    public final void dismiss() {
                    }

                    @Override // X.InterfaceC1647906cn
                    public final InterfaceC893280Z2o LIZ() {
                        return new InterfaceC893280Z2o() { // from class: X.06d0
                            @Override // X.InterfaceC893280Z2o
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC893280Z2o
                            public final void LIZIZ() {
                            }

                            @Override // X.InterfaceC893280Z2o
                            public final void LIZJ() {
                            }

                            @Override // X.InterfaceC893280Z2o
                            public final boolean LIZLLL() {
                                return false;
                            }

                            @Override // X.InterfaceC893280Z2o
                            public final boolean canShowBanner() {
                                return false;
                            }
                        };
                    }

                    @Override // X.InterfaceC1647906cn
                    public final C05YD<Set<String>> LJFF() {
                        return C1BNE.LIZ(C08CX.INSTANCE);
                    }

                    @Override // X.InterfaceC1647906cn
                    public final C069H LIZJ(SessionInfo sessionInfo) {
                        return C069H.NONE;
                    }
                };
            }
        } : PluggableSpiForReal;
    }
}
