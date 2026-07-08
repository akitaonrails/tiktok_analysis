package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ClaCombineSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Bd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209081Bd4 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PushSettings LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209081Bd4(PushSettings pushSettings) {
        super(1);
        this.LL = pushSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Integer num;
        boolean zBooleanValue = bool.booleanValue();
        C2209111Bd7 c2209111Bd7 = EnumC2209071Bd3.Companion;
        ClaCombineSettings claCombineSettings = this.LL.claCombineSettings;
        int iIntValue = 0;
        if (claCombineSettings != null && (num = claCombineSettings.enableStickerTranslation) != null) {
            iIntValue = num.intValue();
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        c2209111Bd7.getClass();
        C2209111Bd7.LIZ(numValueOf);
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJII.setValue(Boolean.valueOf(zBooleanValue));
        C2209051Bd1.LIZIZ.storeBoolean("key_is_sticker_translation_toggle_on", zBooleanValue);
        return Unit.LIZ;
    }
}
