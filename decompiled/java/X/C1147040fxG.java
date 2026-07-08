package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147040fxG extends C09AY implements Function1<Gift, Boolean> {
    public C1147040fxG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Gift gift) {
        boolean z;
        Gift.MusicGiftInfo musicGiftInfo;
        Gift gift2 = gift;
        if (gift2.id > 0 && (musicGiftInfo = gift2.musicInfo) != null && musicGiftInfo.resource != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
