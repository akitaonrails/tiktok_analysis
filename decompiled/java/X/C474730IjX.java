package X;

import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474730IjX extends C09AY implements Function0<C1101510elp<String>> {
    public C474730IjX() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1101510elp<String> invoke() {
        return new C1101510elp<>(Integer.valueOf(LiveSlardarTagSetting.INSTANCE.getCurrentValue().logCount), new CopyOnWriteArrayList());
    }
}
