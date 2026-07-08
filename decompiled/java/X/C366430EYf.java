package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366430EYf implements InterfaceC365900EWe {
    public final C554970Lpf LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1298));
    public final int LIZJ = 4;
    public final int LIZLLL = LSPassThroughRecordSizeConfig.DEFAULT;

    @Override // X.InterfaceC365900EWe
    public final int LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC365900EWe
    public final C554970Lpf getParams() {
        return this.LIZ;
    }

    @Override // X.InterfaceC365900EWe
    public final int getPriority() {
        return this.LIZLLL;
    }

    public C366430EYf(C554970Lpf c554970Lpf) {
        this.LIZ = c554970Lpf;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZJ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // X.InterfaceC365900EWe
    public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        AwemeDraft awemeDraft = this.LIZ.LJ;
        if (awemeDraft.LJIIIIZZ()) {
            return false;
        }
        String str = awemeDraft.LJIIJJI;
        if (str != null && str.length() != 0) {
            CreativeModel creativeModel = awemeDraft.LIZ;
            if (!creativeModel.ugcTemplateData.isPUgcTemplateFromAnchor && !creativeModel.pugcTemplateData.isFromCreateTemplate && awemeDraft.LJJJJIZL.cutSameData == null && !((Boolean) this.LIZIZ.getValue()).booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC365900EWe
    public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC365900EWe
    public final Object LJFF(InterfaceC1364105Vn<? super List<DraftFileRestoreResult>> interfaceC1364105Vn) {
        InterfaceC1635410sex interfaceC1635410sexLIZ;
        C19FO c19fo;
        if (((Boolean) this.LIZIZ.getValue()).booleanValue()) {
            interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            Context context = this.LIZ.LIZ.get();
            if ((context instanceof C19EG) && (c19fo = (C19FO) context) != null) {
                interfaceC1635410sexLIZ.kg(c19fo);
            }
        } else {
            interfaceC1635410sexLIZ = null;
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C554960Lpe(this, interfaceC1635410sexLIZ, null));
    }

    @Override // X.InterfaceC365900EWe
    public final DraftFileRestoreResult LJI(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
        return C365890EWd.LIZ(this, num, z, draftFileRestoreException);
    }
}
