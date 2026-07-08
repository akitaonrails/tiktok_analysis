package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760480TsM implements C0U86 {
    public static final C760480TsM LIZ = new C760480TsM();
    public static StickerEffectViewModel LIZIZ;
    public static AnonymousClass0956 LIZJ;

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956;
        C0UA1.LIZ().tr(this);
        AnonymousClass0956 anonymousClass09562 = LIZJ;
        if (C176600m4.LIZIZ(anonymousClass09562 != null ? Boolean.valueOf(anonymousClass09562.isActive()) : null) && (anonymousClass0956 = LIZJ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZIZ = null;
    }

    @Override // X.C0U86
    public final void LIZ(LiveEffect liveEffect, String str, boolean z) {
        InterfaceC497601wk viewModelScope;
        if (z && Intrinsics.LJFF(str, C0UD4.LIZIZ) && liveEffect != null) {
            StickerEffectViewModel stickerEffectViewModel = LIZIZ;
            AnonymousClass0956 anonymousClass0956LIZLLL = null;
            if (stickerEffectViewModel != null && (viewModelScope = ViewModelKt.getViewModelScope(stickerEffectViewModel)) != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(viewModelScope, null, null, new C760470TsL(liveEffect, null), 3);
            }
            LIZJ = anonymousClass0956LIZLLL;
        }
    }
}
