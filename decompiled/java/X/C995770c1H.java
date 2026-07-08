package X;

import com.bytedance.android.livesdk.model.SMBBoardColorPreset;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0c1H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995770c1H extends C09AY implements Function1<C995750c1F, C995750c1F> {
    public final /* synthetic */ SMBBoardColorPreset LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C995770c1H(SMBBoardColorPreset sMBBoardColorPreset) {
        super(1);
        this.LL = sMBBoardColorPreset;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C995750c1F invoke(C995750c1F c995750c1F) {
        return new C995750c1F(new C291001Au(this.LL), c995750c1F.LLILLJJLI);
    }
}
