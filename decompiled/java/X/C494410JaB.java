package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingDialogNew;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494410JaB extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubOnlyLivePreviewSettingDialogNew LL;
    public final /* synthetic */ Room LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494410JaB(SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew, Room room) {
        super(1);
        this.LL = subOnlyLivePreviewSettingDialogNew;
        this.LLILLJJLI = room;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew = this.LL;
        assembler.DQ2(subOnlyLivePreviewSettingDialogNew, new C494420JaC(subOnlyLivePreviewSettingDialogNew, this.LLILLJJLI));
        return Unit.LIZ;
    }
}
