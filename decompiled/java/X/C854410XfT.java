package X;

import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationShowEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationTypingEvent;

/* JADX INFO: renamed from: X.0XfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C854410XfT {
    public final EnumC854400XfS LIZ;
    public boolean LIZIZ;

    public final void LIZIZ() {
        IdentityVerificationShowEvent identityVerificationShowEvent = new IdentityVerificationShowEvent();
        identityVerificationShowEvent.LJI("suspicious_login", "enter_from");
        identityVerificationShowEvent.LJI(this.LIZ.getShow().getValue(), "verification_method");
        identityVerificationShowEvent.LJI("suspicious_login", "page");
        identityVerificationShowEvent.LJIIIIZZ();
    }

    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        IdentityVerificationTypingEvent identityVerificationTypingEvent = new IdentityVerificationTypingEvent();
        identityVerificationTypingEvent.LJI("suspicious_login", "enter_from");
        identityVerificationTypingEvent.LJI(this.LIZ.getTyping().getValue(), "verification_method");
        identityVerificationTypingEvent.LJI("suspicious_login", "page");
        identityVerificationTypingEvent.LJIIIIZZ();
    }

    public C854410XfT(EnumC854400XfS enumC854400XfS) {
        this.LIZ = enumC854400XfS;
    }

    public final void LIZ(boolean z) {
        EnumC854440XfW enumC854440XfW;
        IdentityVerificationResultEvent identityVerificationResultEvent = new IdentityVerificationResultEvent();
        identityVerificationResultEvent.LJI("suspicious_login", "enter_from");
        if (z) {
            enumC854440XfW = EnumC854440XfW.DIGITAL_1;
        } else {
            enumC854440XfW = EnumC854440XfW.DIGITAL_0;
        }
        identityVerificationResultEvent.LJI(Integer.valueOf(enumC854440XfW.getValue()), "is_success");
        identityVerificationResultEvent.LJI(this.LIZ.getResult().getValue(), "verification_method");
        identityVerificationResultEvent.LJI("suspicious_login", "page");
        identityVerificationResultEvent.LJIIIIZZ();
    }
}
