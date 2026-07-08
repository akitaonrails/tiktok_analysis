package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F33, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F33 implements InterfaceC358390E3h {
    public final C01GW<Float> LIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 757));
    public final /* synthetic */ C0F30 LIZIZ;

    @Override // X.InterfaceC358390E3h
    public final float LIZ() {
        return C0F39.LIZIZ / (this.LIZIZ.LLILZ * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.InterfaceC358390E3h
    public final int LIZJ() {
        return (int) (r1.LLIZ / (this.LIZIZ.LLILZ * LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC358390E3h
    public final int LIZLLL() {
        return (int) this.LIZ.getValue().floatValue();
    }

    @Override // X.InterfaceC358390E3h
    public final int LIZIZ() {
        return LIZJ() + ((int) this.LIZ.getValue().floatValue());
    }

    public C0F33(C0F30 c0f30) {
        this.LIZIZ = c0f30;
    }
}
