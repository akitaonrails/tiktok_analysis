package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913070Zrt implements ChatRoomAdaptiveRequestManager {
    public static final /* synthetic */ C913070Zrt LIZJ = new C913070Zrt();
    public final /* synthetic */ ChatRoomAdaptiveRequestManager LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLJJLL() {
        this.LIZIZ.LJLJJLL();
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLJL() {
        this.LIZIZ.LJLJL();
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final boolean LJLJLJ() {
        return this.LIZIZ.LJLJLJ();
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLJLLL() {
        this.LIZIZ.LJLJLLL();
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLL(Function0<Unit> function0) {
        this.LIZIZ.LJLL(function0);
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final Object LJLLI(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        return this.LIZIZ.LJLLI(interfaceC1364105Vn, function1);
    }

    public C913070Zrt() {
        ChatRoomAdaptiveRequestManager chatRoomAdaptiveRequestManager = (ChatRoomAdaptiveRequestManager) PluggableExtentionKt.pluggableSpiForReal(ChatRoomAdaptiveRequestManager.class);
        this.LIZIZ = chatRoomAdaptiveRequestManager == null ? new ChatRoomAdaptiveRequestManager() { // from class: X.04ma
            @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
            public final void LJLJJLL() {
            }

            @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
            public final void LJLJL() {
            }

            @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
            public final boolean LJLJLJ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
            public final void LJLJLLL() {
            }

            @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
            public final void LJLL(Function0<Unit> function0) {
                function0.invoke();
            }

            @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
            public final Object LJLLI(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
                return function1.invoke(interfaceC1364105Vn);
            }
        } : chatRoomAdaptiveRequestManager;
    }
}
