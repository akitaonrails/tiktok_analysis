package X;

import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.api.component.translation.CommerceTranslationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0c9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000950c9d<ASSEM extends ReusedAssem<? extends C03H5> & InterfaceC712990Rxx<VideoItemParams>> implements C0S7A {

    /* JADX INFO: Incorrect field signature: TASSEM; */
    public final ReusedAssem LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, (C1000950c9d<ReusedAssem<? extends C03H5>>) 724));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, (C1000950c9d<ReusedAssem<? extends C03H5>>) 723));

    public C1000950c9d(CommerceTranslationAssem commerceTranslationAssem) {
        this.LIZ = commerceTranslationAssem;
    }

    @Override // X.C0S7A
    public final void LJJLJ(IAdTranslationData iAdTranslationData) {
        C997610c4F c997610c4FLIZJ = C997720c4Q.LIZJ(iAdTranslationData);
        if (c997610c4FLIZJ == null) {
            return;
        }
        LIZ(new AwS417S0200000_16((C1000950c9d) this, c997610c4FLIZJ, (C997610c4F) 57), new AwS417S0200000_16((C1000950c9d) this, c997610c4FLIZJ, (C997610c4F) 58));
    }

    @Override // X.C0S7A
    public final void LJZ(IAdTranslatableData iAdTranslatableData) {
        C997700c4O c997700c4OLIZ = C997750c4T.LIZ(iAdTranslatableData);
        if (c997700c4OLIZ == null) {
            return;
        }
        LIZ(new AwS417S0200000_16((C1000950c9d) this, c997700c4OLIZ, (C997700c4O) 55), new AwS417S0200000_16((C1000950c9d) this, c997700c4OLIZ, (C997700c4O) 56));
    }

    public final void LIZ(Function0<Unit> function0, Function0<Unit> function02) {
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LIZ)).getAweme();
        if (C1017070cZd.LLLILZ(aweme)) {
            function0.invoke();
        } else {
            if (!C1017070cZd.LJLIIL(aweme)) {
                return;
            }
            function02.invoke();
        }
    }
}
