package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491510JPh extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ BasePreviewSettingMainFragmentSheetInitializer LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491510JPh(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer, boolean z, long j) {
        super(1);
        this.LL = basePreviewSettingMainFragmentSheetInitializer;
        this.LLILLJJLI = z;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.LLILZIL = true;
            if (this.LLILLJJLI) {
                C0KPJ.Qe.LJFF(Long.valueOf(this.LLILLL));
            }
        }
        return Unit.LIZ;
    }
}
