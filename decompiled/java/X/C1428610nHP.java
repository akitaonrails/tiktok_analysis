package X;

import com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1428610nHP extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1428610nHP(SendToDMComponent sendToDMComponent) {
        super(1, sendToDMComponent, SendToDMComponent.class, "togglePlayer", "togglePlayer(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((SendToDMComponent) this.receiver).E3(bool.booleanValue());
        return Unit.LIZ;
    }
}
