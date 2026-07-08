package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Rdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700490Rdn extends C09AY implements InterfaceC1685420txc<LifecycleOwner, C699090RbX<? extends ComponentPriorityProtocol>, String, String, Boolean, Unit> {
    public final /* synthetic */ C700470Rdl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700490Rdn(C700470Rdl c700470Rdl) {
        super(5);
        this.LL = c700470Rdl;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(LifecycleOwner lifecycleOwner, C699090RbX<? extends ComponentPriorityProtocol> c699090RbX, String str, String str2, Boolean bool) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        String str3 = str;
        String str4 = str2;
        boolean zBooleanValue = bool.booleanValue();
        new C700500Rdo(str4, str3);
        C0T6L.LIZLLL();
        C700470Rdl c700470Rdl = this.LL;
        c700470Rdl.LIZIZ = str3;
        c700470Rdl.LIZJ = str4;
        c700470Rdl.LIZ = C948503nH.LJ(lifecycleOwner2, C23271099x.INSTANCE, new C702750RhR(c700470Rdl, lifecycleOwner2, c699090RbX, zBooleanValue, str3, str4, null));
        return Unit.LIZ;
    }
}
