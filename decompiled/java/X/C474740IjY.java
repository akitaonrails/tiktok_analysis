package X;

import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474740IjY extends C09AY implements Function0<C1101510elp<String>> {
    public C474740IjY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1101510elp<String> invoke() {
        return new C1101510elp<>(Integer.valueOf(LiveSlardarTagSetting.INSTANCE.getCurrentValue().messageCount), new CopyOnWriteArrayList());
    }
}
