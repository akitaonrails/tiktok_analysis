package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService;
import java.util.Map;

/* JADX INFO: renamed from: X.0zEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888190zEf {
    public static final /* synthetic */ C1888190zEf LIZ = new C1888190zEf();

    public static ICommentSafetyDepService LIZ() {
        ICommentSafetyDepService iCommentSafetyDepService = (ICommentSafetyDepService) PluggableExtentionKt.pluggableSpi$default(ICommentSafetyDepService.class, false, false, false, 14, null);
        return iCommentSafetyDepService == null ? new ICommentSafetyDepService() { // from class: X.0zEg
            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
            public final <T> C11NZ<T> LIZ(C11NZ<T> c11nz, String str, Map<String, String> map) {
                return c11nz;
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
            public final boolean LIZIZ() {
                return false;
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
            public final boolean LIZJ() {
                return false;
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
            public final Activity getTopActivity() {
                return null;
            }

            @Override // com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService
            public final InterfaceC1888230zEj LIZLLL() {
                return new InterfaceC1888230zEj() { // from class: X.0zEh
                    @Override // X.InterfaceC1888230zEj
                    public final int LIZIZ() {
                        return 0;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final int LIZJ() {
                        return 0;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final boolean LIZLLL() {
                        return false;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final boolean LJFF() {
                        return false;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final int LJI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final int LJIIJJI() {
                        return 0;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final boolean LJIIL() {
                        return false;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final void LJIILIIL(int i) {
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final Object LJIIIZ(InterfaceC1364105Vn<? super C189200o6<C1414405gE>> interfaceC1364105Vn) {
                        C098200Yq c098200Yq = new C098200Yq(new Throwable("not implemented"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        return c098200Yq;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final Object LIZ(int i, InterfaceC1364105Vn<? super C189200o6<? extends BaseResponse>> interfaceC1364105Vn) {
                        C098200Yq c098200Yq = new C098200Yq(new Throwable("not implemented"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        return c098200Yq;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final Object LJ(int i, InterfaceC1364105Vn<? super C189200o6<? extends BaseResponse>> interfaceC1364105Vn) {
                        C098200Yq c098200Yq = new C098200Yq(new Throwable("not implemented"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        return c098200Yq;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final Object LJII(C06TC c06tc, InterfaceC1364105Vn<? super C189200o6<? extends BaseResponse>> interfaceC1364105Vn) {
                        C098200Yq c098200Yq = new C098200Yq(new Throwable("not implemented"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        return c098200Yq;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final Object LJIIIIZZ(int i, InterfaceC1364105Vn<? super C189200o6<? extends BaseResponse>> interfaceC1364105Vn) {
                        C098200Yq c098200Yq = new C098200Yq(new Throwable("not implemented"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        return c098200Yq;
                    }

                    @Override // X.InterfaceC1888230zEj
                    public final Object LJIIJ(int i, InterfaceC1364105Vn<? super C189200o6<? extends BaseResponse>> interfaceC1364105Vn) {
                        C098200Yq c098200Yq = new C098200Yq(new Throwable("not implemented"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        return c098200Yq;
                    }
                };
            }
        } : iCommentSafetyDepService;
    }
}
